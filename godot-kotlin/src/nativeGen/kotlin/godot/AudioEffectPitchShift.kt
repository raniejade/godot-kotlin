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

open class AudioEffectPitchShift(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  var fftSize: FFT_Size
    get() {
       return getFftSize() 
    }
    set(value) {
      setFftSize(value.value)
    }

  var oversampling: Int
    get() {
       return getOversampling() 
    }
    set(value) {
      setOversampling(value)
    }

  var pitchScale: Float
    get() {
       return getPitchScale() 
    }
    set(value) {
      setPitchScale(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFftSize(): FFT_Size {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFftSize.call(self._handle, emptyList(), _retPtr)
      AudioEffectPitchShift.FFT_Size.from(_ret.value)
    }
  }

  fun getOversampling(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOversampling.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPitchScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPitchScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setFftSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFftSize.call(self._handle, listOf(size), null)
    }
  }

  fun setOversampling(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOversampling.call(self._handle, listOf(amount), null)
    }
  }

  fun setPitchScale(rate: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPitchScale.call(self._handle, listOf(rate), null)
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPitchShift".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectPitchShift" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectPitchShift
     */
    private object __method_bind {
      val getFftSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "get_fft_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fft_size" }
            }
          }

      val getOversampling: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "get_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_oversampling" }
            }
          }

      val getPitchScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "get_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
            }
          }

      val setFftSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "set_fft_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fft_size" }
            }
          }

      val setOversampling: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "set_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_oversampling" }
            }
          }

      val setPitchScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "set_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
            }
          }
    }
  }
}
