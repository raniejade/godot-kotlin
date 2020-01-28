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

open class AudioStreamPlayer2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var areaMask: Int
    get() {
       return getAreaMask() 
    }
    set(value) {
      setAreaMask(value)
    }

  var attenuation: Float
    get() {
       return getAttenuation() 
    }
    set(value) {
      setAttenuation(value)
    }

  var autoplay: Boolean
    get() {
       return isAutoplayEnabled() 
    }
    set(value) {
      setAutoplay(value)
    }

  var bus: String
    get() {
       return getBus() 
    }
    set(value) {
      setBus(value)
    }

  var maxDistance: Float
    get() {
       return getMaxDistance() 
    }
    set(value) {
      setMaxDistance(value)
    }

  var pitchScale: Float
    get() {
       return getPitchScale() 
    }
    set(value) {
      setPitchScale(value)
    }

  var stream: AudioStream
    get() {
       return getStream() 
    }
    set(value) {
      setStream(value)
    }

  var streamPaused: Boolean
    get() {
       return getStreamPaused() 
    }
    set(value) {
      setStreamPaused(value)
    }

  var volumeDb: Float
    get() {
       return getVolumeDb() 
    }
    set(value) {
      setVolumeDb(value)
    }

  fun getAreaMask(): Int {
    val _ret = __method_bind.getAreaMask.call(this._handle)
    return _ret.asInt()
  }

  fun getAttenuation(): Float {
    val _ret = __method_bind.getAttenuation.call(this._handle)
    return _ret.asFloat()
  }

  fun getBus(): String {
    val _ret = __method_bind.getBus.call(this._handle)
    return _ret.asString()
  }

  fun getMaxDistance(): Float {
    val _ret = __method_bind.getMaxDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getPitchScale(): Float {
    val _ret = __method_bind.getPitchScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getPlaybackPosition(): Float {
    val _ret = __method_bind.getPlaybackPosition.call(this._handle)
    return _ret.asFloat()
  }

  fun getStream(): AudioStream {
    val _ret = __method_bind.getStream.call(this._handle)
    return _ret.asObject(::AudioStream)!!
  }

  fun getStreamPaused(): Boolean {
    val _ret = __method_bind.getStreamPaused.call(this._handle)
    return _ret.asBoolean()
  }

  fun getStreamPlayback(): AudioStreamPlayback {
    val _ret = __method_bind.getStreamPlayback.call(this._handle)
    return _ret.asObject(::AudioStreamPlayback)!!
  }

  fun getVolumeDb(): Float {
    val _ret = __method_bind.getVolumeDb.call(this._handle)
    return _ret.asFloat()
  }

  fun isAutoplayEnabled(): Boolean {
    val _ret = __method_bind.isAutoplayEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPlaying(): Boolean {
    val _ret = __method_bind.isPlaying.call(this._handle)
    return _ret.asBoolean()
  }

  fun play(fromPosition: Float) {
    val _arg = Variant.new(fromPosition)
    __method_bind.play.call(this._handle, _arg, 1)
  }

  fun seek(toPosition: Float) {
    val _arg = Variant.new(toPosition)
    __method_bind.seek.call(this._handle, _arg, 1)
  }

  fun setAreaMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setAreaMask.call(this._handle, _arg, 1)
  }

  fun setAttenuation(curve: Float) {
    val _arg = Variant.new(curve)
    __method_bind.setAttenuation.call(this._handle, _arg, 1)
  }

  fun setAutoplay(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoplay.call(this._handle, _arg, 1)
  }

  fun setBus(bus: String) {
    val _arg = Variant.new(bus)
    __method_bind.setBus.call(this._handle, _arg, 1)
  }

  fun setMaxDistance(pixels: Float) {
    val _arg = Variant.new(pixels)
    __method_bind.setMaxDistance.call(this._handle, _arg, 1)
  }

  fun setPitchScale(pitchScale: Float) {
    val _arg = Variant.new(pitchScale)
    __method_bind.setPitchScale.call(this._handle, _arg, 1)
  }

  fun setStream(stream: AudioStream) {
    val _arg = Variant.new(stream)
    __method_bind.setStream.call(this._handle, _arg, 1)
  }

  fun setStreamPaused(pause: Boolean) {
    val _arg = Variant.new(pause)
    __method_bind.setStreamPaused.call(this._handle, _arg, 1)
  }

  fun setVolumeDb(volumeDb: Float) {
    val _arg = Variant.new(volumeDb)
    __method_bind.setVolumeDb.call(this._handle, _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    fun new(): AudioStreamPlayer2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamPlayer2D" }
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
      val getAreaMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_area_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_area_mask" }
        }
      val getAttenuation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_attenuation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attenuation" }
        }
      val getBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bus" }
        }
      val getMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
        }
      val getPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
        }
      val getPlaybackPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_playback_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_playback_position" }
        }
      val getStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream" }
        }
      val getStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_stream_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_paused" }
        }
      val getStreamPlayback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_stream_playback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_playback" }
        }
      val getVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "get_volume_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
        }
      val isAutoplayEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "is_autoplay_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_autoplay_enabled" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_playing" }
        }
      val play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setAreaMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_area_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_area_mask" }
        }
      val setAttenuation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_attenuation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attenuation" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_autoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autoplay" }
        }
      val setBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_bus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bus" }
        }
      val setMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
        }
      val setPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
        }
      val setStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream" }
        }
      val setStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_stream_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream_paused" }
        }
      val setVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "set_volume_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer2D".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
