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
    val _ret = __method_bind.canDropDataFw.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.dropDataFw.call(this._handle, _args.toVariant(), 3)
  }

  fun getCurrentScript(): Script {
    val _ret = __method_bind.getCurrentScript.call(this._handle)
    return _ret.asObject(::Script)!!
  }

  fun getDragDataFw(point: Vector2, from: Control): Variant {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(from)
    val _ret = __method_bind.getDragDataFw.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun getOpenScripts(): VariantArray {
    val _ret = __method_bind.getOpenScripts.call(this._handle)
    return _ret.asVariantArray()
  }

  fun gotoLine(lineNumber: Int) {
    val _arg = Variant.new(lineNumber)
    __method_bind.gotoLine.call(this._handle, _arg, 1)
  }

  fun openScriptCreateDialog(baseName: String, basePath: String) {
    val _args = VariantArray.new()
    _args.append(baseName)
    _args.append(basePath)
    __method_bind.openScriptCreateDialog.call(this._handle, _args.toVariant(), 2)
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
            "canDropDataFw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canDropDataFw" }
        }
      val dropDataFw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "dropDataFw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dropDataFw" }
        }
      val getCurrentScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "getCurrentScript".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentScript" }
        }
      val getDragDataFw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "getDragDataFw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDragDataFw" }
        }
      val getOpenScripts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "getOpenScripts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOpenScripts" }
        }
      val gotoLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "gotoLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gotoLine" }
        }
      val openScriptCreateDialog: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptEditor".cstr.ptr,
            "openScriptCreateDialog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method openScriptCreateDialog" }
        }}
  }
}
