// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class SpinBox(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
  var align: LineEdit.Align
    get() {
       return getAlign() 
    }
    set(value) {
      setAlign(value.value)
    }

  var editable: Boolean
    get() {
       return isEditable() 
    }
    set(value) {
      setEditable(value)
    }

  var prefix: String
    get() {
       return getPrefix() 
    }
    set(value) {
      setPrefix(value)
    }

  var suffix: String
    get() {
       return getSuffix() 
    }
    set(value) {
      setSuffix(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun apply() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.apply.call(self._handle, emptyList(), null)
    }
  }

  fun getAlign(): LineEdit.Align {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAlign.call(self._handle, emptyList(), _retPtr)
      LineEdit.Align.from(_ret.value)
    }
  }

  fun getLineEdit(): LineEdit {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: LineEdit
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLineEdit.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<LineEdit>(_tmp.value!!)
      _ret
    }
  }

  fun getPrefix(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPrefix.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSuffix(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSuffix.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isEditable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAlign(align: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlign.call(self._handle, listOf(align), null)
    }
  }

  fun setEditable(editable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditable.call(self._handle, listOf(editable), null)
    }
  }

  fun setPrefix(prefix: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPrefix.call(self._handle, listOf(prefix), null)
    }
  }

  fun setSuffix(suffix: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSuffix.call(self._handle, listOf(suffix), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpinBox".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpinBox" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpinBox
     */
    private object __method_bind {
      val apply: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "apply".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply" }
        }
      val getAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_align" }
        }
      val getLineEdit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_line_edit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_edit" }
        }
      val getPrefix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_prefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_prefix" }
        }
      val getSuffix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "get_suffix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_suffix" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "is_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editable" }
        }
      val setAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_align" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editable" }
        }
      val setPrefix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_prefix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_prefix" }
        }
      val setSuffix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpinBox".cstr.ptr,
            "set_suffix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_suffix" }
        }}
  }
}
