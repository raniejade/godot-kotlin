// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolStringArray
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

open class AnimationPlayer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var assignedAnimation: String
    get() {
       return getAssignedAnimation() 
    }
    set(value) {
      setAssignedAnimation(value)
    }

  var autoplay: String
    get() {
       return getAutoplay() 
    }
    set(value) {
      setAutoplay(value)
    }

  var currentAnimation: String
    get() {
       return getCurrentAnimation() 
    }
    set(value) {
      setCurrentAnimation(value)
    }

  val currentAnimationLength: Float
    get() {
       return getCurrentAnimationLength() 
    }

  val currentAnimationPosition: Float
    get() {
       return getCurrentAnimationPosition() 
    }

  var methodCallMode: AnimationMethodCallMode
    get() {
       return getMethodCallMode() 
    }
    set(value) {
      setMethodCallMode(value.value)
    }

  var playbackActive: Boolean
    get() {
       return isActive() 
    }
    set(value) {
      setActive(value)
    }

  var playbackDefaultBlendTime: Float
    get() {
       return getDefaultBlendTime() 
    }
    set(value) {
      setDefaultBlendTime(value)
    }

  var playbackProcessMode: AnimationProcessMode
    get() {
       return getAnimationProcessMode() 
    }
    set(value) {
      setAnimationProcessMode(value.value)
    }

  var playbackSpeed: Float
    get() {
       return getSpeedScale() 
    }
    set(value) {
      setSpeedScale(value)
    }

  var rootNode: NodePath
    get() {
       return getRoot() 
    }
    set(value) {
      setRoot(value)
    }

  /**
   * AnimationPlayer::animation_changed signal
   */
  val signalAnimationChanged: Signal2<String, String> = Signal2("animation_changed")

  /**
   * AnimationPlayer::animation_finished signal
   */
  val signalAnimationFinished: Signal1<String> = Signal1("animation_finished")

  /**
   * AnimationPlayer::animation_started signal
   */
  val signalAnimationStarted: Signal1<String> = Signal1("animation_started")

  /**
   * AnimationPlayer::caches_cleared signal
   */
  val signalCachesCleared: Signal0 = Signal0("caches_cleared")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for rootNode
   */
  fun rootNode(cb: NodePath.() -> Unit) {
    val _p = rootNode
    cb(_p)
    rootNode = _p
  }

  open fun _animation_changed() {
    TODO()
  }

  open fun _node_removed(arg0: Node) {
    TODO()
  }

  fun addAnimation(name: String, animation: Animation): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(animation)
      __method_bind.addAnimation.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun advance(delta: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.advance.call(self._handle, listOf(delta), null)
    }
  }

  fun animationGetNext(animFrom: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.animationGetNext.call(self._handle, listOf(animFrom), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun animationSetNext(animFrom: String, animTo: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(animFrom)
      _args.add(animTo)
      __method_bind.animationSetNext.call(self._handle, _args, null)
    }
  }

  fun clearCaches() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearCaches.call(self._handle, emptyList(), null)
    }
  }

  fun clearQueue() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearQueue.call(self._handle, emptyList(), null)
    }
  }

  fun findAnimation(animation: Animation): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.findAnimation.call(self._handle, listOf(animation), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getAnimation(name: String): Animation {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Animation
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getAnimation.call(self._handle, listOf(name), _retPtr)
      _ret = objectToType<Animation>(_tmp.value!!)
      _ret
    }
  }

  fun getAnimationList(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getAnimationList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getAnimationProcessMode(): AnimationProcessMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnimationProcessMode.call(self._handle, emptyList(), _retPtr)
      AnimationPlayer.AnimationProcessMode.from(_ret.value)
    }
  }

  fun getAssignedAnimation(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAssignedAnimation.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getAutoplay(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAutoplay.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBlendTime(animFrom: String, animTo: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(animFrom)
      _args.add(animTo)
      __method_bind.getBlendTime.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCurrentAnimation(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCurrentAnimation.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCurrentAnimationLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentAnimationLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCurrentAnimationPosition(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentAnimationPosition.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDefaultBlendTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDefaultBlendTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMethodCallMode(): AnimationMethodCallMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMethodCallMode.call(self._handle, emptyList(), _retPtr)
      AnimationPlayer.AnimationMethodCallMode.from(_ret.value)
    }
  }

  fun getPlayingSpeed(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPlayingSpeed.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getQueue(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getQueue.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRoot(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getRoot.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSpeedScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpeedScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun hasAnimation(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAnimation.call(self._handle, listOf(name), _retPtr)
      _ret.value
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

  fun isPlaying(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPlaying.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun play(
    name: String = "",
    customBlend: Float = -1.0f,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(customBlend)
      _args.add(customSpeed)
      _args.add(fromEnd)
      __method_bind.play.call(self._handle, _args, null)
    }
  }

  fun playBackwards(name: String = "", customBlend: Float = -1.0f) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(customBlend)
      __method_bind.playBackwards.call(self._handle, _args, null)
    }
  }

  fun queue(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.queue.call(self._handle, listOf(name), null)
    }
  }

  fun removeAnimation(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeAnimation.call(self._handle, listOf(name), null)
    }
  }

  fun renameAnimation(name: String, newname: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(newname)
      __method_bind.renameAnimation.call(self._handle, _args, null)
    }
  }

  fun seek(seconds: Float, update: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(seconds)
      _args.add(update)
      __method_bind.seek.call(self._handle, _args, null)
    }
  }

  fun setActive(active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActive.call(self._handle, listOf(active), null)
    }
  }

  fun setAnimationProcessMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnimationProcessMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setAssignedAnimation(anim: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAssignedAnimation.call(self._handle, listOf(anim), null)
    }
  }

  fun setAutoplay(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutoplay.call(self._handle, listOf(name), null)
    }
  }

  fun setBlendTime(
    animFrom: String,
    animTo: String,
    sec: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(animFrom)
      _args.add(animTo)
      _args.add(sec)
      __method_bind.setBlendTime.call(self._handle, _args, null)
    }
  }

  fun setCurrentAnimation(anim: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrentAnimation.call(self._handle, listOf(anim), null)
    }
  }

  fun setDefaultBlendTime(sec: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDefaultBlendTime.call(self._handle, listOf(sec), null)
    }
  }

  fun setMethodCallMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMethodCallMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setRoot(path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRoot.call(self._handle, listOf(path), null)
    }
  }

  fun setSpeedScale(speed: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpeedScale.call(self._handle, listOf(speed), null)
    }
  }

  fun stop(reset: Boolean = true) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, listOf(reset), null)
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

  enum class AnimationMethodCallMode(
    val value: Int
  ) {
    DEFERRED(0),

    IMMEDIATE(1);

    companion object {
      fun from(value: Int): AnimationMethodCallMode {
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
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationPlayer
     */
    private object __method_bind {
      val addAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "add_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_animation" }
            }
          }

      val advance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method advance" }
            }
          }

      val animationGetNext: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "animation_get_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_get_next" }
            }
          }

      val animationSetNext: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "animation_set_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_set_next" }
            }
          }

      val clearCaches: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "clear_caches".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_caches" }
            }
          }

      val clearQueue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "clear_queue".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_queue" }
            }
          }

      val findAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "find_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_animation" }
            }
          }

      val getAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation" }
            }
          }

      val getAnimationList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_animation_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_list" }
            }
          }

      val getAnimationProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
            }
          }

      val getAssignedAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_assigned_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_assigned_animation" }
            }
          }

      val getAutoplay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_autoplay" }
            }
          }

      val getBlendTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_time" }
            }
          }

      val getCurrentAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_current_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_animation" }
            }
          }

      val getCurrentAnimationLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_current_animation_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_animation_length" }
            }
          }

      val getCurrentAnimationPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_current_animation_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_animation_position"
              }
            }
          }

      val getDefaultBlendTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_default_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_blend_time" }
            }
          }

      val getMethodCallMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_method_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_method_call_mode" }
            }
          }

      val getPlayingSpeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_playing_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_playing_speed" }
            }
          }

      val getQueue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_queue".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_queue" }
            }
          }

      val getRoot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root" }
            }
          }

      val getSpeedScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val hasAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "has_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_animation" }
            }
          }

      val isActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val isPlaying: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val playBackwards: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "play_backwards".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play_backwards" }
            }
          }

      val queue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "queue".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue" }
            }
          }

      val removeAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "remove_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_animation" }
            }
          }

      val renameAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "rename_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_animation" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val setActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val setAnimationProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
            }
          }

      val setAssignedAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_assigned_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_assigned_animation" }
            }
          }

      val setAutoplay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val setBlendTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_time" }
            }
          }

      val setCurrentAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_current_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_animation" }
            }
          }

      val setDefaultBlendTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_default_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_blend_time" }
            }
          }

      val setMethodCallMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_method_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_method_call_mode" }
            }
          }

      val setRoot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_root" }
            }
          }

      val setSpeedScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
