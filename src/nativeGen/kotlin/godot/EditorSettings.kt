// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorSettings(
  _handle: COpaquePointer
) : Resource(_handle) {
  /**
   * EditorSettings::settings_changed signal
   */
  val signalSettingsChanged: Signal0 = Signal0("settings_changed")

  fun addPropertyInfo(info: Dictionary) {
    val _arg = Variant.new(info)
    __method_bind.addPropertyInfo.call(this._handle, listOf(_arg))
  }

  fun erase(property: String) {
    val _arg = Variant.new(property)
    __method_bind.erase.call(this._handle, listOf(_arg))
  }

  fun getFavorites(): PoolStringArray {
    val _ret = __method_bind.getFavorites.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getProjectMetadata(
    section: String,
    key: String,
    default: Variant
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(section))
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(default))
    val _ret = __method_bind.getProjectMetadata.call(this._handle, _args)
    return _ret
  }

  fun getProjectSettingsDir(): String {
    val _ret = __method_bind.getProjectSettingsDir.call(this._handle)
    return _ret.asString()
  }

  fun getRecentDirs(): PoolStringArray {
    val _ret = __method_bind.getRecentDirs.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getSetting(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getSetting.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getSettingsDir(): String {
    val _ret = __method_bind.getSettingsDir.call(this._handle)
    return _ret.asString()
  }

  fun hasSetting(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasSetting.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun propertyCanRevert(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.propertyCanRevert.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun propertyGetRevert(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.propertyGetRevert.call(this._handle, listOf(_arg))
    return _ret
  }

  fun setFavorites(dirs: PoolStringArray) {
    val _arg = Variant.new(dirs)
    __method_bind.setFavorites.call(this._handle, listOf(_arg))
  }

  fun setInitialValue(
    name: String,
    value: Variant,
    updateCurrent: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(value))
    _args.add(Variant.fromAny(updateCurrent))
    __method_bind.setInitialValue.call(this._handle, _args)
  }

  fun setProjectMetadata(
    section: String,
    key: String,
    data: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(section))
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(data))
    __method_bind.setProjectMetadata.call(this._handle, _args)
  }

  fun setRecentDirs(dirs: PoolStringArray) {
    val _arg = Variant.new(dirs)
    __method_bind.setRecentDirs.call(this._handle, listOf(_arg))
  }

  fun setSetting(name: String, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(value))
    __method_bind.setSetting.call(this._handle, _args)
  }

  companion object {
    val NOTIFICATION_EDITOR_SETTINGS_CHANGED: Int = 10000

    /**
     * Container for method_bind pointers for EditorSettings
     */
    private object __method_bind {
      val addPropertyInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "add_property_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_property_info" }
        }
      val erase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "erase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase" }
        }
      val getFavorites: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "get_favorites".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_favorites" }
        }
      val getProjectMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "get_project_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_project_metadata" }
        }
      val getProjectSettingsDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "get_project_settings_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_project_settings_dir" }
        }
      val getRecentDirs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "get_recent_dirs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_recent_dirs" }
        }
      val getSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "get_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_setting" }
        }
      val getSettingsDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "get_settings_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_settings_dir" }
        }
      val hasSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "has_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_setting" }
        }
      val propertyCanRevert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "property_can_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
        }
      val propertyGetRevert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "property_get_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
        }
      val setFavorites: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "set_favorites".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_favorites" }
        }
      val setInitialValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "set_initial_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_initial_value" }
        }
      val setProjectMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "set_project_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_project_metadata" }
        }
      val setRecentDirs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "set_recent_dirs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_recent_dirs" }
        }
      val setSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "set_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_setting" }
        }}
  }
}
