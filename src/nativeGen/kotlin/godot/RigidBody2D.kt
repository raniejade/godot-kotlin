// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class RigidBody2D internal constructor(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  companion object {
    val CcdModeCastRay: Int = 1

    val CcdModeCastShape: Int = 2

    val CcdModeDisabled: Int = 0

    val ModeCharacter: Int = 2

    val ModeKinematic: Int = 3

    val ModeRigid: Int = 0

    val ModeStatic: Int = 1

    fun new(): RigidBody2D {
      TODO()
    }
  }
}
