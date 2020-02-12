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

open class PacketPeerUDP(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PacketPeer(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun close() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.close.call(self._handle, emptyList(), null)
    }
  }

  fun getPacketIp(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPacketIp.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPacketPort(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPacketPort.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isListening(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isListening.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(multicastAddress)
      _args.add(interfaceName)
      __method_bind.joinMulticastGroup.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(multicastAddress)
      _args.add(interfaceName)
      __method_bind.leaveMulticastGroup.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun listen(
    port: Int,
    bindAddress: String = "*",
    recvBufSize: Int = 65536
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(port)
      _args.add(bindAddress)
      _args.add(recvBufSize)
      __method_bind.listen.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setBroadcastEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBroadcastEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setDestAddress(host: String, port: Int): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(host)
      _args.add(port)
      __method_bind.setDestAddress.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun wait(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.wait.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PacketPeerUDP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PacketPeerUDP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PacketPeerUDP
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val getPacketIp: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "get_packet_ip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_ip" }
        }
      val getPacketPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "get_packet_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_port" }
        }
      val isListening: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "is_listening".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_listening" }
        }
      val joinMulticastGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "join_multicast_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method join_multicast_group" }
        }
      val leaveMulticastGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "leave_multicast_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method leave_multicast_group" }
        }
      val listen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val setBroadcastEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "set_broadcast_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_broadcast_enabled" }
        }
      val setDestAddress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "set_dest_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dest_address" }
        }
      val wait: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "wait".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wait" }
        }}
  }
}
