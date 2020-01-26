// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Transform2D
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

open class Navigation2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getClosestPoint(to_point: Vector2): Vector2 {
    TODO()
  }

  fun getClosestPointOwner(to_point: Vector2): Object {
    TODO()
  }

  fun getSimplePath(
    start: Vector2,
    end: Vector2,
    optimize: Boolean
  ): PoolVector2Array {
    TODO()
  }

  fun navpolyAdd(
    mesh: NavigationPolygon,
    xform: Transform2D,
    owner: Object
  ): Int {
    TODO()
  }

  fun navpolyRemove(id: Int) {
    TODO()
  }

  fun navpolySetTransform(id: Int, xform: Transform2D) {
    TODO()
  }

  companion object {
    fun new(): Navigation2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Navigation2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Navigation2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Navigation2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Navigation2D = Navigation2D(ptr)
    /**
     * Container for method_bind pointers for Navigation2D
     */
    private object __method_bind {
      val get_closest_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val get_closest_point_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
              "get_closest_point_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_owner" }
            }
          }

      val get_simple_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
              "get_simple_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_simple_path" }
            }
          }

      val navpoly_add: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
              "navpoly_add".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navpoly_add" }
            }
          }

      val navpoly_remove: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
              "navpoly_remove".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navpoly_remove" }
            }
          }

      val navpoly_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
              "navpoly_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navpoly_set_transform" }
            }
          }
    }
  }
}
