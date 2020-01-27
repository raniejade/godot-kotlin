// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioStreamGenerator(
  _handle: COpaquePointer
) : AudioStream(_handle) {
  fun getBufferLength(): Float {
    val _ret = __method_bind.get_buffer_length.call(this._handle)
    return _ret.asFloat()
  }

  fun getMixRate(): Float {
    val _ret = __method_bind.get_mix_rate.call(this._handle)
    return _ret.asFloat()
  }

  fun setBufferLength(seconds: Float) {
    val _arg = Variant.new(seconds)
    __method_bind.set_buffer_length.call(this._handle, _arg, 1)
  }

  fun setMixRate(hz: Float) {
    val _arg = Variant.new(hz)
    __method_bind.set_mix_rate.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioStreamGenerator = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamGenerator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamGenerator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioStreamGenerator(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioStreamGenerator = AudioStreamGenerator(ptr)
    /**
     * Container for method_bind pointers for AudioStreamGenerator
     */
    private object __method_bind {
      val get_buffer_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "get_buffer_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buffer_length" }
        }
      val get_mix_rate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "get_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
        }
      val set_buffer_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "set_buffer_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_buffer_length" }
        }
      val set_mix_rate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
            "set_mix_rate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mix_rate" }
        }}
  }
}
