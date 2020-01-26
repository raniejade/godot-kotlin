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

open class UPNPDevice internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addPortMapping(
    port: Int,
    port_internal: Int,
    desc: String,
    proto: String,
    duration: Int
  ): Int {
    TODO()
  }

  fun deletePortMapping(port: Int, proto: String): Int {
    TODO()
  }

  fun getDescriptionUrl(): String {
    TODO()
  }

  fun getIgdControlUrl(): String {
    TODO()
  }

  fun getIgdOurAddr(): String {
    TODO()
  }

  fun getIgdServiceType(): String {
    TODO()
  }

  fun getIgdStatus(): IGDStatus {
    TODO()
  }

  fun getServiceType(): String {
    TODO()
  }

  fun isValidGateway(): Boolean {
    TODO()
  }

  fun queryExternalAddress(): String {
    TODO()
  }

  fun setDescriptionUrl(url: String) {
    TODO()
  }

  fun setIgdControlUrl(url: String) {
    TODO()
  }

  fun setIgdOurAddr(addr: String) {
    TODO()
  }

  fun setIgdServiceType(type: String) {
    TODO()
  }

  fun setIgdStatus(status: Int) {
    TODO()
  }

  fun setServiceType(type: String) {
    TODO()
  }

  enum class IGDStatus(
    val value: Int
  ) {
    IGD_STATUS_OK(0),

    IGD_STATUS_HTTP_ERROR(1),

    IGD_STATUS_HTTP_EMPTY(2),

    IGD_STATUS_NO_URLS(3),

    IGD_STATUS_NO_IGD(4),

    IGD_STATUS_DISCONNECTED(5),

    IGD_STATUS_UNKNOWN_DEVICE(6),

    IGD_STATUS_INVALID_CONTROL(7),

    IGD_STATUS_MALLOC_ERROR(8),

    IGD_STATUS_UNKNOWN_ERROR(9);

    companion object {
      fun from(value: Int): IGDStatus {
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
    val IGD_STATUS_DISCONNECTED: Int = 5

    val IGD_STATUS_HTTP_EMPTY: Int = 2

    val IGD_STATUS_HTTP_ERROR: Int = 1

    val IGD_STATUS_INVALID_CONTROL: Int = 7

    val IGD_STATUS_MALLOC_ERROR: Int = 8

    val IGD_STATUS_NO_IGD: Int = 4

    val IGD_STATUS_NO_URLS: Int = 3

    val IGD_STATUS_OK: Int = 0

    val IGD_STATUS_UNKNOWN_DEVICE: Int = 6

    val IGD_STATUS_UNKNOWN_ERROR: Int = 9

    fun new(): UPNPDevice = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UPNPDevice".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton UPNPDevice" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      UPNPDevice(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): UPNPDevice = UPNPDevice(ptr)
    /**
     * Container for method_bind pointers for UPNPDevice
     */
    private object __method_bind {
      val add_port_mapping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "add_port_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_port_mapping" }
            }
          }

      val delete_port_mapping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "delete_port_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method delete_port_mapping" }
            }
          }

      val get_description_url: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "get_description_url".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_description_url" }
            }
          }

      val get_igd_control_url: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "get_igd_control_url".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_igd_control_url" }
            }
          }

      val get_igd_our_addr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "get_igd_our_addr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_igd_our_addr" }
            }
          }

      val get_igd_service_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "get_igd_service_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_igd_service_type" }
            }
          }

      val get_igd_status: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "get_igd_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_igd_status" }
            }
          }

      val get_service_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "get_service_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_service_type" }
            }
          }

      val is_valid_gateway: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "is_valid_gateway".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid_gateway" }
            }
          }

      val query_external_address: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "query_external_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method query_external_address" }
            }
          }

      val set_description_url: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "set_description_url".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_description_url" }
            }
          }

      val set_igd_control_url: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "set_igd_control_url".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_igd_control_url" }
            }
          }

      val set_igd_our_addr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "set_igd_our_addr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_igd_our_addr" }
            }
          }

      val set_igd_service_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "set_igd_service_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_igd_service_type" }
            }
          }

      val set_igd_status: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "set_igd_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_igd_status" }
            }
          }

      val set_service_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
              "set_service_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_service_type" }
            }
          }
    }
  }
}
