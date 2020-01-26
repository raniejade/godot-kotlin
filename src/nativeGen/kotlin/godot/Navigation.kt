// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Transform
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Navigation internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getClosestPoint(to_point: Vector3): Vector3 {
    TODO()
  }

  fun getClosestPointNormal(to_point: Vector3): Vector3 {
    TODO()
  }

  fun getClosestPointOwner(to_point: Vector3): Object {
    TODO()
  }

  fun getClosestPointToSegment(
    start: Vector3,
    end: Vector3,
    use_collision: Boolean
  ): Vector3 {
    TODO()
  }

  fun getSimplePath(
    start: Vector3,
    end: Vector3,
    optimize: Boolean
  ): PoolVector3Array {
    TODO()
  }

  fun getUpVector(): Vector3 {
    TODO()
  }

  fun navmeshAdd(
    mesh: NavigationMesh,
    xform: Transform,
    owner: Object
  ): Int {
    TODO()
  }

  fun navmeshRemove(id: Int) {
    TODO()
  }

  fun navmeshSetTransform(id: Int, xform: Transform) {
    TODO()
  }

  fun setUpVector(up: Vector3) {
    TODO()
  }

  companion object {
    fun new(): Navigation = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Navigation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Navigation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Navigation(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Navigation
     */
    private object __method_bind {
      val get_closest_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val get_closest_point_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_normal" }
            }
          }

      val get_closest_point_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_owner" }
            }
          }

      val get_closest_point_to_segment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point_to_segment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_to_segment" }
            }
          }

      val get_simple_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_simple_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_simple_path" }
            }
          }

      val get_up_vector: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_up_vector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_up_vector" }
            }
          }

      val navmesh_add: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "navmesh_add".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navmesh_add" }
            }
          }

      val navmesh_remove: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "navmesh_remove".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navmesh_remove" }
            }
          }

      val navmesh_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "navmesh_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navmesh_set_transform" }
            }
          }

      val set_up_vector: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "set_up_vector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_up_vector" }
            }
          }
    }
  }
}
