// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
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

open class ProjectSettingsInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun addPropertyInfo(hint: Dictionary) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addPropertyInfo.call(self._handle, listOf(hint), null)
    }
  }

  fun clear(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, listOf(name), null)
    }
  }

  fun getOrder(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOrder.call(self._handle, listOf(name), _retPtr)
      _ret.value
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

  fun globalizePath(path: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.globalizePath.call(self._handle, listOf(path), _retPtr)
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

  fun loadResourcePack(pack: String, replaceFiles: Boolean = true): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(pack)
      _args.add(replaceFiles)
      __method_bind.loadResourcePack.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun localizePath(path: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.localizePath.call(self._handle, listOf(path), _retPtr)
      _ret.toKStringAndDestroy()
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

  fun save(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.save.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun saveCustom(file: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.saveCustom.call(self._handle, listOf(file), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setInitialValue(name: String, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(value)
      __method_bind.setInitialValue.call(self._handle, _args, null)
    }
  }

  fun setOrder(name: String, position: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(position)
      __method_bind.setOrder.call(self._handle, _args, null)
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
    /**
     * Container for method_bind pointers for ProjectSettings
     */
    private object __method_bind {
      val addPropertyInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "add_property_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_property_info" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val getOrder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "get_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_order" }
            }
          }

      val getSetting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "get_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_setting" }
            }
          }

      val globalizePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "globalize_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method globalize_path" }
            }
          }

      val hasSetting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "has_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_setting" }
            }
          }

      val loadResourcePack: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "load_resource_pack".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_resource_pack" }
            }
          }

      val localizePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "localize_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method localize_path" }
            }
          }

      val propertyCanRevert: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "property_can_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
            }
          }

      val propertyGetRevert: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "property_get_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
            }
          }

      val save: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "save".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save" }
            }
          }

      val saveCustom: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "save_custom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_custom" }
            }
          }

      val setInitialValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "set_initial_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_initial_value" }
            }
          }

      val setOrder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "set_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_order" }
            }
          }

      val setSetting: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
              "set_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_setting" }
            }
          }
    }
  }
}

object ProjectSettings : ProjectSettingsInternal(null) {
  init {
    Allocator.allocationScope {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("ProjectSettings".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton ProjectSettings" }
      _handle = handle
    }
  }
}
