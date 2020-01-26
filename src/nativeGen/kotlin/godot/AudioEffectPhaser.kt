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

open class AudioEffectPhaser internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    fun new(): AudioEffectPhaser = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPhaser".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectPhaser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectPhaser(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectPhaser
     */
    private object __method_bind {
      val get_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth" }
            }
          }

      val get_feedback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback" }
            }
          }

      val get_range_max_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_range_max_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range_max_hz" }
            }
          }

      val get_range_min_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_range_min_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range_min_hz" }
            }
          }

      val get_rate_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_rate_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rate_hz" }
            }
          }

      val set_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth" }
            }
          }

      val set_feedback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback" }
            }
          }

      val set_range_max_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_range_max_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range_max_hz" }
            }
          }

      val set_range_min_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_range_min_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range_min_hz" }
            }
          }

      val set_rate_hz: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_rate_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rate_hz" }
            }
          }
    }
  }
}
