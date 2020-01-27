// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputMap(
  _handle: COpaquePointer
) : Object(_handle) {
  fun actionAddEvent(action: String, event: InputEvent) {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(event)
    __method_bind.action_add_event.call(this._handle, _args.toVariant(), 2)
  }

  fun actionEraseEvent(action: String, event: InputEvent) {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(event)
    __method_bind.action_erase_event.call(this._handle, _args.toVariant(), 2)
  }

  fun actionEraseEvents(action: String) {
    val _arg = Variant.new(action)
    __method_bind.action_erase_events.call(this._handle, _arg, 1)
  }

  fun actionHasEvent(action: String, event: InputEvent): Boolean {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(event)
    val _ret = __method_bind.action_has_event.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun actionSetDeadzone(action: String, deadzone: Float) {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(deadzone)
    __method_bind.action_set_deadzone.call(this._handle, _args.toVariant(), 2)
  }

  fun addAction(action: String, deadzone: Float) {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(deadzone)
    __method_bind.add_action.call(this._handle, _args.toVariant(), 2)
  }

  fun eraseAction(action: String) {
    val _arg = Variant.new(action)
    __method_bind.erase_action.call(this._handle, _arg, 1)
  }

  fun eventIsAction(event: InputEvent, action: String): Boolean {
    val _args = VariantArray.new()
    _args.append(event)
    _args.append(action)
    val _ret = __method_bind.event_is_action.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun getActionList(action: String): VariantArray {
    val _arg = Variant.new(action)
    val _ret = __method_bind.get_action_list.call(this._handle, _arg, 1)
    return _ret.asArray()
  }

  fun getActions(): VariantArray {
    val _ret = __method_bind.get_actions.call(this._handle)
    return _ret.asArray()
  }

  fun hasAction(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.has_action.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun loadFromGlobals() {
    __method_bind.load_from_globals.call(this._handle)
  }

  companion object {
    val Instance: InputMap
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("InputMap".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton InputMap" }
        InputMap(
          handle
        )
      }
    /**
     * Container for method_bind pointers for InputMap
     */
    private object __method_bind {
      val action_add_event: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_add_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_add_event" }
        }
      val action_erase_event: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_erase_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_erase_event" }
        }
      val action_erase_events: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_erase_events".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_erase_events" }
        }
      val action_has_event: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_has_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_has_event" }
        }
      val action_set_deadzone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_set_deadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_set_deadzone" }
        }
      val add_action: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "add_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_action" }
        }
      val erase_action: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "erase_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_action" }
        }
      val event_is_action: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "event_is_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method event_is_action" }
        }
      val get_action_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "get_action_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_list" }
        }
      val get_actions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "get_actions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_actions" }
        }
      val has_action: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "has_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_action" }
        }
      val load_from_globals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "load_from_globals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_from_globals" }
        }}
  }
}
