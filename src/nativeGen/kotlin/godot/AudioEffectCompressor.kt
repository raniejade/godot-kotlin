// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectCompressor internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getAttackUs(): Float {
    TODO()
  }

  fun getGain(): Float {
    TODO()
  }

  fun getMix(): Float {
    TODO()
  }

  fun getRatio(): Float {
    TODO()
  }

  fun getReleaseMs(): Float {
    TODO()
  }

  fun getSidechain(): String {
    TODO()
  }

  fun getThreshold(): Float {
    TODO()
  }

  fun setAttackUs(attack_us: Float) {
    TODO()
  }

  fun setGain(gain: Float) {
    TODO()
  }

  fun setMix(mix: Float) {
    TODO()
  }

  fun setRatio(ratio: Float) {
    TODO()
  }

  fun setReleaseMs(release_ms: Float) {
    TODO()
  }

  fun setSidechain(sidechain: String) {
    TODO()
  }

  fun setThreshold(threshold: Float) {
    TODO()
  }

  companion object {
    fun new(): AudioEffectCompressor = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectCompressor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectCompressor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectCompressor(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectCompressor = AudioEffectCompressor(ptr)
    /**
     * Container for method_bind pointers for AudioEffectCompressor
     */
    private object __method_bind {
      val get_attack_us: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "get_attack_us".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attack_us" }
            }
          }

      val get_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "get_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gain" }
            }
          }

      val get_mix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "get_mix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix" }
            }
          }

      val get_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "get_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ratio" }
            }
          }

      val get_release_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "get_release_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_release_ms" }
            }
          }

      val get_sidechain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "get_sidechain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sidechain" }
            }
          }

      val get_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "get_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_threshold" }
            }
          }

      val set_attack_us: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "set_attack_us".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_attack_us" }
            }
          }

      val set_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "set_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gain" }
            }
          }

      val set_mix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "set_mix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mix" }
            }
          }

      val set_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "set_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ratio" }
            }
          }

      val set_release_ms: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "set_release_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_release_ms" }
            }
          }

      val set_sidechain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "set_sidechain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sidechain" }
            }
          }

      val set_threshold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectCompressor".cstr.ptr,
              "set_threshold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_threshold" }
            }
          }
    }
  }
}
