// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_body_offset.call(this.toVariant())
    TODO()
  }

  fun getBoneId(): Int {
    val _ret = __method_bind.get_bone_id.call(this.toVariant())
    TODO()
  }

  fun getBounce(): Float {
    val _ret = __method_bind.get_bounce.call(this.toVariant())
    TODO()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.get_friction.call(this.toVariant())
    TODO()
  }

  fun getGravityScale(): Float {
    val _ret = __method_bind.get_gravity_scale.call(this.toVariant())
    TODO()
  }

  fun getJointOffset(): Transform {
    val _ret = __method_bind.get_joint_offset.call(this.toVariant())
    TODO()
  }

  fun getJointType(): JointType {
    val _ret = __method_bind.get_joint_type.call(this.toVariant())
    TODO()
  }

  fun getMass(): Float {
    val _ret = __method_bind.get_mass.call(this.toVariant())
    TODO()
  }

  fun getSimulatePhysics(): Boolean {
    val _ret = __method_bind.get_simulate_physics.call(this.toVariant())
    TODO()
  }

  fun getWeight(): Float {
    val _ret = __method_bind.get_weight.call(this.toVariant())
    TODO()
  }

  fun isSimulatingPhysics(): Boolean {
    val _ret = __method_bind.is_simulating_physics.call(this.toVariant())
    TODO()
  }

  fun isStaticBody(): Boolean {
    val _ret = __method_bind.is_static_body.call(this.toVariant())
    TODO()
  }

  fun setBodyOffset(offset: Transform) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.set_body_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBounce(bounce: Float) {
    val _args = VariantArray.new()
    _args.append(bounce)
    val _ret = __method_bind.set_bounce.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFriction(friction: Float) {
    val _args = VariantArray.new()
    _args.append(friction)
    val _ret = __method_bind.set_friction.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setGravityScale(gravityScale: Float) {
    val _args = VariantArray.new()
    _args.append(gravityScale)
    val _ret = __method_bind.set_gravity_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setJointOffset(offset: Transform) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.set_joint_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setJointType(jointType: Int) {
    val _args = VariantArray.new()
    _args.append(jointType)
    val _ret = __method_bind.set_joint_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setMass(mass: Float) {
    val _args = VariantArray.new()
    _args.append(mass)
    val _ret = __method_bind.set_mass.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setWeight(weight: Float) {
    val _args = VariantArray.new()
    _args.append(weight)
    val _ret = __method_bind.set_weight.call(this.toVariant(), _args.toVariant(), 1)
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

    companion object {
      fun from(value: Int): JointType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
    fun from(ptr: COpaquePointer): PhysicalBone = PhysicalBone(ptr)
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
