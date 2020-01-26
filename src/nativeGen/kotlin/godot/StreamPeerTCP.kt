// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeerTCP internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  enum class Status(
    val value: Int
  ) {
    STATUS_NONE(0),

    STATUS_CONNECTING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3);
  }

  companion object {
    val STATUS_CONNECTED: Int = 2

    val STATUS_CONNECTING: Int = 1

    val STATUS_ERROR: Int = 3

    val STATUS_NONE: Int = 0

    fun new(): StreamPeerTCP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerTCP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StreamPeerTCP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerTCP(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for StreamPeerTCP
     */
    private object __method_bind {
      val connect_to_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
              "connect_to_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_to_host" }
            }
          }

      val disconnect_from_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
              "disconnect_from_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_from_host" }
            }
          }

      val get_connected_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
              "get_connected_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
            }
          }

      val get_connected_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
              "get_connected_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
            }
          }

      val get_status: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
              "get_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_status" }
            }
          }

      val is_connected_to_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
              "is_connected_to_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_connected_to_host" }
            }
          }

      val set_no_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
              "set_no_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_no_delay" }
            }
          }
    }
  }
}
