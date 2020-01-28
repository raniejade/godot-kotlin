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

  var playbackProcessMode: Int
    get() {
       return AnimationPlayer.AnimationProcessMode.from(getAnimationProcessMode()) 
    }
    set(value) {
      setAnimationProcessMode(AnimationPlayer.AnimationProcessMode.from(value))
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

  fun addAnimation(name: String, animation: Animation): GDError {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(animation)
    val _ret = __method_bind.addAnimation.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun advance(delta: Float) {
    val _arg = Variant.new(delta)
    __method_bind.advance.call(this._handle, _arg, 1)
  }

  fun animationGetNext(animFrom: String): String {
    val _arg = Variant.new(animFrom)
    val _ret = __method_bind.animationGetNext.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun animationSetNext(animFrom: String, animTo: String) {
    val _args = VariantArray.new()
    _args.append(animFrom)
    _args.append(animTo)
    __method_bind.animationSetNext.call(this._handle, _args.toVariant(), 2)
  }

  fun clearCaches() {
    __method_bind.clearCaches.call(this._handle)
  }

  fun clearQueue() {
    __method_bind.clearQueue.call(this._handle)
  }

  fun findAnimation(animation: Animation): String {
    val _arg = Variant.new(animation)
    val _ret = __method_bind.findAnimation.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getAnimation(name: String): Animation {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getAnimation.call(this._handle, _arg, 1)
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
    val _args = VariantArray.new()
    _args.append(animFrom)
    _args.append(animTo)
    val _ret = __method_bind.getBlendTime.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.hasAnimation.call(this._handle, _arg, 1)
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
    name: String,
    customBlend: Float,
    customSpeed: Float,
    fromEnd: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(customBlend)
    _args.append(customSpeed)
    _args.append(fromEnd)
    __method_bind.play.call(this._handle, _args.toVariant(), 4)
  }

  fun playBackwards(name: String, customBlend: Float) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(customBlend)
    __method_bind.playBackwards.call(this._handle, _args.toVariant(), 2)
  }

  fun queue(name: String) {
    val _arg = Variant.new(name)
    __method_bind.queue.call(this._handle, _arg, 1)
  }

  fun removeAnimation(name: String) {
    val _arg = Variant.new(name)
    __method_bind.removeAnimation.call(this._handle, _arg, 1)
  }

  fun renameAnimation(name: String, newname: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newname)
    __method_bind.renameAnimation.call(this._handle, _args.toVariant(), 2)
  }

  fun seek(seconds: Float, update: Boolean) {
    val _args = VariantArray.new()
    _args.append(seconds)
    _args.append(update)
    __method_bind.seek.call(this._handle, _args.toVariant(), 2)
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, _arg, 1)
  }

  fun setAnimationProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setAnimationProcessMode.call(this._handle, _arg, 1)
  }

  fun setAssignedAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.setAssignedAnimation.call(this._handle, _arg, 1)
  }

  fun setAutoplay(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setAutoplay.call(this._handle, _arg, 1)
  }

  fun setBlendTime(
    animFrom: String,
    animTo: String,
    sec: Float
  ) {
    val _args = VariantArray.new()
    _args.append(animFrom)
    _args.append(animTo)
    _args.append(sec)
    __method_bind.setBlendTime.call(this._handle, _args.toVariant(), 3)
  }

  fun setCurrentAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.setCurrentAnimation.call(this._handle, _arg, 1)
  }

  fun setDefaultBlendTime(sec: Float) {
    val _arg = Variant.new(sec)
    __method_bind.setDefaultBlendTime.call(this._handle, _arg, 1)
  }

  fun setRoot(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setRoot.call(this._handle, _arg, 1)
  }

  fun setSpeedScale(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.setSpeedScale.call(this._handle, _arg, 1)
  }

  fun stop(reset: Boolean) {
    val _arg = Variant.new(reset)
    __method_bind.stop.call(this._handle, _arg, 1)
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
            "addAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addAnimation" }
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
            "animationGetNext".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animationGetNext" }
        }
      val animationSetNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "animationSetNext".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animationSetNext" }
        }
      val clearCaches: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "clearCaches".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearCaches" }
        }
      val clearQueue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "clearQueue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearQueue" }
        }
      val findAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "findAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findAnimation" }
        }
      val getAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimation" }
        }
      val getAnimationList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getAnimationList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimationList" }
        }
      val getAnimationProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getAnimationProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimationProcessMode" }
        }
      val getAssignedAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getAssignedAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAssignedAnimation" }
        }
      val getAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getAutoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAutoplay" }
        }
      val getBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getBlendTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBlendTime" }
        }
      val getCurrentAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getCurrentAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentAnimation" }
        }
      val getCurrentAnimationLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getCurrentAnimationLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentAnimationLength" }
        }
      val getCurrentAnimationPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getCurrentAnimationPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentAnimationPosition" }
        }
      val getDefaultBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getDefaultBlendTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDefaultBlendTime" }
        }
      val getPlayingSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getPlayingSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlayingSpeed" }
        }
      val getQueue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getQueue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getQueue" }
        }
      val getRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getRoot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRoot" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "getSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpeedScale" }
        }
      val hasAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "hasAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAnimation" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "isActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isActive" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "isPlaying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPlaying" }
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
            "playBackwards".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method playBackwards" }
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
            "removeAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeAnimation" }
        }
      val renameAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "renameAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method renameAnimation" }
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
            "setActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setActive" }
        }
      val setAnimationProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setAnimationProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnimationProcessMode" }
        }
      val setAssignedAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setAssignedAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAssignedAnimation" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setAutoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutoplay" }
        }
      val setBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setBlendTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBlendTime" }
        }
      val setCurrentAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setCurrentAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrentAnimation" }
        }
      val setDefaultBlendTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setDefaultBlendTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDefaultBlendTime" }
        }
      val setRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setRoot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRoot" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "setSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpeedScale" }
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
