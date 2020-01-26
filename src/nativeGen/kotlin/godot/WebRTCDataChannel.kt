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

open class WebRTCDataChannel internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun close() {
    TODO()
  }

  fun getId(): Int {
    TODO()
  }

  fun getLabel(): String {
    TODO()
  }

  fun getMaxPacketLifeTime(): Int {
    TODO()
  }

  fun getMaxRetransmits(): Int {
    TODO()
  }

  fun getProtocol(): String {
    TODO()
  }

  fun getReadyState(): ChannelState {
    TODO()
  }

  fun getWriteMode(): WriteMode {
    TODO()
  }

  fun isNegotiated(): Boolean {
    TODO()
  }

  fun isOrdered(): Boolean {
    TODO()
  }

  fun poll(): Error {
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

  enum class ChannelState(
    val value: Int
  ) {
    STATE_CONNECTING(0),

    STATE_OPEN(1),

    STATE_CLOSING(2),

    STATE_CLOSED(3);
  }

  companion object {
    val STATE_CLOSED: Int = 3

    val STATE_CLOSING: Int = 2

    val STATE_CONNECTING: Int = 0

    val STATE_OPEN: Int = 1

    val WRITE_MODE_BINARY: Int = 1

    val WRITE_MODE_TEXT: Int = 0

    /**
     * Container for method_bind pointers for WebRTCDataChannel
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val get_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "get_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_id" }
            }
          }

      val get_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "get_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_label" }
            }
          }

      val get_max_packet_life_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "get_max_packet_life_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_packet_life_time" }
            }
          }

      val get_max_retransmits: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "get_max_retransmits".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_retransmits" }
            }
          }

      val get_protocol: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "get_protocol".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_protocol" }
            }
          }

      val get_ready_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "get_ready_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ready_state" }
            }
          }

      val get_write_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "get_write_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_write_mode" }
            }
          }

      val is_negotiated: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "is_negotiated".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_negotiated" }
            }
          }

      val is_ordered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "is_ordered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_ordered" }
            }
          }

      val poll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "poll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method poll" }
            }
          }

      val set_write_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "set_write_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_write_mode" }
            }
          }

      val was_string_packet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
              "was_string_packet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method was_string_packet" }
            }
          }
    }
  }
}
