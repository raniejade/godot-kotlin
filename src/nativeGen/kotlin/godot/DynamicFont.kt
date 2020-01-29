// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class DynamicFont(
  _handle: COpaquePointer
) : Font(_handle) {
  var extraSpacingBottom: Int
    get() {
       return getSpacing(1) 
    }
    set(value) {
      setSpacing(1, value)
    }

  var extraSpacingChar: Int
    get() {
       return getSpacing(2) 
    }
    set(value) {
      setSpacing(2, value)
    }

  var extraSpacingSpace: Int
    get() {
       return getSpacing(3) 
    }
    set(value) {
      setSpacing(3, value)
    }

  var extraSpacingTop: Int
    get() {
       return getSpacing(0) 
    }
    set(value) {
      setSpacing(0, value)
    }

  var fontData: DynamicFontData
    get() {
       return getFontData() 
    }
    set(value) {
      setFontData(value)
    }

  var outlineColor: Color
    get() {
       return getOutlineColor() 
    }
    set(value) {
      setOutlineColor(value)
    }

  var outlineSize: Int
    get() {
       return getOutlineSize() 
    }
    set(value) {
      setOutlineSize(value)
    }

  var size: Int
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  var useFilter: Boolean
    get() {
       return getUseFilter() 
    }
    set(value) {
      setUseFilter(value)
    }

  var useMipmaps: Boolean
    get() {
       return getUseMipmaps() 
    }
    set(value) {
      setUseMipmaps(value)
    }

  /**
   * Specialized setter for outlineColor
   */
  fun outlineColor(cb: Color.() -> Unit) {
    val _p = outlineColor
    cb(_p)
    outlineColor = _p
  }

  fun addFallback(data: DynamicFontData) {
    val _arg = Variant.new(data)
    __method_bind.addFallback.call(this._handle, _arg, 1)
  }

  fun getFallback(idx: Int): DynamicFontData {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFallback.call(this._handle, _arg, 1)
    return _ret.asObject(::DynamicFontData)!!
  }

  fun getFallbackCount(): Int {
    val _ret = __method_bind.getFallbackCount.call(this._handle)
    return _ret.asInt()
  }

  fun getFontData(): DynamicFontData {
    val _ret = __method_bind.getFontData.call(this._handle)
    return _ret.asObject(::DynamicFontData)!!
  }

  fun getOutlineColor(): Color {
    val _ret = __method_bind.getOutlineColor.call(this._handle)
    return _ret.asColor()
  }

  fun getOutlineSize(): Int {
    val _ret = __method_bind.getOutlineSize.call(this._handle)
    return _ret.asInt()
  }

  fun getSize(): Int {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asInt()
  }

  fun getSpacing(type: Int): Int {
    val _arg = Variant.new(type)
    val _ret = __method_bind.getSpacing.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getUseFilter(): Boolean {
    val _ret = __method_bind.getUseFilter.call(this._handle)
    return _ret.asBoolean()
  }

  fun getUseMipmaps(): Boolean {
    val _ret = __method_bind.getUseMipmaps.call(this._handle)
    return _ret.asBoolean()
  }

  fun removeFallback(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.removeFallback.call(this._handle, _arg, 1)
  }

  fun setFallback(idx: Int, data: DynamicFontData) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(data)
    __method_bind.setFallback.call(this._handle, _args.toVariant(), 2)
  }

  fun setFontData(data: DynamicFontData) {
    val _arg = Variant.new(data)
    __method_bind.setFontData.call(this._handle, _arg, 1)
  }

  fun setOutlineColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setOutlineColor.call(this._handle, _arg, 1)
  }

  fun setOutlineSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setOutlineSize.call(this._handle, _arg, 1)
  }

  fun setSize(data: Int) {
    val _arg = Variant.new(data)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  fun setSpacing(type: Int, value: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(value)
    __method_bind.setSpacing.call(this._handle, _args.toVariant(), 2)
  }

  fun setUseFilter(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseFilter.call(this._handle, _arg, 1)
  }

  fun setUseMipmaps(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseMipmaps.call(this._handle, _arg, 1)
  }

  enum class SpacingType(
    val value: Int
  ) {
    SPACING_TOP(0),

    SPACING_BOTTOM(1),

    SPACING_CHAR(2),

    SPACING_SPACE(3);

    companion object {
      fun from(value: Int): SpacingType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val SPACING_BOTTOM: Int = 1

    val SPACING_CHAR: Int = 2

    val SPACING_SPACE: Int = 3

    val SPACING_TOP: Int = 0

    fun new(): DynamicFont = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFont".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for DynamicFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DynamicFont(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): DynamicFont = DynamicFont(ptr)
    /**
     * Container for method_bind pointers for DynamicFont
     */
    private object __method_bind {
      val addFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "add_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_fallback" }
        }
      val getFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback" }
        }
      val getFallbackCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_fallback_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback_count" }
        }
      val getFontData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_font_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font_data" }
        }
      val getOutlineColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_outline_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline_color" }
        }
      val getOutlineSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_outline_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline_size" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getSpacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spacing" }
        }
      val getUseFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_use_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_filter" }
        }
      val getUseMipmaps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_use_mipmaps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_mipmaps" }
        }
      val removeFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "remove_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_fallback" }
        }
      val setFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fallback" }
        }
      val setFontData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_font_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_font_data" }
        }
      val setOutlineColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_outline_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outline_color" }
        }
      val setOutlineSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_outline_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outline_size" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setSpacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spacing" }
        }
      val setUseFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_use_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_filter" }
        }
      val setUseMipmaps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_use_mipmaps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_mipmaps" }
        }}
  }
}
