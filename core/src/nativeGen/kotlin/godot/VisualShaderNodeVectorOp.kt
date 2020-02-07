// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeVectorOp(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var operator: Operator
    get() {
       return getOperator() 
    }
    set(value) {
      setOperator(value.value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getOperator(): Operator {
    val _ret = __method_bind.getOperator.call(this._handle)
    return VisualShaderNodeVectorOp.Operator.from(_ret.asInt())
  }

  fun setOperator(op: Int) {
    val _arg = Variant(op)
    __method_bind.setOperator.call(this._handle, listOf(_arg))
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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVectorOp".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeVectorOp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeVectorOp
     */
    private object __method_bind {
      val getOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorOp".cstr.ptr,
            "get_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_operator" }
        }
      val setOperator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorOp".cstr.ptr,
            "set_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_operator" }
        }}
  }
}
