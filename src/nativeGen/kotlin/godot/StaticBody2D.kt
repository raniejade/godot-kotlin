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

open class StaticBody2D internal constructor(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  fun getBounce(): Float {
    val _ret = __method_bind.get_bounce.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getConstantAngularVelocity(): Float {
    val _ret = __method_bind.get_constant_angular_velocity.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getConstantLinearVelocity(): Vector2 {
    val _ret = __method_bind.get_constant_linear_velocity.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.get_friction.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val _ret = __method_bind.get_physics_material_override.call(this.toVariant())
    return _ret.asObject(::PhysicsMaterial)!!
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant.new(bounce)
    __method_bind.set_bounce.call(this.toVariant(), _arg, 1)
  }

  fun setConstantAngularVelocity(vel: Float) {
    val _arg = Variant.new(vel)
    __method_bind.set_constant_angular_velocity.call(this.toVariant(), _arg, 1)
  }

  fun setConstantLinearVelocity(vel: Vector2) {
    val _arg = Variant.new(vel)
    __method_bind.set_constant_linear_velocity.call(this.toVariant(), _arg, 1)
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.set_friction.call(this.toVariant(), _arg, 1)
  }

  fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val _arg = Variant.new(physicsMaterialOverride)
    __method_bind.set_physics_material_override.call(this.toVariant(), _arg, 1)
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
      val get_bounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "get_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounce" }
        }
      val get_constant_angular_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "get_constant_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_angular_velocity" }
        }
      val get_constant_linear_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "get_constant_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_linear_velocity" }
        }
      val get_friction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "get_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_friction" }
        }
      val get_physics_material_override: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "get_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_material_override" }
        }
      val set_bounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "set_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounce" }
        }
      val set_constant_angular_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "set_constant_angular_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant_angular_velocity" }
        }
      val set_constant_linear_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "set_constant_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant_linear_velocity" }
        }
      val set_friction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "set_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_friction" }
        }
      val set_physics_material_override: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
            "set_physics_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_material_override" }
        }}
  }
}
