// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RayCast internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun addException() {
    TODO()
  }

  fun addExceptionRid() {
    TODO()
  }

  fun clearExceptions() {
    TODO()
  }

  fun forceRaycastUpdate() {
    TODO()
  }

  fun getCastTo(): Vector3 {
    TODO()
  }

  fun getCollider(): Object {
    TODO()
  }

  fun getColliderShape(): Int {
    TODO()
  }

  fun getCollisionMask(): Int {
    TODO()
  }

  fun getCollisionMaskBit(): Boolean {
    TODO()
  }

  fun getCollisionNormal(): Vector3 {
    TODO()
  }

  fun getCollisionPoint(): Vector3 {
    TODO()
  }

  fun getExcludeParentBody(): Boolean {
    TODO()
  }

  fun isCollideWithAreasEnabled(): Boolean {
    TODO()
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    TODO()
  }

  fun isColliding(): Boolean {
    TODO()
  }

  fun isEnabled(): Boolean {
    TODO()
  }

  fun removeException() {
    TODO()
  }

  fun removeExceptionRid() {
    TODO()
  }

  fun setCastTo() {
    TODO()
  }

  fun setCollideWithAreas() {
    TODO()
  }

  fun setCollideWithBodies() {
    TODO()
  }

  fun setCollisionMask() {
    TODO()
  }

  fun setCollisionMaskBit() {
    TODO()
  }

  fun setEnabled() {
    TODO()
  }

  fun setExcludeParentBody() {
    TODO()
  }

  companion object {
    fun new(): RayCast = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayCast".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RayCast" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RayCast(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for RayCast
     */
    private object __method_bind {
      val add_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "add_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception" }
            }
          }

      val add_exception_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "add_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
            }
          }

      val clear_exceptions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "clear_exceptions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
            }
          }

      val force_raycast_update: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "force_raycast_update".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_raycast_update" }
            }
          }

      val get_cast_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_cast_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cast_to" }
            }
          }

      val get_collider: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_collider".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider" }
            }
          }

      val get_collider_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_collider_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_collision_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_collision_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_normal" }
            }
          }

      val get_collision_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_collision_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_point" }
            }
          }

      val get_exclude_parent_body: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "get_exclude_parent_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_exclude_parent_body" }
            }
          }

      val is_collide_with_areas_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "is_collide_with_areas_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_areas_enabled"
              }
            }
          }

      val is_collide_with_bodies_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "is_collide_with_bodies_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_bodies_enabled"
              }
            }
          }

      val is_colliding: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "is_colliding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_colliding" }
            }
          }

      val is_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val remove_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "remove_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception" }
            }
          }

      val remove_exception_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "remove_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
            }
          }

      val set_cast_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "set_cast_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cast_to" }
            }
          }

      val set_collide_with_areas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "set_collide_with_areas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_areas" }
            }
          }

      val set_collide_with_bodies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "set_collide_with_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_bodies" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val set_exclude_parent_body: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast".cstr.ptr,
              "set_exclude_parent_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exclude_parent_body" }
            }
          }
    }
  }
}
