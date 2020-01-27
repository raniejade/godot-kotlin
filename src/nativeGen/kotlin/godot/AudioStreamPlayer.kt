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

open class AudioStreamPlayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getBus(): String {
    val _ret = __method_bind.get_bus.call(this.toVariant())
    return _ret.asString()
  }

  fun getMixTarget(): MixTarget {
    val _ret = __method_bind.get_mix_target.call(this.toVariant())
    return AudioStreamPlayer.MixTarget.from(_ret.asInt())
  }

  fun getPitchScale(): Float {
    val _ret = __method_bind.get_pitch_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPlaybackPosition(): Float {
    val _ret = __method_bind.get_playback_position.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getStream(): AudioStream {
    val _ret = __method_bind.get_stream.call(this.toVariant())
    return _ret.asObject(::AudioStream)!!
  }

  fun getStreamPaused(): Boolean {
    val _ret = __method_bind.get_stream_paused.call(this.toVariant())
    return _ret.asBool()
  }

  fun getStreamPlayback(): AudioStreamPlayback {
    val _ret = __method_bind.get_stream_playback.call(this.toVariant())
    return _ret.asObject(::AudioStreamPlayback)!!
  }

  fun getVolumeDb(): Float {
    val _ret = __method_bind.get_volume_db.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isAutoplayEnabled(): Boolean {
    val _ret = __method_bind.is_autoplay_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.is_playing.call(this.toVariant())
    return _ret.asBool()
  }

  fun play(fromPosition: Float) {
    val _args = VariantArray.new()
    _args.append(fromPosition)
    __method_bind.play.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun seek(toPosition: Float) {
    val _args = VariantArray.new()
    _args.append(toPosition)
    __method_bind.seek.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAutoplay(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_autoplay.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBus(bus: String) {
    val _args = VariantArray.new()
    _args.append(bus)
    __method_bind.set_bus.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMixTarget(mixTarget: Int) {
    val _args = VariantArray.new()
    _args.append(mixTarget)
    __method_bind.set_mix_target.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPitchScale(pitchScale: Float) {
    val _args = VariantArray.new()
    _args.append(pitchScale)
    __method_bind.set_pitch_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setStream(stream: AudioStream) {
    val _args = VariantArray.new()
    _args.append(stream)
    __method_bind.set_stream.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setStreamPaused(pause: Boolean) {
    val _args = VariantArray.new()
    _args.append(pause)
    __method_bind.set_stream_paused.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setVolumeDb(volumeDb: Float) {
    val _args = VariantArray.new()
    _args.append(volumeDb)
    __method_bind.set_volume_db.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun stop() {
    __method_bind.stop.call(this.toVariant())
  }

  enum class MixTarget(
    val value: Int
  ) {
    MIX_TARGET_STEREO(0),

    MIX_TARGET_SURROUND(1),

    MIX_TARGET_CENTER(2);

    companion object {
      fun from(value: Int): MixTarget {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
    fun from(ptr: COpaquePointer): AudioStreamPlayer = AudioStreamPlayer(ptr)
    /**
     * Container for method_bind pointers for AudioStreamPlayer
     */
    private object __method_bind {
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
