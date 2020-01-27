// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _arg = Variant.new(hint)
    __method_bind.add_property_info.call(this._handle, _arg, 1)
  }

  fun clear(name: String) {
    val _arg = Variant.new(name)
    __method_bind.clear.call(this._handle, _arg, 1)
  }

  fun getOrder(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_order.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getSetting(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_setting.call(this._handle, _arg, 1)
    return _ret
  }

  fun globalizePath(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.globalize_path.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun hasSetting(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_setting.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun loadResourcePack(pack: String): Boolean {
    val _arg = Variant.new(pack)
    val _ret = __method_bind.load_resource_pack.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun localizePath(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.localize_path.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun propertyCanRevert(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.property_can_revert.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun propertyGetRevert(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.property_get_revert.call(this._handle, _arg, 1)
    return _ret
  }

  fun save(): GDError {
    val _ret = __method_bind.save.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun saveCustom(file: String): GDError {
    val _arg = Variant.new(file)
    val _ret = __method_bind.save_custom.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setInitialValue(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.set_initial_value.call(this._handle, _args.toVariant(), 2)
  }

  fun setOrder(name: String, position: Int) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(position)
    __method_bind.set_order.call(this._handle, _args.toVariant(), 2)
  }

  fun setSetting(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.set_setting.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    val Instance: ProjectSettings
      get() = memScoped {
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
      val add_property_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "add_property_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_property_info" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val get_order: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "get_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_order" }
        }
      val get_setting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "get_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_setting" }
        }
      val globalize_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "globalize_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method globalize_path" }
        }
      val has_setting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "has_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_setting" }
        }
      val load_resource_pack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "load_resource_pack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_resource_pack" }
        }
      val localize_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "localize_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method localize_path" }
        }
      val property_can_revert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "property_can_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
        }
      val property_get_revert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "property_get_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
        }
      val save: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "save".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save" }
        }
      val save_custom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "save_custom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_custom" }
        }
      val set_initial_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "set_initial_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_initial_value" }
        }
      val set_order: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "set_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_order" }
        }
      val set_setting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "set_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_setting" }
        }}
  }
}
