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
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeerTCP(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  fun connectToHost(host: String, port: Int): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(host))
    _args.add(Variant.fromAny(port))
    val _ret = __method_bind.connectToHost.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun disconnectFromHost() {
    __method_bind.disconnectFromHost.call(this._handle)
  }

  fun getConnectedHost(): String {
    val _ret = __method_bind.getConnectedHost.call(this._handle)
    return _ret.asString()
  }

  fun getConnectedPort(): Int {
    val _ret = __method_bind.getConnectedPort.call(this._handle)
    return _ret.asInt()
  }

  fun getStatus(): Status {
    val _ret = __method_bind.getStatus.call(this._handle)
    return StreamPeerTCP.Status.from(_ret.asInt())
  }

  fun isConnectedToHost(): Boolean {
    val _ret = __method_bind.isConnectedToHost.call(this._handle)
    return _ret.asBoolean()
  }

  fun setNoDelay(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setNoDelay.call(this._handle, listOf(_arg))
  }

  enum class Status(
    val value: Int
  ) {
    NONE(0),

    CONNECTING(1),

    CONNECTED(2),

    ERROR(3);

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
      val connectToHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "connect_to_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_host" }
        }
      val disconnectFromHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "disconnect_from_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_from_host" }
        }
      val getConnectedHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "get_connected_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
        }
      val getConnectedPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "get_connected_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
        }
      val getStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "get_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_status" }
        }
      val isConnectedToHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "is_connected_to_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_connected_to_host" }
        }
      val setNoDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "set_no_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_no_delay" }
        }}
  }
}
