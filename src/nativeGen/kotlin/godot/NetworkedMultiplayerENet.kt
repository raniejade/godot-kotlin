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

open class NetworkedMultiplayerENet(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
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

  var compressionMode: Int
    get() {
       return NetworkedMultiplayerENet.CompressionMode.from(getCompressionMode()) 
    }
    set(value) {
      setCompressionMode(NetworkedMultiplayerENet.CompressionMode.from(value))
    }

  var transferChannel: Int
    get() {
       return getTransferChannel() 
    }
    set(value) {
      setTransferChannel(value)
    }

  fun closeConnection(waitUsec: Int) {
    val _arg = Variant.new(waitUsec)
    __method_bind.closeConnection.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.createClient.call(this._handle, _args.toVariant(), 5)
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
    val _ret = __method_bind.createServer.call(this._handle, _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun disconnectPeer(id: Int, now: Boolean) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(now)
    __method_bind.disconnectPeer.call(this._handle, _args.toVariant(), 2)
  }

  fun getChannelCount(): Int {
    val _ret = __method_bind.getChannelCount.call(this._handle)
    return _ret.asInt()
  }

  fun getCompressionMode(): CompressionMode {
    val _ret = __method_bind.getCompressionMode.call(this._handle)
    return NetworkedMultiplayerENet.CompressionMode.from(_ret.asInt())
  }

  fun getLastPacketChannel(): Int {
    val _ret = __method_bind.getLastPacketChannel.call(this._handle)
    return _ret.asInt()
  }

  fun getPacketChannel(): Int {
    val _ret = __method_bind.getPacketChannel.call(this._handle)
    return _ret.asInt()
  }

  fun getPeerAddress(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPeerAddress.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getPeerPort(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPeerPort.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getTransferChannel(): Int {
    val _ret = __method_bind.getTransferChannel.call(this._handle)
    return _ret.asInt()
  }

  fun isAlwaysOrdered(): Boolean {
    val _ret = __method_bind.isAlwaysOrdered.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAlwaysOrdered(ordered: Boolean) {
    val _arg = Variant.new(ordered)
    __method_bind.setAlwaysOrdered.call(this._handle, _arg, 1)
  }

  fun setBindIp(ip: String) {
    val _arg = Variant.new(ip)
    __method_bind.setBindIp.call(this._handle, _arg, 1)
  }

  fun setChannelCount(channels: Int) {
    val _arg = Variant.new(channels)
    __method_bind.setChannelCount.call(this._handle, _arg, 1)
  }

  fun setCompressionMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setCompressionMode.call(this._handle, _arg, 1)
  }

  fun setTransferChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.setTransferChannel.call(this._handle, _arg, 1)
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
      val closeConnection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "closeConnection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method closeConnection" }
        }
      val createClient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "createClient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createClient" }
        }
      val createServer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "createServer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createServer" }
        }
      val disconnectPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "disconnectPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnectPeer" }
        }
      val getChannelCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "getChannelCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getChannelCount" }
        }
      val getCompressionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "getCompressionMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCompressionMode" }
        }
      val getLastPacketChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "getLastPacketChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLastPacketChannel" }
        }
      val getPacketChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "getPacketChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPacketChannel" }
        }
      val getPeerAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "getPeerAddress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeerAddress" }
        }
      val getPeerPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "getPeerPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeerPort" }
        }
      val getTransferChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "getTransferChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransferChannel" }
        }
      val isAlwaysOrdered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "isAlwaysOrdered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAlwaysOrdered" }
        }
      val setAlwaysOrdered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "setAlwaysOrdered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlwaysOrdered" }
        }
      val setBindIp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "setBindIp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBindIp" }
        }
      val setChannelCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "setChannelCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setChannelCount" }
        }
      val setCompressionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "setCompressionMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCompressionMode" }
        }
      val setTransferChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerENet".cstr.ptr,
            "setTransferChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransferChannel" }
        }}
  }
}
