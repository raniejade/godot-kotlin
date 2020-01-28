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
  var expand: Boolean
    get() {
       return getExpand() 
    }
    set(value) {
      setExpand(value)
    }

  var stretchMode: Int
    get() {
       return TextureButton.StretchMode.from(getStretchMode()) 
    }
    set(value) {
      setStretchMode(TextureButton.StretchMode.from(value))
    }

  var textureClickMask: BitMap
    get() {
       return getClickMask() 
    }
    set(value) {
      setClickMask(value)
    }

  var textureDisabled: Texture
    get() {
       return getDisabledTexture() 
    }
    set(value) {
      setDisabledTexture(value)
    }

  var textureFocused: Texture
    get() {
       return getFocusedTexture() 
    }
    set(value) {
      setFocusedTexture(value)
    }

  var textureHover: Texture
    get() {
       return getHoverTexture() 
    }
    set(value) {
      setHoverTexture(value)
    }

  var textureNormal: Texture
    get() {
       return getNormalTexture() 
    }
    set(value) {
      setNormalTexture(value)
    }

  var texturePressed: Texture
    get() {
       return getPressedTexture() 
    }
    set(value) {
      setPressedTexture(value)
    }

  fun getClickMask(): BitMap {
    val _ret = __method_bind.getClickMask.call(this._handle)
    return _ret.asObject(::BitMap)!!
  }

  fun getDisabledTexture(): Texture {
    val _ret = __method_bind.getDisabledTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getExpand(): Boolean {
    val _ret = __method_bind.getExpand.call(this._handle)
    return _ret.asBoolean()
  }

  fun getFocusedTexture(): Texture {
    val _ret = __method_bind.getFocusedTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getHoverTexture(): Texture {
    val _ret = __method_bind.getHoverTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getNormalTexture(): Texture {
    val _ret = __method_bind.getNormalTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getPressedTexture(): Texture {
    val _ret = __method_bind.getPressedTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getStretchMode(): StretchMode {
    val _ret = __method_bind.getStretchMode.call(this._handle)
    return TextureButton.StretchMode.from(_ret.asInt())
  }

  fun setClickMask(mask: BitMap) {
    val _arg = Variant.new(mask)
    __method_bind.setClickMask.call(this._handle, _arg, 1)
  }

  fun setDisabledTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setDisabledTexture.call(this._handle, _arg, 1)
  }

  fun setExpand(pExpand: Boolean) {
    val _arg = Variant.new(pExpand)
    __method_bind.setExpand.call(this._handle, _arg, 1)
  }

  fun setFocusedTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setFocusedTexture.call(this._handle, _arg, 1)
  }

  fun setHoverTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setHoverTexture.call(this._handle, _arg, 1)
  }

  fun setNormalTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setNormalTexture.call(this._handle, _arg, 1)
  }

  fun setPressedTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setPressedTexture.call(this._handle, _arg, 1)
  }

  fun setStretchMode(pMode: Int) {
    val _arg = Variant.new(pMode)
    __method_bind.setStretchMode.call(this._handle, _arg, 1)
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
      val getClickMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getClickMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClickMask" }
        }
      val getDisabledTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getDisabledTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDisabledTexture" }
        }
      val getExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExpand" }
        }
      val getFocusedTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getFocusedTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFocusedTexture" }
        }
      val getHoverTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getHoverTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHoverTexture" }
        }
      val getNormalTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getNormalTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNormalTexture" }
        }
      val getPressedTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getPressedTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPressedTexture" }
        }
      val getStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "getStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStretchMode" }
        }
      val setClickMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setClickMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClickMask" }
        }
      val setDisabledTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setDisabledTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisabledTexture" }
        }
      val setExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpand" }
        }
      val setFocusedTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setFocusedTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFocusedTexture" }
        }
      val setHoverTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setHoverTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHoverTexture" }
        }
      val setNormalTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setNormalTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNormalTexture" }
        }
      val setPressedTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setPressedTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressedTexture" }
        }
      val setStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
            "setStretchMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setStretchMode" }
        }}
  }
}
