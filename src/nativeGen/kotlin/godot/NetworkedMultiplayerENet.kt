// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class NetworkedMultiplayerENet internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  fun closeConnection(waitUsec: Int) {
    val _arg = Variant.new(waitUsec)
    __method_bind.close_connection.call(this.toVariant(), _arg, 1)
  }

  fun createClient(
    address: String,
    port: Int,
    inBandwidth: Int,
    outBandwidth: Int,
    clientPort: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(address)
    _args.append(port)
    _args.append(inBandwidth)
    _args.append(outBandwidth)
    _args.append(clientPort)
    val _ret = __method_bind.create_client.call(this.toVariant(), _args.toVariant(), 5)
    return GDError.from(_ret.asInt())
  }

  fun createServer(
    port: Int,
    maxClients: Int,
    inBandwidth: Int,
    outBandwidth: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(maxClients)
    _args.append(inBandwidth)
    _args.append(outBandwidth)
    val _ret = __method_bind.create_server.call(this.toVariant(), _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun disconnectPeer(id: Int, now: Boolean) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(now)
    __method_bind.disconnect_peer.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun getChannelCount(): Int {
    val _ret = __method_bind.get_channel_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCompressionMode(): CompressionMode {
    val _ret = __method_bind.get_compression_mode.call(this.toVariant())
    return NetworkedMultiplayerENet.CompressionMode.from(_ret.asInt())
  }

  fun getLastPacketChannel(): Int {
    val _ret = __method_bind.get_last_packet_channel.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPacketChannel(): Int {
    val _ret = __method_bind.get_packet_channel.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPeerAddress(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.get_peer_address.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getPeerPort(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.get_peer_port.call(this.toVariant(), _arg, 1)
    return _ret.asInt()
  }

  fun getTransferChannel(): Int {
    val _ret = __method_bind.get_transfer_channel.call(this.toVariant())
    return _ret.asInt()
  }

  fun isAlwaysOrdered(): Boolean {
    val _ret = __method_bind.is_always_ordered.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAlwaysOrdered(ordered: Boolean) {
    val _arg = Variant.new(ordered)
    __method_bind.set_always_ordered.call(this.toVariant(), _arg, 1)
  }

  fun setBindIp(ip: String) {
    val _arg = Variant.new(ip)
    __method_bind.set_bind_ip.call(this.toVariant(), _arg, 1)
  }

  fun setChannelCount(channels: Int) {
    val _arg = Variant.new(channels)
    __method_bind.set_channel_count.call(this.toVariant(), _arg, 1)
  }

  fun setCompressionMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_compression_mode.call(this.toVariant(), _arg, 1)
  }

  fun setTransferChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.set_transfer_channel.call(this.toVariant(), _arg, 1)
  }

  enum class CompressionMode(
    val value: Int
  ) {
    COMPRESS_NONE(0),

    COMPRESS_RANGE_CODER(1),

    COMPRESS_FASTLZ(2),

    COMPRESS_ZLIB(3),

    COMPRESS_ZSTD(4);

    companion object {
      fun from(value: Int): CompressionMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
      requireNotNull(fnPtr) { "No instance found for NetworkedMultiplayerENet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NetworkedMultiplayerENet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NetworkedMultiplayerENet = NetworkedMultiplayerENet(ptr)
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
