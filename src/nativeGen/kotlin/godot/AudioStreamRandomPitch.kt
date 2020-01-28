// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamRandomPitch(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  var audioStream: AudioStream
    get() {
       return getAudioStream() 
    }
    set(value) {
      setAudioStream(value)
    }

  var randomPitch: Float
    get() {
       return getRandomPitch() 
    }
    set(value) {
      setRandomPitch(value)
    }

  fun getAudioStream(): AudioStream {
    val _ret = __method_bind.getAudioStream.call(this._handle)
    return _ret.asObject(::AudioStream)!!
  }

  fun getRandomPitch(): Float {
    val _ret = __method_bind.getRandomPitch.call(this._handle)
    return _ret.asFloat()
  }

  fun setAudioStream(stream: AudioStream) {
    val _arg = Variant.new(stream)
    __method_bind.setAudioStream.call(this._handle, _arg, 1)
  }

  fun setRandomPitch(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setRandomPitch.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioStreamRandomPitch = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamRandomPitch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamRandomPitch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamRandomPitch(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioStreamRandomPitch = AudioStreamRandomPitch(ptr)
    /**
     * Container for method_bind pointers for AudioStreamRandomPitch
     */
    private object __method_bind {
      val getAudioStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
            "get_audio_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_stream" }
        }
      val getRandomPitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
            "get_random_pitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_random_pitch" }
        }
      val setAudioStream: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
            "set_audio_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_audio_stream" }
        }
      val setRandomPitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
            "set_random_pitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_random_pitch" }
        }}
  }
}
