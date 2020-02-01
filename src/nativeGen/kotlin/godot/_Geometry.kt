// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _Geometry(
  _handle: COpaquePointer
) : Object(_handle) {
  fun buildBoxPlanes(extents: Vector3): VariantArray {
    val _arg = Variant.new(extents)
    val _ret = __method_bind.buildBoxPlanes.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun buildCapsulePlanes(
    radius: Float,
    height: Float,
    sides: Int,
    lats: Int,
    axis: Int = 2
  ): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(radius))
    _args.add(Variant.fromAny(height))
    _args.add(Variant.fromAny(sides))
    _args.add(Variant.fromAny(lats))
    _args.add(Variant.fromAny(axis))
    val _ret = __method_bind.buildCapsulePlanes.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun buildCylinderPlanes(
    radius: Float,
    height: Float,
    sides: Int,
    axis: Int = 2
  ): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(radius))
    _args.add(Variant.fromAny(height))
    _args.add(Variant.fromAny(sides))
    _args.add(Variant.fromAny(axis))
    val _ret = __method_bind.buildCylinderPlanes.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(plane))
    val _ret = __method_bind.clipPolygon.call(this._handle, _args)
    return _ret.asPoolVector3Array()
  }

  fun clipPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polygonA))
    _args.add(Variant.fromAny(polygonB))
    val _ret = __method_bind.clipPolygons2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun clipPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polyline))
    _args.add(Variant.fromAny(polygon))
    val _ret = __method_bind.clipPolylineWithPolygon2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
    val _arg = Variant.new(points)
    val _ret = __method_bind.convexHull2d.call(this._handle, listOf(_arg))
    return _ret.asPoolVector2Array()
  }

  fun excludePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polygonA))
    _args.add(Variant.fromAny(polygonB))
    val _ret = __method_bind.excludePolygons2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(s1))
    _args.add(Variant.fromAny(s2))
    val _ret = __method_bind.getClosestPointToSegment.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun getClosestPointToSegment2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(s1))
    _args.add(Variant.fromAny(s2))
    val _ret = __method_bind.getClosestPointToSegment2d.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(s1))
    _args.add(Variant.fromAny(s2))
    val _ret = __method_bind.getClosestPointToSegmentUncapped.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun getClosestPointToSegmentUncapped2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(s1))
    _args.add(Variant.fromAny(s2))
    val _ret = __method_bind.getClosestPointToSegmentUncapped2d.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3
  ): PoolVector3Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(p1))
    _args.add(Variant.fromAny(p2))
    _args.add(Variant.fromAny(q1))
    _args.add(Variant.fromAny(q2))
    val _ret = __method_bind.getClosestPointsBetweenSegments.call(this._handle, _args)
    return _ret.asPoolVector3Array()
  }

  fun getClosestPointsBetweenSegments2d(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2
  ): PoolVector2Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(p1))
    _args.add(Variant.fromAny(q1))
    _args.add(Variant.fromAny(p2))
    _args.add(Variant.fromAny(q2))
    val _ret = __method_bind.getClosestPointsBetweenSegments2d.call(this._handle, _args)
    return _ret.asPoolVector2Array()
  }

  fun getUv84NormalBit(normal: Vector3): Int {
    val _arg = Variant.new(normal)
    val _ret = __method_bind.getUv84NormalBit.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun intersectPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polygonA))
    _args.add(Variant.fromAny(polygonB))
    val _ret = __method_bind.intersectPolygons2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun intersectPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polyline))
    _args.add(Variant.fromAny(polygon))
    val _ret = __method_bind.intersectPolylineWithPolygon2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Float
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(circlePosition))
    _args.add(Variant.fromAny(circleRadius))
    val _ret = __method_bind.isPointInCircle.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isPointInPolygon(point: Vector2, polygon: PoolVector2Array): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(polygon))
    val _ret = __method_bind.isPointInPolygon.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isPolygonClockwise(polygon: PoolVector2Array): Boolean {
    val _arg = Variant.new(polygon)
    val _ret = __method_bind.isPolygonClockwise.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun lineIntersectsLine2d(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fromA))
    _args.add(Variant.fromAny(dirA))
    _args.add(Variant.fromAny(fromB))
    _args.add(Variant.fromAny(dirB))
    val _ret = __method_bind.lineIntersectsLine2d.call(this._handle, _args)
    return _ret
  }

  fun makeAtlas(sizes: PoolVector2Array): Dictionary {
    val _arg = Variant.new(sizes)
    val _ret = __method_bind.makeAtlas.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun mergePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polygonA))
    _args.add(Variant.fromAny(polygonB))
    val _ret = __method_bind.mergePolygons2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun offsetPolygon2d(
    polygon: PoolVector2Array,
    delta: Float,
    joinType: Int = 0
  ): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polygon))
    _args.add(Variant.fromAny(delta))
    _args.add(Variant.fromAny(joinType))
    val _ret = __method_bind.offsetPolygon2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun offsetPolyline2d(
    polyline: PoolVector2Array,
    delta: Float,
    joinType: Int = 0,
    endType: Int = 3
  ): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(polyline))
    _args.add(Variant.fromAny(delta))
    _args.add(Variant.fromAny(joinType))
    _args.add(Variant.fromAny(endType))
    val _ret = __method_bind.offsetPolyline2d.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(a))
    _args.add(Variant.fromAny(b))
    _args.add(Variant.fromAny(c))
    val _ret = __method_bind.pointIsInsideTriangle.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(dir))
    _args.add(Variant.fromAny(a))
    _args.add(Variant.fromAny(b))
    _args.add(Variant.fromAny(c))
    val _ret = __method_bind.rayIntersectsTriangle.call(this._handle, _args)
    return _ret
  }

  fun segmentIntersectsCircle(
    segmentFrom: Vector2,
    segmentTo: Vector2,
    circlePosition: Vector2,
    circleRadius: Float
  ): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(segmentFrom))
    _args.add(Variant.fromAny(segmentTo))
    _args.add(Variant.fromAny(circlePosition))
    _args.add(Variant.fromAny(circleRadius))
    val _ret = __method_bind.segmentIntersectsCircle.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray
  ): PoolVector3Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(planes))
    val _ret = __method_bind.segmentIntersectsConvex.call(this._handle, _args)
    return _ret.asPoolVector3Array()
  }

  fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Float,
    radius: Float
  ): PoolVector3Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(height))
    _args.add(Variant.fromAny(radius))
    val _ret = __method_bind.segmentIntersectsCylinder.call(this._handle, _args)
    return _ret.asPoolVector3Array()
  }

  fun segmentIntersectsSegment2d(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fromA))
    _args.add(Variant.fromAny(toA))
    _args.add(Variant.fromAny(fromB))
    _args.add(Variant.fromAny(toB))
    val _ret = __method_bind.segmentIntersectsSegment2d.call(this._handle, _args)
    return _ret
  }

  fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Float
  ): PoolVector3Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(spherePosition))
    _args.add(Variant.fromAny(sphereRadius))
    val _ret = __method_bind.segmentIntersectsSphere.call(this._handle, _args)
    return _ret.asPoolVector3Array()
  }

  fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(a))
    _args.add(Variant.fromAny(b))
    _args.add(Variant.fromAny(c))
    val _ret = __method_bind.segmentIntersectsTriangle.call(this._handle, _args)
    return _ret
  }

  fun triangulateDelaunay2d(points: PoolVector2Array): PoolIntArray {
    val _arg = Variant.new(points)
    val _ret = __method_bind.triangulateDelaunay2d.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
    val _arg = Variant.new(polygon)
    val _ret = __method_bind.triangulatePolygon.call(this._handle, listOf(_arg))
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
    val Instance: _Geometry
      get() = memScoped {
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
      val buildBoxPlanes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "build_box_planes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method build_box_planes" }
        }
      val buildCapsulePlanes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "build_capsule_planes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method build_capsule_planes" }
        }
      val buildCylinderPlanes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "build_cylinder_planes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method build_cylinder_planes" }
        }
      val clipPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "clip_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clip_polygon" }
        }
      val clipPolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "clip_polygons_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clip_polygons_2d" }
        }
      val clipPolylineWithPolygon2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "clip_polyline_with_polygon_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clip_polyline_with_polygon_2d" }
        }
      val convexHull2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "convex_hull_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method convex_hull_2d" }
        }
      val excludePolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "exclude_polygons_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method exclude_polygons_2d" }
        }
      val getClosestPointToSegment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "get_closest_point_to_segment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point_to_segment" }
        }
      val getClosestPointToSegment2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "get_closest_point_to_segment_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point_to_segment_2d" }
        }
      val getClosestPointToSegmentUncapped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "get_closest_point_to_segment_uncapped".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_closest_point_to_segment_uncapped" }
        }
      val getClosestPointToSegmentUncapped2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "get_closest_point_to_segment_uncapped_2d".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_closest_point_to_segment_uncapped_2d" }
        }
      val getClosestPointsBetweenSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "get_closest_points_between_segments".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_closest_points_between_segments" }
        }
      val getClosestPointsBetweenSegments2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "get_closest_points_between_segments_2d".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_closest_points_between_segments_2d" }
        }
      val getUv84NormalBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "get_uv84_normal_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv84_normal_bit" }
        }
      val intersectPolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "intersect_polygons_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_polygons_2d" }
        }
      val intersectPolylineWithPolygon2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "intersect_polyline_with_polygon_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersect_polyline_with_polygon_2d"
            }
        }
      val isPointInCircle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "is_point_in_circle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_point_in_circle" }
        }
      val isPointInPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "is_point_in_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_point_in_polygon" }
        }
      val isPolygonClockwise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "is_polygon_clockwise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_polygon_clockwise" }
        }
      val lineIntersectsLine2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "line_intersects_line_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method line_intersects_line_2d" }
        }
      val makeAtlas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "make_atlas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_atlas" }
        }
      val mergePolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "merge_polygons_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method merge_polygons_2d" }
        }
      val offsetPolygon2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "offset_polygon_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method offset_polygon_2d" }
        }
      val offsetPolyline2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "offset_polyline_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method offset_polyline_2d" }
        }
      val pointIsInsideTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "point_is_inside_triangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method point_is_inside_triangle" }
        }
      val rayIntersectsTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "ray_intersects_triangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ray_intersects_triangle" }
        }
      val segmentIntersectsCircle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segment_intersects_circle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_intersects_circle" }
        }
      val segmentIntersectsConvex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segment_intersects_convex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_intersects_convex" }
        }
      val segmentIntersectsCylinder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segment_intersects_cylinder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_intersects_cylinder" }
        }
      val segmentIntersectsSegment2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segment_intersects_segment_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_intersects_segment_2d" }
        }
      val segmentIntersectsSphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segment_intersects_sphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_intersects_sphere" }
        }
      val segmentIntersectsTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segment_intersects_triangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_intersects_triangle" }
        }
      val triangulateDelaunay2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "triangulate_delaunay_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method triangulate_delaunay_2d" }
        }
      val triangulatePolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "triangulate_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method triangulate_polygon" }
        }}
  }
}
