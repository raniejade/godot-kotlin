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

open class EditorSpinSlider(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
  var flat: Boolean
    get() {
       return isFlat() 
    }
    set(value) {
      setFlat(value)
    }

  var label: String
    get() {
       return getLabel() 
    }
    set(value) {
      setLabel(value)
    }

  var readOnly: Boolean
    get() {
       return isReadOnly() 
    }
    set(value) {
      setReadOnly(value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _grabber_gui_input(arg0: InputEvent) {
    TODO()
  }

  open fun _grabber_mouse_entered() {
    TODO()
  }

  open fun _grabber_mouse_exited() {
    TODO()
  }

  open fun _value_focus_exited() {
    TODO()
  }

  open fun _value_input_closed() {
    TODO()
  }

  open fun _value_input_entered(arg0: String) {
    TODO()
  }

  fun getLabel(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLabel.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isFlat(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFlat.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isReadOnly(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isReadOnly.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setFlat(flat: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlat.call(self._handle, listOf(flat), null)
    }
  }

  fun setLabel(label: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLabel.call(self._handle, listOf(label), null)
    }
  }

  fun setReadOnly(readOnly: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReadOnly.call(self._handle, listOf(readOnly), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSpinSlider
     */
    private object __method_bind {
      val getLabel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "get_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_label" }
        }
      val isFlat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "is_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flat" }
        }
      val isReadOnly: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "is_read_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_read_only" }
        }
      val setFlat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "set_flat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flat" }
        }
      val setLabel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "set_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_label" }
        }
      val setReadOnly: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpinSlider".cstr.ptr,
            "set_read_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_read_only" }
        }}
  }
}
