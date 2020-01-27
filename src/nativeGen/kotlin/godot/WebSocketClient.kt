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

open class WebSocketClient internal constructor(
  _handle: COpaquePointer
) : WebSocketMultiplayerPeer(_handle) {
  fun connectToUrl(
    url: String,
    protocols: PoolStringArray,
    gdMpApi: Boolean
  ): GDError {
    val _args = VariantArray.new()
    _args.append(url)
    _args.append(protocols)
    _args.append(gdMpApi)
    val _ret = __method_bind.connect_to_url.call(this.toVariant(), _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun disconnectFromHost(code: Int, reason: String) {
    val _args = VariantArray.new()
    _args.append(code)
    _args.append(reason)
    __method_bind.disconnect_from_host.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun isVerifySslEnabled(): Boolean {
    val _ret = __method_bind.is_verify_ssl_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun setVerifySslEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_verify_ssl_enabled.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): WebSocketClient = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketClient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WebSocketClient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebSocketClient(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebSocketClient = WebSocketClient(ptr)
    /**
     * Container for method_bind pointers for WebSocketClient
     */
    private object __method_bind {
      val connect_to_url: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "connect_to_url".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_to_url" }
            }
          }

      val disconnect_from_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "disconnect_from_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_from_host" }
            }
          }

      val is_verify_ssl_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "is_verify_ssl_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_verify_ssl_enabled" }
            }
          }

      val set_verify_ssl_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
              "set_verify_ssl_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_verify_ssl_enabled" }
            }
          }
    }
  }
}
