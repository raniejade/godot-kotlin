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

open class AudioStreamPlayer3D internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    val AttenuationDisabled: Int = 3

    val AttenuationInverseDistance: Int = 0

    val AttenuationInverseSquareDistance: Int = 1

    val AttenuationLogarithmic: Int = 2

    val DopplerTrackingDisabled: Int = 0

    val DopplerTrackingIdleStep: Int = 1

    val DopplerTrackingPhysicsStep: Int = 2

    val OutOfRangeMix: Int = 0

    val OutOfRangePause: Int = 1

    fun new(): AudioStreamPlayer3D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamPlayer3D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioStreamPlayer3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamPlayer3D(
        fn()
      )
    }}
}
