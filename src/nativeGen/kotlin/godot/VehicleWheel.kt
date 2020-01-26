// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VehicleWheel internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): VehicleWheel = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VehicleWheel".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VehicleWheel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VehicleWheel(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VehicleWheel
     */
    private object __method_bind {
      val get_damping_compression: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_damping_compression".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_damping_compression" }
            }
          }

      val get_damping_relaxation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_damping_relaxation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_damping_relaxation" }
            }
          }

      val get_friction_slip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_friction_slip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction_slip" }
            }
          }

      val get_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radius" }
            }
          }

      val get_roll_influence: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_roll_influence".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_roll_influence" }
            }
          }

      val get_rpm: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_rpm".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rpm" }
            }
          }

      val get_skidinfo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_skidinfo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_skidinfo" }
            }
          }

      val get_suspension_max_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_suspension_max_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_suspension_max_force" }
            }
          }

      val get_suspension_rest_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_suspension_rest_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_suspension_rest_length" }
            }
          }

      val get_suspension_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_suspension_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_suspension_stiffness" }
            }
          }

      val get_suspension_travel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "get_suspension_travel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_suspension_travel" }
            }
          }

      val is_in_contact: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "is_in_contact".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_in_contact" }
            }
          }

      val is_used_as_steering: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "is_used_as_steering".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_used_as_steering" }
            }
          }

      val is_used_as_traction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "is_used_as_traction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_used_as_traction" }
            }
          }

      val set_damping_compression: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_damping_compression".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_damping_compression" }
            }
          }

      val set_damping_relaxation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_damping_relaxation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_damping_relaxation" }
            }
          }

      val set_friction_slip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_friction_slip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction_slip" }
            }
          }

      val set_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radius" }
            }
          }

      val set_roll_influence: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_roll_influence".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_roll_influence" }
            }
          }

      val set_suspension_max_force: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_suspension_max_force".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_suspension_max_force" }
            }
          }

      val set_suspension_rest_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_suspension_rest_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_suspension_rest_length" }
            }
          }

      val set_suspension_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_suspension_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_suspension_stiffness" }
            }
          }

      val set_suspension_travel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_suspension_travel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_suspension_travel" }
            }
          }

      val set_use_as_steering: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_use_as_steering".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_as_steering" }
            }
          }

      val set_use_as_traction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VehicleWheel".cstr.ptr,
              "set_use_as_traction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_as_traction" }
            }
          }
    }
  }
}
