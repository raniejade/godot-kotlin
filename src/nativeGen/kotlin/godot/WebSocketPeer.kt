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
    val _ret = __method_bind.getConnectedHost.call(this._handle)
    return _ret.asString()
  }

  fun getConnectedPort(): Int {
    val _ret = __method_bind.getConnectedPort.call(this._handle)
    return _ret.asInt()
  }

  fun getWriteMode(): WriteMode {
    val _ret = __method_bind.getWriteMode.call(this._handle)
    return WebSocketPeer.WriteMode.from(_ret.asInt())
  }

  fun isConnectedToHost(): Boolean {
    val _ret = __method_bind.isConnectedToHost.call(this._handle)
    return _ret.asBoolean()
  }

  fun setWriteMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setWriteMode.call(this._handle, _arg, 1)
  }

  fun wasStringPacket(): Boolean {
    val _ret = __method_bind.wasStringPacket.call(this._handle)
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
      val getConnectedHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "getConnectedHost".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectedHost" }
        }
      val getConnectedPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "getConnectedPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectedPort" }
        }
      val getWriteMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "getWriteMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWriteMode" }
        }
      val isConnectedToHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "isConnectedToHost".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isConnectedToHost" }
        }
      val setWriteMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "setWriteMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWriteMode" }
        }
      val wasStringPacket: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "wasStringPacket".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wasStringPacket" }
        }}
  }
}
