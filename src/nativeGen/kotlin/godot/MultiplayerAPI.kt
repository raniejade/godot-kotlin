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

open class MultiplayerAPI internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
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
    /**
     * Container for method_bind pointers for MultiplayerAPI
     */
    private object __method_bind {
      val _add_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "_add_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _add_peer" }
            }
          }

      val _connected_to_server: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "_connected_to_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _connected_to_server" }
            }
          }

      val _connection_failed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "_connection_failed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _connection_failed" }
            }
          }

      val _del_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "_del_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _del_peer" }
            }
          }

      val _server_disconnected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
              "_server_disconnected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _server_disconnected" }
            }
          }

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
