// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BitmapFont(
  _handle: COpaquePointer
) : Font(_handle) {
  fun addChar(
    character: Int,
    texture: Int,
    rect: Rect2,
    align: Vector2,
    advance: Float
  ) {
    val _args = VariantArray.new()
    _args.append(character)
    _args.append(texture)
    _args.append(rect)
    _args.append(align)
    _args.append(advance)
    __method_bind.add_char.call(this._handle, _args.toVariant(), 5)
  }

  fun addKerningPair(
    charA: Int,
    charB: Int,
    kerning: Int
  ) {
    val _args = VariantArray.new()
    _args.append(charA)
    _args.append(charB)
    _args.append(kerning)
    __method_bind.add_kerning_pair.call(this._handle, _args.toVariant(), 3)
  }

  fun addTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.add_texture.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createFromFnt(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.create_from_fnt.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun getCharSize(char: Int, next: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(char)
    _args.append(next)
    val _ret = __method_bind.get_char_size.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun getFallback(): BitmapFont {
    val _ret = __method_bind.get_fallback.call(this._handle)
    return _ret.asObject(::BitmapFont)!!
  }

  fun getKerningPair(charA: Int, charB: Int): Int {
    val _args = VariantArray.new()
    _args.append(charA)
    _args.append(charB)
    val _ret = __method_bind.get_kerning_pair.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getTexture(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_texture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureCount(): Int {
    val _ret = __method_bind.get_texture_count.call(this._handle)
    return _ret.asInt()
  }

  fun setAscent(px: Float) {
    val _arg = Variant.new(px)
    __method_bind.set_ascent.call(this._handle, _arg, 1)
  }

  fun setDistanceFieldHint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_distance_field_hint.call(this._handle, _arg, 1)
  }

  fun setFallback(fallback: BitmapFont) {
    val _arg = Variant.new(fallback)
    __method_bind.set_fallback.call(this._handle, _arg, 1)
  }

  fun setHeight(px: Float) {
    val _arg = Variant.new(px)
    __method_bind.set_height.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): BitmapFont = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BitmapFont".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BitmapFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BitmapFont(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): BitmapFont = BitmapFont(ptr)
    /**
     * Container for method_bind pointers for BitmapFont
     */
    private object __method_bind {
      val add_char: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_char".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_char" }
        }
      val add_kerning_pair: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_kerning_pair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_kerning_pair" }
        }
      val add_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_texture" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val create_from_fnt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "create_from_fnt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_fnt" }
        }
      val get_char_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_char_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_char_size" }
        }
      val get_fallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback" }
        }
      val get_kerning_pair: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_kerning_pair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_kerning_pair" }
        }
      val get_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val get_texture_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_texture_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_count" }
        }
      val set_ascent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_ascent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ascent" }
        }
      val set_distance_field_hint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_distance_field_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_distance_field_hint" }
        }
      val set_fallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fallback" }
        }
      val set_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }}
  }
}
