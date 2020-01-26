// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVRAnchor internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): ARVRAnchor = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRAnchor".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ARVRAnchor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ARVRAnchor(
        fn()
      )
    }}
}
