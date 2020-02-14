// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class ScriptEditor(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PanelContainer(null) {
  /**
   * ScriptEditor::editor_script_changed signal
   */
  val signalEditorScriptChanged: Signal1<Script> = Signal1("editor_script_changed")

  /**
   * ScriptEditor::script_close signal
   */
  val signalScriptClose: Signal1<Script> = Signal1("script_close")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _add_callback(
    arg0: Object,
    arg1: String,
    arg2: PoolStringArray
  ) {
    TODO()
  }

  open fun _autosave_scripts() {
    TODO()
  }

  open fun _breaked(arg0: Boolean, arg1: Boolean) {
    TODO()
  }

  open fun _clear_execution(arg0: Reference) {
    TODO()
  }

  open fun _close_all_tabs() {
    TODO()
  }

  open fun _close_current_tab() {
    TODO()
  }

  open fun _close_discard_current_tab(arg0: String) {
    TODO()
  }

  open fun _close_docs_tab() {
    TODO()
  }

  open fun _close_other_tabs() {
    TODO()
  }

  open fun _copy_script_path() {
    TODO()
  }

  open fun _editor_pause() {
    TODO()
  }

  open fun _editor_play() {
    TODO()
  }

  open fun _editor_settings_changed() {
    TODO()
  }

  open fun _editor_stop() {
    TODO()
  }

  open fun _file_dialog_action(arg0: String) {
    TODO()
  }

  open fun _filter_methods_text_changed(arg0: String) {
    TODO()
  }

  open fun _filter_scripts_text_changed(arg0: String) {
    TODO()
  }

  open fun _get_debug_tooltip(arg0: String, arg1: Node): String {
    TODO()
  }

  open fun _goto_script_line(arg0: Reference, arg1: Int) {
    TODO()
  }

  open fun _goto_script_line2(arg0: Int) {
    TODO()
  }

  open fun _help_class_goto(arg0: String) {
    TODO()
  }

  open fun _help_class_open(arg0: String) {
    TODO()
  }

  open fun _help_overview_selected(arg0: Int) {
    TODO()
  }

  open fun _help_search(arg0: String) {
    TODO()
  }

  open fun _history_back() {
    TODO()
  }

  open fun _history_forward() {
    TODO()
  }

  open fun _live_auto_reload_running_scripts() {
    TODO()
  }

  open fun _members_overview_selected(arg0: Int) {
    TODO()
  }

  open fun _menu_option(arg0: Int) {
    TODO()
  }

  open fun _on_find_in_files_modified_files(arg0: PoolStringArray) {
    TODO()
  }

  open fun _on_find_in_files_requested(arg0: String) {
    TODO()
  }

  open fun _on_find_in_files_result_selected(
    arg0: String,
    arg1: Int,
    arg2: Int,
    arg3: Int
  ) {
    TODO()
  }

  open fun _open_recent_script(arg0: Int) {
    TODO()
  }

  open fun _reload_scripts() {
    TODO()
  }

  open fun _request_help(arg0: String) {
    TODO()
  }

  open fun _res_saved_callback(arg0: Resource) {
    TODO()
  }

  open fun _resave_scripts(arg0: String) {
    TODO()
  }

  open fun _save_history() {
    TODO()
  }

  open fun _script_changed() {
    TODO()
  }

  open fun _script_created(arg0: Script) {
    TODO()
  }

  open fun _script_list_gui_input(arg0: InputEvent) {
    TODO()
  }

  open fun _script_selected(arg0: Int) {
    TODO()
  }

  open fun _script_split_dragged(arg0: Float) {
    TODO()
  }

  open fun _set_execution(arg0: Reference, arg1: Int) {
    TODO()
  }

  open fun _show_debugger(arg0: Boolean) {
    TODO()
  }

  open fun _start_find_in_files(arg0: Boolean) {
    TODO()
  }

  open fun _tab_changed(arg0: Int) {
    TODO()
  }

  open fun _theme_option(arg0: Int) {
    TODO()
  }

  open fun _toggle_members_overview_alpha_sort(arg0: Boolean) {
    TODO()
  }

  open fun _tree_changed() {
    TODO()
  }

  open fun _update_autosave_timer() {
    TODO()
  }

  open fun _update_members_overview() {
    TODO()
  }

  open fun _update_recent_scripts() {
    TODO()
  }

  open fun _update_script_connections() {
    TODO()
  }

  open fun _update_script_names() {
    TODO()
  }

  fun canDropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(data)
      _args.add(from)
      __method_bind.canDropDataFw.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun dropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(data)
      _args.add(from)
      __method_bind.dropDataFw.call(self._handle, _args, null)
    }
  }

  fun getCurrentScript(): Script {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Script
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCurrentScript.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Script>(_tmp.value!!)
      _ret
    }
  }

  fun getDragDataFw(point: Vector2, from: Control): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(from)
      __method_bind.getDragDataFw.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOpenScripts(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getOpenScripts.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun gotoLine(lineNumber: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.gotoLine.call(self._handle, listOf(lineNumber), null)
    }
  }

  fun openScriptCreateDialog(baseName: String, basePath: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(baseName)
      _args.add(basePath)
      __method_bind.openScriptCreateDialog.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for ScriptEditor
     */
    private object __method_bind {
      val canDropDataFw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "can_drop_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_drop_data_fw" }
        }
      val dropDataFw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "drop_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drop_data_fw" }
        }
      val getCurrentScript: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_current_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_script" }
        }
      val getDragDataFw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_drag_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_data_fw" }
        }
      val getOpenScripts: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_open_scripts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_open_scripts" }
        }
      val gotoLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "goto_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method goto_line" }
        }
      val openScriptCreateDialog: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "open_script_create_dialog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_script_create_dialog" }
        }}
  }
}
