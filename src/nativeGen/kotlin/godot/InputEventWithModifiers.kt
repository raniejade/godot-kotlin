// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventWithModifiers(
  _handle: COpaquePointer
) : InputEvent(_handle) {
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
    val _arg = Variant.new(enable)
    __method_bind.setAlt.call(this._handle, _arg, 1)
  }

  fun setCommand(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCommand.call(this._handle, _arg, 1)
  }

  fun setControl(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setControl.call(this._handle, _arg, 1)
  }

  fun setMetakey(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setMetakey.call(this._handle, _arg, 1)
  }

  fun setShift(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setShift.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEventWithModifiers
     */
    private object __method_bind {
      val getAlt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "getAlt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAlt" }
        }
      val getCommand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "getCommand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCommand" }
        }
      val getControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "getControl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getControl" }
        }
      val getMetakey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "getMetakey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMetakey" }
        }
      val getShift: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "getShift".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShift" }
        }
      val setAlt: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "setAlt".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlt" }
        }
      val setCommand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "setCommand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCommand" }
        }
      val setControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "setControl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setControl" }
        }
      val setMetakey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "setMetakey".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMetakey" }
        }
      val setShift: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventWithModifiers".cstr.ptr,
            "setShift".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShift" }
        }}
  }
}
