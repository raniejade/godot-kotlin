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

open class VisualShaderNodeBooleanUniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNodeUniform(_handle) {
  companion object {
    fun new(): VisualShaderNodeBooleanUniform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeBooleanUniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeBooleanUniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeBooleanUniform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeBooleanUniform =
        VisualShaderNodeBooleanUniform(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeBooleanUniform
     */
    private object __method_bind
  }
}
