// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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
    val _ret = __method_bind.get_data.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun getFormat(): Format {
    val _ret = __method_bind.get_format.call(this._handle)
    return AudioStreamSample.Format.from(_ret.asInt())
  }

  fun getLoopBegin(): Int {
    val _ret = __method_bind.get_loop_begin.call(this._handle)
    return _ret.asInt()
  }

  fun getLoopEnd(): Int {
    val _ret = __method_bind.get_loop_end.call(this._handle)
    return _ret.asInt()
  }

  fun getLoopMode(): LoopMode {
    val _ret = __method_bind.get_loop_mode.call(this._handle)
    return AudioStreamSample.LoopMode.from(_ret.asInt())
  }

  fun getMixRate(): Int {
    val _ret = __method_bind.get_mix_rate.call(this._handle)
    return _ret.asInt()
  }

  fun isStereo(): Boolean {
    val _ret = __method_bind.is_stereo.call(this._handle)
    return _ret.asBool()
  }

  fun saveToWav(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.save_to_wav.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setData(data: PoolByteArray) {
    val _arg = Variant.new(data)
    __method_bind.set_data.call(this._handle, _arg, 1)
  }

  fun setFormat(format: Int) {
    val _arg = Variant.new(format)
    __method_bind.set_format.call(this._handle, _arg, 1)
  }

  fun setLoopBegin(loopBegin: Int) {
    val _arg = Variant.new(loopBegin)
    __method_bind.set_loop_begin.call(this._handle, _arg, 1)
  }

  fun setLoopEnd(loopEnd: Int) {
    val _arg = Variant.new(loopEnd)
    __method_bind.set_loop_end.call(this._handle, _arg, 1)
  }

  fun setLoopMode(loopMode: Int) {
    val _arg = Variant.new(loopMode)
    __method_bind.set_loop_mode.call(this._handle, _arg, 1)
  }

  fun setMixRate(mixRate: Int) {
    val _arg = Variant.new(mixRate)
    __method_bind.set_mix_rate.call(this._handle, _arg, 1)
  }

  fun setStereo(stereo: Boolean) {
    val _arg = Variant.new(stereo)
    __method_bind.set_stereo.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for AudioStreamSample" }
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
      val get_data: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val get_format: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val get_loop_begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_loop_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_begin" }
        }
      val get_loop_end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_loop_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_end" }
        }
      val get_loop_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_loop_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_mode" }
        }
      val get_mix_rate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "get_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
        }
      val is_stereo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "is_stereo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stereo" }
        }
      val save_to_wav: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "save_to_wav".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_to_wav" }
        }
      val set_data: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data" }
        }
      val set_format: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_format" }
        }
      val set_loop_begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_loop_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_begin" }
        }
      val set_loop_end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_loop_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_end" }
        }
      val set_loop_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_loop_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_mode" }
        }
      val set_mix_rate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mix_rate" }
        }
      val set_stereo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
            "set_stereo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stereo" }
        }}
  }
}
