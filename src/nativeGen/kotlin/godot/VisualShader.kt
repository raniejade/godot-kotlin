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

open class VisualShader internal constructor(
  _handle: COpaquePointer
) : Shader(_handle) {
  companion object {
    val NodeIdInvalid: Int = -1

    val NodeIdOutput: Int = 0

    val TypeFragment: Int = 1

    val TypeLight: Int = 2

    val TypeMax: Int = 3

    val TypeVertex: Int = 0

    fun new(): VisualShader = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShader".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShader(
        fn()
      )
    }}
}
