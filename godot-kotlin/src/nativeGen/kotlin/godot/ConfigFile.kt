// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class ConfigFile(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun eraseSection(section: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.eraseSection.call(self._handle, listOf(section), null)
    }
  }

  fun eraseSectionKey(section: String, key: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(section)
      _args.add(key)
      __method_bind.eraseSectionKey.call(self._handle, _args, null)
    }
  }

  fun getSectionKeys(section: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getSectionKeys.call(self._handle, listOf(section), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSections(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getSections.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getValue(
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
      __method_bind.getValue.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasSection(section: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasSection.call(self._handle, listOf(section), _retPtr)
      _ret.value
    }
  }

  fun hasSectionKey(section: String, key: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(section)
      _args.add(key)
      __method_bind.hasSectionKey.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun load(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.load.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun loadEncrypted(path: String, key: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(key)
      __method_bind.loadEncrypted.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun loadEncryptedPass(path: String, pass: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(pass)
      __method_bind.loadEncryptedPass.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun save(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.save.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun saveEncrypted(path: String, key: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(key)
      __method_bind.saveEncrypted.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun saveEncryptedPass(path: String, pass: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(pass)
      __method_bind.saveEncryptedPass.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setValue(
    section: String,
    key: String,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(section)
      _args.add(key)
      _args.add(value)
      __method_bind.setValue.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConfigFile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConfigFile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ConfigFile
     */
    private object __method_bind {
      val eraseSection: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "erase_section".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_section" }
            }
          }

      val eraseSectionKey: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "erase_section_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_section_key" }
            }
          }

      val getSectionKeys: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "get_section_keys".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_section_keys" }
            }
          }

      val getSections: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "get_sections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sections" }
            }
          }

      val getValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "get_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_value" }
            }
          }

      val hasSection: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "has_section".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_section" }
            }
          }

      val hasSectionKey: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "has_section_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_section_key" }
            }
          }

      val load: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "load".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load" }
            }
          }

      val loadEncrypted: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "load_encrypted".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_encrypted" }
            }
          }

      val loadEncryptedPass: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "load_encrypted_pass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_encrypted_pass" }
            }
          }

      val save: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "save".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save" }
            }
          }

      val saveEncrypted: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "save_encrypted".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_encrypted" }
            }
          }

      val saveEncryptedPass: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "save_encrypted_pass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_encrypted_pass" }
            }
          }

      val setValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "set_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_value" }
            }
          }
    }
  }
}
