// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class WebSocketMultiplayerPeer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : NetworkedMultiplayerPeer(null) {
  /**
   * WebSocketMultiplayerPeer::peer_packet signal
   */
  val signalPeerPacket: Signal1<Int> = Signal1("peer_packet")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getPeer(peerId: Int): WebSocketPeer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: WebSocketPeer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPeer.call(self._handle, listOf(peerId), _retPtr)
      _ret = objectToType<WebSocketPeer>(_tmp.value!!)
      _ret
    }
  }

  fun setBuffers(
    inputBufferSizeKb: Int,
    inputMaxPackets: Int,
    outputBufferSizeKb: Int,
    outputMaxPackets: Int
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(inputBufferSizeKb)
      _args.add(inputMaxPackets)
      _args.add(outputBufferSizeKb)
      _args.add(outputMaxPackets)
      __method_bind.setBuffers.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for WebSocketMultiplayerPeer
     */
    private object __method_bind {
      val getPeer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketMultiplayerPeer".cstr.ptr,
              "get_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_peer" }
            }
          }

      val setBuffers: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketMultiplayerPeer".cstr.ptr,
              "set_buffers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_buffers" }
            }
          }
    }
  }
}
