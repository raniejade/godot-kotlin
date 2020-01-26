// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorSpatialGizmoPlugin internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addMaterial() {
    TODO()
  }

  fun canBeHidden(): Boolean {
    TODO()
  }

  fun commitHandle() {
    TODO()
  }

  fun createGizmo(): EditorSpatialGizmo {
    TODO()
  }

  fun createHandleMaterial() {
    TODO()
  }

  fun createIconMaterial() {
    TODO()
  }

  fun createMaterial() {
    TODO()
  }

  fun getHandleName(): String {
    TODO()
  }

  fun getHandleValue(): Variant {
    TODO()
  }

  fun getMaterial(): SpatialMaterial {
    TODO()
  }

  fun getName(): String {
    TODO()
  }

  fun getPriority(): String {
    TODO()
  }

  fun hasGizmo(): Boolean {
    TODO()
  }

  fun isHandleHighlighted(): Boolean {
    TODO()
  }

  fun isSelectableWhenHidden(): Boolean {
    TODO()
  }

  fun redraw() {
    TODO()
  }

  fun setHandle() {
    TODO()
  }

  companion object {
    fun new(): EditorSpatialGizmoPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSpatialGizmoPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorSpatialGizmoPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSpatialGizmoPlugin(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorSpatialGizmoPlugin
     */
    private object __method_bind {
      val add_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "add_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_material" }
            }
          }

      val can_be_hidden: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "can_be_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_be_hidden" }
            }
          }

      val commit_handle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "commit_handle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method commit_handle" }
            }
          }

      val create_gizmo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_gizmo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_gizmo" }
            }
          }

      val create_handle_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_handle_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_handle_material" }
            }
          }

      val create_icon_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_icon_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_icon_material" }
            }
          }

      val create_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_material" }
            }
          }

      val get_handle_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "get_handle_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_handle_name" }
            }
          }

      val get_handle_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "get_handle_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_handle_value" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_name" }
            }
          }

      val get_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "get_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_priority" }
            }
          }

      val has_gizmo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "has_gizmo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_gizmo" }
            }
          }

      val is_handle_highlighted: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "is_handle_highlighted".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_handle_highlighted" }
            }
          }

      val is_selectable_when_hidden: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "is_selectable_when_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selectable_when_hidden" }
            }
          }

      val redraw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "redraw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method redraw" }
            }
          }

      val set_handle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "set_handle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_handle" }
            }
          }
    }
  }
}
