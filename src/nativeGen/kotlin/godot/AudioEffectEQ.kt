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

open class AudioEffectEQ internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    fun new(): AudioEffectEQ = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectEQ".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectEQ" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectEQ(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectEQ
     */
    private object __method_bind {
      val get_band_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
              "get_band_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_band_count" }
            }
          }

      val get_band_gain_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
              "get_band_gain_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_band_gain_db" }
            }
          }

      val set_band_gain_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectEQ".cstr.ptr,
              "set_band_gain_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_band_gain_db" }
            }
          }
    }
  }
}
