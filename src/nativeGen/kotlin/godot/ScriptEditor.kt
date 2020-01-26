// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScriptEditor internal constructor(
  _handle: COpaquePointer
) : PanelContainer(_handle) {
  fun addCallback() {
    TODO()
  }

  fun autosaveScripts() {
    TODO()
  }

  fun breaked() {
    TODO()
  }

  fun clearExecution() {
    TODO()
  }

  fun closeAllTabs() {
    TODO()
  }

  fun closeCurrentTab() {
    TODO()
  }

  fun closeDiscardCurrentTab() {
    TODO()
  }

  fun closeDocsTab() {
    TODO()
  }

  fun closeOtherTabs() {
    TODO()
  }

  fun copyScriptPath() {
    TODO()
  }

  fun editorPause() {
    TODO()
  }

  fun editorPlay() {
    TODO()
  }

  fun editorSettingsChanged() {
    TODO()
  }

  fun editorStop() {
    TODO()
  }

  fun fileDialogAction() {
    TODO()
  }

  fun getDebugTooltip(): String {
    TODO()
  }

  fun gotoScriptLine() {
    TODO()
  }

  fun gotoScriptLine2() {
    TODO()
  }

  fun helpClassGoto() {
    TODO()
  }

  fun helpClassOpen() {
    TODO()
  }

  fun helpOverviewSelected() {
    TODO()
  }

  fun helpSearch() {
    TODO()
  }

  fun historyBack() {
    TODO()
  }

  fun historyForward() {
    TODO()
  }

  fun liveAutoReloadRunningScripts() {
    TODO()
  }

  fun membersOverviewSelected() {
    TODO()
  }

  fun menuOption() {
    TODO()
  }

  fun onFindInFilesModifiedFiles() {
    TODO()
  }

  fun onFindInFilesRequested() {
    TODO()
  }

  fun onFindInFilesResultSelected() {
    TODO()
  }

  fun openRecentScript() {
    TODO()
  }

  fun reloadScripts() {
    TODO()
  }

  fun requestHelp() {
    TODO()
  }

  fun resSavedCallback() {
    TODO()
  }

  fun resaveScripts() {
    TODO()
  }

  fun saveHistory() {
    TODO()
  }

  fun scriptChanged() {
    TODO()
  }

  fun scriptCreated() {
    TODO()
  }

  fun scriptListGuiInput() {
    TODO()
  }

  fun scriptSelected() {
    TODO()
  }

  fun scriptSplitDragged() {
    TODO()
  }

  fun setExecution() {
    TODO()
  }

  fun showDebugger() {
    TODO()
  }

  fun startFindInFiles() {
    TODO()
  }

  fun tabChanged() {
    TODO()
  }

  fun themeOption() {
    TODO()
  }

  fun toggleMembersOverviewAlphaSort() {
    TODO()
  }

  fun treeChanged() {
    TODO()
  }

  fun unhandledInput() {
    TODO()
  }

  fun updateMembersOverview() {
    TODO()
  }

  fun updateRecentScripts() {
    TODO()
  }

  fun updateScriptConnections() {
    TODO()
  }

  fun updateScriptNames() {
    TODO()
  }

  fun canDropDataFw(): Boolean {
    TODO()
  }

  fun dropDataFw() {
    TODO()
  }

  fun getCurrentScript(): Script {
    TODO()
  }

  fun getDragDataFw(): Variant {
    TODO()
  }

  fun getOpenScripts(): VariantArray {
    TODO()
  }

  fun gotoLine() {
    TODO()
  }

  fun openScriptCreateDialog() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for ScriptEditor
     */
    private object __method_bind {
      val _add_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_add_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _add_callback" }
            }
          }

      val _autosave_scripts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_autosave_scripts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _autosave_scripts" }
            }
          }

      val _breaked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_breaked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _breaked" }
            }
          }

      val _clear_execution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_clear_execution".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _clear_execution" }
            }
          }

      val _close_all_tabs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_close_all_tabs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _close_all_tabs" }
            }
          }

      val _close_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_close_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _close_current_tab" }
            }
          }

      val _close_discard_current_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_close_discard_current_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _close_discard_current_tab" }
            }
          }

      val _close_docs_tab: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_close_docs_tab".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _close_docs_tab" }
            }
          }

      val _close_other_tabs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_close_other_tabs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _close_other_tabs" }
            }
          }

      val _copy_script_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_copy_script_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _copy_script_path" }
            }
          }

      val _editor_pause: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_editor_pause".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _editor_pause" }
            }
          }

      val _editor_play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_editor_play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _editor_play" }
            }
          }

      val _editor_settings_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_editor_settings_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _editor_settings_changed" }
            }
          }

      val _editor_stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_editor_stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _editor_stop" }
            }
          }

      val _file_dialog_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_file_dialog_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _file_dialog_action" }
            }
          }

      val _get_debug_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_get_debug_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_debug_tooltip" }
            }
          }

      val _goto_script_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_goto_script_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _goto_script_line" }
            }
          }

      val _goto_script_line2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_goto_script_line2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _goto_script_line2" }
            }
          }

      val _help_class_goto: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_help_class_goto".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _help_class_goto" }
            }
          }

      val _help_class_open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_help_class_open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _help_class_open" }
            }
          }

      val _help_overview_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_help_overview_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _help_overview_selected" }
            }
          }

      val _help_search: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_help_search".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _help_search" }
            }
          }

      val _history_back: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_history_back".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _history_back" }
            }
          }

      val _history_forward: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_history_forward".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _history_forward" }
            }
          }

      val _live_auto_reload_running_scripts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_live_auto_reload_running_scripts".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method _live_auto_reload_running_scripts" }
            }
          }

      val _members_overview_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_members_overview_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _members_overview_selected" }
            }
          }

      val _menu_option: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_menu_option".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _menu_option" }
            }
          }

      val _on_find_in_files_modified_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_on_find_in_files_modified_files".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method _on_find_in_files_modified_files" }
            }
          }

      val _on_find_in_files_requested: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_on_find_in_files_requested".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _on_find_in_files_requested" }
            }
          }

      val _on_find_in_files_result_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_on_find_in_files_result_selected".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method _on_find_in_files_result_selected" }
            }
          }

      val _open_recent_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_open_recent_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _open_recent_script" }
            }
          }

      val _reload_scripts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_reload_scripts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _reload_scripts" }
            }
          }

      val _request_help: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_request_help".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _request_help" }
            }
          }

      val _res_saved_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_res_saved_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _res_saved_callback" }
            }
          }

      val _resave_scripts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_resave_scripts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _resave_scripts" }
            }
          }

      val _save_history: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_save_history".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _save_history" }
            }
          }

      val _script_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_script_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _script_changed" }
            }
          }

      val _script_created: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_script_created".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _script_created" }
            }
          }

      val _script_list_gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_script_list_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _script_list_gui_input" }
            }
          }

      val _script_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_script_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _script_selected" }
            }
          }

      val _script_split_dragged: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_script_split_dragged".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _script_split_dragged" }
            }
          }

      val _set_execution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_set_execution".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_execution" }
            }
          }

      val _show_debugger: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_show_debugger".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _show_debugger" }
            }
          }

      val _start_find_in_files: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_start_find_in_files".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _start_find_in_files" }
            }
          }

      val _tab_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_tab_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _tab_changed" }
            }
          }

      val _theme_option: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_theme_option".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _theme_option" }
            }
          }

      val _toggle_members_overview_alpha_sort: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_toggle_members_overview_alpha_sort".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method _toggle_members_overview_alpha_sort" }
            }
          }

      val _tree_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_tree_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _tree_changed" }
            }
          }

      val _unhandled_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_unhandled_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _unhandled_input" }
            }
          }

      val _update_members_overview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_update_members_overview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_members_overview" }
            }
          }

      val _update_recent_scripts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_update_recent_scripts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_recent_scripts" }
            }
          }

      val _update_script_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_update_script_connections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_script_connections" }
            }
          }

      val _update_script_names: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "_update_script_names".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_script_names" }
            }
          }

      val can_drop_data_fw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "can_drop_data_fw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_drop_data_fw" }
            }
          }

      val drop_data_fw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "drop_data_fw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method drop_data_fw" }
            }
          }

      val get_current_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "get_current_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_script" }
            }
          }

      val get_drag_data_fw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "get_drag_data_fw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drag_data_fw" }
            }
          }

      val get_open_scripts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "get_open_scripts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_open_scripts" }
            }
          }

      val goto_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "goto_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method goto_line" }
            }
          }

      val open_script_create_dialog: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
              "open_script_create_dialog".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_script_create_dialog" }
            }
          }
    }
  }
}
