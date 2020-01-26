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

open class PackedDataContainerRef internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for PackedDataContainerRef
     */
    private object __method_bind {
      val _is_dictionary: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainerRef".cstr.ptr,
              "_is_dictionary".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _is_dictionary" }
            }
          }

      val _iter_get: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainerRef".cstr.ptr,
              "_iter_get".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _iter_get" }
            }
          }

      val _iter_init: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainerRef".cstr.ptr,
              "_iter_init".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _iter_init" }
            }
          }

      val _iter_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainerRef".cstr.ptr,
              "_iter_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _iter_next" }
            }
          }

      val size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainerRef".cstr.ptr,
              "size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method size" }
            }
          }
    }
  }
}
