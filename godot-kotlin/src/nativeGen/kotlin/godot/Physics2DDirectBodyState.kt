// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class Physics2DDirectBodyState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for linearVelocity
   */
  fun linearVelocity(cb: Vector2.() -> Unit) {
    val _p = linearVelocity
    cb(_p)
    linearVelocity = _p
  }

  /**
   * Specialized setter for transform
   */
  fun transform(cb: Transform2D.() -> Unit) {
    val _p = transform
    cb(_p)
    transform = _p
  }

  fun addCentralForce(force: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addCentralForce.call(self._handle, listOf(force), null)
    }
  }

  fun addForce(offset: Vector2, force: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(offset)
      _args.add(force)
      __method_bind.addForce.call(self._handle, _args, null)
    }
  }

  fun addTorque(torque: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addTorque.call(self._handle, listOf(torque), null)
    }
  }

  fun applyCentralImpulse(impulse: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.applyCentralImpulse.call(self._handle, listOf(impulse), null)
    }
  }

  fun applyImpulse(offset: Vector2, impulse: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(offset)
      _args.add(impulse)
      __method_bind.applyImpulse.call(self._handle, _args, null)
    }
  }

  fun applyTorqueImpulse(impulse: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.applyTorqueImpulse.call(self._handle, listOf(impulse), null)
    }
  }

  fun getAngularVelocity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAngularVelocity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getContactCollider(contactIdx: Int): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getContactCollider.call(self._handle, listOf(contactIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getContactColliderId(contactIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getContactColliderId.call(self._handle, listOf(contactIdx), _retPtr)
      _ret.value
    }
  }

  fun getContactColliderObject(contactIdx: Int): Object {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Object
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getContactColliderObject.call(self._handle, listOf(contactIdx), _retPtr)
      _ret = objectToType<Object>(_tmp.value!!)
      _ret
    }
  }

  fun getContactColliderPosition(contactIdx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getContactColliderPosition.call(self._handle, listOf(contactIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getContactColliderShape(contactIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getContactColliderShape.call(self._handle, listOf(contactIdx), _retPtr)
      _ret.value
    }
  }

  fun getContactColliderShapeMetadata(contactIdx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getContactColliderShapeMetadata.call(self._handle, listOf(contactIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getContactColliderVelocityAtPosition(contactIdx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getContactColliderVelocityAtPosition.call(self._handle, listOf(contactIdx),
          _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getContactCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getContactCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getContactLocalNormal(contactIdx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getContactLocalNormal.call(self._handle, listOf(contactIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getContactLocalPosition(contactIdx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getContactLocalPosition.call(self._handle, listOf(contactIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getContactLocalShape(contactIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getContactLocalShape.call(self._handle, listOf(contactIdx), _retPtr)
      _ret.value
    }
  }

  fun getInverseInertia(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInverseInertia.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getInverseMass(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInverseMass.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLinearVelocity(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getLinearVelocity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSpaceState(): Physics2DDirectSpaceState {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Physics2DDirectSpaceState
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSpaceState.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Physics2DDirectSpaceState>(_tmp.value!!)
      _ret
    }
  }

  fun getStep(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStep.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTotalAngularDamp(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTotalAngularDamp.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTotalGravity(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getTotalGravity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTotalLinearDamp(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTotalLinearDamp.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun integrateForces() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.integrateForces.call(self._handle, emptyList(), null)
    }
  }

  fun isSleeping(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSleeping.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAngularVelocity(velocity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAngularVelocity.call(self._handle, listOf(velocity), null)
    }
  }

  fun setLinearVelocity(velocity: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLinearVelocity.call(self._handle, listOf(velocity), null)
    }
  }

  fun setSleepState(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSleepState.call(self._handle, listOf(enabled), null)
    }
  }

  fun setTransform(transform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransform.call(self._handle, listOf(transform), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DDirectBodyState
     */
    private object __method_bind {
      val addCentralForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_central_force" }
        }
      val addForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_force" }
        }
      val addTorque: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_torque" }
        }
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
        }
      val applyTorqueImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_torque_impulse" }
        }
      val getAngularVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_angular_velocity" }
        }
      val getContactCollider: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider" }
        }
      val getContactColliderId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_id" }
        }
      val getContactColliderObject: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_object" }
        }
      val getContactColliderPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_position" }
        }
      val getContactColliderShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_collider_shape" }
        }
      val getContactColliderShapeMetadata: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_shape_metadata".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_contact_collider_shape_metadata" }
        }
      val getContactColliderVelocityAtPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_collider_velocity_at_position".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_contact_collider_velocity_at_position" }
        }
      val getContactCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_count" }
        }
      val getContactLocalNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_normal" }
        }
      val getContactLocalPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_position" }
        }
      val getContactLocalShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_contact_local_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_contact_local_shape" }
        }
      val getInverseInertia: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_inverse_inertia".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inverse_inertia" }
        }
      val getInverseMass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_inverse_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inverse_mass" }
        }
      val getLinearVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_linear_velocity" }
        }
      val getSpaceState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_space_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space_state" }
        }
      val getStep: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_step" }
        }
      val getTotalAngularDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_angular_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_angular_damp" }
        }
      val getTotalGravity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_gravity" }
        }
      val getTotalLinearDamp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_total_linear_damp".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_linear_damp" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val integrateForces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "integrate_forces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method integrate_forces" }
        }
      val isSleeping: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "is_sleeping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_sleeping" }
        }
      val setAngularVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_angular_velocity" }
        }
      val setLinearVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_linear_velocity" }
        }
      val setSleepState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_sleep_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sleep_state" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectBodyState".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }}
  }
}
