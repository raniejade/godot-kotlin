// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeOneShot internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  fun getAutorestartDelay(): Float {
    TODO()
  }

  fun getAutorestartRandomDelay(): Float {
    TODO()
  }

  fun getFadeinTime(): Float {
    TODO()
  }

  fun getFadeoutTime(): Float {
    TODO()
  }

  fun getMixMode(): MixMode {
    TODO()
  }

  fun hasAutorestart(): Boolean {
    TODO()
  }

  fun isUsingSync(): Boolean {
    TODO()
  }

  fun setAutorestart(enable: Boolean) {
    TODO()
  }

  fun setAutorestartDelay(enable: Float) {
    TODO()
  }

  fun setAutorestartRandomDelay(enable: Float) {
    TODO()
  }

  fun setFadeinTime(time: Float) {
    TODO()
  }

  fun setFadeoutTime(time: Float) {
    TODO()
  }

  fun setMixMode(mode: Int) {
    TODO()
  }

  fun setUseSync(enable: Boolean) {
    TODO()
  }

  enum class MixMode(
    val value: Int
  ) {
    MIX_MODE_BLEND(0),

    MIX_MODE_ADD(1);

    companion object {
      fun from(value: Int): MixMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MIX_MODE_ADD: Int = 1

    val MIX_MODE_BLEND: Int = 0

    fun new(): AnimationNodeOneShot = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeOneShot".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeOneShot" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeOneShot(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeOneShot = AnimationNodeOneShot(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeOneShot
     */
    private object __method_bind {
      val get_autorestart_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_autorestart_delay" }
            }
          }

      val get_autorestart_random_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_autorestart_random_delay" }
            }
          }

      val get_fadein_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fadein_time" }
            }
          }

      val get_fadeout_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fadeout_time" }
            }
          }

      val get_mix_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_mix_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_mode" }
            }
          }

      val has_autorestart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "has_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_autorestart" }
            }
          }

      val is_using_sync: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "is_using_sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_sync" }
            }
          }

      val set_autorestart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autorestart" }
            }
          }

      val set_autorestart_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autorestart_delay" }
            }
          }

      val set_autorestart_random_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autorestart_random_delay" }
            }
          }

      val set_fadein_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fadein_time" }
            }
          }

      val set_fadeout_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fadeout_time" }
            }
          }

      val set_mix_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_mix_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mix_mode" }
            }
          }

      val set_use_sync: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_use_sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_sync" }
            }
          }
    }
  }
}
