// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PacketPeerUDP internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  companion object {
    fun new(): PacketPeerUDP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PacketPeerUDP".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PacketPeerUDP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PacketPeerUDP(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PacketPeerUDP
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val get_packet_ip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
              "get_packet_ip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_packet_ip" }
            }
          }

      val get_packet_port: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
              "get_packet_port".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_packet_port" }
            }
          }

      val is_listening: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
              "is_listening".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_listening" }
            }
          }

      val listen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
              "listen".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method listen" }
            }
          }

      val set_dest_address: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
              "set_dest_address".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dest_address" }
            }
          }

      val wait: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerUDP".cstr.ptr,
              "wait".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method wait" }
            }
          }
    }
  }
}
