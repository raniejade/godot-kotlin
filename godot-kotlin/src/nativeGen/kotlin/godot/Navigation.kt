// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class Navigation(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var upVector: Vector3
    get() {
       return getUpVector() 
    }
    set(value) {
      setUpVector(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getClosestPoint.call(self._handle, listOf(toPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointNormal(toPoint: Vector3): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getClosestPointNormal.call(self._handle, listOf(toPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getClosestPointOwner(toPoint: Vector3): Object {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Object
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getClosestPointOwner.call(self._handle, listOf(toPoint), _retPtr)
      _ret = objectToType<Object>(_tmp.value!!)
      _ret
    }
  }

  fun getClosestPointToSegment(
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false
  ): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(start)
      _args.add(end)
      _args.add(useCollision)
      __method_bind.getClosestPointToSegment.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSimplePath(
    start: Vector3,
    end: Vector3,
    optimize: Boolean = true
  ): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(start)
      _args.add(end)
      _args.add(optimize)
      __method_bind.getSimplePath.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUpVector(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getUpVector.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun navmeshAdd(
    mesh: NavigationMesh,
    xform: Transform,
    owner: Object
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(mesh)
      _args.add(xform)
      _args.add(owner)
      __method_bind.navmeshAdd.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun navmeshRemove(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.navmeshRemove.call(self._handle, listOf(id), null)
    }
  }

  fun navmeshSetTransform(id: Int, xform: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(xform)
      __method_bind.navmeshSetTransform.call(self._handle, _args, null)
    }
  }

  fun setUpVector(up: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUpVector.call(self._handle, listOf(up), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Navigation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Navigation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Navigation
     */
    private object __method_bind {
      val getClosestPoint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
            }
          }

      val getClosestPointNormal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_normal" }
            }
          }

      val getClosestPointOwner: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_owner" }
            }
          }

      val getClosestPointToSegment: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_closest_point_to_segment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_closest_point_to_segment" }
            }
          }

      val getSimplePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_simple_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_simple_path" }
            }
          }

      val getUpVector: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "get_up_vector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_up_vector" }
            }
          }

      val navmeshAdd: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "navmesh_add".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navmesh_add" }
            }
          }

      val navmeshRemove: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "navmesh_remove".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navmesh_remove" }
            }
          }

      val navmeshSetTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "navmesh_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method navmesh_set_transform" }
            }
          }

      val setUpVector: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation".cstr.ptr,
              "set_up_vector".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_up_vector" }
            }
          }
    }
  }
}
