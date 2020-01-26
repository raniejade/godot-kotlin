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

open class RigidBody internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  companion object {
    val ModeCharacter: Int = 2

    val ModeKinematic: Int = 3

    val ModeRigid: Int = 0

    val ModeStatic: Int = 1

    fun new(): RigidBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RigidBody".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for RigidBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      RigidBody(
        fn()
      )
    }}
}
