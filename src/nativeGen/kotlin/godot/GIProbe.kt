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
  companion object {
    val Subdiv128: Int = 1

    val Subdiv256: Int = 2

    val Subdiv512: Int = 3

    val Subdiv64: Int = 0

    val SubdivMax: Int = 4

    fun new(): GIProbe = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GIProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for GIProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      GIProbe(
        fn()
      )
    }}
}
