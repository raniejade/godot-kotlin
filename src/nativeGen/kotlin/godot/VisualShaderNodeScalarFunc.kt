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

open class VisualShaderNodeScalarFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getFunction(): Function {
    val _ret = __method_bind.get_function.call(this.toVariant())
    return VisualShaderNodeScalarFunc.Function.from(_ret.asInt())
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.set_function.call(this.toVariant(), _arg, 1)
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_SIN(0),

    FUNC_COS(1),

    FUNC_TAN(2),

    FUNC_ASIN(3),

    FUNC_ACOS(4),

    FUNC_ATAN(5),

    FUNC_SINH(6),

    FUNC_COSH(7),

    FUNC_TANH(8),

    FUNC_LOG(9),

    FUNC_EXP(10),

    FUNC_SQRT(11),

    FUNC_ABS(12),

    FUNC_SIGN(13),

    FUNC_FLOOR(14),

    FUNC_ROUND(15),

    FUNC_CEIL(16),

    FUNC_FRAC(17),

    FUNC_SATURATE(18),

    FUNC_NEGATE(19),

    FUNC_ACOSH(20),

    FUNC_ASINH(21),

    FUNC_ATANH(22),

    FUNC_DEGREES(23),

    FUNC_EXP2(24),

    FUNC_INVERSE_SQRT(25),

    FUNC_LOG2(26),

    FUNC_RADIANS(27),

    FUNC_RECIPROCAL(28),

    FUNC_ROUNDEVEN(29),

    FUNC_TRUNC(30),

    FUNC_ONEMINUS(31);

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
    val FUNC_ABS: Int = 12

    val FUNC_ACOS: Int = 4

    val FUNC_ACOSH: Int = 20

    val FUNC_ASIN: Int = 3

    val FUNC_ASINH: Int = 21

    val FUNC_ATAN: Int = 5

    val FUNC_ATANH: Int = 22

    val FUNC_CEIL: Int = 16

    val FUNC_COS: Int = 1

    val FUNC_COSH: Int = 7

    val FUNC_DEGREES: Int = 23

    val FUNC_EXP: Int = 10

    val FUNC_EXP2: Int = 24

    val FUNC_FLOOR: Int = 14

    val FUNC_FRAC: Int = 17

    val FUNC_INVERSE_SQRT: Int = 25

    val FUNC_LOG: Int = 9

    val FUNC_LOG2: Int = 26

    val FUNC_NEGATE: Int = 19

    val FUNC_ONEMINUS: Int = 31

    val FUNC_RADIANS: Int = 27

    val FUNC_RECIPROCAL: Int = 28

    val FUNC_ROUND: Int = 15

    val FUNC_ROUNDEVEN: Int = 29

    val FUNC_SATURATE: Int = 18

    val FUNC_SIGN: Int = 13

    val FUNC_SIN: Int = 0

    val FUNC_SINH: Int = 6

    val FUNC_SQRT: Int = 11

    val FUNC_TAN: Int = 2

    val FUNC_TANH: Int = 8

    val FUNC_TRUNC: Int = 30

    fun new(): VisualShaderNodeScalarFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeScalarFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarFunc(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeScalarFunc = VisualShaderNodeScalarFunc(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeScalarFunc
     */
    private object __method_bind {
      val get_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarFunc".cstr.ptr,
              "get_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function" }
            }
          }

      val set_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarFunc".cstr.ptr,
              "set_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_function" }
            }
          }
    }
  }
}
