// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolIntArray
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
  var ascent: Float
    get() {
       return getAscent() 
    }
    set(value) {
      setAscent(value)
    }

  var chars: PoolIntArray
    get() {
       return _getChars() 
    }
    set(value) {
      _setChars(value)
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

  var kernings: PoolIntArray
    get() {
       return _getKernings() 
    }
    set(value) {
      _setKernings(value)
    }

  var textures: VariantArray
    get() {
       return _getTextures() 
    }
    set(value) {
      _setTextures(value)
    }

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
    __method_bind.addChar.call(this._handle, _args.toVariant(), 5)
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
    __method_bind.addKerningPair.call(this._handle, _args.toVariant(), 3)
  }

  fun addTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.addTexture.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createFromFnt(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.createFromFnt.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun getCharSize(char: Int, next: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(char)
    _args.append(next)
    val _ret = __method_bind.getCharSize.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun getFallback(): BitmapFont {
    val _ret = __method_bind.getFallback.call(this._handle)
    return _ret.asObject(::BitmapFont)!!
  }

  fun getKerningPair(charA: Int, charB: Int): Int {
    val _args = VariantArray.new()
    _args.append(charA)
    _args.append(charB)
    val _ret = __method_bind.getKerningPair.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getTexture(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getTexture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureCount(): Int {
    val _ret = __method_bind.getTextureCount.call(this._handle)
    return _ret.asInt()
  }

  fun setAscent(px: Float) {
    val _arg = Variant.new(px)
    __method_bind.setAscent.call(this._handle, _arg, 1)
  }

  fun setDistanceFieldHint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDistanceFieldHint.call(this._handle, _arg, 1)
  }

  fun setFallback(fallback: BitmapFont) {
    val _arg = Variant.new(fallback)
    __method_bind.setFallback.call(this._handle, _arg, 1)
  }

  fun setHeight(px: Float) {
    val _arg = Variant.new(px)
    __method_bind.setHeight.call(this._handle, _arg, 1)
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
      val addChar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "addChar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addChar" }
        }
      val addKerningPair: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "addKerningPair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addKerningPair" }
        }
      val addTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "addTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTexture" }
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
            "createFromFnt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createFromFnt" }
        }
      val getCharSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "getCharSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCharSize" }
        }
      val getFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "getFallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFallback" }
        }
      val getKerningPair: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "getKerningPair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getKerningPair" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getTextureCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "getTextureCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureCount" }
        }
      val setAscent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "setAscent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAscent" }
        }
      val setDistanceFieldHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "setDistanceFieldHint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDistanceFieldHint" }
        }
      val setFallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "setFallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFallback" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "setHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHeight" }
        }}
  }
}
