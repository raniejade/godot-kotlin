// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class AudioEffectEQ(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBandCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBandCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBandGainDb(bandIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBandGainDb.call(self._handle, listOf(bandIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setBandGainDb(bandIdx: Int, volumeDb: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bandIdx)
      _args.add(volumeDb)
      __method_bind.setBandGainDb.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectEQ".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectEQ" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectEQ
     */
    private object __method_bind {
      val getBandCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
            "get_band_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_band_count" }
        }
      val getBandGainDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
            "get_band_gain_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_band_gain_db" }
        }
      val setBandGainDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
            "set_band_gain_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_band_gain_db" }
        }}
  }
}
