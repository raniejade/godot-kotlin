// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectRecord(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  var format: Int
    get() {
       return AudioStreamSample.Format.from(getFormat()) 
    }
    set(value) {
      setFormat(AudioStreamSample.Format.from(value))
    }

  fun getFormat(): AudioStreamSample.Format {
    val _ret = __method_bind.getFormat.call(this._handle)
    return AudioStreamSample.Format.from(_ret.asInt())
  }

  fun getRecording(): AudioStreamSample {
    val _ret = __method_bind.getRecording.call(this._handle)
    return _ret.asObject(::AudioStreamSample)!!
  }

  fun isRecordingActive(): Boolean {
    val _ret = __method_bind.isRecordingActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun setFormat(format: Int) {
    val _arg = Variant.new(format)
    __method_bind.setFormat.call(this._handle, _arg, 1)
  }

  fun setRecordingActive(record: Boolean) {
    val _arg = Variant.new(record)
    __method_bind.setRecordingActive.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectRecord = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectRecord".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectRecord" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectRecord(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectRecord = AudioEffectRecord(ptr)
    /**
     * Container for method_bind pointers for AudioEffectRecord
     */
    private object __method_bind {
      val getFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "getFormat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFormat" }
        }
      val getRecording: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "getRecording".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRecording" }
        }
      val isRecordingActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "isRecordingActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRecordingActive" }
        }
      val setFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "setFormat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFormat" }
        }
      val setRecordingActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
            "setRecordingActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRecordingActive" }
        }}
  }
}
