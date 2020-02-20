// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getConnectionStatus(): ConnectionStatus {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionStatus.call(self._handle, emptyList(), _retPtr)
      NetworkedMultiplayerPeer.ConnectionStatus.from(_ret.value)
    }
  }

  fun getPacketPeer(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPacketPeer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTransferMode(): TransferMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTransferMode.call(self._handle, emptyList(), _retPtr)
      NetworkedMultiplayerPeer.TransferMode.from(_ret.value)
    }
  }

  fun getUniqueId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUniqueId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRefusingNewConnections(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRefusingNewConnections.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun poll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.poll.call(self._handle, emptyList(), null)
    }
  }

  fun setRefuseNewConnections(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRefuseNewConnections.call(self._handle, listOf(enable), null)
    }
  }

  fun setTargetPeer(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTargetPeer.call(self._handle, listOf(id), null)
    }
  }

  fun setTransferMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransferMode.call(self._handle, listOf(mode), null)
    }
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_connection_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_status" }
        }
      val getPacketPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_packet_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_peer" }
        }
      val getTransferMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_transfer_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transfer_mode" }
        }
      val getUniqueId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "get_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unique_id" }
        }
      val isRefusingNewConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "is_refusing_new_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_refusing_new_connections" }
        }
      val poll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val setRefuseNewConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_refuse_new_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refuse_new_connections" }
        }
      val setTargetPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_target_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_peer" }
        }
      val setTransferMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NetworkedMultiplayerPeer".cstr.ptr,
            "set_transfer_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transfer_mode" }
        }}
  }
}
