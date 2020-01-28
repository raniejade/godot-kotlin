// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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

  var jointType: Int
    get() {
       return PhysicalBone.JointType.from(getJointType()) 
    }
    set(value) {
      setJointType(PhysicalBone.JointType.from(value))
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
    __method_bind.setBodyOffset.call(this._handle, _arg, 1)
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant.new(bounce)
    __method_bind.setBounce.call(this._handle, _arg, 1)
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.setFriction.call(this._handle, _arg, 1)
  }

  fun setGravityScale(gravityScale: Float) {
    val _arg = Variant.new(gravityScale)
    __method_bind.setGravityScale.call(this._handle, _arg, 1)
  }

  fun setJointOffset(offset: Transform) {
    val _arg = Variant.new(offset)
    __method_bind.setJointOffset.call(this._handle, _arg, 1)
  }

  fun setJointType(jointType: Int) {
    val _arg = Variant.new(jointType)
    __method_bind.setJointType.call(this._handle, _arg, 1)
  }

  fun setMass(mass: Float) {
    val _arg = Variant.new(mass)
    __method_bind.setMass.call(this._handle, _arg, 1)
  }

  fun setWeight(weight: Float) {
    val _arg = Variant.new(weight)
    __method_bind.setWeight.call(this._handle, _arg, 1)
  }

  enum class JointType(
    val value: Int
  ) {
    JOINT_TYPE_NONE(0),

    JOINT_TYPE_PIN(1),

    JOINT_TYPE_CONE(2),

    JOINT_TYPE_HINGE(3),

    JOINT_TYPE_SLIDER(4),

    JOINT_TYPE_6DOF(5);

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
    val JOINT_TYPE_6DOF: Int = 5

    val JOINT_TYPE_CONE: Int = 2

    val JOINT_TYPE_HINGE: Int = 3

    val JOINT_TYPE_NONE: Int = 0

    val JOINT_TYPE_PIN: Int = 1

    val JOINT_TYPE_SLIDER: Int = 4

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
      val getBodyOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getBodyOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBodyOffset" }
        }
      val getBoneId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getBoneId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneId" }
        }
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBounce" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFriction" }
        }
      val getGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getGravityScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGravityScale" }
        }
      val getJointOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getJointOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getJointOffset" }
        }
      val getJointType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getJointType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getJointType" }
        }
      val getMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMass" }
        }
      val getSimulatePhysics: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getSimulatePhysics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSimulatePhysics" }
        }
      val getWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "getWeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWeight" }
        }
      val isSimulatingPhysics: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "isSimulatingPhysics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSimulatingPhysics" }
        }
      val isStaticBody: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "isStaticBody".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isStaticBody" }
        }
      val setBodyOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setBodyOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBodyOffset" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBounce" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFriction" }
        }
      val setGravityScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setGravityScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGravityScale" }
        }
      val setJointOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setJointOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setJointOffset" }
        }
      val setJointType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setJointType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setJointType" }
        }
      val setMass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setMass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMass" }
        }
      val setWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicalBone".cstr.ptr,
            "setWeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWeight" }
        }}
  }
}
