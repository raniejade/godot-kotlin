// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimatedTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getFps(): Float {
    TODO()
  }

  fun getFrameDelay(frame: Int): Float {
    TODO()
  }

  fun getFrameTexture(frame: Int): Texture {
    TODO()
  }

  fun getFrames(): Int {
    TODO()
  }

  fun setFps(fps: Float) {
    TODO()
  }

  fun setFrameDelay(frame: Int, delay: Float) {
    TODO()
  }

  fun setFrameTexture(frame: Int, texture: Texture) {
    TODO()
  }

  fun setFrames(frames: Int) {
    TODO()
  }

  companion object {
    val MAX_FRAMES: Int = 256

    fun new(): AnimatedTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimatedTexture" }
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
      val get_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fps" }
            }
          }

      val get_frame_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_frame_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_delay" }
            }
          }

      val get_frame_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_frame_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_texture" }
            }
          }

      val get_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frames" }
            }
          }

      val set_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fps" }
            }
          }

      val set_frame_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_frame_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame_delay" }
            }
          }

      val set_frame_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_frame_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame_texture" }
            }
          }

      val set_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frames" }
            }
          }
    }
  }
}
