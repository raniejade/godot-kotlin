// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectReverb internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    fun new(): AudioEffectReverb = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectReverb".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectReverb" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectReverb(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectReverb
     */
    private object __method_bind {
      val get_damping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_damping" }
            }
          }

      val get_dry: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dry" }
            }
          }

      val get_hpf: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_hpf".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hpf" }
            }
          }

      val get_predelay_feedback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_predelay_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_predelay_feedback" }
            }
          }

      val get_predelay_msec: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_predelay_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_predelay_msec" }
            }
          }

      val get_room_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_room_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_room_size" }
            }
          }

      val get_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spread" }
            }
          }

      val get_wet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_wet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wet" }
            }
          }

      val set_damping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_damping" }
            }
          }

      val set_dry: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dry" }
            }
          }

      val set_hpf: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_hpf".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hpf" }
            }
          }

      val set_predelay_feedback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_predelay_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_predelay_feedback" }
            }
          }

      val set_predelay_msec: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_predelay_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_predelay_msec" }
            }
          }

      val set_room_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_room_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_room_size" }
            }
          }

      val set_spread: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spread" }
            }
          }

      val set_wet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_wet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wet" }
            }
          }
    }
  }
}
