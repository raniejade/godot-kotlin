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
  fun getChannel(): Int {
    val _ret = __method_bind.get_channel.call(this._handle)
    return _ret.asInt()
  }

  fun getControllerNumber(): Int {
    val _ret = __method_bind.get_controller_number.call(this._handle)
    return _ret.asInt()
  }

  fun getControllerValue(): Int {
    val _ret = __method_bind.get_controller_value.call(this._handle)
    return _ret.asInt()
  }

  fun getInstrument(): Int {
    val _ret = __method_bind.get_instrument.call(this._handle)
    return _ret.asInt()
  }

  fun getMessage(): Int {
    val _ret = __method_bind.get_message.call(this._handle)
    return _ret.asInt()
  }

  fun getPitch(): Int {
    val _ret = __method_bind.get_pitch.call(this._handle)
    return _ret.asInt()
  }

  fun getPressure(): Int {
    val _ret = __method_bind.get_pressure.call(this._handle)
    return _ret.asInt()
  }

  fun getVelocity(): Int {
    val _ret = __method_bind.get_velocity.call(this._handle)
    return _ret.asInt()
  }

  fun setChannel(channel: Int) {
    val _arg = Variant.new(channel)
    __method_bind.set_channel.call(this._handle, _arg, 1)
  }

  fun setControllerNumber(controllerNumber: Int) {
    val _arg = Variant.new(controllerNumber)
    __method_bind.set_controller_number.call(this._handle, _arg, 1)
  }

  fun setControllerValue(controllerValue: Int) {
    val _arg = Variant.new(controllerValue)
    __method_bind.set_controller_value.call(this._handle, _arg, 1)
  }

  fun setInstrument(instrument: Int) {
    val _arg = Variant.new(instrument)
    __method_bind.set_instrument.call(this._handle, _arg, 1)
  }

  fun setMessage(message: Int) {
    val _arg = Variant.new(message)
    __method_bind.set_message.call(this._handle, _arg, 1)
  }

  fun setPitch(pitch: Int) {
    val _arg = Variant.new(pitch)
    __method_bind.set_pitch.call(this._handle, _arg, 1)
  }

  fun setPressure(pressure: Int) {
    val _arg = Variant.new(pressure)
    __method_bind.set_pressure.call(this._handle, _arg, 1)
  }

  fun setVelocity(velocity: Int) {
    val _arg = Variant.new(velocity)
    __method_bind.set_velocity.call(this._handle, _arg, 1)
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
      val get_channel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_channel" }
        }
      val get_controller_number: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_controller_number".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_number" }
        }
      val get_controller_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_controller_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_controller_value" }
        }
      val get_instrument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_instrument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instrument" }
        }
      val get_message: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_message".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_message" }
        }
      val get_pitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_pitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pitch" }
        }
      val get_pressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_pressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressure" }
        }
      val get_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "get_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_velocity" }
        }
      val set_channel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_channel" }
        }
      val set_controller_number: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_controller_number".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_controller_number" }
        }
      val set_controller_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_controller_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_controller_value" }
        }
      val set_instrument: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_instrument".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instrument" }
        }
      val set_message: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_message".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_message" }
        }
      val set_pitch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_pitch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pitch" }
        }
      val set_pressure: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_pressure".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pressure" }
        }
      val set_velocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
            "set_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_velocity" }
        }}
  }
}
