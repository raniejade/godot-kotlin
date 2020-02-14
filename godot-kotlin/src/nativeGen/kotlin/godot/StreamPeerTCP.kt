// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
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

open class StreamPeerTCP(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : StreamPeer(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun connectToHost(host: String, port: Int): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(host)
      _args.add(port)
      __method_bind.connectToHost.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun disconnectFromHost() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.disconnectFromHost.call(self._handle, emptyList(), null)
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

  fun getStatus(): Status {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStatus.call(self._handle, emptyList(), _retPtr)
      StreamPeerTCP.Status.from(_ret.value)
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerTCP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StreamPeerTCP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StreamPeerTCP
     */
    private object __method_bind {
      val connectToHost: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "connect_to_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_host" }
        }
      val disconnectFromHost: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "disconnect_from_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_from_host" }
        }
      val getConnectedHost: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "get_connected_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_host" }
        }
      val getConnectedPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "get_connected_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_port" }
        }
      val getStatus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "get_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_status" }
        }
      val isConnectedToHost: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "is_connected_to_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_connected_to_host" }
        }
      val setNoDelay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerTCP".cstr.ptr,
            "set_no_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_no_delay" }
        }}
  }
}
