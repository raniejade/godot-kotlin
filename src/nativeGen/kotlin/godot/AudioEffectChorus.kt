// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    TODO()
  }

  fun getVoiceCount(): Int {
    TODO()
  }

  fun getVoiceCutoffHz(voice_idx: Int): Float {
    TODO()
  }

  fun getVoiceDelayMs(voice_idx: Int): Float {
    TODO()
  }

  fun getVoiceDepthMs(voice_idx: Int): Float {
    TODO()
  }

  fun getVoiceLevelDb(voice_idx: Int): Float {
    TODO()
  }

  fun getVoicePan(voice_idx: Int): Float {
    TODO()
  }

  fun getVoiceRateHz(voice_idx: Int): Float {
    TODO()
  }

  fun getWet(): Float {
    TODO()
  }

  fun setDry(amount: Float) {
    TODO()
  }

  fun setVoiceCount(voices: Int) {
    TODO()
  }

  fun setVoiceCutoffHz(voice_idx: Int, cutoff_hz: Float) {
    TODO()
  }

  fun setVoiceDelayMs(voice_idx: Int, delay_ms: Float) {
    TODO()
  }

  fun setVoiceDepthMs(voice_idx: Int, depth_ms: Float) {
    TODO()
  }

  fun setVoiceLevelDb(voice_idx: Int, level_db: Float) {
    TODO()
  }

  fun setVoicePan(voice_idx: Int, pan: Float) {
    TODO()
  }

  fun setVoiceRateHz(voice_idx: Int, rate_hz: Float) {
    TODO()
  }

  fun setWet(amount: Float) {
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
