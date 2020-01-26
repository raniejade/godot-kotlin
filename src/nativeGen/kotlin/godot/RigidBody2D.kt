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

    fun new(): RigidBody2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RigidBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for RigidBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RigidBody2D(
        fn()
      )
    }}
}
