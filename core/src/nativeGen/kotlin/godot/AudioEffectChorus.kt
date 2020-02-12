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

open class AudioEffectChorus(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDry(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDry.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVoiceCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVoiceCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVoiceCutoffHz(voiceIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVoiceCutoffHz.call(self._handle, listOf(voiceIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVoiceDelayMs(voiceIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVoiceDelayMs.call(self._handle, listOf(voiceIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVoiceDepthMs(voiceIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVoiceDepthMs.call(self._handle, listOf(voiceIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVoiceLevelDb(voiceIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVoiceLevelDb.call(self._handle, listOf(voiceIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVoicePan(voiceIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVoicePan.call(self._handle, listOf(voiceIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVoiceRateHz(voiceIdx: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVoiceRateHz.call(self._handle, listOf(voiceIdx), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getWet(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWet.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setDry(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDry.call(self._handle, listOf(amount), null)
    }
  }

  fun setVoiceCount(voices: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVoiceCount.call(self._handle, listOf(voices), null)
    }
  }

  fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(voiceIdx)
      _args.add(cutoffHz)
      __method_bind.setVoiceCutoffHz.call(self._handle, _args, null)
    }
  }

  fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(voiceIdx)
      _args.add(delayMs)
      __method_bind.setVoiceDelayMs.call(self._handle, _args, null)
    }
  }

  fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(voiceIdx)
      _args.add(depthMs)
      __method_bind.setVoiceDepthMs.call(self._handle, _args, null)
    }
  }

  fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(voiceIdx)
      _args.add(levelDb)
      __method_bind.setVoiceLevelDb.call(self._handle, _args, null)
    }
  }

  fun setVoicePan(voiceIdx: Int, pan: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(voiceIdx)
      _args.add(pan)
      __method_bind.setVoicePan.call(self._handle, _args, null)
    }
  }

  fun setVoiceRateHz(voiceIdx: Int, rateHz: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(voiceIdx)
      _args.add(rateHz)
      __method_bind.setVoiceRateHz.call(self._handle, _args, null)
    }
  }

  fun setWet(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWet.call(self._handle, listOf(amount), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectChorus".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectChorus" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectChorus
     */
    private object __method_bind {
      val getDry: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dry" }
        }
      val getVoiceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_count" }
        }
      val getVoiceCutoffHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_cutoff_hz" }
        }
      val getVoiceDelayMs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_delay_ms" }
        }
      val getVoiceDepthMs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_depth_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_depth_ms" }
        }
      val getVoiceLevelDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_level_db" }
        }
      val getVoicePan: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_pan" }
        }
      val getVoiceRateHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_voice_rate_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_voice_rate_hz" }
        }
      val getWet: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "get_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wet" }
        }
      val setDry: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dry" }
        }
      val setVoiceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_count" }
        }
      val setVoiceCutoffHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_cutoff_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_cutoff_hz" }
        }
      val setVoiceDelayMs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_delay_ms" }
        }
      val setVoiceDepthMs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_depth_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_depth_ms" }
        }
      val setVoiceLevelDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_level_db" }
        }
      val setVoicePan: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_pan" }
        }
      val setVoiceRateHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_voice_rate_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_voice_rate_hz" }
        }
      val setWet: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
            "set_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wet" }
        }}
  }
}
