// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class UPNP internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addDevice(device: UPNPDevice) {
    TODO()
  }

  fun addPortMapping(
    port: Int,
    port_internal: Int,
    desc: String,
    proto: String,
    duration: Int
  ): Int {
    TODO()
  }

  fun clearDevices() {
    TODO()
  }

  fun deletePortMapping(port: Int, proto: String): Int {
    TODO()
  }

  fun discover(
    timeout: Int,
    ttl: Int,
    device_filter: String
  ): Int {
    TODO()
  }

  fun getDevice(index: Int): UPNPDevice {
    TODO()
  }

  fun getDeviceCount(): Int {
    TODO()
  }

  fun getDiscoverLocalPort(): Int {
    TODO()
  }

  fun getDiscoverMulticastIf(): String {
    TODO()
  }

  fun getGateway(): UPNPDevice {
    TODO()
  }

  fun isDiscoverIpv6(): Boolean {
    TODO()
  }

  fun queryExternalAddress(): String {
    TODO()
  }

  fun removeDevice(index: Int) {
    TODO()
  }

  fun setDevice(index: Int, device: UPNPDevice) {
    TODO()
  }

  fun setDiscoverIpv6(ipv6: Boolean) {
    TODO()
  }

  fun setDiscoverLocalPort(port: Int) {
    TODO()
  }

  fun setDiscoverMulticastIf(m_if: String) {
    TODO()
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
  }

  companion object {
    val UPNP_RESULT_ACTION_FAILED: Int = 5

    val UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING: Int = 13

    val UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM: Int = 12

    val UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD: Int = 10

    val UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED: Int = 7

    val UPNP_RESULT_HTTP_ERROR: Int = 23

    val UPNP_RESULT_INCONSISTENT_PARAMETERS: Int = 3

    val UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED: Int = 8

    val UPNP_RESULT_INVALID_ARGS: Int = 20

    val UPNP_RESULT_INVALID_DURATION: Int = 19

    val UPNP_RESULT_INVALID_GATEWAY: Int = 16

    val UPNP_RESULT_INVALID_PARAM: Int = 22

    val UPNP_RESULT_INVALID_PORT: Int = 17

    val UPNP_RESULT_INVALID_PROTOCOL: Int = 18

    val UPNP_RESULT_INVALID_RESPONSE: Int = 21

    val UPNP_RESULT_MEM_ALLOC_ERROR: Int = 25

    val UPNP_RESULT_NOT_AUTHORIZED: Int = 1

    val UPNP_RESULT_NO_DEVICES: Int = 27

    val UPNP_RESULT_NO_GATEWAY: Int = 26

    val UPNP_RESULT_NO_PORT_MAPS_AVAILABLE: Int = 11

    val UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY: Int = 4

    val UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED: Int = 15

    val UPNP_RESULT_PORT_MAPPING_NOT_FOUND: Int = 2

    val UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD: Int = 9

    val UPNP_RESULT_SAME_PORT_VALUES_REQUIRED: Int = 14

    val UPNP_RESULT_SOCKET_ERROR: Int = 24

    val UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED: Int = 6

    val UPNP_RESULT_SUCCESS: Int = 0

    val UPNP_RESULT_UNKNOWN_ERROR: Int = 28

    fun new(): UPNP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UPNP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton UPNP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      UPNP(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for UPNP
     */
    private object __method_bind {
      val add_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "add_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_device" }
            }
          }

      val add_port_mapping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "add_port_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_port_mapping" }
            }
          }

      val clear_devices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "clear_devices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_devices" }
            }
          }

      val delete_port_mapping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "delete_port_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method delete_port_mapping" }
            }
          }

      val discover: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "discover".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method discover" }
            }
          }

      val get_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "get_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_device" }
            }
          }

      val get_device_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "get_device_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_device_count" }
            }
          }

      val get_discover_local_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "get_discover_local_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_discover_local_port" }
            }
          }

      val get_discover_multicast_if: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "get_discover_multicast_if".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_discover_multicast_if" }
            }
          }

      val get_gateway: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "get_gateway".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gateway" }
            }
          }

      val is_discover_ipv6: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "is_discover_ipv6".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_discover_ipv6" }
            }
          }

      val query_external_address: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "query_external_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method query_external_address" }
            }
          }

      val remove_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "remove_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_device" }
            }
          }

      val set_device: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "set_device".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_device" }
            }
          }

      val set_discover_ipv6: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "set_discover_ipv6".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_discover_ipv6" }
            }
          }

      val set_discover_local_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "set_discover_local_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_discover_local_port" }
            }
          }

      val set_discover_multicast_if: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNP".cstr.ptr,
              "set_discover_multicast_if".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_discover_multicast_if" }
            }
          }
    }
  }
}
