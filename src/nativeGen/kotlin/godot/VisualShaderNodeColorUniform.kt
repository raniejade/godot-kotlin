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

open class VisualShaderNodeColorUniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNodeUniform(_handle) {
  companion object {
    fun new(): VisualShaderNodeColorUniform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorUniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeColorUniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeColorUniform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeColorUniform = VisualShaderNodeColorUniform(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeColorUniform
     */
    private object __method_bind
  }
}
