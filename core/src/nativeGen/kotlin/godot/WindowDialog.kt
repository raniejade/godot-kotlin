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

open class WindowDialog(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Popup(null) {
  var resizable: Boolean
    get() {
       return getResizable() 
    }
    set(value) {
      setResizable(value)
    }

  var windowTitle: String
    get() {
       return getTitle() 
    }
    set(value) {
      setTitle(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCloseButton(): TextureButton {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TextureButton
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCloseButton.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TextureButton>(_tmp.value!!)
      _ret
    }
  }

  fun getResizable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResizable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTitle(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTitle.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun setResizable(resizable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setResizable.call(self._handle, listOf(resizable), null)
    }
  }

  fun setTitle(title: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTitle.call(self._handle, listOf(title), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WindowDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WindowDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WindowDialog
     */
    private object __method_bind {
      val getCloseButton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_close_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_close_button" }
        }
      val getResizable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resizable" }
        }
      val getTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_title" }
        }
      val setResizable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "set_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_resizable" }
        }
      val setTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "set_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_title" }
        }}
  }
}
