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

open class AnimationNodeBlendTree internal constructor(
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
    val _ret = __method_bind.add_node.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun connectNode(
    inputNode: String,
    inputIndex: Int,
    outputNode: String
  ) {
    val _args = VariantArray.new()
    _args.append(inputNode)
    _args.append(inputIndex)
    _args.append(outputNode)
    val _ret = __method_bind.connect_node.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun disconnectNode(inputNode: String, inputIndex: Int) {
    val _args = VariantArray.new()
    _args.append(inputNode)
    _args.append(inputIndex)
    val _ret = __method_bind.disconnect_node.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getGraphOffset(): Vector2 {
    val _ret = __method_bind.get_graph_offset.call(this.toVariant())
    TODO()
  }

  fun getNode(name: String): AnimationNode {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.get_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodePosition(name: String): Vector2 {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.get_node_position.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun hasNode(name: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.has_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removeNode(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.remove_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun renameNode(name: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newName)
    val _ret = __method_bind.rename_node.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setGraphOffset(offset: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.set_graph_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNodePosition(name: String, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(position)
    val _ret = __method_bind.set_node_position.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  companion object {
    val CONNECTION_ERROR_CONNECTION_EXISTS: Int = 5

    val CONNECTION_ERROR_NO_INPUT: Int = 1

    val CONNECTION_ERROR_NO_INPUT_INDEX: Int = 2

    val CONNECTION_ERROR_NO_OUTPUT: Int = 3

    val CONNECTION_ERROR_SAME_NODE: Int = 4

    val CONNECTION_OK: Int = 0

    fun new(): AnimationNodeBlendTree = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeBlendTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendTree(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeBlendTree = AnimationNodeBlendTree(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeBlendTree
     */
    private object __method_bind {
      val add_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val connect_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "connect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_node" }
            }
          }

      val disconnect_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "disconnect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_node" }
            }
          }

      val get_graph_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "get_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_graph_offset" }
            }
          }

      val get_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val get_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "get_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_position" }
            }
          }

      val has_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "has_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node" }
            }
          }

      val remove_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }

      val rename_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "rename_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_node" }
            }
          }

      val set_graph_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "set_graph_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_graph_offset" }
            }
          }

      val set_node_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
              "set_node_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_node_position" }
            }
          }
    }
  }
}
