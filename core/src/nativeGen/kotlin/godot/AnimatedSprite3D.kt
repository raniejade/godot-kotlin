// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimatedSprite3D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : SpriteBase3D(null) {
  var animation: String
    get() {
       return getAnimation() 
    }
    set(value) {
      setAnimation(value)
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

  /**
   * AnimatedSprite3D::frame_changed signal
   */
  val signalFrameChanged: Signal0 = Signal0("frame_changed")

  constructor() : this(null) {
    _handle = __new()
  }

  fun getAnimation(): String {
    val _ret = __method_bind.getAnimation.call(this._handle)
    return _ret.asString()
  }

  fun getFrame(): Int {
    val _ret = __method_bind.getFrame.call(this._handle)
    return _ret.asInt()
  }

  fun getSpriteFrames(): SpriteFrames {
    val _ret = __method_bind.getSpriteFrames.call(this._handle)
    return _ret.toAny() as SpriteFrames
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.isPlaying.call(this._handle)
    return _ret.asBoolean()
  }

  fun play(anim: String = "") {
    val _arg = Variant(anim)
    __method_bind.play.call(this._handle, listOf(_arg))
  }

  fun setAnimation(animation: String) {
    val _arg = Variant(animation)
    __method_bind.setAnimation.call(this._handle, listOf(_arg))
  }

  fun setFrame(frame: Int) {
    val _arg = Variant(frame)
    __method_bind.setFrame.call(this._handle, listOf(_arg))
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedSprite3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimatedSprite3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimatedSprite3D
     */
    private object __method_bind {
      val getAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "get_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation" }
        }
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val getSpriteFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "get_sprite_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sprite_frames" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val setAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "set_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "set_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame" }
        }
      val setSpriteFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "set_sprite_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sprite_frames" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
