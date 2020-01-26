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
  companion object {
    val MathConstantE: Int = 4

    val MathConstantHalfPi: Int = 2

    val MathConstantInf: Int = 6

    val MathConstantMax: Int = 8

    val MathConstantNan: Int = 7

    val MathConstantOne: Int = 0

    val MathConstantPi: Int = 1

    val MathConstantSqrt2: Int = 5

    val MathConstantTau: Int = 3

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
