// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
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

open class AnimationNodeBlendTree(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AnimationRootNode(null) {
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

  open fun _node_changed(node: String) {
    TODO()
  }

  open fun _tree_changed() {
    TODO()
  }

  fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2 = Vector2(0, 0)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(node)
      _args.add(position)
      __method_bind.addNode.call(self._handle, _args, null)
    }
  }

  fun connectNode(
    inputNode: String,
    inputIndex: Int,
    outputNode: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(inputNode)
      _args.add(inputIndex)
      _args.add(outputNode)
      __method_bind.connectNode.call(self._handle, _args, null)
    }
  }

  fun disconnectNode(inputNode: String, inputIndex: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(inputNode)
      _args.add(inputIndex)
      __method_bind.disconnectNode.call(self._handle, _args, null)
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

  fun getNode(name: String): AnimationNode {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AnimationNode
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNode.call(self._handle, listOf(name), _retPtr)
      _ret = objectToType<AnimationNode>(_tmp.value!!)
      _ret
    }
  }

  fun getNodePosition(name: String): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodePosition.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasNode(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasNode.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun removeNode(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeNode.call(self._handle, listOf(name), null)
    }
  }

  fun renameNode(name: String, newName: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(newName)
      __method_bind.renameNode.call(self._handle, _args, null)
    }
  }

  fun setGraphOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGraphOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setNodePosition(name: String, position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(position)
      __method_bind.setNodePosition.call(self._handle, _args, null)
    }
  }

  companion object {
    val CONNECTION_ERROR_CONNECTION_EXISTS: Int = 5

    val CONNECTION_ERROR_NO_INPUT: Int = 1

    val CONNECTION_ERROR_NO_INPUT_INDEX: Int = 2

    val CONNECTION_ERROR_NO_OUTPUT: Int = 3

    val CONNECTION_ERROR_SAME_NODE: Int = 4

    val CONNECTION_OK: Int = 0

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeBlendTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationNodeBlendTree
     */
    private object __method_bind {
      val addNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val connectNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "connect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_node" }
            }
          }

      val disconnectNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "disconnect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_node" }
            }
          }

      val getGraphOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "get_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
            }
          }

      val getNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val getNodePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "get_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_position" }
            }
          }

      val hasNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "has_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node" }
            }
          }

      val removeNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val renameNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "rename_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_node" }
            }
          }

      val setGraphOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "set_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
            }
          }

      val setNodePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "set_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_position" }
            }
          }
    }
  }
}
