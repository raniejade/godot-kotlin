// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolStringArray
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

open class Theme(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun clearColor(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clear_color.call(this._handle, _args.toVariant(), 2)
  }

  fun clearConstant(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clear_constant.call(this._handle, _args.toVariant(), 2)
  }

  fun clearFont(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clear_font.call(this._handle, _args.toVariant(), 2)
  }

  fun clearIcon(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clear_icon.call(this._handle, _args.toVariant(), 2)
  }

  fun clearStylebox(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clear_stylebox.call(this._handle, _args.toVariant(), 2)
  }

  fun copyDefaultTheme() {
    __method_bind.copy_default_theme.call(this._handle)
  }

  fun copyTheme(other: Theme) {
    val _arg = Variant.new(other)
    __method_bind.copy_theme.call(this._handle, _arg, 1)
  }

  fun getColor(name: String, type: String): Color {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.get_color.call(this._handle, _args.toVariant(), 2)
    return _ret.asColor()
  }

  fun getColorList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_color_list.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getConstant(name: String, type: String): Int {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.get_constant.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getConstantList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_constant_list.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getDefaultFont(): Font {
    val _ret = __method_bind.get_default_font.call(this._handle)
    return _ret.asObject(::Font)!!
  }

  fun getFont(name: String, type: String): Font {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.get_font.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Font)!!
  }

  fun getFontList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_font_list.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getIcon(name: String, type: String): Texture {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.get_icon.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Texture)!!
  }

  fun getIconList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_icon_list.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getStylebox(name: String, type: String): StyleBox {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.get_stylebox.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::StyleBox)!!
  }

  fun getStyleboxList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_stylebox_list.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getStyleboxTypes(): PoolStringArray {
    val _ret = __method_bind.get_stylebox_types.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getTypeList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.get_type_list.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun hasColor(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.has_color.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasConstant(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.has_constant.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasFont(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.has_font.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasIcon(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.has_icon.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasStylebox(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.has_stylebox.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun setColor(
    name: String,
    type: String,
    color: Color
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    _args.append(color)
    __method_bind.set_color.call(this._handle, _args.toVariant(), 3)
  }

  fun setConstant(
    name: String,
    type: String,
    constant: Int
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    _args.append(constant)
    __method_bind.set_constant.call(this._handle, _args.toVariant(), 3)
  }

  fun setDefaultFont(font: Font) {
    val _arg = Variant.new(font)
    __method_bind.set_default_font.call(this._handle, _arg, 1)
  }

  fun setFont(
    name: String,
    type: String,
    font: Font
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    _args.append(font)
    __method_bind.set_font.call(this._handle, _args.toVariant(), 3)
  }

  fun setIcon(
    name: String,
    type: String,
    texture: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    _args.append(texture)
    __method_bind.set_icon.call(this._handle, _args.toVariant(), 3)
  }

  fun setStylebox(
    name: String,
    type: String,
    texture: StyleBox
  ) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    _args.append(texture)
    __method_bind.set_stylebox.call(this._handle, _args.toVariant(), 3)
  }

  companion object {
    fun new(): Theme = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Theme".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Theme" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Theme(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Theme = Theme(ptr)
    /**
     * Container for method_bind pointers for Theme
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val clear_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_color" }
        }
      val clear_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_constant" }
        }
      val clear_font: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_font" }
        }
      val clear_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_icon" }
        }
      val clear_stylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_stylebox" }
        }
      val copy_default_theme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copy_default_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_default_theme" }
        }
      val copy_theme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copy_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_theme" }
        }
      val get_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val get_color_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_color_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_list" }
        }
      val get_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val get_constant_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_constant_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_list" }
        }
      val get_default_font: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_default_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_font" }
        }
      val get_font: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font" }
        }
      val get_font_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_font_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font_list" }
        }
      val get_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon" }
        }
      val get_icon_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_icon_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_list" }
        }
      val get_stylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox" }
        }
      val get_stylebox_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox_list" }
        }
      val get_stylebox_types: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox_types".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox_types" }
        }
      val get_type_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_type_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_type_list" }
        }
      val has_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_color" }
        }
      val has_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_constant" }
        }
      val has_font: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_font" }
        }
      val has_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_icon" }
        }
      val has_stylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_stylebox" }
        }
      val set_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val set_constant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }
      val set_default_font: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_default_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_font" }
        }
      val set_font: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_font" }
        }
      val set_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon" }
        }
      val set_stylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stylebox" }
        }}
  }
}
