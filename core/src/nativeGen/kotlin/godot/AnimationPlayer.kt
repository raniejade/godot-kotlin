// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationPlayer(
  _handle: COpaquePointer
) : Node(_handle) {
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

  /**
   * Specialized setter for rootNode
   */
  fun rootNode(cb: NodePath.() -> Unit) {
    val _p = rootNode
    cb(_p)
    rootNode = _p
  }

  fun addAnimation(name: String, animation: Animation): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(animation))
    val _ret = __method_bind.addAnimation.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun advance(delta: Float) {
    val _arg = Variant.new(delta)
    __method_bind.advance.call(this._handle, listOf(_arg))
  }

  fun animationGetNext(animFrom: String): String {
    val _arg = Variant.new(animFrom)
    val _ret = __method_bind.animationGetNext.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun animationSetNext(animFrom: String, animTo: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(animFrom))
    _args.add(Variant.fromAny(animTo))
    __method_bind.animationSetNext.call(this._handle, _args)
  }

  fun clearCaches() {
    __method_bind.clearCaches.call(this._handle)
  }

  fun clearQueue() {
    __method_bind.clearQueue.call(this._handle)
  }

  fun findAnimation(animation: Animation): String {
    val _arg = Variant.new(animation)
    val _ret = __method_bind.findAnimation.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getAnimation(name: String): Animation {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getAnimation.call(this._handle, listOf(_arg))
    return _ret.asObject(::Animation)!!
  }

  fun getAnimationList(): PoolStringArray {
    val _ret = __method_bind.getAnimationList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getAnimationProcessMode(): AnimationProcessMode {
    val _ret = __method_bind.getAnimationProcessMode.call(this._handle)
    return AnimationPlayer.AnimationProcessMode.from(_ret.asInt())
  }

  fun getAssignedAnimation(): String {
    val _ret = __method_bind.getAssignedAnimation.call(this._handle)
    return _ret.asString()
  }

  fun getAutoplay(): String {
    val _ret = __method_bind.getAutoplay.call(this._handle)
    return _ret.asString()
  }

  fun getBlendTime(animFrom: String, animTo: String): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(animFrom))
    _args.add(Variant.fromAny(animTo))
    val _ret = __method_bind.getBlendTime.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun getCurrentAnimation(): String {
    val _ret = __method_bind.getCurrentAnimation.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentAnimationLength(): Float {
    val _ret = __method_bind.getCurrentAnimationLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getCurrentAnimationPosition(): Float {
    val _ret = __method_bind.getCurrentAnimationPosition.call(this._handle)
    return _ret.asFloat()
  }

  fun getDefaultBlendTime(): Float {
    val _ret = __method_bind.getDefaultBlendTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getMethodCallMode(): AnimationMethodCallMode {
    val _ret = __method_bind.getMethodCallMode.call(this._handle)
    return AnimationPlayer.AnimationMethodCallMode.from(_ret.asInt())
  }

  fun getPlayingSpeed(): Float {
    val _ret = __method_bind.getPlayingSpeed.call(this._handle)
    return _ret.asFloat()
  }

  fun getQueue(): PoolStringArray {
    val _ret = __method_bind.getQueue.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getRoot(): NodePath {
    val _ret = __method_bind.getRoot.call(this._handle)
    return _ret.asNodePath()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.getSpeedScale.call(this._handle)
    return _ret.asFloat()
  }

  fun hasAnimation(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasAnimation.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.isActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.isPlaying.call(this._handle)
    return _ret.asBoolean()
  }

  fun play(
    name: String = "",
    customBlend: Float = -1.0f,
    customSpeed: Float = 1.0f,
    fromEnd: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(customBlend))
    _args.add(Variant.fromAny(customSpeed))
    _args.add(Variant.fromAny(fromEnd))
    __method_bind.play.call(this._handle, _args)
  }

  fun playBackwards(name: String = "", customBlend: Float = -1.0f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(customBlend))
    __method_bind.playBackwards.call(this._handle, _args)
  }

  fun queue(name: String) {
    val _arg = Variant.new(name)
    __method_bind.queue.call(this._handle, listOf(_arg))
  }

  fun removeAnimation(name: String) {
    val _arg = Variant.new(name)
    __method_bind.removeAnimation.call(this._handle, listOf(_arg))
  }

  fun renameAnimation(name: String, newname: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(newname))
    __method_bind.renameAnimation.call(this._handle, _args)
  }

  fun seek(seconds: Float, update: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(seconds))
    _args.add(Variant.fromAny(update))
    __method_bind.seek.call(this._handle, _args)
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, listOf(_arg))
  }

  fun setAnimationProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setAnimationProcessMode.call(this._handle, listOf(_arg))
  }

  fun setAssignedAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.setAssignedAnimation.call(this._handle, listOf(_arg))
  }

  fun setAutoplay(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setAutoplay.call(this._handle, listOf(_arg))
  }

  fun setBlendTime(
    animFrom: String,
    animTo: String,
    sec: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(animFrom))
    _args.add(Variant.fromAny(animTo))
    _args.add(Variant.fromAny(sec))
    __method_bind.setBlendTime.call(this._handle, _args)
  }

  fun setCurrentAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.setCurrentAnimation.call(this._handle, listOf(_arg))
  }

  fun setDefaultBlendTime(sec: Float) {
    val _arg = Variant.new(sec)
    __method_bind.setDefaultBlendTime.call(this._handle, listOf(_arg))
  }

  fun setMethodCallMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMethodCallMode.call(this._handle, listOf(_arg))
  }

  fun setRoot(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setRoot.call(this._handle, listOf(_arg))
  }

  fun setSpeedScale(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.setSpeedScale.call(this._handle, listOf(_arg))
  }

  fun stop(reset: Boolean = true) {
    val _arg = Variant.new(reset)
    __method_bind.stop.call(this._handle, listOf(_arg))
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
    fun new(): AnimationPlayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationPlayer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationPlayer = AnimationPlayer(ptr)
    /**
     * Container for method_bind pointers for AnimationPlayer
     */
    private object __method_bind {
      val addAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "add_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_animation" }
        }
      val advance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method advance" }
        }
      val animationGetNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "animation_get_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_get_next" }
        }
      val animationSetNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "animation_set_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_set_next" }
        }
      val clearCaches: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "clear_caches".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_caches" }
        }
      val clearQueue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "clear_queue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_queue" }
        }
      val findAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "find_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_animation" }
        }
      val getAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation" }
        }
      val getAnimationList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_animation_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_list" }
        }
      val getAnimationProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
        }
      val getAssignedAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_assigned_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_assigned_animation" }
        }
      val getAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_autoplay" }
        }
      val getBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_time" }
        }
      val getCurrentAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_current_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_animation" }
        }
      val getCurrentAnimationLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_current_animation_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_animation_length" }
        }
      val getCurrentAnimationPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_current_animation_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_animation_position" }
        }
      val getDefaultBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_default_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_blend_time" }
        }
      val getMethodCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_method_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_method_call_mode" }
        }
      val getPlayingSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_playing_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_playing_speed" }
        }
      val getQueue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_queue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_queue" }
        }
      val getRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val hasAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "has_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_animation" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val playBackwards: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "play_backwards".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play_backwards" }
        }
      val queue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "queue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue" }
        }
      val removeAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "remove_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_animation" }
        }
      val renameAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "rename_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_animation" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val setAnimationProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
        }
      val setAssignedAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_assigned_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_assigned_animation" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
        }
      val setBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_time" }
        }
      val setCurrentAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_current_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_animation" }
        }
      val setDefaultBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_default_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_blend_time" }
        }
      val setMethodCallMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_method_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_method_call_mode" }
        }
      val setRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_root" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
