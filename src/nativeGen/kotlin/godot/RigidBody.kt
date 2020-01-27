// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
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
    val _args = VariantArray.new()
    _args.append(force)
    __method_bind.add_central_force.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun addForce(force: Vector3, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(force)
    _args.append(position)
    __method_bind.add_force.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun addTorque(torque: Vector3) {
    val _args = VariantArray.new()
    _args.append(torque)
    __method_bind.add_torque.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun applyCentralImpulse(impulse: Vector3) {
    val _args = VariantArray.new()
    _args.append(impulse)
    __method_bind.apply_central_impulse.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun applyImpulse(position: Vector3, impulse: Vector3) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(impulse)
    __method_bind.apply_impulse.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun applyTorqueImpulse(impulse: Vector3) {
    val _args = VariantArray.new()
    _args.append(impulse)
    __method_bind.apply_torque_impulse.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun getAngularDamp(): Float {
    val _ret = __method_bind.get_angular_damp.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAngularVelocity(): Vector3 {
    val _ret = __method_bind.get_angular_velocity.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getAxisLock(axis: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(axis)
    val _ret = __method_bind.get_axis_lock.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun getBounce(): Float {
    val _ret = __method_bind.get_bounce.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getCollidingBodies(): VariantArray {
    val _ret = __method_bind.get_colliding_bodies.call(this.toVariant())
    return _ret.asArray()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.get_friction.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGravityScale(): Float {
    val _ret = __method_bind.get_gravity_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getLinearDamp(): Float {
    val _ret = __method_bind.get_linear_damp.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getLinearVelocity(): Vector3 {
    val _ret = __method_bind.get_linear_velocity.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getMass(): Float {
    val _ret = __method_bind.get_mass.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMaxContactsReported(): Int {
    val _ret = __method_bind.get_max_contacts_reported.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.get_mode.call(this.toVariant())
    return RigidBody.Mode.from(_ret.asInt())
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val _ret = __method_bind.get_physics_material_override.call(this.toVariant())
    return _ret.asObject(::PhysicsMaterial)!!
  }

  fun getWeight(): Float {
    val _ret = __method_bind.get_weight.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isAbleToSleep(): Boolean {
    val _ret = __method_bind.is_able_to_sleep.call(this.toVariant())
    return _ret.asBool()
  }

  fun isContactMonitorEnabled(): Boolean {
    val _ret = __method_bind.is_contact_monitor_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isSleeping(): Boolean {
    val _ret = __method_bind.is_sleeping.call(this.toVariant())
    return _ret.asBool()
  }

  fun isUsingContinuousCollisionDetection(): Boolean {
    val _ret = __method_bind.is_using_continuous_collision_detection.call(this.toVariant())
    return _ret.asBool()
  }

  fun isUsingCustomIntegrator(): Boolean {
    val _ret = __method_bind.is_using_custom_integrator.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _args = VariantArray.new()
    _args.append(angularDamp)
    __method_bind.set_angular_damp.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAngularVelocity(angularVelocity: Vector3) {
    val _args = VariantArray.new()
    _args.append(angularVelocity)
    __method_bind.set_angular_velocity.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(lock)
    __method_bind.set_axis_lock.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setAxisVelocity(axisVelocity: Vector3) {
    val _args = VariantArray.new()
    _args.append(axisVelocity)
    __method_bind.set_axis_velocity.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBounce(bounce: Float) {
    val _args = VariantArray.new()
    _args.append(bounce)
    __method_bind.set_bounce.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCanSleep(ableToSleep: Boolean) {
    val _args = VariantArray.new()
    _args.append(ableToSleep)
    __method_bind.set_can_sleep.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setContactMonitor(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_contact_monitor.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFriction(friction: Float) {
    val _args = VariantArray.new()
    _args.append(friction)
    __method_bind.set_friction.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setGravityScale(gravityScale: Float) {
    val _args = VariantArray.new()
    _args.append(gravityScale)
    __method_bind.set_gravity_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLinearDamp(linearDamp: Float) {
    val _args = VariantArray.new()
    _args.append(linearDamp)
    __method_bind.set_linear_damp.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLinearVelocity(linearVelocity: Vector3) {
    val _args = VariantArray.new()
    _args.append(linearVelocity)
    __method_bind.set_linear_velocity.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMass(mass: Float) {
    val _args = VariantArray.new()
    _args.append(mass)
    __method_bind.set_mass.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMaxContactsReported(amount: Int) {
    val _args = VariantArray.new()
    _args.append(amount)
    __method_bind.set_max_contacts_reported.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val _args = VariantArray.new()
    _args.append(physicsMaterialOverride)
    __method_bind.set_physics_material_override.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSleeping(sleeping: Boolean) {
    val _args = VariantArray.new()
    _args.append(sleeping)
    __method_bind.set_sleeping.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUseContinuousCollisionDetection(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_use_continuous_collision_detection.call(this.toVariant(), _args.toVariant(),
        1)
  }

  fun setUseCustomIntegrator(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_use_custom_integrator.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setWeight(weight: Float) {
    val _args = VariantArray.new()
    _args.append(weight)
    __method_bind.set_weight.call(this.toVariant(), _args.toVariant(), 1)
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
