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

open class InputEventWithModifiers(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEvent(null) {
  var alt: Boolean
    get() {
       return getAlt() 
    }
    set(value) {
      setAlt(value)
    }

  var command: Boolean
    get() {
       return getCommand() 
    }
    set(value) {
      setCommand(value)
    }

  var control: Boolean
    get() {
       return getControl() 
    }
    set(value) {
      setControl(value)
    }

  var meta: Boolean
    get() {
       return getMetakey() 
    }
    set(value) {
      setMetakey(value)
    }

  var shift: Boolean
    get() {
       return getShift() 
    }
    set(value) {
      setShift(value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAlt(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAlt.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCommand(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCommand.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getControl(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getControl.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMetakey(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMetakey.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getShift(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShift.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAlt(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlt.call(self._handle, listOf(enable), null)
    }
  }

  fun setCommand(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCommand.call(self._handle, listOf(enable), null)
    }
  }

  fun setControl(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setControl.call(self._handle, listOf(enable), null)
    }
  }

  fun setMetakey(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMetakey.call(self._handle, listOf(enable), null)
    }
  }

  fun setShift(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShift.call(self._handle, listOf(enable), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEventWithModifiers
     */
    private object __method_bind {
      val getAlt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "get_alt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_alt" }
        }
      val getCommand: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "get_command".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_command" }
        }
      val getControl: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "get_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_control" }
        }
      val getMetakey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "get_metakey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_metakey" }
        }
      val getShift: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "get_shift".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shift" }
        }
      val setAlt: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "set_alt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_alt" }
        }
      val setCommand: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "set_command".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_command" }
        }
      val setControl: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "set_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_control" }
        }
      val setMetakey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "set_metakey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_metakey" }
        }
      val setShift: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "set_shift".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shift" }
        }}
  }
}
