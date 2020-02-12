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

open class AudioEffectCompressor(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  var attackUs: Float
    get() {
       return getAttackUs() 
    }
    set(value) {
      setAttackUs(value)
    }

  var gain: Float
    get() {
       return getGain() 
    }
    set(value) {
      setGain(value)
    }

  var mix: Float
    get() {
       return getMix() 
    }
    set(value) {
      setMix(value)
    }

  var ratio: Float
    get() {
       return getRatio() 
    }
    set(value) {
      setRatio(value)
    }

  var releaseMs: Float
    get() {
       return getReleaseMs() 
    }
    set(value) {
      setReleaseMs(value)
    }

  var sidechain: String
    get() {
       return getSidechain() 
    }
    set(value) {
      setSidechain(value)
    }

  var threshold: Float
    get() {
       return getThreshold() 
    }
    set(value) {
      setThreshold(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAttackUs(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAttackUs.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getGain(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGain.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMix(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMix.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getReleaseMs(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getReleaseMs.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSidechain(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSidechain.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getThreshold(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getThreshold.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setAttackUs(attackUs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAttackUs.call(self._handle, listOf(attackUs), null)
    }
  }

  fun setGain(gain: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGain.call(self._handle, listOf(gain), null)
    }
  }

  fun setMix(mix: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMix.call(self._handle, listOf(mix), null)
    }
  }

  fun setRatio(ratio: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRatio.call(self._handle, listOf(ratio), null)
    }
  }

  fun setReleaseMs(releaseMs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReleaseMs.call(self._handle, listOf(releaseMs), null)
    }
  }

  fun setSidechain(sidechain: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSidechain.call(self._handle, listOf(sidechain), null)
    }
  }

  fun setThreshold(threshold: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setThreshold.call(self._handle, listOf(threshold), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectCompressor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectCompressor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectCompressor
     */
    private object __method_bind {
      val getAttackUs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_attack_us".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attack_us" }
        }
      val getGain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gain" }
        }
      val getMix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_mix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mix" }
        }
      val getRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ratio" }
        }
      val getReleaseMs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_release_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_release_ms" }
        }
      val getSidechain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_sidechain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sidechain" }
        }
      val getThreshold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_threshold" }
        }
      val setAttackUs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_attack_us".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attack_us" }
        }
      val setGain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gain" }
        }
      val setMix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_mix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mix" }
        }
      val setRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ratio" }
        }
      val setReleaseMs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_release_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_release_ms" }
        }
      val setSidechain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_sidechain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sidechain" }
        }
      val setThreshold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_threshold" }
        }}
  }
}
