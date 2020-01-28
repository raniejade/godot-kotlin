// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptNode(
  _handle: COpaquePointer
) : Resource(_handle) {
  var defaultInputValues: VariantArray
    get() {
       return _getDefaultInputValues() 
    }
    set(value) {
      _setDefaultInputValues(value)
    }

  fun getDefaultInputValue(portIdx: Int): Variant {
    val _arg = Variant.new(portIdx)
    val _ret = __method_bind.getDefaultInputValue.call(this._handle, _arg, 1)
    return _ret
  }

  fun getVisualScript(): VisualScript {
    val _ret = __method_bind.getVisualScript.call(this._handle)
    return _ret.asObject(::VisualScript)!!
  }

  fun portsChangedNotify() {
    __method_bind.portsChangedNotify.call(this._handle)
  }

  fun setDefaultInputValue(portIdx: Int, value: Variant) {
    val _args = VariantArray.new()
    _args.append(portIdx)
    _args.append(value)
    __method_bind.setDefaultInputValue.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualScriptNode
     */
    private object __method_bind {
      val getDefaultInputValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "getDefaultInputValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDefaultInputValue" }
        }
      val getVisualScript: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "getVisualScript".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisualScript" }
        }
      val portsChangedNotify: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "portsChangedNotify".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method portsChangedNotify" }
        }
      val setDefaultInputValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "setDefaultInputValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDefaultInputValue" }
        }}
  }
}
