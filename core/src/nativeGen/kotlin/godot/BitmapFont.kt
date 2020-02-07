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
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BitmapFont(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Font(null) {
  var ascent: Float
    get() {
       return getAscent() 
    }
    set(value) {
      setAscent(value)
    }

  var distanceField: Boolean
    get() {
       return isDistanceFieldHint() 
    }
    set(value) {
      setDistanceFieldHint(value)
    }

  var fallback: BitmapFont
    get() {
       return getFallback() 
    }
    set(value) {
      setFallback(value)
    }

  var height: Float
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun addChar(
    character: Int,
    texture: Int,
    rect: Rect2,
    align: Vector2 = Vector2.new(0, 0),
    advance: Float = -1.0f
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(character))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(align))
    _args.add(Variant.fromAny(advance))
    __method_bind.addChar.call(this._handle, _args)
  }

  fun addKerningPair(
    charA: Int,
    charB: Int,
    kerning: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(charA))
    _args.add(Variant.fromAny(charB))
    _args.add(Variant.fromAny(kerning))
    __method_bind.addKerningPair.call(this._handle, _args)
  }

  fun addTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.addTexture.call(this._handle, listOf(_arg))
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createFromFnt(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.createFromFnt.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun getCharSize(char: Int, next: Int = 0): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(char))
    _args.add(Variant.fromAny(next))
    val _ret = __method_bind.getCharSize.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun getFallback(): BitmapFont {
    val _ret = __method_bind.getFallback.call(this._handle)
    return _ret.asObject(::BitmapFont)!!
  }

  fun getKerningPair(charA: Int, charB: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(charA))
    _args.add(Variant.fromAny(charB))
    val _ret = __method_bind.getKerningPair.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getTexture(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getTexture.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun getTextureCount(): Int {
    val _ret = __method_bind.getTextureCount.call(this._handle)
    return _ret.asInt()
  }

  fun setAscent(px: Float) {
    val _arg = Variant.new(px)
    __method_bind.setAscent.call(this._handle, listOf(_arg))
  }

  fun setDistanceFieldHint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDistanceFieldHint.call(this._handle, listOf(_arg))
  }

  fun setFallback(fallback: BitmapFont) {
    val _arg = Variant.new(fallback)
    __method_bind.setFallback.call(this._handle, listOf(_arg))
  }

  fun setHeight(px: Float) {
    val _arg = Variant.new(px)
    __method_bind.setHeight.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BitmapFont".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BitmapFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BitmapFont
     */
    private object __method_bind {
      val addChar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_char".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_char" }
        }
      val addKerningPair: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_kerning_pair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_kerning_pair" }
        }
      val addTexture: CPointer<godot_method_bind>
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
      val createFromFnt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "create_from_fnt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_fnt" }
        }
      val getCharSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_char_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_char_size" }
        }
      val getFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback" }
        }
      val getKerningPair: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_kerning_pair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_kerning_pair" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTextureCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_texture_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_count" }
        }
      val setAscent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_ascent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ascent" }
        }
      val setDistanceFieldHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_distance_field_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_distance_field_hint" }
        }
      val setFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fallback" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }}
  }
}
