// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeerSSL internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  fun acceptStream(): Error {
    TODO()
  }

  fun connectToStream(): Error {
    TODO()
  }

  fun disconnectFromStream() {
    TODO()
  }

  fun getStatus(): StreamPeerSSL.Status {
    TODO()
  }

  fun isBlockingHandshakeEnabled(): Boolean {
    TODO()
  }

  fun poll() {
    TODO()
  }

  fun setBlockingHandshakeEnabled() {
    TODO()
  }

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
      requireNotNull(fnPtr) { "No instance found for singleton StreamPeerSSL" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerSSL(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for StreamPeerSSL
     */
    private object __method_bind {
      val accept_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
              "accept_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method accept_stream" }
            }
          }

      val connect_to_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
              "connect_to_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_to_stream" }
            }
          }

      val disconnect_from_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
              "disconnect_from_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_from_stream" }
            }
          }

      val get_status: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
              "get_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_status" }
            }
          }

      val is_blocking_handshake_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
              "is_blocking_handshake_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_blocking_handshake_enabled"
              }
            }
          }

      val poll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
              "poll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method poll" }
            }
          }

      val set_blocking_handshake_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
              "set_blocking_handshake_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blocking_handshake_enabled"
              }
            }
          }
    }
  }
}
