// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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

open class StreamPeerTCP internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  fun connectToHost(host: String, port: Int): GDError {
    val _args = VariantArray.new()
    _args.append(host)
    _args.append(port)
    val _ret = __method_bind.connect_to_host.call(this.toVariant(), _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun disconnectFromHost() {
    __method_bind.disconnect_from_host.call(this.toVariant())
  }

  fun getConnectedHost(): String {
    val _ret = __method_bind.get_connected_host.call(this.toVariant())
    return _ret.asString()
  }

  fun getConnectedPort(): Int {
    val _ret = __method_bind.get_connected_port.call(this.toVariant())
    return _ret.asInt()
  }

  fun getStatus(): Status {
    val _ret = __method_bind.get_status.call(this.toVariant())
    return StreamPeerTCP.Status.from(_ret.asInt())
  }

  fun isConnectedToHost(): Boolean {
    val _ret = __method_bind.is_connected_to_host.call(this.toVariant())
    return _ret.asBool()
  }

  fun setNoDelay(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_no_delay.call(this.toVariant(), _arg, 1)
  }

  enum class Status(
    val value: Int
  ) {
    STATUS_NONE(0),

    STATUS_CONNECTING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3);

    companion object {
      fun from(value: Int): Status {
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
    val STATUS_CONNECTED: Int = 2

    val STATUS_CONNECTING: Int = 1

    val STATUS_ERROR: Int = 3

    val STATUS_NONE: Int = 0

    fun new(): StreamPeerTCP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerTCP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StreamPeerTCP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerTCP(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StreamPeerTCP = StreamPeerTCP(ptr)
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
