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

open class ARVRController internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): ARVRController = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRController".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ARVRController" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVRController(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ARVRController
     */
    private object __method_bind {
      val get_controller_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_controller_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_id" }
            }
          }

      val get_controller_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_controller_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_name" }
            }
          }

      val get_hand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_hand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hand" }
            }
          }

      val get_is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_is_active" }
            }
          }

      val get_joystick_axis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_joystick_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joystick_axis" }
            }
          }

      val get_joystick_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_joystick_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joystick_id" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val get_rumble: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "get_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rumble" }
            }
          }

      val is_button_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "is_button_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_button_pressed" }
            }
          }

      val set_controller_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "set_controller_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_controller_id" }
            }
          }

      val set_rumble: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRController".cstr.ptr,
              "set_rumble".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rumble" }
            }
          }
    }
  }
}
