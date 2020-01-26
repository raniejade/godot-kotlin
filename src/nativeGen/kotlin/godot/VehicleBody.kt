// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VehicleBody internal constructor(
  _handle: COpaquePointer
) : RigidBody(_handle) {
  fun getBrake(): Float {
    TODO()
  }

  fun getEngineForce(): Float {
    TODO()
  }

  fun getSteering(): Float {
    TODO()
  }

  fun setBrake(brake: Float) {
    TODO()
  }

  fun setEngineForce(engine_force: Float) {
    TODO()
  }

  fun setSteering(steering: Float) {
    TODO()
  }

  companion object {
    fun new(): VehicleBody = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VehicleBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VehicleBody" }
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
      val get_brake: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
              "get_brake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_brake" }
            }
          }

      val get_engine_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
              "get_engine_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_engine_force" }
            }
          }

      val get_steering: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
              "get_steering".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_steering" }
            }
          }

      val set_brake: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
              "set_brake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_brake" }
            }
          }

      val set_engine_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
              "set_engine_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_engine_force" }
            }
          }

      val set_steering: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleBody".cstr.ptr,
              "set_steering".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_steering" }
            }
          }
    }
  }
}
