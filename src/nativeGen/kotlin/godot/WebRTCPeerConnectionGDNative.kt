// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebRTCPeerConnectionGDNative internal constructor(
  _handle: COpaquePointer
) : WebRTCPeerConnection(_handle) {
  companion object {
    fun new(): WebRTCPeerConnectionGDNative = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebRTCPeerConnectionGDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WebRTCPeerConnectionGDNative" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebRTCPeerConnectionGDNative(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebRTCPeerConnectionGDNative = WebRTCPeerConnectionGDNative(ptr)
    /**
     * Container for method_bind pointers for WebRTCPeerConnectionGDNative
     */
    private object __method_bind
  }
}
