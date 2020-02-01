// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
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
    val _ret = __method_bind.getPeer.call(this._handle, listOf(_arg))
    return _ret.asObject(::WebSocketPeer)!!
  }

  fun setBuffers(
    inputBufferSizeKb: Int,
    inputMaxPackets: Int,
    outputBufferSizeKb: Int,
    outputMaxPackets: Int
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(inputBufferSizeKb))
    _args.add(Variant.fromAny(inputMaxPackets))
    _args.add(Variant.fromAny(outputBufferSizeKb))
    _args.add(Variant.fromAny(outputMaxPackets))
    val _ret = __method_bind.setBuffers.call(this._handle, _args)
    return GDError.from(_ret.asInt())
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
            "get_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_peer" }
        }
      val setBuffers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketMultiplayerPeer".cstr.ptr,
            "set_buffers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_buffers" }
        }}
  }
}
