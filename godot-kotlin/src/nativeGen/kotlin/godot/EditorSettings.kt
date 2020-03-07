// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class EditorSettings(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  /**
   * EditorSettings::settings_changed signal
   */
  val signalSettingsChanged: Signal0 = Signal0("settings_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addPropertyInfo(info: Dictionary) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addPropertyInfo.call(self._handle, listOf(info), null)
    }
  }

  fun erase(property: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.erase.call(self._handle, listOf(property), null)
    }
  }

  fun getFavorites(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getFavorites.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getProjectMetadata(
    section: String,
    key: String,
    default: Variant
  ): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(section)
      _args.add(key)
      _args.add(default)
      __method_bind.getProjectMetadata.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getProjectSettingsDir(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getProjectSettingsDir.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getRecentDirs(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getRecentDirs.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSetting(name: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getSetting.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSettingsDir(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSettingsDir.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun hasSetting(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasSetting.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun propertyCanRevert(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.propertyCanRevert.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun propertyGetRevert(name: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.propertyGetRevert.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setFavorites(dirs: PoolStringArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFavorites.call(self._handle, listOf(dirs), null)
    }
  }

  fun setInitialValue(
    name: String,
    value: Variant,
    updateCurrent: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(value)
      _args.add(updateCurrent)
      __method_bind.setInitialValue.call(self._handle, _args, null)
    }
  }

  fun setProjectMetadata(
    section: String,
    key: String,
    data: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(section)
      _args.add(key)
      _args.add(data)
      __method_bind.setProjectMetadata.call(self._handle, _args, null)
    }
  }

  fun setRecentDirs(dirs: PoolStringArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRecentDirs.call(self._handle, listOf(dirs), null)
    }
  }

  fun setSetting(name: String, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(value)
      __method_bind.setSetting.call(self._handle, _args, null)
    }
  }

  companion object {
    val NOTIFICATION_EDITOR_SETTINGS_CHANGED: Int = 10000

    /**
     * Container for method_bind pointers for EditorSettings
     */
    private object __method_bind {
      val addPropertyInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "add_property_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_property_info" }
            }
          }

      val erase: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "erase".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase" }
            }
          }

      val getFavorites: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_favorites".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_favorites" }
            }
          }

      val getProjectMetadata: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_project_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_project_metadata" }
            }
          }

      val getProjectSettingsDir: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_project_settings_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_project_settings_dir" }
            }
          }

      val getRecentDirs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_recent_dirs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_recent_dirs" }
            }
          }

      val getSetting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_setting" }
            }
          }

      val getSettingsDir: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "get_settings_dir".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_settings_dir" }
            }
          }

      val hasSetting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "has_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_setting" }
            }
          }

      val propertyCanRevert: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "property_can_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
            }
          }

      val propertyGetRevert: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "property_get_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
            }
          }

      val setFavorites: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_favorites".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_favorites" }
            }
          }

      val setInitialValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_initial_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_initial_value" }
            }
          }

      val setProjectMetadata: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_project_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_project_metadata" }
            }
          }

      val setRecentDirs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_recent_dirs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_recent_dirs" }
            }
          }

      val setSetting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSettings".cstr.ptr,
              "set_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_setting" }
            }
          }
    }
  }
}
