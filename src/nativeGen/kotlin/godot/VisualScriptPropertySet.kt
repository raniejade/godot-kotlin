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

open class VisualScriptPropertySet internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  enum class AssignOp(
    val value: Int
  ) {
    ASSIGN_OP_NONE(0),

    ASSIGN_OP_ADD(1),

    ASSIGN_OP_SUB(2),

    ASSIGN_OP_MUL(3),

    ASSIGN_OP_DIV(4),

    ASSIGN_OP_MOD(5),

    ASSIGN_OP_SHIFT_LEFT(6),

    ASSIGN_OP_SHIFT_RIGHT(7),

    ASSIGN_OP_BIT_AND(8),

    ASSIGN_OP_BIT_OR(9),

    ASSIGN_OP_BIT_XOR(10);
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2),

    CALL_MODE_BASIC_TYPE(3);
  }

  companion object {
    val ASSIGN_OP_ADD: Int = 1

    val ASSIGN_OP_BIT_AND: Int = 8

    val ASSIGN_OP_BIT_OR: Int = 9

    val ASSIGN_OP_BIT_XOR: Int = 10

    val ASSIGN_OP_DIV: Int = 4

    val ASSIGN_OP_MOD: Int = 5

    val ASSIGN_OP_MUL: Int = 3

    val ASSIGN_OP_NONE: Int = 0

    val ASSIGN_OP_SHIFT_LEFT: Int = 6

    val ASSIGN_OP_SHIFT_RIGHT: Int = 7

    val ASSIGN_OP_SUB: Int = 2

    val CALL_MODE_BASIC_TYPE: Int = 3

    val CALL_MODE_INSTANCE: Int = 2

    val CALL_MODE_NODE_PATH: Int = 1

    val CALL_MODE_SELF: Int = 0

    fun new(): VisualScriptPropertySet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPropertySet".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptPropertySet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptPropertySet(
        fn()
      )
    }}
}
