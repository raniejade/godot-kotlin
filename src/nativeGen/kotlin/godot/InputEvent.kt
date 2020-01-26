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

open class InputEvent internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for InputEvent
     */
    private object __method_bind {
      val accumulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "accumulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method accumulate" }
            }
          }

      val as_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "as_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method as_text" }
            }
          }

      val get_action_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "get_action_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_strength" }
            }
          }

      val get_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "get_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_device" }
            }
          }

      val is_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "is_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action" }
            }
          }

      val is_action_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "is_action_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_pressed" }
            }
          }

      val is_action_released: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "is_action_released".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_released" }
            }
          }

      val is_action_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "is_action_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_type" }
            }
          }

      val is_echo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "is_echo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_echo" }
            }
          }

      val is_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "is_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pressed" }
            }
          }

      val set_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "set_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_device" }
            }
          }

      val shortcut_match: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "shortcut_match".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shortcut_match" }
            }
          }

      val xformed_by: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
              "xformed_by".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method xformed_by" }
            }
          }
    }
  }
}
