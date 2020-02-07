// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class InputMap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun actionAddEvent(action: String, event: InputEvent) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(action))
    _args.add(Variant.fromAny(event))
    __method_bind.actionAddEvent.call(this._handle, _args)
  }

  fun actionEraseEvent(action: String, event: InputEvent) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(action))
    _args.add(Variant.fromAny(event))
    __method_bind.actionEraseEvent.call(this._handle, _args)
  }

  fun actionEraseEvents(action: String) {
    val _arg = Variant(action)
    __method_bind.actionEraseEvents.call(this._handle, listOf(_arg))
  }

  fun actionHasEvent(action: String, event: InputEvent): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(action))
    _args.add(Variant.fromAny(event))
    val _ret = __method_bind.actionHasEvent.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun actionSetDeadzone(action: String, deadzone: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(action))
    _args.add(Variant.fromAny(deadzone))
    __method_bind.actionSetDeadzone.call(this._handle, _args)
  }

  fun addAction(action: String, deadzone: Float = 0.5f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(action))
    _args.add(Variant.fromAny(deadzone))
    __method_bind.addAction.call(this._handle, _args)
  }

  fun eraseAction(action: String) {
    val _arg = Variant(action)
    __method_bind.eraseAction.call(this._handle, listOf(_arg))
  }

  fun eventIsAction(event: InputEvent, action: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(event))
    _args.add(Variant.fromAny(action))
    val _ret = __method_bind.eventIsAction.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun getActionList(action: String): VariantArray {
    val _arg = Variant(action)
    val _ret = __method_bind.getActionList.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun getActions(): VariantArray {
    val _ret = __method_bind.getActions.call(this._handle)
    return _ret.asVariantArray()
  }

  fun hasAction(action: String): Boolean {
    val _arg = Variant(action)
    val _ret = __method_bind.hasAction.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun loadFromGlobals() {
    __method_bind.loadFromGlobals.call(this._handle)
  }

  companion object {
    val Instance: InputMap
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("InputMap".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton InputMap" }
        val ret = InputMap(null)
        ret._handle = handle
        ret
      }
    /**
     * Container for method_bind pointers for InputMap
     */
    private object __method_bind {
      val actionAddEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_add_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_add_event" }
        }
      val actionEraseEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_erase_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_erase_event" }
        }
      val actionEraseEvents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_erase_events".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_erase_events" }
        }
      val actionHasEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_has_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_has_event" }
        }
      val actionSetDeadzone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "action_set_deadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_set_deadzone" }
        }
      val addAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "add_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_action" }
        }
      val eraseAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "erase_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_action" }
        }
      val eventIsAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "event_is_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method event_is_action" }
        }
      val getActionList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "get_action_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_list" }
        }
      val getActions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "get_actions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_actions" }
        }
      val hasAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "has_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_action" }
        }
      val loadFromGlobals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "load_from_globals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_from_globals" }
        }}
  }
}
