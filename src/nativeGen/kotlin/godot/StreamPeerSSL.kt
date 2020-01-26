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

open class StreamPeerSSL internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  companion object {
    val StatusConnected: Int = 2

    val StatusDisconnected: Int = 0

    val StatusError: Int = 3

    val StatusErrorHostnameMismatch: Int = 4

    val StatusHandshaking: Int = 1

    fun new(): StreamPeerSSL = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerSSL".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for StreamPeerSSL" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      StreamPeerSSL(
        fn()
      )
    }}
}
