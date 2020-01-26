// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector3
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpatialVelocityTracker internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getTrackedLinearVelocity(): Vector3 {
    TODO()
  }

  fun isTrackingPhysicsStep(): Boolean {
    TODO()
  }

  fun reset(position: Vector3) {
    TODO()
  }

  fun setTrackPhysicsStep(enable: Boolean) {
    TODO()
  }

  fun updatePosition(position: Vector3) {
    TODO()
  }

  companion object {
    fun new(): SpatialVelocityTracker = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpatialVelocityTracker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SpatialVelocityTracker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpatialVelocityTracker(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for SpatialVelocityTracker
     */
    private object __method_bind {
      val get_tracked_linear_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "get_tracked_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracked_linear_velocity" }
            }
          }

      val is_tracking_physics_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "is_tracking_physics_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_tracking_physics_step" }
            }
          }

      val reset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "reset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reset" }
            }
          }

      val set_track_physics_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "set_track_physics_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_track_physics_step" }
            }
          }

      val update_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_position" }
            }
          }
    }
  }
}
