// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Joint2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var bias: Float
    get() {
       return getBias() 
    }
    set(value) {
      setBias(value)
    }

  var disableCollision: Boolean
    get() {
       return getExcludeNodesFromCollision() 
    }
    set(value) {
      setExcludeNodesFromCollision(value)
    }

  var nodeA: NodePath
    get() {
       return getNodeA() 
    }
    set(value) {
      setNodeA(value)
    }

  var nodeB: NodePath
    get() {
       return getNodeB() 
    }
    set(value) {
      setNodeB(value)
    }

  /**
   * Specialized setter for nodeA
   */
  fun nodeA(cb: NodePath.() -> Unit) {
    val _p = nodeA
    cb(_p)
    nodeA = _p
  }

  /**
   * Specialized setter for nodeB
   */
  fun nodeB(cb: NodePath.() -> Unit) {
    val _p = nodeB
    cb(_p)
    nodeB = _p
  }

  fun getBias(): Float {
    val _ret = __method_bind.getBias.call(this._handle)
    return _ret.asFloat()
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

  fun setBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.setBias.call(this._handle, _arg, 1)
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

  companion object {
    /**
     * Container for method_bind pointers for Joint2D
     */
    private object __method_bind {
      val getBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "get_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bias" }
        }
      val getExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "get_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exclude_nodes_from_collision" }
        }
      val getNodeA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "get_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_a" }
        }
      val getNodeB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "get_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_b" }
        }
      val setBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "set_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bias" }
        }
      val setExcludeNodesFromCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "set_exclude_nodes_from_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclude_nodes_from_collision" }
        }
      val setNodeA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "set_node_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_a" }
        }
      val setNodeB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
            "set_node_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_node_b" }
        }}
  }
}
