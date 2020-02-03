// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PhysicalBone(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
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
    val _arg = Variant.new(impulse)
    __method_bind.applyCentralImpulse.call(this._handle, listOf(_arg))
  }

  fun applyImpulse(position: Vector3, impulse: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(impulse))
    __method_bind.applyImpulse.call(this._handle, _args)
  }

  fun getBodyOffset(): Transform {
    val _ret = __method_bind.getBodyOffset.call(this._handle)
    return _ret.asTransform()
  }

  fun getBoneId(): Int {
    val _ret = __method_bind.getBoneId.call(this._handle)
    return _ret.asInt()
  }

  fun getBounce(): Float {
    val _ret = __method_bind.getBounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.getFriction.call(this._handle)
    return _ret.asFloat()
  }

  fun getGravityScale(): Float {
    val _ret = __method_bind.getGravityScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getJointOffset(): Transform {
    val _ret = __method_bind.getJointOffset.call(this._handle)
    return _ret.asTransform()
  }

  fun getJointType(): JointType {
    val _ret = __method_bind.getJointType.call(this._handle)
    return PhysicalBone.JointType.from(_ret.asInt())
  }

  fun getMass(): Float {
    val _ret = __method_bind.getMass.call(this._handle)
    return _ret.asFloat()
  }

  fun getSimulatePhysics(): Boolean {
    val _ret = __method_bind.getSimulatePhysics.call(this._handle)
    return _ret.asBoolean()
  }

  fun getWeight(): Float {
    val _ret = __method_bind.getWeight.call(this._handle)
    return _ret.asFloat()
  }

  fun isSimulatingPhysics(): Boolean {
    val _ret = __method_bind.isSimulatingPhysics.call(this._handle)
    return _ret.asBoolean()
  }

  fun isStaticBody(): Boolean {
    val _ret = __method_bind.isStaticBody.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBodyOffset(offset: Transform) {
    val _arg = Variant.new(offset)
    __method_bind.setBodyOffset.call(this._handle, listOf(_arg))
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant.new(bounce)
    __method_bind.setBounce.call(this._handle, listOf(_arg))
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.setFriction.call(this._handle, listOf(_arg))
  }

  fun setGravityScale(gravityScale: Float) {
    val _arg = Variant.new(gravityScale)
    __method_bind.setGravityScale.call(this._handle, listOf(_arg))
  }

  fun setJointOffset(offset: Transform) {
    val _arg = Variant.new(offset)
    __method_bind.setJointOffset.call(this._handle, listOf(_arg))
  }

  fun setJointType(jointType: Int) {
    val _arg = Variant.new(jointType)
    __method_bind.setJointType.call(this._handle, listOf(_arg))
  }

  fun setMass(mass: Float) {
    val _arg = Variant.new(mass)
    __method_bind.setMass.call(this._handle, listOf(_arg))
  }

  fun setWeight(weight: Float) {
    val _arg = Variant.new(weight)
    __method_bind.setWeight.call(this._handle, listOf(_arg))
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
    fun new(): PhysicalBone = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicalBone".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PhysicalBone" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PhysicalBone(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PhysicalBone = PhysicalBone(ptr)
    /**
     * Container for method_bind pointers for PhysicalBone
     */
    private object __method_bind {
      val applyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_central_impulse" }
        }
      val applyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_impulse" }
        }
      val getBodyOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_body_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_offset" }
        }
      val getBoneId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_bone_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_id" }
        }
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounce" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction" }
        }
      val getGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity_scale" }
        }
      val getJointOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_joint_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joint_offset" }
        }
      val getJointType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_joint_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joint_type" }
        }
      val getMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mass" }
        }
      val getSimulatePhysics: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_simulate_physics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_simulate_physics" }
        }
      val getWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "get_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_weight" }
        }
      val isSimulatingPhysics: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "is_simulating_physics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_simulating_physics" }
        }
      val isStaticBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "is_static_body".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_static_body" }
        }
      val setBodyOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_body_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_body_offset" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounce" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction" }
        }
      val setGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_gravity_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gravity_scale" }
        }
      val setJointOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_joint_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_joint_offset" }
        }
      val setJointType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_joint_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_joint_type" }
        }
      val setMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_mass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mass" }
        }
      val setWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "set_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_weight" }
        }}
  }
}
