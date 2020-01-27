// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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
    canvasItem: RID,
    position: Vector2,
    modulate: Color,
    transpose: Boolean,
    normalMap: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(canvasItem)
    _args.append(position)
    _args.append(modulate)
    _args.append(transpose)
    _args.append(normalMap)
    __method_bind.draw.call(this._handle, _args.toVariant(), 5)
  }

  fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color,
    transpose: Boolean,
    normalMap: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(canvasItem)
    _args.append(rect)
    _args.append(tile)
    _args.append(modulate)
    _args.append(transpose)
    _args.append(normalMap)
    __method_bind.draw_rect.call(this._handle, _args.toVariant(), 6)
  }

  fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color,
    transpose: Boolean,
    normalMap: Texture,
    clipUv: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(canvasItem)
    _args.append(rect)
    _args.append(srcRect)
    _args.append(modulate)
    _args.append(transpose)
    _args.append(normalMap)
    _args.append(clipUv)
    __method_bind.draw_rect_region.call(this._handle, _args.toVariant(), 7)
  }

  fun getData(): Image {
    val _ret = __method_bind.get_data.call(this._handle)
    return _ret.asObject(::Image)!!
  }

  fun getFlags(): Int {
    val _ret = __method_bind.get_flags.call(this._handle)
    return _ret.asInt()
  }

  fun getHeight(): Int {
    val _ret = __method_bind.get_height.call(this._handle)
    return _ret.asInt()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.get_size.call(this._handle)
    return _ret.asVector2()
  }

  fun getWidth(): Int {
    val _ret = __method_bind.get_width.call(this._handle)
    return _ret.asInt()
  }

  fun hasAlpha(): Boolean {
    val _ret = __method_bind.has_alpha.call(this._handle)
    return _ret.asBool()
  }

  fun setFlags(flags: Int) {
    val _arg = Variant.new(flags)
    __method_bind.set_flags.call(this._handle, _arg, 1)
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
      val draw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw" }
        }
      val draw_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect" }
        }
      val draw_rect_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw_rect_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect_region" }
        }
      val get_data: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val get_flags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flags" }
        }
      val get_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val get_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val get_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_width" }
        }
      val has_alpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "has_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_alpha" }
        }
      val set_flags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "set_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flags" }
        }}
  }
}
