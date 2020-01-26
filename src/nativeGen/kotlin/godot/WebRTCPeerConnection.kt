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

open class WebRTCPeerConnection internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class ConnectionState(
    val value: Int
  ) {
    STATE_NEW(0),

    STATE_CONNECTING(1),

    STATE_CONNECTED(2),

    STATE_DISCONNECTED(3),

    STATE_FAILED(4),

    STATE_CLOSED(5);
  }

  companion object {
    val STATE_CLOSED: Int = 5

    val STATE_CONNECTED: Int = 2

    val STATE_CONNECTING: Int = 1

    val STATE_DISCONNECTED: Int = 3

    val STATE_FAILED: Int = 4

    val STATE_NEW: Int = 0

    fun new(): WebRTCPeerConnection = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebRTCPeerConnection".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for WebRTCPeerConnection" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebRTCPeerConnection(
        fn()
      )
    }}
}
