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
  enum class Operator(
    val value: Int
  ) {
    OP_AxB(0),

    OP_BxA(1),

    OP_AxB_COMP(2),

    OP_BxA_COMP(3);
  }

  companion object {
    val OP_AxB: Int = 0

    val OP_AxB_COMP: Int = 2

    val OP_BxA: Int = 1

    val OP_BxA_COMP: Int = 3

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
