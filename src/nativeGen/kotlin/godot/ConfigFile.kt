// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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

open class ConfigFile(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun eraseSection(section: String) {
    val _arg = Variant.new(section)
    __method_bind.eraseSection.call(this._handle, _arg, 1)
  }

  fun getSectionKeys(section: String): PoolStringArray {
    val _arg = Variant.new(section)
    val _ret = __method_bind.getSectionKeys.call(this._handle, _arg, 1)
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
    val _args = VariantArray.new()
    _args.append(section)
    _args.append(key)
    _args.append(default)
    val _ret = __method_bind.getValue.call(this._handle, _args.toVariant(), 3)
    return _ret
  }

  fun hasSection(section: String): Boolean {
    val _arg = Variant.new(section)
    val _ret = __method_bind.hasSection.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasSectionKey(section: String, key: String): Boolean {
    val _args = VariantArray.new()
    _args.append(section)
    _args.append(key)
    val _ret = __method_bind.hasSectionKey.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun load(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.load.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun save(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.save.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setValue(
    section: String,
    key: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(section)
    _args.append(key)
    _args.append(value)
    __method_bind.setValue.call(this._handle, _args.toVariant(), 3)
  }

  companion object {
    fun new(): ConfigFile = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConfigFile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConfigFile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConfigFile(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ConfigFile = ConfigFile(ptr)
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
      val save: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "save".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save" }
        }
      val setValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
            "set_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_value" }
        }}
  }
}
