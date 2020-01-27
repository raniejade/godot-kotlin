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

open class AudioEffectRecord internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getFormat(): AudioStreamSample.Format {
    val _ret = __method_bind.get_format.call(this.toVariant())
    TODO()
  }

  fun getRecording(): AudioStreamSample {
    val _ret = __method_bind.get_recording.call(this.toVariant())
    TODO()
  }

  fun isRecordingActive(): Boolean {
    val _ret = __method_bind.is_recording_active.call(this.toVariant())
    TODO()
  }

  fun setFormat(format: Int) {
    val _args = VariantArray.new()
    _args.append(format)
    val _ret = __method_bind.set_format.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRecordingActive(record: Boolean) {
    val _args = VariantArray.new()
    _args.append(record)
    val _ret = __method_bind.set_recording_active.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): AudioEffectRecord = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectRecord".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectRecord" }
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
      val get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val get_recording: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
              "get_recording".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_recording" }
            }
          }

      val is_recording_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
              "is_recording_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_recording_active" }
            }
          }

      val set_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
              "set_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_format" }
            }
          }

      val set_recording_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectRecord".cstr.ptr,
              "set_recording_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_recording_active" }
            }
          }
    }
  }
}
