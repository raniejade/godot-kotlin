// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Basis
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Transform2D
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

open class PhysicsDirectBodyState(
  _handle: COpaquePointer
) : Object(_handle) {
  var angularVelocity: Vector3
    get() {
       return getAngularVelocity() 
    }
    set(value) {
      setAngularVelocity(value)
    }

  val centerOfMass: Vector3
    get() {
       return getCenterOfMass() 
    }

  val inverseInertia: Vector3
    get() {
       return getInverseInertia() 
    }

  val inverseMass: Float
    get() {
       return getInverseMass() 
    }

  var linearVelocity: Vector3
    get() {
       return getLinearVelocity() 
    }
    set(value) {
      setLinearVelocity(value)
    }

  val principalInertiaAxes: Basis
    get() {
       return getPrincipalInertiaAxes() 
    }

  var sleeping: Boolean
    get() {
       return isSleeping() 
    }
    set(value) {
      setSleepState(value)
    }

  val step: Float
    get() {
       return getStep() 
    }

  val totalAngularDamp: Float
    get() {
       return getTotalAngularDamp() 
    }

  val totalGravity: Vector3
    get() {
       return getTotalGravity() 
    }

  val totalLinearDamp: Float
    get() {
       return getTotalLinearDamp() 
    }

  var transform: Transform2D
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
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

  fun applyCentralImpulse(j: Vector3) {
    val _arg = Variant.new(j)
    __method_bind.applyCentralImpulse.call(this._handle, _arg, 1)
  }

  fun applyImpulse(position: Vector3, j: Vector3) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(j)
    __method_bind.applyImpulse.call(this._handle, _args.toVariant(), 2)
  }

  fun applyTorqueImpulse(j: Vector3) {
    val _arg = Variant.new(j)
    __method_bind.applyTorqueImpulse.call(this._handle, _arg, 1)
  }

  fun getAngularVelocity(): Vector3 {
    val _ret = __method_bind.getAngularVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getCenterOfMass(): Vector3 {
    val _ret = __method_bind.getCenterOfMass.call(this._handle)
    return _ret.asVector3()
  }

  fun getContactCollider(contactIdx: Int): RID {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactCollider.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun getContactColliderId(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderId.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getContactColliderObject(contactIdx: Int): Object {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderObject.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
  }

  fun getContactColliderPosition(contactIdx: Int): Vector3 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderPosition.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getContactColliderShape(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderShape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector3 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderVelocityAtPosition.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getContactCount(): Int {
    val _ret = __method_bind.getContactCount.call(this._handle)
    return _ret.asInt()
  }

  fun getContactImpulse(contactIdx: Int): Float {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactImpulse.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getContactLocalNormal(contactIdx: Int): Vector3 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactLocalNormal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getContactLocalPosition(contactIdx: Int): Vector3 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactLocalPosition.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getContactLocalShape(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactLocalShape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getInverseInertia(): Vector3 {
    val _ret = __method_bind.getInverseInertia.call(this._handle)
    return _ret.asVector3()
  }

  fun getInverseMass(): Float {
    val _ret = __method_bind.getInverseMass.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearVelocity(): Vector3 {
    val _ret = __method_bind.getLinearVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getPrincipalInertiaAxes(): Basis {
    val _ret = __method_bind.getPrincipalInertiaAxes.call(this._handle)
    return _ret.asBasis()
  }

  fun getSpaceState(): PhysicsDirectSpaceState {
    val _ret = __method_bind.getSpaceState.call(this._handle)
    return _ret.asObject(::PhysicsDirectSpaceState)!!
  }

  fun getStep(): Float {
    val _ret = __method_bind.getStep.call(this._handle)
    return _ret.asFloat()
  }

  fun getTotalAngularDamp(): Float {
    val _ret = __method_bind.getTotalAngularDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getTotalGravity(): Vector3 {
    val _ret = __method_bind.getTotalGravity.call(this._handle)
    return _ret.asVector3()
  }

  fun getTotalLinearDamp(): Float {
    val _ret = __method_bind.getTotalLinearDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getTransform(): Transform {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun integrateForces() {
    __method_bind.integrateForces.call(this._handle)
  }

  fun isSleeping(): Boolean {
    val _ret = __method_bind.isSleeping.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAngularVelocity(velocity: Vector3) {
    val _arg = Variant.new(velocity)
    __method_bind.setAngularVelocity.call(this._handle, _arg, 1)
  }

  fun setLinearVelocity(velocity: Vector3) {
    val _arg = Variant.new(velocity)
    __method_bind.setLinearVelocity.call(this._handle, _arg, 1)
  }

  fun setSleepState(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSleepState.call(this._handle, _arg, 1)
  }

  fun setTransform(transform: Transform) {
    val _arg = Variant.new(transform)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsDirectBodyState
     */
    private object __method_bind {
      val addCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "addCentralForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCentralForce" }
        }
      val addForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "addForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addForce" }
        }
      val addTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "addTorque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTorque" }
        }
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "applyCentralImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyCentralImpulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "applyImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyImpulse" }
        }
      val applyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "applyTorqueImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method applyTorqueImpulse" }
        }
      val getAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAngularVelocity" }
        }
      val getCenterOfMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getCenterOfMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCenterOfMass" }
        }
      val getContactCollider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactCollider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactCollider" }
        }
      val getContactColliderId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactColliderId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactColliderId" }
        }
      val getContactColliderObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactColliderObject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactColliderObject" }
        }
      val getContactColliderPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactColliderPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactColliderPosition" }
        }
      val getContactColliderShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactColliderShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactColliderShape" }
        }
      val getContactColliderVelocityAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactColliderVelocityAtPosition".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method getContactColliderVelocityAtPosition" }
        }
      val getContactCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactCount" }
        }
      val getContactImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactImpulse" }
        }
      val getContactLocalNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactLocalNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactLocalNormal" }
        }
      val getContactLocalPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactLocalPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactLocalPosition" }
        }
      val getContactLocalShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getContactLocalShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContactLocalShape" }
        }
      val getInverseInertia: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getInverseInertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInverseInertia" }
        }
      val getInverseMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getInverseMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInverseMass" }
        }
      val getLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLinearVelocity" }
        }
      val getPrincipalInertiaAxes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getPrincipalInertiaAxes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPrincipalInertiaAxes" }
        }
      val getSpaceState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getSpaceState".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpaceState" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getStep".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStep" }
        }
      val getTotalAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getTotalAngularDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTotalAngularDamp" }
        }
      val getTotalGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getTotalGravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTotalGravity" }
        }
      val getTotalLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getTotalLinearDamp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTotalLinearDamp" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "getTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransform" }
        }
      val integrateForces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "integrateForces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method integrateForces" }
        }
      val isSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "isSleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSleeping" }
        }
      val setAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "setAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAngularVelocity" }
        }
      val setLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "setLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLinearVelocity" }
        }
      val setSleepState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "setSleepState".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSleepState" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsDirectBodyState".cstr.ptr,
            "setTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransform" }
        }}
  }
}
