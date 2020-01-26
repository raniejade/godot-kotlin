// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
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
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeVec3Uniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualShaderNodeVec3Uniform(
        fn()
      )
    }}
}
