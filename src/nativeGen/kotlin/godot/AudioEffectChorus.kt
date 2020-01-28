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
            "getDry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDry" }
        }
      val getVoiceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getVoiceCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVoiceCount" }
        }
      val getVoiceCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getVoiceCutoffHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVoiceCutoffHz" }
        }
      val getVoiceDelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getVoiceDelayMs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVoiceDelayMs" }
        }
      val getVoiceDepthMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getVoiceDepthMs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVoiceDepthMs" }
        }
      val getVoiceLevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getVoiceLevelDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVoiceLevelDb" }
        }
      val getVoicePan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getVoicePan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVoicePan" }
        }
      val getVoiceRateHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getVoiceRateHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVoiceRateHz" }
        }
      val getWet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "getWet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWet" }
        }
      val setDry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setDry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDry" }
        }
      val setVoiceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setVoiceCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVoiceCount" }
        }
      val setVoiceCutoffHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setVoiceCutoffHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVoiceCutoffHz" }
        }
      val setVoiceDelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setVoiceDelayMs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVoiceDelayMs" }
        }
      val setVoiceDepthMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setVoiceDepthMs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVoiceDepthMs" }
        }
      val setVoiceLevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setVoiceLevelDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVoiceLevelDb" }
        }
      val setVoicePan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setVoicePan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVoicePan" }
        }
      val setVoiceRateHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setVoiceRateHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVoiceRateHz" }
        }
      val setWet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "setWet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWet" }
        }}
  }
}
