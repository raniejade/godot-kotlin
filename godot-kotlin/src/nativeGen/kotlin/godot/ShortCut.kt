// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class ShortCut(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var shortcut: InputEvent
    get() {
       return getShortcut() 
    }
    set(value) {
      setShortcut(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAsText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAsText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getShortcut(): InputEvent {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: InputEvent
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getShortcut.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<InputEvent>(_tmp.value!!)
      _ret
    }
  }

  fun isShortcut(event: InputEvent): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShortcut.call(self._handle, listOf(event), _retPtr)
      _ret.value
    }
  }

  fun isValid(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isValid.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setShortcut(event: InputEvent) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShortcut.call(self._handle, listOf(event), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShortCut".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ShortCut" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ShortCut
     */
    private object __method_bind {
      val getAsText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "get_as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_text" }
        }
      val getShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "get_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
        }
      val isShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "is_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut" }
        }
      val isValid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val setShortcut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "set_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
        }}
  }
}
