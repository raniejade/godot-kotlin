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

open class VisualShaderNodeScalarDerivativeFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  enum class Function(
    val value: Int
  ) {
    FUNC_SUM(0),

    FUNC_X(1),

    FUNC_Y(2);
  }

  companion object {
    val FUNC_SUM: Int = 0

    val FUNC_X: Int = 1

    val FUNC_Y: Int = 2

    fun new(): VisualShaderNodeScalarDerivativeFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeScalarDerivativeFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeScalarDerivativeFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeScalarDerivativeFunc(
        fn()
      )
    }}
}
