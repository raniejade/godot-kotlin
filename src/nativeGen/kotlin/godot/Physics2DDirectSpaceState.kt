// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Physics2DDirectSpaceState internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun castMotion(): VariantArray {
    TODO()
  }

  fun collideShape(): VariantArray {
    TODO()
  }

  fun getRestInfo(): Dictionary {
    TODO()
  }

  fun intersectPoint(): VariantArray {
    TODO()
  }

  fun intersectPointOnCanvas(): VariantArray {
    TODO()
  }

  fun intersectRay(): Dictionary {
    TODO()
  }

  fun intersectShape(): VariantArray {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DDirectSpaceState
     */
    private object __method_bind {
      val cast_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "cast_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cast_motion" }
            }
          }

      val collide_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "collide_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_shape" }
            }
          }

      val get_rest_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "get_rest_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest_info" }
            }
          }

      val intersect_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_point" }
            }
          }

      val intersect_point_on_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_point_on_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_point_on_canvas" }
            }
          }

      val intersect_ray: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_ray".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_ray" }
            }
          }

      val intersect_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DDirectSpaceState".cstr.ptr,
              "intersect_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_shape" }
            }
          }
    }
  }
}
