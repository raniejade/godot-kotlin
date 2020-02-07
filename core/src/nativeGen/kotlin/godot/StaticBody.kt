// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StaticBody(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PhysicsBody(null) {
  var bounce: Float
    get() {
       return getBounce() 
    }
    set(value) {
      setBounce(value)
    }

  var constantAngularVelocity: Vector3
    get() {
       return getConstantAngularVelocity() 
    }
    set(value) {
      setConstantAngularVelocity(value)
    }

  var constantLinearVelocity: Vector3
    get() {
       return getConstantLinearVelocity() 
    }
    set(value) {
      setConstantLinearVelocity(value)
    }

  var friction: Float
    get() {
       return getFriction() 
    }
    set(value) {
      setFriction(value)
    }

  var physicsMaterialOverride: PhysicsMaterial
    get() {
       return getPhysicsMaterialOverride() 
    }
    set(value) {
      setPhysicsMaterialOverride(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for constantAngularVelocity
   */
  fun constantAngularVelocity(cb: Vector3.() -> Unit) {
    val _p = constantAngularVelocity
    cb(_p)
    constantAngularVelocity = _p
  }

  /**
   * Specialized setter for constantLinearVelocity
   */
  fun constantLinearVelocity(cb: Vector3.() -> Unit) {
    val _p = constantLinearVelocity
    cb(_p)
    constantLinearVelocity = _p
  }

  fun getBounce(): Float {
    val _ret = __method_bind.getBounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getConstantAngularVelocity(): Vector3 {
    val _ret = __method_bind.getConstantAngularVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getConstantLinearVelocity(): Vector3 {
    val _ret = __method_bind.getConstantLinearVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.getFriction.call(this._handle)
    return _ret.asFloat()
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val _ret = __method_bind.getPhysicsMaterialOverride.call(this._handle)
    return _ret.asObject(::PhysicsMaterial)!!
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant.new(bounce)
    __method_bind.setBounce.call(this._handle, listOf(_arg))
  }

  fun setConstantAngularVelocity(vel: Vector3) {
    val _arg = Variant.new(vel)
    __method_bind.setConstantAngularVelocity.call(this._handle, listOf(_arg))
  }

  fun setConstantLinearVelocity(vel: Vector3) {
    val _arg = Variant.new(vel)
    __method_bind.setConstantLinearVelocity.call(this._handle, listOf(_arg))
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.setFriction.call(this._handle, listOf(_arg))
  }

  fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val _arg = Variant.new(physicsMaterialOverride)
    __method_bind.setPhysicsMaterialOverride.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StaticBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StaticBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StaticBody
     */
    private object __method_bind {
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "get_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounce" }
        }
      val getConstantAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "get_constant_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_angular_velocity" }
        }
      val getConstantLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "get_constant_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_linear_velocity" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "get_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction" }
        }
      val getPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "get_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_material_override" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "set_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounce" }
        }
      val setConstantAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "set_constant_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant_angular_velocity" }
        }
      val setConstantLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "set_constant_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant_linear_velocity" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "set_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction" }
        }
      val setPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
            "set_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_material_override" }
        }}
  }
}
