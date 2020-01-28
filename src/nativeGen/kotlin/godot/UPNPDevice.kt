// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class UPNPDevice(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addPortMapping(
    port: Int,
    portInternal: Int,
    desc: String,
    proto: String,
    duration: Int
  ): Int {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(portInternal)
    _args.append(desc)
    _args.append(proto)
    _args.append(duration)
    val _ret = __method_bind.add_port_mapping.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun deletePortMapping(port: Int, proto: String): Int {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(proto)
    val _ret = __method_bind.delete_port_mapping.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getDescriptionUrl(): String {
    val _ret = __method_bind.get_description_url.call(this._handle)
    return _ret.asString()
  }

  fun getIgdControlUrl(): String {
    val _ret = __method_bind.get_igd_control_url.call(this._handle)
    return _ret.asString()
  }

  fun getIgdOurAddr(): String {
    val _ret = __method_bind.get_igd_our_addr.call(this._handle)
    return _ret.asString()
  }

  fun getIgdServiceType(): String {
    val _ret = __method_bind.get_igd_service_type.call(this._handle)
    return _ret.asString()
  }

  fun getIgdStatus(): IGDStatus {
    val _ret = __method_bind.get_igd_status.call(this._handle)
    return UPNPDevice.IGDStatus.from(_ret.asInt())
  }

  fun getServiceType(): String {
    val _ret = __method_bind.get_service_type.call(this._handle)
    return _ret.asString()
  }

  fun isValidGateway(): Boolean {
    val _ret = __method_bind.is_valid_gateway.call(this._handle)
    return _ret.asBoolean()
  }

  fun queryExternalAddress(): String {
    val _ret = __method_bind.query_external_address.call(this._handle)
    return _ret.asString()
  }

  fun setDescriptionUrl(url: String) {
    val _arg = Variant.new(url)
    __method_bind.set_description_url.call(this._handle, _arg, 1)
  }

  fun setIgdControlUrl(url: String) {
    val _arg = Variant.new(url)
    __method_bind.set_igd_control_url.call(this._handle, _arg, 1)
  }

  fun setIgdOurAddr(addr: String) {
    val _arg = Variant.new(addr)
    __method_bind.set_igd_our_addr.call(this._handle, _arg, 1)
  }

  fun setIgdServiceType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.set_igd_service_type.call(this._handle, _arg, 1)
  }

  fun setIgdStatus(status: Int) {
    val _arg = Variant.new(status)
    __method_bind.set_igd_status.call(this._handle, _arg, 1)
  }

  fun setServiceType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.set_service_type.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for UPNPDevice" }
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
      val add_port_mapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "add_port_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_port_mapping" }
        }
      val delete_port_mapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "delete_port_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delete_port_mapping" }
        }
      val get_description_url: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_description_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_description_url" }
        }
      val get_igd_control_url: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_control_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_control_url" }
        }
      val get_igd_our_addr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_our_addr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_our_addr" }
        }
      val get_igd_service_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_service_type" }
        }
      val get_igd_status: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_status" }
        }
      val get_service_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_service_type" }
        }
      val is_valid_gateway: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "is_valid_gateway".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid_gateway" }
        }
      val query_external_address: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "query_external_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method query_external_address" }
        }
      val set_description_url: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_description_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_description_url" }
        }
      val set_igd_control_url: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_control_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_control_url" }
        }
      val set_igd_our_addr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_our_addr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_our_addr" }
        }
      val set_igd_service_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_service_type" }
        }
      val set_igd_status: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_status" }
        }
      val set_service_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_service_type" }
        }}
  }
}
