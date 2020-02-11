// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Light2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var editorOnly: Boolean
    get() {
       return isEditorOnly() 
    }
    set(value) {
      setEditorOnly(value)
    }

  var enabled: Boolean
    get() {
       return isEnabled() 
    }
    set(value) {
      setEnabled(value)
    }

  var energy: Float
    get() {
       return getEnergy() 
    }
    set(value) {
      setEnergy(value)
    }

  var mode: Mode
    get() {
       return getMode() 
    }
    set(value) {
      setMode(value.value)
    }

  var offset: Vector2
    get() {
       return getTextureOffset() 
    }
    set(value) {
      setTextureOffset(value)
    }

  var rangeHeight: Float
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var rangeItemCullMask: Int
    get() {
       return getItemCullMask() 
    }
    set(value) {
      setItemCullMask(value)
    }

  var rangeLayerMax: Int
    get() {
       return getLayerRangeMax() 
    }
    set(value) {
      setLayerRangeMax(value)
    }

  var rangeLayerMin: Int
    get() {
       return getLayerRangeMin() 
    }
    set(value) {
      setLayerRangeMin(value)
    }

  var rangeZMax: Int
    get() {
       return getZRangeMax() 
    }
    set(value) {
      setZRangeMax(value)
    }

  var rangeZMin: Int
    get() {
       return getZRangeMin() 
    }
    set(value) {
      setZRangeMin(value)
    }

  var shadowBufferSize: Int
    get() {
       return getShadowBufferSize() 
    }
    set(value) {
      setShadowBufferSize(value)
    }

  var shadowColor: Color
    get() {
       return getShadowColor() 
    }
    set(value) {
      setShadowColor(value)
    }

  var shadowEnabled: Boolean
    get() {
       return isShadowEnabled() 
    }
    set(value) {
      setShadowEnabled(value)
    }

  var shadowFilter: ShadowFilter
    get() {
       return getShadowFilter() 
    }
    set(value) {
      setShadowFilter(value.value)
    }

  var shadowFilterSmooth: Float
    get() {
       return getShadowSmooth() 
    }
    set(value) {
      setShadowSmooth(value)
    }

  var shadowGradientLength: Float
    get() {
       return getShadowGradientLength() 
    }
    set(value) {
      setShadowGradientLength(value)
    }

  var shadowItemCullMask: Int
    get() {
       return getItemShadowCullMask() 
    }
    set(value) {
      setItemShadowCullMask(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var textureScale: Float
    get() {
       return getTextureScale() 
    }
    set(value) {
      setTextureScale(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  /**
   * Specialized setter for shadowColor
   */
  fun shadowColor(cb: Color.() -> Unit) {
    val _p = shadowColor
    cb(_p)
    shadowColor = _p
  }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.getEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getItemCullMask(): Int {
    val _ret = __method_bind.getItemCullMask.call(this._handle)
    return _ret.asInt()
  }

  fun getItemShadowCullMask(): Int {
    val _ret = __method_bind.getItemShadowCullMask.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerRangeMax(): Int {
    val _ret = __method_bind.getLayerRangeMax.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerRangeMin(): Int {
    val _ret = __method_bind.getLayerRangeMin.call(this._handle)
    return _ret.asInt()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return Light2D.Mode.from(_ret.asInt())
  }

  fun getShadowBufferSize(): Int {
    val _ret = __method_bind.getShadowBufferSize.call(this._handle)
    return _ret.asInt()
  }

  fun getShadowColor(): Color {
    val _ret = __method_bind.getShadowColor.call(this._handle)
    return _ret.asColor()
  }

  fun getShadowFilter(): ShadowFilter {
    val _ret = __method_bind.getShadowFilter.call(this._handle)
    return Light2D.ShadowFilter.from(_ret.asInt())
  }

  fun getShadowGradientLength(): Float {
    val _ret = __method_bind.getShadowGradientLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getShadowSmooth(): Float {
    val _ret = __method_bind.getShadowSmooth.call(this._handle)
    return _ret.asFloat()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.toAny() as Texture
  }

  fun getTextureOffset(): Vector2 {
    val _ret = __method_bind.getTextureOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getTextureScale(): Float {
    val _ret = __method_bind.getTextureScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getZRangeMax(): Int {
    val _ret = __method_bind.getZRangeMax.call(this._handle)
    return _ret.asInt()
  }

  fun getZRangeMin(): Int {
    val _ret = __method_bind.getZRangeMin.call(this._handle)
    return _ret.asInt()
  }

  fun isEditorOnly(): Boolean {
    val _ret = __method_bind.isEditorOnly.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.isEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShadowEnabled(): Boolean {
    val _ret = __method_bind.isShadowEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setColor(color: Color) {
    val _arg = Variant(color)
    __method_bind.setColor.call(this._handle, listOf(_arg))
  }

  fun setEditorOnly(editorOnly: Boolean) {
    val _arg = Variant(editorOnly)
    __method_bind.setEditorOnly.call(this._handle, listOf(_arg))
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setEnabled.call(this._handle, listOf(_arg))
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant(energy)
    __method_bind.setEnergy.call(this._handle, listOf(_arg))
  }

  fun setHeight(height: Float) {
    val _arg = Variant(height)
    __method_bind.setHeight.call(this._handle, listOf(_arg))
  }

  fun setItemCullMask(itemCullMask: Int) {
    val _arg = Variant(itemCullMask)
    __method_bind.setItemCullMask.call(this._handle, listOf(_arg))
  }

  fun setItemShadowCullMask(itemShadowCullMask: Int) {
    val _arg = Variant(itemShadowCullMask)
    __method_bind.setItemShadowCullMask.call(this._handle, listOf(_arg))
  }

  fun setLayerRangeMax(layer: Int) {
    val _arg = Variant(layer)
    __method_bind.setLayerRangeMax.call(this._handle, listOf(_arg))
  }

  fun setLayerRangeMin(layer: Int) {
    val _arg = Variant(layer)
    __method_bind.setLayerRangeMin.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setShadowBufferSize(size: Int) {
    val _arg = Variant(size)
    __method_bind.setShadowBufferSize.call(this._handle, listOf(_arg))
  }

  fun setShadowColor(shadowColor: Color) {
    val _arg = Variant(shadowColor)
    __method_bind.setShadowColor.call(this._handle, listOf(_arg))
  }

  fun setShadowEnabled(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setShadowEnabled.call(this._handle, listOf(_arg))
  }

  fun setShadowFilter(filter: Int) {
    val _arg = Variant(filter)
    __method_bind.setShadowFilter.call(this._handle, listOf(_arg))
  }

  fun setShadowGradientLength(multiplier: Float) {
    val _arg = Variant(multiplier)
    __method_bind.setShadowGradientLength.call(this._handle, listOf(_arg))
  }

  fun setShadowSmooth(smooth: Float) {
    val _arg = Variant(smooth)
    __method_bind.setShadowSmooth.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _arg = Variant(textureOffset)
    __method_bind.setTextureOffset.call(this._handle, listOf(_arg))
  }

  fun setTextureScale(textureScale: Float) {
    val _arg = Variant(textureScale)
    __method_bind.setTextureScale.call(this._handle, listOf(_arg))
  }

  fun setZRangeMax(z: Int) {
    val _arg = Variant(z)
    __method_bind.setZRangeMax.call(this._handle, listOf(_arg))
  }

  fun setZRangeMin(z: Int) {
    val _arg = Variant(z)
    __method_bind.setZRangeMin.call(this._handle, listOf(_arg))
  }

  enum class ShadowFilter(
    val value: Int
  ) {
    NONE(0),

    PCF3(1),

    PCF5(2),

    PCF7(3),

    PCF9(4),

    PCF13(5);

    companion object {
      fun from(value: Int): ShadowFilter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Mode(
    val value: Int
  ) {
    ADD(0),

    SUB(1),

    MIX(2),

    MASK(3);

    companion object {
      fun from(value: Int): Mode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Light2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Light2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Light2D
     */
    private object __method_bind {
      val getColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getItemCullMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_item_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_cull_mask" }
        }
      val getItemShadowCullMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_item_shadow_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_shadow_cull_mask" }
        }
      val getLayerRangeMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_layer_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_range_max" }
        }
      val getLayerRangeMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_layer_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_range_min" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getShadowBufferSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_buffer_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_buffer_size" }
        }
      val getShadowColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
        }
      val getShadowFilter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_filter" }
        }
      val getShadowGradientLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_gradient_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_gradient_length" }
        }
      val getShadowSmooth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_smooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_smooth" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTextureOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
        }
      val getTextureScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
        }
      val getZRangeMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_z_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_z_range_max" }
        }
      val getZRangeMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_z_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_z_range_min" }
        }
      val isEditorOnly: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "is_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editor_only" }
        }
      val isEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabled" }
        }
      val isShadowEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "is_shadow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shadow_enabled" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setEditorOnly: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editor_only" }
        }
      val setEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val setItemCullMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_item_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_cull_mask" }
        }
      val setItemShadowCullMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_item_shadow_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_shadow_cull_mask" }
        }
      val setLayerRangeMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_layer_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_range_max" }
        }
      val setLayerRangeMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_layer_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_range_min" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setShadowBufferSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_buffer_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_buffer_size" }
        }
      val setShadowColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
        }
      val setShadowEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_enabled" }
        }
      val setShadowFilter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_filter" }
        }
      val setShadowGradientLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_gradient_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_gradient_length" }
        }
      val setShadowSmooth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_smooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_smooth" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTextureOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
        }
      val setTextureScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
        }
      val setZRangeMax: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_z_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_range_max" }
        }
      val setZRangeMin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_z_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_range_min" }
        }}
  }
}
