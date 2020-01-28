// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMIDI(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  var channel: Int
    get() {
       return getChannel() 
    }
    set(value) {
      setChannel(value)
    }

  var controllerNumber: Int
    get() {
       return getControllerNumber() 
    }
    set(value) {
      setControllerNumber(value)
    }

  var controllerValue: Int
    get() {
       return getControllerValue() 
    }
    set(value) {
      setControllerValue(value)
    }

  var instrument: Int
    get() {
       return getInstrument() 
    }
    set(value) {
      setInstrument(value)
    }

  var message: Int
    get() {
       return getMessage() 
    }
    set(value) {
      setMessage(value)
    }

  var pitch: Int
    get() {
       return getPitch() 
    }
    set(value) {
      setPitch(value)
    }

  var pressure: Int
    get() {
       return getPressure() 
    }
    set(value) {
      setPressure(value)
    }

  var velocity: Int
    get() {
       return getVelocity() 
    }
    set(value) {
      setVelocity(value)
    }

  fun getChannel(): Int {
    val _ret = __method_bind.getChannel.call(this._handle)
    return _ret.asInt()
  }

  fun getControllerNumber(): Int {
    val _ret = __method_bind.getControllerNumber.call(this._handle)
    return _ret.asInt()
  }

  fun getControllerValue(): Int {
    val _ret = __method_bind.getControllerValue.call(this._handle)
    return _ret.asInt()
  }

  fun getInstrument(): Int {
    val _ret = __method_bind.getInstrument.call(this._handle)
    return _ret.asInt()
  }

  fun getMessage(): Int {
    val _ret = __method_bind.getMessage.call(this._handle)
    return _ret.asInt()
  }

  fun getPitch(): Int {
    val _ret = __method_bind.getPitch.call(this._handle)
    return _ret.asInt()
  }

  fun getPressure(): Int {
    val _ret = __method_bind.getPressure.call(this._handle)
    return _ret.asInt()
  }

  fun getVelocity(): Int {
    val _ret = __method_bind.getVelocity.call(this._handle)
    return _ret.asInt()
  }

  fun setChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.setChannel.call(this._handle, _arg, 1)
  }

  fun setControllerNumber(controllerNumber: Int) {
    val _arg = Variant.new(controllerNumber)
    __method_bind.setControllerNumber.call(this._handle, _arg, 1)
  }

  fun setControllerValue(controllerValue: Int) {
    val _arg = Variant.new(controllerValue)
    __method_bind.setControllerValue.call(this._handle, _arg, 1)
  }

  fun setInstrument(instrument: Int) {
    val _arg = Variant.new(instrument)
    __method_bind.setInstrument.call(this._handle, _arg, 1)
  }

  fun setMessage(message: Int) {
    val _arg = Variant.new(message)
    __method_bind.setMessage.call(this._handle, _arg, 1)
  }

  fun setPitch(pitch: Int) {
    val _arg = Variant.new(pitch)
    __method_bind.setPitch.call(this._handle, _arg, 1)
  }

  fun setPressure(pressure: Int) {
    val _arg = Variant.new(pressure)
    __method_bind.setPressure.call(this._handle, _arg, 1)
  }

  fun setVelocity(velocity: Int) {
    val _arg = Variant.new(velocity)
    __method_bind.setVelocity.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): InputEventMIDI = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMIDI".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMIDI" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventMIDI(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventMIDI = InputEventMIDI(ptr)
    /**
     * Container for method_bind pointers for InputEventMIDI
     */
    private object __method_bind {
      val getChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getChannel" }
        }
      val getControllerNumber: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getControllerNumber".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getControllerNumber" }
        }
      val getControllerValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getControllerValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getControllerValue" }
        }
      val getInstrument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getInstrument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInstrument" }
        }
      val getMessage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getMessage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMessage" }
        }
      val getPitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getPitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPitch" }
        }
      val getPressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getPressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPressure" }
        }
      val getVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "getVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVelocity" }
        }
      val setChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setChannel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setChannel" }
        }
      val setControllerNumber: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setControllerNumber".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setControllerNumber" }
        }
      val setControllerValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setControllerValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setControllerValue" }
        }
      val setInstrument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setInstrument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInstrument" }
        }
      val setMessage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setMessage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMessage" }
        }
      val setPitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setPitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPitch" }
        }
      val setPressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setPressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPressure" }
        }
      val setVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "setVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVelocity" }
        }}
  }
}
