// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_chars(): PoolIntArray {
    TODO()
  }

  open fun _get_kernings(): PoolIntArray {
    TODO()
  }

  open fun _get_textures(): VariantArray {
    TODO()
  }

  open fun _set_chars(arg0: PoolIntArray) {
    TODO()
  }

  open fun _set_kernings(arg0: PoolIntArray) {
    TODO()
  }

  open fun _set_textures(arg0: VariantArray) {
    TODO()
  }

  fun addChar(
    character: Int,
    texture: Int,
    rect: Rect2,
    align: Vector2 = Vector2(0, 0),
    advance: Float = -1.0f
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(character)
      _args.add(texture)
      _args.add(rect)
      _args.add(align)
      _args.add(advance)
      __method_bind.addChar.call(self._handle, _args, null)
    }
  }

  fun addKerningPair(
    charA: Int,
    charB: Int,
    kerning: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(charA)
      _args.add(charB)
      _args.add(kerning)
      __method_bind.addKerningPair.call(self._handle, _args, null)
    }
  }

  fun addTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun createFromFnt(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.createFromFnt.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getCharSize(char: Int, next: Int = 0): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(char)
      _args.add(next)
      __method_bind.getCharSize.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFallback(): BitmapFont {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: BitmapFont
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFallback.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<BitmapFont>(_tmp.value!!)
      _ret
    }
  }

  fun getKerningPair(charA: Int, charB: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(charA)
      _args.add(charB)
      __method_bind.getKerningPair.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getTexture(idx: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getTextureCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextureCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAscent(px: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAscent.call(self._handle, listOf(px), null)
    }
  }

  fun setDistanceFieldHint(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDistanceFieldHint.call(self._handle, listOf(enable), null)
    }
  }

  fun setFallback(fallback: BitmapFont) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFallback.call(self._handle, listOf(fallback), null)
    }
  }

  fun setHeight(px: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHeight.call(self._handle, listOf(px), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_char".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_char" }
        }
      val addKerningPair: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_kerning_pair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_kerning_pair" }
        }
      val addTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "add_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_texture" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createFromFnt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "create_from_fnt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_fnt" }
        }
      val getCharSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_char_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_char_size" }
        }
      val getFallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback" }
        }
      val getKerningPair: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_kerning_pair".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_kerning_pair" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTextureCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "get_texture_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_count" }
        }
      val setAscent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_ascent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ascent" }
        }
      val setDistanceFieldHint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_distance_field_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_distance_field_hint" }
        }
      val setFallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fallback" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }}
  }
}
