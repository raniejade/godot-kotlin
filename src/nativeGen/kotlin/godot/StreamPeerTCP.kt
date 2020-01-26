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

open class StreamPeerTCP internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  companion object {
    val StatusConnected: Int = 2

    val StatusConnecting: Int = 1

    val StatusError: Int = 3

    val StatusNone: Int = 0

    fun new(): StreamPeerTCP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerTCP".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for StreamPeerTCP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      StreamPeerTCP(
        fn()
      )
    }}
}
