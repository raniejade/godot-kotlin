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

open class TouchScreenButton internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getAction(): String {
    val _ret = __method_bind.get_action.call(this.toVariant())
    TODO()
  }

  fun getBitmask(): BitMap {
    val _ret = __method_bind.get_bitmask.call(this.toVariant())
    TODO()
  }

  fun getShape(): Shape2D {
    val _ret = __method_bind.get_shape.call(this.toVariant())
    TODO()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this.toVariant())
    TODO()
  }

  fun getTexturePressed(): Texture {
    val _ret = __method_bind.get_texture_pressed.call(this.toVariant())
    TODO()
  }

  fun getVisibilityMode(): VisibilityMode {
    val _ret = __method_bind.get_visibility_mode.call(this.toVariant())
    TODO()
  }

  fun isPassbyPressEnabled(): Boolean {
    val _ret = __method_bind.is_passby_press_enabled.call(this.toVariant())
    TODO()
  }

  fun isPressed(): Boolean {
    val _ret = __method_bind.is_pressed.call(this.toVariant())
    TODO()
  }

  fun isShapeCentered(): Boolean {
    val _ret = __method_bind.is_shape_centered.call(this.toVariant())
    TODO()
  }

  fun isShapeVisible(): Boolean {
    val _ret = __method_bind.is_shape_visible.call(this.toVariant())
    TODO()
  }

  fun setAction(action: String) {
    val _args = VariantArray.new()
    _args.append(action)
    val _ret = __method_bind.set_action.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBitmask(bitmask: BitMap) {
    val _args = VariantArray.new()
    _args.append(bitmask)
    val _ret = __method_bind.set_bitmask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPassbyPress(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_passby_press.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShape(shape: Shape2D) {
    val _args = VariantArray.new()
    _args.append(shape)
    val _ret = __method_bind.set_shape.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShapeCentered(bool: Boolean) {
    val _args = VariantArray.new()
    _args.append(bool)
    val _ret = __method_bind.set_shape_centered.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShapeVisible(bool: Boolean) {
    val _args = VariantArray.new()
    _args.append(bool)
    val _ret = __method_bind.set_shape_visible.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTexture(texture: Texture) {
    val _args = VariantArray.new()
    _args.append(texture)
    val _ret = __method_bind.set_texture.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTexturePressed(texturePressed: Texture) {
    val _args = VariantArray.new()
    _args.append(texturePressed)
    val _ret = __method_bind.set_texture_pressed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVisibilityMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_visibility_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton TouchScreenButton" }
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
      val get_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action" }
            }
          }

      val get_bitmask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_bitmask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bitmask" }
            }
          }

      val get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_texture_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_pressed" }
            }
          }

      val get_visibility_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "get_visibility_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visibility_mode" }
            }
          }

      val is_passby_press_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_passby_press_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_passby_press_enabled" }
            }
          }

      val is_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pressed" }
            }
          }

      val is_shape_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_shape_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shape_centered" }
            }
          }

      val is_shape_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "is_shape_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shape_visible" }
            }
          }

      val set_action: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_action" }
            }
          }

      val set_bitmask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_bitmask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bitmask" }
            }
          }

      val set_passby_press: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_passby_press".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_passby_press" }
            }
          }

      val set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape" }
            }
          }

      val set_shape_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_shape_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape_centered" }
            }
          }

      val set_shape_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_shape_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape_visible" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_texture_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_texture_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_pressed" }
            }
          }

      val set_visibility_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TouchScreenButton".cstr.ptr,
              "set_visibility_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visibility_mode" }
            }
          }
    }
  }
}
