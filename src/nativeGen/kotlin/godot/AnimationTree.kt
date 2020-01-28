// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationTree(
  _handle: COpaquePointer
) : Node(_handle) {
  var active: Boolean
    get() {
       return isActive() 
    }
    set(value) {
      setActive(value)
    }

  var animPlayer: NodePath
    get() {
       return getAnimationPlayer() 
    }
    set(value) {
      setAnimationPlayer(value)
    }

  var processMode: Int
    get() {
       return AnimationTree.AnimationProcessMode.from(getProcessMode()) 
    }
    set(value) {
      setProcessMode(AnimationTree.AnimationProcessMode.from(value))
    }

  var rootMotionTrack: NodePath
    get() {
       return getRootMotionTrack() 
    }
    set(value) {
      setRootMotionTrack(value)
    }

  var treeRoot: AnimationRootNode
    get() {
       return getTreeRoot() 
    }
    set(value) {
      setTreeRoot(value)
    }

  fun advance(delta: Float) {
    val _arg = Variant.new(delta)
    __method_bind.advance.call(this._handle, _arg, 1)
  }

  fun getAnimationPlayer(): NodePath {
    val _ret = __method_bind.getAnimationPlayer.call(this._handle)
    return _ret.asNodePath()
  }

  fun getProcessMode(): AnimationProcessMode {
    val _ret = __method_bind.getProcessMode.call(this._handle)
    return AnimationTree.AnimationProcessMode.from(_ret.asInt())
  }

  fun getRootMotionTrack(): NodePath {
    val _ret = __method_bind.getRootMotionTrack.call(this._handle)
    return _ret.asNodePath()
  }

  fun getRootMotionTransform(): Transform {
    val _ret = __method_bind.getRootMotionTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getTreeRoot(): AnimationNode {
    val _ret = __method_bind.getTreeRoot.call(this._handle)
    return _ret.asObject(::AnimationNode)!!
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.isActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun renameParameter(oldName: String, newName: String) {
    val _args = VariantArray.new()
    _args.append(oldName)
    _args.append(newName)
    __method_bind.renameParameter.call(this._handle, _args.toVariant(), 2)
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, _arg, 1)
  }

  fun setAnimationPlayer(root: NodePath) {
    val _arg = Variant.new(root)
    __method_bind.setAnimationPlayer.call(this._handle, _arg, 1)
  }

  fun setProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setProcessMode.call(this._handle, _arg, 1)
  }

  fun setRootMotionTrack(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setRootMotionTrack.call(this._handle, _arg, 1)
  }

  fun setTreeRoot(root: AnimationNode) {
    val _arg = Variant.new(root)
    __method_bind.setTreeRoot.call(this._handle, _arg, 1)
  }

  enum class AnimationProcessMode(
    val value: Int
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1),

    ANIMATION_PROCESS_MANUAL(2);

    companion object {
      fun from(value: Int): AnimationProcessMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val ANIMATION_PROCESS_IDLE: Int = 1

    val ANIMATION_PROCESS_MANUAL: Int = 2

    val ANIMATION_PROCESS_PHYSICS: Int = 0

    fun new(): AnimationTree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationTree(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationTree = AnimationTree(ptr)
    /**
     * Container for method_bind pointers for AnimationTree
     */
    private object __method_bind {
      val advance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method advance" }
        }
      val getAnimationPlayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "getAnimationPlayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimationPlayer" }
        }
      val getProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "getProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessMode" }
        }
      val getRootMotionTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "getRootMotionTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRootMotionTrack" }
        }
      val getRootMotionTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "getRootMotionTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRootMotionTransform" }
        }
      val getTreeRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "getTreeRoot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTreeRoot" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "isActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isActive" }
        }
      val renameParameter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "renameParameter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method renameParameter" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "setActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setActive" }
        }
      val setAnimationPlayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "setAnimationPlayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnimationPlayer" }
        }
      val setProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "setProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessMode" }
        }
      val setRootMotionTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "setRootMotionTrack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRootMotionTrack" }
        }
      val setTreeRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "setTreeRoot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTreeRoot" }
        }}
  }
}
