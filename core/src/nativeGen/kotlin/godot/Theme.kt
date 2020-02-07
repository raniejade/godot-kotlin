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
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Theme(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var defaultFont: Font
    get() {
       return getDefaultFont() 
    }
    set(value) {
      setDefaultFont(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun clearColor(name: String, type: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    __method_bind.clearColor.call(this._handle, _args)
  }

  fun clearConstant(name: String, type: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    __method_bind.clearConstant.call(this._handle, _args)
  }

  fun clearFont(name: String, type: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    __method_bind.clearFont.call(this._handle, _args)
  }

  fun clearIcon(name: String, type: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    __method_bind.clearIcon.call(this._handle, _args)
  }

  fun clearStylebox(name: String, type: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    __method_bind.clearStylebox.call(this._handle, _args)
  }

  fun copyDefaultTheme() {
    __method_bind.copyDefaultTheme.call(this._handle)
  }

  fun copyTheme(other: Theme) {
    val _arg = Variant(other)
    __method_bind.copyTheme.call(this._handle, listOf(_arg))
  }

  fun getColor(name: String, type: String): Color {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.getColor.call(this._handle, _args)
    return _ret.asColor()
  }

  fun getColorList(type: String): PoolStringArray {
    val _arg = Variant(type)
    val _ret = __method_bind.getColorList.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getConstant(name: String, type: String): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.getConstant.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getConstantList(type: String): PoolStringArray {
    val _arg = Variant(type)
    val _ret = __method_bind.getConstantList.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getDefaultFont(): Font {
    val _ret = __method_bind.getDefaultFont.call(this._handle)
    return _ret.asObject(::Font)!!
  }

  fun getFont(name: String, type: String): Font {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.getFont.call(this._handle, _args)
    return _ret.asObject(::Font)!!
  }

  fun getFontList(type: String): PoolStringArray {
    val _arg = Variant(type)
    val _ret = __method_bind.getFontList.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getIcon(name: String, type: String): Texture {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.getIcon.call(this._handle, _args)
    return _ret.asObject(::Texture)!!
  }

  fun getIconList(type: String): PoolStringArray {
    val _arg = Variant(type)
    val _ret = __method_bind.getIconList.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getStylebox(name: String, type: String): StyleBox {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.getStylebox.call(this._handle, _args)
    return _ret.asObject(::StyleBox)!!
  }

  fun getStyleboxList(type: String): PoolStringArray {
    val _arg = Variant(type)
    val _ret = __method_bind.getStyleboxList.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getStyleboxTypes(): PoolStringArray {
    val _ret = __method_bind.getStyleboxTypes.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getTypeList(type: String): PoolStringArray {
    val _arg = Variant(type)
    val _ret = __method_bind.getTypeList.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun hasColor(name: String, type: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.hasColor.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hasConstant(name: String, type: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.hasConstant.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hasFont(name: String, type: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.hasFont.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hasIcon(name: String, type: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.hasIcon.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hasStylebox(name: String, type: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    val _ret = __method_bind.hasStylebox.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun setColor(
    name: String,
    type: String,
    color: Color
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(color))
    __method_bind.setColor.call(this._handle, _args)
  }

  fun setConstant(
    name: String,
    type: String,
    constant: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(constant))
    __method_bind.setConstant.call(this._handle, _args)
  }

  fun setDefaultFont(font: Font) {
    val _arg = Variant(font)
    __method_bind.setDefaultFont.call(this._handle, listOf(_arg))
  }

  fun setFont(
    name: String,
    type: String,
    font: Font
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(font))
    __method_bind.setFont.call(this._handle, _args)
  }

  fun setIcon(
    name: String,
    type: String,
    texture: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(texture))
    __method_bind.setIcon.call(this._handle, _args)
  }

  fun setStylebox(
    name: String,
    type: String,
    texture: StyleBox
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(texture))
    __method_bind.setStylebox.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Theme".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Theme" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
      val clearColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_color" }
        }
      val clearConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_constant" }
        }
      val clearFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_font" }
        }
      val clearIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_icon" }
        }
      val clearStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_stylebox" }
        }
      val copyDefaultTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copy_default_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_default_theme" }
        }
      val copyTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copy_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_theme" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getColorList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_color_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_list" }
        }
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val getConstantList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_constant_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_list" }
        }
      val getDefaultFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_default_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_font" }
        }
      val getFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font" }
        }
      val getFontList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_font_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font_list" }
        }
      val getIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon" }
        }
      val getIconList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_icon_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_list" }
        }
      val getStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox" }
        }
      val getStyleboxList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox_list" }
        }
      val getStyleboxTypes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox_types".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox_types" }
        }
      val getTypeList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_type_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_type_list" }
        }
      val hasColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_color" }
        }
      val hasConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_constant" }
        }
      val hasFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_font" }
        }
      val hasIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_icon" }
        }
      val hasStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_stylebox" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }
      val setDefaultFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_default_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_font" }
        }
      val setFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_font" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon" }
        }
      val setStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stylebox" }
        }}
  }
}
