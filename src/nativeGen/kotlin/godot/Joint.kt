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

open class Joint(
  _handle: COpaquePointer
) : Spatial(_handle) {
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
    __method_bind.setExcludeNodesFromCollision.call(this._handle, _arg, 1)
  }

  fun setNodeA(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.setNodeA.call(this._handle, _arg, 1)
  }

  fun setNodeB(node: NodePath) {
    val _arg = Variant.new(node)
    __method_bind.setNodeB.call(this._handle, _arg, 1)
  }

  fun setSolverPriority(priority: Int) {
    val _arg = Variant.new(priority)
    __method_bind.setSolverPriority.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Joint
     */
    private object __method_bind {
      val getExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "getExcludeNodesFromCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExcludeNodesFromCollision" }
        }
      val getNodeA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "getNodeA".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeA" }
        }
      val getNodeB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "getNodeB".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeB" }
        }
      val getSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "getSolverPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSolverPriority" }
        }
      val setExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "setExcludeNodesFromCollision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExcludeNodesFromCollision" }
        }
      val setNodeA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "setNodeA".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNodeA" }
        }
      val setNodeB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "setNodeB".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNodeB" }
        }
      val setSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint".cstr.ptr,
            "setSolverPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSolverPriority" }
        }}
  }
}
