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

open class AnimationTree(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
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

  var processMode: AnimationProcessMode
    get() {
       return getProcessMode() 
    }
    set(value) {
      setProcessMode(value.value)
    }

  var rootMotionTrack: NodePath
    get() {
       return getRootMotionTrack() 
    }
    set(value) {
      setRootMotionTrack(value)
    }

  var treeRoot: AnimationNode
    get() {
       return getTreeRoot() 
    }
    set(value) {
      setTreeRoot(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for animPlayer
   */
  fun animPlayer(cb: NodePath.() -> Unit) {
    val _p = animPlayer
    cb(_p)
    animPlayer = _p
  }

  /**
   * Specialized setter for rootMotionTrack
   */
  fun rootMotionTrack(cb: NodePath.() -> Unit) {
    val _p = rootMotionTrack
    cb(_p)
    rootMotionTrack = _p
  }

  fun advance(delta: Float) {
    val _arg = Variant.new(delta)
    __method_bind.advance.call(this._handle, listOf(_arg))
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(oldName))
    _args.add(Variant.fromAny(newName))
    __method_bind.renameParameter.call(this._handle, _args)
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, listOf(_arg))
  }

  fun setAnimationPlayer(root: NodePath) {
    val _arg = Variant.new(root)
    __method_bind.setAnimationPlayer.call(this._handle, listOf(_arg))
  }

  fun setProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setProcessMode.call(this._handle, listOf(_arg))
  }

  fun setRootMotionTrack(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setRootMotionTrack.call(this._handle, listOf(_arg))
  }

  fun setTreeRoot(root: AnimationNode) {
    val _arg = Variant.new(root)
    __method_bind.setTreeRoot.call(this._handle, listOf(_arg))
  }

  enum class AnimationProcessMode(
    val value: Int
  ) {
    PHYSICS(0),

    IDLE(1),

    MANUAL(2);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
            "get_animation_player".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_player" }
        }
      val getProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "get_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
        }
      val getRootMotionTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "get_root_motion_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root_motion_track" }
        }
      val getRootMotionTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "get_root_motion_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root_motion_transform" }
        }
      val getTreeRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "get_tree_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tree_root" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val renameParameter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "rename_parameter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_parameter" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val setAnimationPlayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "set_animation_player".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_player" }
        }
      val setProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "set_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
        }
      val setRootMotionTrack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "set_root_motion_track".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_root_motion_track" }
        }
      val setTreeRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
            "set_tree_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tree_root" }
        }}
  }
}
