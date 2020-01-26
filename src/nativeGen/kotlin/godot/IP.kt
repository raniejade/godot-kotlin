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

open class IP internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: IP = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("IP".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton IP" }
          IP(
            handle
          )
        }

    val ResolverInvalidId: Int = -1

    val ResolverMaxQueries: Int = 32

    val ResolverStatusDone: Int = 2

    val ResolverStatusError: Int = 3

    val ResolverStatusNone: Int = 0

    val ResolverStatusWaiting: Int = 1

    val TypeAny: Int = 3

    val TypeIpv4: Int = 1

    val TypeIpv6: Int = 2

    val TypeNone: Int = 0
  }
}
