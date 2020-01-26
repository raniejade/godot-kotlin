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

open class VisualShaderNodeColorOp internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  enum class Operator(
    val value: Int
  ) {
    OP_SCREEN(0),

    OP_DIFFERENCE(1),

    OP_DARKEN(2),

    OP_LIGHTEN(3),

    OP_OVERLAY(4),

    OP_DODGE(5),

    OP_BURN(6),

    OP_SOFT_LIGHT(7),

    OP_HARD_LIGHT(8);
  }

  companion object {
    val OP_BURN: Int = 6

    val OP_DARKEN: Int = 2

    val OP_DIFFERENCE: Int = 1

    val OP_DODGE: Int = 5

    val OP_HARD_LIGHT: Int = 8

    val OP_LIGHTEN: Int = 3

    val OP_OVERLAY: Int = 4

    val OP_SCREEN: Int = 0

    val OP_SOFT_LIGHT: Int = 7

    fun new(): VisualShaderNodeColorOp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorOp".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeColorOp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeColorOp(
        fn()
      )
    }}
}
