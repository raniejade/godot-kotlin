// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Variant
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
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(node)
    _args.append(position)
    _args.append(id)
    __method_bind.add_node.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun canConnectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    val _ret = __method_bind.can_connect_nodes.call(this.toVariant(), _args.toVariant(), 5)
    return _ret.asBool()
  }

  fun connectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    val _ret = __method_bind.connect_nodes.call(this.toVariant(), _args.toVariant(), 5)
    return GDError.from(_ret.asInt())
  }

  fun connectNodesForced(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    __method_bind.connect_nodes_forced.call(this.toVariant(), _args.toVariant(), 5)
  }

  fun disconnectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    __method_bind.disconnect_nodes.call(this.toVariant(), _args.toVariant(), 5)
  }

  fun getGraphOffset(): Vector2 {
    val _ret = __method_bind.get_graph_offset.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getNode(type: Int, id: Int): VisualShaderNode {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(id)
    val _ret = __method_bind.get_node.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asObject(::VisualShaderNode)!!
  }

  fun getNodeConnections(type: Int): VariantArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_node_connections.call(this.toVariant(), _arg, 1)
    return _ret.asArray()
  }

  fun getNodeList(type: Int): PoolIntArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_node_list.call(this.toVariant(), _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getNodePosition(type: Int, id: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(id)
    val _ret = __method_bind.get_node_position.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun getValidNodeId(type: Int): Int {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_valid_node_id.call(this.toVariant(), _arg, 1)
    return _ret.asInt()
  }

  fun isNodeConnection(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(fromNode)
    _args.append(fromPort)
    _args.append(toNode)
    _args.append(toPort)
    val _ret = __method_bind.is_node_connection.call(this.toVariant(), _args.toVariant(), 5)
    return _ret.asBool()
  }

  fun rebuild() {
    __method_bind.rebuild.call(this.toVariant())
  }

  fun removeNode(type: Int, id: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(id)
    __method_bind.remove_node.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setGraphOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.set_graph_offset.call(this.toVariant(), _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_mode.call(this.toVariant(), _arg, 1)
  }

  fun setNodePosition(
    type: Int,
    id: Int,
    position: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(id)
    _args.append(position)
    __method_bind.set_node_position.call(this.toVariant(), _args.toVariant(), 3)
  }

  enum class Type(
    val value: Int
  ) {
    TYPE_VERTEX(0),

    TYPE_FRAGMENT(1),

    TYPE_LIGHT(2),

    TYPE_MAX(3);

    companion object {
      fun from(value: Int): Type {
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
    val NODE_ID_INVALID: Int = -1

    val NODE_ID_OUTPUT: Int = 0

    val TYPE_FRAGMENT: Int = 1

    val TYPE_LIGHT: Int = 2

    val TYPE_MAX: Int = 3

    val TYPE_VERTEX: Int = 0

    fun new(): VisualShader = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShader(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShader = VisualShader(ptr)
    /**
     * Container for method_bind pointers for VisualShader
     */
    private object __method_bind {
      val add_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val can_connect_nodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "can_connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_connect_nodes" }
        }
      val connect_nodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
        }
      val connect_nodes_forced: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "connect_nodes_forced".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes_forced" }
        }
      val disconnect_nodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "disconnect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
        }
      val get_graph_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
        }
      val get_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val get_node_connections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_connections" }
        }
      val get_node_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_list" }
        }
      val get_node_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_position" }
        }
      val get_valid_node_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_valid_node_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_valid_node_id" }
        }
      val is_node_connection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "is_node_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_connection" }
        }
      val rebuild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "rebuild".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rebuild" }
        }
      val remove_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }
      val set_graph_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
        }
      val set_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val set_node_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_position" }
        }}
  }
}
