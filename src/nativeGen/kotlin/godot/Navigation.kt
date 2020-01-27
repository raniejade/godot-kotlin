// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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
  fun getClosestPoint(toPoint: Vector3): Vector3 {
    val _args = VariantArray.new()
    _args.append(toPoint)
    val _ret = __method_bind.get_closest_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getClosestPointNormal(toPoint: Vector3): Vector3 {
    val _args = VariantArray.new()
    _args.append(toPoint)
    val _ret = __method_bind.get_closest_point_normal.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getClosestPointOwner(toPoint: Vector3): Object {
    val _args = VariantArray.new()
    _args.append(toPoint)
    val _ret = __method_bind.get_closest_point_owner.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getClosestPointToSegment(
    start: Vector3,
    end: Vector3,
    useCollision: Boolean
  ): Vector3 {
    val _args = VariantArray.new()
    _args.append(start)
    _args.append(end)
    _args.append(useCollision)
    val _ret = __method_bind.get_closest_point_to_segment.call(this.toVariant(), _args.toVariant(),
        3)
    TODO()
  }

  fun getSimplePath(
    start: Vector3,
    end: Vector3,
    optimize: Boolean
  ): PoolVector3Array {
    val _args = VariantArray.new()
    _args.append(start)
    _args.append(end)
    _args.append(optimize)
    val _ret = __method_bind.get_simple_path.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun getUpVector(): Vector3 {
    val _ret = __method_bind.get_up_vector.call(this.toVariant())
    TODO()
  }

  fun navmeshAdd(
    mesh: NavigationMesh,
    xform: Transform,
    owner: Object
  ): Int {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(xform)
    _args.append(owner)
    val _ret = __method_bind.navmesh_add.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun navmeshRemove(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.navmesh_remove.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun navmeshSetTransform(id: Int, xform: Transform) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(xform)
    val _ret = __method_bind.navmesh_set_transform.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setUpVector(up: Vector3) {
    val _args = VariantArray.new()
    _args.append(up)
    val _ret = __method_bind.set_up_vector.call(this.toVariant(), _args.toVariant(), 1)
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
    fun from(ptr: COpaquePointer): Navigation = Navigation(ptr)
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
