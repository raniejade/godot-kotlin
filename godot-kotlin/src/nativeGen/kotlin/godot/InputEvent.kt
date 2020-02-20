// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
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

open class InputEvent(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var device: Int
    get() {
       return getDevice() 
    }
    set(value) {
      setDevice(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun accumulate(withEvent: InputEvent): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.accumulate.call(self._handle, listOf(withEvent), _retPtr)
      _ret.value
    }
  }

  fun asText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.asText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getActionStrength(action: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getActionStrength.call(self._handle, listOf(action), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDevice(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDevice.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isAction(action: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAction.call(self._handle, listOf(action), _retPtr)
      _ret.value
    }
  }

  fun isActionPressed(action: String, allowEcho: Boolean = false): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(allowEcho)
      __method_bind.isActionPressed.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isActionReleased(action: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isActionReleased.call(self._handle, listOf(action), _retPtr)
      _ret.value
    }
  }

  fun isActionType(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isActionType.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEcho(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEcho.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPressed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPressed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDevice(device: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDevice.call(self._handle, listOf(device), null)
    }
  }

  fun shortcutMatch(event: InputEvent): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.shortcutMatch.call(self._handle, listOf(event), _retPtr)
      _ret.value
    }
  }

  fun xformedBy(xform: Transform2D, localOfs: Vector2 = Vector2(0, 0)): InputEvent {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: InputEvent
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(xform)
      _args.add(localOfs)
      __method_bind.xformedBy.call(self._handle, _args, _retPtr)
      _ret = objectToType<InputEvent>(_tmp.value!!)
      _ret
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEvent
     */
    private object __method_bind {
      val accumulate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "accumulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method accumulate" }
        }
      val asText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method as_text" }
        }
      val getActionStrength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "get_action_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_strength" }
        }
      val getDevice: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "get_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_device" }
        }
      val isAction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action" }
        }
      val isActionPressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_pressed" }
        }
      val isActionReleased: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_released".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_released" }
        }
      val isActionType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_action_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_type" }
        }
      val isEcho: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_echo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_echo" }
        }
      val isPressed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "is_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_pressed" }
        }
      val setDevice: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "set_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_device" }
        }
      val shortcutMatch: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "shortcut_match".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shortcut_match" }
        }
      val xformedBy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEvent".cstr.ptr,
            "xformed_by".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method xformed_by" }
        }}
  }
}
