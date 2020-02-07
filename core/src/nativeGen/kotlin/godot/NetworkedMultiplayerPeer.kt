// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NetworkedMultiplayerPeer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PacketPeer(null) {
  var refuseNewConnections: Boolean
    get() {
       return isRefusingNewConnections() 
    }
    set(value) {
      setRefuseNewConnections(value)
    }

  var transferMode: TransferMode
    get() {
       return getTransferMode() 
    }
    set(value) {
      setTransferMode(value.value)
    }

  /**
   * NetworkedMultiplayerPeer::connection_failed signal
   */
  val signalConnectionFailed: Signal0 = Signal0("connection_failed")

  /**
   * NetworkedMultiplayerPeer::connection_succeeded signal
   */
  val signalConnectionSucceeded: Signal0 = Signal0("connection_succeeded")

  /**
   * NetworkedMultiplayerPeer::peer_connected signal
   */
  val signalPeerConnected: Signal1<Int> = Signal1("peer_connected")

  /**
   * NetworkedMultiplayerPeer::peer_disconnected signal
   */
  val signalPeerDisconnected: Signal1<Int> = Signal1("peer_disconnected")

  /**
   * NetworkedMultiplayerPeer::server_disconnected signal
   */
  val signalServerDisconnected: Signal0 = Signal0("server_disconnected")

  constructor() : this(null) {
    _handle = __new()
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
    val _arg = Variant(enable)
    __method_bind.setRefuseNewConnections.call(this._handle, listOf(_arg))
  }

  fun setTargetPeer(id: Int) {
    val _arg = Variant(id)
    __method_bind.setTargetPeer.call(this._handle, listOf(_arg))
  }

  fun setTransferMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setTransferMode.call(this._handle, listOf(_arg))
  }

  enum class ConnectionStatus(
    val value: Int
  ) {
    DISCONNECTED(0),

    CONNECTING(1),

    CONNECTED(2);

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
    UNRELIABLE(0),

    UNRELIABLE_ORDERED(1),

    RELIABLE(2);

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
    val TARGET_PEER_BROADCAST: Int = 0

    val TARGET_PEER_SERVER: Int = 1

    /**
     * Container for method_bind pointers for NetworkedMultiplayerPeer
     */
    private object __method_bind {
      val getConnectionStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_connection_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_status" }
        }
      val getPacketPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_packet_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_peer" }
        }
      val getTransferMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_transfer_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transfer_mode" }
        }
      val getUniqueId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unique_id" }
        }
      val isRefusingNewConnections: CPointer<godot_method_bind>
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
      val setRefuseNewConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_refuse_new_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refuse_new_connections" }
        }
      val setTargetPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_target_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_peer" }
        }
      val setTransferMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_transfer_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transfer_mode" }
        }}
  }
}
