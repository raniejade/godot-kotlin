// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class AnimatedSprite internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getAnimation(): String {
    TODO()
  }

  fun getFrame(): Int {
    TODO()
  }

  fun getOffset(): Vector2 {
    TODO()
  }

  fun getSpeedScale(): Float {
    TODO()
  }

  fun getSpriteFrames(): SpriteFrames {
    TODO()
  }

  fun isCentered(): Boolean {
    TODO()
  }

  fun isFlippedH(): Boolean {
    TODO()
  }

  fun isFlippedV(): Boolean {
    TODO()
  }

  fun isPlaying(): Boolean {
    TODO()
  }

  fun play() {
    TODO()
  }

  fun setAnimation() {
    TODO()
  }

  fun setCentered() {
    TODO()
  }

  fun setFlipH() {
    TODO()
  }

  fun setFlipV() {
    TODO()
  }

  fun setFrame() {
    TODO()
  }

  fun setOffset() {
    TODO()
  }

  fun setSpeedScale() {
    TODO()
  }

  fun setSpriteFrames() {
    TODO()
  }

  fun stop() {
    TODO()
  }

  companion object {
    fun new(): AnimatedSprite = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedSprite".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimatedSprite" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimatedSprite(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimatedSprite
     */
    private object __method_bind {
      val get_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "get_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation" }
            }
          }

      val get_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val get_sprite_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "get_sprite_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sprite_frames" }
            }
          }

      val is_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "is_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_centered" }
            }
          }

      val is_flipped_h: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "is_flipped_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
            }
          }

      val is_flipped_v: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "is_flipped_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val set_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation" }
            }
          }

      val set_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_centered" }
            }
          }

      val set_flip_h: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_flip_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
            }
          }

      val set_flip_v: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_flip_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
            }
          }

      val set_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val set_sprite_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "set_sprite_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sprite_frames" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedSprite".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
