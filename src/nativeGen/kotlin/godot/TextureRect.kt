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
  fun getStretchMode(): StretchMode {
    val _ret = __method_bind.get_stretch_mode.call(this._handle)
    return TextureRect.StretchMode.from(_ret.asInt())
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun hasExpand(): Boolean {
    val _ret = __method_bind.has_expand.call(this._handle)
    return _ret.asBool()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.is_flipped_h.call(this._handle)
    return _ret.asBool()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.is_flipped_v.call(this._handle)
    return _ret.asBool()
  }

  fun setExpand(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_expand.call(this._handle, _arg, 1)
  }

  fun setFlipH(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_flip_h.call(this._handle, _arg, 1)
  }

  fun setFlipV(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_flip_v.call(this._handle, _arg, 1)
  }

  fun setStretchMode(stretchMode: Int) {
    val _arg = Variant.new(stretchMode)
    __method_bind.set_stretch_mode.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_texture.call(this._handle, _arg, 1)
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
      val get_stretch_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "get_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_mode" }
        }
      val get_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val has_expand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "has_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_expand" }
        }
      val is_flipped_h: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "is_flipped_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
        }
      val is_flipped_v: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "is_flipped_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
        }
      val set_expand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand" }
        }
      val set_flip_h: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_flip_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
        }
      val set_flip_v: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_flip_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
        }
      val set_stretch_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_mode" }
        }
      val set_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureRect".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }}
  }
}
