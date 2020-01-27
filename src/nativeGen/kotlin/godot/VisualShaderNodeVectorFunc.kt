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

open class VisualShaderNodeVectorFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getFunction(): Function {
    val _ret = __method_bind.get_function.call(this.toVariant())
    return VisualShaderNodeVectorFunc.Function.from(_ret.asInt())
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.set_function.call(this.toVariant(), _arg, 1)
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
    val FUNC_ABS: Int = 6

    val FUNC_ACOS: Int = 7

    val FUNC_ACOSH: Int = 8

    val FUNC_ASIN: Int = 9

    val FUNC_ASINH: Int = 10

    val FUNC_ATAN: Int = 11

    val FUNC_ATANH: Int = 12

    val FUNC_CEIL: Int = 13

    val FUNC_COS: Int = 14

    val FUNC_COSH: Int = 15

    val FUNC_DEGREES: Int = 16

    val FUNC_EXP: Int = 17

    val FUNC_EXP2: Int = 18

    val FUNC_FLOOR: Int = 19

    val FUNC_FRAC: Int = 20

    val FUNC_HSV2RGB: Int = 5

    val FUNC_INVERSE_SQRT: Int = 21

    val FUNC_LOG: Int = 22

    val FUNC_LOG2: Int = 23

    val FUNC_NEGATE: Int = 2

    val FUNC_NORMALIZE: Int = 0

    val FUNC_ONEMINUS: Int = 34

    val FUNC_RADIANS: Int = 24

    val FUNC_RECIPROCAL: Int = 3

    val FUNC_RGB2HSV: Int = 4

    val FUNC_ROUND: Int = 25

    val FUNC_ROUNDEVEN: Int = 26

    val FUNC_SATURATE: Int = 1

    val FUNC_SIGN: Int = 27

    val FUNC_SIN: Int = 28

    val FUNC_SINH: Int = 29

    val FUNC_SQRT: Int = 30

    val FUNC_TAN: Int = 31

    val FUNC_TANH: Int = 32

    val FUNC_TRUNC: Int = 33

    fun new(): VisualShaderNodeVectorFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeVectorFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeVectorFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeVectorFunc(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeVectorFunc = VisualShaderNodeVectorFunc(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeVectorFunc
     */
    private object __method_bind {
      val get_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorFunc".cstr.ptr,
              "get_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_function" }
            }
          }

      val set_function: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeVectorFunc".cstr.ptr,
              "set_function".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_function" }
            }
          }
    }
  }
}
