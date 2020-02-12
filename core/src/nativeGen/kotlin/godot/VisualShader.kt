// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class VisualShader(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shader(null) {
  var graphOffset: Vector2
    get() {
       return getGraphOffset() 
    }
    set(value) {
      setGraphOffset(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(node)
      _args.add(position)
      _args.add(id)
      __method_bind.addNode.call(self._handle, _args, null)
    }
  }

  fun canConnectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.canConnectNodes.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun connectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.connectNodes.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun connectNodesForced(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.connectNodesForced.call(self._handle, _args, null)
    }
  }

  fun disconnectNodes(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.disconnectNodes.call(self._handle, _args, null)
    }
  }

  fun getGraphOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getGraphOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNode(type: Int, id: Int): VisualShaderNode {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VisualShaderNode
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(id)
      __method_bind.getNode.call(self._handle, _args, _retPtr)
      _ret = objectToType<VisualShaderNode>(_tmp.value!!)
      _ret
    }
  }

  fun getNodeConnections(type: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeConnections.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodeList(type: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeList.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodePosition(type: Int, id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(id)
      __method_bind.getNodePosition.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getValidNodeId(type: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getValidNodeId.call(self._handle, listOf(type), _retPtr)
      _ret.value
    }
  }

  fun isNodeConnection(
    type: Int,
    fromNode: Int,
    fromPort: Int,
    toNode: Int,
    toPort: Int
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(fromNode)
      _args.add(fromPort)
      _args.add(toNode)
      _args.add(toPort)
      __method_bind.isNodeConnection.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun removeNode(type: Int, id: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(id)
      __method_bind.removeNode.call(self._handle, _args, null)
    }
  }

  fun setGraphOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGraphOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setNodePosition(
    type: Int,
    id: Int,
    position: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(id)
      _args.add(position)
      __method_bind.setNodePosition.call(self._handle, _args, null)
    }
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

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShader
     */
    private object __method_bind {
      val addNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val canConnectNodes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "can_connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_connect_nodes" }
        }
      val connectNodes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "connect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes" }
        }
      val connectNodesForced: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "connect_nodes_forced".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_nodes_forced" }
        }
      val disconnectNodes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "disconnect_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_nodes" }
        }
      val getGraphOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val getNodeConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_connections" }
        }
      val getNodeList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_list" }
        }
      val getNodePosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_position" }
        }
      val getValidNodeId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "get_valid_node_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_valid_node_id" }
        }
      val isNodeConnection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "is_node_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_connection" }
        }
      val removeNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }
      val setGraphOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setNodePosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShader".cstr.ptr,
            "set_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_position" }
        }}
  }
}
