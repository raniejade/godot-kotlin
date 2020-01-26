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

open class AudioStreamPlayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  enum class MixTarget(
    val value: Int
  ) {
    MIX_TARGET_STEREO(0),

    MIX_TARGET_SURROUND(1),

    MIX_TARGET_CENTER(2);
  }

  companion object {
    val MIX_TARGET_CENTER: Int = 2

    val MIX_TARGET_STEREO: Int = 0

    val MIX_TARGET_SURROUND: Int = 1

    fun new(): AudioStreamPlayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioStreamPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamPlayer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioStreamPlayer
     */
    private object __method_bind {
      val _bus_layout_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "_bus_layout_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _bus_layout_changed" }
            }
          }

      val _is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _is_active" }
            }
          }

      val _set_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "_set_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_playing" }
            }
          }

      val get_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus" }
            }
          }

      val get_mix_target: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_mix_target".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_target" }
            }
          }

      val get_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
            }
          }

      val get_playback_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_playback_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_playback_position" }
            }
          }

      val get_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream" }
            }
          }

      val get_stream_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_paused" }
            }
          }

      val get_stream_playback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_stream_playback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_playback" }
            }
          }

      val get_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "get_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
            }
          }

      val is_autoplay_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "is_autoplay_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_autoplay_enabled" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val set_autoplay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val set_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "set_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus" }
            }
          }

      val set_mix_target: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "set_mix_target".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mix_target" }
            }
          }

      val set_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "set_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
            }
          }

      val set_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "set_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream" }
            }
          }

      val set_stream_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "set_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream_paused" }
            }
          }

      val set_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "set_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
