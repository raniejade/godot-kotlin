// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamRandomPitch internal constructor(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  fun getAudioStream(): AudioStream {
    TODO()
  }

  fun getRandomPitch(): Float {
    TODO()
  }

  fun setAudioStream() {
    TODO()
  }

  fun setRandomPitch() {
    TODO()
  }

  companion object {
    fun new(): AudioStreamRandomPitch = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamRandomPitch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioStreamRandomPitch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamRandomPitch(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioStreamRandomPitch
     */
    private object __method_bind {
      val get_audio_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "get_audio_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_audio_stream" }
            }
          }

      val get_random_pitch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "get_random_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_random_pitch" }
            }
          }

      val set_audio_stream: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "set_audio_stream".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_audio_stream" }
            }
          }

      val set_random_pitch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamRandomPitch".cstr.ptr,
              "set_random_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_random_pitch" }
            }
          }
    }
  }
}
