// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class RigidBody2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PhysicsBody2D(null) {
  var angularDamp: Float
    get() {
       return getAngularDamp() 
    }
    set(value) {
      setAngularDamp(value)
    }

  var angularVelocity: Float
    get() {
       return getAngularVelocity() 
    }
    set(value) {
      setAngularVelocity(value)
    }

  var appliedForce: Vector2
    get() {
       return getAppliedForce() 
    }
    set(value) {
      setAppliedForce(value)
    }

  var appliedTorque: Float
    get() {
       return getAppliedTorque() 
    }
    set(value) {
      setAppliedTorque(value)
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

  var continuousCd: CCDMode
    get() {
       return getContinuousCollisionDetectionMode() 
    }
    set(value) {
      setContinuousCollisionDetectionMode(value.value)
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

  var inertia: Float
    get() {
       return getInertia() 
    }
    set(value) {
      setInertia(value)
    }

  var linearDamp: Float
    get() {
       return getLinearDamp() 
    }
    set(value) {
      setLinearDamp(value)
    }

  var linearVelocity: Vector2
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
   * RigidBody2D::body_entered signal
   */
  val signalBodyEntered: Signal1<Node> = Signal1("body_entered")

  /**
   * RigidBody2D::body_exited signal
   */
  val signalBodyExited: Signal1<Node> = Signal1("body_exited")

  /**
   * RigidBody2D::body_shape_entered signal
   */
  val signalBodyShapeEntered: Signal4<Int, Node, Int, Int> = Signal4("body_shape_entered")

  /**
   * RigidBody2D::body_shape_exited signal
   */
  val signalBodyShapeExited: Signal4<Int, Node, Int, Int> = Signal4("body_shape_exited")

  /**
   * RigidBody2D::sleeping_state_changed signal
   */
  val signalSleepingStateChanged: Signal0 = Signal0("sleeping_state_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for appliedForce
   */
  fun appliedForce(cb: Vector2.() -> Unit) {
    val _p = appliedForce
    cb(_p)
    appliedForce = _p
  }

  /**
   * Specialized setter for linearVelocity
   */
  fun linearVelocity(cb: Vector2.() -> Unit) {
    val _p = linearVelocity
    cb(_p)
    linearVelocity = _p
  }

  fun addCentralForce(force: Vector2) {
    val _arg = Variant(force)
    __method_bind.addCentralForce.call(this._handle, listOf(_arg))
  }

  fun addForce(offset: Vector2, force: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(offset))
    _args.add(Variant.fromAny(force))
    __method_bind.addForce.call(this._handle, _args)
  }

  fun addTorque(torque: Float) {
    val _arg = Variant(torque)
    __method_bind.addTorque.call(this._handle, listOf(_arg))
  }

  fun applyCentralImpulse(impulse: Vector2) {
    val _arg = Variant(impulse)
    __method_bind.applyCentralImpulse.call(this._handle, listOf(_arg))
  }

  fun applyImpulse(offset: Vector2, impulse: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(offset))
    _args.add(Variant.fromAny(impulse))
    __method_bind.applyImpulse.call(this._handle, _args)
  }

  fun applyTorqueImpulse(torque: Float) {
    val _arg = Variant(torque)
    __method_bind.applyTorqueImpulse.call(this._handle, listOf(_arg))
  }

  fun getAngularDamp(): Float {
    val _ret = __method_bind.getAngularDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getAngularVelocity(): Float {
    val _ret = __method_bind.getAngularVelocity.call(this._handle)
    return _ret.asFloat()
  }

  fun getAppliedForce(): Vector2 {
    val _ret = __method_bind.getAppliedForce.call(this._handle)
    return _ret.asVector2()
  }

  fun getAppliedTorque(): Float {
    val _ret = __method_bind.getAppliedTorque.call(this._handle)
    return _ret.asFloat()
  }

  fun getBounce(): Float {
    val _ret = __method_bind.getBounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollidingBodies(): VariantArray {
    val _ret = __method_bind.getCollidingBodies.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getContinuousCollisionDetectionMode(): CCDMode {
    val _ret = __method_bind.getContinuousCollisionDetectionMode.call(this._handle)
    return RigidBody2D.CCDMode.from(_ret.asInt())
  }

  fun getFriction(): Float {
    val _ret = __method_bind.getFriction.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravityScale(): Float {
    val _ret = __method_bind.getGravityScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getInertia(): Float {
    val _ret = __method_bind.getInertia.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearDamp(): Float {
    val _ret = __method_bind.getLinearDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearVelocity(): Vector2 {
    val _ret = __method_bind.getLinearVelocity.call(this._handle)
    return _ret.asVector2()
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
    return RigidBody2D.Mode.from(_ret.asInt())
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val _ret = __method_bind.getPhysicsMaterialOverride.call(this._handle)
    return _ret.toAny() as PhysicsMaterial
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

  fun isUsingCustomIntegrator(): Boolean {
    val _ret = __method_bind.isUsingCustomIntegrator.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _arg = Variant(angularDamp)
    __method_bind.setAngularDamp.call(this._handle, listOf(_arg))
  }

  fun setAngularVelocity(angularVelocity: Float) {
    val _arg = Variant(angularVelocity)
    __method_bind.setAngularVelocity.call(this._handle, listOf(_arg))
  }

  fun setAppliedForce(force: Vector2) {
    val _arg = Variant(force)
    __method_bind.setAppliedForce.call(this._handle, listOf(_arg))
  }

  fun setAppliedTorque(torque: Float) {
    val _arg = Variant(torque)
    __method_bind.setAppliedTorque.call(this._handle, listOf(_arg))
  }

  fun setAxisVelocity(axisVelocity: Vector2) {
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

  fun setContinuousCollisionDetectionMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setContinuousCollisionDetectionMode.call(this._handle, listOf(_arg))
  }

  fun setFriction(friction: Float) {
    val _arg = Variant(friction)
    __method_bind.setFriction.call(this._handle, listOf(_arg))
  }

  fun setGravityScale(gravityScale: Float) {
    val _arg = Variant(gravityScale)
    __method_bind.setGravityScale.call(this._handle, listOf(_arg))
  }

  fun setInertia(inertia: Float) {
    val _arg = Variant(inertia)
    __method_bind.setInertia.call(this._handle, listOf(_arg))
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant(linearDamp)
    __method_bind.setLinearDamp.call(this._handle, listOf(_arg))
  }

  fun setLinearVelocity(linearVelocity: Vector2) {
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

  fun setUseCustomIntegrator(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setUseCustomIntegrator.call(this._handle, listOf(_arg))
  }

  fun setWeight(weight: Float) {
    val _arg = Variant(weight)
    __method_bind.setWeight.call(this._handle, listOf(_arg))
  }

  fun testMotion(
    motion: Vector2,
    infiniteInertia: Boolean = true,
    margin: Float = 0.08f,
    result: Physics2DTestMotionResult
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(motion))
    _args.add(Variant.fromAny(infiniteInertia))
    _args.add(Variant.fromAny(margin))
    _args.add(Variant.fromAny(result))
    val _ret = __method_bind.testMotion.call(this._handle, _args)
    return _ret.asBoolean()
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

  enum class CCDMode(
    val value: Int
  ) {
    CCD_MODE_DISABLED(0),

    CCD_MODE_CAST_RAY(1),

    CCD_MODE_CAST_SHAPE(2);

    companion object {
      fun from(value: Int): CCDMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RigidBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RigidBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RigidBody2D
     */
    private object __method_bind {
      val addCentralForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_central_force" }
        }
      val addForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_force" }
        }
      val addTorque: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_torque" }
        }
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
        }
      val applyTorqueImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
        }
      val getAngularDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_damp" }
        }
      val getAngularVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
        }
      val getAppliedForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_applied_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_applied_force" }
        }
      val getAppliedTorque: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_applied_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_applied_torque" }
        }
      val getBounce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounce" }
        }
      val getCollidingBodies: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_colliding_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_colliding_bodies" }
        }
      val getContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_continuous_collision_detection_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_continuous_collision_detection_mode" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction" }
        }
      val getGravityScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_scale" }
        }
      val getInertia: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_inertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inertia" }
        }
      val getLinearDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_damp" }
        }
      val getLinearVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
        }
      val getMass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mass" }
        }
      val getMaxContactsReported: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_contacts_reported" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_material_override" }
        }
      val getWeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "get_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_weight" }
        }
      val isAbleToSleep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "is_able_to_sleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_able_to_sleep" }
        }
      val isContactMonitorEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "is_contact_monitor_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_contact_monitor_enabled" }
        }
      val isSleeping: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "is_sleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
        }
      val isUsingCustomIntegrator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "is_using_custom_integrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_custom_integrator" }
        }
      val setAngularDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_damp" }
        }
      val setAngularVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
        }
      val setAppliedForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_applied_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_applied_force" }
        }
      val setAppliedTorque: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_applied_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_applied_torque" }
        }
      val setAxisVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_axis_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis_velocity" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounce" }
        }
      val setCanSleep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_can_sleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_can_sleep" }
        }
      val setContactMonitor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_contact_monitor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_contact_monitor" }
        }
      val setContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_continuous_collision_detection_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_continuous_collision_detection_mode" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction" }
        }
      val setGravityScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_scale" }
        }
      val setInertia: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_inertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_inertia" }
        }
      val setLinearDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_damp" }
        }
      val setLinearVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
        }
      val setMass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mass" }
        }
      val setMaxContactsReported: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_contacts_reported" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_material_override" }
        }
      val setSleeping: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_sleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sleeping" }
        }
      val setUseCustomIntegrator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_use_custom_integrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_custom_integrator" }
        }
      val setWeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "set_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_weight" }
        }
      val testMotion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "test_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method test_motion" }
        }}
  }
}
