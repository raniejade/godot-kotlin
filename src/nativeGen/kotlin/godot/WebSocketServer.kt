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

open class WebSocketServer internal constructor(
  _handle: COpaquePointer
) : WebSocketMultiplayerPeer(_handle) {
  fun disconnectPeer(
    id: Int,
    code: Int,
    reason: String
  ) {
    TODO()
  }

  fun getPeerAddress(id: Int): String {
    TODO()
  }

  fun getPeerPort(id: Int): Int {
    TODO()
  }

  fun hasPeer(id: Int): Boolean {
    TODO()
  }

  fun isListening(): Boolean {
    TODO()
  }

  fun listen(
    port: Int,
    protocols: PoolStringArray,
    gd_mp_api: Boolean
  ): Error {
    TODO()
  }

  fun stop() {
    TODO()
  }

  companion object {
    fun new(): WebSocketServer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketServer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WebSocketServer" }
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
      val disconnect_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
              "disconnect_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_peer" }
            }
          }

      val get_peer_address: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
              "get_peer_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer_address" }
            }
          }

      val get_peer_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
              "get_peer_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer_port" }
            }
          }

      val has_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
              "has_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_peer" }
            }
          }

      val is_listening: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
              "is_listening".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_listening" }
            }
          }

      val listen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
              "listen".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method listen" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }
    }
  }
}
