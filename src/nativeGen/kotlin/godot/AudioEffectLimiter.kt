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

open class AudioEffectLimiter internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    fun new(): AudioEffectLimiter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectLimiter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectLimiter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectLimiter(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectLimiter
     */
    private object __method_bind {
      val get_ceiling_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "get_ceiling_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ceiling_db" }
            }
          }

      val get_soft_clip_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "get_soft_clip_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_soft_clip_db" }
            }
          }

      val get_soft_clip_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "get_soft_clip_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_soft_clip_ratio" }
            }
          }

      val get_threshold_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "get_threshold_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_threshold_db" }
            }
          }

      val set_ceiling_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "set_ceiling_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ceiling_db" }
            }
          }

      val set_soft_clip_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "set_soft_clip_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_soft_clip_db" }
            }
          }

      val set_soft_clip_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "set_soft_clip_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_soft_clip_ratio" }
            }
          }

      val set_threshold_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
              "set_threshold_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_threshold_db" }
            }
          }
    }
  }
}
