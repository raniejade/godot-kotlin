// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class NetworkedMultiplayerENet(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : NetworkedMultiplayerPeer(null) {
  var alwaysOrdered: Boolean
    get() {
       return isAlwaysOrdered() 
    }
    set(value) {
      setAlwaysOrdered(value)
    }

  var channelCount: Int
    get() {
       return getChannelCount() 
    }
    set(value) {
      setChannelCount(value)
    }

  var compressionMode: CompressionMode
    get() {
       return getCompressionMode() 
    }
    set(value) {
      setCompressionMode(value.value)
    }

  var serverRelay: Boolean
    get() {
       return isServerRelayEnabled() 
    }
    set(value) {
      setServerRelayEnabled(value)
    }

  var transferChannel: Int
    get() {
       return getTransferChannel() 
    }
    set(value) {
      setTransferChannel(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun closeConnection(waitUsec: Int = 100) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.closeConnection.call(self._handle, listOf(waitUsec), null)
    }
  }

  fun createClient(
    address: String,
    port: Int,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0,
    clientPort: Int = 0
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(address)
      _args.add(port)
      _args.add(inBandwidth)
      _args.add(outBandwidth)
      _args.add(clientPort)
      __method_bind.createClient.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun createServer(
    port: Int,
    maxClients: Int = 32,
    inBandwidth: Int = 0,
    outBandwidth: Int = 0
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(port)
      _args.add(maxClients)
      _args.add(inBandwidth)
      _args.add(outBandwidth)
      __method_bind.createServer.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun disconnectPeer(id: Int, now: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(now)
      __method_bind.disconnectPeer.call(self._handle, _args, null)
    }
  }

  fun getChannelCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getChannelCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCompressionMode(): CompressionMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCompressionMode.call(self._handle, emptyList(), _retPtr)
      NetworkedMultiplayerENet.CompressionMode.from(_ret.value)
    }
  }

  fun getLastPacketChannel(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLastPacketChannel.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPacketChannel(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPacketChannel.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPeerAddress(id: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPeerAddress.call(self._handle, listOf(id), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPeerPort(id: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPeerPort.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun getTransferChannel(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTransferChannel.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isAlwaysOrdered(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAlwaysOrdered.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isServerRelayEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isServerRelayEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAlwaysOrdered(ordered: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlwaysOrdered.call(self._handle, listOf(ordered), null)
    }
  }

  fun setBindIp(ip: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBindIp.call(self._handle, listOf(ip), null)
    }
  }

  fun setChannelCount(channels: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setChannelCount.call(self._handle, listOf(channels), null)
    }
  }

  fun setCompressionMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCompressionMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setServerRelayEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setServerRelayEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setTransferChannel(channel: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransferChannel.call(self._handle, listOf(channel), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NetworkedMultiplayerENet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NetworkedMultiplayerENet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NetworkedMultiplayerENet
     */
    private object __method_bind {
      val closeConnection: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "close_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close_connection" }
            }
          }

      val createClient: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "create_client".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_client" }
            }
          }

      val createServer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "create_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_server" }
            }
          }

      val disconnectPeer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "disconnect_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_peer" }
            }
          }

      val getChannelCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_channel_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_channel_count" }
            }
          }

      val getCompressionMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_compression_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_compression_mode" }
            }
          }

      val getLastPacketChannel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_last_packet_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_packet_channel" }
            }
          }

      val getPacketChannel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_packet_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_packet_channel" }
            }
          }

      val getPeerAddress: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_peer_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer_address" }
            }
          }

      val getPeerPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_peer_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer_port" }
            }
          }

      val getTransferChannel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "get_transfer_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transfer_channel" }
            }
          }

      val isAlwaysOrdered: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "is_always_ordered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_always_ordered" }
            }
          }

      val isServerRelayEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "is_server_relay_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_server_relay_enabled" }
            }
          }

      val setAlwaysOrdered: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_always_ordered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_always_ordered" }
            }
          }

      val setBindIp: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_bind_ip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bind_ip" }
            }
          }

      val setChannelCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_channel_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_channel_count" }
            }
          }

      val setCompressionMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_compression_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_compression_mode" }
            }
          }

      val setServerRelayEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_server_relay_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_server_relay_enabled" }
            }
          }

      val setTransferChannel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
              "set_transfer_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transfer_channel" }
            }
          }
    }
  }
}
