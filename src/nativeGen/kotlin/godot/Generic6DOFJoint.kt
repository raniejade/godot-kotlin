// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
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
      requireNotNull(fnPtr) { "No instance found for singleton Generic6DOFJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Generic6DOFJoint(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Generic6DOFJoint
     */
    private object __method_bind {
      val _get_angular_hi_limit_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_get_angular_hi_limit_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_angular_hi_limit_x" }
            }
          }

      val _get_angular_hi_limit_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_get_angular_hi_limit_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_angular_hi_limit_y" }
            }
          }

      val _get_angular_hi_limit_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_get_angular_hi_limit_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_angular_hi_limit_z" }
            }
          }

      val _get_angular_lo_limit_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_get_angular_lo_limit_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_angular_lo_limit_x" }
            }
          }

      val _get_angular_lo_limit_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_get_angular_lo_limit_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_angular_lo_limit_y" }
            }
          }

      val _get_angular_lo_limit_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_get_angular_lo_limit_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_angular_lo_limit_z" }
            }
          }

      val _set_angular_hi_limit_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_set_angular_hi_limit_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_angular_hi_limit_x" }
            }
          }

      val _set_angular_hi_limit_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_set_angular_hi_limit_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_angular_hi_limit_y" }
            }
          }

      val _set_angular_hi_limit_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_set_angular_hi_limit_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_angular_hi_limit_z" }
            }
          }

      val _set_angular_lo_limit_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_set_angular_lo_limit_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_angular_lo_limit_x" }
            }
          }

      val _set_angular_lo_limit_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_set_angular_lo_limit_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_angular_lo_limit_y" }
            }
          }

      val _set_angular_lo_limit_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "_set_angular_lo_limit_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_angular_lo_limit_z" }
            }
          }

      val get_flag_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "get_flag_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flag_x" }
            }
          }

      val get_flag_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "get_flag_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flag_y" }
            }
          }

      val get_flag_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "get_flag_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flag_z" }
            }
          }

      val get_param_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "get_param_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_x" }
            }
          }

      val get_param_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "get_param_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_y" }
            }
          }

      val get_param_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "get_param_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param_z" }
            }
          }

      val get_precision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "get_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_precision" }
            }
          }

      val set_flag_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "set_flag_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flag_x" }
            }
          }

      val set_flag_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "set_flag_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flag_y" }
            }
          }

      val set_flag_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "set_flag_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flag_z" }
            }
          }

      val set_param_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "set_param_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_x" }
            }
          }

      val set_param_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "set_param_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_y" }
            }
          }

      val set_param_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "set_param_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param_z" }
            }
          }

      val set_precision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Generic6DOFJoint".cstr.ptr,
              "set_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_precision" }
            }
          }
    }
  }
}
