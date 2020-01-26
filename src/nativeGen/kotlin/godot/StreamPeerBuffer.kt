// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeerBuffer internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  fun clear() {
    TODO()
  }

  fun duplicate(): StreamPeerBuffer {
    TODO()
  }

  fun getDataArray(): PoolByteArray {
    TODO()
  }

  fun getPosition(): Int {
    TODO()
  }

  fun getSize(): Int {
    TODO()
  }

  fun resize() {
    TODO()
  }

  fun seek() {
    TODO()
  }

  fun setDataArray() {
    TODO()
  }

  companion object {
    fun new(): StreamPeerBuffer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerBuffer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StreamPeerBuffer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerBuffer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for StreamPeerBuffer
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val duplicate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "duplicate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method duplicate" }
            }
          }

      val get_data_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "get_data_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data_array" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val resize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "resize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resize" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val set_data_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "set_data_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data_array" }
            }
          }
    }
  }
}
