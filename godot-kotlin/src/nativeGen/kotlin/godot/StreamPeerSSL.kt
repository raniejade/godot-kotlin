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

open class StreamPeerSSL(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : StreamPeer(null) {
  var blockingHandshake: Boolean
    get() {
       return isBlockingHandshakeEnabled() 
    }
    set(value) {
      setBlockingHandshakeEnabled(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun acceptStream(
    stream: StreamPeer,
    privateKey: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(stream)
      _args.add(privateKey)
      _args.add(certificate)
      _args.add(chain)
      __method_bind.acceptStream.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun connectToStream(
    stream: StreamPeer,
    validateCerts: Boolean = false,
    forHostname: String = "",
    validCertificate: X509Certificate
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(stream)
      _args.add(validateCerts)
      _args.add(forHostname)
      _args.add(validCertificate)
      __method_bind.connectToStream.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun disconnectFromStream() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.disconnectFromStream.call(self._handle, emptyList(), null)
    }
  }

  fun getStatus(): Status {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStatus.call(self._handle, emptyList(), _retPtr)
      StreamPeerSSL.Status.from(_ret.value)
    }
  }

  fun isBlockingHandshakeEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBlockingHandshakeEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun poll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.poll.call(self._handle, emptyList(), null)
    }
  }

  fun setBlockingHandshakeEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBlockingHandshakeEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  enum class Status(
    val value: Int
  ) {
    DISCONNECTED(0),

    HANDSHAKING(1),

    CONNECTED(2),

    ERROR(3),

    ERROR_HOSTNAME_MISMATCH(4);

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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerSSL".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StreamPeerSSL" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StreamPeerSSL
     */
    private object __method_bind {
      val acceptStream: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "accept_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method accept_stream" }
        }
      val connectToStream: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "connect_to_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_stream" }
        }
      val disconnectFromStream: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "disconnect_from_stream".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_from_stream" }
        }
      val getStatus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "get_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_status" }
        }
      val isBlockingHandshakeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "is_blocking_handshake_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_blocking_handshake_enabled" }
        }
      val poll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val setBlockingHandshakeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerSSL".cstr.ptr,
            "set_blocking_handshake_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blocking_handshake_enabled" }
        }}
  }
}
