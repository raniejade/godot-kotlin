// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShader internal constructor(
  _handle: COpaquePointer
) : Shader(_handle) {
  fun addNode(
    type: Int,
    node: VisualShaderNode,
    position: Vector2,
    id: Int
  ) {
    TODO()
  }

  fun canConnectNodes(
    type: Int,
    from_node: Int,
    from_port: Int,
    to_node: Int,
    to_port: Int
  ): Boolean {
    TODO()
  }

  fun connectNodes(
    type: Int,
    from_node: Int,
    from_port: Int,
    to_node: Int,
    to_port: Int
  ): Error {
    TODO()
  }

  fun connectNodesForced(
    type: Int,
    from_node: Int,
    from_port: Int,
    to_node: Int,
    to_port: Int
  ) {
    TODO()
  }

  fun disconnectNodes(
    type: Int,
    from_node: Int,
    from_port: Int,
    to_node: Int,
    to_port: Int
  ) {
    TODO()
  }

  fun getGraphOffset(): Vector2 {
    TODO()
  }

  fun getNode(type: Int, id: Int): VisualShaderNode {
    TODO()
  }

  fun getNodeConnections(type: Int): VariantArray {
    TODO()
  }

  fun getNodeList(type: Int): PoolIntArray {
    TODO()
  }

  fun getNodePosition(type: Int, id: Int): Vector2 {
    TODO()
  }

  fun getValidNodeId(type: Int): Int {
    TODO()
  }

  fun isNodeConnection(
    type: Int,
    from_node: Int,
    from_port: Int,
    to_node: Int,
    to_port: Int
  ): Boolean {
    TODO()
  }

  fun rebuild() {
    TODO()
  }

  fun removeNode(type: Int, id: Int) {
    TODO()
  }

  fun setGraphOffset(offset: Vector2) {
    TODO()
  }

  fun setMode(mode: Int) {
    TODO()
  }

  fun setNodePosition(
    type: Int,
    id: Int,
    position: Vector2
  ) {
    TODO()
  }

  enum class Type(
    val value: Int
  ) {
    TYPE_VERTEX(0),

    TYPE_FRAGMENT(1),

    TYPE_LIGHT(2),

    TYPE_MAX(3);
  }

  companion object {
    val NODE_ID_INVALID: Int = -1

    val NODE_ID_OUTPUT: Int = 0

    val TYPE_FRAGMENT: Int = 1

    val TYPE_LIGHT: Int = 2

    val TYPE_MAX: Int = 3

    val TYPE_VERTEX: Int = 0

    fun new(): VisualShader = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShader(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualShader
     */
    private object __method_bind {
      val add_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val can_connect_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "can_connect_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_connect_nodes" }
            }
          }

      val connect_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "connect_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
            }
          }

      val connect_nodes_forced: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "connect_nodes_forced".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_nodes_forced" }
            }
          }

      val disconnect_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "disconnect_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
            }
          }

      val get_graph_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "get_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
            }
          }

      val get_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val get_node_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "get_node_connections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_connections" }
            }
          }

      val get_node_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "get_node_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_list" }
            }
          }

      val get_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "get_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_position" }
            }
          }

      val get_valid_node_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "get_valid_node_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_valid_node_id" }
            }
          }

      val is_node_connection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "is_node_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_node_connection" }
            }
          }

      val rebuild: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "rebuild".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rebuild" }
            }
          }

      val remove_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val set_graph_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "set_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
              "set_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_position" }
            }
          }
    }
  }
}
