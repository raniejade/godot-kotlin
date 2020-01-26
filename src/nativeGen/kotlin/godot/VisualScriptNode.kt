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

open class VisualScriptNode internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for VisualScriptNode
     */
    private object __method_bind {
      val _get_default_input_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
              "_get_default_input_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_default_input_values" }
            }
          }

      val _set_default_input_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
              "_set_default_input_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_default_input_values" }
            }
          }

      val get_default_input_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
              "get_default_input_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_input_value" }
            }
          }

      val get_visual_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
              "get_visual_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visual_script" }
            }
          }

      val ports_changed_notify: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
              "ports_changed_notify".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method ports_changed_notify" }
            }
          }

      val set_default_input_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
              "set_default_input_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_input_value" }
            }
          }
    }
  }
}
