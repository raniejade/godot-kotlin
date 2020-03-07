// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class AudioEffectSpectrumAnalyzerInstance(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffectInstance(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getMagnitudeForFrequencyRange(
    fromHz: Float,
    toHz: Float,
    mode: Int = 1
  ): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(fromHz)
      _args.add(toHz)
      _args.add(mode)
      __method_bind.getMagnitudeForFrequencyRange.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  enum class MagnitudeMode(
    val value: Int
  ) {
    AVERAGE(0),

    MAX(1);

    companion object {
      fun from(value: Int): MagnitudeMode {
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
    /**
     * Container for method_bind pointers for AudioEffectSpectrumAnalyzerInstance
     */
    private object __method_bind {
      val getMagnitudeForFrequencyRange: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectSpectrumAnalyzerInstance".cstr.ptr,
              "get_magnitude_for_frequency_range".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_magnitude_for_frequency_range" }
            }
          }
    }
  }
}
