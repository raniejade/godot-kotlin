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

open class VisualShaderNodeTransformDecompose(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    fun new(): VisualShaderNodeTransformDecompose = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformDecompose".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTransformDecompose" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTransformDecompose(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTransformDecompose =
        VisualShaderNodeTransformDecompose(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTransformDecompose
     */
    private object __method_bind
  }
}
