// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTransformConstant(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var constant: Transform
    get() {
       return getConstant() 
    }
    set(value) {
      setConstant(value)
    }

  /**
   * Specialized setter for constant
   */
  fun constant(cb: Transform.() -> Unit) {
    val _p = constant
    cb(_p)
    constant = _p
  }

  fun getConstant(): Transform {
    val _ret = __method_bind.getConstant.call(this._handle)
    return _ret.asTransform()
  }

  fun setConstant(value: Transform) {
    val _arg = Variant.new(value)
    __method_bind.setConstant.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VisualShaderNodeTransformConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTransformConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTransformConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTransformConstant =
        VisualShaderNodeTransformConstant(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTransformConstant
     */
    private object __method_bind {
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformConstant".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformConstant".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }}
  }
}
