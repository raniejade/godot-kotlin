// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class TouchScreenButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var action: String
    get() {
       return getAction() 
    }
    set(value) {
      setAction(value)
    }

  var bitmask: BitMap
    get() {
       return getBitmask() 
    }
    set(value) {
      setBitmask(value)
    }

  var normal: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var passbyPress: Boolean
    get() {
       return isPassbyPressEnabled() 
    }
    set(value) {
      setPassbyPress(value)
    }

  var pressed: Texture
    get() {
       return getTexturePressed() 
    }
    set(value) {
      setTexturePressed(value)
    }

  var shape: Shape2D
    get() {
       return getShape() 
    }
    set(value) {
      setShape(value)
    }

  var shapeCentered: Boolean
    get() {
       return isShapeCentered() 
    }
    set(value) {
      setShapeCentered(value)
    }

  var shapeVisible: Boolean
    get() {
       return isShapeVisible() 
    }
    set(value) {
      setShapeVisible(value)
    }

  var visibilityMode: VisibilityMode
    get() {
       return getVisibilityMode() 
    }
    set(value) {
      setVisibilityMode(value.value)
    }

  /**
   * TouchScreenButton::pressed signal
   */
  val signalPressed: Signal0 = Signal0("pressed")

  /**
   * TouchScreenButton::released signal
   */
  val signalReleased: Signal0 = Signal0("released")

  constructor() : this(null) {
    _handle = __new()
  }

  fun getAction(): String {
    val _ret = __method_bind.getAction.call(this._handle)
    return _ret.asString()
  }

  fun getBitmask(): BitMap {
    val _ret = __method_bind.getBitmask.call(this._handle)
    return _ret.asObject(::BitMap)!!
  }

  fun getShape(): Shape2D {
    val _ret = __method_bind.getShape.call(this._handle)
    return _ret.asObject(::Shape2D)!!
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTexturePressed(): Texture {
    val _ret = __method_bind.getTexturePressed.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getVisibilityMode(): VisibilityMode {
    val _ret = __method_bind.getVisibilityMode.call(this._handle)
    return TouchScreenButton.VisibilityMode.from(_ret.asInt())
  }

  fun isPassbyPressEnabled(): Boolean {
    val _ret = __method_bind.isPassbyPressEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPressed(): Boolean {
    val _ret = __method_bind.isPressed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShapeCentered(): Boolean {
    val _ret = __method_bind.isShapeCentered.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShapeVisible(): Boolean {
    val _ret = __method_bind.isShapeVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAction(action: String) {
    val _arg = Variant.new(action)
    __method_bind.setAction.call(this._handle, listOf(_arg))
  }

  fun setBitmask(bitmask: BitMap) {
    val _arg = Variant.new(bitmask)
    __method_bind.setBitmask.call(this._handle, listOf(_arg))
  }

  fun setPassbyPress(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setPassbyPress.call(this._handle, listOf(_arg))
  }

  fun setShape(shape: Shape2D) {
    val _arg = Variant.new(shape)
    __method_bind.setShape.call(this._handle, listOf(_arg))
  }

  fun setShapeCentered(bool: Boolean) {
    val _arg = Variant.new(bool)
    __method_bind.setShapeCentered.call(this._handle, listOf(_arg))
  }

  fun setShapeVisible(bool: Boolean) {
    val _arg = Variant.new(bool)
    __method_bind.setShapeVisible.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setTexturePressed(texturePressed: Texture) {
    val _arg = Variant.new(texturePressed)
    __method_bind.setTexturePressed.call(this._handle, listOf(_arg))
  }

  fun setVisibilityMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setVisibilityMode.call(this._handle, listOf(_arg))
  }

  enum class VisibilityMode(
    val value: Int
  ) {
    ALWAYS(0),

    TOUCHSCREEN_ONLY(1);

    companion object {
      fun from(value: Int): VisibilityMode {
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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TouchScreenButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TouchScreenButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TouchScreenButton
     */
    private object __method_bind {
      val getAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action" }
        }
      val getBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bitmask" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTexturePressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_texture_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_pressed" }
        }
      val getVisibilityMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_visibility_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visibility_mode" }
        }
      val isPassbyPressEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_passby_press_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_passby_press_enabled" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pressed" }
        }
      val isShapeCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_shape_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shape_centered" }
        }
      val isShapeVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_shape_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shape_visible" }
        }
      val setAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action" }
        }
      val setBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bitmask" }
        }
      val setPassbyPress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_passby_press".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_passby_press" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }
      val setShapeCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_shape_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape_centered" }
        }
      val setShapeVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_shape_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape_visible" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTexturePressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_texture_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_pressed" }
        }
      val setVisibilityMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_visibility_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visibility_mode" }
        }}
  }
}
