// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectChorus(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  var dry: Float
    get() {
       return getDry() 
    }
    set(value) {
      setDry(value)
    }

  var voice1CutoffHz: Float
    get() {
       return getVoiceCutoffHz(0) 
    }
    set(value) {
      setVoiceCutoffHz(0, value)
    }

  var voice1DelayMs: Float
    get() {
       return getVoiceDelayMs(0) 
    }
    set(value) {
      setVoiceDelayMs(0, value)
    }

  var voice1DepthMs: Float
    get() {
       return getVoiceDepthMs(0) 
    }
    set(value) {
      setVoiceDepthMs(0, value)
    }

  var voice1LevelDb: Float
    get() {
       return getVoiceLevelDb(0) 
    }
    set(value) {
      setVoiceLevelDb(0, value)
    }

  var voice1Pan: Float
    get() {
       return getVoicePan(0) 
    }
    set(value) {
      setVoicePan(0, value)
    }

  var voice1RateHz: Float
    get() {
       return getVoiceRateHz(0) 
    }
    set(value) {
      setVoiceRateHz(0, value)
    }

  var voice2CutoffHz: Float
    get() {
       return getVoiceCutoffHz(1) 
    }
    set(value) {
      setVoiceCutoffHz(1, value)
    }

  var voice2DelayMs: Float
    get() {
       return getVoiceDelayMs(1) 
    }
    set(value) {
      setVoiceDelayMs(1, value)
    }

  var voice2DepthMs: Float
    get() {
       return getVoiceDepthMs(1) 
    }
    set(value) {
      setVoiceDepthMs(1, value)
    }

  var voice2LevelDb: Float
    get() {
       return getVoiceLevelDb(1) 
    }
    set(value) {
      setVoiceLevelDb(1, value)
    }

  var voice2Pan: Float
    get() {
       return getVoicePan(1) 
    }
    set(value) {
      setVoicePan(1, value)
    }

  var voice2RateHz: Float
    get() {
       return getVoiceRateHz(1) 
    }
    set(value) {
      setVoiceRateHz(1, value)
    }

  var voice3CutoffHz: Float
    get() {
       return getVoiceCutoffHz(2) 
    }
    set(value) {
      setVoiceCutoffHz(2, value)
    }

  var voice3DelayMs: Float
    get() {
       return getVoiceDelayMs(2) 
    }
    set(value) {
      setVoiceDelayMs(2, value)
    }

  var voice3DepthMs: Float
    get() {
       return getVoiceDepthMs(2) 
    }
    set(value) {
      setVoiceDepthMs(2, value)
    }

  var voice3LevelDb: Float
    get() {
       return getVoiceLevelDb(2) 
    }
    set(value) {
      setVoiceLevelDb(2, value)
    }

  var voice3Pan: Float
    get() {
       return getVoicePan(2) 
    }
    set(value) {
      setVoicePan(2, value)
    }

  var voice3RateHz: Float
    get() {
       return getVoiceRateHz(2) 
    }
    set(value) {
      setVoiceRateHz(2, value)
    }

  var voice4CutoffHz: Float
    get() {
       return getVoiceCutoffHz(3) 
    }
    set(value) {
      setVoiceCutoffHz(3, value)
    }

  var voice4DelayMs: Float
    get() {
       return getVoiceDelayMs(3) 
    }
    set(value) {
      setVoiceDelayMs(3, value)
    }

  var voice4DepthMs: Float
    get() {
       return getVoiceDepthMs(3) 
    }
    set(value) {
      setVoiceDepthMs(3, value)
    }

  var voice4LevelDb: Float
    get() {
       return getVoiceLevelDb(3) 
    }
    set(value) {
      setVoiceLevelDb(3, value)
    }

  var voice4Pan: Float
    get() {
       return getVoicePan(3) 
    }
    set(value) {
      setVoicePan(3, value)
    }

  var voice4RateHz: Float
    get() {
       return getVoiceRateHz(3) 
    }
    set(value) {
      setVoiceRateHz(3, value)
    }

  var voiceCount: Int
    get() {
       return getVoiceCount() 
    }
    set(value) {
      setVoiceCount(value)
    }

  var wet: Float
    get() {
       return getWet() 
    }
    set(value) {
      setWet(value)
    }

  fun getDry(): Float {
    val _ret = __method_bind.getDry.call(this._handle)
    return _ret.asFloat()
  }

  fun getVoiceCount(): Int {
    val _ret = __method_bind.getVoiceCount.call(this._handle)
    return _ret.asInt()
  }

  fun getVoiceCutoffHz(voiceIdx: Int): Float {
    val _arg = Variant.new(voiceIdx)
    val _ret = __method_bind.getVoiceCutoffHz.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getVoiceDelayMs(voiceIdx: Int): Float {
    val _arg = Variant.new(voiceIdx)
    val _ret = __method_bind.getVoiceDelayMs.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getVoiceDepthMs(voiceIdx: Int): Float {
    val _arg = Variant.new(voiceIdx)
    val _ret = __method_bind.getVoiceDepthMs.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getVoiceLevelDb(voiceIdx: Int): Float {
    val _arg = Variant.new(voiceIdx)
    val _ret = __method_bind.getVoiceLevelDb.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getVoicePan(voiceIdx: Int): Float {
    val _arg = Variant.new(voiceIdx)
    val _ret = __method_bind.getVoicePan.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getVoiceRateHz(voiceIdx: Int): Float {
    val _arg = Variant.new(voiceIdx)
    val _ret = __method_bind.getVoiceRateHz.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getWet(): Float {
    val _ret = __method_bind.getWet.call(this._handle)
    return _ret.asFloat()
  }

  fun setDry(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setDry.call(this._handle, _arg, 1)
  }

  fun setVoiceCount(voices: Int) {
    val _arg = Variant.new(voices)
    __method_bind.setVoiceCount.call(this._handle, _arg, 1)
  }

  fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(cutoffHz)
    __method_bind.setVoiceCutoffHz.call(this._handle, _args.toVariant(), 2)
  }

  fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(delayMs)
    __method_bind.setVoiceDelayMs.call(this._handle, _args.toVariant(), 2)
  }

  fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(depthMs)
    __method_bind.setVoiceDepthMs.call(this._handle, _args.toVariant(), 2)
  }

  fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(levelDb)
    __method_bind.setVoiceLevelDb.call(this._handle, _args.toVariant(), 2)
  }

  fun setVoicePan(voiceIdx: Int, pan: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(pan)
    __method_bind.setVoicePan.call(this._handle, _args.toVariant(), 2)
  }

  fun setVoiceRateHz(voiceIdx: Int, rateHz: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(rateHz)
    __method_bind.setVoiceRateHz.call(this._handle, _args.toVariant(), 2)
  }

  fun setWet(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setWet.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectChorus = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectChorus".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectChorus" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectChorus(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectChorus = AudioEffectChorus(ptr)
    /**
     * Container for method_bind pointers for AudioEffectChorus
     */
    private object __method_bind {
      val getDry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dry" }
        }
      val getVoiceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_count" }
        }
      val getVoiceCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_cutoff_hz" }
        }
      val getVoiceDelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_delay_ms" }
        }
      val getVoiceDepthMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_depth_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_depth_ms" }
        }
      val getVoiceLevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_level_db" }
        }
      val getVoicePan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_pan" }
        }
      val getVoiceRateHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_rate_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_rate_hz" }
        }
      val getWet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wet" }
        }
      val setDry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dry" }
        }
      val setVoiceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_count" }
        }
      val setVoiceCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_cutoff_hz" }
        }
      val setVoiceDelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_delay_ms" }
        }
      val setVoiceDepthMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_depth_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_depth_ms" }
        }
      val setVoiceLevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_level_db" }
        }
      val setVoicePan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_pan" }
        }
      val setVoiceRateHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_rate_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_rate_hz" }
        }
      val setWet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wet" }
        }}
  }
}
