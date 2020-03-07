// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class TextureButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : BaseButton(null) {
  var expand: Boolean
    get() {
       return getExpand() 
    }
    set(value) {
      setExpand(value)
    }

  var stretchMode: StretchMode
    get() {
       return getStretchMode() 
    }
    set(value) {
      setStretchMode(value.value)
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getClickMask(): BitMap {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: BitMap
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getClickMask.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<BitMap>(_tmp.value!!)
      _ret
    }
  }

  fun getDisabledTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getDisabledTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getExpand(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExpand.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFocusedTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFocusedTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getHoverTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getHoverTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getNormalTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNormalTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getPressedTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPressedTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getStretchMode(): StretchMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStretchMode.call(self._handle, emptyList(), _retPtr)
      TextureButton.StretchMode.from(_ret.value)
    }
  }

  fun setClickMask(mask: BitMap) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClickMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setDisabledTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisabledTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setExpand(pExpand: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExpand.call(self._handle, listOf(pExpand), null)
    }
  }

  fun setFocusedTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFocusedTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setHoverTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHoverTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setNormalTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setPressedTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPressedTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setStretchMode(pMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStretchMode.call(self._handle, listOf(pMode), null)
    }
  }

  enum class StretchMode(
    val value: Int
  ) {
    SCALE(0),

    TILE(1),

    KEEP(2),

    KEEP_CENTERED(3),

    KEEP_ASPECT(4),

    KEEP_ASPECT_CENTERED(5),

    KEEP_ASPECT_COVERED(6);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextureButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TextureButton
     */
    private object __method_bind {
      val getClickMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_click_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_click_mask" }
            }
          }

      val getDisabledTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_disabled_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_disabled_texture" }
            }
          }

      val getExpand: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand" }
            }
          }

      val getFocusedTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_focused_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_focused_texture" }
            }
          }

      val getHoverTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_hover_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hover_texture" }
            }
          }

      val getNormalTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_normal_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_texture" }
            }
          }

      val getPressedTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_pressed_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressed_texture" }
            }
          }

      val getStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "get_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stretch_mode" }
            }
          }

      val setClickMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_click_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_click_mask" }
            }
          }

      val setDisabledTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_disabled_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled_texture" }
            }
          }

      val setExpand: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand" }
            }
          }

      val setFocusedTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_focused_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_focused_texture" }
            }
          }

      val setHoverTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_hover_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hover_texture" }
            }
          }

      val setNormalTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_normal_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_texture" }
            }
          }

      val setPressedTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_pressed_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressed_texture" }
            }
          }

      val setStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureButton".cstr.ptr,
              "set_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch_mode" }
            }
          }
    }
  }
}
