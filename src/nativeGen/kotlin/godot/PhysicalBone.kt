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

open class PhysicalBone internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  enum class JointType(
    val value: Int
  ) {
    JOINT_TYPE_NONE(0),

    JOINT_TYPE_PIN(1),

    JOINT_TYPE_CONE(2),

    JOINT_TYPE_HINGE(3),

    JOINT_TYPE_SLIDER(4),

    JOINT_TYPE_6DOF(5);
  }

  companion object {
    val JOINT_TYPE_6DOF: Int = 5

    val JOINT_TYPE_CONE: Int = 2

    val JOINT_TYPE_HINGE: Int = 3

    val JOINT_TYPE_NONE: Int = 0

    val JOINT_TYPE_PIN: Int = 1

    val JOINT_TYPE_SLIDER: Int = 4

    fun new(): PhysicalBone = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicalBone".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for PhysicalBone" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PhysicalBone(
        fn()
      )
    }}
}
