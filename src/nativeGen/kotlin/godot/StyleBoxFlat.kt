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
            "getAaSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAaSize" }
        }
      val getBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBgColor" }
        }
      val getBorderBlend: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getBorderBlend".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBorderBlend" }
        }
      val getBorderColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getBorderColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBorderColor" }
        }
      val getBorderWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getBorderWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBorderWidth" }
        }
      val getBorderWidthMin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getBorderWidthMin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBorderWidthMin" }
        }
      val getCornerDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getCornerDetail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCornerDetail" }
        }
      val getCornerRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getCornerRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCornerRadius" }
        }
      val getExpandMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getExpandMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExpandMargin" }
        }
      val getShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowColor" }
        }
      val getShadowOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getShadowOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowOffset" }
        }
      val getShadowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "getShadowSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowSize" }
        }
      val isAntiAliased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "isAntiAliased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAntiAliased" }
        }
      val isDrawCenterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "isDrawCenterEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDrawCenterEnabled" }
        }
      val setAaSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setAaSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAaSize" }
        }
      val setAntiAliased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setAntiAliased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAntiAliased" }
        }
      val setBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBgColor" }
        }
      val setBorderBlend: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setBorderBlend".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBorderBlend" }
        }
      val setBorderColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setBorderColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBorderColor" }
        }
      val setBorderWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setBorderWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBorderWidth" }
        }
      val setBorderWidthAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setBorderWidthAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBorderWidthAll" }
        }
      val setCornerDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setCornerDetail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCornerDetail" }
        }
      val setCornerRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setCornerRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCornerRadius" }
        }
      val setCornerRadiusAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setCornerRadiusAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCornerRadiusAll" }
        }
      val setCornerRadiusIndividual: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setCornerRadiusIndividual".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCornerRadiusIndividual" }
        }
      val setDrawCenter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setDrawCenter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawCenter" }
        }
      val setExpandMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setExpandMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandMargin" }
        }
      val setExpandMarginAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setExpandMarginAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandMarginAll" }
        }
      val setExpandMarginIndividual: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setExpandMarginIndividual".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandMarginIndividual" }
        }
      val setShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowColor" }
        }
      val setShadowOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setShadowOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowOffset" }
        }
      val setShadowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
            "setShadowSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowSize" }
        }}
  }
}
