// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Joint2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getBias(): Float {
    val _ret = __method_bind.get_bias.call(this.toVariant())
    TODO()
  }

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

  fun setBias(bias: Float) {
    val _args = VariantArray.new()
    _args.append(bias)
    val _ret = __method_bind.set_bias.call(this.toVariant(), _args.toVariant(), 1)
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

  companion object {
    /**
     * Container for method_bind pointers for Joint2D
     */
    private object __method_bind {
      val get_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "get_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bias" }
            }
          }

      val get_exclude_nodes_from_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "get_exclude_nodes_from_collision".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_exclude_nodes_from_collision" }
            }
          }

      val get_node_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "get_node_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_a" }
            }
          }

      val get_node_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "get_node_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_b" }
            }
          }

      val set_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "set_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bias" }
            }
          }

      val set_exclude_nodes_from_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "set_exclude_nodes_from_collision".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_exclude_nodes_from_collision" }
            }
          }

      val set_node_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "set_node_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_a" }
            }
          }

      val set_node_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Joint2D".cstr.ptr,
              "set_node_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_b" }
            }
          }
    }
  }
}
