// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class InputEventMIDI(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEvent(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getChannel(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getChannel.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getControllerNumber(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getControllerNumber.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getControllerValue(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getControllerValue.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInstrument(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInstrument.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMessage(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMessage.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPitch(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPitch.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPressure(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPressure.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVelocity(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVelocity.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setChannel(channel: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setChannel.call(self._handle, listOf(channel), null)
    }
  }

  fun setControllerNumber(controllerNumber: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setControllerNumber.call(self._handle, listOf(controllerNumber), null)
    }
  }

  fun setControllerValue(controllerValue: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setControllerValue.call(self._handle, listOf(controllerValue), null)
    }
  }

  fun setInstrument(instrument: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInstrument.call(self._handle, listOf(instrument), null)
    }
  }

  fun setMessage(message: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMessage.call(self._handle, listOf(message), null)
    }
  }

  fun setPitch(pitch: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPitch.call(self._handle, listOf(pitch), null)
    }
  }

  fun setPressure(pressure: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPressure.call(self._handle, listOf(pressure), null)
    }
  }

  fun setVelocity(velocity: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVelocity.call(self._handle, listOf(velocity), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMIDI".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMIDI" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventMIDI
     */
    private object __method_bind {
      val getChannel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_channel" }
            }
          }

      val getControllerNumber: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_controller_number".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_number" }
            }
          }

      val getControllerValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_controller_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_controller_value" }
            }
          }

      val getInstrument: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_instrument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instrument" }
            }
          }

      val getMessage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_message".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_message" }
            }
          }

      val getPitch: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch" }
            }
          }

      val getPressure: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_pressure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pressure" }
            }
          }

      val getVelocity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "get_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_velocity" }
            }
          }

      val setChannel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_channel" }
            }
          }

      val setControllerNumber: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_controller_number".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_controller_number" }
            }
          }

      val setControllerValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_controller_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_controller_value" }
            }
          }

      val setInstrument: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_instrument".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instrument" }
            }
          }

      val setMessage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_message".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_message" }
            }
          }

      val setPitch: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_pitch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch" }
            }
          }

      val setPressure: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_pressure".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pressure" }
            }
          }

      val setVelocity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMIDI".cstr.ptr,
              "set_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_velocity" }
            }
          }
    }
  }
}
