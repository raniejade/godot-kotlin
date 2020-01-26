// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HingeJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  fun getLowerLimit(): Float {
    TODO()
  }

  fun getUpperLimit(): Float {
    TODO()
  }

  fun setLowerLimit() {
    TODO()
  }

  fun setUpperLimit() {
    TODO()
  }

  fun getFlag(): Boolean {
    TODO()
  }

  fun getParam(): Float {
    TODO()
  }

  fun setFlag() {
    TODO()
  }

  fun setParam() {
    TODO()
  }

  enum class Param(
    val value: Int
  ) {
    PARAM_BIAS(0),

    PARAM_LIMIT_UPPER(1),

    PARAM_LIMIT_LOWER(2),

    PARAM_LIMIT_BIAS(3),

    PARAM_LIMIT_SOFTNESS(4),

    PARAM_LIMIT_RELAXATION(5),

    PARAM_MOTOR_TARGET_VELOCITY(6),

    PARAM_MOTOR_MAX_IMPULSE(7),

    PARAM_MAX(8);
  }

  enum class Flag(
    val value: Int
  ) {
    FLAG_USE_LIMIT(0),

    FLAG_ENABLE_MOTOR(1),

    FLAG_MAX(2);
  }

  companion object {
    val FLAG_ENABLE_MOTOR: Int = 1

    val FLAG_MAX: Int = 2

    val FLAG_USE_LIMIT: Int = 0

    val PARAM_BIAS: Int = 0

    val PARAM_LIMIT_BIAS: Int = 3

    val PARAM_LIMIT_LOWER: Int = 2

    val PARAM_LIMIT_RELAXATION: Int = 5

    val PARAM_LIMIT_SOFTNESS: Int = 4

    val PARAM_LIMIT_UPPER: Int = 1

    val PARAM_MAX: Int = 8

    val PARAM_MOTOR_MAX_IMPULSE: Int = 7

    val PARAM_MOTOR_TARGET_VELOCITY: Int = 6

    fun new(): HingeJoint = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HingeJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton HingeJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HingeJoint(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for HingeJoint
     */
    private object __method_bind {
      val _get_lower_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "_get_lower_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_lower_limit" }
            }
          }

      val _get_upper_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "_get_upper_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_upper_limit" }
            }
          }

      val _set_lower_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "_set_lower_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_lower_limit" }
            }
          }

      val _set_upper_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "_set_upper_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_upper_limit" }
            }
          }

      val get_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "get_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flag" }
            }
          }

      val get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param" }
            }
          }

      val set_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "set_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flag" }
            }
          }

      val set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HingeJoint".cstr.ptr,
              "set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param" }
            }
          }
    }
  }
}
