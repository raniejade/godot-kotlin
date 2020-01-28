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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimatedSprite(
  _handle: COpaquePointer
) : Node2D(_handle) {
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

  var playing: Boolean
    get() {
       return _isPlaying() 
    }
    set(value) {
      _setPlaying(value)
    }

  var speedScale: Float
    get() {
       return getSpeedScale() 
    }
    set(value) {
      setSpeedScale(value)
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

  fun play(anim: String, backwards: Boolean) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(backwards)
    __method_bind.play.call(this._handle, _args.toVariant(), 2)
  }

  fun setAnimation(animation: String) {
    val _arg = Variant.new(animation)
    __method_bind.setAnimation.call(this._handle, _arg, 1)
  }

  fun setCentered(centered: Boolean) {
    val _arg = Variant.new(centered)
    __method_bind.setCentered.call(this._handle, _arg, 1)
  }

  fun setFlipH(flipH: Boolean) {
    val _arg = Variant.new(flipH)
    __method_bind.setFlipH.call(this._handle, _arg, 1)
  }

  fun setFlipV(flipV: Boolean) {
    val _arg = Variant.new(flipV)
    __method_bind.setFlipV.call(this._handle, _arg, 1)
  }

  fun setFrame(frame: Int) {
    val _arg = Variant.new(frame)
    __method_bind.setFrame.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setSpeedScale(speedScale: Float) {
    val _arg = Variant.new(speedScale)
    __method_bind.setSpeedScale.call(this._handle, _arg, 1)
  }

  fun setSpriteFrames(spriteFrames: SpriteFrames) {
    val _arg = Variant.new(spriteFrames)
    __method_bind.setSpriteFrames.call(this._handle, _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    fun new(): AnimatedSprite = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedSprite".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimatedSprite" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimatedSprite(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimatedSprite = AnimatedSprite(ptr)
    /**
     * Container for method_bind pointers for AnimatedSprite
     */
    private object __method_bind {
      val getAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "getAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimation" }
        }
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "getFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrame" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "getSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpeedScale" }
        }
      val getSpriteFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "getSpriteFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpriteFrames" }
        }
      val isCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "isCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCentered" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "isFlippedH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedH" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "isFlippedV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedV" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "isPlaying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPlaying" }
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
            "setAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnimation" }
        }
      val setCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "setCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCentered" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "setFlipH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipH" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "setFlipV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipV" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "setFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrame" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "setSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpeedScale" }
        }
      val setSpriteFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
            "setSpriteFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpriteFrames" }
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
