// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ProjectSettings internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addPropertyInfo(hint: Dictionary) {
    TODO()
  }

  fun clear(name: String) {
    TODO()
  }

  fun getOrder(name: String): Int {
    TODO()
  }

  fun getSetting(name: String): Variant {
    TODO()
  }

  fun globalizePath(path: String): String {
    TODO()
  }

  fun hasSetting(name: String): Boolean {
    TODO()
  }

  fun loadResourcePack(pack: String): Boolean {
    TODO()
  }

  fun localizePath(path: String): String {
    TODO()
  }

  fun propertyCanRevert(name: String): Boolean {
    TODO()
  }

  fun propertyGetRevert(name: String): Variant {
    TODO()
  }

  fun save(): Error {
    TODO()
  }

  fun saveCustom(file: String): Error {
    TODO()
  }

  fun setInitialValue(name: String, value: Variant) {
    TODO()
  }

  fun setOrder(name: String, position: Int) {
    TODO()
  }

  fun setSetting(name: String, value: Variant) {
    TODO()
  }

  companion object {
    val Instance: ProjectSettings = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("ProjectSettings".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton ProjectSettings" }
          ProjectSettings(
            handle
          )
        }

    /**
     * Container for method_bind pointers for ProjectSettings
     */
    private object __method_bind {
      val add_property_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "add_property_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_property_info" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "get_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_order" }
            }
          }

      val get_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "get_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_setting" }
            }
          }

      val globalize_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "globalize_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method globalize_path" }
            }
          }

      val has_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "has_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_setting" }
            }
          }

      val load_resource_pack: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "load_resource_pack".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_resource_pack" }
            }
          }

      val localize_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "localize_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method localize_path" }
            }
          }

      val property_can_revert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "property_can_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
            }
          }

      val property_get_revert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "property_get_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
            }
          }

      val save: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "save".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save" }
            }
          }

      val save_custom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "save_custom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_custom" }
            }
          }

      val set_initial_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "set_initial_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_initial_value" }
            }
          }

      val set_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "set_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_order" }
            }
          }

      val set_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "set_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_setting" }
            }
          }
    }
  }
}
