// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Position3D internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): Position3D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Position3D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Position3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Position3D(
        fn()
      )
    }}
}
