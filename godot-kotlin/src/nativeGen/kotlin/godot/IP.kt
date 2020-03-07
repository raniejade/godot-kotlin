// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class IPInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun clearCache(hostname: String = "") {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearCache.call(self._handle, listOf(hostname), null)
    }
  }

  fun eraseResolveItem(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.eraseResolveItem.call(self._handle, listOf(id), null)
    }
  }

  fun getLocalAddresses(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getLocalAddresses.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLocalInterfaces(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getLocalInterfaces.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getResolveItemAddress(id: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getResolveItemAddress.call(self._handle, listOf(id), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getResolveItemStatus(id: Int): IP.ResolverStatus {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResolveItemStatus.call(self._handle, listOf(id), _retPtr)
      IP.ResolverStatus.from(_ret.value)
    }
  }

  fun resolveHostname(host: String, ipType: Int = 3): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(host)
      _args.add(ipType)
      __method_bind.resolveHostname.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun resolveHostnameQueueItem(host: String, ipType: Int = 3): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(host)
      _args.add(ipType)
      __method_bind.resolveHostnameQueueItem.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  companion object {
    val RESOLVER_INVALID_ID: Int = -1

    val RESOLVER_MAX_QUERIES: Int = 32

    /**
     * Container for method_bind pointers for IP
     */
    private object __method_bind {
      val clearCache: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "clear_cache".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_cache" }
            }
          }

      val eraseResolveItem: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "erase_resolve_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_resolve_item" }
            }
          }

      val getLocalAddresses: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "get_local_addresses".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_addresses" }
            }
          }

      val getLocalInterfaces: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "get_local_interfaces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_interfaces" }
            }
          }

      val getResolveItemAddress: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "get_resolve_item_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resolve_item_address" }
            }
          }

      val getResolveItemStatus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "get_resolve_item_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resolve_item_status" }
            }
          }

      val resolveHostname: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "resolve_hostname".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resolve_hostname" }
            }
          }

      val resolveHostnameQueueItem: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
              "resolve_hostname_queue_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resolve_hostname_queue_item" }
            }
          }
    }
  }
}

object IP : IPInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("IP".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton IP" }
      _handle = handle
    }
  }

  val RESOLVER_INVALID_ID: Int = -1

  val RESOLVER_MAX_QUERIES: Int = 32

  enum class ResolverStatus(
    val value: Int
  ) {
    NONE(0),

    WAITING(1),

    DONE(2),

    ERROR(3);

    companion object {
      fun from(value: Int): ResolverStatus {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Type(
    val value: Int
  ) {
    NONE(0),

    IPV4(1),

    IPV6(2),

    ANY(3);

    companion object {
      fun from(value: Int): Type {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }
}
