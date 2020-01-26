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

open class Object internal constructor(
  internal val _handle: COpaquePointer
) {
  enum class ConnectFlags(
    val value: Int
  ) {
    CONNECT_DEFERRED(1),

    CONNECT_PERSIST(2),

    CONNECT_ONESHOT(4),

    CONNECT_REFERENCE_COUNTED(8);
  }

  companion object {
    val CONNECT_DEFERRED: Int = 1

    val CONNECT_ONESHOT: Int = 4

    val CONNECT_PERSIST: Int = 2

    val CONNECT_REFERENCE_COUNTED: Int = 8

    val NOTIFICATION_POSTINITIALIZE: Int = 0

    val NOTIFICATION_PREDELETE: Int = 1

    fun new(): Object = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Object".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Object" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Object(
        fn()
      )
    }}
}
