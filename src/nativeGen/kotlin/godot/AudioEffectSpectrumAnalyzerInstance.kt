// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectSpectrumAnalyzerInstance internal constructor(
  _handle: COpaquePointer
) : AudioEffectInstance(_handle) {
  fun getMagnitudeForFrequencyRange(): Vector2 {
    TODO()
  }

  enum class MagnitudeMode(
    val value: Int
  ) {
    MAGNITUDE_AVERAGE(0),

    MAGNITUDE_MAX(1);
  }

  companion object {
    val MAGNITUDE_AVERAGE: Int = 0

    val MAGNITUDE_MAX: Int = 1

    /**
     * Container for method_bind pointers for AudioEffectSpectrumAnalyzerInstance
     */
    private object __method_bind {
      val get_magnitude_for_frequency_range: CPointer<godot_method_bind> by lazy {
            memScoped {
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
