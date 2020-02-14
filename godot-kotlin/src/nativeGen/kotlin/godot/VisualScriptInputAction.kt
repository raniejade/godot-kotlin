// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getActionMode(): Mode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getActionMode.call(self._handle, emptyList(), _retPtr)
      VisualScriptInputAction.Mode.from(_ret.value)
    }
  }

  fun getActionName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getActionName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun setActionMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActionMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setActionName(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActionName.call(self._handle, listOf(name), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "get_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_mode" }
        }
      val getActionName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "get_action_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_name" }
        }
      val setActionMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "set_action_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action_mode" }
        }
      val setActionName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptInputAction".cstr.ptr,
            "set_action_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_action_name" }
        }}
  }
}
