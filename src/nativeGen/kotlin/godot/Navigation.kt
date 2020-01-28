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
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Navigation(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var upVector: Vector3
    get() {
       return getUpVector() 
    }
    set(value) {
      setUpVector(value)
    }

  /**
   * Specialized setter for upVector
   */
  fun upVector(cb: Vector3.() -> Unit) {
    val _p = upVector
    cb(_p)
    upVector = _p
  }

  fun getClosestPoint(toPoint: Vector3): Vector3 {
    val _arg = Variant.new(toPoint)
    val _ret = __method_bind.getClosestPoint.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getClosestPointNormal(toPoint: Vector3): Vector3 {
    val _arg = Variant.new(toPoint)
    val _ret = __method_bind.getClosestPointNormal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getClosestPointOwner(toPoint: Vector3): Object {
    val _arg = Variant.new(toPoint)
    val _ret = __method_bind.getClosestPointOwner.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
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
    val _ret = __method_bind.getClosestPointToSegment.call(this._handle, _args.toVariant(), 3)
    return _ret.asVector3()
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
    val _ret = __method_bind.getSimplePath.call(this._handle, _args.toVariant(), 3)
    return _ret.asPoolVector3Array()
  }

  fun getUpVector(): Vector3 {
    val _ret = __method_bind.getUpVector.call(this._handle)
    return _ret.asVector3()
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
    val _ret = __method_bind.navmeshAdd.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun navmeshRemove(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.navmeshRemove.call(this._handle, _arg, 1)
  }

  fun navmeshSetTransform(id: Int, xform: Transform) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(xform)
    __method_bind.navmeshSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun setUpVector(up: Vector3) {
    val _arg = Variant.new(up)
    __method_bind.setUpVector.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Navigation = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Navigation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Navigation" }
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
      val getClosestPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getClosestPointNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "get_closest_point_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point_normal" }
        }
      val getClosestPointOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "get_closest_point_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point_owner" }
        }
      val getClosestPointToSegment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "get_closest_point_to_segment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point_to_segment" }
        }
      val getSimplePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "get_simple_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_simple_path" }
        }
      val getUpVector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "get_up_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_up_vector" }
        }
      val navmeshAdd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "navmesh_add".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method navmesh_add" }
        }
      val navmeshRemove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "navmesh_remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method navmesh_remove" }
        }
      val navmeshSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "navmesh_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method navmesh_set_transform" }
        }
      val setUpVector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
            "set_up_vector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_up_vector" }
        }}
  }
}
