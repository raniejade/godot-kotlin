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

open class _VisualScriptEditor internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: _VisualScriptEditor = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("_VisualScriptEditor".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton _VisualScriptEditor" }
          _VisualScriptEditor(
            handle
          )
        }

    /**
     * Container for method_bind pointers for _VisualScriptEditor
     */
    private object __method_bind {
      val add_custom_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_VisualScriptEditor".cstr.ptr,
              "add_custom_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_custom_node" }
            }
          }

      val remove_custom_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_VisualScriptEditor".cstr.ptr,
              "remove_custom_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_custom_node" }
            }
          }
    }
  }
}
