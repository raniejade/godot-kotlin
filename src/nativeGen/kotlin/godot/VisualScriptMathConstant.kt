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

open class VisualScriptMathConstant internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
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
      requireNotNull(fnPtr) { "No constructor found for VisualScriptMathConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptMathConstant(
        fn()
      )
    }}
}
