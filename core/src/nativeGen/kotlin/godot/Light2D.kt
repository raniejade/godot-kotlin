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
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getHeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getItemCullMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getItemCullMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getItemShadowCullMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getItemShadowCullMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLayerRangeMax(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLayerRangeMax.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLayerRangeMin(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLayerRangeMin.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMode(): Mode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMode.call(self._handle, emptyList(), _retPtr)
      Light2D.Mode.from(_ret.value)
    }
  }

  fun getShadowBufferSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShadowBufferSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getShadowFilter(): ShadowFilter {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShadowFilter.call(self._handle, emptyList(), _retPtr)
      Light2D.ShadowFilter.from(_ret.value)
    }
  }

  fun getShadowGradientLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShadowGradientLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getShadowSmooth(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShadowSmooth.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getTextureOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getTextureOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTextureScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextureScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getZRangeMax(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getZRangeMax.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getZRangeMin(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getZRangeMin.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEditorOnly(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditorOnly.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShadowEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShadowEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColor.call(self._handle, listOf(color), null)
    }
  }

  fun setEditorOnly(editorOnly: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditorOnly.call(self._handle, listOf(editorOnly), null)
    }
  }

  fun setEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setHeight(height: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHeight.call(self._handle, listOf(height), null)
    }
  }

  fun setItemCullMask(itemCullMask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setItemCullMask.call(self._handle, listOf(itemCullMask), null)
    }
  }

  fun setItemShadowCullMask(itemShadowCullMask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setItemShadowCullMask.call(self._handle, listOf(itemShadowCullMask), null)
    }
  }

  fun setLayerRangeMax(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLayerRangeMax.call(self._handle, listOf(layer), null)
    }
  }

  fun setLayerRangeMin(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLayerRangeMin.call(self._handle, listOf(layer), null)
    }
  }

  fun setMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setShadowBufferSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowBufferSize.call(self._handle, listOf(size), null)
    }
  }

  fun setShadowColor(shadowColor: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowColor.call(self._handle, listOf(shadowColor), null)
    }
  }

  fun setShadowEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setShadowFilter(filter: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowFilter.call(self._handle, listOf(filter), null)
    }
  }

  fun setShadowGradientLength(multiplier: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowGradientLength.call(self._handle, listOf(multiplier), null)
    }
  }

  fun setShadowSmooth(smooth: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowSmooth.call(self._handle, listOf(smooth), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureOffset.call(self._handle, listOf(textureOffset), null)
    }
  }

  fun setTextureScale(textureScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureScale.call(self._handle, listOf(textureScale), null)
    }
  }

  fun setZRangeMax(z: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZRangeMax.call(self._handle, listOf(z), null)
    }
  }

  fun setZRangeMin(z: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZRangeMin.call(self._handle, listOf(z), null)
    }
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
