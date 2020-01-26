// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class Camera internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    val DopplerTrackingDisabled: Int = 0

    val DopplerTrackingIdleStep: Int = 1

    val DopplerTrackingPhysicsStep: Int = 2

    val KeepHeight: Int = 1

    val KeepWidth: Int = 0

    val ProjectionFrustum: Int = 2

    val ProjectionOrthogonal: Int = 1

    val ProjectionPerspective: Int = 0

    fun new(): Camera {
      TODO()
    }
  }
}
