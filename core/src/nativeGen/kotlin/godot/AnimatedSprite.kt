// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class AnimatedSprite(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var animation: String
    get() {
       return getAnimation() 
    }
    set(value) {
      setAnimation(value)
    }

  var centered: Boolean
    get() {
       return isCentered() 
    }
    set(value) {
      setCentered(value)
    }

  var flipH: Boolean
    get() {
       return isFlippedH() 
    }
    set(value) {
      setFlipH(value)
    }

  var flipV: Boolean
    get() {
       return isFlippedV() 
    }
    set(value) {
      setFlipV(value)
    }

  var frame: Int
    get() {
       return getFrame() 
    }
    set(value) {
      setFrame(value)
    }

  var frames: SpriteFrames
    get() {
       return getSpriteFrames() 
    }
    set(value) {
      setSpriteFrames(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var speedScale: Float
    get() {
       return getSpeedScale() 
    }
    set(value) {
      setSpeedScale(value)
    }

  /**
   * AnimatedSprite::animation_finished signal
   */
  val signalAnimationFinished: Signal0 = Signal0("animation_finished")

  /**
   * AnimatedSprite::frame_changed signal
   */
  val signalFrameChanged: Signal0 = Signal0("frame_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  fun getAnimation(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAnimation.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getFrame(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFrame.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffset.call(self._handle, emptyList(), _retPtr)
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

  fun getSpriteFrames(): SpriteFrames {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: SpriteFrames
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSpriteFrames.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<SpriteFrames>(_tmp.value!!)
      _ret
    }
  }

  fun isCentered(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCentered.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFlippedH(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFlippedH.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFlippedV(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFlippedV.call(self._handle, emptyList(), _retPtr)
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

  fun play(anim: String = "", backwards: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(backwards)
      __method_bind.play.call(self._handle, _args, null)
    }
  }

  fun setAnimation(animation: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnimation.call(self._handle, listOf(animation), null)
    }
  }

  fun setCentered(centered: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCentered.call(self._handle, listOf(centered), null)
    }
  }

  fun setFlipH(flipH: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlipH.call(self._handle, listOf(flipH), null)
    }
  }

  fun setFlipV(flipV: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlipV.call(self._handle, listOf(flipV), null)
    }
  }

  fun setFrame(frame: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFrame.call(self._handle, listOf(frame), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setSpeedScale(speedScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpeedScale.call(self._handle, listOf(speedScale), null)
    }
  }

  fun setSpriteFrames(spriteFrames: SpriteFrames) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpriteFrames.call(self._handle, listOf(spriteFrames), null)
    }
  }

  fun stop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedSprite".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimatedSprite" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimatedSprite
     */
    private object __method_bind {
      val getAnimation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation" }
        }
      val getFrame: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getSpriteFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_sprite_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sprite_frames" }
        }
      val isCentered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_centered" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_flipped_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_flipped_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val setAnimation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation" }
        }
      val setCentered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_centered" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_flip_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_flip_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setSpriteFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_sprite_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sprite_frames" }
        }
      val stop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
