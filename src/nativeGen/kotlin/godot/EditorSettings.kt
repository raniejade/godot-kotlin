// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
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

open class EditorSettings internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addPropertyInfo() {
    TODO()
  }

  fun erase() {
    TODO()
  }

  fun getFavorites(): PoolStringArray {
    TODO()
  }

  fun getProjectMetadata(): Variant {
    TODO()
  }

  fun getProjectSettingsDir(): String {
    TODO()
  }

  fun getRecentDirs(): PoolStringArray {
    TODO()
  }

  fun getSetting(): Variant {
    TODO()
  }

  fun getSettingsDir(): String {
    TODO()
  }

  fun hasSetting(): Boolean {
    TODO()
  }

  fun propertyCanRevert(): Boolean {
    TODO()
  }

  fun propertyGetRevert(): Variant {
    TODO()
  }

  fun setFavorites() {
    TODO()
  }

  fun setInitialValue() {
    TODO()
  }

  fun setProjectMetadata() {
    TODO()
  }

  fun setRecentDirs() {
    TODO()
  }

  fun setSetting() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSettings
     */
    private object __method_bind {
      val add_property_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "add_property_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_property_info" }
            }
          }

      val erase: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "erase".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase" }
            }
          }

      val get_favorites: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_favorites".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_favorites" }
            }
          }

      val get_project_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_project_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_project_metadata" }
            }
          }

      val get_project_settings_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_project_settings_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_project_settings_dir" }
            }
          }

      val get_recent_dirs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_recent_dirs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_recent_dirs" }
            }
          }

      val get_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_setting" }
            }
          }

      val get_settings_dir: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_settings_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_settings_dir" }
            }
          }

      val has_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "has_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_setting" }
            }
          }

      val property_can_revert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "property_can_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
            }
          }

      val property_get_revert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "property_get_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
            }
          }

      val set_favorites: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_favorites".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_favorites" }
            }
          }

      val set_initial_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_initial_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_initial_value" }
            }
          }

      val set_project_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_project_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_project_metadata" }
            }
          }

      val set_recent_dirs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_recent_dirs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_recent_dirs" }
            }
          }

      val set_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_setting" }
            }
          }
    }
  }
}
