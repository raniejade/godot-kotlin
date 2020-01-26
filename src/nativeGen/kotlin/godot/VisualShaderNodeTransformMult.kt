// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTransformMult internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    val OpAxb: Int = 0

    val OpAxbComp: Int = 2

    val OpBxa: Int = 1

    val OpBxaComp: Int = 3

    fun new(): VisualShaderNodeTransformMult = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformMult".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeTransformMult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualShaderNodeTransformMult(
        fn()
      )
    }}
}
