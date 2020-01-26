// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
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

open class StyleBoxFlat internal constructor(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  fun getAaSize(): Int {
    TODO()
  }

  fun getBgColor(): Color {
    TODO()
  }

  fun getBorderBlend(): Boolean {
    TODO()
  }

  fun getBorderColor(): Color {
    TODO()
  }

  fun getBorderWidth(): Int {
    TODO()
  }

  fun getBorderWidthMin(): Int {
    TODO()
  }

  fun getCornerDetail(): Int {
    TODO()
  }

  fun getCornerRadius(): Int {
    TODO()
  }

  fun getExpandMargin(): Float {
    TODO()
  }

  fun getShadowColor(): Color {
    TODO()
  }

  fun getShadowOffset(): Vector2 {
    TODO()
  }

  fun getShadowSize(): Int {
    TODO()
  }

  fun isAntiAliased(): Boolean {
    TODO()
  }

  fun isDrawCenterEnabled(): Boolean {
    TODO()
  }

  fun setAaSize() {
    TODO()
  }

  fun setAntiAliased() {
    TODO()
  }

  fun setBgColor() {
    TODO()
  }

  fun setBorderBlend() {
    TODO()
  }

  fun setBorderColor() {
    TODO()
  }

  fun setBorderWidth() {
    TODO()
  }

  fun setBorderWidthAll() {
    TODO()
  }

  fun setCornerDetail() {
    TODO()
  }

  fun setCornerRadius() {
    TODO()
  }

  fun setCornerRadiusAll() {
    TODO()
  }

  fun setCornerRadiusIndividual() {
    TODO()
  }

  fun setDrawCenter() {
    TODO()
  }

  fun setExpandMargin() {
    TODO()
  }

  fun setExpandMarginAll() {
    TODO()
  }

  fun setExpandMarginIndividual() {
    TODO()
  }

  fun setShadowColor() {
    TODO()
  }

  fun setShadowOffset() {
    TODO()
  }

  fun setShadowSize() {
    TODO()
  }

  companion object {
    fun new(): StyleBoxFlat = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxFlat".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StyleBoxFlat" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxFlat(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for StyleBoxFlat
     */
    private object __method_bind {
      val get_aa_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_aa_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_aa_size" }
            }
          }

      val get_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bg_color" }
            }
          }

      val get_border_blend: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_blend".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_blend" }
            }
          }

      val get_border_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_color" }
            }
          }

      val get_border_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_width" }
            }
          }

      val get_border_width_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_border_width_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_border_width_min" }
            }
          }

      val get_corner_detail: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_corner_detail".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_corner_detail" }
            }
          }

      val get_corner_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_corner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_corner_radius" }
            }
          }

      val get_expand_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_expand_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_margin" }
            }
          }

      val get_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
            }
          }

      val get_shadow_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_shadow_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_offset" }
            }
          }

      val get_shadow_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "get_shadow_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_size" }
            }
          }

      val is_anti_aliased: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "is_anti_aliased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_anti_aliased" }
            }
          }

      val is_draw_center_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "is_draw_center_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
            }
          }

      val set_aa_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_aa_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_aa_size" }
            }
          }

      val set_anti_aliased: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_anti_aliased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anti_aliased" }
            }
          }

      val set_bg_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bg_color" }
            }
          }

      val set_border_blend: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_blend".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_blend" }
            }
          }

      val set_border_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_color" }
            }
          }

      val set_border_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_width" }
            }
          }

      val set_border_width_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_border_width_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_border_width_all" }
            }
          }

      val set_corner_detail: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_detail".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_detail" }
            }
          }

      val set_corner_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_radius" }
            }
          }

      val set_corner_radius_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_radius_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_radius_all" }
            }
          }

      val set_corner_radius_individual: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_corner_radius_individual".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_corner_radius_individual" }
            }
          }

      val set_draw_center: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_draw_center".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
            }
          }

      val set_expand_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_expand_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin" }
            }
          }

      val set_expand_margin_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_expand_margin_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_all" }
            }
          }

      val set_expand_margin_individual: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_expand_margin_individual".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_individual" }
            }
          }

      val set_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
            }
          }

      val set_shadow_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_shadow_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_offset" }
            }
          }

      val set_shadow_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxFlat".cstr.ptr,
              "set_shadow_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_size" }
            }
          }
    }
  }
}
