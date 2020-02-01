// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VehicleBody(
  _handle: COpaquePointer
) : RigidBody(_handle) {
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

  fun getBrake(): Float {
    val _ret = __method_bind.getBrake.call(this._handle)
    return _ret.asFloat()
  }

  fun getEngineForce(): Float {
    val _ret = __method_bind.getEngineForce.call(this._handle)
    return _ret.asFloat()
  }

  fun getSteering(): Float {
    val _ret = __method_bind.getSteering.call(this._handle)
    return _ret.asFloat()
  }

  fun setBrake(brake: Float) {
    val _arg = Variant.new(brake)
    __method_bind.setBrake.call(this._handle, listOf(_arg))
  }

  fun setEngineForce(engineForce: Float) {
    val _arg = Variant.new(engineForce)
    __method_bind.setEngineForce.call(this._handle, listOf(_arg))
  }

  fun setSteering(steering: Float) {
    val _arg = Variant.new(steering)
    __method_bind.setSteering.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): VehicleBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VehicleBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VehicleBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VehicleBody(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VehicleBody = VehicleBody(ptr)
    /**
     * Container for method_bind pointers for VehicleBody
     */
    private object __method_bind {
      val getBrake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "get_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_brake" }
        }
      val getEngineForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "get_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_engine_force" }
        }
      val getSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "get_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_steering" }
        }
      val setBrake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "set_brake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_brake" }
        }
      val setEngineForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "set_engine_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_engine_force" }
        }
      val setSteering: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
            "set_steering".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_steering" }
        }}
  }
}
