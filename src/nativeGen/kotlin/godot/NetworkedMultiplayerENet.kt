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

open class NetworkedMultiplayerENet internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  enum class CompressionMode(
    val value: Int
  ) {
    COMPRESS_NONE(0),

    COMPRESS_RANGE_CODER(1),

    COMPRESS_FASTLZ(2),

    COMPRESS_ZLIB(3),

    COMPRESS_ZSTD(4);
  }

  companion object {
    val COMPRESS_FASTLZ: Int = 2

    val COMPRESS_NONE: Int = 0

    val COMPRESS_RANGE_CODER: Int = 1

    val COMPRESS_ZLIB: Int = 3

    val COMPRESS_ZSTD: Int = 4

    fun new(): NetworkedMultiplayerENet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NetworkedMultiplayerENet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NetworkedMultiplayerENet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NetworkedMultiplayerENet(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for NetworkedMultiplayerENet
     */
    private object __method_bind {
      val close_connection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "close_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close_connection" }
            }
          }

      val create_client: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "create_client".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_client" }
            }
          }

      val create_server: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "create_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_server" }
            }
          }

      val disconnect_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "disconnect_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_peer" }
            }
          }

      val get_channel_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_channel_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_channel_count" }
            }
          }

      val get_compression_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_compression_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_compression_mode" }
            }
          }

      val get_last_packet_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_last_packet_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_packet_channel" }
            }
          }

      val get_packet_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_packet_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_packet_channel" }
            }
          }

      val get_peer_address: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_peer_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer_address" }
            }
          }

      val get_peer_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_peer_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer_port" }
            }
          }

      val get_transfer_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_transfer_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transfer_channel" }
            }
          }

      val is_always_ordered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "is_always_ordered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_always_ordered" }
            }
          }

      val set_always_ordered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_always_ordered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_always_ordered" }
            }
          }

      val set_bind_ip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_bind_ip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bind_ip" }
            }
          }

      val set_channel_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_channel_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_channel_count" }
            }
          }

      val set_compression_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_compression_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_compression_mode" }
            }
          }

      val set_transfer_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_transfer_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transfer_channel" }
            }
          }
    }
  }
}
