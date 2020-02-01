// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class PolygonPathFinder(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun findPath(from: Vector2, to: Vector2): PoolVector2Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    val _ret = __method_bind.findPath.call(this._handle, _args)
    return _ret.asPoolVector2Array()
  }

  fun getBounds(): Rect2 {
    val _ret = __method_bind.getBounds.call(this._handle)
    return _ret.asRect2()
  }

  fun getClosestPoint(point: Vector2): Vector2 {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getClosestPoint.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getIntersections(from: Vector2, to: Vector2): PoolVector2Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    val _ret = __method_bind.getIntersections.call(this._handle, _args)
    return _ret.asPoolVector2Array()
  }

  fun getPointPenalty(idx: Int): Float {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPointPenalty.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun isPointInside(point: Vector2): Boolean {
    val _arg = Variant.new(point)
    val _ret = __method_bind.isPointInside.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setPointPenalty(idx: Int, penalty: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(penalty))
    __method_bind.setPointPenalty.call(this._handle, _args)
  }

  fun setup(points: PoolVector2Array, connections: PoolIntArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(connections))
    __method_bind.setup.call(this._handle, _args)
  }

  companion object {
    fun new(): PolygonPathFinder = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PolygonPathFinder".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PolygonPathFinder" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PolygonPathFinder(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PolygonPathFinder = PolygonPathFinder(ptr)
    /**
     * Container for method_bind pointers for PolygonPathFinder
     */
    private object __method_bind {
      val findPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "find_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_path" }
        }
      val getBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounds" }
        }
      val getClosestPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getIntersections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_intersections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_intersections" }
        }
      val getPointPenalty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "get_point_penalty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_penalty" }
        }
      val isPointInside: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "is_point_inside".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_point_inside" }
        }
      val setPointPenalty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "set_point_penalty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_penalty" }
        }
      val setup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
            "setup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setup" }
        }}
  }
}
