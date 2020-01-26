// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimatedSprite3D internal constructor(
  _handle: COpaquePointer
) : SpriteBase3D(_handle) {
  fun getAnimation(): String {
    TODO()
  }

  fun getFrame(): Int {
    TODO()
  }

  fun getSpriteFrames(): SpriteFrames {
    TODO()
  }

  fun isPlaying(): Boolean {
    TODO()
  }

  fun play(anim: String) {
    TODO()
  }

  fun setAnimation(animation: String) {
    TODO()
  }

  fun setFrame(frame: Int) {
    TODO()
  }

  fun setSpriteFrames(sprite_frames: SpriteFrames) {
    TODO()
  }

  fun stop() {
    TODO()
  }

  companion object {
    fun new(): AnimatedSprite3D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedSprite3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimatedSprite3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimatedSprite3D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimatedSprite3D
     */
    private object __method_bind {
      val get_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "get_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation" }
            }
          }

      val get_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val get_sprite_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "get_sprite_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sprite_frames" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val set_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "set_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation" }
            }
          }

      val set_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }

      val set_sprite_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "set_sprite_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sprite_frames" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite3D".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
