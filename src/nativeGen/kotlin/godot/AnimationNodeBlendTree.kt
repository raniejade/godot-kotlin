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

open class AnimationNodeBlendTree(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  var graphOffset: Vector2
    get() {
       return getGraphOffset() 
    }
    set(value) {
      setGraphOffset(value)
    }

  fun addNode(
    name: String,
    node: AnimationNode,
    position: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(node)
    _args.append(position)
    __method_bind.addNode.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.connectNode.call(this._handle, _args.toVariant(), 3)
  }

  fun disconnectNode(inputNode: String, inputIndex: Int) {
    val _args = VariantArray.new()
    _args.append(inputNode)
    _args.append(inputIndex)
    __method_bind.disconnectNode.call(this._handle, _args.toVariant(), 2)
  }

  fun getGraphOffset(): Vector2 {
    val _ret = __method_bind.getGraphOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getNode(name: String): AnimationNode {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getNode.call(this._handle, _arg, 1)
    return _ret.asObject(::AnimationNode)!!
  }

  fun getNodePosition(name: String): Vector2 {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getNodePosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun hasNode(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasNode.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeNode(name: String) {
    val _arg = Variant.new(name)
    __method_bind.removeNode.call(this._handle, _arg, 1)
  }

  fun renameNode(name: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newName)
    __method_bind.renameNode.call(this._handle, _args.toVariant(), 2)
  }

  fun setGraphOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setGraphOffset.call(this._handle, _arg, 1)
  }

  fun setNodePosition(name: String, position: Vector2) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(position)
    __method_bind.setNodePosition.call(this._handle, _args.toVariant(), 2)
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
      requireNotNull(fnPtr) { "No instance found for AnimationNodeBlendTree" }
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
      val addNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "addNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addNode" }
        }
      val connectNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "connectNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connectNode" }
        }
      val disconnectNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "disconnectNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnectNode" }
        }
      val getGraphOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "getGraphOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGraphOffset" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "getNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNode" }
        }
      val getNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "getNodePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodePosition" }
        }
      val hasNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "hasNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasNode" }
        }
      val removeNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "removeNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeNode" }
        }
      val renameNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "renameNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method renameNode" }
        }
      val setGraphOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "setGraphOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGraphOffset" }
        }
      val setNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendTree".cstr.ptr,
            "setNodePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNodePosition" }
        }}
  }
}
