// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    TODO()
  }

  fun getConstantAngularVelocity(): Float {
    TODO()
  }

  fun getConstantLinearVelocity(): Vector2 {
    TODO()
  }

  fun getFriction(): Float {
    TODO()
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    TODO()
  }

  fun setBounce(bounce: Float) {
    TODO()
  }

  fun setConstantAngularVelocity(vel: Float) {
    TODO()
  }

  fun setConstantLinearVelocity(vel: Vector2) {
    TODO()
  }

  fun setFriction(friction: Float) {
    TODO()
  }

  fun setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial) {
    TODO()
  }

  companion object {
    fun new(): StaticBody2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StaticBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StaticBody2D" }
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
      val get_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val get_constant_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "get_constant_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_angular_velocity"
              }
            }
          }

      val get_constant_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "get_constant_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_linear_velocity" }
            }
          }

      val get_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val get_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "get_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_material_override"
              }
            }
          }

      val set_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val set_constant_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "set_constant_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_angular_velocity"
              }
            }
          }

      val set_constant_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "set_constant_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_linear_velocity" }
            }
          }

      val set_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val set_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody2D".cstr.ptr,
              "set_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_material_override"
              }
            }
          }
    }
  }
}
