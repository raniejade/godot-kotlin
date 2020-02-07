// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Joint(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var collisionExcludeNodes: Boolean
    get() {
       return getExcludeNodesFromCollision() 
    }
    set(value) {
      setExcludeNodesFromCollision(value)
    }

  var nodesNodeA: NodePath
    get() {
       return getNodeA() 
    }
    set(value) {
      setNodeA(value)
    }

  var nodesNodeB: NodePath
    get() {
       return getNodeB() 
    }
    set(value) {
      setNodeB(value)
    }

  var solverPriority: Int
    get() {
       return getSolverPriority() 
    }
    set(value) {
      setSolverPriority(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for nodesNodeA
   */
  fun nodesNodeA(cb: NodePath.() -> Unit) {
    val _p = nodesNodeA
    cb(_p)
    nodesNodeA = _p
  }

  /**
   * Specialized setter for nodesNodeB
   */
  fun nodesNodeB(cb: NodePath.() -> Unit) {
    val _p = nodesNodeB
    cb(_p)
    nodesNodeB = _p
  }

  fun getExcludeNodesFromCollision(): Boolean {
    val _ret = __method_bind.getExcludeNodesFromCollision.call(this._handle)
    return _ret.asBoolean()
  }

  fun getNodeA(): NodePath {
    val _ret = __method_bind.getNodeA.call(this._handle)
    return _ret.asNodePath()
  }

  fun getNodeB(): NodePath {
    val _ret = __method_bind.getNodeB.call(this._handle)
    return _ret.asNodePath()
  }

  fun getSolverPriority(): Int {
    val _ret = __method_bind.getSolverPriority.call(this._handle)
    return _ret.asInt()
  }

  fun setExcludeNodesFromCollision(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setExcludeNodesFromCollision.call(this._handle, listOf(_arg))
  }

  fun setNodeA(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.setNodeA.call(this._handle, listOf(_arg))
  }

  fun setNodeB(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.setNodeB.call(this._handle, listOf(_arg))
  }

  fun setSolverPriority(priority: Int) {
    val _arg = Variant.new(priority)
    __method_bind.setSolverPriority.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for Joint
     */
    private object __method_bind {
      val getExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exclude_nodes_from_collision" }
        }
      val getNodeA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_a" }
        }
      val getNodeB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_b" }
        }
      val getSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_solver_priority" }
        }
      val setExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclude_nodes_from_collision" }
        }
      val setNodeA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_a" }
        }
      val setNodeB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_b" }
        }
      val setSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_solver_priority" }
        }}
  }
}
