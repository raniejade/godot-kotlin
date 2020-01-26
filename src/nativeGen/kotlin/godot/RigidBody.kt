// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import godot.core.Vector3
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

open class RigidBody internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  fun addCentralForce(force: Vector3) {
    TODO()
  }

  fun addForce(force: Vector3, position: Vector3) {
    TODO()
  }

  fun addTorque(torque: Vector3) {
    TODO()
  }

  fun applyCentralImpulse(impulse: Vector3) {
    TODO()
  }

  fun applyImpulse(position: Vector3, impulse: Vector3) {
    TODO()
  }

  fun applyTorqueImpulse(impulse: Vector3) {
    TODO()
  }

  fun getAngularDamp(): Float {
    TODO()
  }

  fun getAngularVelocity(): Vector3 {
    TODO()
  }

  fun getAxisLock(axis: Int): Boolean {
    TODO()
  }

  fun getBounce(): Float {
    TODO()
  }

  fun getCollidingBodies(): VariantArray {
    TODO()
  }

  fun getFriction(): Float {
    TODO()
  }

  fun getGravityScale(): Float {
    TODO()
  }

  fun getLinearDamp(): Float {
    TODO()
  }

  fun getLinearVelocity(): Vector3 {
    TODO()
  }

  fun getMass(): Float {
    TODO()
  }

  fun getMaxContactsReported(): Int {
    TODO()
  }

  fun getMode(): Mode {
    TODO()
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    TODO()
  }

  fun getWeight(): Float {
    TODO()
  }

  fun isAbleToSleep(): Boolean {
    TODO()
  }

  fun isContactMonitorEnabled(): Boolean {
    TODO()
  }

  fun isSleeping(): Boolean {
    TODO()
  }

  fun isUsingContinuousCollisionDetection(): Boolean {
    TODO()
  }

  fun isUsingCustomIntegrator(): Boolean {
    TODO()
  }

  fun setAngularDamp(angular_damp: Float) {
    TODO()
  }

  fun setAngularVelocity(angular_velocity: Vector3) {
    TODO()
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    TODO()
  }

  fun setAxisVelocity(axis_velocity: Vector3) {
    TODO()
  }

  fun setBounce(bounce: Float) {
    TODO()
  }

  fun setCanSleep(able_to_sleep: Boolean) {
    TODO()
  }

  fun setContactMonitor(enabled: Boolean) {
    TODO()
  }

  fun setFriction(friction: Float) {
    TODO()
  }

  fun setGravityScale(gravity_scale: Float) {
    TODO()
  }

  fun setLinearDamp(linear_damp: Float) {
    TODO()
  }

  fun setLinearVelocity(linear_velocity: Vector3) {
    TODO()
  }

  fun setMass(mass: Float) {
    TODO()
  }

  fun setMaxContactsReported(amount: Int) {
    TODO()
  }

  fun setMode(mode: Int) {
    TODO()
  }

  fun setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial) {
    TODO()
  }

  fun setSleeping(sleeping: Boolean) {
    TODO()
  }

  fun setUseContinuousCollisionDetection(enable: Boolean) {
    TODO()
  }

  fun setUseCustomIntegrator(enable: Boolean) {
    TODO()
  }

  fun setWeight(weight: Float) {
    TODO()
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_RIGID(0),

    MODE_STATIC(1),

    MODE_CHARACTER(2),

    MODE_KINEMATIC(3);

    companion object {
      fun from(value: Int): Mode {
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
    val MODE_CHARACTER: Int = 2

    val MODE_KINEMATIC: Int = 3

    val MODE_RIGID: Int = 0

    val MODE_STATIC: Int = 1

    fun new(): RigidBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RigidBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RigidBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RigidBody(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RigidBody = RigidBody(ptr)
    /**
     * Container for method_bind pointers for RigidBody
     */
    private object __method_bind {
      val add_central_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "add_central_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_central_force" }
            }
          }

      val add_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "add_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_force" }
            }
          }

      val add_torque: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "add_torque".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_torque" }
            }
          }

      val apply_central_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "apply_central_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
            }
          }

      val apply_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "apply_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
            }
          }

      val apply_torque_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "apply_torque_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
            }
          }

      val get_angular_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_angular_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
            }
          }

      val get_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
            }
          }

      val get_axis_lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_axis_lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_axis_lock" }
            }
          }

      val get_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val get_colliding_bodies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_colliding_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_colliding_bodies" }
            }
          }

      val get_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val get_gravity_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_gravity_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity_scale" }
            }
          }

      val get_linear_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_linear_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
            }
          }

      val get_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
            }
          }

      val get_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mass" }
            }
          }

      val get_max_contacts_reported: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_max_contacts_reported".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_contacts_reported" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_material_override"
              }
            }
          }

      val get_weight: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "get_weight".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_weight" }
            }
          }

      val is_able_to_sleep: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "is_able_to_sleep".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_able_to_sleep" }
            }
          }

      val is_contact_monitor_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "is_contact_monitor_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_contact_monitor_enabled" }
            }
          }

      val is_sleeping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "is_sleeping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
            }
          }

      val is_using_continuous_collision_detection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "is_using_continuous_collision_detection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_using_continuous_collision_detection" }
            }
          }

      val is_using_custom_integrator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "is_using_custom_integrator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_custom_integrator" }
            }
          }

      val set_angular_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_angular_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
            }
          }

      val set_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
            }
          }

      val set_axis_lock: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_axis_lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis_lock" }
            }
          }

      val set_axis_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_axis_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis_velocity" }
            }
          }

      val set_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val set_can_sleep: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_can_sleep".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_can_sleep" }
            }
          }

      val set_contact_monitor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_contact_monitor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_contact_monitor" }
            }
          }

      val set_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val set_gravity_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_gravity_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity_scale" }
            }
          }

      val set_linear_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_linear_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
            }
          }

      val set_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
            }
          }

      val set_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mass" }
            }
          }

      val set_max_contacts_reported: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_max_contacts_reported".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_contacts_reported" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_material_override"
              }
            }
          }

      val set_sleeping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_sleeping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sleeping" }
            }
          }

      val set_use_continuous_collision_detection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_use_continuous_collision_detection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_use_continuous_collision_detection" }
            }
          }

      val set_use_custom_integrator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_use_custom_integrator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_custom_integrator" }
            }
          }

      val set_weight: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
              "set_weight".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_weight" }
            }
          }
    }
  }
}
