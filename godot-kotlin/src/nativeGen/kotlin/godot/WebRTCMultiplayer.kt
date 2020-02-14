// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
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

open class WebRTCMultiplayer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : NetworkedMultiplayerPeer(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Int,
    unreliableLifetime: Int = 1
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(peer)
      _args.add(peerId)
      _args.add(unreliableLifetime)
      __method_bind.addPeer.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun close() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.close.call(self._handle, emptyList(), null)
    }
  }

  fun getPeer(peerId: Int): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getPeer.call(self._handle, listOf(peerId), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPeers(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getPeers.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasPeer(peerId: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasPeer.call(self._handle, listOf(peerId), _retPtr)
      _ret.value
    }
  }

  fun initialize(peerId: Int, serverCompatibility: Boolean = false): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(peerId)
      _args.add(serverCompatibility)
      __method_bind.initialize.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun removePeer(peerId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removePeer.call(self._handle, listOf(peerId), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebRTCMultiplayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebRTCMultiplayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WebRTCMultiplayer
     */
    private object __method_bind {
      val addPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "add_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_peer" }
        }
      val close: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val getPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "get_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peer" }
        }
      val getPeers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "get_peers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peers" }
        }
      val hasPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "has_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_peer" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val removePeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "remove_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_peer" }
        }}
  }
}
