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

open class VisualShaderNodeTextureUniformTriplanar(
  _handle: COpaquePointer
) : VisualShaderNodeTextureUniform(_handle) {
  companion object {
    fun new(): VisualShaderNodeTextureUniformTriplanar = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTextureUniformTriplanar".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTextureUniformTriplanar" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTextureUniformTriplanar(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTextureUniformTriplanar =
        VisualShaderNodeTextureUniformTriplanar(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTextureUniformTriplanar
     */
    private object __method_bind
  }
}
