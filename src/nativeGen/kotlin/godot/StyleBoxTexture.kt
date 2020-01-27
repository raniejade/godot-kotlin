// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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

open class StyleBoxTexture internal constructor(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  fun getExpandMarginSize(margin: Int): Float {
    val _args = VariantArray.new()
    _args.append(margin)
    val _ret = __method_bind.get_expand_margin_size.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asFloat()
  }

  fun getHAxisStretchMode(): AxisStretchMode {
    val _ret = __method_bind.get_h_axis_stretch_mode.call(this.toVariant())
    return StyleBoxTexture.AxisStretchMode.from(_ret.asInt())
  }

  fun getMarginSize(margin: Int): Float {
    val _args = VariantArray.new()
    _args.append(margin)
    val _ret = __method_bind.get_margin_size.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asFloat()
  }

  fun getModulate(): Color {
    val _ret = __method_bind.get_modulate.call(this.toVariant())
    return _ret.asColor()
  }

  fun getNormalMap(): Texture {
    val _ret = __method_bind.get_normal_map.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getRegionRect(): Rect2 {
    val _ret = __method_bind.get_region_rect.call(this.toVariant())
    return _ret.asRect2()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this.toVariant())
    return _ret.asObject(::Texture)!!
  }

  fun getVAxisStretchMode(): AxisStretchMode {
    val _ret = __method_bind.get_v_axis_stretch_mode.call(this.toVariant())
    return StyleBoxTexture.AxisStretchMode.from(_ret.asInt())
  }

  fun isDrawCenterEnabled(): Boolean {
    val _ret = __method_bind.is_draw_center_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun setDrawCenter(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_draw_center.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setExpandMarginAll(size: Float) {
    val _args = VariantArray.new()
    _args.append(size)
    __method_bind.set_expand_margin_all.call(this.toVariant(), _args.toVariant(), 1)
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
    __method_bind.set_expand_margin_individual.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun setExpandMarginSize(margin: Int, size: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(size)
    __method_bind.set_expand_margin_size.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setHAxisStretchMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_h_axis_stretch_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMarginSize(margin: Int, size: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(size)
    __method_bind.set_margin_size.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setModulate(color: Color) {
    val _args = VariantArray.new()
    _args.append(color)
    __method_bind.set_modulate.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setNormalMap(normalMap: Texture) {
    val _args = VariantArray.new()
    _args.append(normalMap)
    __method_bind.set_normal_map.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRegionRect(region: Rect2) {
    val _args = VariantArray.new()
    _args.append(region)
    __method_bind.set_region_rect.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setTexture(texture: Texture) {
    val _args = VariantArray.new()
    _args.append(texture)
    __method_bind.set_texture.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setVAxisStretchMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_v_axis_stretch_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  enum class AxisStretchMode(
    val value: Int
  ) {
    AXIS_STRETCH_MODE_STRETCH(0),

    AXIS_STRETCH_MODE_TILE(1),

    AXIS_STRETCH_MODE_TILE_FIT(2);

    companion object {
      fun from(value: Int): AxisStretchMode {
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
    val AXIS_STRETCH_MODE_STRETCH: Int = 0

    val AXIS_STRETCH_MODE_TILE: Int = 1

    val AXIS_STRETCH_MODE_TILE_FIT: Int = 2

    fun new(): StyleBoxTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StyleBoxTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StyleBoxTexture = StyleBoxTexture(ptr)
    /**
     * Container for method_bind pointers for StyleBoxTexture
     */
    private object __method_bind {
      val get_expand_margin_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_expand_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_margin_size" }
            }
          }

      val get_h_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_axis_stretch_mode" }
            }
          }

      val get_margin_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin_size" }
            }
          }

      val get_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modulate" }
            }
          }

      val get_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
            }
          }

      val get_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_v_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_axis_stretch_mode" }
            }
          }

      val is_draw_center_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "is_draw_center_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
            }
          }

      val set_draw_center: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_draw_center".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
            }
          }

      val set_expand_margin_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_expand_margin_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_all" }
            }
          }

      val set_expand_margin_individual: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_expand_margin_individual".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_individual" }
            }
          }

      val set_expand_margin_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_expand_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_size" }
            }
          }

      val set_h_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_axis_stretch_mode" }
            }
          }

      val set_margin_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin_size" }
            }
          }

      val set_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_modulate" }
            }
          }

      val set_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
            }
          }

      val set_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_v_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_axis_stretch_mode" }
            }
          }
    }
  }
}
