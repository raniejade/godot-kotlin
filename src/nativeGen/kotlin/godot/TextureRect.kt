// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TextureRect(
  _handle: COpaquePointer
) : Control(_handle) {
  var expand: Boolean
    get() {
       return hasExpand() 
    }
    set(value) {
      setExpand(value)
    }

  var flipH: Boolean
    get() {
       return isFlippedH() 
    }
    set(value) {
      setFlipH(value)
    }

  var flipV: Boolean
    get() {
       return isFlippedV() 
    }
    set(value) {
      setFlipV(value)
    }

  var stretchMode: Int
    get() {
       return TextureRect.StretchMode.from(getStretchMode()) 
    }
    set(value) {
      setStretchMode(TextureRect.StretchMode.from(value))
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  fun getStretchMode(): StretchMode {
    val _ret = __method_bind.getStretchMode.call(this._handle)
    return TextureRect.StretchMode.from(_ret.asInt())
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun hasExpand(): Boolean {
    val _ret = __method_bind.hasExpand.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.isFlippedH.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.isFlippedV.call(this._handle)
    return _ret.asBoolean()
  }

  fun setExpand(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setExpand.call(this._handle, _arg, 1)
  }

  fun setFlipH(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFlipH.call(this._handle, _arg, 1)
  }

  fun setFlipV(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFlipV.call(this._handle, _arg, 1)
  }

  fun setStretchMode(stretchMode: Int) {
    val _arg = Variant.new(stretchMode)
    __method_bind.setStretchMode.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  enum class StretchMode(
    val value: Int
  ) {
    STRETCH_SCALE_ON_EXPAND(0),

    STRETCH_SCALE(1),

    STRETCH_TILE(2),

    STRETCH_KEEP(3),

    STRETCH_KEEP_CENTERED(4),

    STRETCH_KEEP_ASPECT(5),

    STRETCH_KEEP_ASPECT_CENTERED(6),

    STRETCH_KEEP_ASPECT_COVERED(7);

    companion object {
      fun from(value: Int): StretchMode {
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
    val STRETCH_KEEP: Int = 3

    val STRETCH_KEEP_ASPECT: Int = 5

    val STRETCH_KEEP_ASPECT_CENTERED: Int = 6

    val STRETCH_KEEP_ASPECT_COVERED: Int = 7

    val STRETCH_KEEP_CENTERED: Int = 4

    val STRETCH_SCALE: Int = 1

    val STRETCH_SCALE_ON_EXPAND: Int = 0

    val STRETCH_TILE: Int = 2

    fun new(): TextureRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextureRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureRect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TextureRect = TextureRect(ptr)
    /**
     * Container for method_bind pointers for TextureRect
     */
    private object __method_bind {
      val getStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "getStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStretchMode" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val hasExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "hasExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasExpand" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "isFlippedH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedH" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "isFlippedV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedV" }
        }
      val setExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "setExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpand" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "setFlipH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipH" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "setFlipV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipV" }
        }
      val setStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "setStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStretchMode" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }}
  }
}
