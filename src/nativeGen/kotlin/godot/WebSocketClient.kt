// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
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
    gd_mp_api: Boolean
  ): Error {
    TODO()
  }

  fun disconnectFromHost(code: Int, reason: String) {
    TODO()
  }

  fun isVerifySslEnabled(): Boolean {
    TODO()
  }

  fun setVerifySslEnabled(enabled: Boolean) {
    TODO()
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
