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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebSocketServer(
  _handle: COpaquePointer
) : WebSocketMultiplayerPeer(_handle) {
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

  fun disconnectPeer(
    id: Int,
    code: Int = 1000,
    reason: String = ""
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(code)
    _args.append(reason)
    __method_bind.disconnectPeer.call(this._handle, _args.toVariant(), 3)
  }

  fun getBindIp(): String {
    val _ret = __method_bind.getBindIp.call(this._handle)
    return _ret.asString()
  }

  fun getCaChain(): X509Certificate {
    val _ret = __method_bind.getCaChain.call(this._handle)
    return _ret.asObject(::X509Certificate)!!
  }

  fun getPeerAddress(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPeerAddress.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getPeerPort(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPeerPort.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getPrivateKey(): CryptoKey {
    val _ret = __method_bind.getPrivateKey.call(this._handle)
    return _ret.asObject(::CryptoKey)!!
  }

  fun getSslCertificate(): X509Certificate {
    val _ret = __method_bind.getSslCertificate.call(this._handle)
    return _ret.asObject(::X509Certificate)!!
  }

  fun hasPeer(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.hasPeer.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isListening(): Boolean {
    val _ret = __method_bind.isListening.call(this._handle)
    return _ret.asBoolean()
  }

  fun listen(
    port: Int,
    protocols: PoolStringArray,
    gdMpApi: Boolean = false
  ): GDError {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(protocols)
    _args.append(gdMpApi)
    val _ret = __method_bind.listen.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun setBindIp(arg0: String) {
    val _arg = Variant.new(arg0)
    __method_bind.setBindIp.call(this._handle, _arg, 1)
  }

  fun setCaChain(arg0: X509Certificate) {
    val _arg = Variant.new(arg0)
    __method_bind.setCaChain.call(this._handle, _arg, 1)
  }

  fun setPrivateKey(arg0: CryptoKey) {
    val _arg = Variant.new(arg0)
    __method_bind.setPrivateKey.call(this._handle, _arg, 1)
  }

  fun setSslCertificate(arg0: X509Certificate) {
    val _arg = Variant.new(arg0)
    __method_bind.setSslCertificate.call(this._handle, _arg, 1)
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    fun new(): WebSocketServer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketServer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebSocketServer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebSocketServer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebSocketServer = WebSocketServer(ptr)
    /**
     * Container for method_bind pointers for WebSocketServer
     */
    private object __method_bind {
      val disconnectPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "disconnect_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_peer" }
        }
      val getBindIp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_bind_ip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_ip" }
        }
      val getCaChain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_ca_chain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ca_chain" }
        }
      val getPeerAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_peer_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peer_address" }
        }
      val getPeerPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_peer_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peer_port" }
        }
      val getPrivateKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_private_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_private_key" }
        }
      val getSslCertificate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "get_ssl_certificate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ssl_certificate" }
        }
      val hasPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "has_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_peer" }
        }
      val isListening: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "is_listening".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_listening" }
        }
      val listen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val setBindIp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_bind_ip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_ip" }
        }
      val setCaChain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_ca_chain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ca_chain" }
        }
      val setPrivateKey: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_private_key".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_private_key" }
        }
      val setSslCertificate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "set_ssl_certificate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ssl_certificate" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
