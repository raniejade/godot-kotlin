// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
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
  fun buildBoxPlanes(extents: Vector3): VariantArray {
    val _args = VariantArray.new()
    _args.append(extents)
    val _ret = __method_bind.build_box_planes.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asArray()
  }

  fun buildCapsulePlanes(
    radius: Float,
    height: Float,
    sides: Int,
    lats: Int,
    axis: Int
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(radius)
    _args.append(height)
    _args.append(sides)
    _args.append(lats)
    _args.append(axis)
    val _ret = __method_bind.build_capsule_planes.call(this.toVariant(), _args.toVariant(), 5)
    return _ret.asArray()
  }

  fun buildCylinderPlanes(
    radius: Float,
    height: Float,
    sides: Int,
    axis: Int
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(radius)
    _args.append(height)
    _args.append(sides)
    _args.append(axis)
    val _ret = __method_bind.build_cylinder_planes.call(this.toVariant(), _args.toVariant(), 4)
    return _ret.asArray()
  }

  fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(plane)
    val _ret = __method_bind.clip_polygon.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asPoolVector3Array()
  }

  fun clipPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.clip_polygons_2d.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun clipPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val _args = VariantArray.new()
    _args.append(polyline)
    _args.append(polygon)
    val _ret = __method_bind.clip_polyline_with_polygon_2d.call(this.toVariant(), _args.toVariant(),
        2)
    return _ret.asArray()
  }

  fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
    val _args = VariantArray.new()
    _args.append(points)
    val _ret = __method_bind.convex_hull_2d.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolVector2Array()
  }

  fun excludePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.exclude_polygons_2d.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(s1)
    _args.append(s2)
    val _ret = __method_bind.get_closest_point_to_segment.call(this.toVariant(), _args.toVariant(),
        3)
    return _ret.asVector3()
  }

  fun getClosestPointToSegment2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(s1)
    _args.append(s2)
    val _ret = __method_bind.get_closest_point_to_segment_2d.call(this.toVariant(),
        _args.toVariant(), 3)
    return _ret.asVector2()
  }

  fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(s1)
    _args.append(s2)
    val _ret = __method_bind.get_closest_point_to_segment_uncapped.call(this.toVariant(),
        _args.toVariant(), 3)
    return _ret.asVector3()
  }

  fun getClosestPointToSegmentUncapped2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(s1)
    _args.append(s2)
    val _ret = __method_bind.get_closest_point_to_segment_uncapped_2d.call(this.toVariant(),
        _args.toVariant(), 3)
    return _ret.asVector2()
  }

  fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3
  ): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(p1)
    _args.append(p2)
    _args.append(q1)
    _args.append(q2)
    val _ret = __method_bind.get_closest_points_between_segments.call(this.toVariant(),
        _args.toVariant(), 4)
    return _ret.asPoolVector3Array()
  }

  fun getClosestPointsBetweenSegments2d(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2
  ): PoolVector2Array {
    val _args = VariantArray.new()
    _args.append(p1)
    _args.append(q1)
    _args.append(p2)
    _args.append(q2)
    val _ret = __method_bind.get_closest_points_between_segments_2d.call(this.toVariant(),
        _args.toVariant(), 4)
    return _ret.asPoolVector2Array()
  }

  fun getUv84NormalBit(normal: Vector3): Int {
    val _args = VariantArray.new()
    _args.append(normal)
    val _ret = __method_bind.get_uv84_normal_bit.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asInt()
  }

  fun intersectPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.intersect_polygons_2d.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun intersectPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val _args = VariantArray.new()
    _args.append(polyline)
    _args.append(polygon)
    val _ret = __method_bind.intersect_polyline_with_polygon_2d.call(this.toVariant(),
        _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun isPolygonClockwise(polygon: PoolVector2Array): Boolean {
    val _args = VariantArray.new()
    _args.append(polygon)
    val _ret = __method_bind.is_polygon_clockwise.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun lineIntersectsLine2d(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2
  ): Variant {
    val _args = VariantArray.new()
    _args.append(fromA)
    _args.append(dirA)
    _args.append(fromB)
    _args.append(dirB)
    val _ret = __method_bind.line_intersects_line_2d.call(this.toVariant(), _args.toVariant(), 4)
    return _ret
  }

  fun makeAtlas(sizes: PoolVector2Array): Dictionary {
    val _args = VariantArray.new()
    _args.append(sizes)
    val _ret = __method_bind.make_atlas.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asDictionary()
  }

  fun mergePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.merge_polygons_2d.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asArray()
  }

  fun offsetPolygon2d(
    polygon: PoolVector2Array,
    delta: Float,
    joinType: Int
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygon)
    _args.append(delta)
    _args.append(joinType)
    val _ret = __method_bind.offset_polygon_2d.call(this.toVariant(), _args.toVariant(), 3)
    return _ret.asArray()
  }

  fun offsetPolyline2d(
    polyline: PoolVector2Array,
    delta: Float,
    joinType: Int,
    endType: Int
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(polyline)
    _args.append(delta)
    _args.append(joinType)
    _args.append(endType)
    val _ret = __method_bind.offset_polyline_2d.call(this.toVariant(), _args.toVariant(), 4)
    return _ret.asArray()
  }

  fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(a)
    _args.append(b)
    _args.append(c)
    val _ret = __method_bind.point_is_inside_triangle.call(this.toVariant(), _args.toVariant(), 4)
    return _ret.asBool()
  }

  fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(dir)
    _args.append(a)
    _args.append(b)
    _args.append(c)
    val _ret = __method_bind.ray_intersects_triangle.call(this.toVariant(), _args.toVariant(), 5)
    return _ret
  }

  fun segmentIntersectsCircle(
    segmentFrom: Vector2,
    segmentTo: Vector2,
    circlePosition: Vector2,
    circleRadius: Float
  ): Float {
    val _args = VariantArray.new()
    _args.append(segmentFrom)
    _args.append(segmentTo)
    _args.append(circlePosition)
    _args.append(circleRadius)
    val _ret = __method_bind.segment_intersects_circle.call(this.toVariant(), _args.toVariant(), 4)
    return _ret.asFloat()
  }

  fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray
  ): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(planes)
    val _ret = __method_bind.segment_intersects_convex.call(this.toVariant(), _args.toVariant(), 3)
    return _ret.asPoolVector3Array()
  }

  fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Float,
    radius: Float
  ): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(height)
    _args.append(radius)
    val _ret = __method_bind.segment_intersects_cylinder.call(this.toVariant(), _args.toVariant(),
        4)
    return _ret.asPoolVector3Array()
  }

  fun segmentIntersectsSegment2d(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2
  ): Variant {
    val _args = VariantArray.new()
    _args.append(fromA)
    _args.append(toA)
    _args.append(fromB)
    _args.append(toB)
    val _ret = __method_bind.segment_intersects_segment_2d.call(this.toVariant(), _args.toVariant(),
        4)
    return _ret
  }

  fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Float
  ): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(spherePosition)
    _args.append(sphereRadius)
    val _ret = __method_bind.segment_intersects_sphere.call(this.toVariant(), _args.toVariant(), 4)
    return _ret.asPoolVector3Array()
  }

  fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(a)
    _args.append(b)
    _args.append(c)
    val _ret = __method_bind.segment_intersects_triangle.call(this.toVariant(), _args.toVariant(),
        5)
    return _ret
  }

  fun transformPoints2d(points: PoolVector2Array, transform: Transform2D): PoolVector2Array {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(transform)
    val _ret = __method_bind.transform_points_2d.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asPoolVector2Array()
  }

  fun triangulateDelaunay2d(points: PoolVector2Array): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(points)
    val _ret = __method_bind.triangulate_delaunay_2d.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolIntArray()
  }

  fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(polygon)
    val _ret = __method_bind.triangulate_polygon.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolIntArray()
  }

  enum class PolyEndType(
    val value: Int
  ) {
    END_POLYGON(0),

    END_JOINED(1),

    END_BUTT(2),

    END_SQUARE(3),

    END_ROUND(4);

    companion object {
      fun from(value: Int): PolyEndType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class PolyBooleanOperation(
    val value: Int
  ) {
    OPERATION_UNION(0),

    OPERATION_DIFFERENCE(1),

    OPERATION_INTERSECTION(2),

    OPERATION_XOR(3);

    companion object {
      fun from(value: Int): PolyBooleanOperation {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class PolyJoinType(
    val value: Int
  ) {
    JOIN_SQUARE(0),

    JOIN_ROUND(1),

    JOIN_MITER(2);

    companion object {
      fun from(value: Int): PolyJoinType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
