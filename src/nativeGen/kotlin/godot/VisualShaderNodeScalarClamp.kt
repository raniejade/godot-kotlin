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

open class VisualShaderNodeScalarClamp internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    fun new(): VisualShaderNodeScalarClamp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarClamp".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeScalarClamp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarClamp(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeScalarClamp = VisualShaderNodeScalarClamp(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeScalarClamp
     */
    private object __method_bind
  }
}
