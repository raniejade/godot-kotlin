// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
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

open class PhysicalBone internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  fun getBodyOffset(): Transform {
    TODO()
  }

  fun getBoneId(): Int {
    TODO()
  }

  fun getBounce(): Float {
    TODO()
  }

  fun getFriction(): Float {
    TODO()
  }

  fun getGravityScale(): Float {
    TODO()
  }

  fun getJointOffset(): Transform {
    TODO()
  }

  fun getJointType(): JointType {
    TODO()
  }

  fun getMass(): Float {
    TODO()
  }

  fun getSimulatePhysics(): Boolean {
    TODO()
  }

  fun getWeight(): Float {
    TODO()
  }

  fun isSimulatingPhysics(): Boolean {
    TODO()
  }

  fun isStaticBody(): Boolean {
    TODO()
  }

  fun setBodyOffset(offset: Transform) {
    TODO()
  }

  fun setBounce(bounce: Float) {
    TODO()
  }

  fun setFriction(friction: Float) {
    TODO()
  }

  fun setGravityScale(gravity_scale: Float) {
    TODO()
  }

  fun setJointOffset(offset: Transform) {
    TODO()
  }

  fun setJointType(joint_type: Int) {
    TODO()
  }

  fun setMass(mass: Float) {
    TODO()
  }

  fun setWeight(weight: Float) {
    TODO()
  }

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
      requireNotNull(fnPtr) { "No instance found for singleton PhysicalBone" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PhysicalBone(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PhysicalBone
     */
    private object __method_bind {
      val get_body_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_body_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_body_offset" }
            }
          }

      val get_bone_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_bone_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_id" }
            }
          }

      val get_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val get_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val get_gravity_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_gravity_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity_scale" }
            }
          }

      val get_joint_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_joint_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joint_offset" }
            }
          }

      val get_joint_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_joint_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joint_type" }
            }
          }

      val get_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mass" }
            }
          }

      val get_simulate_physics: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_simulate_physics".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_simulate_physics" }
            }
          }

      val get_weight: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "get_weight".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_weight" }
            }
          }

      val is_simulating_physics: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "is_simulating_physics".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_simulating_physics" }
            }
          }

      val is_static_body: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "is_static_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_static_body" }
            }
          }

      val set_body_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_body_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_body_offset" }
            }
          }

      val set_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val set_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val set_gravity_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_gravity_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity_scale" }
            }
          }

      val set_joint_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_joint_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_joint_offset" }
            }
          }

      val set_joint_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_joint_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_joint_type" }
            }
          }

      val set_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mass" }
            }
          }

      val set_weight: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
              "set_weight".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_weight" }
            }
          }
    }
  }
}
