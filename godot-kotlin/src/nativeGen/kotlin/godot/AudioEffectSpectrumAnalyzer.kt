// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
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

open class AudioEffectSpectrumAnalyzer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBufferLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBufferLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFftSize(): FFT_Size {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFftSize.call(self._handle, emptyList(), _retPtr)
      AudioEffectSpectrumAnalyzer.FFT_Size.from(_ret.value)
    }
  }

  fun getTapBackPos(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTapBackPos.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setBufferLength(seconds: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBufferLength.call(self._handle, listOf(seconds), null)
    }
  }

  fun setFftSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFftSize.call(self._handle, listOf(size), null)
    }
  }

  fun setTapBackPos(seconds: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTapBackPos.call(self._handle, listOf(seconds), null)
    }
  }

  enum class FFT_Size(
    val value: Int
  ) {
    `256`(0),

    `512`(1),

    `1024`(2),

    `2048`(3),

    `4096`(4),

    MAX(5);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectSpectrumAnalyzer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectSpectrumAnalyzer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectSpectrumAnalyzer
     */
    private object __method_bind {
      val getBufferLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "get_buffer_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buffer_length" }
            }
          }

      val getFftSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "get_fft_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fft_size" }
            }
          }

      val getTapBackPos: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "get_tap_back_pos".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap_back_pos" }
            }
          }

      val setBufferLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "set_buffer_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_buffer_length" }
            }
          }

      val setFftSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "set_fft_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fft_size" }
            }
          }

      val setTapBackPos: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzer".cstr.ptr,
              "set_tap_back_pos".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap_back_pos" }
            }
          }
    }
  }
}
