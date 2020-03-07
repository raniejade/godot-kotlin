// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class GeometryInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun buildBoxPlanes(extents: Vector3): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.buildBoxPlanes.call(self._handle, listOf(extents), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun buildCapsulePlanes(
    radius: Float,
    height: Float,
    sides: Int,
    lats: Int,
    axis: Int = 2
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(radius)
      _args.add(height)
      _args.add(sides)
      _args.add(lats)
      _args.add(axis)
      __method_bind.buildCapsulePlanes.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun buildCylinderPlanes(
    radius: Float,
    height: Float,
    sides: Int,
    axis: Int = 2
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(radius)
      _args.add(height)
      _args.add(sides)
      _args.add(axis)
      __method_bind.buildCylinderPlanes.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(plane)
      __method_bind.clipPolygon.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun clipPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polygonA)
      _args.add(polygonB)
      __method_bind.clipPolygons2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun clipPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polyline)
      _args.add(polygon)
      __method_bind.clipPolylineWithPolygon2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.convexHull2d.call(self._handle, listOf(points), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun excludePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polygonA)
      _args.add(polygonB)
      __method_bind.excludePolygons2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(s1)
      _args.add(s2)
      __method_bind.getClosestPointToSegment.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointToSegment2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(s1)
      _args.add(s2)
      __method_bind.getClosestPointToSegment2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3
  ): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(s1)
      _args.add(s2)
      __method_bind.getClosestPointToSegmentUncapped.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointToSegmentUncapped2d(
    point: Vector2,
    s1: Vector2,
    s2: Vector2
  ): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(s1)
      _args.add(s2)
      __method_bind.getClosestPointToSegmentUncapped2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3
  ): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(p1)
      _args.add(p2)
      _args.add(q1)
      _args.add(q2)
      __method_bind.getClosestPointsBetweenSegments.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointsBetweenSegments2d(
    p1: Vector2,
    q1: Vector2,
    p2: Vector2,
    q2: Vector2
  ): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(p1)
      _args.add(q1)
      _args.add(p2)
      _args.add(q2)
      __method_bind.getClosestPointsBetweenSegments2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUv84NormalBit(normal: Vector3): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUv84NormalBit.call(self._handle, listOf(normal), _retPtr)
      _ret.value
    }
  }

  fun intersectPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polygonA)
      _args.add(polygonB)
      __method_bind.intersectPolygons2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun intersectPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polyline)
      _args.add(polygon)
      __method_bind.intersectPolylineWithPolygon2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isPointInCircle(
    point: Vector2,
    circlePosition: Vector2,
    circleRadius: Float
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(circlePosition)
      _args.add(circleRadius)
      __method_bind.isPointInCircle.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isPointInPolygon(point: Vector2, polygon: PoolVector2Array): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(polygon)
      __method_bind.isPointInPolygon.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isPolygonClockwise(polygon: PoolVector2Array): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPolygonClockwise.call(self._handle, listOf(polygon), _retPtr)
      _ret.value
    }
  }

  fun lineIntersectsLine2d(
    fromA: Vector2,
    dirA: Vector2,
    fromB: Vector2,
    dirB: Vector2
  ): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(fromA)
      _args.add(dirA)
      _args.add(fromB)
      _args.add(dirB)
      __method_bind.lineIntersectsLine2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun makeAtlas(sizes: PoolVector2Array): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.makeAtlas.call(self._handle, listOf(sizes), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun mergePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polygonA)
      _args.add(polygonB)
      __method_bind.mergePolygons2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun offsetPolygon2d(
    polygon: PoolVector2Array,
    delta: Float,
    joinType: Int = 0
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polygon)
      _args.add(delta)
      _args.add(joinType)
      __method_bind.offsetPolygon2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun offsetPolyline2d(
    polyline: PoolVector2Array,
    delta: Float,
    joinType: Int = 0,
    endType: Int = 3
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(polyline)
      _args.add(delta)
      _args.add(joinType)
      _args.add(endType)
      __method_bind.offsetPolyline2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun pointIsInsideTriangle(
    point: Vector2,
    a: Vector2,
    b: Vector2,
    c: Vector2
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(a)
      _args.add(b)
      _args.add(c)
      __method_bind.pointIsInsideTriangle.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(dir)
      _args.add(a)
      _args.add(b)
      _args.add(c)
      __method_bind.rayIntersectsTriangle.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun segmentIntersectsCircle(
    segmentFrom: Vector2,
    segmentTo: Vector2,
    circlePosition: Vector2,
    circleRadius: Float
  ): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(segmentFrom)
      _args.add(segmentTo)
      _args.add(circlePosition)
      _args.add(circleRadius)
      __method_bind.segmentIntersectsCircle.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray
  ): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      _args.add(planes)
      __method_bind.segmentIntersectsConvex.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Float,
    radius: Float
  ): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      _args.add(height)
      _args.add(radius)
      __method_bind.segmentIntersectsCylinder.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun segmentIntersectsSegment2d(
    fromA: Vector2,
    toA: Vector2,
    fromB: Vector2,
    toB: Vector2
  ): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(fromA)
      _args.add(toA)
      _args.add(fromB)
      _args.add(toB)
      __method_bind.segmentIntersectsSegment2d.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Float
  ): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      _args.add(spherePosition)
      _args.add(sphereRadius)
      __method_bind.segmentIntersectsSphere.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3
  ): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      _args.add(a)
      _args.add(b)
      _args.add(c)
      __method_bind.segmentIntersectsTriangle.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun triangulateDelaunay2d(points: PoolVector2Array): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.triangulateDelaunay2d.call(self._handle, listOf(points), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.triangulatePolygon.call(self._handle, listOf(polygon), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Geometry
     */
    private object __method_bind {
      val buildBoxPlanes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "build_box_planes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build_box_planes" }
            }
          }

      val buildCapsulePlanes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "build_capsule_planes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build_capsule_planes" }
            }
          }

      val buildCylinderPlanes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "build_cylinder_planes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method build_cylinder_planes" }
            }
          }

      val clipPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "clip_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clip_polygon" }
            }
          }

      val clipPolygons2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "clip_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clip_polygons_2d" }
            }
          }

      val clipPolylineWithPolygon2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "clip_polyline_with_polygon_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clip_polyline_with_polygon_2d"
              }
            }
          }

      val convexHull2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "convex_hull_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method convex_hull_2d" }
            }
          }

      val excludePolygons2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "exclude_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method exclude_polygons_2d" }
            }
          }

      val getClosestPointToSegment: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_to_segment" }
            }
          }

      val getClosestPointToSegment2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_point_to_segment_2d" }
            }
          }

      val getClosestPointToSegmentUncapped: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment_uncapped".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_point_to_segment_uncapped" }
            }
          }

      val getClosestPointToSegmentUncapped2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_point_to_segment_uncapped_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_point_to_segment_uncapped_2d" }
            }
          }

      val getClosestPointsBetweenSegments: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_points_between_segments".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_points_between_segments" }
            }
          }

      val getClosestPointsBetweenSegments2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_closest_points_between_segments_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_closest_points_between_segments_2d" }
            }
          }

      val getUv84NormalBit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "get_uv84_normal_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uv84_normal_bit" }
            }
          }

      val intersectPolygons2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "intersect_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method intersect_polygons_2d" }
            }
          }

      val intersectPolylineWithPolygon2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "intersect_polyline_with_polygon_2d".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method intersect_polyline_with_polygon_2d" }
            }
          }

      val isPointInCircle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "is_point_in_circle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_point_in_circle" }
            }
          }

      val isPointInPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "is_point_in_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_point_in_polygon" }
            }
          }

      val isPolygonClockwise: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "is_polygon_clockwise".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_polygon_clockwise" }
            }
          }

      val lineIntersectsLine2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "line_intersects_line_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method line_intersects_line_2d" }
            }
          }

      val makeAtlas: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "make_atlas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_atlas" }
            }
          }

      val mergePolygons2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "merge_polygons_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method merge_polygons_2d" }
            }
          }

      val offsetPolygon2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "offset_polygon_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method offset_polygon_2d" }
            }
          }

      val offsetPolyline2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "offset_polyline_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method offset_polyline_2d" }
            }
          }

      val pointIsInsideTriangle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "point_is_inside_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method point_is_inside_triangle" }
            }
          }

      val rayIntersectsTriangle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "ray_intersects_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method ray_intersects_triangle" }
            }
          }

      val segmentIntersectsCircle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_circle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_circle" }
            }
          }

      val segmentIntersectsConvex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_convex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_convex" }
            }
          }

      val segmentIntersectsCylinder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_cylinder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_cylinder" }
            }
          }

      val segmentIntersectsSegment2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_segment_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_segment_2d"
              }
            }
          }

      val segmentIntersectsSphere: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_sphere".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_sphere" }
            }
          }

      val segmentIntersectsTriangle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "segment_intersects_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method segment_intersects_triangle" }
            }
          }

      val triangulateDelaunay2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "triangulate_delaunay_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method triangulate_delaunay_2d" }
            }
          }

      val triangulatePolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
              "triangulate_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method triangulate_polygon" }
            }
          }
    }
  }
}

object Geometry : GeometryInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Geometry".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton Geometry" }
      _handle = handle
    }
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
}
