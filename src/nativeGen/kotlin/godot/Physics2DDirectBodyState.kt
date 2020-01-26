// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
import godot.core.Variant
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

open class Physics2DDirectBodyState internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addCentralForce() {
    TODO()
  }

  fun addForce() {
    TODO()
  }

  fun addTorque() {
    TODO()
  }

  fun applyCentralImpulse() {
    TODO()
  }

  fun applyImpulse() {
    TODO()
  }

  fun applyTorqueImpulse() {
    TODO()
  }

  fun getAngularVelocity(): Float {
    TODO()
  }

  fun getContactCollider(): RID {
    TODO()
  }

  fun getContactColliderId(): Int {
    TODO()
  }

  fun getContactColliderObject(): Object {
    TODO()
  }

  fun getContactColliderPosition(): Vector2 {
    TODO()
  }

  fun getContactColliderShape(): Int {
    TODO()
  }

  fun getContactColliderShapeMetadata(): Variant {
    TODO()
  }

  fun getContactColliderVelocityAtPosition(): Vector2 {
    TODO()
  }

  fun getContactCount(): Int {
    TODO()
  }

  fun getContactLocalNormal(): Vector2 {
    TODO()
  }

  fun getContactLocalPosition(): Vector2 {
    TODO()
  }

  fun getContactLocalShape(): Int {
    TODO()
  }

  fun getInverseInertia(): Float {
    TODO()
  }

  fun getInverseMass(): Float {
    TODO()
  }

  fun getLinearVelocity(): Vector2 {
    TODO()
  }

  fun getSpaceState(): Physics2DDirectSpaceState {
    TODO()
  }

  fun getStep(): Float {
    TODO()
  }

  fun getTotalAngularDamp(): Float {
    TODO()
  }

  fun getTotalGravity(): Vector2 {
    TODO()
  }

  fun getTotalLinearDamp(): Float {
    TODO()
  }

  fun getTransform(): Transform2D {
    TODO()
  }

  fun integrateForces() {
    TODO()
  }

  fun isSleeping(): Boolean {
    TODO()
  }

  fun setAngularVelocity() {
    TODO()
  }

  fun setLinearVelocity() {
    TODO()
  }

  fun setSleepState() {
    TODO()
  }

  fun setTransform() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DDirectBodyState
     */
    private object __method_bind {
      val add_central_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "add_central_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_central_force" }
            }
          }

      val add_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "add_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_force" }
            }
          }

      val add_torque: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "add_torque".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_torque" }
            }
          }

      val apply_central_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "apply_central_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
            }
          }

      val apply_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "apply_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
            }
          }

      val apply_torque_impulse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "apply_torque_impulse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
            }
          }

      val get_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
            }
          }

      val get_contact_collider: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_collider".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_collider" }
            }
          }

      val get_contact_collider_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_collider_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_collider_id" }
            }
          }

      val get_contact_collider_object: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_collider_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_collider_object" }
            }
          }

      val get_contact_collider_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_collider_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_collider_position"
              }
            }
          }

      val get_contact_collider_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_collider_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_collider_shape" }
            }
          }

      val get_contact_collider_shape_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_collider_shape_metadata".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_contact_collider_shape_metadata" }
            }
          }

      val get_contact_collider_velocity_at_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_collider_velocity_at_position".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_contact_collider_velocity_at_position" }
            }
          }

      val get_contact_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_count" }
            }
          }

      val get_contact_local_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_local_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_local_normal" }
            }
          }

      val get_contact_local_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_local_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_local_position" }
            }
          }

      val get_contact_local_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_contact_local_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_contact_local_shape" }
            }
          }

      val get_inverse_inertia: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_inverse_inertia".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inverse_inertia" }
            }
          }

      val get_inverse_mass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_inverse_mass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inverse_mass" }
            }
          }

      val get_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
            }
          }

      val get_space_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_space_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_space_state" }
            }
          }

      val get_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_step" }
            }
          }

      val get_total_angular_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_total_angular_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_total_angular_damp" }
            }
          }

      val get_total_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_total_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_total_gravity" }
            }
          }

      val get_total_linear_damp: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_total_linear_damp".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_total_linear_damp" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val integrate_forces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "integrate_forces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method integrate_forces" }
            }
          }

      val is_sleeping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "is_sleeping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
            }
          }

      val set_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "set_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
            }
          }

      val set_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "set_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
            }
          }

      val set_sleep_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "set_sleep_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sleep_state" }
            }
          }

      val set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
              "set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform" }
            }
          }
    }
  }
}
