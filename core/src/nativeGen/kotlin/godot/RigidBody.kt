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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RigidBody(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PhysicsBody(null) {
  var angularDamp: Float
    get() {
       return getAngularDamp() 
    }
    set(value) {
      setAngularDamp(value)
    }

  var angularVelocity: Vector3
    get() {
       return getAngularVelocity() 
    }
    set(value) {
      setAngularVelocity(value)
    }

  var axisLockAngularX: Boolean
    get() {
       return getAxisLock(8) 
    }
    set(value) {
      setAxisLock(8, value)
    }

  var axisLockAngularY: Boolean
    get() {
       return getAxisLock(16) 
    }
    set(value) {
      setAxisLock(16, value)
    }

  var axisLockAngularZ: Boolean
    get() {
       return getAxisLock(32) 
    }
    set(value) {
      setAxisLock(32, value)
    }

  var axisLockLinearX: Boolean
    get() {
       return getAxisLock(1) 
    }
    set(value) {
      setAxisLock(1, value)
    }

  var axisLockLinearY: Boolean
    get() {
       return getAxisLock(2) 
    }
    set(value) {
      setAxisLock(2, value)
    }

  var axisLockLinearZ: Boolean
    get() {
       return getAxisLock(4) 
    }
    set(value) {
      setAxisLock(4, value)
    }

  var bounce: Float
    get() {
       return getBounce() 
    }
    set(value) {
      setBounce(value)
    }

  var canSleep: Boolean
    get() {
       return isAbleToSleep() 
    }
    set(value) {
      setCanSleep(value)
    }

  var contactMonitor: Boolean
    get() {
       return isContactMonitorEnabled() 
    }
    set(value) {
      setContactMonitor(value)
    }

  var contactsReported: Int
    get() {
       return getMaxContactsReported() 
    }
    set(value) {
      setMaxContactsReported(value)
    }

  var continuousCd: Boolean
    get() {
       return isUsingContinuousCollisionDetection() 
    }
    set(value) {
      setUseContinuousCollisionDetection(value)
    }

  var customIntegrator: Boolean
    get() {
       return isUsingCustomIntegrator() 
    }
    set(value) {
      setUseCustomIntegrator(value)
    }

  var friction: Float
    get() {
       return getFriction() 
    }
    set(value) {
      setFriction(value)
    }

  var gravityScale: Float
    get() {
       return getGravityScale() 
    }
    set(value) {
      setGravityScale(value)
    }

  var linearDamp: Float
    get() {
       return getLinearDamp() 
    }
    set(value) {
      setLinearDamp(value)
    }

  var linearVelocity: Vector3
    get() {
       return getLinearVelocity() 
    }
    set(value) {
      setLinearVelocity(value)
    }

  var mass: Float
    get() {
       return getMass() 
    }
    set(value) {
      setMass(value)
    }

  var mode: Mode
    get() {
       return getMode() 
    }
    set(value) {
      setMode(value.value)
    }

  var physicsMaterialOverride: PhysicsMaterial
    get() {
       return getPhysicsMaterialOverride() 
    }
    set(value) {
      setPhysicsMaterialOverride(value)
    }

  var sleeping: Boolean
    get() {
       return isSleeping() 
    }
    set(value) {
      setSleeping(value)
    }

  var weight: Float
    get() {
       return getWeight() 
    }
    set(value) {
      setWeight(value)
    }

  /**
   * RigidBody::body_entered signal
   */
  val signalBodyEntered: Signal1<Node> = Signal1("body_entered")

  /**
   * RigidBody::body_exited signal
   */
  val signalBodyExited: Signal1<Node> = Signal1("body_exited")

  /**
   * RigidBody::body_shape_entered signal
   */
  val signalBodyShapeEntered: Signal4<Int, Node, Int, Int> = Signal4("body_shape_entered")

  /**
   * RigidBody::body_shape_exited signal
   */
  val signalBodyShapeExited: Signal4<Int, Node, Int, Int> = Signal4("body_shape_exited")

  /**
   * RigidBody::sleeping_state_changed signal
   */
  val signalSleepingStateChanged: Signal0 = Signal0("sleeping_state_changed")

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for angularVelocity
   */
  fun angularVelocity(cb: Vector3.() -> Unit) {
    val _p = angularVelocity
    cb(_p)
    angularVelocity = _p
  }

  /**
   * Specialized setter for linearVelocity
   */
  fun linearVelocity(cb: Vector3.() -> Unit) {
    val _p = linearVelocity
    cb(_p)
    linearVelocity = _p
  }

  fun addCentralForce(force: Vector3) {
    val _arg = Variant(force)
    __method_bind.addCentralForce.call(this._handle, listOf(_arg))
  }

  fun addForce(force: Vector3, position: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(force))
    _args.add(Variant.fromAny(position))
    __method_bind.addForce.call(this._handle, _args)
  }

  fun addTorque(torque: Vector3) {
    val _arg = Variant(torque)
    __method_bind.addTorque.call(this._handle, listOf(_arg))
  }

  fun applyCentralImpulse(impulse: Vector3) {
    val _arg = Variant(impulse)
    __method_bind.applyCentralImpulse.call(this._handle, listOf(_arg))
  }

  fun applyImpulse(position: Vector3, impulse: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(impulse))
    __method_bind.applyImpulse.call(this._handle, _args)
  }

  fun applyTorqueImpulse(impulse: Vector3) {
    val _arg = Variant(impulse)
    __method_bind.applyTorqueImpulse.call(this._handle, listOf(_arg))
  }

  fun getAngularDamp(): Float {
    val _ret = __method_bind.getAngularDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getAngularVelocity(): Vector3 {
    val _ret = __method_bind.getAngularVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getAxisLock(axis: Int): Boolean {
    val _arg = Variant(axis)
    val _ret = __method_bind.getAxisLock.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getBounce(): Float {
    val _ret = __method_bind.getBounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollidingBodies(): VariantArray {
    val _ret = __method_bind.getCollidingBodies.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.getFriction.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravityScale(): Float {
    val _ret = __method_bind.getGravityScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearDamp(): Float {
    val _ret = __method_bind.getLinearDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearVelocity(): Vector3 {
    val _ret = __method_bind.getLinearVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getMass(): Float {
    val _ret = __method_bind.getMass.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaxContactsReported(): Int {
    val _ret = __method_bind.getMaxContactsReported.call(this._handle)
    return _ret.asInt()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return RigidBody.Mode.from(_ret.asInt())
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val _ret = __method_bind.getPhysicsMaterialOverride.call(this._handle)
    return _ret.asObject(::PhysicsMaterial)!!
  }

  fun getWeight(): Float {
    val _ret = __method_bind.getWeight.call(this._handle)
    return _ret.asFloat()
  }

  fun isAbleToSleep(): Boolean {
    val _ret = __method_bind.isAbleToSleep.call(this._handle)
    return _ret.asBoolean()
  }

  fun isContactMonitorEnabled(): Boolean {
    val _ret = __method_bind.isContactMonitorEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSleeping(): Boolean {
    val _ret = __method_bind.isSleeping.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingContinuousCollisionDetection(): Boolean {
    val _ret = __method_bind.isUsingContinuousCollisionDetection.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingCustomIntegrator(): Boolean {
    val _ret = __method_bind.isUsingCustomIntegrator.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _arg = Variant(angularDamp)
    __method_bind.setAngularDamp.call(this._handle, listOf(_arg))
  }

  fun setAngularVelocity(angularVelocity: Vector3) {
    val _arg = Variant(angularVelocity)
    __method_bind.setAngularVelocity.call(this._handle, listOf(_arg))
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(lock))
    __method_bind.setAxisLock.call(this._handle, _args)
  }

  fun setAxisVelocity(axisVelocity: Vector3) {
    val _arg = Variant(axisVelocity)
    __method_bind.setAxisVelocity.call(this._handle, listOf(_arg))
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant(bounce)
    __method_bind.setBounce.call(this._handle, listOf(_arg))
  }

  fun setCanSleep(ableToSleep: Boolean) {
    val _arg = Variant(ableToSleep)
    __method_bind.setCanSleep.call(this._handle, listOf(_arg))
  }

  fun setContactMonitor(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setContactMonitor.call(this._handle, listOf(_arg))
  }

  fun setFriction(friction: Float) {
    val _arg = Variant(friction)
    __method_bind.setFriction.call(this._handle, listOf(_arg))
  }

  fun setGravityScale(gravityScale: Float) {
    val _arg = Variant(gravityScale)
    __method_bind.setGravityScale.call(this._handle, listOf(_arg))
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant(linearDamp)
    __method_bind.setLinearDamp.call(this._handle, listOf(_arg))
  }

  fun setLinearVelocity(linearVelocity: Vector3) {
    val _arg = Variant(linearVelocity)
    __method_bind.setLinearVelocity.call(this._handle, listOf(_arg))
  }

  fun setMass(mass: Float) {
    val _arg = Variant(mass)
    __method_bind.setMass.call(this._handle, listOf(_arg))
  }

  fun setMaxContactsReported(amount: Int) {
    val _arg = Variant(amount)
    __method_bind.setMaxContactsReported.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val _arg = Variant(physicsMaterialOverride)
    __method_bind.setPhysicsMaterialOverride.call(this._handle, listOf(_arg))
  }

  fun setSleeping(sleeping: Boolean) {
    val _arg = Variant(sleeping)
    __method_bind.setSleeping.call(this._handle, listOf(_arg))
  }

  fun setUseContinuousCollisionDetection(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setUseContinuousCollisionDetection.call(this._handle, listOf(_arg))
  }

  fun setUseCustomIntegrator(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setUseCustomIntegrator.call(this._handle, listOf(_arg))
  }

  fun setWeight(weight: Float) {
    val _arg = Variant(weight)
    __method_bind.setWeight.call(this._handle, listOf(_arg))
  }

  enum class Mode(
    val value: Int
  ) {
    RIGID(0),

    STATIC(1),

    CHARACTER(2),

    KINEMATIC(3);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RigidBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RigidBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RigidBody
     */
    private object __method_bind {
      val addCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_central_force" }
        }
      val addForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_force" }
        }
      val addTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_torque" }
        }
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
        }
      val applyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
        }
      val getAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
        }
      val getAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
        }
      val getAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_axis_lock" }
        }
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounce" }
        }
      val getCollidingBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_colliding_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_colliding_bodies" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction" }
        }
      val getGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_scale" }
        }
      val getLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
        }
      val getLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
        }
      val getMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mass" }
        }
      val getMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_contacts_reported" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_material_override" }
        }
      val getWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "get_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_weight" }
        }
      val isAbleToSleep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "is_able_to_sleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_able_to_sleep" }
        }
      val isContactMonitorEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "is_contact_monitor_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_contact_monitor_enabled" }
        }
      val isSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "is_sleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
        }
      val isUsingContinuousCollisionDetection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "is_using_continuous_collision_detection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_using_continuous_collision_detection" }
        }
      val isUsingCustomIntegrator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "is_using_custom_integrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_custom_integrator" }
        }
      val setAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
        }
      val setAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
        }
      val setAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis_lock" }
        }
      val setAxisVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_axis_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis_velocity" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounce" }
        }
      val setCanSleep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_can_sleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_can_sleep" }
        }
      val setContactMonitor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_contact_monitor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_contact_monitor" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction" }
        }
      val setGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_scale" }
        }
      val setLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
        }
      val setLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
        }
      val setMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mass" }
        }
      val setMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_contacts_reported" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_material_override" }
        }
      val setSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_sleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sleeping" }
        }
      val setUseContinuousCollisionDetection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_use_continuous_collision_detection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_use_continuous_collision_detection" }
        }
      val setUseCustomIntegrator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_use_custom_integrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_custom_integrator" }
        }
      val setWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "set_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_weight" }
        }}
  }
}
