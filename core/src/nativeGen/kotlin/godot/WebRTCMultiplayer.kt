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
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebRTCMultiplayer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : NetworkedMultiplayerPeer(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Int,
    unreliableLifetime: Int = 1
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(peer))
    _args.add(Variant.fromAny(peerId))
    _args.add(Variant.fromAny(unreliableLifetime))
    val _ret = __method_bind.addPeer.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun close() {
    __method_bind.close.call(this._handle)
  }

  fun getPeer(peerId: Int): Dictionary {
    val _arg = Variant.new(peerId)
    val _ret = __method_bind.getPeer.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun getPeers(): Dictionary {
    val _ret = __method_bind.getPeers.call(this._handle)
    return _ret.asDictionary()
  }

  fun hasPeer(peerId: Int): Boolean {
    val _arg = Variant.new(peerId)
    val _ret = __method_bind.hasPeer.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun initialize(peerId: Int, serverCompatibility: Boolean = false): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(peerId))
    _args.add(Variant.fromAny(serverCompatibility))
    val _ret = __method_bind.initialize.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun removePeer(peerId: Int) {
    val _arg = Variant.new(peerId)
    __method_bind.removePeer.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "add_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_peer" }
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
            "get_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peer" }
        }
      val getPeers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "get_peers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peers" }
        }
      val hasPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCMultiplayer".cstr.ptr,
            "has_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_peer" }
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
            "remove_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_peer" }
        }}
  }
}
