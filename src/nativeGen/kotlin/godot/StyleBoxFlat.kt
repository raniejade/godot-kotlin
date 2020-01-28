// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StyleBoxFlat(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  var antiAliasing: Boolean
    get() {
       return isAntiAliased() 
    }
    set(value) {
      setAntiAliased(value)
    }

  var antiAliasingSize: Int
    get() {
       return getAaSize() 
    }
    set(value) {
      setAaSize(value)
    }

  var bgColor: Color
    get() {
       return getBgColor() 
    }
    set(value) {
      setBgColor(value)
    }

  var borderBlend: Boolean
    get() {
       return getBorderBlend() 
    }
    set(value) {
      setBorderBlend(value)
    }

  var borderColor: Color
    get() {
       return getBorderColor() 
    }
    set(value) {
      setBorderColor(value)
    }

  var cornerDetail: Int
    get() {
       return getCornerDetail() 
    }
    set(value) {
      setCornerDetail(value)
    }

  var drawCenter: Boolean
    get() {
       return isDrawCenterEnabled() 
    }
    set(value) {
      setDrawCenter(value)
    }

  var shadowColor: Color
    get() {
       return getShadowColor() 
    }
    set(value) {
      setShadowColor(value)
    }

  var shadowOffset: Vector2
    get() {
       return getShadowOffset() 
    }
    set(value) {
      setShadowOffset(value)
    }

  var shadowSize: Int
    get() {
       return getShadowSize() 
    }
    set(value) {
      setShadowSize(value)
    }

  fun getAaSize(): Int {
    val _ret = __method_bind.getAaSize.call(this._handle)
    return _ret.asInt()
  }

  fun getBgColor(): Color {
    val _ret = __method_bind.getBgColor.call(this._handle)
    return _ret.asColor()
  }

  fun getBorderBlend(): Boolean {
    val _ret = __method_bind.getBorderBlend.call(this._handle)
    return _ret.asBoolean()
  }

  fun getBorderColor(): Color {
    val _ret = __method_bind.getBorderColor.call(this._handle)
    return _ret.asColor()
  }

  fun getBorderWidth(margin: Int): Int {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getBorderWidth.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getBorderWidthMin(): Int {
    val _ret = __method_bind.getBorderWidthMin.call(this._handle)
    return _ret.asInt()
  }

  fun getCornerDetail(): Int {
    val _ret = __method_bind.getCornerDetail.call(this._handle)
    return _ret.asInt()
  }

  fun getCornerRadius(corner: Int): Int {
    val _arg = Variant.new(corner)
    val _ret = __method_bind.getCornerRadius.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getExpandMargin(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getExpandMargin.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getShadowColor(): Color {
    val _ret = __method_bind.getShadowColor.call(this._handle)
    return _ret.asColor()
  }

  fun getShadowOffset(): Vector2 {
    val _ret = __method_bind.getShadowOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getShadowSize(): Int {
    val _ret = __method_bind.getShadowSize.call(this._handle)
    return _ret.asInt()
  }

  fun isAntiAliased(): Boolean {
    val _ret = __method_bind.isAntiAliased.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawCenterEnabled(): Boolean {
    val _ret = __method_bind.isDrawCenterEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAaSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setAaSize.call(this._handle, _arg, 1)
  }

  fun setAntiAliased(antiAliased: Boolean) {
    val _arg = Variant.new(antiAliased)
    __method_bind.setAntiAliased.call(this._handle, _arg, 1)
  }

  fun setBgColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setBgColor.call(this._handle, _arg, 1)
  }

  fun setBorderBlend(blend: Boolean) {
    val _arg = Variant.new(blend)
    __method_bind.setBorderBlend.call(this._handle, _arg, 1)
  }

  fun setBorderColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setBorderColor.call(this._handle, _arg, 1)
  }

  fun setBorderWidth(margin: Int, width: Int) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(width)
    __method_bind.setBorderWidth.call(this._handle, _args.toVariant(), 2)
  }

  fun setBorderWidthAll(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.setBorderWidthAll.call(this._handle, _arg, 1)
  }

  fun setCornerDetail(detail: Int) {
    val _arg = Variant.new(detail)
    __method_bind.setCornerDetail.call(this._handle, _arg, 1)
  }

  fun setCornerRadius(corner: Int, radius: Int) {
    val _args = VariantArray.new()
    _args.append(corner)
    _args.append(radius)
    __method_bind.setCornerRadius.call(this._handle, _args.toVariant(), 2)
  }

  fun setCornerRadiusAll(radius: Int) {
    val _arg = Variant.new(radius)
    __method_bind.setCornerRadiusAll.call(this._handle, _arg, 1)
  }

  fun setCornerRadiusIndividual(
    radiusTopLeft: Int,
    radiusTopRight: Int,
    radiusBottomRight: Int,
    radiusBottomLeft: Int
  ) {
    val _args = VariantArray.new()
    _args.append(radiusTopLeft)
    _args.append(radiusTopRight)
    _args.append(radiusBottomRight)
    _args.append(radiusBottomLeft)
    __method_bind.setCornerRadiusIndividual.call(this._handle, _args.toVariant(), 4)
  }

  fun setDrawCenter(drawCenter: Boolean) {
    val _arg = Variant.new(drawCenter)
    __method_bind.setDrawCenter.call(this._handle, _arg, 1)
  }

  fun setExpandMargin(margin: Int, size: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(size)
    __method_bind.setExpandMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun setExpandMarginAll(size: Float) {
    val _arg = Variant.new(size)
    __method_bind.setExpandMarginAll.call(this._handle, _arg, 1)
  }

  fun setExpandMarginIndividual(
    sizeLeft: Float,
    sizeTop: Float,
    sizeRight: Float,
    sizeBottom: Float
  ) {
    val _args = VariantArray.new()
    _args.append(sizeLeft)
    _args.append(sizeTop)
    _args.append(sizeRight)
    _args.append(sizeBottom)
    __method_bind.setExpandMarginIndividual.call(this._handle, _args.toVariant(), 4)
  }

  fun setShadowColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setShadowColor.call(this._handle, _arg, 1)
  }

  fun setShadowOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setShadowOffset.call(this._handle, _arg, 1)
  }

  fun setShadowSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setShadowSize.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): StyleBoxFlat = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxFlat".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxFlat" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxFlat(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StyleBoxFlat = StyleBoxFlat(ptr)
    /**
     * Container for method_bind pointers for StyleBoxFlat
     */
    private object __method_bind {
      val getAaSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_aa_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aa_size" }
        }
      val getBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bg_color" }
        }
      val getBorderBlend: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_border_blend".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_border_blend" }
        }
      val getBorderColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_border_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_border_color" }
        }
      val getBorderWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_border_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_border_width" }
        }
      val getBorderWidthMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_border_width_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_border_width_min" }
        }
      val getCornerDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_corner_detail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_corner_detail" }
        }
      val getCornerRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_corner_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_corner_radius" }
        }
      val getExpandMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_expand_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expand_margin" }
        }
      val getShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
        }
      val getShadowOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_shadow_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_offset" }
        }
      val getShadowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "get_shadow_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_size" }
        }
      val isAntiAliased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "is_anti_aliased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_anti_aliased" }
        }
      val isDrawCenterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "is_draw_center_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
        }
      val setAaSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_aa_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_aa_size" }
        }
      val setAntiAliased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_anti_aliased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anti_aliased" }
        }
      val setBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bg_color" }
        }
      val setBorderBlend: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_border_blend".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_border_blend" }
        }
      val setBorderColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_border_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_border_color" }
        }
      val setBorderWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_border_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_border_width" }
        }
      val setBorderWidthAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_border_width_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_border_width_all" }
        }
      val setCornerDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_corner_detail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_corner_detail" }
        }
      val setCornerRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_corner_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_corner_radius" }
        }
      val setCornerRadiusAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_corner_radius_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_corner_radius_all" }
        }
      val setCornerRadiusIndividual: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_corner_radius_individual".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_corner_radius_individual" }
        }
      val setDrawCenter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_draw_center".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
        }
      val setExpandMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_expand_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_margin" }
        }
      val setExpandMarginAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_expand_margin_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_margin_all" }
        }
      val setExpandMarginIndividual: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_expand_margin_individual".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_margin_individual" }
        }
      val setShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
        }
      val setShadowOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_shadow_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_offset" }
        }
      val setShadowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "set_shadow_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_size" }
        }}
  }
}
