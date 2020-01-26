// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class Area2D internal constructor(
  _handle: COpaquePointer
) : CollisionObject2D(_handle) {
  companion object {
    val SpaceOverrideCombine: Int = 1

    val SpaceOverrideCombineReplace: Int = 2

    val SpaceOverrideDisabled: Int = 0

    val SpaceOverrideReplace: Int = 3

    val SpaceOverrideReplaceCombine: Int = 4

    fun new(): Area2D {
      TODO()
    }
  }
}
