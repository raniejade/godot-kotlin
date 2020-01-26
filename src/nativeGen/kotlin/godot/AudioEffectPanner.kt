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

open class AudioEffectPanner internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    fun new(): AudioEffectPanner = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPanner".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectPanner" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectPanner(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectPanner
     */
    private object __method_bind {
      val get_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPanner".cstr.ptr,
              "get_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pan" }
            }
          }

      val set_pan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPanner".cstr.ptr,
              "set_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pan" }
            }
          }
    }
  }
}
