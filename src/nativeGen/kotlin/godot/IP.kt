// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class IP internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun clearCache() {
    TODO()
  }

  fun eraseResolveItem() {
    TODO()
  }

  fun getLocalAddresses(): VariantArray {
    TODO()
  }

  fun getResolveItemAddress(): String {
    TODO()
  }

  fun getResolveItemStatus(): IP.ResolverStatus {
    TODO()
  }

  fun resolveHostname(): String {
    TODO()
  }

  fun resolveHostnameQueueItem(): Int {
    TODO()
  }

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

    /**
     * Container for method_bind pointers for IP
     */
    private object __method_bind {
      val clear_cache: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "clear_cache".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_cache" }
            }
          }

      val erase_resolve_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "erase_resolve_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_resolve_item" }
            }
          }

      val get_local_addresses: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "get_local_addresses".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_addresses" }
            }
          }

      val get_resolve_item_address: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "get_resolve_item_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resolve_item_address" }
            }
          }

      val get_resolve_item_status: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "get_resolve_item_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resolve_item_status" }
            }
          }

      val resolve_hostname: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "resolve_hostname".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resolve_hostname" }
            }
          }

      val resolve_hostname_queue_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "resolve_hostname_queue_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resolve_hostname_queue_item" }
            }
          }
    }
  }
}
