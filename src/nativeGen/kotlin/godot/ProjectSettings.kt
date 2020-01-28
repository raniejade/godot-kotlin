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

open class ProjectSettings(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addPropertyInfo(hint: Dictionary) {
    val _arg = Variant.new(hint)
    __method_bind.addPropertyInfo.call(this._handle, _arg, 1)
  }

  fun clear(name: String) {
    val _arg = Variant.new(name)
    __method_bind.clear.call(this._handle, _arg, 1)
  }

  fun getOrder(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getOrder.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getSetting(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getSetting.call(this._handle, _arg, 1)
    return _ret
  }

  fun globalizePath(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.globalizePath.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun hasSetting(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasSetting.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun loadResourcePack(pack: String): Boolean {
    val _arg = Variant.new(pack)
    val _ret = __method_bind.loadResourcePack.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun localizePath(path: String): String {
    val _arg = Variant.new(path)
    val _ret = __method_bind.localizePath.call(this._handle, _arg, 1)
    return _ret.asString()
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

  fun save(): GDError {
    val _ret = __method_bind.save.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun saveCustom(file: String): GDError {
    val _arg = Variant.new(file)
    val _ret = __method_bind.saveCustom.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setInitialValue(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.setInitialValue.call(this._handle, _args.toVariant(), 2)
  }

  fun setOrder(name: String, position: Int) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(position)
    __method_bind.setOrder.call(this._handle, _args.toVariant(), 2)
  }

  fun setSetting(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.setSetting.call(this._handle, _args.toVariant(), 2)
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
      val addPropertyInfo: CPointer<godot_method_bind>
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
      val getOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "get_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_order" }
        }
      val getSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "get_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_setting" }
        }
      val globalizePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "globalize_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method globalize_path" }
        }
      val hasSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "has_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_setting" }
        }
      val loadResourcePack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "load_resource_pack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_resource_pack" }
        }
      val localizePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "localize_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method localize_path" }
        }
      val propertyCanRevert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "property_can_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
        }
      val propertyGetRevert: CPointer<godot_method_bind>
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
      val saveCustom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "save_custom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_custom" }
        }
      val setInitialValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "set_initial_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_initial_value" }
        }
      val setOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "set_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_order" }
        }
      val setSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProjectSettings".cstr.ptr,
            "set_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_setting" }
        }}
  }
}
