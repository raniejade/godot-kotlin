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
  var defaultFont: Font
    get() {
       return getDefaultFont() 
    }
    set(value) {
      setDefaultFont(value)
    }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun clearColor(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clearColor.call(this._handle, _args.toVariant(), 2)
  }

  fun clearConstant(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clearConstant.call(this._handle, _args.toVariant(), 2)
  }

  fun clearFont(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clearFont.call(this._handle, _args.toVariant(), 2)
  }

  fun clearIcon(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clearIcon.call(this._handle, _args.toVariant(), 2)
  }

  fun clearStylebox(name: String, type: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    __method_bind.clearStylebox.call(this._handle, _args.toVariant(), 2)
  }

  fun copyDefaultTheme() {
    __method_bind.copyDefaultTheme.call(this._handle)
  }

  fun copyTheme(other: Theme) {
    val _arg = Variant.new(other)
    __method_bind.copyTheme.call(this._handle, _arg, 1)
  }

  fun getColor(name: String, type: String): Color {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getColor.call(this._handle, _args.toVariant(), 2)
    return _ret.asColor()
  }

  fun getColorList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getColorList.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getConstant(name: String, type: String): Int {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getConstant.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getConstantList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getConstantList.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getDefaultFont(): Font {
    val _ret = __method_bind.getDefaultFont.call(this._handle)
    return _ret.asObject(::Font)!!
  }

  fun getFont(name: String, type: String): Font {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getFont.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Font)!!
  }

  fun getFontList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getFontList.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getIcon(name: String, type: String): Texture {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getIcon.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Texture)!!
  }

  fun getIconList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getIconList.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getStylebox(name: String, type: String): StyleBox {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getStylebox.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::StyleBox)!!
  }

  fun getStyleboxList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getStyleboxList.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getStyleboxTypes(): PoolStringArray {
    val _ret = __method_bind.getStyleboxTypes.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getTypeList(type: String): PoolStringArray {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getTypeList.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun hasColor(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasColor.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasConstant(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasConstant.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasFont(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasFont.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasIcon(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasIcon.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasStylebox(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasStylebox.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.setColor.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.setConstant.call(this._handle, _args.toVariant(), 3)
  }

  fun setDefaultFont(font: Font) {
    val _arg = Variant.new(font)
    __method_bind.setDefaultFont.call(this._handle, _arg, 1)
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
    __method_bind.setFont.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.setIcon.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.setStylebox.call(this._handle, _args.toVariant(), 3)
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
      val clearColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clearColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearColor" }
        }
      val clearConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clearConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearConstant" }
        }
      val clearFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clearFont".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearFont" }
        }
      val clearIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clearIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearIcon" }
        }
      val clearStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clearStylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearStylebox" }
        }
      val copyDefaultTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copyDefaultTheme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copyDefaultTheme" }
        }
      val copyTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copyTheme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copyTheme" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColor" }
        }
      val getColorList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getColorList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColorList" }
        }
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConstant" }
        }
      val getConstantList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getConstantList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConstantList" }
        }
      val getDefaultFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getDefaultFont".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDefaultFont" }
        }
      val getFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getFont".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFont" }
        }
      val getFontList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getFontList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFontList" }
        }
      val getIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIcon" }
        }
      val getIconList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getIconList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIconList" }
        }
      val getStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getStylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStylebox" }
        }
      val getStyleboxList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getStyleboxList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStyleboxList" }
        }
      val getStyleboxTypes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getStyleboxTypes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStyleboxTypes" }
        }
      val getTypeList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "getTypeList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTypeList" }
        }
      val hasColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "hasColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasColor" }
        }
      val hasConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "hasConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasConstant" }
        }
      val hasFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "hasFont".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasFont" }
        }
      val hasIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "hasIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasIcon" }
        }
      val hasStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "hasStylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasStylebox" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "setColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColor" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "setConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setConstant" }
        }
      val setDefaultFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "setDefaultFont".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDefaultFont" }
        }
      val setFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "setFont".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFont" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "setIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIcon" }
        }
      val setStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "setStylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStylebox" }
        }}
  }
}
