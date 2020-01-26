// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectPitchShift internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getPitchScale(): Float {
    TODO()
  }

  fun setPitchScale(rate: Float) {
    TODO()
  }

  companion object {
    fun new(): AudioEffectPitchShift = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPitchShift".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectPitchShift" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectPitchShift(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectPitchShift
     */
    private object __method_bind {
      val get_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "get_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
            }
          }

      val set_pitch_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
              "set_pitch_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
            }
          }
    }
  }
}
