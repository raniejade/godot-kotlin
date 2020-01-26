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

open class AudioEffectDistortion internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getDrive(): Float {
    TODO()
  }

  fun getKeepHfHz(): Float {
    TODO()
  }

  fun getMode(): Mode {
    TODO()
  }

  fun getPostGain(): Float {
    TODO()
  }

  fun getPreGain(): Float {
    TODO()
  }

  fun setDrive() {
    TODO()
  }

  fun setKeepHfHz() {
    TODO()
  }

  fun setMode() {
    TODO()
  }

  fun setPostGain() {
    TODO()
  }

  fun setPreGain() {
    TODO()
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_CLIP(0),

    MODE_ATAN(1),

    MODE_LOFI(2),

    MODE_OVERDRIVE(3),

    MODE_WAVESHAPE(4);
  }

  companion object {
    val MODE_ATAN: Int = 1

    val MODE_CLIP: Int = 0

    val MODE_LOFI: Int = 2

    val MODE_OVERDRIVE: Int = 3

    val MODE_WAVESHAPE: Int = 4

    fun new(): AudioEffectDistortion = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDistortion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectDistortion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectDistortion(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectDistortion
     */
    private object __method_bind {
      val get_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "get_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drive" }
            }
          }

      val get_keep_hf_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "get_keep_hf_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_keep_hf_hz" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_post_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "get_post_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_post_gain" }
            }
          }

      val get_pre_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "get_pre_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pre_gain" }
            }
          }

      val set_drive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "set_drive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drive" }
            }
          }

      val set_keep_hf_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "set_keep_hf_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_keep_hf_hz" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_post_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "set_post_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_post_gain" }
            }
          }

      val set_pre_gain: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
              "set_pre_gain".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pre_gain" }
            }
          }
    }
  }
}
