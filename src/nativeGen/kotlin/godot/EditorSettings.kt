// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
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
  fun addPropertyInfo(info: Dictionary) {
    val _args = VariantArray.new()
    _args.append(info)
    __method_bind.add_property_info.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun erase(property: String) {
    val _args = VariantArray.new()
    _args.append(property)
    __method_bind.erase.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun getFavorites(): PoolStringArray {
    val _ret = __method_bind.get_favorites.call(this.toVariant())
    return _ret.asPoolStringArray()
  }

  fun getProjectMetadata(
    section: String,
    key: String,
    default: Variant
  ): Variant {
    val _args = VariantArray.new()
    _args.append(section)
    _args.append(key)
    _args.append(default)
    val _ret = __method_bind.get_project_metadata.call(this.toVariant(), _args.toVariant(), 3)
    return _ret
  }

  fun getProjectSettingsDir(): String {
    val _ret = __method_bind.get_project_settings_dir.call(this.toVariant())
    return _ret.asString()
  }

  fun getRecentDirs(): PoolStringArray {
    val _ret = __method_bind.get_recent_dirs.call(this.toVariant())
    return _ret.asPoolStringArray()
  }

  fun getSetting(name: String): Variant {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.get_setting.call(this.toVariant(), _args.toVariant(), 1)
    return _ret
  }

  fun getSettingsDir(): String {
    val _ret = __method_bind.get_settings_dir.call(this.toVariant())
    return _ret.asString()
  }

  fun hasSetting(name: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.has_setting.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun propertyCanRevert(name: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.property_can_revert.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun propertyGetRevert(name: String): Variant {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.property_get_revert.call(this.toVariant(), _args.toVariant(), 1)
    return _ret
  }

  fun setFavorites(dirs: PoolStringArray) {
    val _args = VariantArray.new()
    _args.append(dirs)
    __method_bind.set_favorites.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setInitialValue(
    name: String,
    value: Variant,
    updateCurrent: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    _args.append(updateCurrent)
    __method_bind.set_initial_value.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun setProjectMetadata(
    section: String,
    key: String,
    data: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(section)
    _args.append(key)
    _args.append(data)
    __method_bind.set_project_metadata.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun setRecentDirs(dirs: PoolStringArray) {
    val _args = VariantArray.new()
    _args.append(dirs)
    __method_bind.set_recent_dirs.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSetting(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.set_setting.call(this.toVariant(), _args.toVariant(), 2)
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
