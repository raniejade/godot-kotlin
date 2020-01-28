// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NetworkedMultiplayerPeer(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  var refuseNewConnections: Boolean
    get() {
       return isRefusingNewConnections() 
    }
    set(value) {
      setRefuseNewConnections(value)
    }

  var transferMode: Int
    get() {
       return NetworkedMultiplayerPeer.TransferMode.from(getTransferMode()) 
    }
    set(value) {
      setTransferMode(NetworkedMultiplayerPeer.TransferMode.from(value))
    }

  fun getConnectionStatus(): ConnectionStatus {
    val _ret = __method_bind.getConnectionStatus.call(this._handle)
    return NetworkedMultiplayerPeer.ConnectionStatus.from(_ret.asInt())
  }

  fun getPacketPeer(): Int {
    val _ret = __method_bind.getPacketPeer.call(this._handle)
    return _ret.asInt()
  }

  fun getTransferMode(): TransferMode {
    val _ret = __method_bind.getTransferMode.call(this._handle)
    return NetworkedMultiplayerPeer.TransferMode.from(_ret.asInt())
  }

  fun getUniqueId(): Int {
    val _ret = __method_bind.getUniqueId.call(this._handle)
    return _ret.asInt()
  }

  fun isRefusingNewConnections(): Boolean {
    val _ret = __method_bind.isRefusingNewConnections.call(this._handle)
    return _ret.asBoolean()
  }

  fun poll() {
    __method_bind.poll.call(this._handle)
  }

  fun setRefuseNewConnections(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setRefuseNewConnections.call(this._handle, _arg, 1)
  }

  fun setTargetPeer(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.setTargetPeer.call(this._handle, _arg, 1)
  }

  fun setTransferMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setTransferMode.call(this._handle, _arg, 1)
  }

  enum class ConnectionStatus(
    val value: Int
  ) {
    CONNECTION_DISCONNECTED(0),

    CONNECTION_CONNECTING(1),

    CONNECTION_CONNECTED(2);

    companion object {
      fun from(value: Int): ConnectionStatus {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TransferMode(
    val value: Int
  ) {
    TRANSFER_MODE_UNRELIABLE(0),

    TRANSFER_MODE_UNRELIABLE_ORDERED(1),

    TRANSFER_MODE_RELIABLE(2);

    companion object {
      fun from(value: Int): TransferMode {
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
    val CONNECTION_CONNECTED: Int = 2

    val CONNECTION_CONNECTING: Int = 1

    val CONNECTION_DISCONNECTED: Int = 0

    val TARGET_PEER_BROADCAST: Int = 0

    val TARGET_PEER_SERVER: Int = 1

    val TRANSFER_MODE_RELIABLE: Int = 2

    val TRANSFER_MODE_UNRELIABLE: Int = 0

    val TRANSFER_MODE_UNRELIABLE_ORDERED: Int = 1

    /**
     * Container for method_bind pointers for NetworkedMultiplayerPeer
     */
    private object __method_bind {
      val getConnectionStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "getConnectionStatus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionStatus" }
        }
      val getPacketPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "getPacketPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPacketPeer" }
        }
      val getTransferMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "getTransferMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransferMode" }
        }
      val getUniqueId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "getUniqueId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUniqueId" }
        }
      val isRefusingNewConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "isRefusingNewConnections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRefusingNewConnections" }
        }
      val poll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val setRefuseNewConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "setRefuseNewConnections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRefuseNewConnections" }
        }
      val setTargetPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "setTargetPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTargetPeer" }
        }
      val setTransferMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "setTransferMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransferMode" }
        }}
  }
}
