// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.GDError
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

open class WebRTCMultiplayer(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Int,
    unreliableLifetime: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(peer)
    _args.append(peerId)
    _args.append(unreliableLifetime)
    val _ret = __method_bind.addPeer.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun close() {
    __method_bind.close.call(this._handle)
  }

  fun getPeer(peerId: Int): Dictionary {
    val _arg = Variant.new(peerId)
    val _ret = __method_bind.getPeer.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getPeers(): Dictionary {
    val _ret = __method_bind.getPeers.call(this._handle)
    return _ret.asDictionary()
  }

  fun hasPeer(peerId: Int): Boolean {
    val _arg = Variant.new(peerId)
    val _ret = __method_bind.hasPeer.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun initialize(peerId: Int, serverCompatibility: Boolean): GDError {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(serverCompatibility)
    val _ret = __method_bind.initialize.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun removePeer(peerId: Int) {
    val _arg = Variant.new(peerId)
    __method_bind.removePeer.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): WebRTCMultiplayer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebRTCMultiplayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebRTCMultiplayer" }
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
      val addPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "addPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPeer" }
        }
      val close: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val getPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "getPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeer" }
        }
      val getPeers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "getPeers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeers" }
        }
      val hasPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "hasPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasPeer" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val removePeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "removePeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removePeer" }
        }}
  }
}
