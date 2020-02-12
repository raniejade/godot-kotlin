// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform
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

open class PhysicalBone(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PhysicsBody(null) {
  var bodyOffset: Transform
    get() {
       return getBodyOffset() 
    }
    set(value) {
      setBodyOffset(value)
    }

  var bounce: Float
    get() {
       return getBounce() 
    }
    set(value) {
      setBounce(value)
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

  var jointOffset: Transform
    get() {
       return getJointOffset() 
    }
    set(value) {
      setJointOffset(value)
    }

  var jointType: JointType
    get() {
       return getJointType() 
    }
    set(value) {
      setJointType(value.value)
    }

  var mass: Float
    get() {
       return getMass() 
    }
    set(value) {
      setMass(value)
    }

  var weight: Float
    get() {
       return getWeight() 
    }
    set(value) {
      setWeight(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for bodyOffset
   */
  fun bodyOffset(cb: Transform.() -> Unit) {
    val _p = bodyOffset
    cb(_p)
    bodyOffset = _p
  }

  /**
   * Specialized setter for jointOffset
   */
  fun jointOffset(cb: Transform.() -> Unit) {
    val _p = jointOffset
    cb(_p)
    jointOffset = _p
  }

  fun applyCentralImpulse(impulse: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.applyCentralImpulse.call(self._handle, listOf(impulse), null)
    }
  }

  fun applyImpulse(position: Vector3, impulse: Vector3) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(impulse)
      __method_bind.applyImpulse.call(self._handle, _args, null)
    }
  }

  fun getBodyOffset(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getBodyOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBoneId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBoneId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBounce(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBounce.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFriction(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFriction.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGravityScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGravityScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getJointOffset(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getJointOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getJointType(): JointType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJointType.call(self._handle, emptyList(), _retPtr)
      PhysicalBone.JointType.from(_ret.value)
    }
  }

  fun getMass(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMass.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSimulatePhysics(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSimulatePhysics.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getWeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isSimulatingPhysics(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSimulatingPhysics.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isStaticBody(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isStaticBody.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBodyOffset(offset: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBodyOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setBounce(bounce: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBounce.call(self._handle, listOf(bounce), null)
    }
  }

  fun setFriction(friction: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFriction.call(self._handle, listOf(friction), null)
    }
  }

  fun setGravityScale(gravityScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGravityScale.call(self._handle, listOf(gravityScale), null)
    }
  }

  fun setJointOffset(offset: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setJointOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setJointType(jointType: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setJointType.call(self._handle, listOf(jointType), null)
    }
  }

  fun setMass(mass: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMass.call(self._handle, listOf(mass), null)
    }
  }

  fun setWeight(weight: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWeight.call(self._handle, listOf(weight), null)
    }
  }

  enum class JointType(
    val value: Int
  ) {
    NONE(0),

    PIN(1),

    CONE(2),

    HINGE(3),

    SLIDER(4),

    `6DOF`(5);

    companion object {
      fun from(value: Int): JointType {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicalBone".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PhysicalBone" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PhysicalBone
     */
    private object __method_bind {
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
        }
      val getBodyOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_body_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_offset" }
        }
      val getBoneId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_bone_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_id" }
        }
      val getBounce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounce" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction" }
        }
      val getGravityScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_scale" }
        }
      val getJointOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_joint_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joint_offset" }
        }
      val getJointType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_joint_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joint_type" }
        }
      val getMass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mass" }
        }
      val getSimulatePhysics: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_simulate_physics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_simulate_physics" }
        }
      val getWeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_weight" }
        }
      val isSimulatingPhysics: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "is_simulating_physics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_simulating_physics" }
        }
      val isStaticBody: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "is_static_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_static_body" }
        }
      val setBodyOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_body_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_body_offset" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounce" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction" }
        }
      val setGravityScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_scale" }
        }
      val setJointOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_joint_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_joint_offset" }
        }
      val setJointType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_joint_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_joint_type" }
        }
      val setMass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mass" }
        }
      val setWeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_weight" }
        }}
  }
}
