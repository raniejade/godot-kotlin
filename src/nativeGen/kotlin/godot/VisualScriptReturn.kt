// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptReturn(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var returnEnabled: Boolean
    get() {
       return isReturnValueEnabled() 
    }
    set(value) {
      setEnableReturnValue(value)
    }

  var returnType: Int
    get() {
       return Variant.Type.from(getReturnType()) 
    }
    set(value) {
      setReturnType(Variant.Type.from(value))
    }

  fun getReturnType(): Variant.Type {
    val _ret = __method_bind.getReturnType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun isReturnValueEnabled(): Boolean {
    val _ret = __method_bind.isReturnValueEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setEnableReturnValue(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setEnableReturnValue.call(this._handle, _arg, 1)
  }

  fun setReturnType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setReturnType.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptReturn = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptReturn".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptReturn" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptReturn(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptReturn = VisualScriptReturn(ptr)
    /**
     * Container for method_bind pointers for VisualScriptReturn
     */
    private object __method_bind {
      val getReturnType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "getReturnType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getReturnType" }
        }
      val isReturnValueEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "isReturnValueEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isReturnValueEnabled" }
        }
      val setEnableReturnValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "setEnableReturnValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnableReturnValue" }
        }
      val setReturnType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "setReturnType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setReturnType" }
        }}
  }
}
