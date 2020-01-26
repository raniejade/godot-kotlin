// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeVectorLen internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    fun new(): VisualShaderNodeVectorLen = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVectorLen".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeVectorLen" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualShaderNodeVectorLen(
        fn()
      )
    }}
}
