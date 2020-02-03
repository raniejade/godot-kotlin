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

open class PacketPeerUDP(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun close() {
    __method_bind.close.call(this._handle)
  }

  fun getPacketIp(): String {
    val _ret = __method_bind.getPacketIp.call(this._handle)
    return _ret.asString()
  }

  fun getPacketPort(): Int {
    val _ret = __method_bind.getPacketPort.call(this._handle)
    return _ret.asInt()
  }

  fun isListening(): Boolean {
    val _ret = __method_bind.isListening.call(this._handle)
    return _ret.asBoolean()
  }

  fun joinMulticastGroup(multicastAddress: String, interfaceName: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multicastAddress))
    _args.add(Variant.fromAny(interfaceName))
    val _ret = __method_bind.joinMulticastGroup.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun leaveMulticastGroup(multicastAddress: String, interfaceName: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multicastAddress))
    _args.add(Variant.fromAny(interfaceName))
    val _ret = __method_bind.leaveMulticastGroup.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun listen(
    port: Int,
    bindAddress: String = "*",
    recvBufSize: Int = 65536
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(port))
    _args.add(Variant.fromAny(bindAddress))
    _args.add(Variant.fromAny(recvBufSize))
    val _ret = __method_bind.listen.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun setBroadcastEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setBroadcastEnabled.call(this._handle, listOf(_arg))
  }

  fun setDestAddress(host: String, port: Int): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(host))
    _args.add(Variant.fromAny(port))
    val _ret = __method_bind.setDestAddress.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun wait(): GDError {
    val _ret = __method_bind.wait.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): PacketPeerUDP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PacketPeerUDP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PacketPeerUDP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PacketPeerUDP(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PacketPeerUDP = PacketPeerUDP(ptr)
    /**
     * Container for method_bind pointers for PacketPeerUDP
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val getPacketIp: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "get_packet_ip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_ip" }
        }
      val getPacketPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "get_packet_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_port" }
        }
      val isListening: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "is_listening".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_listening" }
        }
      val joinMulticastGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "join_multicast_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method join_multicast_group" }
        }
      val leaveMulticastGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "leave_multicast_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method leave_multicast_group" }
        }
      val listen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val setBroadcastEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "set_broadcast_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_broadcast_enabled" }
        }
      val setDestAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "set_dest_address".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dest_address" }
        }
      val wait: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
            "wait".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wait" }
        }}
  }
}
