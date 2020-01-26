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

    fun new(): AudioEffectSpectrumAnalyzer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectSpectrumAnalyzer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioEffectSpectrumAnalyzer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      AudioEffectSpectrumAnalyzer(
        fn()
      )
    }}
}
