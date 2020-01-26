// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectDelay internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    fun new(): AudioEffectDelay = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDelay".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioEffectDelay" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      AudioEffectDelay(
        fn()
      )
    }}
}
