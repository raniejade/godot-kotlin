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

open class VisualShaderNodeTransformFunc internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  companion object {
    val FuncInverse: Int = 0

    val FuncTranspose: Int = 1

    fun new(): VisualShaderNodeTransformFunc = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTransformFunc".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeTransformFunc" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      VisualShaderNodeTransformFunc(
        fn()
      )
    }}
}
