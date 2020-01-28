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

open class TextureButton(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  fun getClickMask(): BitMap {
    val _ret = __method_bind.get_click_mask.call(this._handle)
    return _ret.asObject(::BitMap)!!
  }

  fun getDisabledTexture(): Texture {
    val _ret = __method_bind.get_disabled_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getExpand(): Boolean {
    val _ret = __method_bind.get_expand.call(this._handle)
    return _ret.asBoolean()
  }

  fun getFocusedTexture(): Texture {
    val _ret = __method_bind.get_focused_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getHoverTexture(): Texture {
    val _ret = __method_bind.get_hover_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getNormalTexture(): Texture {
    val _ret = __method_bind.get_normal_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getPressedTexture(): Texture {
    val _ret = __method_bind.get_pressed_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getStretchMode(): StretchMode {
    val _ret = __method_bind.get_stretch_mode.call(this._handle)
    return TextureButton.StretchMode.from(_ret.asInt())
  }

  fun setClickMask(mask: BitMap) {
    val _arg = Variant.new(mask)
    __method_bind.set_click_mask.call(this._handle, _arg, 1)
  }

  fun setDisabledTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_disabled_texture.call(this._handle, _arg, 1)
  }

  fun setExpand(pExpand: Boolean) {
    val _arg = Variant.new(pExpand)
    __method_bind.set_expand.call(this._handle, _arg, 1)
  }

  fun setFocusedTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_focused_texture.call(this._handle, _arg, 1)
  }

  fun setHoverTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_hover_texture.call(this._handle, _arg, 1)
  }

  fun setNormalTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_normal_texture.call(this._handle, _arg, 1)
  }

  fun setPressedTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_pressed_texture.call(this._handle, _arg, 1)
  }

  fun setStretchMode(pMode: Int) {
    val _arg = Variant.new(pMode)
    __method_bind.set_stretch_mode.call(this._handle, _arg, 1)
  }

  enum class StretchMode(
    val value: Int
  ) {
    STRETCH_SCALE(0),

    STRETCH_TILE(1),

    STRETCH_KEEP(2),

    STRETCH_KEEP_CENTERED(3),

    STRETCH_KEEP_ASPECT(4),

    STRETCH_KEEP_ASPECT_CENTERED(5),

    STRETCH_KEEP_ASPECT_COVERED(6);

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
    val STRETCH_KEEP: Int = 2

    val STRETCH_KEEP_ASPECT: Int = 4

    val STRETCH_KEEP_ASPECT_CENTERED: Int = 5

    val STRETCH_KEEP_ASPECT_COVERED: Int = 6

    val STRETCH_KEEP_CENTERED: Int = 3

    val STRETCH_SCALE: Int = 0

    val STRETCH_TILE: Int = 1

    fun new(): TextureButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextureButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextureButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TextureButton = TextureButton(ptr)
    /**
     * Container for method_bind pointers for TextureButton
     */
    private object __method_bind {
      val get_click_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_click_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_click_mask" }
        }
      val get_disabled_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_disabled_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_disabled_texture" }
        }
      val get_expand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expand" }
        }
      val get_focused_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_focused_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focused_texture" }
        }
      val get_hover_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_hover_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hover_texture" }
        }
      val get_normal_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal_texture" }
        }
      val get_pressed_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_pressed_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressed_texture" }
        }
      val get_stretch_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "get_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_mode" }
        }
      val set_click_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_click_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_click_mask" }
        }
      val set_disabled_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_disabled_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled_texture" }
        }
      val set_expand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand" }
        }
      val set_focused_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_focused_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focused_texture" }
        }
      val set_hover_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_hover_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hover_texture" }
        }
      val set_normal_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_normal_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal_texture" }
        }
      val set_pressed_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_pressed_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressed_texture" }
        }
      val set_stretch_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "set_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_mode" }
        }}
  }
}
