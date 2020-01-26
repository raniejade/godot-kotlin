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

open class AudioStreamPlayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  companion object {
    val MixTargetCenter: Int = 2

    val MixTargetStereo: Int = 0

    val MixTargetSurround: Int = 1

    fun new(): AudioStreamPlayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioStreamPlayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      AudioStreamPlayer(
        fn()
      )
    }}
}
