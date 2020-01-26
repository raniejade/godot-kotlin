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
  enum class FFT_Size(
    val value: Int
  ) {
    FFT_SIZE_256(0),

    FFT_SIZE_512(1),

    FFT_SIZE_1024(2),

    FFT_SIZE_2048(3),

    FFT_SIZE_4096(4),

    FFT_SIZE_MAX(5);
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
      requireNotNull(fnPtr) { "No constructor found for AudioEffectSpectrumAnalyzer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectSpectrumAnalyzer(
        fn()
      )
    }}
}
