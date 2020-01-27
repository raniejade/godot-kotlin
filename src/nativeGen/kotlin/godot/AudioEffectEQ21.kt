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

open class AudioEffectEQ21 internal constructor(
  _handle: COpaquePointer
) : AudioEffectEQ(_handle) {
  companion object {
    fun new(): AudioEffectEQ21 = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectEQ21".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectEQ21" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectEQ21(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectEQ21 = AudioEffectEQ21(ptr)
    /**
     * Container for method_bind pointers for AudioEffectEQ21
     */
    private object __method_bind
  }
}
