// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeer internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for StreamPeer
     */
    private object __method_bind {
      val get_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_16" }
            }
          }

      val get_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_32" }
            }
          }

      val get_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_64" }
            }
          }

      val get_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_8" }
            }
          }

      val get_available_bytes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_available_bytes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_available_bytes" }
            }
          }

      val get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val get_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_double" }
            }
          }

      val get_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_float" }
            }
          }

      val get_partial_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_partial_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_partial_data" }
            }
          }

      val get_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_string" }
            }
          }

      val get_u16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u16" }
            }
          }

      val get_u32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u32" }
            }
          }

      val get_u64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u64" }
            }
          }

      val get_u8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_u8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_u8" }
            }
          }

      val get_utf8_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_utf8_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_utf8_string" }
            }
          }

      val get_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "get_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_var" }
            }
          }

      val is_big_endian_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "is_big_endian_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_big_endian_enabled" }
            }
          }

      val put_16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_16" }
            }
          }

      val put_32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_32" }
            }
          }

      val put_64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_64" }
            }
          }

      val put_8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_8" }
            }
          }

      val put_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_data" }
            }
          }

      val put_double: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_double".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_double" }
            }
          }

      val put_float: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_float".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_float" }
            }
          }

      val put_partial_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_partial_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_partial_data" }
            }
          }

      val put_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_string" }
            }
          }

      val put_u16: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u16".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u16" }
            }
          }

      val put_u32: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u32".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u32" }
            }
          }

      val put_u64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u64" }
            }
          }

      val put_u8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_u8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_u8" }
            }
          }

      val put_utf8_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_utf8_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_utf8_string" }
            }
          }

      val put_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "put_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_var" }
            }
          }

      val set_big_endian: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeer".cstr.ptr,
              "set_big_endian".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_big_endian" }
            }
          }
    }
  }
}
