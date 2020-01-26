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
  enum class ResolverStatus(
    val value: Int
  ) {
    RESOLVER_STATUS_NONE(0),

    RESOLVER_STATUS_WAITING(1),

    RESOLVER_STATUS_DONE(2),

    RESOLVER_STATUS_ERROR(3);
  }

  enum class Type(
    val value: Int
  ) {
    TYPE_NONE(0),

    TYPE_IPV4(1),

    TYPE_IPV6(2),

    TYPE_ANY(3);
  }

  companion object {
    val Instance: IP = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("IP".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton IP" }
          IP(
            handle
          )
        }

    val RESOLVER_INVALID_ID: Int = -1

    val RESOLVER_MAX_QUERIES: Int = 32

    val RESOLVER_STATUS_DONE: Int = 2

    val RESOLVER_STATUS_ERROR: Int = 3

    val RESOLVER_STATUS_NONE: Int = 0

    val RESOLVER_STATUS_WAITING: Int = 1

    val TYPE_ANY: Int = 3

    val TYPE_IPV4: Int = 1

    val TYPE_IPV6: Int = 2

    val TYPE_NONE: Int = 0
  }
}
