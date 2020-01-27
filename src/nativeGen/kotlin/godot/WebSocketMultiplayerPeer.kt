// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebSocketMultiplayerPeer internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  fun getPeer(peerId: Int): WebSocketPeer {
    val _args = VariantArray.new()
    _args.append(peerId)
    val _ret = __method_bind.get_peer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for WebSocketMultiplayerPeer
     */
    private object __method_bind {
      val get_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketMultiplayerPeer".cstr.ptr,
              "get_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer" }
            }
          }
    }
  }
}
