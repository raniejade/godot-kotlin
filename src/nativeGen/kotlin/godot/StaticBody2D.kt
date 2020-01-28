// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StaticBody2D(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  var bounce: Float
    get() {
       return getBounce() 
    }
    set(value) {
      setBounce(value)
    }

  var constantAngularVelocity: Float
    get() {
       return getConstantAngularVelocity() 
    }
    set(value) {
      setConstantAngularVelocity(value)
    }

  var constantLinearVelocity: Vector2
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

  fun getBounce(): Float {
    val _ret = __method_bind.getBounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getConstantAngularVelocity(): Float {
    val _ret = __method_bind.getConstantAngularVelocity.call(this._handle)
    return _ret.asFloat()
  }

  fun getConstantLinearVelocity(): Vector2 {
    val _ret = __method_bind.getConstantLinearVelocity.call(this._handle)
    return _ret.asVector2()
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
    __method_bind.setBounce.call(this._handle, _arg, 1)
  }

  fun setConstantAngularVelocity(vel: Float) {
    val _arg = Variant.new(vel)
    __method_bind.setConstantAngularVelocity.call(this._handle, _arg, 1)
  }

  fun setConstantLinearVelocity(vel: Vector2) {
    val _arg = Variant.new(vel)
    __method_bind.setConstantLinearVelocity.call(this._handle, _arg, 1)
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.setFriction.call(this._handle, _arg, 1)
  }

  fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val _arg = Variant.new(physicsMaterialOverride)
    __method_bind.setPhysicsMaterialOverride.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): StaticBody2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StaticBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StaticBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StaticBody2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StaticBody2D = StaticBody2D(ptr)
    /**
     * Container for method_bind pointers for StaticBody2D
     */
    private object __method_bind {
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "getBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBounce" }
        }
      val getConstantAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "getConstantAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConstantAngularVelocity" }
        }
      val getConstantLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "getConstantLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConstantLinearVelocity" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "getFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFriction" }
        }
      val getPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "getPhysicsMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPhysicsMaterialOverride" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "setBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBounce" }
        }
      val setConstantAngularVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "setConstantAngularVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setConstantAngularVelocity" }
        }
      val setConstantLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "setConstantLinearVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setConstantLinearVelocity" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "setFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFriction" }
        }
      val setPhysicsMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "setPhysicsMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPhysicsMaterialOverride" }
        }}
  }
}
