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
    val _ret = __method_bind.get_exclude_nodes_from_collision.call(this.toVariant())
    TODO()
  }

  fun getNodeA(): NodePath {
    val _ret = __method_bind.get_node_a.call(this.toVariant())
    TODO()
  }

  fun getNodeB(): NodePath {
    val _ret = __method_bind.get_node_b.call(this.toVariant())
    TODO()
  }

  fun getSolverPriority(): Int {
    val _ret = __method_bind.get_solver_priority.call(this.toVariant())
    TODO()
  }

  fun setExcludeNodesFromCollision(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_exclude_nodes_from_collision.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setNodeA(node: NodePath) {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.set_node_a.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNodeB(node: NodePath) {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.set_node_b.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSolverPriority(priority: Int) {
    val _args = VariantArray.new()
    _args.append(priority)
    val _ret = __method_bind.set_solver_priority.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for Joint
     */
    private object __method_bind {
      val get_exclude_nodes_from_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "get_exclude_nodes_from_collision".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_exclude_nodes_from_collision" }
            }
          }

      val get_node_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "get_node_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_a" }
            }
          }

      val get_node_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "get_node_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_b" }
            }
          }

      val get_solver_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "get_solver_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_solver_priority" }
            }
          }

      val set_exclude_nodes_from_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "set_exclude_nodes_from_collision".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_exclude_nodes_from_collision" }
            }
          }

      val set_node_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "set_node_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_a" }
            }
          }

      val set_node_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "set_node_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_b" }
            }
          }

      val set_solver_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
              "set_solver_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_solver_priority" }
            }
          }
    }
  }
}
