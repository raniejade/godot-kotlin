// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeScalarUniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNodeUniform(_handle) {
  companion object {
    fun new(): VisualShaderNodeScalarUniform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarUniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeScalarUniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarUniform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeScalarUniform =
        VisualShaderNodeScalarUniform(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeScalarUniform
     */
    private object __method_bind
  }
}
