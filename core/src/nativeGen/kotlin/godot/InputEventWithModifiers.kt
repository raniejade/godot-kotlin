// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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
    val _ret = __method_bind.getAlt.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCommand(): Boolean {
    val _ret = __method_bind.getCommand.call(this._handle)
    return _ret.asBoolean()
  }

  fun getControl(): Boolean {
    val _ret = __method_bind.getControl.call(this._handle)
    return _ret.asBoolean()
  }

  fun getMetakey(): Boolean {
    val _ret = __method_bind.getMetakey.call(this._handle)
    return _ret.asBoolean()
  }

  fun getShift(): Boolean {
    val _ret = __method_bind.getShift.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAlt(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setAlt.call(this._handle, listOf(_arg))
  }

  fun setCommand(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCommand.call(this._handle, listOf(_arg))
  }

  fun setControl(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setControl.call(this._handle, listOf(_arg))
  }

  fun setMetakey(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setMetakey.call(this._handle, listOf(_arg))
  }

  fun setShift(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setShift.call(this._handle, listOf(_arg))
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
