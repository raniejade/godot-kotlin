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

open class _Geometry(
  _handle: COpaquePointer
) : Object(_handle) {
  fun buildBoxPlanes(extents: Vector3): VariantArray {
    val _arg = Variant.new(extents)
    val _ret = __method_bind.buildBoxPlanes.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
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
    val _ret = __method_bind.buildCapsulePlanes.call(this._handle, _args.toVariant(), 5)
    return _ret.asVariantArray()
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
    val _ret = __method_bind.buildCylinderPlanes.call(this._handle, _args.toVariant(), 4)
    return _ret.asVariantArray()
  }

  fun clipPolygon(points: PoolVector3Array, plane: Plane): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(plane)
    val _ret = __method_bind.clipPolygon.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolVector3Array()
  }

  fun clipPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.clipPolygons2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun clipPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val _args = VariantArray.new()
    _args.append(polyline)
    _args.append(polygon)
    val _ret = __method_bind.clipPolylineWithPolygon2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun convexHull2d(points: PoolVector2Array): PoolVector2Array {
    val _arg = Variant.new(points)
    val _ret = __method_bind.convexHull2d.call(this._handle, _arg, 1)
    return _ret.asPoolVector2Array()
  }

  fun excludePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.excludePolygons2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
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
    val _ret = __method_bind.getClosestPointToSegment.call(this._handle, _args.toVariant(), 3)
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
    val _ret = __method_bind.getClosestPointToSegment2d.call(this._handle, _args.toVariant(), 3)
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
    val _ret = __method_bind.getClosestPointToSegmentUncapped.call(this._handle, _args.toVariant(),
        3)
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
    val _ret = __method_bind.getClosestPointToSegmentUncapped2d.call(this._handle,
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
    val _ret = __method_bind.getClosestPointsBetweenSegments.call(this._handle, _args.toVariant(),
        4)
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
    val _ret = __method_bind.getClosestPointsBetweenSegments2d.call(this._handle, _args.toVariant(),
        4)
    return _ret.asPoolVector2Array()
  }

  fun getUv84NormalBit(normal: Vector3): Int {
    val _arg = Variant.new(normal)
    val _ret = __method_bind.getUv84NormalBit.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun intersectPolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.intersectPolygons2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun intersectPolylineWithPolygon2d(polyline: PoolVector2Array, polygon: PoolVector2Array):
      VariantArray {
    val _args = VariantArray.new()
    _args.append(polyline)
    _args.append(polygon)
    val _ret = __method_bind.intersectPolylineWithPolygon2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun isPolygonClockwise(polygon: PoolVector2Array): Boolean {
    val _arg = Variant.new(polygon)
    val _ret = __method_bind.isPolygonClockwise.call(this._handle, _arg, 1)
    return _ret.asBoolean()
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
    val _ret = __method_bind.lineIntersectsLine2d.call(this._handle, _args.toVariant(), 4)
    return _ret
  }

  fun makeAtlas(sizes: PoolVector2Array): Dictionary {
    val _arg = Variant.new(sizes)
    val _ret = __method_bind.makeAtlas.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun mergePolygons2d(polygonA: PoolVector2Array, polygonB: PoolVector2Array): VariantArray {
    val _args = VariantArray.new()
    _args.append(polygonA)
    _args.append(polygonB)
    val _ret = __method_bind.mergePolygons2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
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
    val _ret = __method_bind.offsetPolygon2d.call(this._handle, _args.toVariant(), 3)
    return _ret.asVariantArray()
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
    val _ret = __method_bind.offsetPolyline2d.call(this._handle, _args.toVariant(), 4)
    return _ret.asVariantArray()
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
    val _ret = __method_bind.pointIsInsideTriangle.call(this._handle, _args.toVariant(), 4)
    return _ret.asBoolean()
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
    val _ret = __method_bind.rayIntersectsTriangle.call(this._handle, _args.toVariant(), 5)
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
    val _ret = __method_bind.segmentIntersectsCircle.call(this._handle, _args.toVariant(), 4)
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
    val _ret = __method_bind.segmentIntersectsConvex.call(this._handle, _args.toVariant(), 3)
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
    val _ret = __method_bind.segmentIntersectsCylinder.call(this._handle, _args.toVariant(), 4)
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
    val _ret = __method_bind.segmentIntersectsSegment2d.call(this._handle, _args.toVariant(), 4)
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
    val _ret = __method_bind.segmentIntersectsSphere.call(this._handle, _args.toVariant(), 4)
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
    val _ret = __method_bind.segmentIntersectsTriangle.call(this._handle, _args.toVariant(), 5)
    return _ret
  }

  fun transformPoints2d(points: PoolVector2Array, transform: Transform2D): PoolVector2Array {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(transform)
    val _ret = __method_bind.transformPoints2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolVector2Array()
  }

  fun triangulateDelaunay2d(points: PoolVector2Array): PoolIntArray {
    val _arg = Variant.new(points)
    val _ret = __method_bind.triangulateDelaunay2d.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun triangulatePolygon(polygon: PoolVector2Array): PoolIntArray {
    val _arg = Variant.new(polygon)
    val _ret = __method_bind.triangulatePolygon.call(this._handle, _arg, 1)
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
            "buildBoxPlanes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method buildBoxPlanes" }
        }
      val buildCapsulePlanes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "buildCapsulePlanes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method buildCapsulePlanes" }
        }
      val buildCylinderPlanes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "buildCylinderPlanes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method buildCylinderPlanes" }
        }
      val clipPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "clipPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clipPolygon" }
        }
      val clipPolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "clipPolygons2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clipPolygons2d" }
        }
      val clipPolylineWithPolygon2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "clipPolylineWithPolygon2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clipPolylineWithPolygon2d" }
        }
      val convexHull2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "convexHull2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method convexHull2d" }
        }
      val excludePolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "excludePolygons2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method excludePolygons2d" }
        }
      val getClosestPointToSegment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "getClosestPointToSegment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPointToSegment" }
        }
      val getClosestPointToSegment2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "getClosestPointToSegment2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPointToSegment2d" }
        }
      val getClosestPointToSegmentUncapped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "getClosestPointToSegmentUncapped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPointToSegmentUncapped" }
        }
      val getClosestPointToSegmentUncapped2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "getClosestPointToSegmentUncapped2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPointToSegmentUncapped2d"
            }
        }
      val getClosestPointsBetweenSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "getClosestPointsBetweenSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPointsBetweenSegments" }
        }
      val getClosestPointsBetweenSegments2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "getClosestPointsBetweenSegments2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClosestPointsBetweenSegments2d"
            }
        }
      val getUv84NormalBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "getUv84NormalBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv84NormalBit" }
        }
      val intersectPolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "intersectPolygons2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersectPolygons2d" }
        }
      val intersectPolylineWithPolygon2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "intersectPolylineWithPolygon2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method intersectPolylineWithPolygon2d" }
        }
      val isPolygonClockwise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "isPolygonClockwise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPolygonClockwise" }
        }
      val lineIntersectsLine2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "lineIntersectsLine2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lineIntersectsLine2d" }
        }
      val makeAtlas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "makeAtlas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeAtlas" }
        }
      val mergePolygons2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "mergePolygons2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mergePolygons2d" }
        }
      val offsetPolygon2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "offsetPolygon2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method offsetPolygon2d" }
        }
      val offsetPolyline2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "offsetPolyline2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method offsetPolyline2d" }
        }
      val pointIsInsideTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "pointIsInsideTriangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pointIsInsideTriangle" }
        }
      val rayIntersectsTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "rayIntersectsTriangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rayIntersectsTriangle" }
        }
      val segmentIntersectsCircle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segmentIntersectsCircle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segmentIntersectsCircle" }
        }
      val segmentIntersectsConvex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segmentIntersectsConvex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segmentIntersectsConvex" }
        }
      val segmentIntersectsCylinder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segmentIntersectsCylinder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segmentIntersectsCylinder" }
        }
      val segmentIntersectsSegment2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segmentIntersectsSegment2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segmentIntersectsSegment2d" }
        }
      val segmentIntersectsSphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segmentIntersectsSphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segmentIntersectsSphere" }
        }
      val segmentIntersectsTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "segmentIntersectsTriangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segmentIntersectsTriangle" }
        }
      val transformPoints2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "transformPoints2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method transformPoints2d" }
        }
      val triangulateDelaunay2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "triangulateDelaunay2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method triangulateDelaunay2d" }
        }
      val triangulatePolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Geometry".cstr.ptr,
            "triangulatePolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method triangulatePolygon" }
        }}
  }
}
