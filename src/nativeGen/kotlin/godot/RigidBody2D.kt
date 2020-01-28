// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
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

open class RigidBody2D(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
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

  var continuousCd: Int
    get() {
       return RigidBody2D.CCDMode.from(getContinuousCollisionDetectionMode()) 
    }
    set(value) {
      setContinuousCollisionDetectionMode(RigidBody2D.CCDMode.from(value))
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

  var mode: Int
    get() {
       return RigidBody2D.Mode.from(getMode()) 
    }
    set(value) {
      setMode(RigidBody2D.Mode.from(value))
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

  fun addCentralForce(force: Vector2) {
    val _arg = Variant.new(force)
    __method_bind.addCentralForce.call(this._handle, _arg, 1)
  }

  fun addForce(offset: Vector2, force: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(force)
    __method_bind.addForce.call(this._handle, _args.toVariant(), 2)
  }

  fun addTorque(torque: Float) {
    val _arg = Variant.new(torque)
    __method_bind.addTorque.call(this._handle, _arg, 1)
  }

  fun applyCentralImpulse(impulse: Vector2) {
    val _arg = Variant.new(impulse)
    __method_bind.applyCentralImpulse.call(this._handle, _arg, 1)
  }

  fun applyImpulse(offset: Vector2, impulse: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(impulse)
    __method_bind.applyImpulse.call(this._handle, _args.toVariant(), 2)
  }

  fun applyTorqueImpulse(torque: Float) {
    val _arg = Variant.new(torque)
    __method_bind.applyTorqueImpulse.call(this._handle, _arg, 1)
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

  fun isUsingCustomIntegrator(): Boolean {
    val _ret = __method_bind.isUsingCustomIntegrator.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAngularDamp(angularDamp: Float) {
    val _arg = Variant.new(angularDamp)
    __method_bind.setAngularDamp.call(this._handle, _arg, 1)
  }

  fun setAngularVelocity(angularVelocity: Float) {
    val _arg = Variant.new(angularVelocity)
    __method_bind.setAngularVelocity.call(this._handle, _arg, 1)
  }

  fun setAppliedForce(force: Vector2) {
    val _arg = Variant.new(force)
    __method_bind.setAppliedForce.call(this._handle, _arg, 1)
  }

  fun setAppliedTorque(torque: Float) {
    val _arg = Variant.new(torque)
    __method_bind.setAppliedTorque.call(this._handle, _arg, 1)
  }

  fun setAxisVelocity(axisVelocity: Vector2) {
    val _arg = Variant.new(axisVelocity)
    __method_bind.setAxisVelocity.call(this._handle, _arg, 1)
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant.new(bounce)
    __method_bind.setBounce.call(this._handle, _arg, 1)
  }

  fun setCanSleep(ableToSleep: Boolean) {
    val _arg = Variant.new(ableToSleep)
    __method_bind.setCanSleep.call(this._handle, _arg, 1)
  }

  fun setContactMonitor(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setContactMonitor.call(this._handle, _arg, 1)
  }

  fun setContinuousCollisionDetectionMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setContinuousCollisionDetectionMode.call(this._handle, _arg, 1)
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.setFriction.call(this._handle, _arg, 1)
  }

  fun setGravityScale(gravityScale: Float) {
    val _arg = Variant.new(gravityScale)
    __method_bind.setGravityScale.call(this._handle, _arg, 1)
  }

  fun setInertia(inertia: Float) {
    val _arg = Variant.new(inertia)
    __method_bind.setInertia.call(this._handle, _arg, 1)
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant.new(linearDamp)
    __method_bind.setLinearDamp.call(this._handle, _arg, 1)
  }

  fun setLinearVelocity(linearVelocity: Vector2) {
    val _arg = Variant.new(linearVelocity)
    __method_bind.setLinearVelocity.call(this._handle, _arg, 1)
  }

  fun setMass(mass: Float) {
    val _arg = Variant.new(mass)
    __method_bind.setMass.call(this._handle, _arg, 1)
  }

  fun setMaxContactsReported(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setMaxContactsReported.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, _arg, 1)
  }

  fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val _arg = Variant.new(physicsMaterialOverride)
    __method_bind.setPhysicsMaterialOverride.call(this._handle, _arg, 1)
  }

  fun setSleeping(sleeping: Boolean) {
    val _arg = Variant.new(sleeping)
    __method_bind.setSleeping.call(this._handle, _arg, 1)
  }

  fun setUseCustomIntegrator(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseCustomIntegrator.call(this._handle, _arg, 1)
  }

  fun setWeight(weight: Float) {
    val _arg = Variant.new(weight)
    __method_bind.setWeight.call(this._handle, _arg, 1)
  }

  fun testMotion(
    motion: Vector2,
    infiniteInertia: Boolean,
    margin: Float,
    result: Physics2DTestMotionResult
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(motion)
    _args.append(infiniteInertia)
    _args.append(margin)
    _args.append(result)
    val _ret = __method_bind.testMotion.call(this._handle, _args.toVariant(), 4)
    return _ret.asBoolean()
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
    val CCD_MODE_CAST_RAY: Int = 1

    val CCD_MODE_CAST_SHAPE: Int = 2

    val CCD_MODE_DISABLED: Int = 0

    val MODE_CHARACTER: Int = 2

    val MODE_KINEMATIC: Int = 3

    val MODE_RIGID: Int = 0

    val MODE_STATIC: Int = 1

    fun new(): RigidBody2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RigidBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RigidBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RigidBody2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RigidBody2D = RigidBody2D(ptr)
    /**
     * Container for method_bind pointers for RigidBody2D
     */
    private object __method_bind {
      val addCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "addCentralForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCentralForce" }
        }
      val addForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "addForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addForce" }
        }
      val addTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "addTorque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTorque" }
        }
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "applyCentralImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyCentralImpulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "applyImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyImpulse" }
        }
      val applyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "applyTorqueImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyTorqueImpulse" }
        }
      val getAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getAngularDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAngularDamp" }
        }
      val getAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAngularVelocity" }
        }
      val getAppliedForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getAppliedForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAppliedForce" }
        }
      val getAppliedTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getAppliedTorque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAppliedTorque" }
        }
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBounce" }
        }
      val getCollidingBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getCollidingBodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollidingBodies" }
        }
      val getContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getContinuousCollisionDetectionMode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method getContinuousCollisionDetectionMode" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFriction" }
        }
      val getGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getGravityScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGravityScale" }
        }
      val getInertia: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getInertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInertia" }
        }
      val getLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getLinearDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinearDamp" }
        }
      val getLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinearVelocity" }
        }
      val getMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMass" }
        }
      val getMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getMaxContactsReported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxContactsReported" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMode" }
        }
      val getPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getPhysicsMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPhysicsMaterialOverride" }
        }
      val getWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "getWeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWeight" }
        }
      val isAbleToSleep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "isAbleToSleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAbleToSleep" }
        }
      val isContactMonitorEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "isContactMonitorEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isContactMonitorEnabled" }
        }
      val isSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "isSleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSleeping" }
        }
      val isUsingCustomIntegrator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "isUsingCustomIntegrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingCustomIntegrator" }
        }
      val setAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setAngularDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAngularDamp" }
        }
      val setAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAngularVelocity" }
        }
      val setAppliedForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setAppliedForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAppliedForce" }
        }
      val setAppliedTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setAppliedTorque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAppliedTorque" }
        }
      val setAxisVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setAxisVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAxisVelocity" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBounce" }
        }
      val setCanSleep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setCanSleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCanSleep" }
        }
      val setContactMonitor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setContactMonitor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setContactMonitor" }
        }
      val setContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setContinuousCollisionDetectionMode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method setContinuousCollisionDetectionMode" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFriction" }
        }
      val setGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setGravityScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravityScale" }
        }
      val setInertia: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setInertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInertia" }
        }
      val setLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setLinearDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinearDamp" }
        }
      val setLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinearVelocity" }
        }
      val setMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMass" }
        }
      val setMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setMaxContactsReported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxContactsReported" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMode" }
        }
      val setPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setPhysicsMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPhysicsMaterialOverride" }
        }
      val setSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setSleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSleeping" }
        }
      val setUseCustomIntegrator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setUseCustomIntegrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseCustomIntegrator" }
        }
      val setWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "setWeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWeight" }
        }
      val testMotion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody2D".cstr.ptr,
            "testMotion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method testMotion" }
        }}
  }
}
