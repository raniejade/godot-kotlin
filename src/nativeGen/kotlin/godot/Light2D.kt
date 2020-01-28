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

open class Light2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this._handle)
    return _ret.asColor()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.get_energy.call(this._handle)
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.get_height.call(this._handle)
    return _ret.asFloat()
  }

  fun getItemCullMask(): Int {
    val _ret = __method_bind.get_item_cull_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getItemShadowCullMask(): Int {
    val _ret = __method_bind.get_item_shadow_cull_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerRangeMax(): Int {
    val _ret = __method_bind.get_layer_range_max.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerRangeMin(): Int {
    val _ret = __method_bind.get_layer_range_min.call(this._handle)
    return _ret.asInt()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.get_mode.call(this._handle)
    return Light2D.Mode.from(_ret.asInt())
  }

  fun getShadowBufferSize(): Int {
    val _ret = __method_bind.get_shadow_buffer_size.call(this._handle)
    return _ret.asInt()
  }

  fun getShadowColor(): Color {
    val _ret = __method_bind.get_shadow_color.call(this._handle)
    return _ret.asColor()
  }

  fun getShadowFilter(): ShadowFilter {
    val _ret = __method_bind.get_shadow_filter.call(this._handle)
    return Light2D.ShadowFilter.from(_ret.asInt())
  }

  fun getShadowGradientLength(): Float {
    val _ret = __method_bind.get_shadow_gradient_length.call(this._handle)
    return _ret.asFloat()
  }

  fun getShadowSmooth(): Float {
    val _ret = __method_bind.get_shadow_smooth.call(this._handle)
    return _ret.asFloat()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureOffset(): Vector2 {
    val _ret = __method_bind.get_texture_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun getTextureScale(): Float {
    val _ret = __method_bind.get_texture_scale.call(this._handle)
    return _ret.asFloat()
  }

  fun getZRangeMax(): Int {
    val _ret = __method_bind.get_z_range_max.call(this._handle)
    return _ret.asInt()
  }

  fun getZRangeMin(): Int {
    val _ret = __method_bind.get_z_range_min.call(this._handle)
    return _ret.asInt()
  }

  fun isEditorOnly(): Boolean {
    val _ret = __method_bind.is_editor_only.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.is_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShadowEnabled(): Boolean {
    val _ret = __method_bind.is_shadow_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_color.call(this._handle, _arg, 1)
  }

  fun setEditorOnly(editorOnly: Boolean) {
    val _arg = Variant.new(editorOnly)
    __method_bind.set_editor_only.call(this._handle, _arg, 1)
  }

  fun setEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_enabled.call(this._handle, _arg, 1)
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.set_energy.call(this._handle, _arg, 1)
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.set_height.call(this._handle, _arg, 1)
  }

  fun setItemCullMask(itemCullMask: Int) {
    val _arg = Variant.new(itemCullMask)
    __method_bind.set_item_cull_mask.call(this._handle, _arg, 1)
  }

  fun setItemShadowCullMask(itemShadowCullMask: Int) {
    val _arg = Variant.new(itemShadowCullMask)
    __method_bind.set_item_shadow_cull_mask.call(this._handle, _arg, 1)
  }

  fun setLayerRangeMax(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.set_layer_range_max.call(this._handle, _arg, 1)
  }

  fun setLayerRangeMin(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.set_layer_range_min.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_mode.call(this._handle, _arg, 1)
  }

  fun setShadowBufferSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.set_shadow_buffer_size.call(this._handle, _arg, 1)
  }

  fun setShadowColor(shadowColor: Color) {
    val _arg = Variant.new(shadowColor)
    __method_bind.set_shadow_color.call(this._handle, _arg, 1)
  }

  fun setShadowEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_shadow_enabled.call(this._handle, _arg, 1)
  }

  fun setShadowFilter(filter: Int) {
    val _arg = Variant.new(filter)
    __method_bind.set_shadow_filter.call(this._handle, _arg, 1)
  }

  fun setShadowGradientLength(multiplier: Float) {
    val _arg = Variant.new(multiplier)
    __method_bind.set_shadow_gradient_length.call(this._handle, _arg, 1)
  }

  fun setShadowSmooth(smooth: Float) {
    val _arg = Variant.new(smooth)
    __method_bind.set_shadow_smooth.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_texture.call(this._handle, _arg, 1)
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _arg = Variant.new(textureOffset)
    __method_bind.set_texture_offset.call(this._handle, _arg, 1)
  }

  fun setTextureScale(textureScale: Float) {
    val _arg = Variant.new(textureScale)
    __method_bind.set_texture_scale.call(this._handle, _arg, 1)
  }

  fun setZRangeMax(z: Int) {
    val _arg = Variant.new(z)
    __method_bind.set_z_range_max.call(this._handle, _arg, 1)
  }

  fun setZRangeMin(z: Int) {
    val _arg = Variant.new(z)
    __method_bind.set_z_range_min.call(this._handle, _arg, 1)
  }

  enum class ShadowFilter(
    val value: Int
  ) {
    SHADOW_FILTER_NONE(0),

    SHADOW_FILTER_PCF3(1),

    SHADOW_FILTER_PCF5(2),

    SHADOW_FILTER_PCF7(3),

    SHADOW_FILTER_PCF9(4),

    SHADOW_FILTER_PCF13(5);

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
    MODE_ADD(0),

    MODE_SUB(1),

    MODE_MIX(2),

    MODE_MASK(3);

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
    val MODE_ADD: Int = 0

    val MODE_MASK: Int = 3

    val MODE_MIX: Int = 2

    val MODE_SUB: Int = 1

    val SHADOW_FILTER_NONE: Int = 0

    val SHADOW_FILTER_PCF13: Int = 5

    val SHADOW_FILTER_PCF3: Int = 1

    val SHADOW_FILTER_PCF5: Int = 2

    val SHADOW_FILTER_PCF7: Int = 3

    val SHADOW_FILTER_PCF9: Int = 4

    fun new(): Light2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Light2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Light2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Light2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Light2D = Light2D(ptr)
    /**
     * Container for method_bind pointers for Light2D
     */
    private object __method_bind {
      val get_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val get_energy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val get_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val get_item_cull_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_item_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_cull_mask" }
        }
      val get_item_shadow_cull_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_item_shadow_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_shadow_cull_mask" }
        }
      val get_layer_range_max: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_layer_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_range_max" }
        }
      val get_layer_range_min: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_layer_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_range_min" }
        }
      val get_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val get_shadow_buffer_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_buffer_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_buffer_size" }
        }
      val get_shadow_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
        }
      val get_shadow_filter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_filter" }
        }
      val get_shadow_gradient_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_gradient_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_gradient_length" }
        }
      val get_shadow_smooth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_shadow_smooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_smooth" }
        }
      val get_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val get_texture_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
        }
      val get_texture_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
        }
      val get_z_range_max: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_z_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_z_range_max" }
        }
      val get_z_range_min: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "get_z_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_z_range_min" }
        }
      val is_editor_only: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "is_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editor_only" }
        }
      val is_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabled" }
        }
      val is_shadow_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "is_shadow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shadow_enabled" }
        }
      val set_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val set_editor_only: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_editor_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editor_only" }
        }
      val set_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled" }
        }
      val set_energy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val set_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val set_item_cull_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_item_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_cull_mask" }
        }
      val set_item_shadow_cull_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_item_shadow_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_item_shadow_cull_mask" }
        }
      val set_layer_range_max: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_layer_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_range_max" }
        }
      val set_layer_range_min: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_layer_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_range_min" }
        }
      val set_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val set_shadow_buffer_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_buffer_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_buffer_size" }
        }
      val set_shadow_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
        }
      val set_shadow_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_enabled" }
        }
      val set_shadow_filter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_filter" }
        }
      val set_shadow_gradient_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_gradient_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_gradient_length" }
        }
      val set_shadow_smooth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_shadow_smooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_smooth" }
        }
      val set_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val set_texture_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
        }
      val set_texture_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
        }
      val set_z_range_max: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_z_range_max".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_range_max" }
        }
      val set_z_range_min: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
            "set_z_range_min".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_z_range_min" }
        }}
  }
}
