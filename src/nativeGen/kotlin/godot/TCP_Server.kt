// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TCP_Server internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun isConnectionAvailable(): Boolean {
    TODO()
  }

  fun listen(): Error {
    TODO()
  }

  fun stop() {
    TODO()
  }

  fun takeConnection(): StreamPeerTCP {
    TODO()
  }

  companion object {
    fun new(): TCP_Server = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TCP_Server".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TCP_Server" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TCP_Server(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for TCP_Server
     */
    private object __method_bind {
      val is_connection_available: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
              "is_connection_available".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_connection_available" }
            }
          }

      val listen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
              "listen".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method listen" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }

      val take_connection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
              "take_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method take_connection" }
            }
          }
    }
  }
}
