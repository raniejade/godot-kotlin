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

open class AnimationNodeStateMachine(
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
    __method_bind.addNode.call(this._handle, _args.toVariant(), 3)
  }

  fun addTransition(
    from: String,
    to: String,
    transition: AnimationNodeStateMachineTransition
  ) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(transition)
    __method_bind.addTransition.call(this._handle, _args.toVariant(), 3)
  }

  fun getEndNode(): String {
    val _ret = __method_bind.getEndNode.call(this._handle)
    return _ret.asString()
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

  fun getNodeName(node: AnimationNode): String {
    val _arg = Variant.new(node)
    val _ret = __method_bind.getNodeName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getNodePosition(name: String): Vector2 {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getNodePosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getStartNode(): String {
    val _ret = __method_bind.getStartNode.call(this._handle)
    return _ret.asString()
  }

  fun getTransition(idx: Int): AnimationNodeStateMachineTransition {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getTransition.call(this._handle, _arg, 1)
    return _ret.asObject(::AnimationNodeStateMachineTransition)!!
  }

  fun getTransitionCount(): Int {
    val _ret = __method_bind.getTransitionCount.call(this._handle)
    return _ret.asInt()
  }

  fun getTransitionFrom(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getTransitionFrom.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getTransitionTo(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getTransitionTo.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun hasNode(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasNode.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasTransition(from: String, to: String): Boolean {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    val _ret = __method_bind.hasTransition.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun removeNode(name: String) {
    val _arg = Variant.new(name)
    __method_bind.removeNode.call(this._handle, _arg, 1)
  }

  fun removeTransition(from: String, to: String) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    __method_bind.removeTransition.call(this._handle, _args.toVariant(), 2)
  }

  fun removeTransitionByIndex(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeTransitionByIndex.call(this._handle, _arg, 1)
  }

  fun renameNode(name: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newName)
    __method_bind.renameNode.call(this._handle, _args.toVariant(), 2)
  }

  fun setEndNode(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setEndNode.call(this._handle, _arg, 1)
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

  fun setStartNode(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setStartNode.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AnimationNodeStateMachine = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeStateMachine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeStateMachine" }
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
      val addNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "addNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addNode" }
        }
      val addTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "addTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTransition" }
        }
      val getEndNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getEndNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEndNode" }
        }
      val getGraphOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getGraphOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGraphOffset" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNode" }
        }
      val getNodeName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getNodeName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeName" }
        }
      val getNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getNodePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodePosition" }
        }
      val getStartNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getStartNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStartNode" }
        }
      val getTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransition" }
        }
      val getTransitionCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getTransitionCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransitionCount" }
        }
      val getTransitionFrom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getTransitionFrom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransitionFrom" }
        }
      val getTransitionTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "getTransitionTo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransitionTo" }
        }
      val hasNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "hasNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasNode" }
        }
      val hasTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "hasTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasTransition" }
        }
      val removeNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "removeNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeNode" }
        }
      val removeTransition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "removeTransition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeTransition" }
        }
      val removeTransitionByIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "removeTransitionByIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeTransitionByIndex" }
        }
      val renameNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "renameNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method renameNode" }
        }
      val setEndNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "setEndNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEndNode" }
        }
      val setGraphOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "setGraphOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGraphOffset" }
        }
      val setNodePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "setNodePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNodePosition" }
        }
      val setStartNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachine".cstr.ptr,
            "setStartNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStartNode" }
        }}
  }
}
