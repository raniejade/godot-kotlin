// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeVec3Constant internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getConstant(): Vector3 {
    val _ret = __method_bind.get_constant.call(this.toVariant())
    return _ret.asVector3()
  }

  fun setConstant(value: Vector3) {
    val _arg = Variant.new(value)
    __method_bind.set_constant.call(this.toVariant(), _arg, 1)
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
      val get_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVec3Constant".cstr.ptr,
              "get_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant" }
            }
          }

      val set_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVec3Constant".cstr.ptr,
              "set_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant" }
            }
          }
    }
  }
}
