// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class RigidBody internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  companion object {
    val ModeCharacter: Int = 2

    val ModeKinematic: Int = 3

    val ModeRigid: Int = 0

    val ModeStatic: Int = 1

    fun new(): RigidBody {
      TODO()
    }
  }
}
