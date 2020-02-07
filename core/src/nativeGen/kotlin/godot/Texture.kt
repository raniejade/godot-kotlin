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
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Texture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var flags: Int
    get() {
       return getFlags() 
    }
    set(value) {
      setFlags(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(canvasItem))
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.draw.call(this._handle, _args)
  }

  fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(canvasItem))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(tile))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.drawRect.call(this._handle, _args)
  }

  fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture,
    clipUv: Boolean = true
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(canvasItem))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(srcRect))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(clipUv))
    __method_bind.drawRectRegion.call(this._handle, _args)
  }

  fun getData(): Image {
    val _ret = __method_bind.getData.call(this._handle)
    return _ret.asObject(::Image)!!
  }

  fun getFlags(): Int {
    val _ret = __method_bind.getFlags.call(this._handle)
    return _ret.asInt()
  }

  fun getHeight(): Int {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getWidth(): Int {
    val _ret = __method_bind.getWidth.call(this._handle)
    return _ret.asInt()
  }

  fun hasAlpha(): Boolean {
    val _ret = __method_bind.hasAlpha.call(this._handle)
    return _ret.asBoolean()
  }

  fun setFlags(flags: Int) {
    val _arg = Variant(flags)
    __method_bind.setFlags.call(this._handle, listOf(_arg))
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    DEFAULT(7),

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
      val drawRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect" }
        }
      val drawRectRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw_rect_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect_region" }
        }
      val getData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val getFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flags" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_width" }
        }
      val hasAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "has_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_alpha" }
        }
      val setFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "set_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flags" }
        }}
  }
}
