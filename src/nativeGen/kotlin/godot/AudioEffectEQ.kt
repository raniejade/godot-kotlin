// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectEQ(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getBandCount(): Int {
    val _ret = __method_bind.getBandCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBandGainDb(bandIdx: Int): Float {
    val _arg = Variant.new(bandIdx)
    val _ret = __method_bind.getBandGainDb.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun setBandGainDb(bandIdx: Int, volumeDb: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bandIdx))
    _args.add(Variant.fromAny(volumeDb))
    __method_bind.setBandGainDb.call(this._handle, _args)
  }

  companion object {
    fun new(): AudioEffectEQ = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectEQ".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectEQ" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectEQ(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectEQ = AudioEffectEQ(ptr)
    /**
     * Container for method_bind pointers for AudioEffectEQ
     */
    private object __method_bind {
      val getBandCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
            "get_band_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_band_count" }
        }
      val getBandGainDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
            "get_band_gain_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_band_gain_db" }
        }
      val setBandGainDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
            "set_band_gain_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_band_gain_db" }
        }}
  }
}
