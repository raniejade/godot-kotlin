// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeScalarFunc(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var function: Function
    get() {
       return getFunction() 
    }
    set(value) {
      setFunction(value.value)
    }

  fun getFunction(): Function {
    val _ret = __method_bind.getFunction.call(this._handle)
    return VisualShaderNodeScalarFunc.Function.from(_ret.asInt())
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.setFunction.call(this._handle, listOf(_arg))
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
      val getFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarFunc".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeScalarFunc".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }}
  }
}
