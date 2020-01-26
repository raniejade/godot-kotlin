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

open class EditorSelection internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    fun new(): EditorSelection = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSelection".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorSelection" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSelection(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorSelection
     */
    private object __method_bind {
      val _emit_change: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
              "_emit_change".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _emit_change" }
            }
          }

      val _node_removed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
              "_node_removed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _node_removed" }
            }
          }

      val add_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
              "add_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_node" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_selected_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
              "get_selected_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selected_nodes" }
            }
          }

      val get_transformable_selected_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
              "get_transformable_selected_nodes".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_transformable_selected_nodes" }
            }
          }

      val remove_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSelection".cstr.ptr,
              "remove_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_node" }
            }
          }
    }
  }
}
