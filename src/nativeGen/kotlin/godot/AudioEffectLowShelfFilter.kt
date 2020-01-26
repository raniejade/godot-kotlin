// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectLowShelfFilter internal constructor(
  _handle: COpaquePointer
) : AudioEffectFilter(_handle) {
  companion object {
    fun new(): AudioEffectLowShelfFilter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectLowShelfFilter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectLowShelfFilter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectLowShelfFilter(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectLowShelfFilter = AudioEffectLowShelfFilter(ptr)
    /**
     * Container for method_bind pointers for AudioEffectLowShelfFilter
     */
    private object __method_bind
  }
}
