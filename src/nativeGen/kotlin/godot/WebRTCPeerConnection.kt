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
  companion object {
    val StateClosed: Int = 5

    val StateConnected: Int = 2

    val StateConnecting: Int = 1

    val StateDisconnected: Int = 3

    val StateFailed: Int = 4

    val StateNew: Int = 0

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
