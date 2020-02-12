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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAction(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAction.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBitmask(): BitMap {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: BitMap
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getBitmask.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<BitMap>(_tmp.value!!)
      _ret
    }
  }

  fun getShape(): Shape2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getShape.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Shape2D>(_tmp.value!!)
      _ret
    }
  }

  fun getTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getTexturePressed(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexturePressed.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getVisibilityMode(): VisibilityMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVisibilityMode.call(self._handle, emptyList(), _retPtr)
      TouchScreenButton.VisibilityMode.from(_ret.value)
    }
  }

  fun isPassbyPressEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPassbyPressEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPressed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPressed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShapeCentered(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShapeCentered.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShapeVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShapeVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAction(action: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAction.call(self._handle, listOf(action), null)
    }
  }

  fun setBitmask(bitmask: BitMap) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBitmask.call(self._handle, listOf(bitmask), null)
    }
  }

  fun setPassbyPress(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPassbyPress.call(self._handle, listOf(enabled), null)
    }
  }

  fun setShape(shape: Shape2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShape.call(self._handle, listOf(shape), null)
    }
  }

  fun setShapeCentered(bool: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShapeCentered.call(self._handle, listOf(bool), null)
    }
  }

  fun setShapeVisible(bool: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShapeVisible.call(self._handle, listOf(bool), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setTexturePressed(texturePressed: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexturePressed.call(self._handle, listOf(texturePressed), null)
    }
  }

  fun setVisibilityMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisibilityMode.call(self._handle, listOf(mode), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action" }
        }
      val getBitmask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bitmask" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTexturePressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_texture_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_pressed" }
        }
      val getVisibilityMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "get_visibility_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visibility_mode" }
        }
      val isPassbyPressEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_passby_press_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_passby_press_enabled" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pressed" }
        }
      val isShapeCentered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_shape_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shape_centered" }
        }
      val isShapeVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "is_shape_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shape_visible" }
        }
      val setAction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action" }
        }
      val setBitmask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bitmask" }
        }
      val setPassbyPress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_passby_press".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_passby_press" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }
      val setShapeCentered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_shape_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape_centered" }
        }
      val setShapeVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_shape_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape_visible" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTexturePressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_texture_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_pressed" }
        }
      val setVisibilityMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
            "set_visibility_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visibility_mode" }
        }}
  }
}
