// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
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
    val _ret = __method_bind.get_data.call(this.toVariant())
    TODO()
  }

  fun getFormat(): Format {
    val _ret = __method_bind.get_format.call(this.toVariant())
    TODO()
  }

  fun getLoopBegin(): Int {
    val _ret = __method_bind.get_loop_begin.call(this.toVariant())
    TODO()
  }

  fun getLoopEnd(): Int {
    val _ret = __method_bind.get_loop_end.call(this.toVariant())
    TODO()
  }

  fun getLoopMode(): LoopMode {
    val _ret = __method_bind.get_loop_mode.call(this.toVariant())
    TODO()
  }

  fun getMixRate(): Int {
    val _ret = __method_bind.get_mix_rate.call(this.toVariant())
    TODO()
  }

  fun isStereo(): Boolean {
    val _ret = __method_bind.is_stereo.call(this.toVariant())
    TODO()
  }

  fun saveToWav(path: String): Error {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.save_to_wav.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setData(data: PoolByteArray) {
    val _args = VariantArray.new()
    _args.append(data)
    val _ret = __method_bind.set_data.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFormat(format: Int) {
    val _args = VariantArray.new()
    _args.append(format)
    val _ret = __method_bind.set_format.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLoopBegin(loopBegin: Int) {
    val _args = VariantArray.new()
    _args.append(loopBegin)
    val _ret = __method_bind.set_loop_begin.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLoopEnd(loopEnd: Int) {
    val _args = VariantArray.new()
    _args.append(loopEnd)
    val _ret = __method_bind.set_loop_end.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLoopMode(loopMode: Int) {
    val _args = VariantArray.new()
    _args.append(loopMode)
    val _ret = __method_bind.set_loop_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setMixRate(mixRate: Int) {
    val _args = VariantArray.new()
    _args.append(mixRate)
    val _ret = __method_bind.set_mix_rate.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setStereo(stereo: Boolean) {
    val _args = VariantArray.new()
    _args.append(stereo)
    val _ret = __method_bind.set_stereo.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class LoopMode(
    val value: Int
  ) {
    LOOP_DISABLED(0),

    LOOP_FORWARD(1),

    LOOP_PING_PONG(2),

    LOOP_BACKWARD(3);

    companion object {
      fun from(value: Int): LoopMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Format(
    val value: Int
  ) {
    FORMAT_8_BITS(0),

    FORMAT_16_BITS(1),

    FORMAT_IMA_ADPCM(2);

    companion object {
      fun from(value: Int): Format {
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
    fun from(ptr: COpaquePointer): AudioStreamSample = AudioStreamSample(ptr)
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
