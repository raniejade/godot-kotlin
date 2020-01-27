// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTransformConstant internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getConstant(): Transform {
    val _ret = __method_bind.get_constant.call(this.toVariant())
    return _ret.asTransform()
  }

  fun setConstant(value: Transform) {
    val _args = VariantArray.new()
    _args.append(value)
    __method_bind.set_constant.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): VisualShaderNodeTransformConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeTransformConstant" }
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
      val get_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformConstant".cstr.ptr,
              "get_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant" }
            }
          }

      val set_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformConstant".cstr.ptr,
              "set_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant" }
            }
          }
    }
  }
}
