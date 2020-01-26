// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RayCast2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun addException(node: Object) {
    TODO()
  }

  fun addExceptionRid(rid: RID) {
    TODO()
  }

  fun clearExceptions() {
    TODO()
  }

  fun forceRaycastUpdate() {
    TODO()
  }

  fun getCastTo(): Vector2 {
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

  fun getCollisionMaskBit(bit: Int): Boolean {
    TODO()
  }

  fun getCollisionNormal(): Vector2 {
    TODO()
  }

  fun getCollisionPoint(): Vector2 {
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

  fun removeException(node: Object) {
    TODO()
  }

  fun removeExceptionRid(rid: RID) {
    TODO()
  }

  fun setCastTo(local_point: Vector2) {
    TODO()
  }

  fun setCollideWithAreas(enable: Boolean) {
    TODO()
  }

  fun setCollideWithBodies(enable: Boolean) {
    TODO()
  }

  fun setCollisionMask(mask: Int) {
    TODO()
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    TODO()
  }

  fun setEnabled(enabled: Boolean) {
    TODO()
  }

  fun setExcludeParentBody(mask: Boolean) {
    TODO()
  }

  companion object {
    fun new(): RayCast2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RayCast2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RayCast2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RayCast2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RayCast2D = RayCast2D(ptr)
    /**
     * Container for method_bind pointers for RayCast2D
     */
    private object __method_bind {
      val add_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "add_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception" }
            }
          }

      val add_exception_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "add_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
            }
          }

      val clear_exceptions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "clear_exceptions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
            }
          }

      val force_raycast_update: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "force_raycast_update".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_raycast_update" }
            }
          }

      val get_cast_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_cast_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cast_to" }
            }
          }

      val get_collider: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collider".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider" }
            }
          }

      val get_collider_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collider_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_collision_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_normal" }
            }
          }

      val get_collision_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_collision_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_point" }
            }
          }

      val get_exclude_parent_body: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "get_exclude_parent_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_exclude_parent_body" }
            }
          }

      val is_collide_with_areas_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_collide_with_areas_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_areas_enabled"
              }
            }
          }

      val is_collide_with_bodies_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_collide_with_bodies_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collide_with_bodies_enabled"
              }
            }
          }

      val is_colliding: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_colliding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_colliding" }
            }
          }

      val is_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val remove_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "remove_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception" }
            }
          }

      val remove_exception_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "remove_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
            }
          }

      val set_cast_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_cast_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cast_to" }
            }
          }

      val set_collide_with_areas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collide_with_areas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_areas" }
            }
          }

      val set_collide_with_bodies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collide_with_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collide_with_bodies" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val set_exclude_parent_body: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RayCast2D".cstr.ptr,
              "set_exclude_parent_body".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exclude_parent_body" }
            }
          }
    }
  }
}
