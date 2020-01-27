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

open class AudioEffectPitchShift internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getPitchScale(): Float {
    val _ret = __method_bind.get_pitch_scale.call(this._handle)
    return _ret.asFloat()
  }

  fun setPitchScale(rate: Float) {
    val _arg = Variant.new(rate)
    __method_bind.set_pitch_scale.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectPitchShift = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPitchShift".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectPitchShift" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectPitchShift(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectPitchShift = AudioEffectPitchShift(ptr)
    /**
     * Container for method_bind pointers for AudioEffectPitchShift
     */
    private object __method_bind {
      val get_pitch_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "get_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pitch_scale" }
        }
      val set_pitch_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPitchShift".cstr.ptr,
            "set_pitch_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pitch_scale" }
        }}
  }
}
