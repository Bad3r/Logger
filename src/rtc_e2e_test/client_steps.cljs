(ns client-steps
  (:require [cljs.test :as t :refer [is]]
            [const]
            [datascript.core :as d]
            [frontend.common.missionary-util :as c.m]
            [frontend.worker.rtc.client-op :as client-op]
            [frontend.worker.rtc.core :as rtc-core]
            [frontend.worker.rtc.log-and-state :as rtc-log-and-state]
            [helper]
            [logseq.db :as ldb]
            [logseq.outliner.batch-tx :as batch-tx]
            [missionary.core :as m]))

(def ^:private step0
  {:client1
   (m/sp
     (let [conn (helper/get-downloaded-test-conn)
           tx-data (const/tx-data-map :create-page)]
       (batch-tx/with-batch-tx-mode conn {:e2e-test const/downloaded-test-repo :skip-store-conn true}
         (d/transact! conn tx-data))
       (is (=
            #{[:update-page const/page1-uuid]
              [:update const/page1-uuid
               [[:block/title "[\"~#'\",\"basic-edits-test\"]" true]
                [:block/created-at "[\"~#'\",1724836490809]" true]
                [:block/updated-at "[\"~#'\",1724836490809]" true]
                [:block/type "[\"~#'\",\"page\"]" true]]]
              [:move const/block1-uuid]
              [:update const/block1-uuid
               [[:block/updated-at "[\"~#'\",1724836490810]" true]
                [:block/created-at "[\"~#'\",1724836490810]" true]
                [:block/title "[\"~#'\",\"block1\"]" true]]]}
            (set (map helper/simplify-client-op (client-op/get-all-ops const/downloaded-test-repo)))))))
   :client2 nil})

(def ^:private step1
  "client1: start rtc, wait page1, client1->remote
  client2: start rtc, wait page1, remote->client2"
  {:client1
   (m/sp
     (let [r (m/? (rtc-core/new-task--rtc-start const/downloaded-test-repo const/test-token))]
       (is (nil? r))
       (let [r (m/? (m/timeout
                     (m/reduce (fn [_ v]
                                 (when (and (= :rtc.log/push-local-update (:type v))
                                            (empty? (client-op/get-all-ops const/downloaded-test-repo)))
                                   (is (nil? (:ex-data v)))
                                   (reduced v)))
                               rtc-log-and-state/rtc-log-flow)
                     6000 :timeout))]
         (is (not= :timeout r)))))
   :client2
   (m/sp
    (let [r (m/? (rtc-core/new-task--rtc-start const/downloaded-test-repo const/test-token))]
      (is (nil? r)))
    (m/?
     (c.m/backoff
      (take 4 c.m/delays)
      (m/sp
       (let [conn (helper/get-downloaded-test-conn)
             page1 (d/pull @conn '[*] [:block/uuid const/page1-uuid])
             block1 (d/pull @conn '[*] [:block/uuid const/block1-uuid])]
         (when-not (:block/uuid page1)
           (throw (ex-info "wait page1 synced" {:missionary/retry true})))
         (is
          (= {:block/title "basic-edits-test"
              :block/name "basic-edits-test"
              :block/type "page"}
             (select-keys page1 [:block/title :block/name :block/type])))
         (is
          (= {:block/title "block1"
              :block/order "a0"
              :block/parent {:db/id (:db/id page1)}}
             (select-keys block1 [:block/title :block/order :block/parent]))))))))})

(def ^:private step2
  "client1: insert 500 blocks, wait for changes to sync to remote
  client2: wait for blocks to sync from remote"
  {:client1
   (m/sp
     (let [conn (helper/get-downloaded-test-conn)]
       (batch-tx/with-batch-tx-mode conn {:e2e-test const/downloaded-test-repo :skip-store-conn true}
         (d/transact! conn (const/tx-data-map :insert-500-blocks)))
       (let [r (m/? (m/timeout
                     (m/reduce (fn [_ v]
                                 (when (and (= :rtc.log/push-local-update (:type v))
                                            (empty? (client-op/get-all-ops const/downloaded-test-repo)))
                                   (is (nil? (:ex-data v)))
                                   (reduced v)))
                               rtc-log-and-state/rtc-log-flow)
                     10000 :timeout))]
         (is (not= :timeout r)))))
   :client2
   (c.m/backoff
    (take 4 c.m/delays)
    (m/sp
      (let [conn (helper/get-downloaded-test-conn)
            page (d/pull @conn '[*] [:block/uuid const/page2-uuid])]
        (when-not (:block/uuid page)
          (throw (ex-info "wait page to be synced" {:missionary/retry true})))
        (let [blocks (ldb/sort-by-order (ldb/get-page-blocks @conn (:db/id page)))]
          (is (= 500 (count blocks)))
          (is (= (map #(str "x" %) (range 500))
                 (map :block/title blocks)))))))})

(def ^:private step3
  "client1:
  1. add #task properties to block1 (`const/block1-uuid`)
  2. wait to be synced
  client2:
  1. wait the block&its properties to be synced"
  {:client1
   (m/sp
     (let [conn (helper/get-downloaded-test-conn)
           tx-data (const/tx-data-map :add-task-properties-to-block1)]
       (batch-tx/with-batch-tx-mode conn {:e2e-test const/downloaded-test-repo :skip-store-conn true}
         (d/transact! conn tx-data))
       (let [r (m/? (m/timeout
                     (m/reduce (fn [_ v]
                                 (when (and (= :rtc.log/push-local-update (:type v))
                                            (empty? (client-op/get-all-ops const/downloaded-test-repo)))
                                   (is (nil? (:ex-data v)))
                                   (reduced v)))
                               rtc-log-and-state/rtc-log-flow)
                     10000 :timeout))]
         (is (not= :timeout r)))))
   :client2
   (m/sp
     (let [conn (helper/get-downloaded-test-conn)
           block1 (d/pull @conn
                          [{:block/tags [:db/ident]}
                           {:logseq.task/status [:db/ident]}
                           {:logseq.task/deadline [:block/journal-day]}]
                          [:block/uuid const/block1-uuid])]
       (when-not (:logseq.task/status block1)
         (throw (ex-info "wait block1's task properties to be synced" {:missionary/retry true})))
       (is (= {:block/tags [{:db/ident :logseq.class/Task}],
               :logseq.task/status {:db/ident :logseq.task/status.done}
               :logseq.task/deadline {:block/journal-day 20240907}}
              block1))))})

(defn- wrap-print-step-info
  [steps client]
  (map-indexed
   (fn [idx step]
     (m/sp
      (println (str "[" client "]") "start step" idx)
      (some-> (get step client) m/?)
      (println (str "[" client "]") "end step" idx)))
   steps))

(def ^:private all-steps [step0 step1 step2 step3])

(def client1-steps
  (wrap-print-step-info all-steps :client1))

(def client2-steps
  (wrap-print-step-info all-steps :client2))
