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

open class CubeMesh internal constructor(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  companion object {
    fun new(): CubeMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CubeMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CubeMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CubeMesh(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CubeMesh
     */
    private object __method_bind {
      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_subdivide_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "get_subdivide_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdivide_depth" }
            }
          }

      val get_subdivide_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "get_subdivide_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdivide_height" }
            }
          }

      val get_subdivide_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "get_subdivide_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdivide_width" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }

      val set_subdivide_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "set_subdivide_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_subdivide_depth" }
            }
          }

      val set_subdivide_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "set_subdivide_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_subdivide_height" }
            }
          }

      val set_subdivide_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
              "set_subdivide_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_subdivide_width" }
            }
          }
    }
  }
}
