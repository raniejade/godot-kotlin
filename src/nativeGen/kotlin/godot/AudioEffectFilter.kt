// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectFilter internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  companion object {
    val Filter12db: Int = 1

    val Filter18db: Int = 2

    val Filter24db: Int = 3

    val Filter6db: Int = 0

    fun new(): AudioEffectFilter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectFilter".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for AudioEffectFilter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectFilter(
        fn()
      )
    }}
}
