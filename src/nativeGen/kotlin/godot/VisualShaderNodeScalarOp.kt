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

open class VisualShaderNodeScalarOp internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  enum class Operator(
    val value: Int
  ) {
    OP_ADD(0),

    OP_SUB(1),

    OP_MUL(2),

    OP_DIV(3),

    OP_MOD(4),

    OP_POW(5),

    OP_MAX(6),

    OP_MIN(7),

    OP_ATAN2(8),

    OP_STEP(9);
  }

  companion object {
    val OP_ADD: Int = 0

    val OP_ATAN2: Int = 8

    val OP_DIV: Int = 3

    val OP_MAX: Int = 6

    val OP_MIN: Int = 7

    val OP_MOD: Int = 4

    val OP_MUL: Int = 2

    val OP_POW: Int = 5

    val OP_STEP: Int = 9

    val OP_SUB: Int = 1

    fun new(): VisualShaderNodeScalarOp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarOp".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeScalarOp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarOp(
        fn()
      )
    }}
}
