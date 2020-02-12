// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class AudioEffectRecord(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  var format: AudioStreamSample.Format
    get() {
       return getFormat() 
    }
    set(value) {
      setFormat(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFormat(): AudioStreamSample.Format {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFormat.call(self._handle, emptyList(), _retPtr)
      AudioStreamSample.Format.from(_ret.value)
    }
  }

  fun getRecording(): AudioStreamSample {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: AudioStreamSample
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getRecording.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<AudioStreamSample>(_tmp.value!!)
      _ret
    }
  }

  fun isRecordingActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRecordingActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setFormat(format: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFormat.call(self._handle, listOf(format), null)
    }
  }

  fun setRecordingActive(record: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRecordingActive.call(self._handle, listOf(record), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectRecord".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectRecord" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectRecord
     */
    private object __method_bind {
      val getFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val getRecording: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "get_recording".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_recording" }
        }
      val isRecordingActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "is_recording_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_recording_active" }
        }
      val setFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "set_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_format" }
        }
      val setRecordingActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "set_recording_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_recording_active" }
        }}
  }
}
