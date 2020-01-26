// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    TODO()
  }

  fun addTransition(
    from: String,
    to: String,
    transition: AnimationNodeStateMachineTransition
  ) {
    TODO()
  }

  fun getEndNode(): String {
    TODO()
  }

  fun getGraphOffset(): Vector2 {
    TODO()
  }

  fun getNode(name: String): AnimationNode {
    TODO()
  }

  fun getNodeName(node: AnimationNode): String {
    TODO()
  }

  fun getNodePosition(name: String): Vector2 {
    TODO()
  }

  fun getStartNode(): String {
    TODO()
  }

  fun getTransition(idx: Int): AnimationNodeStateMachineTransition {
    TODO()
  }

  fun getTransitionCount(): Int {
    TODO()
  }

  fun getTransitionFrom(idx: Int): String {
    TODO()
  }

  fun getTransitionTo(idx: Int): String {
    TODO()
  }

  fun hasNode(name: String): Boolean {
    TODO()
  }

  fun hasTransition(from: String, to: String): Boolean {
    TODO()
  }

  fun removeNode(name: String) {
    TODO()
  }

  fun removeTransition(from: String, to: String) {
    TODO()
  }

  fun removeTransitionByIndex(idx: Int) {
    TODO()
  }

  fun renameNode(name: String, new_name: String) {
    TODO()
  }

  fun setEndNode(name: String) {
    TODO()
  }

  fun setGraphOffset(offset: Vector2) {
    TODO()
  }

  fun setNodePosition(name: String, position: Vector2) {
    TODO()
  }

  fun setStartNode(name: String) {
    TODO()
  }

  companion object {
    fun new(): AnimationNodeStateMachine = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeStateMachine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeStateMachine" }
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
      val add_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val add_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "add_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_transition" }
            }
          }

      val get_end_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_end_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_end_node" }
            }
          }

      val get_graph_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
            }
          }

      val get_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val get_node_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_node_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_name" }
            }
          }

      val get_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_position" }
            }
          }

      val get_start_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_start_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_start_node" }
            }
          }

      val get_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition" }
            }
          }

      val get_transition_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition_count" }
            }
          }

      val get_transition_from: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition_from".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition_from" }
            }
          }

      val get_transition_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "get_transition_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transition_to" }
            }
          }

      val has_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "has_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node" }
            }
          }

      val has_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "has_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_transition" }
            }
          }

      val remove_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val remove_transition: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "remove_transition".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_transition" }
            }
          }

      val remove_transition_by_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "remove_transition_by_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_transition_by_index" }
            }
          }

      val rename_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "rename_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_node" }
            }
          }

      val set_end_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_end_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_end_node" }
            }
          }

      val set_graph_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
            }
          }

      val set_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_position" }
            }
          }

      val set_start_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
              "set_start_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_start_node" }
            }
          }
    }
  }
}
