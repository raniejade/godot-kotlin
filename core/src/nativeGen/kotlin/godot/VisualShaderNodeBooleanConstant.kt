// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeBooleanConstant(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var constant: Boolean
    get() {
       return getConstant() 
    }
    set(value) {
      setConstant(value)
    }

  fun getConstant(): Boolean {
    val _ret = __method_bind.getConstant.call(this._handle)
    return _ret.asBoolean()
  }

  fun setConstant(value: Boolean) {
    val _arg = Variant.new(value)
    __method_bind.setConstant.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualShaderNodeBooleanConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeBooleanConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeBooleanConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeBooleanConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeBooleanConstant =
        VisualShaderNodeBooleanConstant(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeBooleanConstant
     */
    private object __method_bind {
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeBooleanConstant".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeBooleanConstant".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }}
  }
}
