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

open class WebSocketServer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : WebSocketMultiplayerPeer(null) {
  var bindIp: String
    get() {
       return getBindIp() 
    }
    set(value) {
      setBindIp(value)
    }

  var caChain: X509Certificate
    get() {
       return getCaChain() 
    }
    set(value) {
      setCaChain(value)
    }

  var privateKey: CryptoKey
    get() {
       return getPrivateKey() 
    }
    set(value) {
      setPrivateKey(value)
    }

  var sslCertificate: X509Certificate
    get() {
       return getSslCertificate() 
    }
    set(value) {
      setSslCertificate(value)
    }

  /**
   * WebSocketServer::client_close_request signal
   */
  val signalClientCloseRequest: Signal3<Int, Int, String> = Signal3("client_close_request")

  /**
   * WebSocketServer::client_connected signal
   */
  val signalClientConnected: Signal2<Int, String> = Signal2("client_connected")

  /**
   * WebSocketServer::client_disconnected signal
   */
  val signalClientDisconnected: Signal2<Int, Boolean> = Signal2("client_disconnected")

  /**
   * WebSocketServer::data_received signal
   */
  val signalDataReceived: Signal1<Int> = Signal1("data_received")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun disconnectPeer(
    id: Int,
    code: Int = 1000,
    reason: String = ""
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(code)
      _args.add(reason)
      __method_bind.disconnectPeer.call(self._handle, _args, null)
    }
  }

  fun getBindIp(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBindIp.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCaChain(): X509Certificate {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: X509Certificate
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCaChain.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<X509Certificate>(_tmp.value!!)
      _ret
    }
  }

  fun getPeerAddress(id: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPeerAddress.call(self._handle, listOf(id), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPeerPort(id: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPeerPort.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun getPrivateKey(): CryptoKey {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: CryptoKey
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPrivateKey.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<CryptoKey>(_tmp.value!!)
      _ret
    }
  }

  fun getSslCertificate(): X509Certificate {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: X509Certificate
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSslCertificate.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<X509Certificate>(_tmp.value!!)
      _ret
    }
  }

  fun hasPeer(id: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasPeer.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun isListening(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isListening.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun listen(
    port: Int,
    protocols: PoolStringArray,
    gdMpApi: Boolean = false
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(port)
      _args.add(protocols)
      _args.add(gdMpApi)
      __method_bind.listen.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setBindIp(arg0: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBindIp.call(self._handle, listOf(arg0), null)
    }
  }

  fun setCaChain(arg0: X509Certificate) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCaChain.call(self._handle, listOf(arg0), null)
    }
  }

  fun setPrivateKey(arg0: CryptoKey) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPrivateKey.call(self._handle, listOf(arg0), null)
    }
  }

  fun setSslCertificate(arg0: X509Certificate) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSslCertificate.call(self._handle, listOf(arg0), null)
    }
  }

  fun stop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketServer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebSocketServer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WebSocketServer
     */
    private object __method_bind {
      val disconnectPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "disconnect_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_peer" }
        }
      val getBindIp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_bind_ip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_ip" }
        }
      val getCaChain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_ca_chain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ca_chain" }
        }
      val getPeerAddress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_peer_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peer_address" }
        }
      val getPeerPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_peer_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peer_port" }
        }
      val getPrivateKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_private_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_private_key" }
        }
      val getSslCertificate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_ssl_certificate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssl_certificate" }
        }
      val hasPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "has_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_peer" }
        }
      val isListening: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "is_listening".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_listening" }
        }
      val listen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val setBindIp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_bind_ip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_ip" }
        }
      val setCaChain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_ca_chain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ca_chain" }
        }
      val setPrivateKey: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_private_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_private_key" }
        }
      val setSslCertificate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_ssl_certificate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssl_certificate" }
        }
      val stop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
