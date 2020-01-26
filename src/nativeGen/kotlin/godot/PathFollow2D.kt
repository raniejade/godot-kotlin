// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PathFollow2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    fun new(): PathFollow2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for PathFollow2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      PathFollow2D(
        fn()
      )
    }}
}
