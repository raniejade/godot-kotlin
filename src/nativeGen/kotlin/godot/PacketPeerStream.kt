// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PacketPeerStream internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  fun getInputBufferMaxSize(): Int {
    TODO()
  }

  fun getOutputBufferMaxSize(): Int {
    TODO()
  }

  fun getStreamPeer(): StreamPeer {
    TODO()
  }

  fun setInputBufferMaxSize() {
    TODO()
  }

  fun setOutputBufferMaxSize() {
    TODO()
  }

  fun setStreamPeer() {
    TODO()
  }

  companion object {
    fun new(): PacketPeerStream = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PacketPeerStream".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PacketPeerStream" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PacketPeerStream(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PacketPeerStream
     */
    private object __method_bind {
      val get_input_buffer_max_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
              "get_input_buffer_max_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_buffer_max_size" }
            }
          }

      val get_output_buffer_max_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
              "get_output_buffer_max_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_output_buffer_max_size" }
            }
          }

      val get_stream_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
              "get_stream_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stream_peer" }
            }
          }

      val set_input_buffer_max_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
              "set_input_buffer_max_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_buffer_max_size" }
            }
          }

      val set_output_buffer_max_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
              "set_output_buffer_max_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_output_buffer_max_size" }
            }
          }

      val set_stream_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeerStream".cstr.ptr,
              "set_stream_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stream_peer" }
            }
          }
    }
  }
}
