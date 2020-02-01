// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeInput(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var inputName: String
    get() {
       return getInputName() 
    }
    set(value) {
      setInputName(value)
    }

  fun getInputName(): String {
    val _ret = __method_bind.getInputName.call(this._handle)
    return _ret.asString()
  }

  fun getInputRealName(): String {
    val _ret = __method_bind.getInputRealName.call(this._handle)
    return _ret.asString()
  }

  fun setInputName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setInputName.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualShaderNodeInput = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeInput".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeInput" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeInput(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeInput = VisualShaderNodeInput(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeInput
     */
    private object __method_bind {
      val getInputName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeInput".cstr.ptr,
            "get_input_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_name" }
        }
      val getInputRealName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeInput".cstr.ptr,
            "get_input_real_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_real_name" }
        }
      val setInputName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeInput".cstr.ptr,
            "set_input_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_name" }
        }}
  }
}
