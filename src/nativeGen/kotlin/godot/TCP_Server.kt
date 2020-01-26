// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TCP_Server internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): TCP_Server = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TCP_Server".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for TCP_Server" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      TCP_Server(
        fn()
      )
    }}
}
