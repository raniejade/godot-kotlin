// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamSample internal constructor(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  fun getData(): PoolByteArray {
    TODO()
  }

  fun getFormat(): Format {
    TODO()
  }

  fun getLoopBegin(): Int {
    TODO()
  }

  fun getLoopEnd(): Int {
    TODO()
  }

  fun getLoopMode(): LoopMode {
    TODO()
  }

  fun getMixRate(): Int {
    TODO()
  }

  fun isStereo(): Boolean {
    TODO()
  }

  fun saveToWav(): Error {
    TODO()
  }

  fun setData() {
    TODO()
  }

  fun setFormat() {
    TODO()
  }

  fun setLoopBegin() {
    TODO()
  }

  fun setLoopEnd() {
    TODO()
  }

  fun setLoopMode() {
    TODO()
  }

  fun setMixRate() {
    TODO()
  }

  fun setStereo() {
    TODO()
  }

  enum class LoopMode(
    val value: Int
  ) {
    LOOP_DISABLED(0),

    LOOP_FORWARD(1),

    LOOP_PING_PONG(2),

    LOOP_BACKWARD(3);
  }

  enum class Format(
    val value: Int
  ) {
    FORMAT_8_BITS(0),

    FORMAT_16_BITS(1),

    FORMAT_IMA_ADPCM(2);
  }

  companion object {
    val FORMAT_16_BITS: Int = 1

    val FORMAT_8_BITS: Int = 0

    val FORMAT_IMA_ADPCM: Int = 2

    val LOOP_BACKWARD: Int = 3

    val LOOP_DISABLED: Int = 0

    val LOOP_FORWARD: Int = 1

    val LOOP_PING_PONG: Int = 2

    fun new(): AudioStreamSample = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamSample".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioStreamSample" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamSample(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioStreamSample
     */
    private object __method_bind {
      val get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val get_loop_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_loop_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loop_begin" }
            }
          }

      val get_loop_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_loop_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loop_end" }
            }
          }

      val get_loop_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_loop_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loop_mode" }
            }
          }

      val get_mix_rate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
            }
          }

      val is_stereo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "is_stereo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_stereo" }
            }
          }

      val save_to_wav: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "save_to_wav".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_to_wav" }
            }
          }

      val set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data" }
            }
          }

      val set_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_format" }
            }
          }

      val set_loop_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_loop_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop_begin" }
            }
          }

      val set_loop_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_loop_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop_end" }
            }
          }

      val set_loop_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_loop_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop_mode" }
            }
          }

      val set_mix_rate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mix_rate" }
            }
          }

      val set_stereo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_stereo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stereo" }
            }
          }
    }
  }
}
