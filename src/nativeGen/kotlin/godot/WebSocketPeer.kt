// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebSocketPeer internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun close() {
    TODO()
  }

  fun getConnectedHost(): String {
    TODO()
  }

  fun getConnectedPort(): Int {
    TODO()
  }

  fun getWriteMode(): WriteMode {
    TODO()
  }

  fun isConnectedToHost(): Boolean {
    TODO()
  }

  fun setWriteMode() {
    TODO()
  }

  fun wasStringPacket(): Boolean {
    TODO()
  }

  enum class WriteMode(
    val value: Int
  ) {
    WRITE_MODE_TEXT(0),

    WRITE_MODE_BINARY(1);
  }

  companion object {
    val WRITE_MODE_BINARY: Int = 1

    val WRITE_MODE_TEXT: Int = 0

    fun new(): WebSocketPeer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketPeer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WebSocketPeer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebSocketPeer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for WebSocketPeer
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val get_connected_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
              "get_connected_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
            }
          }

      val get_connected_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
              "get_connected_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
            }
          }

      val get_write_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
              "get_write_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_write_mode" }
            }
          }

      val is_connected_to_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
              "is_connected_to_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_connected_to_host" }
            }
          }

      val set_write_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
              "set_write_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_write_mode" }
            }
          }

      val was_string_packet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
              "was_string_packet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method was_string_packet" }
            }
          }
    }
  }
}
