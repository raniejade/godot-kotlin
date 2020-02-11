// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
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

open class VisualShaderNodeTransformVecMult(
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getOperator(): Operator {
    val _ret = __method_bind.getOperator.call(this._handle)
    return VisualShaderNodeTransformVecMult.Operator.from(_ret.asInt())
  }

  fun setOperator(op: Int) {
    val _arg = Variant(op)
    __method_bind.setOperator.call(this._handle, listOf(_arg))
  }

  enum class Operator(
    val value: Int
  ) {
    OP_AxB(0),

    OP_BxA(1),

    OP_3x3_AxB(2),

    OP_3x3_BxA(3);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformVecMult".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTransformVecMult" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeTransformVecMult
     */
    private object __method_bind {
      val getOperator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformVecMult".cstr.ptr,
            "get_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_operator" }
        }
      val setOperator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTransformVecMult".cstr.ptr,
            "set_operator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_operator" }
        }}
  }
}
