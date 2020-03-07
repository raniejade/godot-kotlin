// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class InputMapInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun actionAddEvent(action: String, event: InputEvent) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(event)
      __method_bind.actionAddEvent.call(self._handle, _args, null)
    }
  }

  fun actionEraseEvent(action: String, event: InputEvent) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(event)
      __method_bind.actionEraseEvent.call(self._handle, _args, null)
    }
  }

  fun actionEraseEvents(action: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.actionEraseEvents.call(self._handle, listOf(action), null)
    }
  }

  fun actionHasEvent(action: String, event: InputEvent): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(event)
      __method_bind.actionHasEvent.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun actionSetDeadzone(action: String, deadzone: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(deadzone)
      __method_bind.actionSetDeadzone.call(self._handle, _args, null)
    }
  }

  fun addAction(action: String, deadzone: Float = 0.5f) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(deadzone)
      __method_bind.addAction.call(self._handle, _args, null)
    }
  }

  fun eraseAction(action: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.eraseAction.call(self._handle, listOf(action), null)
    }
  }

  fun eventIsAction(event: InputEvent, action: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(event)
      _args.add(action)
      __method_bind.eventIsAction.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getActionList(action: String): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getActionList.call(self._handle, listOf(action), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getActions(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getActions.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasAction(action: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAction.call(self._handle, listOf(action), _retPtr)
      _ret.value
    }
  }

  fun loadFromGlobals() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.loadFromGlobals.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for InputMap
     */
    private object __method_bind {
      val actionAddEvent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_add_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_add_event" }
            }
          }

      val actionEraseEvent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_erase_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_erase_event" }
            }
          }

      val actionEraseEvents: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_erase_events".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_erase_events" }
            }
          }

      val actionHasEvent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_has_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_has_event" }
            }
          }

      val actionSetDeadzone: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "action_set_deadzone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_set_deadzone" }
            }
          }

      val addAction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "add_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_action" }
            }
          }

      val eraseAction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "erase_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_action" }
            }
          }

      val eventIsAction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "event_is_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method event_is_action" }
            }
          }

      val getActionList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "get_action_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_list" }
            }
          }

      val getActions: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "get_actions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_actions" }
            }
          }

      val hasAction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "has_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_action" }
            }
          }

      val loadFromGlobals: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
              "load_from_globals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_from_globals" }
            }
          }
    }
  }
}

object InputMap : InputMapInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("InputMap".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton InputMap" }
      _handle = handle
    }
  }
}
