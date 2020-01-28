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

open class RigidBody(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
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

  var mode: Int
    get() {
       return RigidBody.Mode.from(getMode()) 
    }
    set(value) {
      setMode(RigidBody.Mode.from(value))
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

  fun addCentralForce(force: Vector3) {
    val _arg = Variant.new(force)
    __method_bind.addCentralForce.call(this._handle, _arg, 1)
  }

  fun addForce(force: Vector3, position: Vector3) {
    val _args = VariantArray.new()
    _args.append(force)
    _args.append(position)
    __method_bind.addForce.call(this._handle, _args.toVariant(), 2)
  }

  fun addTorque(torque: Vector3) {
    val _arg = Variant.new(torque)
    __method_bind.addTorque.call(this._handle, _arg, 1)
  }

  fun applyCentralImpulse(impulse: Vector3) {
    val _arg = Variant.new(impulse)
    __method_bind.applyCentralImpulse.call(this._handle, _arg, 1)
  }

  fun applyImpulse(position: Vector3, impulse: Vector3) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(impulse)
    __method_bind.applyImpulse.call(this._handle, _args.toVariant(), 2)
  }

  fun applyTorqueImpulse(impulse: Vector3) {
    val _arg = Variant.new(impulse)
    __method_bind.applyTorqueImpulse.call(this._handle, _arg, 1)
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
    val _arg = Variant.new(axis)
    val _ret = __method_bind.getAxisLock.call(this._handle, _arg, 1)
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
    val _arg = Variant.new(angularDamp)
    __method_bind.setAngularDamp.call(this._handle, _arg, 1)
  }

  fun setAngularVelocity(angularVelocity: Vector3) {
    val _arg = Variant.new(angularVelocity)
    __method_bind.setAngularVelocity.call(this._handle, _arg, 1)
  }

  fun setAxisLock(axis: Int, lock: Boolean) {
    val _args = VariantArray.new()
    _args.append(axis)
    _args.append(lock)
    __method_bind.setAxisLock.call(this._handle, _args.toVariant(), 2)
  }

  fun setAxisVelocity(axisVelocity: Vector3) {
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

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.setFriction.call(this._handle, _arg, 1)
  }

  fun setGravityScale(gravityScale: Float) {
    val _arg = Variant.new(gravityScale)
    __method_bind.setGravityScale.call(this._handle, _arg, 1)
  }

  fun setLinearDamp(linearDamp: Float) {
    val _arg = Variant.new(linearDamp)
    __method_bind.setLinearDamp.call(this._handle, _arg, 1)
  }

  fun setLinearVelocity(linearVelocity: Vector3) {
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

  fun setUseContinuousCollisionDetection(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseContinuousCollisionDetection.call(this._handle, _arg, 1)
  }

  fun setUseCustomIntegrator(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseCustomIntegrator.call(this._handle, _arg, 1)
  }

  fun setWeight(weight: Float) {
    val _arg = Variant.new(weight)
    __method_bind.setWeight.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for RigidBody" }
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
      val addCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "addCentralForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCentralForce" }
        }
      val addForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "addForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addForce" }
        }
      val addTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "addTorque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTorque" }
        }
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "applyCentralImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyCentralImpulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "applyImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyImpulse" }
        }
      val applyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "applyTorqueImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyTorqueImpulse" }
        }
      val getAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getAngularDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAngularDamp" }
        }
      val getAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAngularVelocity" }
        }
      val getAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getAxisLock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAxisLock" }
        }
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBounce" }
        }
      val getCollidingBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getCollidingBodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollidingBodies" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFriction" }
        }
      val getGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getGravityScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGravityScale" }
        }
      val getLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getLinearDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinearDamp" }
        }
      val getLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinearVelocity" }
        }
      val getMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMass" }
        }
      val getMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getMaxContactsReported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxContactsReported" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMode" }
        }
      val getPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getPhysicsMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPhysicsMaterialOverride" }
        }
      val getWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "getWeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWeight" }
        }
      val isAbleToSleep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "isAbleToSleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAbleToSleep" }
        }
      val isContactMonitorEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "isContactMonitorEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isContactMonitorEnabled" }
        }
      val isSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "isSleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSleeping" }
        }
      val isUsingContinuousCollisionDetection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "isUsingContinuousCollisionDetection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method isUsingContinuousCollisionDetection" }
        }
      val isUsingCustomIntegrator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "isUsingCustomIntegrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingCustomIntegrator" }
        }
      val setAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setAngularDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAngularDamp" }
        }
      val setAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAngularVelocity" }
        }
      val setAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setAxisLock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAxisLock" }
        }
      val setAxisVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setAxisVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAxisVelocity" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBounce" }
        }
      val setCanSleep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setCanSleep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCanSleep" }
        }
      val setContactMonitor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setContactMonitor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setContactMonitor" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFriction" }
        }
      val setGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setGravityScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravityScale" }
        }
      val setLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setLinearDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinearDamp" }
        }
      val setLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinearVelocity" }
        }
      val setMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMass" }
        }
      val setMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setMaxContactsReported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxContactsReported" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMode" }
        }
      val setPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setPhysicsMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPhysicsMaterialOverride" }
        }
      val setSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setSleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSleeping" }
        }
      val setUseContinuousCollisionDetection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setUseContinuousCollisionDetection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseContinuousCollisionDetection"
            }
        }
      val setUseCustomIntegrator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setUseCustomIntegrator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseCustomIntegrator" }
        }
      val setWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RigidBody".cstr.ptr,
            "setWeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWeight" }
        }}
  }
}
