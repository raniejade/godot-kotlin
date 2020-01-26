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
  enum class FilterDB(
    val value: Int
  ) {
    FILTER_6DB(0),

    FILTER_12DB(1),

    FILTER_18DB(2),

    FILTER_24DB(3);
  }

  companion object {
    val FILTER_12DB: Int = 1

    val FILTER_18DB: Int = 2

    val FILTER_24DB: Int = 3

    val FILTER_6DB: Int = 0

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
