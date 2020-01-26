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

open class _Thread internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class Priority(
    val value: Int
  ) {
    PRIORITY_LOW(0),

    PRIORITY_NORMAL(1),

    PRIORITY_HIGH(2);
  }

  companion object {
    val PRIORITY_HIGH: Int = 2

    val PRIORITY_LOW: Int = 0

    val PRIORITY_NORMAL: Int = 1

    fun new(): _Thread = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Thread".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for _Thread" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Thread(
        fn()
      )
    }}
}
