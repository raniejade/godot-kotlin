// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
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
  fun generateTriangleMesh(): TriangleMesh {
    val _ret = __method_bind.generate_triangle_mesh.call(this.toVariant())
    return _ret.asObject(::TriangleMesh)!!
  }

  fun getAlphaCutMode(): AlphaCutMode {
    val _ret = __method_bind.get_alpha_cut_mode.call(this.toVariant())
    return SpriteBase3D.AlphaCutMode.from(_ret.asInt())
  }

  fun getAxis(): Vector3.Axis {
    val _ret = __method_bind.get_axis.call(this.toVariant())
    return Vector3.Axis.from(_ret.asInt())
  }

  fun getDrawFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.get_draw_flag.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getItemRect(): Rect2 {
    val _ret = __method_bind.get_item_rect.call(this.toVariant())
    return _ret.asRect2()
  }

  fun getModulate(): Color {
    val _ret = __method_bind.get_modulate.call(this.toVariant())
    return _ret.asColor()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getOpacity(): Float {
    val _ret = __method_bind.get_opacity.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPixelSize(): Float {
    val _ret = __method_bind.get_pixel_size.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isCentered(): Boolean {
    val _ret = __method_bind.is_centered.call(this.toVariant())
    return _ret.asBool()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.is_flipped_h.call(this.toVariant())
    return _ret.asBool()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.is_flipped_v.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAlphaCutMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_alpha_cut_mode.call(this.toVariant(), _arg, 1)
  }

  fun setAxis(axis: Int) {
    val _arg = Variant.new(axis)
    __method_bind.set_axis.call(this.toVariant(), _arg, 1)
  }

  fun setCentered(centered: Boolean) {
    val _arg = Variant.new(centered)
    __method_bind.set_centered.call(this.toVariant(), _arg, 1)
  }

  fun setDrawFlag(flag: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enabled)
    __method_bind.set_draw_flag.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setFlipH(flipH: Boolean) {
    val _arg = Variant.new(flipH)
    __method_bind.set_flip_h.call(this.toVariant(), _arg, 1)
  }

  fun setFlipV(flipV: Boolean) {
    val _arg = Variant.new(flipV)
    __method_bind.set_flip_v.call(this.toVariant(), _arg, 1)
  }

  fun setModulate(modulate: Color) {
    val _arg = Variant.new(modulate)
    __method_bind.set_modulate.call(this.toVariant(), _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.set_offset.call(this.toVariant(), _arg, 1)
  }

  fun setOpacity(opacity: Float) {
    val _arg = Variant.new(opacity)
    __method_bind.set_opacity.call(this.toVariant(), _arg, 1)
  }

  fun setPixelSize(pixelSize: Float) {
    val _arg = Variant.new(pixelSize)
    __method_bind.set_pixel_size.call(this.toVariant(), _arg, 1)
  }

  enum class DrawFlags(
    val value: Int
  ) {
    FLAG_TRANSPARENT(0),

    FLAG_SHADED(1),

    FLAG_DOUBLE_SIDED(2),

    FLAG_MAX(3);

    companion object {
      fun from(value: Int): DrawFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AlphaCutMode(
    val value: Int
  ) {
    ALPHA_CUT_DISABLED(0),

    ALPHA_CUT_DISCARD(1),

    ALPHA_CUT_OPAQUE_PREPASS(2);

    companion object {
      fun from(value: Int): AlphaCutMode {
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
