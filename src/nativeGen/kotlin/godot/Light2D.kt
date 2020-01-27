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

open class Light2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this.toVariant())
    TODO()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.get_energy.call(this.toVariant())
    TODO()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.get_height.call(this.toVariant())
    TODO()
  }

  fun getItemCullMask(): Int {
    val _ret = __method_bind.get_item_cull_mask.call(this.toVariant())
    TODO()
  }

  fun getItemShadowCullMask(): Int {
    val _ret = __method_bind.get_item_shadow_cull_mask.call(this.toVariant())
    TODO()
  }

  fun getLayerRangeMax(): Int {
    val _ret = __method_bind.get_layer_range_max.call(this.toVariant())
    TODO()
  }

  fun getLayerRangeMin(): Int {
    val _ret = __method_bind.get_layer_range_min.call(this.toVariant())
    TODO()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.get_mode.call(this.toVariant())
    TODO()
  }

  fun getShadowBufferSize(): Int {
    val _ret = __method_bind.get_shadow_buffer_size.call(this.toVariant())
    TODO()
  }

  fun getShadowColor(): Color {
    val _ret = __method_bind.get_shadow_color.call(this.toVariant())
    TODO()
  }

  fun getShadowFilter(): ShadowFilter {
    val _ret = __method_bind.get_shadow_filter.call(this.toVariant())
    TODO()
  }

  fun getShadowGradientLength(): Float {
    val _ret = __method_bind.get_shadow_gradient_length.call(this.toVariant())
    TODO()
  }

  fun getShadowSmooth(): Float {
    val _ret = __method_bind.get_shadow_smooth.call(this.toVariant())
    TODO()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this.toVariant())
    TODO()
  }

  fun getTextureOffset(): Vector2 {
    val _ret = __method_bind.get_texture_offset.call(this.toVariant())
    TODO()
  }

  fun getTextureScale(): Float {
    val _ret = __method_bind.get_texture_scale.call(this.toVariant())
    TODO()
  }

  fun getZRangeMax(): Int {
    val _ret = __method_bind.get_z_range_max.call(this.toVariant())
    TODO()
  }

  fun getZRangeMin(): Int {
    val _ret = __method_bind.get_z_range_min.call(this.toVariant())
    TODO()
  }

  fun isEditorOnly(): Boolean {
    val _ret = __method_bind.is_editor_only.call(this.toVariant())
    TODO()
  }

  fun isEnabled(): Boolean {
    val _ret = __method_bind.is_enabled.call(this.toVariant())
    TODO()
  }

  fun isShadowEnabled(): Boolean {
    val _ret = __method_bind.is_shadow_enabled.call(this.toVariant())
    TODO()
  }

  fun setColor(color: Color) {
    val _args = VariantArray.new()
    _args.append(color)
    val _ret = __method_bind.set_color.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEditorOnly(editorOnly: Boolean) {
    val _args = VariantArray.new()
    _args.append(editorOnly)
    val _ret = __method_bind.set_editor_only.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEnergy(energy: Float) {
    val _args = VariantArray.new()
    _args.append(energy)
    val _ret = __method_bind.set_energy.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHeight(height: Float) {
    val _args = VariantArray.new()
    _args.append(height)
    val _ret = __method_bind.set_height.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setItemCullMask(itemCullMask: Int) {
    val _args = VariantArray.new()
    _args.append(itemCullMask)
    val _ret = __method_bind.set_item_cull_mask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setItemShadowCullMask(itemShadowCullMask: Int) {
    val _args = VariantArray.new()
    _args.append(itemShadowCullMask)
    val _ret = __method_bind.set_item_shadow_cull_mask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLayerRangeMax(layer: Int) {
    val _args = VariantArray.new()
    _args.append(layer)
    val _ret = __method_bind.set_layer_range_max.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLayerRangeMin(layer: Int) {
    val _args = VariantArray.new()
    _args.append(layer)
    val _ret = __method_bind.set_layer_range_min.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowBufferSize(size: Int) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.set_shadow_buffer_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowColor(shadowColor: Color) {
    val _args = VariantArray.new()
    _args.append(shadowColor)
    val _ret = __method_bind.set_shadow_color.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_shadow_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowFilter(filter: Int) {
    val _args = VariantArray.new()
    _args.append(filter)
    val _ret = __method_bind.set_shadow_filter.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowGradientLength(multiplier: Float) {
    val _args = VariantArray.new()
    _args.append(multiplier)
    val _ret = __method_bind.set_shadow_gradient_length.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowSmooth(smooth: Float) {
    val _args = VariantArray.new()
    _args.append(smooth)
    val _ret = __method_bind.set_shadow_smooth.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTexture(texture: Texture) {
    val _args = VariantArray.new()
    _args.append(texture)
    val _ret = __method_bind.set_texture.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(textureOffset)
    val _ret = __method_bind.set_texture_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTextureScale(textureScale: Float) {
    val _args = VariantArray.new()
    _args.append(textureScale)
    val _ret = __method_bind.set_texture_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setZRangeMax(z: Int) {
    val _args = VariantArray.new()
    _args.append(z)
    val _ret = __method_bind.set_z_range_max.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setZRangeMin(z: Int) {
    val _args = VariantArray.new()
    _args.append(z)
    val _ret = __method_bind.set_z_range_min.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton Light2D" }
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
      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_energy" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_item_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_item_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_cull_mask" }
            }
          }

      val get_item_shadow_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_item_shadow_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_shadow_cull_mask" }
            }
          }

      val get_layer_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_layer_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_range_max" }
            }
          }

      val get_layer_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_layer_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_range_min" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_shadow_buffer_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_buffer_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_buffer_size" }
            }
          }

      val get_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
            }
          }

      val get_shadow_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_filter" }
            }
          }

      val get_shadow_gradient_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_gradient_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_gradient_length" }
            }
          }

      val get_shadow_smooth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_smooth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_smooth" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
            }
          }

      val get_texture_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_texture_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
            }
          }

      val get_z_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_z_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_z_range_max" }
            }
          }

      val get_z_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_z_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_z_range_min" }
            }
          }

      val is_editor_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "is_editor_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editor_only" }
            }
          }

      val is_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val is_shadow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "is_shadow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shadow_enabled" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_editor_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_editor_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editor_only" }
            }
          }

      val set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_energy" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_item_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_item_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_cull_mask" }
            }
          }

      val set_item_shadow_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_item_shadow_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_shadow_cull_mask" }
            }
          }

      val set_layer_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_layer_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_range_max" }
            }
          }

      val set_layer_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_layer_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_range_min" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_shadow_buffer_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_buffer_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_buffer_size" }
            }
          }

      val set_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
            }
          }

      val set_shadow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_enabled" }
            }
          }

      val set_shadow_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_filter" }
            }
          }

      val set_shadow_gradient_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_gradient_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_gradient_length" }
            }
          }

      val set_shadow_smooth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_smooth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_smooth" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
            }
          }

      val set_texture_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_texture_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
            }
          }

      val set_z_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_z_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_z_range_max" }
            }
          }

      val set_z_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_z_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_z_range_min" }
            }
          }
    }
  }
}
