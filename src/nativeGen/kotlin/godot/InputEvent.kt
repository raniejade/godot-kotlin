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
            "asText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method asText" }
        }
      val getActionStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "getActionStrength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getActionStrength" }
        }
      val getDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "getDevice".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDevice" }
        }
      val isAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "isAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAction" }
        }
      val isActionPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "isActionPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isActionPressed" }
        }
      val isActionReleased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "isActionReleased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isActionReleased" }
        }
      val isActionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "isActionType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isActionType" }
        }
      val isEcho: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "isEcho".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEcho" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "isPressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPressed" }
        }
      val setDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "setDevice".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDevice" }
        }
      val shortcutMatch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "shortcutMatch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shortcutMatch" }
        }
      val xformedBy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "xformedBy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method xformedBy" }
        }}
  }
}
