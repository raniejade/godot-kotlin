// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StaticBody internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  companion object {
    fun new(): StaticBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StaticBody".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for StaticBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      StaticBody(
        fn()
      )
    }}
}
