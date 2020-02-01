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
    __method_bind.setChannel.call(this._handle, listOf(_arg))
  }

  fun setControllerNumber(controllerNumber: Int) {
    val _arg = Variant.new(controllerNumber)
    __method_bind.setControllerNumber.call(this._handle, listOf(_arg))
  }

  fun setControllerValue(controllerValue: Int) {
    val _arg = Variant.new(controllerValue)
    __method_bind.setControllerValue.call(this._handle, listOf(_arg))
  }

  fun setInstrument(instrument: Int) {
    val _arg = Variant.new(instrument)
    __method_bind.setInstrument.call(this._handle, listOf(_arg))
  }

  fun setMessage(message: Int) {
    val _arg = Variant.new(message)
    __method_bind.setMessage.call(this._handle, listOf(_arg))
  }

  fun setPitch(pitch: Int) {
    val _arg = Variant.new(pitch)
    __method_bind.setPitch.call(this._handle, listOf(_arg))
  }

  fun setPressure(pressure: Int) {
    val _arg = Variant.new(pressure)
    __method_bind.setPressure.call(this._handle, listOf(_arg))
  }

  fun setVelocity(velocity: Int) {
    val _arg = Variant.new(velocity)
    __method_bind.setVelocity.call(this._handle, listOf(_arg))
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
            "get_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_channel" }
        }
      val getControllerNumber: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_controller_number".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_number" }
        }
      val getControllerValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_controller_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_value" }
        }
      val getInstrument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_instrument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instrument" }
        }
      val getMessage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_message".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_message" }
        }
      val getPitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_pitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pitch" }
        }
      val getPressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_pressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressure" }
        }
      val getVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_velocity" }
        }
      val setChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_channel" }
        }
      val setControllerNumber: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_controller_number".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_controller_number" }
        }
      val setControllerValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_controller_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_controller_value" }
        }
      val setInstrument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_instrument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instrument" }
        }
      val setMessage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_message".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_message" }
        }
      val setPitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_pitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pitch" }
        }
      val setPressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_pressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressure" }
        }
      val setVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_velocity" }
        }}
  }
}
