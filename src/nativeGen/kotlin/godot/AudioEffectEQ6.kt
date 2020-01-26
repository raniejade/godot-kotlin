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

open class AudioEffectEQ6 internal constructor(
  _handle: COpaquePointer
) : AudioEffectEQ(_handle) {
  companion object {
    fun new(): AudioEffectEQ6 = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectEQ6".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectEQ6" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectEQ6(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AudioEffectEQ6
     */
    private object __method_bind
  }
}
