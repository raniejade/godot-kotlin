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

open class EditorInspectorPlugin internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): EditorInspectorPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorInspectorPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorInspectorPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorInspectorPlugin(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorInspectorPlugin
     */
    private object __method_bind {
      val add_custom_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "add_custom_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_custom_control" }
            }
          }

      val add_property_editor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "add_property_editor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_property_editor" }
            }
          }

      val add_property_editor_for_multiple_properties: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "add_property_editor_for_multiple_properties".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method add_property_editor_for_multiple_properties" }
            }
          }

      val can_handle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "can_handle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_handle" }
            }
          }

      val parse_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "parse_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse_begin" }
            }
          }

      val parse_category: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "parse_category".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse_category" }
            }
          }

      val parse_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "parse_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse_end" }
            }
          }

      val parse_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspectorPlugin".cstr.ptr,
              "parse_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse_property" }
            }
          }
    }
  }
}
