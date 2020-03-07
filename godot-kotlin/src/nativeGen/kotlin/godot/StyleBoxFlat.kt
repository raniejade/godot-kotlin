// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class StyleBoxFlat(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : StyleBox(null) {
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

  var borderWidthBottom: Int
    get() {
       return getBorderWidth(3) 
    }
    set(value) {
      setBorderWidth(3, value)
    }

  var borderWidthLeft: Int
    get() {
       return getBorderWidth(0) 
    }
    set(value) {
      setBorderWidth(0, value)
    }

  var borderWidthRight: Int
    get() {
       return getBorderWidth(2) 
    }
    set(value) {
      setBorderWidth(2, value)
    }

  var borderWidthTop: Int
    get() {
       return getBorderWidth(1) 
    }
    set(value) {
      setBorderWidth(1, value)
    }

  var cornerDetail: Int
    get() {
       return getCornerDetail() 
    }
    set(value) {
      setCornerDetail(value)
    }

  var cornerRadiusBottomLeft: Int
    get() {
       return getCornerRadius(3) 
    }
    set(value) {
      setCornerRadius(3, value)
    }

  var cornerRadiusBottomRight: Int
    get() {
       return getCornerRadius(2) 
    }
    set(value) {
      setCornerRadius(2, value)
    }

  var cornerRadiusTopLeft: Int
    get() {
       return getCornerRadius(0) 
    }
    set(value) {
      setCornerRadius(0, value)
    }

  var cornerRadiusTopRight: Int
    get() {
       return getCornerRadius(1) 
    }
    set(value) {
      setCornerRadius(1, value)
    }

  var drawCenter: Boolean
    get() {
       return isDrawCenterEnabled() 
    }
    set(value) {
      setDrawCenter(value)
    }

  var expandMarginBottom: Float
    get() {
       return getExpandMargin(3) 
    }
    set(value) {
      setExpandMargin(3, value)
    }

  var expandMarginLeft: Float
    get() {
       return getExpandMargin(0) 
    }
    set(value) {
      setExpandMargin(0, value)
    }

  var expandMarginRight: Float
    get() {
       return getExpandMargin(2) 
    }
    set(value) {
      setExpandMargin(2, value)
    }

  var expandMarginTop: Float
    get() {
       return getExpandMargin(1) 
    }
    set(value) {
      setExpandMargin(1, value)
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for bgColor
   */
  fun bgColor(cb: Color.() -> Unit) {
    val _p = bgColor
    cb(_p)
    bgColor = _p
  }

  /**
   * Specialized setter for borderColor
   */
  fun borderColor(cb: Color.() -> Unit) {
    val _p = borderColor
    cb(_p)
    borderColor = _p
  }

  /**
   * Specialized setter for shadowColor
   */
  fun shadowColor(cb: Color.() -> Unit) {
    val _p = shadowColor
    cb(_p)
    shadowColor = _p
  }

  /**
   * Specialized setter for shadowOffset
   */
  fun shadowOffset(cb: Vector2.() -> Unit) {
    val _p = shadowOffset
    cb(_p)
    shadowOffset = _p
  }

  fun getAaSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAaSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBgColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getBgColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBorderBlend(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBorderBlend.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBorderColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getBorderColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBorderWidth(margin: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBorderWidth.call(self._handle, listOf(margin), _retPtr)
      _ret.value
    }
  }

  fun getBorderWidthMin(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBorderWidthMin.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCornerDetail(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCornerDetail.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCornerRadius(corner: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCornerRadius.call(self._handle, listOf(corner), _retPtr)
      _ret.value
    }
  }

  fun getExpandMargin(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExpandMargin.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getShadowColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getShadowColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getShadowOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getShadowOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getShadowSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShadowSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isAntiAliased(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAntiAliased.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDrawCenterEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawCenterEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAaSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAaSize.call(self._handle, listOf(size), null)
    }
  }

  fun setAntiAliased(antiAliased: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAntiAliased.call(self._handle, listOf(antiAliased), null)
    }
  }

  fun setBgColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBgColor.call(self._handle, listOf(color), null)
    }
  }

  fun setBorderBlend(blend: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBorderBlend.call(self._handle, listOf(blend), null)
    }
  }

  fun setBorderColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBorderColor.call(self._handle, listOf(color), null)
    }
  }

  fun setBorderWidth(margin: Int, width: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(width)
      __method_bind.setBorderWidth.call(self._handle, _args, null)
    }
  }

  fun setBorderWidthAll(width: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBorderWidthAll.call(self._handle, listOf(width), null)
    }
  }

  fun setCornerDetail(detail: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCornerDetail.call(self._handle, listOf(detail), null)
    }
  }

  fun setCornerRadius(corner: Int, radius: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(corner)
      _args.add(radius)
      __method_bind.setCornerRadius.call(self._handle, _args, null)
    }
  }

  fun setCornerRadiusAll(radius: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCornerRadiusAll.call(self._handle, listOf(radius), null)
    }
  }

  fun setCornerRadiusIndividual(
    radiusTopLeft: Int,
    radiusTopRight: Int,
    radiusBottomRight: Int,
    radiusBottomLeft: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(radiusTopLeft)
      _args.add(radiusTopRight)
      _args.add(radiusBottomRight)
      _args.add(radiusBottomLeft)
      __method_bind.setCornerRadiusIndividual.call(self._handle, _args, null)
    }
  }

  fun setDrawCenter(drawCenter: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawCenter.call(self._handle, listOf(drawCenter), null)
    }
  }

  fun setExpandMargin(margin: Int, size: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(size)
      __method_bind.setExpandMargin.call(self._handle, _args, null)
    }
  }

  fun setExpandMarginAll(size: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExpandMarginAll.call(self._handle, listOf(size), null)
    }
  }

  fun setExpandMarginIndividual(
    sizeLeft: Float,
    sizeTop: Float,
    sizeRight: Float,
    sizeBottom: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(sizeLeft)
      _args.add(sizeTop)
      _args.add(sizeRight)
      _args.add(sizeBottom)
      __method_bind.setExpandMarginIndividual.call(self._handle, _args, null)
    }
  }

  fun setShadowColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowColor.call(self._handle, listOf(color), null)
    }
  }

  fun setShadowOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setShadowSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowSize.call(self._handle, listOf(size), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxFlat".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxFlat" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StyleBoxFlat
     */
    private object __method_bind {
      val getAaSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_aa_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_aa_size" }
            }
          }

      val getBgColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bg_color" }
            }
          }

      val getBorderBlend: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_blend".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_blend" }
            }
          }

      val getBorderColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_color" }
            }
          }

      val getBorderWidth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_width" }
            }
          }

      val getBorderWidthMin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_width_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_width_min" }
            }
          }

      val getCornerDetail: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_corner_detail".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_corner_detail" }
            }
          }

      val getCornerRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_corner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_corner_radius" }
            }
          }

      val getExpandMargin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_expand_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_margin" }
            }
          }

      val getShadowColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
            }
          }

      val getShadowOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_shadow_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_offset" }
            }
          }

      val getShadowSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_shadow_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_size" }
            }
          }

      val isAntiAliased: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "is_anti_aliased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_anti_aliased" }
            }
          }

      val isDrawCenterEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "is_draw_center_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
            }
          }

      val setAaSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_aa_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_aa_size" }
            }
          }

      val setAntiAliased: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_anti_aliased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anti_aliased" }
            }
          }

      val setBgColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bg_color" }
            }
          }

      val setBorderBlend: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_blend".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_blend" }
            }
          }

      val setBorderColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_color" }
            }
          }

      val setBorderWidth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_width" }
            }
          }

      val setBorderWidthAll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_width_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_width_all" }
            }
          }

      val setCornerDetail: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_detail".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_detail" }
            }
          }

      val setCornerRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_radius" }
            }
          }

      val setCornerRadiusAll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_radius_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_radius_all" }
            }
          }

      val setCornerRadiusIndividual: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_radius_individual".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_radius_individual" }
            }
          }

      val setDrawCenter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_draw_center".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
            }
          }

      val setExpandMargin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_expand_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin" }
            }
          }

      val setExpandMarginAll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_expand_margin_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_all" }
            }
          }

      val setExpandMarginIndividual: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_expand_margin_individual".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_individual" }
            }
          }

      val setShadowColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
            }
          }

      val setShadowOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_shadow_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_offset" }
            }
          }

      val setShadowSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_shadow_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_size" }
            }
          }
    }
  }
}
