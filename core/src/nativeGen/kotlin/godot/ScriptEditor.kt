// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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

  constructor() : this(null) {
    _handle = __new()
  }

  fun canDropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(data))
    _args.add(Variant.fromAny(from))
    val _ret = __method_bind.canDropDataFw.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun dropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(data))
    _args.add(Variant.fromAny(from))
    __method_bind.dropDataFw.call(this._handle, _args)
  }

  fun getCurrentScript(): Script {
    val _ret = __method_bind.getCurrentScript.call(this._handle)
    return _ret.asObject(::Script)!!
  }

  fun getDragDataFw(point: Vector2, from: Control): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(from))
    val _ret = __method_bind.getDragDataFw.call(this._handle, _args)
    return _ret
  }

  fun getOpenScripts(): VariantArray {
    val _ret = __method_bind.getOpenScripts.call(this._handle)
    return _ret.asVariantArray()
  }

  fun gotoLine(lineNumber: Int) {
    val _arg = Variant.new(lineNumber)
    __method_bind.gotoLine.call(this._handle, listOf(_arg))
  }

  fun openScriptCreateDialog(baseName: String, basePath: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(baseName))
    _args.add(Variant.fromAny(basePath))
    __method_bind.openScriptCreateDialog.call(this._handle, _args)
  }

  companion object {
    /**
     * Container for method_bind pointers for ScriptEditor
     */
    private object __method_bind {
      val canDropDataFw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "can_drop_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_drop_data_fw" }
        }
      val dropDataFw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "drop_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drop_data_fw" }
        }
      val getCurrentScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_current_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_script" }
        }
      val getDragDataFw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_drag_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_data_fw" }
        }
      val getOpenScripts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_open_scripts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_open_scripts" }
        }
      val gotoLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "goto_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method goto_line" }
        }
      val openScriptCreateDialog: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "open_script_create_dialog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_script_create_dialog" }
        }}
  }
}
