// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationPlayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  enum class AnimationProcessMode(
    val value: Int
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1),

    ANIMATION_PROCESS_MANUAL(2);
  }

  companion object {
    val ANIMATION_PROCESS_IDLE: Int = 1

    val ANIMATION_PROCESS_MANUAL: Int = 2

    val ANIMATION_PROCESS_PHYSICS: Int = 0

    fun new(): AnimationPlayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationPlayer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimationPlayer
     */
    private object __method_bind {
      val _animation_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "_animation_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _animation_changed" }
            }
          }

      val _node_removed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "_node_removed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _node_removed" }
            }
          }

      val add_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "add_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_animation" }
            }
          }

      val advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method advance" }
            }
          }

      val animation_get_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "animation_get_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_get_next" }
            }
          }

      val animation_set_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "animation_set_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method animation_set_next" }
            }
          }

      val clear_caches: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "clear_caches".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_caches" }
            }
          }

      val clear_queue: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "clear_queue".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_queue" }
            }
          }

      val find_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "find_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_animation" }
            }
          }

      val get_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation" }
            }
          }

      val get_animation_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_animation_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_list" }
            }
          }

      val get_animation_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_process_mode" }
            }
          }

      val get_assigned_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_assigned_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_assigned_animation" }
            }
          }

      val get_autoplay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_autoplay" }
            }
          }

      val get_blend_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_time" }
            }
          }

      val get_current_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_current_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_animation" }
            }
          }

      val get_current_animation_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_current_animation_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_animation_length" }
            }
          }

      val get_current_animation_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_current_animation_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_animation_position"
              }
            }
          }

      val get_default_blend_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_default_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_blend_time" }
            }
          }

      val get_playing_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_playing_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_playing_speed" }
            }
          }

      val get_queue: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_queue".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_queue" }
            }
          }

      val get_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root" }
            }
          }

      val get_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val has_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "has_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_animation" }
            }
          }

      val is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val play_backwards: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "play_backwards".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play_backwards" }
            }
          }

      val queue: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "queue".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue" }
            }
          }

      val remove_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "remove_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_animation" }
            }
          }

      val rename_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "rename_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_animation" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val set_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val set_animation_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_animation_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_process_mode" }
            }
          }

      val set_assigned_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_assigned_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_assigned_animation" }
            }
          }

      val set_autoplay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val set_blend_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_time" }
            }
          }

      val set_current_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_current_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_animation" }
            }
          }

      val set_default_blend_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_default_blend_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_blend_time" }
            }
          }

      val set_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_root" }
            }
          }

      val set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationPlayer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
