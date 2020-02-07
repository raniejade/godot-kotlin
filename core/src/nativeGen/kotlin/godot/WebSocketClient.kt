// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
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

open class WebSocketClient(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : WebSocketMultiplayerPeer(null) {
  var trustedSslCertificate: X509Certificate
    get() {
       return getTrustedSslCertificate() 
    }
    set(value) {
      setTrustedSslCertificate(value)
    }

  var verifySsl: Boolean
    get() {
       return isVerifySslEnabled() 
    }
    set(value) {
      setVerifySslEnabled(value)
    }

  /**
   * WebSocketClient::connection_closed signal
   */
  val signalConnectionClosed: Signal1<Boolean> = Signal1("connection_closed")

  /**
   * WebSocketClient::connection_error signal
   */
  val signalConnectionError: Signal0 = Signal0("connection_error")

  /**
   * WebSocketClient::connection_established signal
   */
  val signalConnectionEstablished: Signal1<String> = Signal1("connection_established")

  /**
   * WebSocketClient::data_received signal
   */
  val signalDataReceived: Signal0 = Signal0("data_received")

  /**
   * WebSocketClient::server_close_request signal
   */
  val signalServerCloseRequest: Signal2<Int, String> = Signal2("server_close_request")

  constructor() : this(null) {
    _handle = __new()
  }

  fun connectToUrl(
    url: String,
    protocols: PoolStringArray,
    gdMpApi: Boolean = false,
    customHeaders: PoolStringArray
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(url))
    _args.add(Variant.fromAny(protocols))
    _args.add(Variant.fromAny(gdMpApi))
    _args.add(Variant.fromAny(customHeaders))
    val _ret = __method_bind.connectToUrl.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun disconnectFromHost(code: Int = 1000, reason: String = "") {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(code))
    _args.add(Variant.fromAny(reason))
    __method_bind.disconnectFromHost.call(this._handle, _args)
  }

  fun getConnectedHost(): String {
    val _ret = __method_bind.getConnectedHost.call(this._handle)
    return _ret.asString()
  }

  fun getConnectedPort(): Int {
    val _ret = __method_bind.getConnectedPort.call(this._handle)
    return _ret.asInt()
  }

  fun getTrustedSslCertificate(): X509Certificate {
    val _ret = __method_bind.getTrustedSslCertificate.call(this._handle)
    return _ret.asObject(::X509Certificate)!!
  }

  fun isVerifySslEnabled(): Boolean {
    val _ret = __method_bind.isVerifySslEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setTrustedSslCertificate(arg0: X509Certificate) {
    val _arg = Variant(arg0)
    __method_bind.setTrustedSslCertificate.call(this._handle, listOf(_arg))
  }

  fun setVerifySslEnabled(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setVerifySslEnabled.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketClient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebSocketClient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WebSocketClient
     */
    private object __method_bind {
      val connectToUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "connect_to_url".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_url" }
        }
      val disconnectFromHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "disconnect_from_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_from_host" }
        }
      val getConnectedHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "get_connected_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
        }
      val getConnectedPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "get_connected_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
        }
      val getTrustedSslCertificate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "get_trusted_ssl_certificate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_trusted_ssl_certificate" }
        }
      val isVerifySslEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "is_verify_ssl_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_verify_ssl_enabled" }
        }
      val setTrustedSslCertificate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "set_trusted_ssl_certificate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_trusted_ssl_certificate" }
        }
      val setVerifySslEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "set_verify_ssl_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_verify_ssl_enabled" }
        }}
  }
}
