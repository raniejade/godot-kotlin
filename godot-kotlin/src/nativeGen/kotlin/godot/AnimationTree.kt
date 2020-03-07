// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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

  open fun _clear_caches() {
    TODO()
  }

  open fun _node_removed(arg0: Node) {
    TODO()
  }

  open fun _tree_changed() {
    TODO()
  }

  open fun _update_properties() {
    TODO()
  }

  fun advance(delta: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.advance.call(self._handle, listOf(delta), null)
    }
  }

  fun getAnimationPlayer(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getAnimationPlayer.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getProcessMode(): AnimationProcessMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessMode.call(self._handle, emptyList(), _retPtr)
      AnimationTree.AnimationProcessMode.from(_ret.value)
    }
  }

  fun getRootMotionTrack(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getRootMotionTrack.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRootMotionTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getRootMotionTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTreeRoot(): AnimationNode {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AnimationNode
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTreeRoot.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<AnimationNode>(_tmp.value!!)
      _ret
    }
  }

  fun isActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun renameParameter(oldName: String, newName: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(oldName)
      _args.add(newName)
      __method_bind.renameParameter.call(self._handle, _args, null)
    }
  }

  fun setActive(active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActive.call(self._handle, listOf(active), null)
    }
  }

  fun setAnimationPlayer(root: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnimationPlayer.call(self._handle, listOf(root), null)
    }
  }

  fun setProcessMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setRootMotionTrack(path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRootMotionTrack.call(self._handle, listOf(path), null)
    }
  }

  fun setTreeRoot(root: AnimationNode) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTreeRoot.call(self._handle, listOf(root), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationTree
     */
    private object __method_bind {
      val advance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method advance" }
            }
          }

      val getAnimationPlayer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_animation_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_player" }
            }
          }

      val getProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
            }
          }

      val getRootMotionTrack: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_root_motion_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root_motion_track" }
            }
          }

      val getRootMotionTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_root_motion_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root_motion_transform" }
            }
          }

      val getTreeRoot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_tree_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tree_root" }
            }
          }

      val isActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val renameParameter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "rename_parameter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_parameter" }
            }
          }

      val setActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val setAnimationPlayer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_animation_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_player" }
            }
          }

      val setProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
            }
          }

      val setRootMotionTrack: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_root_motion_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_root_motion_track" }
            }
          }

      val setTreeRoot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_tree_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tree_root" }
            }
          }
    }
  }
}
