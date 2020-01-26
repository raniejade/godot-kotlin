// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectSpectrumAnalyzerInstance internal constructor(
  _handle: COpaquePointer
) : AudioEffectInstance(_handle) {
  enum class MagnitudeMode(
    val value: Int
  ) {
    MAGNITUDE_AVERAGE(0),

    MAGNITUDE_MAX(1);
  }

  companion object {
    val MAGNITUDE_AVERAGE: Int = 0

    val MAGNITUDE_MAX: Int = 1
  }
}
