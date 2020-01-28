// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimatedTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  var fps: Float
    get() {
       return getFps() 
    }
    set(value) {
      setFps(value)
    }

  var frames: Int
    get() {
       return getFrames() 
    }
    set(value) {
      setFrames(value)
    }

  fun getFps(): Float {
    val _ret = __method_bind.getFps.call(this._handle)
    return _ret.asFloat()
  }

  fun getFrameDelay(frame: Int): Float {
    val _arg = Variant.new(frame)
    val _ret = __method_bind.getFrameDelay.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getFrameTexture(frame: Int): Texture {
    val _arg = Variant.new(frame)
    val _ret = __method_bind.getFrameTexture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getFrames(): Int {
    val _ret = __method_bind.getFrames.call(this._handle)
    return _ret.asInt()
  }

  fun setFps(fps: Float) {
    val _arg = Variant.new(fps)
    __method_bind.setFps.call(this._handle, _arg, 1)
  }

  fun setFrameDelay(frame: Int, delay: Float) {
    val _args = VariantArray.new()
    _args.append(frame)
    _args.append(delay)
    __method_bind.setFrameDelay.call(this._handle, _args.toVariant(), 2)
  }

  fun setFrameTexture(frame: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(frame)
    _args.append(texture)
    __method_bind.setFrameTexture.call(this._handle, _args.toVariant(), 2)
  }

  fun setFrames(frames: Int) {
    val _arg = Variant.new(frames)
    __method_bind.setFrames.call(this._handle, _arg, 1)
  }

  companion object {
    val MAX_FRAMES: Int = 256

    fun new(): AnimatedTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimatedTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimatedTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimatedTexture = AnimatedTexture(ptr)
    /**
     * Container for method_bind pointers for AnimatedTexture
     */
    private object __method_bind {
      val getFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "getFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFps" }
        }
      val getFrameDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "getFrameDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrameDelay" }
        }
      val getFrameTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "getFrameTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrameTexture" }
        }
      val getFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "getFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrames" }
        }
      val setFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "setFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFps" }
        }
      val setFrameDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "setFrameDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrameDelay" }
        }
      val setFrameTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "setFrameTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrameTexture" }
        }
      val setFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
            "setFrames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrames" }
        }}
  }
}
