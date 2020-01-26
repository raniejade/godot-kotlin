// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebRTCPeerConnection internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addIceCandidate(): Error {
    TODO()
  }

  fun close() {
    TODO()
  }

  fun createDataChannel(): WebRTCDataChannel {
    TODO()
  }

  fun createOffer(): Error {
    TODO()
  }

  fun getConnectionState(): ConnectionState {
    TODO()
  }

  fun initialize(): Error {
    TODO()
  }

  fun poll(): Error {
    TODO()
  }

  fun setLocalDescription(): Error {
    TODO()
  }

  fun setRemoteDescription(): Error {
    TODO()
  }

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
      requireNotNull(fnPtr) { "No instance found for singleton WebRTCPeerConnection" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebRTCPeerConnection(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for WebRTCPeerConnection
     */
    private object __method_bind {
      val add_ice_candidate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "add_ice_candidate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_ice_candidate" }
            }
          }

      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val create_data_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "create_data_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_data_channel" }
            }
          }

      val create_offer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "create_offer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_offer" }
            }
          }

      val get_connection_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "get_connection_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_state" }
            }
          }

      val initialize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "initialize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method initialize" }
            }
          }

      val poll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "poll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method poll" }
            }
          }

      val set_local_description: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "set_local_description".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_local_description" }
            }
          }

      val set_remote_description: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "set_remote_description".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_remote_description" }
            }
          }
    }
  }
}
