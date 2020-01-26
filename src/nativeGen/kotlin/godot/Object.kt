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
  companion object {
    val ConnectDeferred: Int = 1

    val ConnectOneshot: Int = 4

    val ConnectPersist: Int = 2

    val ConnectReferenceCounted: Int = 8

    val NotificationPostinitialize: Int = 0

    val NotificationPredelete: Int = 1

    fun new(): Object = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Object".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Object" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Object(
        fn()
      )
    }}
}
