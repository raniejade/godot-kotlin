// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector3
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PrismMesh internal constructor(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  fun getLeftToRight(): Float {
    TODO()
  }

  fun getSize(): Vector3 {
    TODO()
  }

  fun getSubdivideDepth(): Int {
    TODO()
  }

  fun getSubdivideHeight(): Int {
    TODO()
  }

  fun getSubdivideWidth(): Int {
    TODO()
  }

  fun setLeftToRight(left_to_right: Float) {
    TODO()
  }

  fun setSize(size: Vector3) {
    TODO()
  }

  fun setSubdivideDepth(segments: Int) {
    TODO()
  }

  fun setSubdivideHeight(segments: Int) {
    TODO()
  }

  fun setSubdivideWidth(segments: Int) {
    TODO()
  }

  companion object {
    fun new(): PrismMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PrismMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PrismMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PrismMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PrismMesh = PrismMesh(ptr)
    /**
     * Container for method_bind pointers for PrismMesh
     */
    private object __method_bind {
      val get_left_to_right: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "get_left_to_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_left_to_right" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_subdivide_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "get_subdivide_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdivide_depth" }
            }
          }

      val get_subdivide_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "get_subdivide_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdivide_height" }
            }
          }

      val get_subdivide_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "get_subdivide_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_subdivide_width" }
            }
          }

      val set_left_to_right: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "set_left_to_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_left_to_right" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }

      val set_subdivide_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "set_subdivide_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_subdivide_depth" }
            }
          }

      val set_subdivide_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "set_subdivide_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_subdivide_height" }
            }
          }

      val set_subdivide_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
              "set_subdivide_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_subdivide_width" }
            }
          }
    }
  }
}
