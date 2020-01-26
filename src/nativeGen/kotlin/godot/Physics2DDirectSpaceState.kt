// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
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
  fun castMotion(shape: Physics2DShapeQueryParameters): VariantArray {
    TODO()
  }

  fun collideShape(shape: Physics2DShapeQueryParameters, max_results: Int): VariantArray {
    TODO()
  }

  fun getRestInfo(shape: Physics2DShapeQueryParameters): Dictionary {
    TODO()
  }

  fun intersectPoint(
    point: Vector2,
    max_results: Int,
    exclude: VariantArray,
    collision_layer: Int,
    collide_with_bodies: Boolean,
    collide_with_areas: Boolean
  ): VariantArray {
    TODO()
  }

  fun intersectPointOnCanvas(
    point: Vector2,
    canvas_instance_id: Int,
    max_results: Int,
    exclude: VariantArray,
    collision_layer: Int,
    collide_with_bodies: Boolean,
    collide_with_areas: Boolean
  ): VariantArray {
    TODO()
  }

  fun intersectRay(
    from: Vector2,
    to: Vector2,
    exclude: VariantArray,
    collision_layer: Int,
    collide_with_bodies: Boolean,
    collide_with_areas: Boolean
  ): Dictionary {
    TODO()
  }

  fun intersectShape(shape: Physics2DShapeQueryParameters, max_results: Int): VariantArray {
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
