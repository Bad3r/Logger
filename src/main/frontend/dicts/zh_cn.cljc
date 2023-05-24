(ns frontend.dicts.zh-cn
  "Provides translation to zh-CN"
  #?(:cljs (:require [shadow.resource :as rc])))

(def ^:large-vars/data-var dicts
  {:accessibility/skip-to-main-content "跳转到主内容"
   :on-boarding/demo-graph "这是一份图谱的示例，在上面做的修改不会被保存，除非打开本地文件夹"
   :on-boarding/add-graph "添加图谱"
   :on-boarding/open-local-dir "打开本地文件夹"
   :on-boarding/new-graph-desc-1 "Logseq 同时支持 Markdown 和 Org-mode，你可以在设备上打开现有目录或创建新目录，目录也简称为文件夹。你的数据将仅存储在此设备上"
   :on-boarding/new-graph-desc-2 "文件夹打开后，里面将会创建 3 个目录："
   :on-boarding/new-graph-desc-3 "/journals - 保存你的日记"
   :on-boarding/new-graph-desc-4 "/pages - 保存其他页面"
   :on-boarding/new-graph-desc-5 "/logseq - 保存配置、custom.css 和一些元数据"
   :help/start "入门"
   :help/roadmap "路线图"
   :help/about "关于 Logseq"
   :help/bug "Bug 反馈"
   :help/feature "功能建议"
   :help/changelog "更新日志"
   :help/blog "Logseq 博客"
   :help/docs "文档"
   :help/privacy "隐私声明"
   :help/terms "服务条款"
   :help/shortcuts "快捷键"
   :help/shortcuts-triggers "触发"
   :help/shortcut "快捷键"
   :help/shortcut-page-title "完整快捷键"
   :help/slash-autocomplete "Slash 自动提示"
   :help/block-content-autocomplete "块内容 (Src, Quote, Query 等) 自动完成"
   :help/reference-autocomplete "页面引用自动补全"
   :help/block-reference "块引用"
   :help/open-link-in-sidebar "在侧边栏打开"
   :text/image "图片"
   :asset/confirm-delete "确定要删除{1}吗？"
   :asset/physical-delete "同时删除本地文件（目前不可撤销）"
   :more "更多"
   :search/result-for "更多搜索结果 "
   :search/items "条目"
   :search/page-names "搜索页面名称"
   :search-item/block "块"
   :search-item/file "文件"
   :search-item/page "页面"
   :search-item/whiteboard "白板"
   :help/context-menu "右键菜单"
   :help/markdown-syntax "Markdown 语法"
   :help/org-mode-syntax "Org Mode 语法"
   :bold "粗体"
   :italics "斜体"
   :highlight "高亮"
   :strikethrough "删除线"
   :code "代码"
   :untitled "未命名"
   :discourse-title "我们的论坛"
   :export-edn "导出为 EDN"
   :export-public-pages "导出公开页"
   :content/copy-block-emebed "复制内嵌块"
   :help/awesome-logseq "绝妙的 Logseq"
   :help/forum-community "论坛讨论"
   :linked-references/filter-search "在链接的页面内搜索"
   :page/copy-page-url "复制页面 URL"
   :plugin/contribute "✨编写和提交新插件"
   :right-side-bar/show-journals "显示日记"
   :select/default-prompt "请选择"
   :select.graph/add-graph "再添加一份图谱"
   :select.graph/empty-placeholder-description "没有匹配的图谱。你想再添加一份图谱吗？"
   :select.graph/prompt "请选择一份图谱"
   :settings-page/edit-export-css "修改导出样式 export.css"
   :settings-page/enable-flashcards "记忆卡片"
   :settings-page/enable-shortcut-tooltip "启用快捷键提示"
   :settings-page/export-theme "导出主题"
   :tutorial/dummy-notes #?(:cljs (rc/inline "dummy-notes-en.md")
                            :default "dummy-notes-en.md")
   :tutorial/text #?(:cljs (rc/inline "tutorial-en.md")
                     :default "tutorial-en.md")
   :right-side-bar/help "帮助"
   :right-side-bar/switch-theme "主题模式"
   :right-side-bar/contents "目录"
   :right-side-bar/page-graph "页面图谱"
   :right-side-bar/block-ref "块引用"
   :right-side-bar/graph-view "图谱视角"
   :right-side-bar/all-pages "全部页面"
   :right-side-bar/flashcards "记忆卡片"
   :right-side-bar/new-page "新页面"
   :right-side-bar/separator "调整右侧边栏大小"
   :right-side-bar/whiteboards "白板"
   :left-side-bar/journals "日志"
   :left-side-bar/new-page "新页面"
   :left-side-bar/nav-favorites "收藏页面"
   :left-side-bar/nav-recent-pages "最近使用"
   :left-side-bar/new-whiteboard "新建白板"
   :left-side-bar/create "新建"
   :page/presentation-mode "打开幻灯片"
   :page/delete-confirmation "您确定要删除此页面和文件吗？"
   :page/open-in-finder "打开文件对应目录"
   :page/open-with-default-app "用默认应用打开文件"
   :page/make-public "导出 HTML 时发布本页面"
   :page/version-history "查看页面历史记录"
   :page/open-backup-directory "打开页面备份文件夹"
   :page/make-private "导出 HTML 时取消发布本页面"
   :page/delete "删除本页"
   :page/add-to-favorites "添加收藏"
   :page/unfavorite "取消收藏"
   :page/show-journals "显示日志"
   :page/show-whiteboards "显示白板"
   :block/name "页面名称"
   :page/earlier "之前"
   :file/name "文件名"
   :file/last-modified-at "最后更改于"
   :file/no-data "没有数据"
   :file/validate-existing-file-error "页面已存在另一个文件: {1}, 当前文件: {2}. 请保留其中一个文件，然后重建当前图谱的索引。"
   :file-rn/re-index "重命名文件后，如果其他设备同步了改文件，强烈建议在同步成功后重新建立索引。"
   :file-rn/need-action "建议执行文件重命名操作以匹配新格式。当重命名的文件被同步后，请在所有设备上重新建立索引。"
   :file-rn/or-select-actions " 或在下面单独重命名这些文件，然后 "
   :file-rn/or-select-actions-2 "。关闭面板后，这些功能将不可用。"
   :file-rn/legend "🟢 可选的重命名操作； 🟡 需要重命名以避免标题的改变； 🔴 重大改变。"
   :file-rn/close-panel "关闭面板"
   :file-rn/all-action "应用所有操作！"
   :file-rn/select-format "(开发者模式选项，危险！) 选择文件名格式"
   :file-rn/rename "重命名文件 \"{1}\" 到 \"{2}\""
   :file-rn/apply-rename "应用文件重命名操作"
   :file-rn/suggest-rename "需要的操作： "
   :file-rn/otherwise-breaking "否则标题会变为"
   :file-rn/no-action "好了！无需更多操作"
   :file-rn/confirm-proceed "更新格式！"
   :file-rn/select-confirm-proceed "开发者：写入格式"
   :file-rn/unreachable-title "警告！在当前文件名格式下，除非手动设置 `title::` 属性，否则，页面名将变为{1}。"
   :file-rn/optional-rename "建议："
   :file-rn/format-deprecated "你现在正使用着过时的格式。非常建议更新到最新的格式。在进行该操作之前，请先备份好你的数据，并关闭所有的 Logseq 客户端。"
   :file-rn/filename-desc-1 "该设置配置了如何将一个页面存储到一个文件。Logseq 存储页面到与页面同名的文件。"
   :file-rn/filename-desc-2 "对于文件名来说，像 \"/\" 或 \"?\" 这样的字符是非法的。"
   :file-rn/filename-desc-3 "Logseq 会将非法字符替换为与该字符等效的 URL 编码，以保证字符的合法 (例如， \"?\" 被替换为 \"%3F\")。"
   :file-rn/filename-desc-4 "为了美观，命名空间分隔符 \"/\" 也会被替换为 \"___\" (三重下划线)。"
   :file-rn/instruct-1 "只需两步即可更新文件名格式"
   :file-rn/instruct-2 "1. 点击 "
   :file-rn/instruct-3 "2. 请按照以下说明将文件重命名为新格式："
   :page/created-at "创建日期"
   :page/updated-at "更新日期"
   :page/backlinks "双向链接"
   :file/format-not-supported "格式 .{1} 目前不支持。"
   :editor/block-search "搜索块"
   :editor/copy "复制"
   :editor/cut "剪切"
   :content/copy-block-ref "复制块引用"
   :content/open-in-sidebar "在侧边栏打开"
   :content/click-to-edit "点击以编辑"
   :settings-page/edit-config-edn "编辑 config.edn （当前库）"
   :settings-page/edit-custom-css "编辑 custom.css （当前库）"
   :settings-page/custom-configuration "自定义配置"
   :settings-page/custom-theme "自定义主题"
   :settings-page/git-confirm "更新 Git 设置后，需要重启应用"
   :settings-page/git-switcher-label "开启 Git 自动 commit"
   :settings-page/git-commit-delay "Git 自动 commit 间隔秒数"
   :settings-page/preferred-outdenting "逻辑缩进"
   :settings-page/show-brackets "显示括号 [[]]"
   :settings-page/spell-checker "单词拼写检查"
   :settings-page/auto-updater "自动更新"
   :settings-page/disable-sentry "向 Logseq 提供使用情况和诊断信息"
   :settings-page/disable-sentry-desc "Logseq 从来不会收集或出售你的图谱数据。"
   :settings-page/custom-date-format "首选日期页面格式"
   :settings-page/preferred-file-format "首选文件格式"
   :settings-page/preferred-workflow "首选工作流"
   :settings-page/preferred-pasting-file "保存链接为文件"
   :settings-page/auto-expand-block-refs "自动展开聚焦 block 的引用"
   :settings-page/enable-timetracking "开启 timetracking"
   :settings-page/enable-tooltip "开启提示框"
   :settings-page/enable-journals "开启日记"
   :settings-page/enable-all-pages-public "发布所有页面"
   :settings-page/enable-whiteboards "激活白板功能"
   :settings-page/customize-shortcuts "自定义快捷键"
   :settings-page/shortcut-settings "快捷键设置"
   :settings-page/home-default-page "设置首页默认页面"
   :settings-page/enable-block-time "记录 block 创建/修改时间"
   :settings-page/clear-cache "清除缓存"
   :settings-page/clear "清除"
   :settings-page/clear-cache-warning "清除缓存将关闭当前打开的图谱。你将丢失未保存的更改。"
   :settings-page/developer-mode "开发者模式"
   :settings-page/developer-mode-desc "开发者模式帮助贡献者和扩展开发者更有效地测试他们与 Logseq 的集成。"
   :settings-page/current-version "当前版本"
   :settings-page/tab-general "常规"
   :settings-page/tab-editor "编辑器"
   :settings-page/tab-assets "附件设置"
   :settings-page/tab-advanced "高级设置"
   :settings-page/tab-features "更多功能"
   :settings-page/tab-version-control "多版本控制"
   :settings-page/plugin-system "插件系统"
   :settings-page/network-proxy "网络代理"
   :settings-page/filename-format "文件名格式"
   :settings-page/edit-setting "编辑"
   :settings-page/login-prompt "你必须是 Logseq 的 Open Collective Sponsor 或者 Backer 才能提前使用新功能（仍在测试中），因此需要登录。"
   :settings-page/alpha-features "Alpha 功能"
   :settings-page/custom-global-configuration "自定义全局配置"
   :settings-page/edit-global-config-edn "编辑全局 config.edn"
   :settings-page/sync "同步"
   :yes "是"
   :submit "提交"
   :cancel "取消"
   :new-graph "添加图谱"
   :re-index "重新建立索引"
   :re-index-detail "重新建立索引"
   :re-index-multiple-windows-warning "在重建当前图谱索引前，你需要先关闭其它窗口"
   :re-index-discard-unsaved-changes-warning "重建索引将丢弃当前图谱，之后重新导入保存在磁盘上的所有文件。此操作将丢弃未保存的更改，同时可能需要一段时间。是否继续？"
   :open-new-window "打开新窗口"
   :sync-from-local-files "刷新（读取本地最新文件）"
   :sync-from-local-files-detail "读取本地最新文件"
   :sync-from-local-changes-detected "执行刷新操作将会导入磁盘上修改过的、或是与实际Logseq页面内容不同的文件。是否继续？"
   :export-graph "导出图谱"
   :export-page "导出当前页面"
   :export-json "以 JSON 格式导出"
   :export-roam-json "以 Roam JSON 格式导出"
   :export-markdown "以 Markdown 格式导出"
   :export-opml "以 OPML 格式导出"
   :search/publishing "搜索"
   :search "搜索或者创建新页面"
   :page-search "在当前页面搜索"
   :graph-search "搜索图谱"
   :new-page "新页面"
   :graph "图谱"
   :graph/persist "打开新窗口前，Logseq正在同步内部状态，请等待片刻。"
   :graph/persist-error "内部状态同步失败。无法打开新窗口。"
   :graph/save "保存中……"
   :graph/save-success "保存成功"
   :graph/save-error "保存失败"
   :graph/all-graphs "所有图谱"
   :graph/local-graphs "本地图谱"
   :graph/remote-graphs "同步图谱"
   :all-journals "日记"
   :export "导出"
   :all-graphs "所有图谱"
   :all-pages "所有页面"
   :all-files "所有文件"
   :remove-orphaned-pages "删除空页面"
   :settings "设置"
   :settings-of-plugins "插件设置"
   :plugins "插件"
   :themes "主题"
   :relaunch-confirm-to-work "如果希望立刻生效, 请重启应用。是否现在重启？"
   :import "导入"
   :importing "导入中"
   :join-community "加入社区"
   :help-shortcut-title "点此查看快捷方式和更多有用帮助"
   :loading "加载中"
   :close "关闭"
   :delete "删除"
   :save "保存"
   :type "类型"
   :host "主机"
   :port "端口"
   :parsing-files "正在解析文件"
   :loading-files "正在加载文件"
   :login "登录"
   :logout "登出"
   :download "下载"
   :language "语言"
   :remove-background "去除背景"
   :remove-heading "移除 heading"
   :heading "Heading {1}"
   :auto-heading "自动转为 heading"
   :open-a-directory "打开本地文件夹"
   :new-whiteboard "新建白板"
   :all-whiteboards "所有白板"

   :plugin/installed "已安装"
   :plugin/not-installed "未安装"
   :plugin/installing "安装中"
   :plugin/install "安装"
   :plugin/reload "重载"
   :plugin/update "更新"
   :plugin/check-update "检查更新"
   :plugin/check-all-updates "一键检查更新"
   :plugin/found-updates "有更新"
   :plugin/found-n-updates "发现 {1} 个插件待更新"
   :plugin/update-all-selected "更新已选插件"
   :plugin/updates-downloading "正在下载更新"
   :plugin/refresh-lists "刷新插件列表"
   :plugin/delete-alert "确定删除插件 [{1}]？"
   :plugin/enabled "已开启"
   :plugin/disabled "未开启"
   :plugin/update-available "待更新"
   :plugin/updating "更新中"
   :plugin/uninstall "卸载"
   :plugin/marketplace "插件市场"
   :plugin/downloads "下载量"
   :plugin/stars "收藏数"
   :plugin/title "名称"
   :plugin/all "全部"
   :plugin/unpacked "未打包"
   :plugin/open-settings "打开配置项"
   :plugin/open-package "打开包目录"
   :plugin/load-unpacked "手动载入插件"
   :plugin/restart "重启应用"
   :plugin/unpacked-tips "用于开发目的或者从本地磁盘载入可信的社区插件。"
   :plugin/up-to-date "已经是最新了"
   :plugin/custom-js-alert "发现 custom.js 自定义脚本，是否允许执行？（如果您对该文件的内容不了解 或 来源不可靠，建议不要允许执行）"

   :pdf/copy-ref "复制引用"
   :pdf/copy-text "复制文本"
   :pdf/linked-ref "转到注解"
   :pdf/toggle-dashed "区域选取为虚线"
   :pdf/hl-block-colored "颜色标识高亮块"
   :pdf/doc-metadata "查看文档元数据"

   :asset/open-in-browser "在浏览器打开"
   :asset/show-in-folder "在文件夹中显示图片"
   :asset/copy "复制图片"
   :asset/delete "删除图片"
   :asset/maximize "最大化显示图片"

   :color/blue "蓝色"
   :color/gray "灰色"
   :color/green "绿色"
   :color/pink "粉色"
   :color/purple "紫色"
   :color/red "红色"
   :color/yellow "黄色"

   :whiteboard/link-whiteboard-or-block "链接白板/页面/块"

   :updater/new-version-install "新版本已经准备就绪，重启应用即可更新。"
   :updater/quit-and-install "现在安装"

   :paginates/pages "共计 {1} 页面"
   :paginates/prev "上一页"
   :paginates/next "下一页"

   :tips/all-done "处理完成"

   :command-palette/prompt "输入指令"

   :file-sync/other-user-graph "当前本地图谱绑定在其他用户的远程图谱上。因此无法启动同步。"
   :file-sync/graph-deleted "当前远程图谱已经删除"
   :file-sync/rsapi-cannot-upload-err "无法同步，请检查本机时间是否准确"

   :notification/clear-all "清除全部通知"

   :shortcut.category/formatting            "格式化"
   :shortcut.category/basics                "基础操作"
   :shortcut.category/navigating            "移动"
   :shortcut.category/block-editing         "块编辑基本"
   :shortcut.category/block-command-editing "块编辑文本操作"
   :shortcut.category/block-selection       "块选择操作"
   :shortcut.category/toggle                "切换"
   :shortcut.category/others                "其他"
   :command.auto-complete/complete          "自动完成：选择当前项"
   :command.auto-complete/next              "自动完成：选择下一项"
   :command.auto-complete/open-link         "自动完成：在浏览器中打开当前项"
   :command.auto-complete/prev              "自动完成：选择上一项"
   :command.auto-complete/shift-complete    "自动完成：在侧边栏打开"
   :command.cards/forgotten                 "卡片：忘记了"
   :command.cards/next-card                 "卡片：下一个"
   :command.cards/recall                    "卡片：需要一会儿才能记起"
   :command.cards/remembered                "卡片：记得"
   :command.cards/toggle-answers            "卡片：显示/隐藏 答案/填空"
   :command.command/run                     "运行 git 命令"
   :command.command/toggle-favorite         "切换收藏"
   :command.command-palette/toggle          "切换命令面板"
   :command.date-picker/complete            "日期选择：选择当前天"
   :command.date-picker/next-day            "日期选择：下一天"
   :command.date-picker/next-week           "日期选择：下一周"
   :command.date-picker/prev-day            "日期选择：上一天"
   :command.date-picker/prev-week           "日期选择：上一周"
   :command.editor/copy-current-file        "复制当前文件"
   :command.editor/copy-embed               "复制指向当前块的嵌入块"
   :command.editor/copy-text                "复制选中的文本"
   :command.editor/escape-editing           "转义编辑"
   :command.editor/insert-youtube-timestamp "插入 Youtube 时间戳"
   :command.editor/new-whiteboard           "新建白板"
   :command.editor/open-file-in-default-app "在默认应用中打开文件"
   :command.editor/open-file-in-directory   "在目录中打开文件"
   :command.editor/paste-text-in-one-block-at-point  "粘贴文本到块的点"
   :command.editor/replace-block-reference-at-point  "用内容替换块引用"
   :command.editor/select-down              "选择下面内容"
   :command.editor/select-up                "选择上面的内容"
   :command.editor/strike-through           "删除线"
   :command.go/all-graphs                   "所有图谱"
   :command.go/all-pages                    "全部页面"
   :command.go/electron-jump-to-the-next    "跳转到查找栏搜索的下一个匹配项"
   :command.go/electron-jump-to-the-previous "跳转到查找栏搜索的上一个匹配项"
   :command.go/flashcards                   "记忆卡片"
   :command.go/graph-view                   "记忆图谱"
   :command.go/home                         "首页"
   :command.go/keyboard-shortcuts           "快捷键"
   :command.go/next-journal                 "下一篇日记"
   :command.go/prev-journal                 "上一篇日记"
   :command.go/tomorrow                     "明天"
   :command.go/whiteboards                  "前往白板"
   :command.graph/add                       "添加图谱"
   :command.graph/export-as-html            "将公共图谱导出为 html"
   :command.graph/open                      "打开图谱"
   :command.graph/re-index                  "重建索引"
   :command.graph/remove                    "移除图谱"
   :command.graph/save                      "保存"
   :command.misc/copy                       "Ctrl/Command + c"
   :command.sidebar/clear                   "清除侧边栏"
   :command.sidebar/open-today-page         "在侧边栏打开今日"
   :command.ui/goto-plugins                 "插件"
   :command.ui/select-theme-color           "选择皮肤颜色"
   :command.ui/toggle-cards                 "切换卡片"
   :command.ui/toggle-left-sidebar          "切换左侧边栏"
   :command.editor/indent                   "缩进块标签"
   :command.editor/outdent                  "取消缩进块"
   :command.editor/move-block-up            "向上移动块"
   :command.editor/move-block-down          "向下移动块"
   :command.editor/new-block                "创建块"
   :command.editor/new-line                 "块中新建行"
   :command.editor/zoom-in                  "聚焦"
   :command.editor/zoom-out                 "退出聚焦"
   :command.editor/follow-link              "跟随光标下的链接"
   :command.editor/open-link-in-sidebar     "在侧边栏打开"
   :command.editor/expand-block-children    "展开"
   :command.editor/collapse-block-children  "折叠"
   :command.editor/select-block-up          "选择上方的块"
   :command.editor/select-block-down        "选择下方的块"
   :command.editor/select-all-blocks        "选择所有块"
   :command.pdf/find                        "Pdf: 查找当前 pdf 文档的文本"
   :command.pdf/previous-page               "上一页PDF文档"
   :command.pdf/next-page                   "下一页PDF文档"
   :command.pdf/close                       "关闭当前PDF文档"
   :command.ui/toggle-help                  "显示/关闭帮助"
   :command.git/commit                      "提交消息"
   :command.go/search                       "搜索页面和块"
   :command.go/backward                     "回退"
   :command.go/forward                      "前进"
   :command.go/search-in-page               "在当前页面搜索块"
   :command.go/electron-find-in-page        "在当前页面查找文本"
   :command.ui/toggle-document-mode         "切换文档模式"
   :command.ui/toggle-contents              "打开/关闭目录"
   :command.ui/toggle-theme                 "在暗色/亮色主题之间切换"
   :command.ui/toggle-right-sidebar         "启用/关闭右侧栏"
   :command.ui/toggle-settings              "显示/关闭设置"
   :command.go/journals                     "跳转到日记"
   :command.ui/toggle-wide-mode             "切换宽屏模式"
   :command.ui/toggle-brackets              "切换是否显示括号"
   :command.search/re-index                 "重新建立搜索索引"
   :command.editor/bold                     "粗体"
   :command.editor/italics                  "斜体"
   :command.editor/insert-link              "Html 链接"
   :command.editor/highlight                "高亮"
   :command.editor/undo                     "撤销"
   :command.editor/redo                     "重做"
   :command.editor/copy                     "复制"
   :command.editor/cut                      "剪切"
   :command.editor/up                       "向上移动光标 / 向上选择"
   :command.editor/down                     "向下移动光标 / 向下选择"
   :command.editor/left                     "向左移动光标 / 向左选择"
   :command.editor/right                    "向右移动光标 / 向右选择"
   :command.editor/backspace                "向左删除"
   :command.editor/delete                   "向右删除"
   :command.editor/cycle-todo               "切换TODO状态"
   :command.editor/clear-block              "清除块内容"
   :command.editor/kill-line-before         "删除光标右侧行"
   :command.editor/kill-line-after          "删除光标左侧行"
   :command.editor/beginning-of-block       "移动光标到块开始位置"
   :command.editor/end-of-block             "移动光标到块末尾"
   :command.editor/forward-word             "光标向后移动一个单词"
   :command.editor/backward-word            "光标向前移动一个单词"
   :command.editor/forward-kill-word        "向后删除一个单词"
   :command.editor/backward-kill-word       "向前删除一个单词"
   :command.editor/open-edit                "编辑选中块"
   :command.editor/delete-selection         "删除选中块"
   :command.editor/toggle-open-blocks       "切换折叠/展开所有块（非编辑状态）"})