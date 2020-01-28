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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScriptEditor(
  _handle: COpaquePointer
) : PanelContainer(_handle) {
  fun canDropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(data)
    _args.append(from)
    val _ret = __method_bind.can_drop_data_fw.call(this._handle, _args.toVariant(), 3)
    return _ret.asBoolean()
  }

  fun dropDataFw(
    point: Vector2,
    data: Variant,
    from: Control
  ) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(data)
    _args.append(from)
    __method_bind.drop_data_fw.call(this._handle, _args.toVariant(), 3)
  }

  fun getCurrentScript(): Script {
    val _ret = __method_bind.get_current_script.call(this._handle)
    return _ret.asObject(::Script)!!
  }

  fun getDragDataFw(point: Vector2, from: Control): Variant {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(from)
    val _ret = __method_bind.get_drag_data_fw.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun getOpenScripts(): VariantArray {
    val _ret = __method_bind.get_open_scripts.call(this._handle)
    return _ret.asVariantArray()
  }

  fun gotoLine(lineNumber: Int) {
    val _arg = Variant.new(lineNumber)
    __method_bind.goto_line.call(this._handle, _arg, 1)
  }

  fun openScriptCreateDialog(baseName: String, basePath: String) {
    val _args = VariantArray.new()
    _args.append(baseName)
    _args.append(basePath)
    __method_bind.open_script_create_dialog.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for ScriptEditor
     */
    private object __method_bind {
      val can_drop_data_fw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "can_drop_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_drop_data_fw" }
        }
      val drop_data_fw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "drop_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drop_data_fw" }
        }
      val get_current_script: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_current_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_script" }
        }
      val get_drag_data_fw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_drag_data_fw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_data_fw" }
        }
      val get_open_scripts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "get_open_scripts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_open_scripts" }
        }
      val goto_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "goto_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method goto_line" }
        }
      val open_script_create_dialog: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "open_script_create_dialog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_script_create_dialog" }
        }}
  }
}
