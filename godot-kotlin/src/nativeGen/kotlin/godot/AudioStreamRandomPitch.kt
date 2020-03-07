// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class AudioStreamRandomPitch(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioStream(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAudioStream(): AudioStream {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AudioStream
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getAudioStream.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<AudioStream>(_tmp.value!!)
      _ret
    }
  }

  fun getRandomPitch(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRandomPitch.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setAudioStream(stream: AudioStream) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAudioStream.call(self._handle, listOf(stream), null)
    }
  }

  fun setRandomPitch(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRandomPitch.call(self._handle, listOf(scale), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamRandomPitch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamRandomPitch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioStreamRandomPitch
     */
    private object __method_bind {
      val getAudioStream: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "get_audio_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_audio_stream" }
            }
          }

      val getRandomPitch: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "get_random_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_random_pitch" }
            }
          }

      val setAudioStream: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "set_audio_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_audio_stream" }
            }
          }

      val setRandomPitch: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "set_random_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_random_pitch" }
            }
          }
    }
  }
}
