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

open class _Geometry internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  enum class PolyEndType(
    val value: Int
  ) {
    END_POLYGON(0),

    END_JOINED(1),

    END_BUTT(2),

    END_SQUARE(3),

    END_ROUND(4);
  }

  enum class PolyBooleanOperation(
    val value: Int
  ) {
    OPERATION_UNION(0),

    OPERATION_DIFFERENCE(1),

    OPERATION_INTERSECTION(2),

    OPERATION_XOR(3);
  }

  enum class PolyJoinType(
    val value: Int
  ) {
    JOIN_SQUARE(0),

    JOIN_ROUND(1),

    JOIN_MITER(2);
  }

  companion object {
    val Instance: _Geometry = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_Geometry".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton _Geometry" }
          _Geometry(
            handle
          )
        }

    val END_BUTT: Int = 2

    val END_JOINED: Int = 1

    val END_POLYGON: Int = 0

    val END_ROUND: Int = 4

    val END_SQUARE: Int = 3

    val JOIN_MITER: Int = 2

    val JOIN_ROUND: Int = 1

    val JOIN_SQUARE: Int = 0

    val OPERATION_DIFFERENCE: Int = 1

    val OPERATION_INTERSECTION: Int = 2

    val OPERATION_UNION: Int = 0

    val OPERATION_XOR: Int = 3

    /**
     * Container for method_bind pointers for _Geometry
     */
    private object __method_bind {
      val build_box_planes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "build_box_planes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build_box_planes" }
            }
          }

      val build_capsule_planes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "build_capsule_planes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build_capsule_planes" }
            }
          }

      val build_cylinder_planes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "build_cylinder_planes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build_cylinder_planes" }
            }
          }

      val clip_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "clip_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clip_polygon" }
            }
          }

      val clip_polygons_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "clip_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clip_polygons_2d" }
            }
          }

      val clip_polyline_with_polygon_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "clip_polyline_with_polygon_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clip_polyline_with_polygon_2d"
              }
            }
          }

      val convex_hull_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "convex_hull_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method convex_hull_2d" }
            }
          }

      val exclude_polygons_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "exclude_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method exclude_polygons_2d" }
            }
          }

      val get_closest_point_to_segment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_to_segment" }
            }
          }

      val get_closest_point_to_segment_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_point_to_segment_2d" }
            }
          }

      val get_closest_point_to_segment_uncapped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment_uncapped".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_point_to_segment_uncapped" }
            }
          }

      val get_closest_point_to_segment_uncapped_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment_uncapped_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_point_to_segment_uncapped_2d" }
            }
          }

      val get_closest_points_between_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_points_between_segments".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_points_between_segments" }
            }
          }

      val get_closest_points_between_segments_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_points_between_segments_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_points_between_segments_2d" }
            }
          }

      val get_uv84_normal_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_uv84_normal_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uv84_normal_bit" }
            }
          }

      val intersect_polygons_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "intersect_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_polygons_2d" }
            }
          }

      val intersect_polyline_with_polygon_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "intersect_polyline_with_polygon_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method intersect_polyline_with_polygon_2d" }
            }
          }

      val is_polygon_clockwise: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "is_polygon_clockwise".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_polygon_clockwise" }
            }
          }

      val line_intersects_line_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "line_intersects_line_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method line_intersects_line_2d" }
            }
          }

      val make_atlas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "make_atlas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_atlas" }
            }
          }

      val merge_polygons_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "merge_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method merge_polygons_2d" }
            }
          }

      val offset_polygon_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "offset_polygon_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method offset_polygon_2d" }
            }
          }

      val offset_polyline_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "offset_polyline_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method offset_polyline_2d" }
            }
          }

      val point_is_inside_triangle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "point_is_inside_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method point_is_inside_triangle" }
            }
          }

      val ray_intersects_triangle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "ray_intersects_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method ray_intersects_triangle" }
            }
          }

      val segment_intersects_circle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_circle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_circle" }
            }
          }

      val segment_intersects_convex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_convex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_convex" }
            }
          }

      val segment_intersects_cylinder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_cylinder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_cylinder" }
            }
          }

      val segment_intersects_segment_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_segment_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_segment_2d"
              }
            }
          }

      val segment_intersects_sphere: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_sphere".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_sphere" }
            }
          }

      val segment_intersects_triangle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_triangle" }
            }
          }

      val transform_points_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "transform_points_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method transform_points_2d" }
            }
          }

      val triangulate_delaunay_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "triangulate_delaunay_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method triangulate_delaunay_2d" }
            }
          }

      val triangulate_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "triangulate_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method triangulate_polygon" }
            }
          }
    }
  }
}
