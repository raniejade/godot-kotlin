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

open class InputEvent(
  _handle: COpaquePointer
) : Resource(_handle) {
  var device: Int
    get() {
       return getDevice() 
    }
    set(value) {
      setDevice(value)
    }

  fun accumulate(withEvent: InputEvent): Boolean {
    val _arg = Variant.new(withEvent)
    val _ret = __method_bind.accumulate.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun asText(): String {
    val _ret = __method_bind.asText.call(this._handle)
    return _ret.asString()
  }

  fun getActionStrength(action: String): Float {
    val _arg = Variant.new(action)
    val _ret = __method_bind.getActionStrength.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getDevice(): Int {
    val _ret = __method_bind.getDevice.call(this._handle)
    return _ret.asInt()
  }

  fun isAction(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.isAction.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isActionPressed(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.isActionPressed.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isActionReleased(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.isActionReleased.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isActionType(): Boolean {
    val _ret = __method_bind.isActionType.call(this._handle)
    return _ret.asBoolean()
  }

  fun isEcho(): Boolean {
    val _ret = __method_bind.isEcho.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPressed(): Boolean {
    val _ret = __method_bind.isPressed.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDevice(device: Int) {
    val _arg = Variant.new(device)
    __method_bind.setDevice.call(this._handle, _arg, 1)
  }

  fun shortcutMatch(event: InputEvent): Boolean {
    val _arg = Variant.new(event)
    val _ret = __method_bind.shortcutMatch.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun xformedBy(xform: Transform2D, localOfs: Vector2): InputEvent {
    val _args = VariantArray.new()
    _args.append(xform)
    _args.append(localOfs)
    val _ret = __method_bind.xformedBy.call(this._handle, _args.toVariant(), 2)
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
      val asText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method as_text" }
        }
      val getActionStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "get_action_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_strength" }
        }
      val getDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "get_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_device" }
        }
      val isAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action" }
        }
      val isActionPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_pressed" }
        }
      val isActionReleased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_released".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_released" }
        }
      val isActionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_type" }
        }
      val isEcho: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_echo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_echo" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pressed" }
        }
      val setDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "set_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_device" }
        }
      val shortcutMatch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "shortcut_match".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shortcut_match" }
        }
      val xformedBy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "xformed_by".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method xformed_by" }
        }}
  }
}
