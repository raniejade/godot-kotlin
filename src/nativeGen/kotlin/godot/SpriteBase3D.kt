// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
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

open class SpriteBase3D internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  fun imUpdate() {
    TODO()
  }

  fun queueUpdate() {
    TODO()
  }

  fun generateTriangleMesh(): TriangleMesh {
    TODO()
  }

  fun getAlphaCutMode(): SpriteBase3D.AlphaCutMode {
    TODO()
  }

  fun getAxis(): Vector3.Axis {
    TODO()
  }

  fun getDrawFlag(): Boolean {
    TODO()
  }

  fun getItemRect(): Rect2 {
    TODO()
  }

  fun getModulate(): Color {
    TODO()
  }

  fun getOffset(): Vector2 {
    TODO()
  }

  fun getOpacity(): Float {
    TODO()
  }

  fun getPixelSize(): Float {
    TODO()
  }

  fun isCentered(): Boolean {
    TODO()
  }

  fun isFlippedH(): Boolean {
    TODO()
  }

  fun isFlippedV(): Boolean {
    TODO()
  }

  fun setAlphaCutMode() {
    TODO()
  }

  fun setAxis() {
    TODO()
  }

  fun setCentered() {
    TODO()
  }

  fun setDrawFlag() {
    TODO()
  }

  fun setFlipH() {
    TODO()
  }

  fun setFlipV() {
    TODO()
  }

  fun setModulate() {
    TODO()
  }

  fun setOffset() {
    TODO()
  }

  fun setOpacity() {
    TODO()
  }

  fun setPixelSize() {
    TODO()
  }

  enum class DrawFlags(
    val value: Int
  ) {
    FLAG_TRANSPARENT(0),

    FLAG_SHADED(1),

    FLAG_DOUBLE_SIDED(2),

    FLAG_MAX(3);
  }

  enum class AlphaCutMode(
    val value: Int
  ) {
    ALPHA_CUT_DISABLED(0),

    ALPHA_CUT_DISCARD(1),

    ALPHA_CUT_OPAQUE_PREPASS(2);
  }

  companion object {
    val ALPHA_CUT_DISABLED: Int = 0

    val ALPHA_CUT_DISCARD: Int = 1

    val ALPHA_CUT_OPAQUE_PREPASS: Int = 2

    val FLAG_DOUBLE_SIDED: Int = 2

    val FLAG_MAX: Int = 3

    val FLAG_SHADED: Int = 1

    val FLAG_TRANSPARENT: Int = 0

    /**
     * Container for method_bind pointers for SpriteBase3D
     */
    private object __method_bind {
      val _im_update: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "_im_update".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _im_update" }
            }
          }

      val _queue_update: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "_queue_update".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _queue_update" }
            }
          }

      val generate_triangle_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "generate_triangle_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_triangle_mesh" }
            }
          }

      val get_alpha_cut_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_alpha_cut_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_alpha_cut_mode" }
            }
          }

      val get_axis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_axis" }
            }
          }

      val get_draw_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_draw_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_flag" }
            }
          }

      val get_item_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_item_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_rect" }
            }
          }

      val get_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modulate" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_opacity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_opacity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_opacity" }
            }
          }

      val get_pixel_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "get_pixel_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pixel_size" }
            }
          }

      val is_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "is_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_centered" }
            }
          }

      val is_flipped_h: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "is_flipped_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
            }
          }

      val is_flipped_v: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "is_flipped_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
            }
          }

      val set_alpha_cut_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_alpha_cut_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_alpha_cut_mode" }
            }
          }

      val set_axis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_axis" }
            }
          }

      val set_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_centered" }
            }
          }

      val set_draw_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_draw_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_flag" }
            }
          }

      val set_flip_h: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_flip_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
            }
          }

      val set_flip_v: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_flip_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
            }
          }

      val set_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_modulate" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_opacity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_opacity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_opacity" }
            }
          }

      val set_pixel_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
              "set_pixel_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pixel_size" }
            }
          }
    }
  }
}
