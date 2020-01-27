// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEvent internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun accumulate(withEvent: InputEvent): Boolean {
    val _arg = Variant.new(withEvent)
    val _ret = __method_bind.accumulate.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun asText(): String {
    val _ret = __method_bind.as_text.call(this._handle)
    return _ret.asString()
  }

  fun getActionStrength(action: String): Float {
    val _arg = Variant.new(action)
    val _ret = __method_bind.get_action_strength.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getDevice(): Int {
    val _ret = __method_bind.get_device.call(this._handle)
    return _ret.asInt()
  }

  fun isAction(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.is_action.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isActionPressed(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.is_action_pressed.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isActionReleased(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.is_action_released.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isActionType(): Boolean {
    val _ret = __method_bind.is_action_type.call(this._handle)
    return _ret.asBool()
  }

  fun isEcho(): Boolean {
    val _ret = __method_bind.is_echo.call(this._handle)
    return _ret.asBool()
  }

  fun isPressed(): Boolean {
    val _ret = __method_bind.is_pressed.call(this._handle)
    return _ret.asBool()
  }

  fun setDevice(device: Int) {
    val _arg = Variant.new(device)
    __method_bind.set_device.call(this._handle, _arg, 1)
  }

  fun shortcutMatch(event: InputEvent): Boolean {
    val _arg = Variant.new(event)
    val _ret = __method_bind.shortcut_match.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun xformedBy(xform: Transform2D, localOfs: Vector2): InputEvent {
    val _args = VariantArray.new()
    _args.append(xform)
    _args.append(localOfs)
    val _ret = __method_bind.xformed_by.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::InputEvent)!!
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEvent
     */
    private object __method_bind {
      val accumulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "accumulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method accumulate" }
        }
      val as_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method as_text" }
        }
      val get_action_strength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "get_action_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_strength" }
        }
      val get_device: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "get_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_device" }
        }
      val is_action: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action" }
        }
      val is_action_pressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_pressed" }
        }
      val is_action_released: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_released".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_released" }
        }
      val is_action_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_type" }
        }
      val is_echo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_echo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_echo" }
        }
      val is_pressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pressed" }
        }
      val set_device: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "set_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_device" }
        }
      val shortcut_match: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "shortcut_match".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shortcut_match" }
        }
      val xformed_by: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "xformed_by".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method xformed_by" }
        }}
  }
}
