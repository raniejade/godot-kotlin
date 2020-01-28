// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpatialVelocityTracker(
  _handle: COpaquePointer
) : Reference(_handle) {
  var trackPhysicsStep: Boolean
    get() {
       return isTrackingPhysicsStep() 
    }
    set(value) {
      setTrackPhysicsStep(value)
    }

  fun getTrackedLinearVelocity(): Vector3 {
    val _ret = __method_bind.getTrackedLinearVelocity.call(this._handle)
    return _ret.asVector3()
  }

  fun isTrackingPhysicsStep(): Boolean {
    val _ret = __method_bind.isTrackingPhysicsStep.call(this._handle)
    return _ret.asBoolean()
  }

  fun reset(position: Vector3) {
    val _arg = Variant.new(position)
    __method_bind.reset.call(this._handle, _arg, 1)
  }

  fun setTrackPhysicsStep(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setTrackPhysicsStep.call(this._handle, _arg, 1)
  }

  fun updatePosition(position: Vector3) {
    val _arg = Variant.new(position)
    __method_bind.updatePosition.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): SpatialVelocityTracker = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpatialVelocityTracker".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpatialVelocityTracker" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpatialVelocityTracker(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SpatialVelocityTracker = SpatialVelocityTracker(ptr)
    /**
     * Container for method_bind pointers for SpatialVelocityTracker
     */
    private object __method_bind {
      val getTrackedLinearVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
            "get_tracked_linear_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tracked_linear_velocity" }
        }
      val isTrackingPhysicsStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
            "is_tracking_physics_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_tracking_physics_step" }
        }
      val reset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
            "reset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset" }
        }
      val setTrackPhysicsStep: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
            "set_track_physics_step".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_track_physics_step" }
        }
      val updatePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpatialVelocityTracker".cstr.ptr,
            "update_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_position" }
        }}
  }
}
