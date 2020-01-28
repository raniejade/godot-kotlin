// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class WebSocketPeer(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun close(code: Int, reason: String) {
    val _args = VariantArray.new()
    _args.append(code)
    _args.append(reason)
    __method_bind.close.call(this._handle, _args.toVariant(), 2)
  }

  fun getConnectedHost(): String {
    val _ret = __method_bind.get_connected_host.call(this._handle)
    return _ret.asString()
  }

  fun getConnectedPort(): Int {
    val _ret = __method_bind.get_connected_port.call(this._handle)
    return _ret.asInt()
  }

  fun getWriteMode(): WriteMode {
    val _ret = __method_bind.get_write_mode.call(this._handle)
    return WebSocketPeer.WriteMode.from(_ret.asInt())
  }

  fun isConnectedToHost(): Boolean {
    val _ret = __method_bind.is_connected_to_host.call(this._handle)
    return _ret.asBoolean()
  }

  fun setWriteMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_write_mode.call(this._handle, _arg, 1)
  }

  fun wasStringPacket(): Boolean {
    val _ret = __method_bind.was_string_packet.call(this._handle)
    return _ret.asBoolean()
  }

  enum class WriteMode(
    val value: Int
  ) {
    WRITE_MODE_TEXT(0),

    WRITE_MODE_BINARY(1);

    companion object {
      fun from(value: Int): WriteMode {
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
    val WRITE_MODE_BINARY: Int = 1

    val WRITE_MODE_TEXT: Int = 0

    fun new(): WebSocketPeer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketPeer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebSocketPeer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebSocketPeer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebSocketPeer = WebSocketPeer(ptr)
    /**
     * Container for method_bind pointers for WebSocketPeer
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val get_connected_host: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "get_connected_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
        }
      val get_connected_port: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "get_connected_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
        }
      val get_write_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "get_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_write_mode" }
        }
      val is_connected_to_host: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "is_connected_to_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_connected_to_host" }
        }
      val set_write_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "set_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_write_mode" }
        }
      val was_string_packet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "was_string_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method was_string_packet" }
        }}
  }
}
