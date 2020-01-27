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
  fun addAnimation(name: String, animation: Animation): GDError {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(animation)
    val _ret = __method_bind.add_animation.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun advance(delta: Float) {
    val _arg = Variant.new(delta)
    __method_bind.advance.call(this._handle, _arg, 1)
  }

  fun animationGetNext(animFrom: String): String {
    val _arg = Variant.new(animFrom)
    val _ret = __method_bind.animation_get_next.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun animationSetNext(animFrom: String, animTo: String) {
    val _args = VariantArray.new()
    _args.append(animFrom)
    _args.append(animTo)
    __method_bind.animation_set_next.call(this._handle, _args.toVariant(), 2)
  }

  fun clearCaches() {
    __method_bind.clear_caches.call(this._handle)
  }

  fun clearQueue() {
    __method_bind.clear_queue.call(this._handle)
  }

  fun findAnimation(animation: Animation): String {
    val _arg = Variant.new(animation)
    val _ret = __method_bind.find_animation.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getAnimation(name: String): Animation {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_animation.call(this._handle, _arg, 1)
    return _ret.asObject(::Animation)!!
  }

  fun getAnimationList(): PoolStringArray {
    val _ret = __method_bind.get_animation_list.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getAnimationProcessMode(): AnimationProcessMode {
    val _ret = __method_bind.get_animation_process_mode.call(this._handle)
    return AnimationPlayer.AnimationProcessMode.from(_ret.asInt())
  }

  fun getAssignedAnimation(): String {
    val _ret = __method_bind.get_assigned_animation.call(this._handle)
    return _ret.asString()
  }

  fun getAutoplay(): String {
    val _ret = __method_bind.get_autoplay.call(this._handle)
    return _ret.asString()
  }

  fun getBlendTime(animFrom: String, animTo: String): Float {
    val _args = VariantArray.new()
    _args.append(animFrom)
    _args.append(animTo)
    val _ret = __method_bind.get_blend_time.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun getCurrentAnimation(): String {
    val _ret = __method_bind.get_current_animation.call(this._handle)
    return _ret.asString()
  }

  fun getCurrentAnimationLength(): Float {
    val _ret = __method_bind.get_current_animation_length.call(this._handle)
    return _ret.asFloat()
  }

  fun getCurrentAnimationPosition(): Float {
    val _ret = __method_bind.get_current_animation_position.call(this._handle)
    return _ret.asFloat()
  }

  fun getDefaultBlendTime(): Float {
    val _ret = __method_bind.get_default_blend_time.call(this._handle)
    return _ret.asFloat()
  }

  fun getPlayingSpeed(): Float {
    val _ret = __method_bind.get_playing_speed.call(this._handle)
    return _ret.asFloat()
  }

  fun getQueue(): PoolStringArray {
    val _ret = __method_bind.get_queue.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getRoot(): NodePath {
    val _ret = __method_bind.get_root.call(this._handle)
    return _ret.asNodePath()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.get_speed_scale.call(this._handle)
    return _ret.asFloat()
  }

  fun hasAnimation(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_animation.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.is_active.call(this._handle)
    return _ret.asBool()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.is_playing.call(this._handle)
    return _ret.asBool()
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
    __method_bind.play_backwards.call(this._handle, _args.toVariant(), 2)
  }

  fun queue(name: String) {
    val _arg = Variant.new(name)
    __method_bind.queue.call(this._handle, _arg, 1)
  }

  fun removeAnimation(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_animation.call(this._handle, _arg, 1)
  }

  fun renameAnimation(name: String, newname: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newname)
    __method_bind.rename_animation.call(this._handle, _args.toVariant(), 2)
  }

  fun seek(seconds: Float, update: Boolean) {
    val _args = VariantArray.new()
    _args.append(seconds)
    _args.append(update)
    __method_bind.seek.call(this._handle, _args.toVariant(), 2)
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.set_active.call(this._handle, _arg, 1)
  }

  fun setAnimationProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_animation_process_mode.call(this._handle, _arg, 1)
  }

  fun setAssignedAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.set_assigned_animation.call(this._handle, _arg, 1)
  }

  fun setAutoplay(name: String) {
    val _arg = Variant.new(name)
    __method_bind.set_autoplay.call(this._handle, _arg, 1)
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
    __method_bind.set_blend_time.call(this._handle, _args.toVariant(), 3)
  }

  fun setCurrentAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.set_current_animation.call(this._handle, _arg, 1)
  }

  fun setDefaultBlendTime(sec: Float) {
    val _arg = Variant.new(sec)
    __method_bind.set_default_blend_time.call(this._handle, _arg, 1)
  }

  fun setRoot(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.set_root.call(this._handle, _arg, 1)
  }

  fun setSpeedScale(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.set_speed_scale.call(this._handle, _arg, 1)
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
      val add_animation: CPointer<godot_method_bind>
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
      val animation_get_next: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "animation_get_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_get_next" }
        }
      val animation_set_next: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "animation_set_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method animation_set_next" }
        }
      val clear_caches: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "clear_caches".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_caches" }
        }
      val clear_queue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "clear_queue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_queue" }
        }
      val find_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "find_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_animation" }
        }
      val get_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation" }
        }
      val get_animation_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_animation_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_list" }
        }
      val get_animation_process_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
        }
      val get_assigned_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_assigned_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_assigned_animation" }
        }
      val get_autoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_autoplay" }
        }
      val get_blend_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_time" }
        }
      val get_current_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_current_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_animation" }
        }
      val get_current_animation_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_current_animation_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_animation_length" }
        }
      val get_current_animation_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_current_animation_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_animation_position" }
        }
      val get_default_blend_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_default_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_blend_time" }
        }
      val get_playing_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_playing_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_playing_speed" }
        }
      val get_queue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_queue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_queue" }
        }
      val get_root: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root" }
        }
      val get_speed_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val has_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "has_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_animation" }
        }
      val is_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val is_playing: CPointer<godot_method_bind>
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
      val play_backwards: CPointer<godot_method_bind>
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
      val remove_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "remove_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_animation" }
        }
      val rename_animation: CPointer<godot_method_bind>
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
      val set_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val set_animation_process_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_animation_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
        }
      val set_assigned_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_assigned_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_assigned_animation" }
        }
      val set_autoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
        }
      val set_blend_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_time" }
        }
      val set_current_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_current_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_animation" }
        }
      val set_default_blend_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_default_blend_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_blend_time" }
        }
      val set_root: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
            "set_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_root" }
        }
      val set_speed_scale: CPointer<godot_method_bind>
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
