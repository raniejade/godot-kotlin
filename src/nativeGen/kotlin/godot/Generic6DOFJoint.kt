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

open class Generic6DOFJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  enum class Param(
    val value: Int
  ) {
    PARAM_LINEAR_LOWER_LIMIT(0),

    PARAM_LINEAR_UPPER_LIMIT(1),

    PARAM_LINEAR_LIMIT_SOFTNESS(2),

    PARAM_LINEAR_RESTITUTION(3),

    PARAM_LINEAR_DAMPING(4),

    PARAM_LINEAR_MOTOR_TARGET_VELOCITY(5),

    PARAM_LINEAR_MOTOR_FORCE_LIMIT(6),

    PARAM_ANGULAR_LOWER_LIMIT(10),

    PARAM_ANGULAR_UPPER_LIMIT(11),

    PARAM_ANGULAR_LIMIT_SOFTNESS(12),

    PARAM_ANGULAR_DAMPING(13),

    PARAM_ANGULAR_RESTITUTION(14),

    PARAM_ANGULAR_FORCE_LIMIT(15),

    PARAM_ANGULAR_ERP(16),

    PARAM_ANGULAR_MOTOR_TARGET_VELOCITY(17),

    PARAM_ANGULAR_MOTOR_FORCE_LIMIT(18),

    PARAM_MAX(22);
  }

  enum class Flag(
    val value: Int
  ) {
    FLAG_ENABLE_LINEAR_LIMIT(0),

    FLAG_ENABLE_ANGULAR_LIMIT(1),

    FLAG_ENABLE_ANGULAR_SPRING(2),

    FLAG_ENABLE_LINEAR_SPRING(3),

    FLAG_ENABLE_MOTOR(4),

    FLAG_ENABLE_LINEAR_MOTOR(5),

    FLAG_MAX(6);
  }

  companion object {
    val FLAG_ENABLE_ANGULAR_LIMIT: Int = 1

    val FLAG_ENABLE_ANGULAR_SPRING: Int = 2

    val FLAG_ENABLE_LINEAR_LIMIT: Int = 0

    val FLAG_ENABLE_LINEAR_MOTOR: Int = 5

    val FLAG_ENABLE_LINEAR_SPRING: Int = 3

    val FLAG_ENABLE_MOTOR: Int = 4

    val FLAG_MAX: Int = 6

    val PARAM_ANGULAR_DAMPING: Int = 13

    val PARAM_ANGULAR_ERP: Int = 16

    val PARAM_ANGULAR_FORCE_LIMIT: Int = 15

    val PARAM_ANGULAR_LIMIT_SOFTNESS: Int = 12

    val PARAM_ANGULAR_LOWER_LIMIT: Int = 10

    val PARAM_ANGULAR_MOTOR_FORCE_LIMIT: Int = 18

    val PARAM_ANGULAR_MOTOR_TARGET_VELOCITY: Int = 17

    val PARAM_ANGULAR_RESTITUTION: Int = 14

    val PARAM_ANGULAR_UPPER_LIMIT: Int = 11

    val PARAM_LINEAR_DAMPING: Int = 4

    val PARAM_LINEAR_LIMIT_SOFTNESS: Int = 2

    val PARAM_LINEAR_LOWER_LIMIT: Int = 0

    val PARAM_LINEAR_MOTOR_FORCE_LIMIT: Int = 6

    val PARAM_LINEAR_MOTOR_TARGET_VELOCITY: Int = 5

    val PARAM_LINEAR_RESTITUTION: Int = 3

    val PARAM_LINEAR_UPPER_LIMIT: Int = 1

    val PARAM_MAX: Int = 22

    fun new(): Generic6DOFJoint = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("Generic6DOFJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Generic6DOFJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Generic6DOFJoint(
        fn()
      )
    }}
}
