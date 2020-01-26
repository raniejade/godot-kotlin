// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
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

open class KinematicBody2D internal constructor(
  _handle: COpaquePointer
) : PhysicsBody2D(_handle) {
  fun directStateChanged() {
    TODO()
  }

  fun getFloorVelocity(): Vector2 {
    TODO()
  }

  fun getSafeMargin(): Float {
    TODO()
  }

  fun getSlideCollision(): KinematicCollision2D {
    TODO()
  }

  fun getSlideCount(): Int {
    TODO()
  }

  fun isOnCeiling(): Boolean {
    TODO()
  }

  fun isOnFloor(): Boolean {
    TODO()
  }

  fun isOnWall(): Boolean {
    TODO()
  }

  fun isSyncToPhysicsEnabled(): Boolean {
    TODO()
  }

  fun moveAndCollide(): KinematicCollision2D {
    TODO()
  }

  fun moveAndSlide(): Vector2 {
    TODO()
  }

  fun moveAndSlideWithSnap(): Vector2 {
    TODO()
  }

  fun setSafeMargin() {
    TODO()
  }

  fun setSyncToPhysics() {
    TODO()
  }

  fun testMove(): Boolean {
    TODO()
  }

  companion object {
    fun new(): KinematicBody2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicBody2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton KinematicBody2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicBody2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for KinematicBody2D
     */
    private object __method_bind {
      val _direct_state_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "_direct_state_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _direct_state_changed" }
            }
          }

      val get_floor_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_floor_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_floor_velocity" }
            }
          }

      val get_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_safe_margin" }
            }
          }

      val get_slide_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_slide_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_collision" }
            }
          }

      val get_slide_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "get_slide_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slide_count" }
            }
          }

      val is_on_ceiling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_ceiling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_ceiling" }
            }
          }

      val is_on_floor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_floor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_floor" }
            }
          }

      val is_on_wall: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_on_wall".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_wall" }
            }
          }

      val is_sync_to_physics_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "is_sync_to_physics_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sync_to_physics_enabled" }
            }
          }

      val move_and_collide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_collide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_collide" }
            }
          }

      val move_and_slide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_slide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide" }
            }
          }

      val move_and_slide_with_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "move_and_slide_with_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_and_slide_with_snap" }
            }
          }

      val set_safe_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "set_safe_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_safe_margin" }
            }
          }

      val set_sync_to_physics: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "set_sync_to_physics".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sync_to_physics" }
            }
          }

      val test_move: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicBody2D".cstr.ptr,
              "test_move".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method test_move" }
            }
          }
    }
  }
}
