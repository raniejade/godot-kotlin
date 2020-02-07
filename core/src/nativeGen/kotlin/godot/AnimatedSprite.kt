// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
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
    val _ret = __method_bind.getAnimation.call(this._handle)
    return _ret.asString()
  }

  fun getFrame(): Int {
    val _ret = __method_bind.getFrame.call(this._handle)
    return _ret.asInt()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.getSpeedScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpriteFrames(): SpriteFrames {
    val _ret = __method_bind.getSpriteFrames.call(this._handle)
    return _ret.asObject(::SpriteFrames)!!
  }

  fun isCentered(): Boolean {
    val _ret = __method_bind.isCentered.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.isFlippedH.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.isFlippedV.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.isPlaying.call(this._handle)
    return _ret.asBoolean()
  }

  fun play(anim: String = "", backwards: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(backwards))
    __method_bind.play.call(this._handle, _args)
  }

  fun setAnimation(animation: String) {
    val _arg = Variant(animation)
    __method_bind.setAnimation.call(this._handle, listOf(_arg))
  }

  fun setCentered(centered: Boolean) {
    val _arg = Variant(centered)
    __method_bind.setCentered.call(this._handle, listOf(_arg))
  }

  fun setFlipH(flipH: Boolean) {
    val _arg = Variant(flipH)
    __method_bind.setFlipH.call(this._handle, listOf(_arg))
  }

  fun setFlipV(flipV: Boolean) {
    val _arg = Variant(flipV)
    __method_bind.setFlipV.call(this._handle, listOf(_arg))
  }

  fun setFrame(frame: Int) {
    val _arg = Variant(frame)
    __method_bind.setFrame.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setSpeedScale(speedScale: Float) {
    val _arg = Variant(speedScale)
    __method_bind.setSpeedScale.call(this._handle, listOf(_arg))
  }

  fun setSpriteFrames(spriteFrames: SpriteFrames) {
    val _arg = Variant(spriteFrames)
    __method_bind.setSpriteFrames.call(this._handle, listOf(_arg))
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation" }
        }
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
        }
      val getSpriteFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "get_sprite_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sprite_frames" }
        }
      val isCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_centered" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_flipped_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_flipped_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val setAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation" }
        }
      val setCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_centered" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_flip_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_flip_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
        }
      val setSpriteFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "set_sprite_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sprite_frames" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
