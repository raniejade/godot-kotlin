// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Texture internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun draw(
    canvas_item: RID,
    position: Vector2,
    modulate: Color,
    transpose: Boolean,
    normal_map: Texture
  ) {
    TODO()
  }

  fun drawRect(
    canvas_item: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color,
    transpose: Boolean,
    normal_map: Texture
  ) {
    TODO()
  }

  fun drawRectRegion(
    canvas_item: RID,
    rect: Rect2,
    src_rect: Rect2,
    modulate: Color,
    transpose: Boolean,
    normal_map: Texture,
    clip_uv: Boolean
  ) {
    TODO()
  }

  fun getData(): Image {
    TODO()
  }

  fun getFlags(): Int {
    TODO()
  }

  fun getHeight(): Int {
    TODO()
  }

  fun getSize(): Vector2 {
    TODO()
  }

  fun getWidth(): Int {
    TODO()
  }

  fun hasAlpha(): Boolean {
    TODO()
  }

  fun setFlags(flags: Int) {
    TODO()
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(7),

    FLAG_ANISOTROPIC_FILTER(8),

    FLAG_CONVERT_TO_LINEAR(16),

    FLAG_MIRRORED_REPEAT(32),

    FLAG_VIDEO_SURFACE(2048);

    companion object {
      fun from(value: Int): Flags {
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
    val FLAGS_DEFAULT: Int = 7

    val FLAG_ANISOTROPIC_FILTER: Int = 8

    val FLAG_CONVERT_TO_LINEAR: Int = 16

    val FLAG_FILTER: Int = 4

    val FLAG_MIPMAPS: Int = 1

    val FLAG_MIRRORED_REPEAT: Int = 32

    val FLAG_REPEAT: Int = 2

    val FLAG_VIDEO_SURFACE: Int = 2048

    /**
     * Container for method_bind pointers for Texture
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw" }
            }
          }

      val draw_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "draw_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_rect" }
            }
          }

      val draw_rect_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "draw_rect_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_rect_region" }
            }
          }

      val get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val get_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "get_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flags" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val has_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "has_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_alpha" }
            }
          }

      val set_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
              "set_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flags" }
            }
          }
    }
  }
}
