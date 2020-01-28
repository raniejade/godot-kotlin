// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
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

open class Physics2DDirectBodyState(
  _handle: COpaquePointer
) : Object(_handle) {
  var angularVelocity: Float
    get() {
       return getAngularVelocity() 
    }
    set(value) {
      setAngularVelocity(value)
    }

  val inverseInertia: Float
    get() {
       return getInverseInertia() 
    }

  val inverseMass: Float
    get() {
       return getInverseMass() 
    }

  var linearVelocity: Vector2
    get() {
       return getLinearVelocity() 
    }
    set(value) {
      setLinearVelocity(value)
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

  val totalGravity: Vector2
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

  fun applyTorqueImpulse(impulse: Float) {
    val _arg = Variant.new(impulse)
    __method_bind.applyTorqueImpulse.call(this._handle, _arg, 1)
  }

  fun getAngularVelocity(): Float {
    val _ret = __method_bind.getAngularVelocity.call(this._handle)
    return _ret.asFloat()
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

  fun getContactColliderPosition(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactColliderShape(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderShape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getContactColliderShapeMetadata(contactIdx: Int): Variant {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderShapeMetadata.call(this._handle, _arg, 1)
    return _ret
  }

  fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactColliderVelocityAtPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactCount(): Int {
    val _ret = __method_bind.getContactCount.call(this._handle)
    return _ret.asInt()
  }

  fun getContactLocalNormal(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactLocalNormal.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactLocalPosition(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactLocalPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactLocalShape(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.getContactLocalShape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getInverseInertia(): Float {
    val _ret = __method_bind.getInverseInertia.call(this._handle)
    return _ret.asFloat()
  }

  fun getInverseMass(): Float {
    val _ret = __method_bind.getInverseMass.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearVelocity(): Vector2 {
    val _ret = __method_bind.getLinearVelocity.call(this._handle)
    return _ret.asVector2()
  }

  fun getSpaceState(): Physics2DDirectSpaceState {
    val _ret = __method_bind.getSpaceState.call(this._handle)
    return _ret.asObject(::Physics2DDirectSpaceState)!!
  }

  fun getStep(): Float {
    val _ret = __method_bind.getStep.call(this._handle)
    return _ret.asFloat()
  }

  fun getTotalAngularDamp(): Float {
    val _ret = __method_bind.getTotalAngularDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getTotalGravity(): Vector2 {
    val _ret = __method_bind.getTotalGravity.call(this._handle)
    return _ret.asVector2()
  }

  fun getTotalLinearDamp(): Float {
    val _ret = __method_bind.getTotalLinearDamp.call(this._handle)
    return _ret.asFloat()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun integrateForces() {
    __method_bind.integrateForces.call(this._handle)
  }

  fun isSleeping(): Boolean {
    val _ret = __method_bind.isSleeping.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAngularVelocity(velocity: Float) {
    val _arg = Variant.new(velocity)
    __method_bind.setAngularVelocity.call(this._handle, _arg, 1)
  }

  fun setLinearVelocity(velocity: Vector2) {
    val _arg = Variant.new(velocity)
    __method_bind.setLinearVelocity.call(this._handle, _arg, 1)
  }

  fun setSleepState(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSleepState.call(this._handle, _arg, 1)
  }

  fun setTransform(transform: Transform2D) {
    val _arg = Variant.new(transform)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DDirectBodyState
     */
    private object __method_bind {
      val addCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_central_force" }
        }
      val addForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_force" }
        }
      val addTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_torque" }
        }
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
        }
      val applyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
        }
      val getAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
        }
      val getContactCollider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider" }
        }
      val getContactColliderId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_id" }
        }
      val getContactColliderObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_object" }
        }
      val getContactColliderPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_position" }
        }
      val getContactColliderShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_shape" }
        }
      val getContactColliderShapeMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_shape_metadata".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_contact_collider_shape_metadata" }
        }
      val getContactColliderVelocityAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_velocity_at_position".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_contact_collider_velocity_at_position" }
        }
      val getContactCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_count" }
        }
      val getContactLocalNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_normal" }
        }
      val getContactLocalPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_position" }
        }
      val getContactLocalShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_shape" }
        }
      val getInverseInertia: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_inverse_inertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inverse_inertia" }
        }
      val getInverseMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_inverse_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inverse_mass" }
        }
      val getLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
        }
      val getSpaceState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_space_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_state" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val getTotalAngularDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_angular_damp" }
        }
      val getTotalGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_gravity" }
        }
      val getTotalLinearDamp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_linear_damp" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val integrateForces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "integrate_forces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method integrate_forces" }
        }
      val isSleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "is_sleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
        }
      val setAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
        }
      val setLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
        }
      val setSleepState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_sleep_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sleep_state" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }}
  }
}
