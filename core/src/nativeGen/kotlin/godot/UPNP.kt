// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class UPNP(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var discoverIpv6: Boolean
    get() {
       return isDiscoverIpv6() 
    }
    set(value) {
      setDiscoverIpv6(value)
    }

  var discoverLocalPort: Int
    get() {
       return getDiscoverLocalPort() 
    }
    set(value) {
      setDiscoverLocalPort(value)
    }

  var discoverMulticastIf: String
    get() {
       return getDiscoverMulticastIf() 
    }
    set(value) {
      setDiscoverMulticastIf(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun addDevice(device: UPNPDevice) {
    val _arg = Variant(device)
    __method_bind.addDevice.call(this._handle, listOf(_arg))
  }

  fun addPortMapping(
    port: Int,
    portInternal: Int = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Int = 0
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(port))
    _args.add(Variant.fromAny(portInternal))
    _args.add(Variant.fromAny(desc))
    _args.add(Variant.fromAny(proto))
    _args.add(Variant.fromAny(duration))
    val _ret = __method_bind.addPortMapping.call(this._handle, _args)
    return _ret.asInt()
  }

  fun clearDevices() {
    __method_bind.clearDevices.call(this._handle)
  }

  fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(port))
    _args.add(Variant.fromAny(proto))
    val _ret = __method_bind.deletePortMapping.call(this._handle, _args)
    return _ret.asInt()
  }

  fun discover(
    timeout: Int = 2000,
    ttl: Int = 2,
    deviceFilter: String = "InternetGatewayDevice"
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(timeout))
    _args.add(Variant.fromAny(ttl))
    _args.add(Variant.fromAny(deviceFilter))
    val _ret = __method_bind.discover.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getDevice(index: Int): UPNPDevice {
    val _arg = Variant(index)
    val _ret = __method_bind.getDevice.call(this._handle, listOf(_arg))
    return _ret.asObject(::UPNPDevice)!!
  }

  fun getDeviceCount(): Int {
    val _ret = __method_bind.getDeviceCount.call(this._handle)
    return _ret.asInt()
  }

  fun getDiscoverLocalPort(): Int {
    val _ret = __method_bind.getDiscoverLocalPort.call(this._handle)
    return _ret.asInt()
  }

  fun getDiscoverMulticastIf(): String {
    val _ret = __method_bind.getDiscoverMulticastIf.call(this._handle)
    return _ret.asString()
  }

  fun getGateway(): UPNPDevice {
    val _ret = __method_bind.getGateway.call(this._handle)
    return _ret.asObject(::UPNPDevice)!!
  }

  fun isDiscoverIpv6(): Boolean {
    val _ret = __method_bind.isDiscoverIpv6.call(this._handle)
    return _ret.asBoolean()
  }

  fun queryExternalAddress(): String {
    val _ret = __method_bind.queryExternalAddress.call(this._handle)
    return _ret.asString()
  }

  fun removeDevice(index: Int) {
    val _arg = Variant(index)
    __method_bind.removeDevice.call(this._handle, listOf(_arg))
  }

  fun setDevice(index: Int, device: UPNPDevice) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(device))
    __method_bind.setDevice.call(this._handle, _args)
  }

  fun setDiscoverIpv6(ipv6: Boolean) {
    val _arg = Variant(ipv6)
    __method_bind.setDiscoverIpv6.call(this._handle, listOf(_arg))
  }

  fun setDiscoverLocalPort(port: Int) {
    val _arg = Variant(port)
    __method_bind.setDiscoverLocalPort.call(this._handle, listOf(_arg))
  }

  fun setDiscoverMulticastIf(mIf: String) {
    val _arg = Variant(mIf)
    __method_bind.setDiscoverMulticastIf.call(this._handle, listOf(_arg))
  }

  enum class UPNPResult(
    val value: Int
  ) {
    UPNP_RESULT_SUCCESS(0),

    UPNP_RESULT_NOT_AUTHORIZED(1),

    UPNP_RESULT_PORT_MAPPING_NOT_FOUND(2),

    UPNP_RESULT_INCONSISTENT_PARAMETERS(3),

    UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY(4),

    UPNP_RESULT_ACTION_FAILED(5),

    UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED(6),

    UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED(7),

    UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED(8),

    UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD(9),

    UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD(10),

    UPNP_RESULT_NO_PORT_MAPS_AVAILABLE(11),

    UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM(12),

    UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING(13),

    UPNP_RESULT_SAME_PORT_VALUES_REQUIRED(14),

    UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED(15),

    UPNP_RESULT_INVALID_GATEWAY(16),

    UPNP_RESULT_INVALID_PORT(17),

    UPNP_RESULT_INVALID_PROTOCOL(18),

    UPNP_RESULT_INVALID_DURATION(19),

    UPNP_RESULT_INVALID_ARGS(20),

    UPNP_RESULT_INVALID_RESPONSE(21),

    UPNP_RESULT_INVALID_PARAM(22),

    UPNP_RESULT_HTTP_ERROR(23),

    UPNP_RESULT_SOCKET_ERROR(24),

    UPNP_RESULT_MEM_ALLOC_ERROR(25),

    UPNP_RESULT_NO_GATEWAY(26),

    UPNP_RESULT_NO_DEVICES(27),

    UPNP_RESULT_UNKNOWN_ERROR(28);

    companion object {
      fun from(value: Int): UPNPResult {
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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UPNP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for UPNP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for UPNP
     */
    private object __method_bind {
      val addDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "add_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_device" }
        }
      val addPortMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "add_port_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_port_mapping" }
        }
      val clearDevices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "clear_devices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_devices" }
        }
      val deletePortMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "delete_port_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delete_port_mapping" }
        }
      val discover: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "discover".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method discover" }
        }
      val getDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "get_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_device" }
        }
      val getDeviceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "get_device_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_device_count" }
        }
      val getDiscoverLocalPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "get_discover_local_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_discover_local_port" }
        }
      val getDiscoverMulticastIf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "get_discover_multicast_if".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_discover_multicast_if" }
        }
      val getGateway: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "get_gateway".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gateway" }
        }
      val isDiscoverIpv6: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "is_discover_ipv6".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_discover_ipv6" }
        }
      val queryExternalAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "query_external_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method query_external_address" }
        }
      val removeDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "remove_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_device" }
        }
      val setDevice: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "set_device".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_device" }
        }
      val setDiscoverIpv6: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "set_discover_ipv6".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_discover_ipv6" }
        }
      val setDiscoverLocalPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "set_discover_local_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_discover_local_port" }
        }
      val setDiscoverMulticastIf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
            "set_discover_multicast_if".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_discover_multicast_if" }
        }}
  }
}
