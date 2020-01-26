// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
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
    TODO()
  }

  fun getHAxisStretchMode(): AxisStretchMode {
    TODO()
  }

  fun getMarginSize(margin: Int): Float {
    TODO()
  }

  fun getModulate(): Color {
    TODO()
  }

  fun getNormalMap(): Texture {
    TODO()
  }

  fun getRegionRect(): Rect2 {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun getVAxisStretchMode(): AxisStretchMode {
    TODO()
  }

  fun isDrawCenterEnabled(): Boolean {
    TODO()
  }

  fun setDrawCenter(enable: Boolean) {
    TODO()
  }

  fun setExpandMarginAll(size: Float) {
    TODO()
  }

  fun setExpandMarginIndividual(
    size_left: Float,
    size_top: Float,
    size_right: Float,
    size_bottom: Float
  ) {
    TODO()
  }

  fun setExpandMarginSize(margin: Int, size: Float) {
    TODO()
  }

  fun setHAxisStretchMode(mode: Int) {
    TODO()
  }

  fun setMarginSize(margin: Int, size: Float) {
    TODO()
  }

  fun setModulate(color: Color) {
    TODO()
  }

  fun setNormalMap(normal_map: Texture) {
    TODO()
  }

  fun setRegionRect(region: Rect2) {
    TODO()
  }

  fun setTexture(texture: Texture) {
    TODO()
  }

  fun setVAxisStretchMode(mode: Int) {
    TODO()
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
