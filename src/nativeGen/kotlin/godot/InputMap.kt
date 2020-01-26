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

open class InputMap internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: InputMap = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("InputMap".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton InputMap" }
          InputMap(
            handle
          )
        }

    /**
     * Container for method_bind pointers for InputMap
     */
    private object __method_bind {
      val action_add_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_add_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_add_event" }
            }
          }

      val action_erase_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_erase_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_erase_event" }
            }
          }

      val action_erase_events: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_erase_events".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_erase_events" }
            }
          }

      val action_has_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_has_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_has_event" }
            }
          }

      val action_set_deadzone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_set_deadzone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_set_deadzone" }
            }
          }

      val add_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "add_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_action" }
            }
          }

      val erase_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "erase_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_action" }
            }
          }

      val event_is_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "event_is_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method event_is_action" }
            }
          }

      val get_action_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "get_action_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_list" }
            }
          }

      val get_actions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "get_actions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_actions" }
            }
          }

      val has_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "has_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_action" }
            }
          }

      val load_from_globals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "load_from_globals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_from_globals" }
            }
          }
    }
  }
}
