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

open class AudioEffectSpectrumAnalyzer(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  var bufferLength: Float
    get() {
       return getBufferLength() 
    }
    set(value) {
      setBufferLength(value)
    }

  var fftSize: FFT_Size
    get() {
       return getFftSize() 
    }
    set(value) {
      setFftSize(value.value)
    }

  var tapBackPos: Float
    get() {
       return getTapBackPos() 
    }
    set(value) {
      setTapBackPos(value)
    }

  fun getBufferLength(): Float {
    val _ret = __method_bind.getBufferLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getFftSize(): FFT_Size {
    val _ret = __method_bind.getFftSize.call(this._handle)
    return AudioEffectSpectrumAnalyzer.FFT_Size.from(_ret.asInt())
  }

  fun getTapBackPos(): Float {
    val _ret = __method_bind.getTapBackPos.call(this._handle)
    return _ret.asFloat()
  }

  fun setBufferLength(seconds: Float) {
    val _arg = Variant.new(seconds)
    __method_bind.setBufferLength.call(this._handle, _arg, 1)
  }

  fun setFftSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setFftSize.call(this._handle, _arg, 1)
  }

  fun setTapBackPos(seconds: Float) {
    val _arg = Variant.new(seconds)
    __method_bind.setTapBackPos.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for AudioEffectSpectrumAnalyzer" }
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
      val getBufferLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
            "get_buffer_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buffer_length" }
        }
      val getFftSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
            "get_fft_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fft_size" }
        }
      val getTapBackPos: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
            "get_tap_back_pos".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap_back_pos" }
        }
      val setBufferLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
            "set_buffer_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_buffer_length" }
        }
      val setFftSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
            "set_fft_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fft_size" }
        }
      val setTapBackPos: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
            "set_tap_back_pos".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap_back_pos" }
        }}
  }
}
