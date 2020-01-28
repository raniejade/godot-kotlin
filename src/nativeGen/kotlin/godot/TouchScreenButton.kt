// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TouchScreenButton(
  _handle: COpaquePointer
) : Node2D(_handle) {
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

  var visibilityMode: Int
    get() {
       return TouchScreenButton.VisibilityMode.from(getVisibilityMode()) 
    }
    set(value) {
      setVisibilityMode(TouchScreenButton.VisibilityMode.from(value))
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
    __method_bind.setAction.call(this._handle, _arg, 1)
  }

  fun setBitmask(bitmask: BitMap) {
    val _arg = Variant.new(bitmask)
    __method_bind.setBitmask.call(this._handle, _arg, 1)
  }

  fun setPassbyPress(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setPassbyPress.call(this._handle, _arg, 1)
  }

  fun setShape(shape: Shape2D) {
    val _arg = Variant.new(shape)
    __method_bind.setShape.call(this._handle, _arg, 1)
  }

  fun setShapeCentered(bool: Boolean) {
    val _arg = Variant.new(bool)
    __method_bind.setShapeCentered.call(this._handle, _arg, 1)
  }

  fun setShapeVisible(bool: Boolean) {
    val _arg = Variant.new(bool)
    __method_bind.setShapeVisible.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setTexturePressed(texturePressed: Texture) {
    val _arg = Variant.new(texturePressed)
    __method_bind.setTexturePressed.call(this._handle, _arg, 1)
  }

  fun setVisibilityMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setVisibilityMode.call(this._handle, _arg, 1)
  }

  enum class VisibilityMode(
    val value: Int
  ) {
    VISIBILITY_ALWAYS(0),

    VISIBILITY_TOUCHSCREEN_ONLY(1);

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
    val VISIBILITY_ALWAYS: Int = 0

    val VISIBILITY_TOUCHSCREEN_ONLY: Int = 1

    fun new(): TouchScreenButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TouchScreenButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TouchScreenButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TouchScreenButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TouchScreenButton = TouchScreenButton(ptr)
    /**
     * Container for method_bind pointers for TouchScreenButton
     */
    private object __method_bind {
      val getAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "getAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAction" }
        }
      val getBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "getBitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBitmask" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "getShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShape" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getTexturePressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "getTexturePressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexturePressed" }
        }
      val getVisibilityMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "getVisibilityMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibilityMode" }
        }
      val isPassbyPressEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "isPassbyPressEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPassbyPressEnabled" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "isPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPressed" }
        }
      val isShapeCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "isShapeCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShapeCentered" }
        }
      val isShapeVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "isShapeVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShapeVisible" }
        }
      val setAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAction" }
        }
      val setBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setBitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBitmask" }
        }
      val setPassbyPress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setPassbyPress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPassbyPress" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShape" }
        }
      val setShapeCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setShapeCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShapeCentered" }
        }
      val setShapeVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setShapeVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShapeVisible" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setTexturePressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setTexturePressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexturePressed" }
        }
      val setVisibilityMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "setVisibilityMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVisibilityMode" }
        }}
  }
}
