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

open class UPNPDevice(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var descriptionUrl: String
    get() {
       return getDescriptionUrl() 
    }
    set(value) {
      setDescriptionUrl(value)
    }

  var igdControlUrl: String
    get() {
       return getIgdControlUrl() 
    }
    set(value) {
      setIgdControlUrl(value)
    }

  var igdOurAddr: String
    get() {
       return getIgdOurAddr() 
    }
    set(value) {
      setIgdOurAddr(value)
    }

  var igdServiceType: String
    get() {
       return getIgdServiceType() 
    }
    set(value) {
      setIgdServiceType(value)
    }

  var igdStatus: IGDStatus
    get() {
       return getIgdStatus() 
    }
    set(value) {
      setIgdStatus(value.value)
    }

  var serviceType: String
    get() {
       return getServiceType() 
    }
    set(value) {
      setServiceType(value)
    }

  constructor() : this(null) {
    _handle = __new()
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

  fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(port))
    _args.add(Variant.fromAny(proto))
    val _ret = __method_bind.deletePortMapping.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getDescriptionUrl(): String {
    val _ret = __method_bind.getDescriptionUrl.call(this._handle)
    return _ret.asString()
  }

  fun getIgdControlUrl(): String {
    val _ret = __method_bind.getIgdControlUrl.call(this._handle)
    return _ret.asString()
  }

  fun getIgdOurAddr(): String {
    val _ret = __method_bind.getIgdOurAddr.call(this._handle)
    return _ret.asString()
  }

  fun getIgdServiceType(): String {
    val _ret = __method_bind.getIgdServiceType.call(this._handle)
    return _ret.asString()
  }

  fun getIgdStatus(): IGDStatus {
    val _ret = __method_bind.getIgdStatus.call(this._handle)
    return UPNPDevice.IGDStatus.from(_ret.asInt())
  }

  fun getServiceType(): String {
    val _ret = __method_bind.getServiceType.call(this._handle)
    return _ret.asString()
  }

  fun isValidGateway(): Boolean {
    val _ret = __method_bind.isValidGateway.call(this._handle)
    return _ret.asBoolean()
  }

  fun queryExternalAddress(): String {
    val _ret = __method_bind.queryExternalAddress.call(this._handle)
    return _ret.asString()
  }

  fun setDescriptionUrl(url: String) {
    val _arg = Variant.new(url)
    __method_bind.setDescriptionUrl.call(this._handle, listOf(_arg))
  }

  fun setIgdControlUrl(url: String) {
    val _arg = Variant.new(url)
    __method_bind.setIgdControlUrl.call(this._handle, listOf(_arg))
  }

  fun setIgdOurAddr(addr: String) {
    val _arg = Variant.new(addr)
    __method_bind.setIgdOurAddr.call(this._handle, listOf(_arg))
  }

  fun setIgdServiceType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.setIgdServiceType.call(this._handle, listOf(_arg))
  }

  fun setIgdStatus(status: Int) {
    val _arg = Variant.new(status)
    __method_bind.setIgdStatus.call(this._handle, listOf(_arg))
  }

  fun setServiceType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.setServiceType.call(this._handle, listOf(_arg))
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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UPNPDevice".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for UPNPDevice" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for UPNPDevice
     */
    private object __method_bind {
      val addPortMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "add_port_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_port_mapping" }
        }
      val deletePortMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "delete_port_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delete_port_mapping" }
        }
      val getDescriptionUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_description_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_description_url" }
        }
      val getIgdControlUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_control_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_control_url" }
        }
      val getIgdOurAddr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_our_addr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_our_addr" }
        }
      val getIgdServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_service_type" }
        }
      val getIgdStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_igd_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_igd_status" }
        }
      val getServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "get_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_service_type" }
        }
      val isValidGateway: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "is_valid_gateway".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid_gateway" }
        }
      val queryExternalAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "query_external_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method query_external_address" }
        }
      val setDescriptionUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_description_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_description_url" }
        }
      val setIgdControlUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_control_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_control_url" }
        }
      val setIgdOurAddr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_our_addr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_our_addr" }
        }
      val setIgdServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_service_type" }
        }
      val setIgdStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_igd_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_igd_status" }
        }
      val setServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "set_service_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_service_type" }
        }}
  }
}
