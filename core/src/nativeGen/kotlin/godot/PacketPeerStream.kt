// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInputBufferMaxSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getOutputBufferMaxSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOutputBufferMaxSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getStreamPeer(): StreamPeer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: StreamPeer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getStreamPeer.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<StreamPeer>(_tmp.value!!)
      _ret
    }
  }

  fun setInputBufferMaxSize(maxSizeBytes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInputBufferMaxSize.call(self._handle, listOf(maxSizeBytes), null)
    }
  }

  fun setOutputBufferMaxSize(maxSizeBytes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOutputBufferMaxSize.call(self._handle, listOf(maxSizeBytes), null)
    }
  }

  fun setStreamPeer(peer: StreamPeer) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStreamPeer.call(self._handle, listOf(peer), null)
    }
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
