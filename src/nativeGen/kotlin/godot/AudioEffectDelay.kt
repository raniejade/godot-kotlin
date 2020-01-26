// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectDelay internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getDry(): Float {
    TODO()
  }

  fun getFeedbackDelayMs(): Float {
    TODO()
  }

  fun getFeedbackLevelDb(): Float {
    TODO()
  }

  fun getFeedbackLowpass(): Float {
    TODO()
  }

  fun getTap1DelayMs(): Float {
    TODO()
  }

  fun getTap1LevelDb(): Float {
    TODO()
  }

  fun getTap1Pan(): Float {
    TODO()
  }

  fun getTap2DelayMs(): Float {
    TODO()
  }

  fun getTap2LevelDb(): Float {
    TODO()
  }

  fun getTap2Pan(): Float {
    TODO()
  }

  fun isFeedbackActive(): Boolean {
    TODO()
  }

  fun isTap1Active(): Boolean {
    TODO()
  }

  fun isTap2Active(): Boolean {
    TODO()
  }

  fun setDry(amount: Float) {
    TODO()
  }

  fun setFeedbackActive(amount: Boolean) {
    TODO()
  }

  fun setFeedbackDelayMs(amount: Float) {
    TODO()
  }

  fun setFeedbackLevelDb(amount: Float) {
    TODO()
  }

  fun setFeedbackLowpass(amount: Float) {
    TODO()
  }

  fun setTap1Active(amount: Boolean) {
    TODO()
  }

  fun setTap1DelayMs(amount: Float) {
    TODO()
  }

  fun setTap1LevelDb(amount: Float) {
    TODO()
  }

  fun setTap1Pan(amount: Float) {
    TODO()
  }

  fun setTap2Active(amount: Boolean) {
    TODO()
  }

  fun setTap2DelayMs(amount: Float) {
    TODO()
  }

  fun setTap2LevelDb(amount: Float) {
    TODO()
  }

  fun setTap2Pan(amount: Float) {
    TODO()
  }

  companion object {
    fun new(): AudioEffectDelay = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDelay".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectDelay" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectDelay(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectDelay
     */
    private object __method_bind {
      val get_dry: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dry" }
            }
          }

      val get_feedback_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_feedback_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback_delay_ms" }
            }
          }

      val get_feedback_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_feedback_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback_level_db" }
            }
          }

      val get_feedback_lowpass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_feedback_lowpass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback_lowpass" }
            }
          }

      val get_tap1_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap1_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap1_delay_ms" }
            }
          }

      val get_tap1_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap1_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap1_level_db" }
            }
          }

      val get_tap1_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap1_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap1_pan" }
            }
          }

      val get_tap2_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap2_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap2_delay_ms" }
            }
          }

      val get_tap2_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap2_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap2_level_db" }
            }
          }

      val get_tap2_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap2_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap2_pan" }
            }
          }

      val is_feedback_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "is_feedback_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_feedback_active" }
            }
          }

      val is_tap1_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "is_tap1_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_tap1_active" }
            }
          }

      val is_tap2_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "is_tap2_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_tap2_active" }
            }
          }

      val set_dry: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dry" }
            }
          }

      val set_feedback_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_active" }
            }
          }

      val set_feedback_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_delay_ms" }
            }
          }

      val set_feedback_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_level_db" }
            }
          }

      val set_feedback_lowpass: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_lowpass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_lowpass" }
            }
          }

      val set_tap1_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_active" }
            }
          }

      val set_tap1_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_delay_ms" }
            }
          }

      val set_tap1_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_level_db" }
            }
          }

      val set_tap1_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_pan" }
            }
          }

      val set_tap2_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_active" }
            }
          }

      val set_tap2_delay_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_delay_ms" }
            }
          }

      val set_tap2_level_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_level_db" }
            }
          }

      val set_tap2_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_pan" }
            }
          }
    }
  }
}
