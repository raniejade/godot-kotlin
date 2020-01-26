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

open class EditorInspector internal constructor(
  _handle: COpaquePointer
) : ScrollContainer(_handle) {
  fun editRequestChange() {
    TODO()
  }

  fun featureProfileChanged() {
    TODO()
  }

  fun filterChanged() {
    TODO()
  }

  fun multiplePropertiesChanged() {
    TODO()
  }

  fun nodeRemoved() {
    TODO()
  }

  fun objectIdSelected() {
    TODO()
  }

  fun propertyChanged() {
    TODO()
  }

  fun propertyChangedUpdateAll() {
    TODO()
  }

  fun propertyChecked() {
    TODO()
  }

  fun propertyKeyed() {
    TODO()
  }

  fun propertyKeyedWithValue() {
    TODO()
  }

  fun propertySelected() {
    TODO()
  }

  fun resourceSelected() {
    TODO()
  }

  fun vscrollChanged() {
    TODO()
  }

  fun refresh() {
    TODO()
  }

  companion object {
    fun new(): EditorInspector = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorInspector".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorInspector" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorInspector(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorInspector
     */
    private object __method_bind {
      val _edit_request_change: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_edit_request_change".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_request_change" }
            }
          }

      val _feature_profile_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_feature_profile_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _feature_profile_changed" }
            }
          }

      val _filter_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_filter_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _filter_changed" }
            }
          }

      val _multiple_properties_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_multiple_properties_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _multiple_properties_changed" }
            }
          }

      val _node_removed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_node_removed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _node_removed" }
            }
          }

      val _object_id_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_object_id_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _object_id_selected" }
            }
          }

      val _property_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_property_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _property_changed" }
            }
          }

      val _property_changed_update_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_property_changed_update_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _property_changed_update_all" }
            }
          }

      val _property_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_property_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _property_checked" }
            }
          }

      val _property_keyed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_property_keyed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _property_keyed" }
            }
          }

      val _property_keyed_with_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_property_keyed_with_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _property_keyed_with_value" }
            }
          }

      val _property_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_property_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _property_selected" }
            }
          }

      val _resource_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_resource_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _resource_selected" }
            }
          }

      val _vscroll_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "_vscroll_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _vscroll_changed" }
            }
          }

      val refresh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "refresh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method refresh" }
            }
          }
    }
  }
}
