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

open class VisualShaderNodeTransformVecMult internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  enum class Operator(
    val value: Int
  ) {
    OP_AxB(0),

    OP_BxA(1),

    OP_3x3_AxB(2),

    OP_3x3_BxA(3);
  }

  companion object {
    val OP_3x3_AxB: Int = 2

    val OP_3x3_BxA: Int = 3

    val OP_AxB: Int = 0

    val OP_BxA: Int = 1

    fun new(): VisualShaderNodeTransformVecMult = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformVecMult".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeTransformVecMult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTransformVecMult(
        fn()
      )
    }}
}
