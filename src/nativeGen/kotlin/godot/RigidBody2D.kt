// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import godot.core.Vector2
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

open class RigidBody2D internal constructor(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  fun addCentralForce(force: Vector2) {
    TODO()
  }

  fun addForce(offset: Vector2, force: Vector2) {
    TODO()
  }

  fun addTorque(torque: Float) {
    TODO()
  }

  fun applyCentralImpulse(impulse: Vector2) {
    TODO()
  }

  fun applyImpulse(offset: Vector2, impulse: Vector2) {
    TODO()
  }

  fun applyTorqueImpulse(torque: Float) {
    TODO()
  }

  fun getAngularDamp(): Float {
    TODO()
  }

  fun getAngularVelocity(): Float {
    TODO()
  }

  fun getAppliedForce(): Vector2 {
    TODO()
  }

  fun getAppliedTorque(): Float {
    TODO()
  }

  fun getBounce(): Float {
    TODO()
  }

  fun getCollidingBodies(): VariantArray {
    TODO()
  }

  fun getContinuousCollisionDetectionMode(): CCDMode {
    TODO()
  }

  fun getFriction(): Float {
    TODO()
  }

  fun getGravityScale(): Float {
    TODO()
  }

  fun getInertia(): Float {
    TODO()
  }

  fun getLinearDamp(): Float {
    TODO()
  }

  fun getLinearVelocity(): Vector2 {
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

  fun isUsingCustomIntegrator(): Boolean {
    TODO()
  }

  fun setAngularDamp(angular_damp: Float) {
    TODO()
  }

  fun setAngularVelocity(angular_velocity: Float) {
    TODO()
  }

  fun setAppliedForce(force: Vector2) {
    TODO()
  }

  fun setAppliedTorque(torque: Float) {
    TODO()
  }

  fun setAxisVelocity(axis_velocity: Vector2) {
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

  fun setContinuousCollisionDetectionMode(mode: Int) {
    TODO()
  }

  fun setFriction(friction: Float) {
    TODO()
  }

  fun setGravityScale(gravity_scale: Float) {
    TODO()
  }

  fun setInertia(inertia: Float) {
    TODO()
  }

  fun setLinearDamp(linear_damp: Float) {
    TODO()
  }

  fun setLinearVelocity(linear_velocity: Vector2) {
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

  fun setUseCustomIntegrator(enable: Boolean) {
    TODO()
  }

  fun setWeight(weight: Float) {
    TODO()
  }

  fun testMotion(
    motion: Vector2,
    infinite_inertia: Boolean,
    margin: Float,
    result: Physics2DTestMotionResult
  ): Boolean {
    TODO()
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_RIGID(0),

    MODE_STATIC(1),

    MODE_CHARACTER(2),

    MODE_KINEMATIC(3);
  }

  enum class CCDMode(
    val value: Int
  ) {
    CCD_MODE_DISABLED(0),

    CCD_MODE_CAST_RAY(1),

    CCD_MODE_CAST_SHAPE(2);
  }

  companion object {
    val CCD_MODE_CAST_RAY: Int = 1

    val CCD_MODE_CAST_SHAPE: Int = 2

    val CCD_MODE_DISABLED: Int = 0

    val MODE_CHARACTER: Int = 2

    val MODE_KINEMATIC: Int = 3

    val MODE_RIGID: Int = 0

    val MODE_STATIC: Int = 1

    fun new(): RigidBody2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RigidBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RigidBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RigidBody2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for RigidBody2D
     */
    private object __method_bind {
      val add_central_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "add_central_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_central_force" }
            }
          }

      val add_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "add_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_force" }
            }
          }

      val add_torque: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "add_torque".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_torque" }
            }
          }

      val apply_central_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "apply_central_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
            }
          }

      val apply_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "apply_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
            }
          }

      val apply_torque_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "apply_torque_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
            }
          }

      val get_angular_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_angular_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
            }
          }

      val get_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
            }
          }

      val get_applied_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_applied_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_applied_force" }
            }
          }

      val get_applied_torque: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_applied_torque".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_applied_torque" }
            }
          }

      val get_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val get_colliding_bodies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_colliding_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_colliding_bodies" }
            }
          }

      val get_continuous_collision_detection_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_continuous_collision_detection_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_continuous_collision_detection_mode" }
            }
          }

      val get_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val get_gravity_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_gravity_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity_scale" }
            }
          }

      val get_inertia: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_inertia".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inertia" }
            }
          }

      val get_linear_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_linear_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
            }
          }

      val get_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
            }
          }

      val get_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mass" }
            }
          }

      val get_max_contacts_reported: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_max_contacts_reported".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_contacts_reported" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_material_override"
              }
            }
          }

      val get_weight: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "get_weight".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_weight" }
            }
          }

      val is_able_to_sleep: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "is_able_to_sleep".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_able_to_sleep" }
            }
          }

      val is_contact_monitor_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "is_contact_monitor_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_contact_monitor_enabled" }
            }
          }

      val is_sleeping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "is_sleeping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
            }
          }

      val is_using_custom_integrator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "is_using_custom_integrator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_custom_integrator" }
            }
          }

      val set_angular_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_angular_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
            }
          }

      val set_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
            }
          }

      val set_applied_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_applied_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_applied_force" }
            }
          }

      val set_applied_torque: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_applied_torque".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_applied_torque" }
            }
          }

      val set_axis_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_axis_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis_velocity" }
            }
          }

      val set_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val set_can_sleep: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_can_sleep".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_can_sleep" }
            }
          }

      val set_contact_monitor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_contact_monitor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_contact_monitor" }
            }
          }

      val set_continuous_collision_detection_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_continuous_collision_detection_mode".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_continuous_collision_detection_mode" }
            }
          }

      val set_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val set_gravity_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_gravity_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gravity_scale" }
            }
          }

      val set_inertia: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_inertia".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_inertia" }
            }
          }

      val set_linear_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_linear_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
            }
          }

      val set_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
            }
          }

      val set_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mass" }
            }
          }

      val set_max_contacts_reported: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_max_contacts_reported".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_contacts_reported" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_material_override"
              }
            }
          }

      val set_sleeping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_sleeping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sleeping" }
            }
          }

      val set_use_custom_integrator: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_use_custom_integrator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_custom_integrator" }
            }
          }

      val set_weight: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "set_weight".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_weight" }
            }
          }

      val test_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
              "test_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method test_motion" }
            }
          }
    }
  }
}
