// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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

open class VisualScriptInputAction(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var action: String
    get() {
       return getActionName() 
    }
    set(value) {
      setActionName(value)
    }

  var mode: Mode
    get() {
       return getActionMode() 
    }
    set(value) {
      setActionMode(value.value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getActionMode(): Mode {
    val _ret = __method_bind.getActionMode.call(this._handle)
    return VisualScriptInputAction.Mode.from(_ret.asInt())
  }

  fun getActionName(): String {
    val _ret = __method_bind.getActionName.call(this._handle)
    return _ret.asString()
  }

  fun setActionMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setActionMode.call(this._handle, listOf(_arg))
  }

  fun setActionName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setActionName.call(this._handle, listOf(_arg))
  }

  enum class Mode(
    val value: Int
  ) {
    PRESSED(0),

    RELEASED(1),

    JUST_PRESSED(2),

    JUST_RELEASED(3);

    companion object {
      fun from(value: Int): Mode {
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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptInputAction".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptInputAction" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptInputAction
     */
    private object __method_bind {
      val getActionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "get_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_mode" }
        }
      val getActionName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "get_action_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_name" }
        }
      val setActionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "set_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action_mode" }
        }
      val setActionName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "set_action_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action_name" }
        }}
  }
}
