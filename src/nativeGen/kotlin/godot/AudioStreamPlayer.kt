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

open class AudioStreamPlayer(
  _handle: COpaquePointer
) : Node(_handle) {
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

  var mixTarget: Int
    get() {
       return AudioStreamPlayer.MixTarget.from(getMixTarget()) 
    }
    set(value) {
      setMixTarget(AudioStreamPlayer.MixTarget.from(value))
    }

  var pitchScale: Float
    get() {
       return getPitchScale() 
    }
    set(value) {
      setPitchScale(value)
    }

  var playing: Boolean
    get() {
       return isPlaying() 
    }
    set(value) {
      _setPlaying(value)
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

  fun getBus(): String {
    val _ret = __method_bind.getBus.call(this._handle)
    return _ret.asString()
  }

  fun getMixTarget(): MixTarget {
    val _ret = __method_bind.getMixTarget.call(this._handle)
    return AudioStreamPlayer.MixTarget.from(_ret.asInt())
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

  fun setAutoplay(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoplay.call(this._handle, _arg, 1)
  }

  fun setBus(bus: String) {
    val _arg = Variant.new(bus)
    __method_bind.setBus.call(this._handle, _arg, 1)
  }

  fun setMixTarget(mixTarget: Int) {
    val _arg = Variant.new(mixTarget)
    __method_bind.setMixTarget.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for AudioStreamPlayer" }
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
      val getBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBus" }
        }
      val getMixTarget: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getMixTarget".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMixTarget" }
        }
      val getPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getPitchScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPitchScale" }
        }
      val getPlaybackPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getPlaybackPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlaybackPosition" }
        }
      val getStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStream" }
        }
      val getStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getStreamPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStreamPaused" }
        }
      val getStreamPlayback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getStreamPlayback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStreamPlayback" }
        }
      val getVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "getVolumeDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVolumeDb" }
        }
      val isAutoplayEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "isAutoplayEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAutoplayEnabled" }
        }
      val isPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "isPlaying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPlaying" }
        }
      val play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method play" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setAutoplay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "setAutoplay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutoplay" }
        }
      val setBus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "setBus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBus" }
        }
      val setMixTarget: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "setMixTarget".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMixTarget" }
        }
      val setPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "setPitchScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPitchScale" }
        }
      val setStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "setStream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStream" }
        }
      val setStreamPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "setStreamPaused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStreamPaused" }
        }
      val setVolumeDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "setVolumeDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVolumeDb" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamPlayer".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
