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

  var igdStatus: Int
    get() {
       return UPNPDevice.IGDStatus.from(getIgdStatus()) 
    }
    set(value) {
      setIgdStatus(UPNPDevice.IGDStatus.from(value))
    }

  var serviceType: String
    get() {
       return getServiceType() 
    }
    set(value) {
      setServiceType(value)
    }

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
    val _ret = __method_bind.addPortMapping.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun deletePortMapping(port: Int, proto: String): Int {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(proto)
    val _ret = __method_bind.deletePortMapping.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.setDescriptionUrl.call(this._handle, _arg, 1)
  }

  fun setIgdControlUrl(url: String) {
    val _arg = Variant.new(url)
    __method_bind.setIgdControlUrl.call(this._handle, _arg, 1)
  }

  fun setIgdOurAddr(addr: String) {
    val _arg = Variant.new(addr)
    __method_bind.setIgdOurAddr.call(this._handle, _arg, 1)
  }

  fun setIgdServiceType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.setIgdServiceType.call(this._handle, _arg, 1)
  }

  fun setIgdStatus(status: Int) {
    val _arg = Variant.new(status)
    __method_bind.setIgdStatus.call(this._handle, _arg, 1)
  }

  fun setServiceType(type: String) {
    val _arg = Variant.new(type)
    __method_bind.setServiceType.call(this._handle, _arg, 1)
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
      val addPortMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "addPortMapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPortMapping" }
        }
      val deletePortMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "deletePortMapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deletePortMapping" }
        }
      val getDescriptionUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "getDescriptionUrl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDescriptionUrl" }
        }
      val getIgdControlUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "getIgdControlUrl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIgdControlUrl" }
        }
      val getIgdOurAddr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "getIgdOurAddr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIgdOurAddr" }
        }
      val getIgdServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "getIgdServiceType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIgdServiceType" }
        }
      val getIgdStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "getIgdStatus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIgdStatus" }
        }
      val getServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "getServiceType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getServiceType" }
        }
      val isValidGateway: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "isValidGateway".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isValidGateway" }
        }
      val queryExternalAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "queryExternalAddress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queryExternalAddress" }
        }
      val setDescriptionUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "setDescriptionUrl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDescriptionUrl" }
        }
      val setIgdControlUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "setIgdControlUrl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIgdControlUrl" }
        }
      val setIgdOurAddr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "setIgdOurAddr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIgdOurAddr" }
        }
      val setIgdServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "setIgdServiceType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIgdServiceType" }
        }
      val setIgdStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "setIgdStatus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIgdStatus" }
        }
      val setServiceType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("UPNPDevice".cstr.ptr,
            "setServiceType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setServiceType" }
        }}
  }
}
