// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConfigFile(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun eraseSection(section: String) {
    val _arg = Variant.new(section)
    __method_bind.eraseSection.call(this._handle, listOf(_arg))
  }

  fun eraseSectionKey(section: String, key: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(section))
    _args.add(Variant.fromAny(key))
    __method_bind.eraseSectionKey.call(this._handle, _args)
  }

  fun getSectionKeys(section: String): PoolStringArray {
    val _arg = Variant.new(section)
    val _ret = __method_bind.getSectionKeys.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getSections(): PoolStringArray {
    val _ret = __method_bind.getSections.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getValue(
    section: String,
    key: String,
    default: Variant
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(section))
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(default))
    val _ret = __method_bind.getValue.call(this._handle, _args)
    return _ret
  }

  fun hasSection(section: String): Boolean {
    val _arg = Variant.new(section)
    val _ret = __method_bind.hasSection.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasSectionKey(section: String, key: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(section))
    _args.add(Variant.fromAny(key))
    val _ret = __method_bind.hasSectionKey.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun load(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.load.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun loadEncrypted(path: String, key: PoolByteArray): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(key))
    val _ret = __method_bind.loadEncrypted.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun loadEncryptedPass(path: String, pass: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(pass))
    val _ret = __method_bind.loadEncryptedPass.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun save(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.save.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun saveEncrypted(path: String, key: PoolByteArray): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(key))
    val _ret = __method_bind.saveEncrypted.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun saveEncryptedPass(path: String, pass: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(pass))
    val _ret = __method_bind.saveEncryptedPass.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun setValue(
    section: String,
    key: String,
    value: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(section))
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(value))
    __method_bind.setValue.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConfigFile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConfigFile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ConfigFile
     */
    private object __method_bind {
      val eraseSection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "erase_section".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_section" }
        }
      val eraseSectionKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "erase_section_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_section_key" }
        }
      val getSectionKeys: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "get_section_keys".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_section_keys" }
        }
      val getSections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "get_sections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sections" }
        }
      val getValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "get_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_value" }
        }
      val hasSection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "has_section".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_section" }
        }
      val hasSectionKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "has_section_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_section_key" }
        }
      val load: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "load".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load" }
        }
      val loadEncrypted: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "load_encrypted".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_encrypted" }
        }
      val loadEncryptedPass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "load_encrypted_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_encrypted_pass" }
        }
      val save: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "save".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save" }
        }
      val saveEncrypted: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "save_encrypted".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_encrypted" }
        }
      val saveEncryptedPass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "save_encrypted_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_encrypted_pass" }
        }
      val setValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "set_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_value" }
        }}
  }
}
