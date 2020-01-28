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

open class StreamPeerTCP(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  fun connectToHost(host: String, port: Int): GDError {
    val _args = VariantArray.new()
    _args.append(host)
    _args.append(port)
    val _ret = __method_bind.connectToHost.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.setNoDelay.call(this._handle, _arg, 1)
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
      val connectToHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "connectToHost".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connectToHost" }
        }
      val disconnectFromHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "disconnectFromHost".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnectFromHost" }
        }
      val getConnectedHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "getConnectedHost".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectedHost" }
        }
      val getConnectedPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "getConnectedPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectedPort" }
        }
      val getStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "getStatus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStatus" }
        }
      val isConnectedToHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "isConnectedToHost".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isConnectedToHost" }
        }
      val setNoDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "setNoDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNoDelay" }
        }}
  }
}
