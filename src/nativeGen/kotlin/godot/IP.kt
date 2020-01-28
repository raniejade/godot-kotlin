// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
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

open class IP(
  _handle: COpaquePointer
) : Object(_handle) {
  fun clearCache(hostname: String) {
    val _arg = Variant.new(hostname)
    __method_bind.clearCache.call(this._handle, _arg, 1)
  }

  fun eraseResolveItem(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.eraseResolveItem.call(this._handle, _arg, 1)
  }

  fun getLocalAddresses(): VariantArray {
    val _ret = __method_bind.getLocalAddresses.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getResolveItemAddress(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getResolveItemAddress.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getResolveItemStatus(id: Int): ResolverStatus {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getResolveItemStatus.call(this._handle, _arg, 1)
    return IP.ResolverStatus.from(_ret.asInt())
  }

  fun resolveHostname(host: String, ipType: Int): String {
    val _args = VariantArray.new()
    _args.append(host)
    _args.append(ipType)
    val _ret = __method_bind.resolveHostname.call(this._handle, _args.toVariant(), 2)
    return _ret.asString()
  }

  fun resolveHostnameQueueItem(host: String, ipType: Int): Int {
    val _args = VariantArray.new()
    _args.append(host)
    _args.append(ipType)
    val _ret = __method_bind.resolveHostnameQueueItem.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  enum class ResolverStatus(
    val value: Int
  ) {
    RESOLVER_STATUS_NONE(0),

    RESOLVER_STATUS_WAITING(1),

    RESOLVER_STATUS_DONE(2),

    RESOLVER_STATUS_ERROR(3);

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
    TYPE_NONE(0),

    TYPE_IPV4(1),

    TYPE_IPV6(2),

    TYPE_ANY(3);

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

  companion object {
    val Instance: IP
      get() = memScoped {
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
      val clearCache: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
            "clearCache".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearCache" }
        }
      val eraseResolveItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
            "eraseResolveItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eraseResolveItem" }
        }
      val getLocalAddresses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
            "getLocalAddresses".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLocalAddresses" }
        }
      val getResolveItemAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
            "getResolveItemAddress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResolveItemAddress" }
        }
      val getResolveItemStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
            "getResolveItemStatus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResolveItemStatus" }
        }
      val resolveHostname: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
            "resolveHostname".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resolveHostname" }
        }
      val resolveHostnameQueueItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("IP".cstr.ptr,
            "resolveHostnameQueueItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resolveHostnameQueueItem" }
        }}
  }
}
