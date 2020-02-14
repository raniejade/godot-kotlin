// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class WebSocketPeer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PacketPeer(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun close(code: Int = 1000, reason: String = "") {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(code)
      _args.add(reason)
      __method_bind.close.call(self._handle, _args, null)
    }
  }

  fun getConnectedHost(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getConnectedHost.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getConnectedPort(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectedPort.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getWriteMode(): WriteMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWriteMode.call(self._handle, emptyList(), _retPtr)
      WebSocketPeer.WriteMode.from(_ret.value)
    }
  }

  fun isConnectedToHost(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isConnectedToHost.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setNoDelay(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNoDelay.call(self._handle, listOf(enabled), null)
    }
  }

  fun setWriteMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWriteMode.call(self._handle, listOf(mode), null)
    }
  }

  fun wasStringPacket(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.wasStringPacket.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  enum class WriteMode(
    val value: Int
  ) {
    TEXT(0),

    BINARY(1);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketPeer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebSocketPeer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WebSocketPeer
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val getConnectedHost: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "get_connected_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
        }
      val getConnectedPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "get_connected_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
        }
      val getWriteMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "get_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_write_mode" }
        }
      val isConnectedToHost: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "is_connected_to_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_connected_to_host" }
        }
      val setNoDelay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "set_no_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_no_delay" }
        }
      val setWriteMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "set_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_write_mode" }
        }
      val wasStringPacket: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketPeer".cstr.ptr,
            "was_string_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method was_string_packet" }
        }}
  }
}
