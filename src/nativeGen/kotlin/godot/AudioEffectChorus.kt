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

open class AudioEffectChorus internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getDry(): Float {
    val _ret = __method_bind.get_dry.call(this.toVariant())
    TODO()
  }

  fun getVoiceCount(): Int {
    val _ret = __method_bind.get_voice_count.call(this.toVariant())
    TODO()
  }

  fun getVoiceCutoffHz(voiceIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    val _ret = __method_bind.get_voice_cutoff_hz.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getVoiceDelayMs(voiceIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    val _ret = __method_bind.get_voice_delay_ms.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getVoiceDepthMs(voiceIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    val _ret = __method_bind.get_voice_depth_ms.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getVoiceLevelDb(voiceIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    val _ret = __method_bind.get_voice_level_db.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getVoicePan(voiceIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    val _ret = __method_bind.get_voice_pan.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getVoiceRateHz(voiceIdx: Int): Float {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    val _ret = __method_bind.get_voice_rate_hz.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getWet(): Float {
    val _ret = __method_bind.get_wet.call(this.toVariant())
    TODO()
  }

  fun setDry(amount: Float) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_dry.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVoiceCount(voices: Int) {
    val _args = VariantArray.new()
    _args.append(voices)
    val _ret = __method_bind.set_voice_count.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(cutoffHz)
    val _ret = __method_bind.set_voice_cutoff_hz.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(delayMs)
    val _ret = __method_bind.set_voice_delay_ms.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(depthMs)
    val _ret = __method_bind.set_voice_depth_ms.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(levelDb)
    val _ret = __method_bind.set_voice_level_db.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setVoicePan(voiceIdx: Int, pan: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(pan)
    val _ret = __method_bind.set_voice_pan.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setVoiceRateHz(voiceIdx: Int, rateHz: Float) {
    val _args = VariantArray.new()
    _args.append(voiceIdx)
    _args.append(rateHz)
    val _ret = __method_bind.set_voice_rate_hz.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setWet(amount: Float) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_wet.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): AudioEffectChorus = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectChorus".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectChorus" }
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
      val get_dry: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dry" }
            }
          }

      val get_voice_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_voice_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_voice_count" }
            }
          }

      val get_voice_cutoff_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_voice_cutoff_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_voice_cutoff_hz" }
            }
          }

      val get_voice_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_voice_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_voice_delay_ms" }
            }
          }

      val get_voice_depth_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_voice_depth_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_voice_depth_ms" }
            }
          }

      val get_voice_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_voice_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_voice_level_db" }
            }
          }

      val get_voice_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_voice_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_voice_pan" }
            }
          }

      val get_voice_rate_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_voice_rate_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_voice_rate_hz" }
            }
          }

      val get_wet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "get_wet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wet" }
            }
          }

      val set_dry: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dry" }
            }
          }

      val set_voice_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_voice_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_voice_count" }
            }
          }

      val set_voice_cutoff_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_voice_cutoff_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_voice_cutoff_hz" }
            }
          }

      val set_voice_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_voice_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_voice_delay_ms" }
            }
          }

      val set_voice_depth_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_voice_depth_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_voice_depth_ms" }
            }
          }

      val set_voice_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_voice_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_voice_level_db" }
            }
          }

      val set_voice_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_voice_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_voice_pan" }
            }
          }

      val set_voice_rate_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_voice_rate_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_voice_rate_hz" }
            }
          }

      val set_wet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectChorus".cstr.ptr,
              "set_wet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wet" }
            }
          }
    }
  }
}
