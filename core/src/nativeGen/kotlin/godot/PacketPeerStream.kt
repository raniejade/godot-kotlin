// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class PacketPeerStream(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PacketPeer(null) {
  var inputBufferMaxSize: Int
    get() {
       return getInputBufferMaxSize() 
    }
    set(value) {
      setInputBufferMaxSize(value)
    }

  var outputBufferMaxSize: Int
    get() {
       return getOutputBufferMaxSize() 
    }
    set(value) {
      setOutputBufferMaxSize(value)
    }

  var streamPeer: StreamPeer
    get() {
       return getStreamPeer() 
    }
    set(value) {
      setStreamPeer(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getInputBufferMaxSize(): Int {
    val _ret = __method_bind.getInputBufferMaxSize.call(this._handle)
    return _ret.asInt()
  }

  fun getOutputBufferMaxSize(): Int {
    val _ret = __method_bind.getOutputBufferMaxSize.call(this._handle)
    return _ret.asInt()
  }

  fun getStreamPeer(): StreamPeer {
    val _ret = __method_bind.getStreamPeer.call(this._handle)
    return _ret.toAny() as StreamPeer
  }

  fun setInputBufferMaxSize(maxSizeBytes: Int) {
    val _arg = Variant(maxSizeBytes)
    __method_bind.setInputBufferMaxSize.call(this._handle, listOf(_arg))
  }

  fun setOutputBufferMaxSize(maxSizeBytes: Int) {
    val _arg = Variant(maxSizeBytes)
    __method_bind.setOutputBufferMaxSize.call(this._handle, listOf(_arg))
  }

  fun setStreamPeer(peer: StreamPeer) {
    val _arg = Variant(peer)
    __method_bind.setStreamPeer.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PacketPeerStream".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PacketPeerStream" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PacketPeerStream
     */
    private object __method_bind {
      val getInputBufferMaxSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
            "get_input_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_buffer_max_size" }
        }
      val getOutputBufferMaxSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
            "get_output_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_output_buffer_max_size" }
        }
      val getStreamPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
            "get_stream_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stream_peer" }
        }
      val setInputBufferMaxSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
            "set_input_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_buffer_max_size" }
        }
      val setOutputBufferMaxSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
            "set_output_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_buffer_max_size" }
        }
      val setStreamPeer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
            "set_stream_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stream_peer" }
        }}
  }
}
