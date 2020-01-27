// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeVec3Uniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNodeUniform(_handle) {
  companion object {
    fun new(): VisualShaderNodeVec3Uniform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVec3Uniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeVec3Uniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeVec3Uniform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeVec3Uniform = VisualShaderNodeVec3Uniform(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeVec3Uniform
     */
    private object __method_bind
  }
}
