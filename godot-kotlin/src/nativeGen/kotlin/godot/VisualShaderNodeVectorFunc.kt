// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class VisualShaderNodeVectorFunc(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var function: Function
    get() {
       return getFunction() 
    }
    set(value) {
      setFunction(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFunction(): Function {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFunction.call(self._handle, emptyList(), _retPtr)
      VisualShaderNodeVectorFunc.Function.from(_ret.value)
    }
  }

  fun setFunction(func: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFunction.call(self._handle, listOf(func), null)
    }
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_NORMALIZE(0),

    FUNC_SATURATE(1),

    FUNC_NEGATE(2),

    FUNC_RECIPROCAL(3),

    FUNC_RGB2HSV(4),

    FUNC_HSV2RGB(5),

    FUNC_ABS(6),

    FUNC_ACOS(7),

    FUNC_ACOSH(8),

    FUNC_ASIN(9),

    FUNC_ASINH(10),

    FUNC_ATAN(11),

    FUNC_ATANH(12),

    FUNC_CEIL(13),

    FUNC_COS(14),

    FUNC_COSH(15),

    FUNC_DEGREES(16),

    FUNC_EXP(17),

    FUNC_EXP2(18),

    FUNC_FLOOR(19),

    FUNC_FRAC(20),

    FUNC_INVERSE_SQRT(21),

    FUNC_LOG(22),

    FUNC_LOG2(23),

    FUNC_RADIANS(24),

    FUNC_ROUND(25),

    FUNC_ROUNDEVEN(26),

    FUNC_SIGN(27),

    FUNC_SIN(28),

    FUNC_SINH(29),

    FUNC_SQRT(30),

    FUNC_TAN(31),

    FUNC_TANH(32),

    FUNC_TRUNC(33),

    FUNC_ONEMINUS(34);

    companion object {
      fun from(value: Int): Function {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVectorFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeVectorFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeVectorFunc
     */
    private object __method_bind {
      val getFunction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorFunc".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorFunc".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }}
  }
}
