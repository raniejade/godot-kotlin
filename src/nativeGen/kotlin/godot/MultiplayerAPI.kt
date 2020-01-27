// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class MultiplayerAPI internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun getNetworkConnectedPeers(): PoolIntArray {
    val _ret = __method_bind.get_network_connected_peers.call(this.toVariant())
    TODO()
  }

  fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val _ret = __method_bind.get_network_peer.call(this.toVariant())
    TODO()
  }

  fun getNetworkUniqueId(): Int {
    val _ret = __method_bind.get_network_unique_id.call(this.toVariant())
    TODO()
  }

  fun getRpcSenderId(): Int {
    val _ret = __method_bind.get_rpc_sender_id.call(this.toVariant())
    TODO()
  }

  fun hasNetworkPeer(): Boolean {
    val _ret = __method_bind.has_network_peer.call(this.toVariant())
    TODO()
  }

  fun isNetworkServer(): Boolean {
    val _ret = __method_bind.is_network_server.call(this.toVariant())
    TODO()
  }

  fun isObjectDecodingAllowed(): Boolean {
    val _ret = __method_bind.is_object_decoding_allowed.call(this.toVariant())
    TODO()
  }

  fun isRefusingNewNetworkConnections(): Boolean {
    val _ret = __method_bind.is_refusing_new_network_connections.call(this.toVariant())
    TODO()
  }

  fun poll() {
    val _ret = __method_bind.poll.call(this.toVariant())
    TODO()
  }

  fun sendBytes(
    bytes: PoolByteArray,
    id: Int,
    mode: Int
  ): Error {
    val _args = VariantArray.new()
    _args.append(bytes)
    _args.append(id)
    _args.append(mode)
    val _ret = __method_bind.send_bytes.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_allow_object_decoding.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val _args = VariantArray.new()
    _args.append(peer)
    val _ret = __method_bind.set_network_peer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val _args = VariantArray.new()
    _args.append(refuse)
    val _ret = __method_bind.set_refuse_new_network_connections.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setRootNode(node: Node) {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.set_root_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton MultiplayerAPI" }
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
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_network_connected_peers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "get_network_connected_peers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_connected_peers" }
            }
          }

      val get_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "get_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_peer" }
            }
          }

      val get_network_unique_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "get_network_unique_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_unique_id" }
            }
          }

      val get_rpc_sender_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "get_rpc_sender_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rpc_sender_id" }
            }
          }

      val has_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "has_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_network_peer" }
            }
          }

      val is_network_server: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "is_network_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_network_server" }
            }
          }

      val is_object_decoding_allowed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "is_object_decoding_allowed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_object_decoding_allowed" }
            }
          }

      val is_refusing_new_network_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "is_refusing_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_refusing_new_network_connections" }
            }
          }

      val poll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "poll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method poll" }
            }
          }

      val send_bytes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "send_bytes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method send_bytes" }
            }
          }

      val set_allow_object_decoding: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "set_allow_object_decoding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_object_decoding" }
            }
          }

      val set_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "set_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_network_peer" }
            }
          }

      val set_refuse_new_network_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "set_refuse_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_refuse_new_network_connections" }
            }
          }

      val set_root_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "set_root_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_root_node" }
            }
          }
    }
  }
}
