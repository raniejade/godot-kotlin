// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NinePatchRect internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getHAxisStretchMode(): AxisStretchMode {
    TODO()
  }

  fun getPatchMargin(): Int {
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

  fun setDrawCenter() {
    TODO()
  }

  fun setHAxisStretchMode() {
    TODO()
  }

  fun setPatchMargin() {
    TODO()
  }

  fun setRegionRect() {
    TODO()
  }

  fun setTexture() {
    TODO()
  }

  fun setVAxisStretchMode() {
    TODO()
  }

  enum class AxisStretchMode(
    val value: Int
  ) {
    AXIS_STRETCH_MODE_STRETCH(0),

    AXIS_STRETCH_MODE_TILE(1),

    AXIS_STRETCH_MODE_TILE_FIT(2);
  }

  companion object {
    val AXIS_STRETCH_MODE_STRETCH: Int = 0

    val AXIS_STRETCH_MODE_TILE: Int = 1

    val AXIS_STRETCH_MODE_TILE_FIT: Int = 2

    fun new(): NinePatchRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NinePatchRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton NinePatchRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NinePatchRect(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for NinePatchRect
     */
    private object __method_bind {
      val get_h_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_axis_stretch_mode" }
            }
          }

      val get_patch_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_patch_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_patch_margin" }
            }
          }

      val get_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_v_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_axis_stretch_mode" }
            }
          }

      val is_draw_center_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "is_draw_center_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
            }
          }

      val set_draw_center: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_draw_center".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
            }
          }

      val set_h_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_axis_stretch_mode" }
            }
          }

      val set_patch_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_patch_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_patch_margin" }
            }
          }

      val set_region_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_v_axis_stretch_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_axis_stretch_mode" }
            }
          }
    }
  }
}
