// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
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

open class Joint internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getExcludeNodesFromCollision(): Boolean {
    val _ret = __method_bind.get_exclude_nodes_from_collision.call(this._handle)
    return _ret.asBool()
  }

  fun getNodeA(): NodePath {
    val _ret = __method_bind.get_node_a.call(this._handle)
    return _ret.asNodePath()
  }

  fun getNodeB(): NodePath {
    val _ret = __method_bind.get_node_b.call(this._handle)
    return _ret.asNodePath()
  }

  fun getSolverPriority(): Int {
    val _ret = __method_bind.get_solver_priority.call(this._handle)
    return _ret.asInt()
  }

  fun setExcludeNodesFromCollision(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_exclude_nodes_from_collision.call(this._handle, _arg, 1)
  }

  fun setNodeA(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.set_node_a.call(this._handle, _arg, 1)
  }

  fun setNodeB(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.set_node_b.call(this._handle, _arg, 1)
  }

  fun setSolverPriority(priority: Int) {
    val _arg = Variant.new(priority)
    __method_bind.set_solver_priority.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Joint
     */
    private object __method_bind {
      val get_exclude_nodes_from_collision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exclude_nodes_from_collision" }
        }
      val get_node_a: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_a" }
        }
      val get_node_b: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_b" }
        }
      val get_solver_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_solver_priority" }
        }
      val set_exclude_nodes_from_collision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclude_nodes_from_collision" }
        }
      val set_node_a: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_a" }
        }
      val set_node_b: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_b" }
        }
      val set_solver_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_solver_priority" }
        }}
  }
}
