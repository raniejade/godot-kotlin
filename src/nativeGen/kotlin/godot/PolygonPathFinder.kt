// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Rect2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PolygonPathFinder internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun findPath(): PoolVector2Array {
    TODO()
  }

  fun getBounds(): Rect2 {
    TODO()
  }

  fun getClosestPoint(): Vector2 {
    TODO()
  }

  fun getIntersections(): PoolVector2Array {
    TODO()
  }

  fun getPointPenalty(): Float {
    TODO()
  }

  fun isPointInside(): Boolean {
    TODO()
  }

  fun setPointPenalty() {
    TODO()
  }

  fun setup() {
    TODO()
  }

  companion object {
    fun new(): PolygonPathFinder = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PolygonPathFinder".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PolygonPathFinder" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PolygonPathFinder(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PolygonPathFinder
     */
    private object __method_bind {
      val find_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "find_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_path" }
            }
          }

      val get_bounds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "get_bounds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounds" }
            }
          }

      val get_closest_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val get_intersections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "get_intersections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_intersections" }
            }
          }

      val get_point_penalty: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "get_point_penalty".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_penalty" }
            }
          }

      val is_point_inside: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "is_point_inside".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_point_inside" }
            }
          }

      val set_point_penalty: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "set_point_penalty".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_penalty" }
            }
          }

      val setup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PolygonPathFinder".cstr.ptr,
              "setup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method setup" }
            }
          }
    }
  }
}
