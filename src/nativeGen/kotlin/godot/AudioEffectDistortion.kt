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

open class AudioEffectDistortion internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  enum class Mode(
    val value: Int
  ) {
    MODE_CLIP(0),

    MODE_ATAN(1),

    MODE_LOFI(2),

    MODE_OVERDRIVE(3),

    MODE_WAVESHAPE(4);
  }

  companion object {
    val MODE_ATAN: Int = 1

    val MODE_CLIP: Int = 0

    val MODE_LOFI: Int = 2

    val MODE_OVERDRIVE: Int = 3

    val MODE_WAVESHAPE: Int = 4

    fun new(): AudioEffectDistortion = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDistortion".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioEffectDistortion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectDistortion(
        fn()
      )
    }}
}
