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

open class AnimationNodeStateMachine(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AnimationRootNode(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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

  fun addTransition(
    from: String,
    to: String,
    transition: AnimationNodeStateMachineTransition
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      _args.add(transition)
      __method_bind.addTransition.call(self._handle, _args, null)
    }
  }

  fun getEndNode(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getEndNode.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
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

  fun getNodeName(node: AnimationNode): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNodeName.call(self._handle, listOf(node), _retPtr)
      _ret.toKStringAndDestroy()
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

  fun getStartNode(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getStartNode.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getTransition(idx: Int): AnimationNodeStateMachineTransition {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AnimationNodeStateMachineTransition
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTransition.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<AnimationNodeStateMachineTransition>(_tmp.value!!)
      _ret
    }
  }

  fun getTransitionCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTransitionCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTransitionFrom(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTransitionFrom.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getTransitionTo(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTransitionTo.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
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

  fun hasTransition(from: String, to: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.hasTransition.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun removeNode(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeNode.call(self._handle, listOf(name), null)
    }
  }

  fun removeTransition(from: String, to: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      __method_bind.removeTransition.call(self._handle, _args, null)
    }
  }

  fun removeTransitionByIndex(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeTransitionByIndex.call(self._handle, listOf(idx), null)
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

  fun setEndNode(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEndNode.call(self._handle, listOf(name), null)
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

  fun setStartNode(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStartNode.call(self._handle, listOf(name), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeStateMachine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeStateMachine" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationNodeStateMachine
     */
    private object __method_bind {
      val addNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val addTransition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "add_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_transition" }
            }
          }

      val getEndNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_end_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_end_node" }
            }
          }

      val getGraphOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
            }
          }

      val getNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val getNodeName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_node_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_name" }
            }
          }

      val getNodePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_position" }
            }
          }

      val getStartNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_start_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_start_node" }
            }
          }

      val getTransition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition" }
            }
          }

      val getTransitionCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition_count" }
            }
          }

      val getTransitionFrom: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition_from".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition_from" }
            }
          }

      val getTransitionTo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition_to" }
            }
          }

      val hasNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "has_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node" }
            }
          }

      val hasTransition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "has_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_transition" }
            }
          }

      val removeNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val removeTransition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "remove_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_transition" }
            }
          }

      val removeTransitionByIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "remove_transition_by_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_transition_by_index" }
            }
          }

      val renameNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "rename_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_node" }
            }
          }

      val setEndNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_end_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_end_node" }
            }
          }

      val setGraphOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
            }
          }

      val setNodePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_position" }
            }
          }

      val setStartNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_start_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_start_node" }
            }
          }
    }
  }
}
