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

open class Container internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val NOTIFICATION_SORT_CHILDREN: Int = 50

    fun new(): Container = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Container".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Container" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Container(
        fn()
      )
    }}
}
