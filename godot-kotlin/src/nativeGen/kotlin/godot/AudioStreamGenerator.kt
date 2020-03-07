// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBufferLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBufferLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMixRate(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMixRate.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setBufferLength(seconds: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBufferLength.call(self._handle, listOf(seconds), null)
    }
  }

  fun setMixRate(hz: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMixRate.call(self._handle, listOf(hz), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
      val getBufferLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
              "get_buffer_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_buffer_length" }
            }
          }

      val getMixRate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
              "get_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
            }
          }

      val setBufferLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
              "set_buffer_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_buffer_length" }
            }
          }

      val setMixRate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamGenerator".cstr.ptr,
              "set_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mix_rate" }
            }
          }
    }
  }
}
