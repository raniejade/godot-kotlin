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
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShader(
  _handle: COpaquePointer
) : Shader(_handle) {
  var graphOffset: Vector2
    get() {
       return getGraphOffset() 
    }
    set(value) {
      setGraphOffset(value)
    }

  /**
   * Specialized setter for graphOffset
   */
  fun graphOffset(cb: Vector2.() -> Unit) {
    val _p = graphOffset
    cb(_p)
    graphOffset = _p
  }

  fun addNode(
    type: Int,
    node: VisualShaderNode,
    position: Vector2,
    id: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(node))
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(id))
    __method_bind.addNode.call(this._handle, _args)
  }

  fun canConnectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    val _ret = __method_bind.canConnectNodes.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun connectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    val _ret = __method_bind.connectNodes.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun connectNodesForced(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    __method_bind.connectNodesForced.call(this._handle, _args)
  }

  fun disconnectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    __method_bind.disconnectNodes.call(this._handle, _args)
  }

  fun getGraphOffset(): Vector2 {
    val _ret = __method_bind.getGraphOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getNode(type: Int, id: Int): VisualShaderNode {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.getNode.call(this._handle, _args)
    return _ret.asObject(::VisualShaderNode)!!
  }

  fun getNodeConnections(type: Int): VariantArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getNodeConnections.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun getNodeList(type: Int): PoolIntArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getNodeList.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun getNodePosition(type: Int, id: Int): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.getNodePosition.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun getValidNodeId(type: Int): Int {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getValidNodeId.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun isNodeConnection(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(fromNode))
    _args.add(Variant.fromAny(fromPort))
    _args.add(Variant.fromAny(toNode))
    _args.add(Variant.fromAny(toPort))
    val _ret = __method_bind.isNodeConnection.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun removeNode(type: Int, id: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(id))
    __method_bind.removeNode.call(this._handle, _args)
  }

  fun setGraphOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setGraphOffset.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setNodePosition(
    type: Int,
    id: Int,
    position: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(position))
    __method_bind.setNodePosition.call(this._handle, _args)
  }

  enum class Type(
    val value: Int
  ) {
    VERTEX(0),

    FRAGMENT(1),

    LIGHT(2),

    MAX(3);

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
      val addNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val canConnectNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "can_connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_connect_nodes" }
        }
      val connectNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
        }
      val connectNodesForced: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "connect_nodes_forced".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes_forced" }
        }
      val disconnectNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "disconnect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
        }
      val getGraphOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val getNodeConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_connections" }
        }
      val getNodeList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_list" }
        }
      val getNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_position" }
        }
      val getValidNodeId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_valid_node_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_valid_node_id" }
        }
      val isNodeConnection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "is_node_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_connection" }
        }
      val removeNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }
      val setGraphOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_position" }
        }}
  }
}
