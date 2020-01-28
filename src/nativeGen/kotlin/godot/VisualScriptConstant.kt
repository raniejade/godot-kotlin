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

open class VisualScriptConstant(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var type: Variant.Type
    get() {
       return getConstantType() 
    }
    set(value) {
      setConstantType(value.value)
    }

  var value: Variant
    get() {
       return getConstantValue() 
    }
    set(value) {
      setConstantValue(value)
    }

  fun getConstantType(): Variant.Type {
    val _ret = __method_bind.getConstantType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun getConstantValue(): Variant {
    val _ret = __method_bind.getConstantValue.call(this._handle)
    return _ret
  }

  fun setConstantType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setConstantType.call(this._handle, _arg, 1)
  }

  fun setConstantValue(value: Variant) {
    val _arg = Variant.new(value)
    __method_bind.setConstantValue.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptConstant = VisualScriptConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptConstant
     */
    private object __method_bind {
      val getConstantType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
            "get_constant_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_type" }
        }
      val getConstantValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
            "get_constant_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_value" }
        }
      val setConstantType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
            "set_constant_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant_type" }
        }
      val setConstantValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
            "set_constant_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant_value" }
        }}
  }
}
