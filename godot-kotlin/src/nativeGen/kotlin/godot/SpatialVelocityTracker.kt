// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class SpatialVelocityTracker(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var trackPhysicsStep: Boolean
    get() {
       return isTrackingPhysicsStep() 
    }
    set(value) {
      setTrackPhysicsStep(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getTrackedLinearVelocity(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getTrackedLinearVelocity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isTrackingPhysicsStep(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isTrackingPhysicsStep.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun reset(position: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.reset.call(self._handle, listOf(position), null)
    }
  }

  fun setTrackPhysicsStep(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTrackPhysicsStep.call(self._handle, listOf(enable), null)
    }
  }

  fun updatePosition(position: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updatePosition.call(self._handle, listOf(position), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpatialVelocityTracker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpatialVelocityTracker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpatialVelocityTracker
     */
    private object __method_bind {
      val getTrackedLinearVelocity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "get_tracked_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tracked_linear_velocity" }
            }
          }

      val isTrackingPhysicsStep: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "is_tracking_physics_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_tracking_physics_step" }
            }
          }

      val reset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "reset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reset" }
            }
          }

      val setTrackPhysicsStep: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "set_track_physics_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_track_physics_step" }
            }
          }

      val updatePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
              "update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_position" }
            }
          }
    }
  }
}
