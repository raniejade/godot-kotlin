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
  fun addCentralForce(force: Vector2) {
    val _arg = Variant.new(force)
    __method_bind.add_central_force.call(this._handle, _arg, 1)
  }

  fun addForce(offset: Vector2, force: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(force)
    __method_bind.add_force.call(this._handle, _args.toVariant(), 2)
  }

  fun addTorque(torque: Float) {
    val _arg = Variant.new(torque)
    __method_bind.add_torque.call(this._handle, _arg, 1)
  }

  fun applyCentralImpulse(impulse: Vector2) {
    val _arg = Variant.new(impulse)
    __method_bind.apply_central_impulse.call(this._handle, _arg, 1)
  }

  fun applyImpulse(offset: Vector2, impulse: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(impulse)
    __method_bind.apply_impulse.call(this._handle, _args.toVariant(), 2)
  }

  fun applyTorqueImpulse(impulse: Float) {
    val _arg = Variant.new(impulse)
    __method_bind.apply_torque_impulse.call(this._handle, _arg, 1)
  }

  fun getAngularVelocity(): Float {
    val _ret = __method_bind.get_angular_velocity.call(this._handle)
    return _ret.asFloat()
  }

  fun getContactCollider(contactIdx: Int): RID {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_collider.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun getContactColliderId(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_collider_id.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getContactColliderObject(contactIdx: Int): Object {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_collider_object.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
  }

  fun getContactColliderPosition(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_collider_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactColliderShape(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_collider_shape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getContactColliderShapeMetadata(contactIdx: Int): Variant {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_collider_shape_metadata.call(this._handle, _arg, 1)
    return _ret
  }

  fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_collider_velocity_at_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactCount(): Int {
    val _ret = __method_bind.get_contact_count.call(this._handle)
    return _ret.asInt()
  }

  fun getContactLocalNormal(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_local_normal.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactLocalPosition(contactIdx: Int): Vector2 {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_local_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getContactLocalShape(contactIdx: Int): Int {
    val _arg = Variant.new(contactIdx)
    val _ret = __method_bind.get_contact_local_shape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getInverseInertia(): Float {
    val _ret = __method_bind.get_inverse_inertia.call(this._handle)
    return _ret.asFloat()
  }

  fun getInverseMass(): Float {
    val _ret = __method_bind.get_inverse_mass.call(this._handle)
    return _ret.asFloat()
  }

  fun getLinearVelocity(): Vector2 {
    val _ret = __method_bind.get_linear_velocity.call(this._handle)
    return _ret.asVector2()
  }

  fun getSpaceState(): Physics2DDirectSpaceState {
    val _ret = __method_bind.get_space_state.call(this._handle)
    return _ret.asObject(::Physics2DDirectSpaceState)!!
  }

  fun getStep(): Float {
    val _ret = __method_bind.get_step.call(this._handle)
    return _ret.asFloat()
  }

  fun getTotalAngularDamp(): Float {
    val _ret = __method_bind.get_total_angular_damp.call(this._handle)
    return _ret.asFloat()
  }

  fun getTotalGravity(): Vector2 {
    val _ret = __method_bind.get_total_gravity.call(this._handle)
    return _ret.asVector2()
  }

  fun getTotalLinearDamp(): Float {
    val _ret = __method_bind.get_total_linear_damp.call(this._handle)
    return _ret.asFloat()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.get_transform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun integrateForces() {
    __method_bind.integrate_forces.call(this._handle)
  }

  fun isSleeping(): Boolean {
    val _ret = __method_bind.is_sleeping.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAngularVelocity(velocity: Float) {
    val _arg = Variant.new(velocity)
    __method_bind.set_angular_velocity.call(this._handle, _arg, 1)
  }

  fun setLinearVelocity(velocity: Vector2) {
    val _arg = Variant.new(velocity)
    __method_bind.set_linear_velocity.call(this._handle, _arg, 1)
  }

  fun setSleepState(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_sleep_state.call(this._handle, _arg, 1)
  }

  fun setTransform(transform: Transform2D) {
    val _arg = Variant.new(transform)
    __method_bind.set_transform.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DDirectBodyState
     */
    private object __method_bind {
      val add_central_force: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_central_force" }
        }
      val add_force: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_force" }
        }
      val add_torque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_torque" }
        }
      val apply_central_impulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
        }
      val apply_impulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
        }
      val apply_torque_impulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
        }
      val get_angular_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
        }
      val get_contact_collider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider" }
        }
      val get_contact_collider_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_id" }
        }
      val get_contact_collider_object: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_object" }
        }
      val get_contact_collider_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_position" }
        }
      val get_contact_collider_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_shape" }
        }
      val get_contact_collider_shape_metadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_shape_metadata".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_contact_collider_shape_metadata" }
        }
      val get_contact_collider_velocity_at_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_velocity_at_position".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_contact_collider_velocity_at_position" }
        }
      val get_contact_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_count" }
        }
      val get_contact_local_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_normal" }
        }
      val get_contact_local_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_position" }
        }
      val get_contact_local_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_shape" }
        }
      val get_inverse_inertia: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_inverse_inertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inverse_inertia" }
        }
      val get_inverse_mass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_inverse_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inverse_mass" }
        }
      val get_linear_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
        }
      val get_space_state: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_space_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_state" }
        }
      val get_step: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val get_total_angular_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_angular_damp" }
        }
      val get_total_gravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_gravity" }
        }
      val get_total_linear_damp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_linear_damp" }
        }
      val get_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val integrate_forces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "integrate_forces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method integrate_forces" }
        }
      val is_sleeping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "is_sleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
        }
      val set_angular_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
        }
      val set_linear_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
        }
      val set_sleep_state: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_sleep_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sleep_state" }
        }
      val set_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }}
  }
}
