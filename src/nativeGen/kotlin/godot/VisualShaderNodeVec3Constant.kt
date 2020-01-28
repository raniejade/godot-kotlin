// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeVec3Constant(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var constant: Vector3
    get() {
       return getConstant() 
    }
    set(value) {
      setConstant(value)
    }

  /**
   * Specialized setter for constant
   */
  fun constant(cb: Vector3.() -> Unit) {
    val _p = constant
    cb(_p)
    constant = _p
  }

  fun getConstant(): Vector3 {
    val _ret = __method_bind.getConstant.call(this._handle)
    return _ret.asVector3()
  }

  fun setConstant(value: Vector3) {
    val _arg = Variant.new(value)
    __method_bind.setConstant.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualShaderNodeVec3Constant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVec3Constant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeVec3Constant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeVec3Constant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeVec3Constant = VisualShaderNodeVec3Constant(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeVec3Constant
     */
    private object __method_bind {
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVec3Constant".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVec3Constant".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }}
  }
}
