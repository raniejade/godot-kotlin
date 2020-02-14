// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class VehicleBody(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : RigidBody(null) {
  var brake: Float
    get() {
       return getBrake() 
    }
    set(value) {
      setBrake(value)
    }

  var engineForce: Float
    get() {
       return getEngineForce() 
    }
    set(value) {
      setEngineForce(value)
    }

  var steering: Float
    get() {
       return getSteering() 
    }
    set(value) {
      setSteering(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBrake(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBrake.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEngineForce(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEngineForce.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSteering(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSteering.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setBrake(brake: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBrake.call(self._handle, listOf(brake), null)
    }
  }

  fun setEngineForce(engineForce: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEngineForce.call(self._handle, listOf(engineForce), null)
    }
  }

  fun setSteering(steering: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSteering.call(self._handle, listOf(steering), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VehicleBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VehicleBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VehicleBody
     */
    private object __method_bind {
      val getBrake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "get_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_brake" }
        }
      val getEngineForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "get_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_engine_force" }
        }
      val getSteering: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "get_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_steering" }
        }
      val setBrake: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "set_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_brake" }
        }
      val setEngineForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "set_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_engine_force" }
        }
      val setSteering: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "set_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_steering" }
        }}
  }
}
