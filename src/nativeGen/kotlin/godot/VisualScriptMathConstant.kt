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

open class VisualScriptMathConstant internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getMathConstant(): MathConstant {
    val _ret = __method_bind.get_math_constant.call(this._handle)
    return VisualScriptMathConstant.MathConstant.from(_ret.asInt())
  }

  fun setMathConstant(which: Int) {
    val _arg = Variant.new(which)
    __method_bind.set_math_constant.call(this._handle, _arg, 1)
  }

  enum class MathConstant(
    val value: Int
  ) {
    MATH_CONSTANT_ONE(0),

    MATH_CONSTANT_PI(1),

    MATH_CONSTANT_HALF_PI(2),

    MATH_CONSTANT_TAU(3),

    MATH_CONSTANT_E(4),

    MATH_CONSTANT_SQRT2(5),

    MATH_CONSTANT_INF(6),

    MATH_CONSTANT_NAN(7),

    MATH_CONSTANT_MAX(8);

    companion object {
      fun from(value: Int): MathConstant {
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
    val MATH_CONSTANT_E: Int = 4

    val MATH_CONSTANT_HALF_PI: Int = 2

    val MATH_CONSTANT_INF: Int = 6

    val MATH_CONSTANT_MAX: Int = 8

    val MATH_CONSTANT_NAN: Int = 7

    val MATH_CONSTANT_ONE: Int = 0

    val MATH_CONSTANT_PI: Int = 1

    val MATH_CONSTANT_SQRT2: Int = 5

    val MATH_CONSTANT_TAU: Int = 3

    fun new(): VisualScriptMathConstant = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptMathConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptMathConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptMathConstant(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptMathConstant = VisualScriptMathConstant(ptr)
    /**
     * Container for method_bind pointers for VisualScriptMathConstant
     */
    private object __method_bind {
      val get_math_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptMathConstant".cstr.ptr,
            "get_math_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_math_constant" }
        }
      val set_math_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptMathConstant".cstr.ptr,
            "set_math_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_math_constant" }
        }}
  }
}
