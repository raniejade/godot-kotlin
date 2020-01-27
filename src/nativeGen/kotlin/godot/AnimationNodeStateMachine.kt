// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeStateMachine internal constructor(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(node)
    _args.append(position)
    __method_bind.add_node.call(this._handle, _args.toVariant(), 3)
  }

  fun addTransition(
    from: String,
    to: String,
    transition: AnimationNodeStateMachineTransition
  ) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(transition)
    __method_bind.add_transition.call(this._handle, _args.toVariant(), 3)
  }

  fun getEndNode(): String {
    val _ret = __method_bind.get_end_node.call(this._handle)
    return _ret.asString()
  }

  fun getGraphOffset(): Vector2 {
    val _ret = __method_bind.get_graph_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun getNode(name: String): AnimationNode {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_node.call(this._handle, _arg, 1)
    return _ret.asObject(::AnimationNode)!!
  }

  fun getNodeName(node: AnimationNode): String {
    val _arg = Variant.new(node)
    val _ret = __method_bind.get_node_name.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getNodePosition(name: String): Vector2 {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_node_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getStartNode(): String {
    val _ret = __method_bind.get_start_node.call(this._handle)
    return _ret.asString()
  }

  fun getTransition(idx: Int): AnimationNodeStateMachineTransition {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_transition.call(this._handle, _arg, 1)
    return _ret.asObject(::AnimationNodeStateMachineTransition)!!
  }

  fun getTransitionCount(): Int {
    val _ret = __method_bind.get_transition_count.call(this._handle)
    return _ret.asInt()
  }

  fun getTransitionFrom(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_transition_from.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getTransitionTo(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_transition_to.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun hasNode(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_node.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun hasTransition(from: String, to: String): Boolean {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.has_transition.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun removeNode(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_node.call(this._handle, _arg, 1)
  }

  fun removeTransition(from: String, to: String) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    __method_bind.remove_transition.call(this._handle, _args.toVariant(), 2)
  }

  fun removeTransitionByIndex(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.remove_transition_by_index.call(this._handle, _arg, 1)
  }

  fun renameNode(name: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newName)
    __method_bind.rename_node.call(this._handle, _args.toVariant(), 2)
  }

  fun setEndNode(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_end_node.call(this._handle, _arg, 1)
  }

  fun setGraphOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.set_graph_offset.call(this._handle, _arg, 1)
  }

  fun setNodePosition(name: String, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(position)
    __method_bind.set_node_position.call(this._handle, _args.toVariant(), 2)
  }

  fun setStartNode(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_start_node.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AnimationNodeStateMachine = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeStateMachine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeStateMachine" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeStateMachine(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeStateMachine = AnimationNodeStateMachine(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeStateMachine
     */
    private object __method_bind {
      val add_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "add_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_node" }
        }
      val add_transition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "add_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_transition" }
        }
      val get_end_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_end_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_end_node" }
        }
      val get_graph_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
        }
      val get_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val get_node_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_node_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_name" }
        }
      val get_node_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_position" }
        }
      val get_start_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_start_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_start_node" }
        }
      val get_transition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transition" }
        }
      val get_transition_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_transition_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transition_count" }
        }
      val get_transition_from: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_transition_from".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transition_from" }
        }
      val get_transition_to: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "get_transition_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transition_to" }
        }
      val has_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "has_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_node" }
        }
      val has_transition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "has_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_transition" }
        }
      val remove_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "remove_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_node" }
        }
      val remove_transition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "remove_transition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_transition" }
        }
      val remove_transition_by_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "remove_transition_by_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_transition_by_index" }
        }
      val rename_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "rename_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_node" }
        }
      val set_end_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "set_end_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_end_node" }
        }
      val set_graph_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "set_graph_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
        }
      val set_node_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "set_node_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_position" }
        }
      val set_start_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "set_start_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_start_node" }
        }}
  }
}
