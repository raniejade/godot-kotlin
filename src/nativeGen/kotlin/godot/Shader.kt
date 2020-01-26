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

open class Shader internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val ModeCanvasItem: Int = 1

    val ModeParticles: Int = 2

    val ModeSpatial: Int = 0

    fun new(): Shader = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Shader".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Shader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Shader(
        fn()
      )
    }}
}
