// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectSpectrumAnalyzer internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getBufferLength(): Float {
    val _ret = __method_bind.get_buffer_length.call(this.toVariant())
    TODO()
  }

  fun getFftSize(): FFT_Size {
    val _ret = __method_bind.get_fft_size.call(this.toVariant())
    TODO()
  }

  fun getTapBackPos(): Float {
    val _ret = __method_bind.get_tap_back_pos.call(this.toVariant())
    TODO()
  }

  fun setBufferLength(seconds: Float) {
    val _args = VariantArray.new()
    _args.append(seconds)
    val _ret = __method_bind.set_buffer_length.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFftSize(size: Int) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.set_fft_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTapBackPos(seconds: Float) {
    val _args = VariantArray.new()
    _args.append(seconds)
    val _ret = __method_bind.set_tap_back_pos.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class FFT_Size(
    val value: Int
  ) {
    FFT_SIZE_256(0),

    FFT_SIZE_512(1),

    FFT_SIZE_1024(2),

    FFT_SIZE_2048(3),

    FFT_SIZE_4096(4),

    FFT_SIZE_MAX(5);

    companion object {
      fun from(value: Int): FFT_Size {
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
    val FFT_SIZE_1024: Int = 2

    val FFT_SIZE_2048: Int = 3

    val FFT_SIZE_256: Int = 0

    val FFT_SIZE_4096: Int = 4

    val FFT_SIZE_512: Int = 1

    val FFT_SIZE_MAX: Int = 5

    fun new(): AudioEffectSpectrumAnalyzer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectSpectrumAnalyzer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectSpectrumAnalyzer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectSpectrumAnalyzer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectSpectrumAnalyzer = AudioEffectSpectrumAnalyzer(ptr)
    /**
     * Container for method_bind pointers for AudioEffectSpectrumAnalyzer
     */
    private object __method_bind {
      val get_buffer_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "get_buffer_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buffer_length" }
            }
          }

      val get_fft_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "get_fft_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fft_size" }
            }
          }

      val get_tap_back_pos: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "get_tap_back_pos".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap_back_pos" }
            }
          }

      val set_buffer_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "set_buffer_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_buffer_length" }
            }
          }

      val set_fft_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "set_fft_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fft_size" }
            }
          }

      val set_tap_back_pos: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "set_tap_back_pos".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap_back_pos" }
            }
          }
    }
  }
}
