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

open class EditorSettings(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addPropertyInfo(info: Dictionary) {
    val _arg = Variant.new(info)
    __method_bind.addPropertyInfo.call(this._handle, _arg, 1)
  }

  fun erase(property: String) {
    val _arg = Variant.new(property)
    __method_bind.erase.call(this._handle, _arg, 1)
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
    val _args = VariantArray.new()
    _args.append(section)
    _args.append(key)
    _args.append(default)
    val _ret = __method_bind.getProjectMetadata.call(this._handle, _args.toVariant(), 3)
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
    val _ret = __method_bind.getSetting.call(this._handle, _arg, 1)
    return _ret
  }

  fun getSettingsDir(): String {
    val _ret = __method_bind.getSettingsDir.call(this._handle)
    return _ret.asString()
  }

  fun hasSetting(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasSetting.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun propertyCanRevert(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.propertyCanRevert.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun propertyGetRevert(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.propertyGetRevert.call(this._handle, _arg, 1)
    return _ret
  }

  fun setFavorites(dirs: PoolStringArray) {
    val _arg = Variant.new(dirs)
    __method_bind.setFavorites.call(this._handle, _arg, 1)
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
    __method_bind.setInitialValue.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.setProjectMetadata.call(this._handle, _args.toVariant(), 3)
  }

  fun setRecentDirs(dirs: PoolStringArray) {
    val _arg = Variant.new(dirs)
    __method_bind.setRecentDirs.call(this._handle, _arg, 1)
  }

  fun setSetting(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.setSetting.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSettings
     */
    private object __method_bind {
      val addPropertyInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "addPropertyInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPropertyInfo" }
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
            "getFavorites".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFavorites" }
        }
      val getProjectMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "getProjectMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProjectMetadata" }
        }
      val getProjectSettingsDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "getProjectSettingsDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProjectSettingsDir" }
        }
      val getRecentDirs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "getRecentDirs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRecentDirs" }
        }
      val getSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "getSetting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSetting" }
        }
      val getSettingsDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "getSettingsDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSettingsDir" }
        }
      val hasSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "hasSetting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasSetting" }
        }
      val propertyCanRevert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "propertyCanRevert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propertyCanRevert" }
        }
      val propertyGetRevert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "propertyGetRevert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propertyGetRevert" }
        }
      val setFavorites: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "setFavorites".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFavorites" }
        }
      val setInitialValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "setInitialValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInitialValue" }
        }
      val setProjectMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "setProjectMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProjectMetadata" }
        }
      val setRecentDirs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "setRecentDirs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRecentDirs" }
        }
      val setSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
            "setSetting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSetting" }
        }}
  }
}
