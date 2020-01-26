// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

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

    fun new(): AudioStreamPlayer3D {
      TODO()
    }
  }
}
