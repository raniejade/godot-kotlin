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

open class VisualShaderNodeColorFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    val FuncGrayscale: Int = 0

    val FuncSepia: Int = 1

    fun new(): VisualShaderNodeColorFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeColorFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeColorFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualShaderNodeColorFunc(
        fn()
      )
    }}
}
