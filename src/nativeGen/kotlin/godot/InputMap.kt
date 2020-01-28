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
    __method_bind.actionAddEvent.call(this._handle, _args.toVariant(), 2)
  }

  fun actionEraseEvent(action: String, event: InputEvent) {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(event)
    __method_bind.actionEraseEvent.call(this._handle, _args.toVariant(), 2)
  }

  fun actionEraseEvents(action: String) {
    val _arg = Variant.new(action)
    __method_bind.actionEraseEvents.call(this._handle, _arg, 1)
  }

  fun actionHasEvent(action: String, event: InputEvent): Boolean {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(event)
    val _ret = __method_bind.actionHasEvent.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun actionSetDeadzone(action: String, deadzone: Float) {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(deadzone)
    __method_bind.actionSetDeadzone.call(this._handle, _args.toVariant(), 2)
  }

  fun addAction(action: String, deadzone: Float) {
    val _args = VariantArray.new()
    _args.append(action)
    _args.append(deadzone)
    __method_bind.addAction.call(this._handle, _args.toVariant(), 2)
  }

  fun eraseAction(action: String) {
    val _arg = Variant.new(action)
    __method_bind.eraseAction.call(this._handle, _arg, 1)
  }

  fun eventIsAction(event: InputEvent, action: String): Boolean {
    val _args = VariantArray.new()
    _args.append(event)
    _args.append(action)
    val _ret = __method_bind.eventIsAction.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun getActionList(action: String): VariantArray {
    val _arg = Variant.new(action)
    val _ret = __method_bind.getActionList.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getActions(): VariantArray {
    val _ret = __method_bind.getActions.call(this._handle)
    return _ret.asVariantArray()
  }

  fun hasAction(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.hasAction.call(this._handle, _arg, 1)
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
        InputMap(
          handle
        )
      }
    /**
     * Container for method_bind pointers for InputMap
     */
    private object __method_bind {
      val actionAddEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "actionAddEvent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method actionAddEvent" }
        }
      val actionEraseEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "actionEraseEvent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method actionEraseEvent" }
        }
      val actionEraseEvents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "actionEraseEvents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method actionEraseEvents" }
        }
      val actionHasEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "actionHasEvent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method actionHasEvent" }
        }
      val actionSetDeadzone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "actionSetDeadzone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method actionSetDeadzone" }
        }
      val addAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "addAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addAction" }
        }
      val eraseAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "eraseAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eraseAction" }
        }
      val eventIsAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "eventIsAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eventIsAction" }
        }
      val getActionList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "getActionList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getActionList" }
        }
      val getActions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "getActions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getActions" }
        }
      val hasAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "hasAction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAction" }
        }
      val loadFromGlobals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputMap".cstr.ptr,
            "loadFromGlobals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method loadFromGlobals" }
        }}
  }
}
