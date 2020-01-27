// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebRTCMultiplayer internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Int,
    unreliableLifetime: Int
  ): Error {
    val _args = VariantArray.new()
    _args.append(peer)
    _args.append(peerId)
    _args.append(unreliableLifetime)
    val _ret = __method_bind.add_peer.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun close() {
    val _ret = __method_bind.close.call(this.toVariant())
    TODO()
  }

  fun getPeer(peerId: Int): Dictionary {
    val _args = VariantArray.new()
    _args.append(peerId)
    val _ret = __method_bind.get_peer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPeers(): Dictionary {
    val _ret = __method_bind.get_peers.call(this.toVariant())
    TODO()
  }

  fun hasPeer(peerId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(peerId)
    val _ret = __method_bind.has_peer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun initialize(peerId: Int, serverCompatibility: Boolean): Error {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(serverCompatibility)
    val _ret = __method_bind.initialize.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun removePeer(peerId: Int) {
    val _args = VariantArray.new()
    _args.append(peerId)
    val _ret = __method_bind.remove_peer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): WebRTCMultiplayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebRTCMultiplayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WebRTCMultiplayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebRTCMultiplayer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebRTCMultiplayer = WebRTCMultiplayer(ptr)
    /**
     * Container for method_bind pointers for WebRTCMultiplayer
     */
    private object __method_bind {
      val add_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
              "add_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_peer" }
            }
          }

      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val get_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
              "get_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer" }
            }
          }

      val get_peers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
              "get_peers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peers" }
            }
          }

      val has_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
              "has_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_peer" }
            }
          }

      val initialize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
              "initialize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method initialize" }
            }
          }

      val remove_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
              "remove_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_peer" }
            }
          }
    }
  }
}
