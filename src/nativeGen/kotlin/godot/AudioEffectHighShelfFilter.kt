// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectHighShelfFilter internal constructor(
  _handle: COpaquePointer
) : AudioEffectFilter(_handle) {
  companion object {
    fun new(): AudioEffectHighShelfFilter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectHighShelfFilter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectHighShelfFilter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectHighShelfFilter(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectHighShelfFilter = AudioEffectHighShelfFilter(ptr)
    /**
     * Container for method_bind pointers for AudioEffectHighShelfFilter
     */
    private object __method_bind
  }
}
