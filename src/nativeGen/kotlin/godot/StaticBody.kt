// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector3
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StaticBody internal constructor(
  _handle: COpaquePointer
) : PhysicsBody(_handle) {
  fun getBounce(): Float {
    TODO()
  }

  fun getConstantAngularVelocity(): Vector3 {
    TODO()
  }

  fun getConstantLinearVelocity(): Vector3 {
    TODO()
  }

  fun getFriction(): Float {
    TODO()
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    TODO()
  }

  fun setBounce() {
    TODO()
  }

  fun setConstantAngularVelocity() {
    TODO()
  }

  fun setConstantLinearVelocity() {
    TODO()
  }

  fun setFriction() {
    TODO()
  }

  fun setPhysicsMaterialOverride() {
    TODO()
  }

  companion object {
    fun new(): StaticBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StaticBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StaticBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StaticBody(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for StaticBody
     */
    private object __method_bind {
      val get_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val get_constant_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_constant_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_angular_velocity"
              }
            }
          }

      val get_constant_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_constant_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_linear_velocity" }
            }
          }

      val get_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val get_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_material_override"
              }
            }
          }

      val set_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val set_constant_angular_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_constant_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_angular_velocity"
              }
            }
          }

      val set_constant_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_constant_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_linear_velocity" }
            }
          }

      val set_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val set_physics_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_material_override"
              }
            }
          }
    }
  }
}
