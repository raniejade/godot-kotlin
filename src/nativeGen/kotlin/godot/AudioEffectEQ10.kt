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

open class AudioEffectEQ10 internal constructor(
  _handle: COpaquePointer
) : AudioEffectEQ(_handle) {
  companion object {
    fun new(): AudioEffectEQ10 = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectEQ10".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectEQ10" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectEQ10(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectEQ10 = AudioEffectEQ10(ptr)
    /**
     * Container for method_bind pointers for AudioEffectEQ10
     */
    private object __method_bind
  }
}
