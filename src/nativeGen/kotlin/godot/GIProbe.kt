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

open class GIProbe internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  enum class Subdiv(
    val value: Int
  ) {
    SUBDIV_64(0),

    SUBDIV_128(1),

    SUBDIV_256(2),

    SUBDIV_512(3),

    SUBDIV_MAX(4);
  }

  companion object {
    val SUBDIV_128: Int = 1

    val SUBDIV_256: Int = 2

    val SUBDIV_512: Int = 3

    val SUBDIV_64: Int = 0

    val SUBDIV_MAX: Int = 4

    fun new(): GIProbe = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for GIProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GIProbe(
        fn()
      )
    }}
}
