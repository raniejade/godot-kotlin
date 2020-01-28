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

open class WebSocketMultiplayerPeer(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  fun getPeer(peerId: Int): WebSocketPeer {
    val _arg = Variant.new(peerId)
    val _ret = __method_bind.getPeer.call(this._handle, _arg, 1)
    return _ret.asObject(::WebSocketPeer)!!
  }

  companion object {
    /**
     * Container for method_bind pointers for WebSocketMultiplayerPeer
     */
    private object __method_bind {
      val getPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketMultiplayerPeer".cstr.ptr,
            "getPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeer" }
        }}
  }
}
