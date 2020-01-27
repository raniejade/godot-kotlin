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

open class AudioEffectNotchFilter internal constructor(
  _handle: COpaquePointer
) : AudioEffectFilter(_handle) {
  companion object {
    fun new(): AudioEffectNotchFilter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectNotchFilter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectNotchFilter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectNotchFilter(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectNotchFilter = AudioEffectNotchFilter(ptr)
    /**
     * Container for method_bind pointers for AudioEffectNotchFilter
     */
    private object __method_bind
  }
}
