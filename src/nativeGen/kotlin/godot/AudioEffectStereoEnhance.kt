// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectStereoEnhance internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getPanPullout(): Float {
    TODO()
  }

  fun getSurround(): Float {
    TODO()
  }

  fun getTimePullout(): Float {
    TODO()
  }

  fun setPanPullout(amount: Float) {
    TODO()
  }

  fun setSurround(amount: Float) {
    TODO()
  }

  fun setTimePullout(amount: Float) {
    TODO()
  }

  companion object {
    fun new(): AudioEffectStereoEnhance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectStereoEnhance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectStereoEnhance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectStereoEnhance(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectStereoEnhance
     */
    private object __method_bind {
      val get_pan_pullout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
              "get_pan_pullout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pan_pullout" }
            }
          }

      val get_surround: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
              "get_surround".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_surround" }
            }
          }

      val get_time_pullout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
              "get_time_pullout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_pullout" }
            }
          }

      val set_pan_pullout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
              "set_pan_pullout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pan_pullout" }
            }
          }

      val set_surround: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
              "set_surround".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_surround" }
            }
          }

      val set_time_pullout: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
              "set_time_pullout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_time_pullout" }
            }
          }
    }
  }
}
