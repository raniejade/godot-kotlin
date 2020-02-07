// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class AudioStreamGenerator(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioStream(null) {
  var bufferLength: Float
    get() {
       return getBufferLength() 
    }
    set(value) {
      setBufferLength(value)
    }

  var mixRate: Float
    get() {
       return getMixRate() 
    }
    set(value) {
      setMixRate(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getBufferLength(): Float {
    val _ret = __method_bind.getBufferLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getMixRate(): Float {
    val _ret = __method_bind.getMixRate.call(this._handle)
    return _ret.asFloat()
  }

  fun setBufferLength(seconds: Float) {
    val _arg = Variant(seconds)
    __method_bind.setBufferLength.call(this._handle, listOf(_arg))
  }

  fun setMixRate(hz: Float) {
    val _arg = Variant(hz)
    __method_bind.setMixRate.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamGenerator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamGenerator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioStreamGenerator
     */
    private object __method_bind {
      val getBufferLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "get_buffer_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buffer_length" }
        }
      val getMixRate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "get_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
        }
      val setBufferLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "set_buffer_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_buffer_length" }
        }
      val setMixRate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "set_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mix_rate" }
        }}
  }
}
