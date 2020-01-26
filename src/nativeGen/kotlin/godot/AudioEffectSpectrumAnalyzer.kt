// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class AudioEffectSpectrumAnalyzer internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    val FftSize1024: Int = 2

    val FftSize2048: Int = 3

    val FftSize256: Int = 0

    val FftSize4096: Int = 4

    val FftSize512: Int = 1

    val FftSizeMax: Int = 5

    fun new(): AudioEffectSpectrumAnalyzer {
      TODO()
    }
  }
}
