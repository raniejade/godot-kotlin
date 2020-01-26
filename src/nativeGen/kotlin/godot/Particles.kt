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

open class Particles internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  companion object {
    val DrawOrderIndex: Int = 0

    val DrawOrderLifetime: Int = 1

    val DrawOrderViewDepth: Int = 2

    val MaxDrawPasses: Int = 4

    fun new(): Particles = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Particles" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Particles(
        fn()
      )
    }}
}
