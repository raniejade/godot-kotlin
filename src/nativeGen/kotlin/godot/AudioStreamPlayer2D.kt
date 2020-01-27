// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class AudioStreamPlayer2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getAreaMask(): Int {
    val _ret = __method_bind.get_area_mask.call(this.toVariant())
    TODO()
  }

  fun getAttenuation(): Float {
    val _ret = __method_bind.get_attenuation.call(this.toVariant())
    TODO()
  }

  fun getBus(): String {
    val _ret = __method_bind.get_bus.call(this.toVariant())
    TODO()
  }

  fun getMaxDistance(): Float {
    val _ret = __method_bind.get_max_distance.call(this.toVariant())
    TODO()
  }

  fun getPitchScale(): Float {
    val _ret = __method_bind.get_pitch_scale.call(this.toVariant())
    TODO()
  }

  fun getPlaybackPosition(): Float {
    val _ret = __method_bind.get_playback_position.call(this.toVariant())
    TODO()
  }

  fun getStream(): AudioStream {
    val _ret = __method_bind.get_stream.call(this.toVariant())
    TODO()
  }

  fun getStreamPaused(): Boolean {
    val _ret = __method_bind.get_stream_paused.call(this.toVariant())
    TODO()
  }

  fun getStreamPlayback(): AudioStreamPlayback {
    val _ret = __method_bind.get_stream_playback.call(this.toVariant())
    TODO()
  }

  fun getVolumeDb(): Float {
    val _ret = __method_bind.get_volume_db.call(this.toVariant())
    TODO()
  }

  fun isAutoplayEnabled(): Boolean {
    val _ret = __method_bind.is_autoplay_enabled.call(this.toVariant())
    TODO()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.is_playing.call(this.toVariant())
    TODO()
  }

  fun play(fromPosition: Float) {
    val _args = VariantArray.new()
    _args.append(fromPosition)
    val _ret = __method_bind.play.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun seek(toPosition: Float) {
    val _args = VariantArray.new()
    _args.append(toPosition)
    val _ret = __method_bind.seek.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setAreaMask(mask: Int) {
    val _args = VariantArray.new()
    _args.append(mask)
    val _ret = __method_bind.set_area_mask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setAttenuation(curve: Float) {
    val _args = VariantArray.new()
    _args.append(curve)
    val _ret = __method_bind.set_attenuation.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setAutoplay(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_autoplay.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBus(bus: String) {
    val _args = VariantArray.new()
    _args.append(bus)
    val _ret = __method_bind.set_bus.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setMaxDistance(pixels: Float) {
    val _args = VariantArray.new()
    _args.append(pixels)
    val _ret = __method_bind.set_max_distance.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPitchScale(pitchScale: Float) {
    val _args = VariantArray.new()
    _args.append(pitchScale)
    val _ret = __method_bind.set_pitch_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setStream(stream: AudioStream) {
    val _args = VariantArray.new()
    _args.append(stream)
    val _ret = __method_bind.set_stream.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setStreamPaused(pause: Boolean) {
    val _args = VariantArray.new()
    _args.append(pause)
    val _ret = __method_bind.set_stream_paused.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVolumeDb(volumeDb: Float) {
    val _args = VariantArray.new()
    _args.append(volumeDb)
    val _ret = __method_bind.set_volume_db.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun stop() {
    val _ret = __method_bind.stop.call(this.toVariant())
    TODO()
  }

  companion object {
    fun new(): AudioStreamPlayer2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioStreamPlayer2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamPlayer2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioStreamPlayer2D = AudioStreamPlayer2D(ptr)
    /**
     * Container for method_bind pointers for AudioStreamPlayer2D
     */
    private object __method_bind {
      val get_area_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_area_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_area_mask" }
            }
          }

      val get_attenuation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_attenuation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attenuation" }
            }
          }

      val get_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bus" }
            }
          }

      val get_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
            }
          }

      val get_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
            }
          }

      val get_playback_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_playback_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_playback_position" }
            }
          }

      val get_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream" }
            }
          }

      val get_stream_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_paused" }
            }
          }

      val get_stream_playback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_stream_playback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_playback" }
            }
          }

      val get_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "get_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
            }
          }

      val is_autoplay_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "is_autoplay_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_autoplay_enabled" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val play: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "play".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method play" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val set_area_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_area_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_area_mask" }
            }
          }

      val set_attenuation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_attenuation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_attenuation" }
            }
          }

      val set_autoplay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_autoplay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
            }
          }

      val set_bus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_bus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bus" }
            }
          }

      val set_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
            }
          }

      val set_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
            }
          }

      val set_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream" }
            }
          }

      val set_stream_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_stream_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream_paused" }
            }
          }

      val set_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "set_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
