// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeVectorOp internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getOperator(): Operator {
    val _ret = __method_bind.get_operator.call(this.toVariant())
    TODO()
  }

  fun setOperator(op: Int) {
    val _args = VariantArray.new()
    _args.append(op)
    val _ret = __method_bind.set_operator.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

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

    OP_CROSS(8),

    OP_ATAN2(9),

    OP_REFLECT(10),

    OP_STEP(11);

    companion object {
      fun from(value: Int): Operator {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val OP_ADD: Int = 0

    val OP_ATAN2: Int = 9

    val OP_CROSS: Int = 8

    val OP_DIV: Int = 3

    val OP_MAX: Int = 6

    val OP_MIN: Int = 7

    val OP_MOD: Int = 4

    val OP_MUL: Int = 2

    val OP_POW: Int = 5

    val OP_REFLECT: Int = 10

    val OP_STEP: Int = 11

    val OP_SUB: Int = 1

    fun new(): VisualShaderNodeVectorOp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVectorOp".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeVectorOp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeVectorOp(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeVectorOp = VisualShaderNodeVectorOp(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeVectorOp
     */
    private object __method_bind {
      val get_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorOp".cstr.ptr,
              "get_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_operator" }
            }
          }

      val set_operator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorOp".cstr.ptr,
              "set_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_operator" }
            }
          }
    }
  }
}
