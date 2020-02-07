// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
  }

  fun getAttackUs(): Float {
    val _ret = __method_bind.getAttackUs.call(this._handle)
    return _ret.asFloat()
  }

  fun getGain(): Float {
    val _ret = __method_bind.getGain.call(this._handle)
    return _ret.asFloat()
  }

  fun getMix(): Float {
    val _ret = __method_bind.getMix.call(this._handle)
    return _ret.asFloat()
  }

  fun getRatio(): Float {
    val _ret = __method_bind.getRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getReleaseMs(): Float {
    val _ret = __method_bind.getReleaseMs.call(this._handle)
    return _ret.asFloat()
  }

  fun getSidechain(): String {
    val _ret = __method_bind.getSidechain.call(this._handle)
    return _ret.asString()
  }

  fun getThreshold(): Float {
    val _ret = __method_bind.getThreshold.call(this._handle)
    return _ret.asFloat()
  }

  fun setAttackUs(attackUs: Float) {
    val _arg = Variant(attackUs)
    __method_bind.setAttackUs.call(this._handle, listOf(_arg))
  }

  fun setGain(gain: Float) {
    val _arg = Variant(gain)
    __method_bind.setGain.call(this._handle, listOf(_arg))
  }

  fun setMix(mix: Float) {
    val _arg = Variant(mix)
    __method_bind.setMix.call(this._handle, listOf(_arg))
  }

  fun setRatio(ratio: Float) {
    val _arg = Variant(ratio)
    __method_bind.setRatio.call(this._handle, listOf(_arg))
  }

  fun setReleaseMs(releaseMs: Float) {
    val _arg = Variant(releaseMs)
    __method_bind.setReleaseMs.call(this._handle, listOf(_arg))
  }

  fun setSidechain(sidechain: String) {
    val _arg = Variant(sidechain)
    __method_bind.setSidechain.call(this._handle, listOf(_arg))
  }

  fun setThreshold(threshold: Float) {
    val _arg = Variant(threshold)
    __method_bind.setThreshold.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_attack_us".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attack_us" }
        }
      val getGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gain" }
        }
      val getMix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_mix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mix" }
        }
      val getRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ratio" }
        }
      val getReleaseMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_release_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_release_ms" }
        }
      val getSidechain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_sidechain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sidechain" }
        }
      val getThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "get_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_threshold" }
        }
      val setAttackUs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_attack_us".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attack_us" }
        }
      val setGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_gain" }
        }
      val setMix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_mix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mix" }
        }
      val setRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ratio" }
        }
      val setReleaseMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_release_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_release_ms" }
        }
      val setSidechain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_sidechain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sidechain" }
        }
      val setThreshold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
            "set_threshold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_threshold" }
        }}
  }
}
