// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExcludeNodesFromCollision.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNodeA(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeA.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodeB(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeB.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSolverPriority(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSolverPriority.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setExcludeNodesFromCollision(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExcludeNodesFromCollision.call(self._handle, listOf(enable), null)
    }
  }

  fun setNodeA(node: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNodeA.call(self._handle, listOf(node), null)
    }
  }

  fun setNodeB(node: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNodeB.call(self._handle, listOf(node), null)
    }
  }

  fun setSolverPriority(priority: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSolverPriority.call(self._handle, listOf(priority), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Joint
     */
    private object __method_bind {
      val getExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exclude_nodes_from_collision" }
        }
      val getNodeA: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_a" }
        }
      val getNodeB: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_b" }
        }
      val getSolverPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "get_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_solver_priority" }
        }
      val setExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclude_nodes_from_collision" }
        }
      val setNodeA: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_a" }
        }
      val setNodeB: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_b" }
        }
      val setSolverPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "set_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_solver_priority" }
        }}
  }
}
