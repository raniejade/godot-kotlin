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
  companion object {
    val ModeAtan: Int = 1

    val ModeClip: Int = 0

    val ModeLofi: Int = 2

    val ModeOverdrive: Int = 3

    val ModeWaveshape: Int = 4

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
