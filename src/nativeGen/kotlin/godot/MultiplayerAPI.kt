// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolIntArray
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

open class MultiplayerAPI(
  _handle: COpaquePointer
) : Reference(_handle) {
  var allowObjectDecoding: Boolean
    get() {
       return isObjectDecodingAllowed() 
    }
    set(value) {
      setAllowObjectDecoding(value)
    }

  var networkPeer: NetworkedMultiplayerPeer
    get() {
       return getNetworkPeer() 
    }
    set(value) {
      setNetworkPeer(value)
    }

  var refuseNewNetworkConnections: Boolean
    get() {
       return isRefusingNewNetworkConnections() 
    }
    set(value) {
      setRefuseNewNetworkConnections(value)
    }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getNetworkConnectedPeers(): PoolIntArray {
    val _ret = __method_bind.getNetworkConnectedPeers.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val _ret = __method_bind.getNetworkPeer.call(this._handle)
    return _ret.asObject(::NetworkedMultiplayerPeer)!!
  }

  fun getNetworkUniqueId(): Int {
    val _ret = __method_bind.getNetworkUniqueId.call(this._handle)
    return _ret.asInt()
  }

  fun getRpcSenderId(): Int {
    val _ret = __method_bind.getRpcSenderId.call(this._handle)
    return _ret.asInt()
  }

  fun hasNetworkPeer(): Boolean {
    val _ret = __method_bind.hasNetworkPeer.call(this._handle)
    return _ret.asBoolean()
  }

  fun isNetworkServer(): Boolean {
    val _ret = __method_bind.isNetworkServer.call(this._handle)
    return _ret.asBoolean()
  }

  fun isObjectDecodingAllowed(): Boolean {
    val _ret = __method_bind.isObjectDecodingAllowed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRefusingNewNetworkConnections(): Boolean {
    val _ret = __method_bind.isRefusingNewNetworkConnections.call(this._handle)
    return _ret.asBoolean()
  }

  fun poll() {
    __method_bind.poll.call(this._handle)
  }

  fun sendBytes(
    bytes: PoolByteArray,
    id: Int = 0,
    mode: Int = 2
  ): GDError {
    val _args = VariantArray.new()
    _args.append(bytes)
    _args.append(id)
    _args.append(mode)
    val _ret = __method_bind.sendBytes.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAllowObjectDecoding.call(this._handle, _arg, 1)
  }

  fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val _arg = Variant.new(peer)
    __method_bind.setNetworkPeer.call(this._handle, _arg, 1)
  }

  fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val _arg = Variant.new(refuse)
    __method_bind.setRefuseNewNetworkConnections.call(this._handle, _arg, 1)
  }

  fun setRootNode(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.setRootNode.call(this._handle, _arg, 1)
  }

  enum class RPCMode(
    val value: Int
  ) {
    RPC_MODE_DISABLED(0),

    RPC_MODE_REMOTE(1),

    RPC_MODE_MASTER(2),

    RPC_MODE_PUPPET(3),

    RPC_MODE_SLAVE(3),

    RPC_MODE_REMOTESYNC(4),

    RPC_MODE_SYNC(4),

    RPC_MODE_MASTERSYNC(5),

    RPC_MODE_PUPPETSYNC(6);

    companion object {
      fun from(value: Int): RPCMode {
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
    val RPC_MODE_DISABLED: Int = 0

    val RPC_MODE_MASTER: Int = 2

    val RPC_MODE_MASTERSYNC: Int = 5

    val RPC_MODE_PUPPET: Int = 3

    val RPC_MODE_PUPPETSYNC: Int = 6

    val RPC_MODE_REMOTE: Int = 1

    val RPC_MODE_REMOTESYNC: Int = 4

    val RPC_MODE_SLAVE: Int = 3

    val RPC_MODE_SYNC: Int = 4

    fun new(): MultiplayerAPI = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiplayerAPI".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MultiplayerAPI" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiplayerAPI(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MultiplayerAPI = MultiplayerAPI(ptr)
    /**
     * Container for method_bind pointers for MultiplayerAPI
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getNetworkConnectedPeers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_network_connected_peers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_connected_peers" }
        }
      val getNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_peer" }
        }
      val getNetworkUniqueId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_network_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_unique_id" }
        }
      val getRpcSenderId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "get_rpc_sender_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rpc_sender_id" }
        }
      val hasNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "has_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_network_peer" }
        }
      val isNetworkServer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "is_network_server".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_network_server" }
        }
      val isObjectDecodingAllowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "is_object_decoding_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_object_decoding_allowed" }
        }
      val isRefusingNewNetworkConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "is_refusing_new_network_connections".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_refusing_new_network_connections" }
        }
      val poll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val sendBytes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "send_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method send_bytes" }
        }
      val setAllowObjectDecoding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_allow_object_decoding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_object_decoding" }
        }
      val setNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_network_peer" }
        }
      val setRefuseNewNetworkConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_refuse_new_network_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refuse_new_network_connections"
            }
        }
      val setRootNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "set_root_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_root_node" }
        }}
  }
}
