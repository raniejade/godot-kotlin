// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
  }

  fun getFftSize(): FFT_Size {
    val _ret = __method_bind.getFftSize.call(this._handle)
    return AudioEffectPitchShift.FFT_Size.from(_ret.asInt())
  }

  fun getOversampling(): Int {
    val _ret = __method_bind.getOversampling.call(this._handle)
    return _ret.asInt()
  }

  fun getPitchScale(): Float {
    val _ret = __method_bind.getPitchScale.call(this._handle)
    return _ret.asFloat()
  }

  fun setFftSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setFftSize.call(this._handle, listOf(_arg))
  }

  fun setOversampling(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setOversampling.call(this._handle, listOf(_arg))
  }

  fun setPitchScale(rate: Float) {
    val _arg = Variant.new(rate)
    __method_bind.setPitchScale.call(this._handle, listOf(_arg))
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
    internal fun __new(): COpaquePointer = memScoped {
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
      val getFftSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "get_fft_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fft_size" }
        }
      val getOversampling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "get_oversampling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_oversampling" }
        }
      val getPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "get_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
        }
      val setFftSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "set_fft_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fft_size" }
        }
      val setOversampling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "set_oversampling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_oversampling" }
        }
      val setPitchScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "set_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
        }}
  }
}
