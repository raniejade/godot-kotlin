// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TextureProgress internal constructor(
  _handle: COpaquePointer
) : Range(_handle) {
  enum class FillMode(
    val value: Int
  ) {
    FILL_LEFT_TO_RIGHT(0),

    FILL_RIGHT_TO_LEFT(1),

    FILL_TOP_TO_BOTTOM(2),

    FILL_BOTTOM_TO_TOP(3),

    FILL_CLOCKWISE(4),

    FILL_COUNTER_CLOCKWISE(5),

    FILL_BILINEAR_LEFT_AND_RIGHT(6),

    FILL_BILINEAR_TOP_AND_BOTTOM(7),

    FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE(8);
  }

  companion object {
    val FILL_BILINEAR_LEFT_AND_RIGHT: Int = 6

    val FILL_BILINEAR_TOP_AND_BOTTOM: Int = 7

    val FILL_BOTTOM_TO_TOP: Int = 3

    val FILL_CLOCKWISE: Int = 4

    val FILL_CLOCKWISE_AND_COUNTER_CLOCKWISE: Int = 8

    val FILL_COUNTER_CLOCKWISE: Int = 5

    val FILL_LEFT_TO_RIGHT: Int = 0

    val FILL_RIGHT_TO_LEFT: Int = 1

    val FILL_TOP_TO_BOTTOM: Int = 2

    fun new(): TextureProgress = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureProgress".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TextureProgress" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureProgress(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for TextureProgress
     */
    private object __method_bind {
      val get_fill_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_fill_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fill_degrees" }
            }
          }

      val get_fill_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_fill_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fill_mode" }
            }
          }

      val get_nine_patch_stretch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_nine_patch_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_nine_patch_stretch" }
            }
          }

      val get_over_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_over_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_over_texture" }
            }
          }

      val get_progress_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_progress_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_progress_texture" }
            }
          }

      val get_radial_center_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_radial_center_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radial_center_offset" }
            }
          }

      val get_radial_initial_angle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_radial_initial_angle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radial_initial_angle" }
            }
          }

      val get_stretch_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_stretch_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stretch_margin" }
            }
          }

      val get_tint_over: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_tint_over".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tint_over" }
            }
          }

      val get_tint_progress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_tint_progress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tint_progress" }
            }
          }

      val get_tint_under: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_tint_under".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tint_under" }
            }
          }

      val get_under_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "get_under_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_under_texture" }
            }
          }

      val set_fill_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_fill_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fill_degrees" }
            }
          }

      val set_fill_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_fill_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fill_mode" }
            }
          }

      val set_nine_patch_stretch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_nine_patch_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_nine_patch_stretch" }
            }
          }

      val set_over_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_over_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_over_texture" }
            }
          }

      val set_progress_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_progress_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_progress_texture" }
            }
          }

      val set_radial_center_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_radial_center_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radial_center_offset" }
            }
          }

      val set_radial_initial_angle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_radial_initial_angle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radial_initial_angle" }
            }
          }

      val set_stretch_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_stretch_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch_margin" }
            }
          }

      val set_tint_over: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_tint_over".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tint_over" }
            }
          }

      val set_tint_progress: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_tint_progress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tint_progress" }
            }
          }

      val set_tint_under: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_tint_under".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tint_under" }
            }
          }

      val set_under_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
              "set_under_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_under_texture" }
            }
          }
    }
  }
}
