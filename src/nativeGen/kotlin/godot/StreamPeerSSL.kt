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
  enum class Status(
    val value: Int
  ) {
    STATUS_DISCONNECTED(0),

    STATUS_HANDSHAKING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3),

    STATUS_ERROR_HOSTNAME_MISMATCH(4);
  }

  companion object {
    val STATUS_CONNECTED: Int = 2

    val STATUS_DISCONNECTED: Int = 0

    val STATUS_ERROR: Int = 3

    val STATUS_ERROR_HOSTNAME_MISMATCH: Int = 4

    val STATUS_HANDSHAKING: Int = 1

    fun new(): StreamPeerSSL = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerSSL".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for StreamPeerSSL" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerSSL(
        fn()
      )
    }}
}
