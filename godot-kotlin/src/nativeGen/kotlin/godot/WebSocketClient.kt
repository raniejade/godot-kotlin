// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun connectToUrl(
    url: String,
    protocols: PoolStringArray,
    gdMpApi: Boolean = false,
    customHeaders: PoolStringArray
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(url)
      _args.add(protocols)
      _args.add(gdMpApi)
      _args.add(customHeaders)
      __method_bind.connectToUrl.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun disconnectFromHost(code: Int = 1000, reason: String = "") {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(code)
      _args.add(reason)
      __method_bind.disconnectFromHost.call(self._handle, _args, null)
    }
  }

  fun getConnectedHost(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getConnectedHost.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getConnectedPort(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectedPort.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTrustedSslCertificate(): X509Certificate {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: X509Certificate
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTrustedSslCertificate.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<X509Certificate>(_tmp.value!!)
      _ret
    }
  }

  fun isVerifySslEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVerifySslEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setTrustedSslCertificate(arg0: X509Certificate) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTrustedSslCertificate.call(self._handle, listOf(arg0), null)
    }
  }

  fun setVerifySslEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVerifySslEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
      val connectToUrl: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "connect_to_url".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_to_url" }
            }
          }

      val disconnectFromHost: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "disconnect_from_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_from_host" }
            }
          }

      val getConnectedHost: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "get_connected_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
            }
          }

      val getConnectedPort: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "get_connected_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
            }
          }

      val getTrustedSslCertificate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "get_trusted_ssl_certificate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_trusted_ssl_certificate" }
            }
          }

      val isVerifySslEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "is_verify_ssl_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_verify_ssl_enabled" }
            }
          }

      val setTrustedSslCertificate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "set_trusted_ssl_certificate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_trusted_ssl_certificate" }
            }
          }

      val setVerifySslEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "set_verify_ssl_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_verify_ssl_enabled" }
            }
          }
    }
  }
}
