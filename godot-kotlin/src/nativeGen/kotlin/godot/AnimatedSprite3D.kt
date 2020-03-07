// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _is_playing(): Boolean {
    TODO()
  }

  open fun _res_changed() {
    TODO()
  }

  open fun _set_playing(playing: Boolean) {
    TODO()
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

  fun isPlaying(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPlaying.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun play(anim: String = "") {
    val self = this
    return Allocator.allocationScope {
      __method_bind.play.call(self._handle, listOf(anim), null)
    }
  }

  fun setAnimation(animation: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnimation.call(self._handle, listOf(animation), null)
    }
  }

  fun setFrame(frame: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFrame.call(self._handle, listOf(frame), null)
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedSprite3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimatedSprite3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimatedSprite3D
     */
    private object __method_bind {
      val getAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "get_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation" }
            }
          }

      val getFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val getSpriteFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "get_sprite_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sprite_frames" }
            }
          }

      val isPlaying: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val setAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "set_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation" }
            }
          }

      val setFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }

      val setSpriteFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "set_sprite_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sprite_frames" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
