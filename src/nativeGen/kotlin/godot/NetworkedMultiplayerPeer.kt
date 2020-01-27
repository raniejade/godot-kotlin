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

open class NetworkedMultiplayerPeer internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun getConnectionStatus(): ConnectionStatus {
    val _ret = __method_bind.get_connection_status.call(this._handle)
    return NetworkedMultiplayerPeer.ConnectionStatus.from(_ret.asInt())
  }

  fun getPacketPeer(): Int {
    val _ret = __method_bind.get_packet_peer.call(this._handle)
    return _ret.asInt()
  }

  fun getTransferMode(): TransferMode {
    val _ret = __method_bind.get_transfer_mode.call(this._handle)
    return NetworkedMultiplayerPeer.TransferMode.from(_ret.asInt())
  }

  fun getUniqueId(): Int {
    val _ret = __method_bind.get_unique_id.call(this._handle)
    return _ret.asInt()
  }

  fun isRefusingNewConnections(): Boolean {
    val _ret = __method_bind.is_refusing_new_connections.call(this._handle)
    return _ret.asBool()
  }

  fun poll() {
    __method_bind.poll.call(this._handle)
  }

  fun setRefuseNewConnections(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_refuse_new_connections.call(this._handle, _arg, 1)
  }

  fun setTargetPeer(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.set_target_peer.call(this._handle, _arg, 1)
  }

  fun setTransferMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_transfer_mode.call(this._handle, _arg, 1)
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
      val get_connection_status: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_connection_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_status" }
        }
      val get_packet_peer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_packet_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_peer" }
        }
      val get_transfer_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_transfer_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transfer_mode" }
        }
      val get_unique_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unique_id" }
        }
      val is_refusing_new_connections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "is_refusing_new_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_refusing_new_connections" }
        }
      val poll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val set_refuse_new_connections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_refuse_new_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refuse_new_connections" }
        }
      val set_target_peer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_target_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_peer" }
        }
      val set_transfer_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_transfer_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transfer_mode" }
        }}
  }
}
