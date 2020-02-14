// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
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

open class MeshInstance(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : GeometryInstance(null) {
  var mesh: Mesh
    get() {
       return getMesh() 
    }
    set(value) {
      setMesh(value)
    }

  var skeleton: NodePath
    get() {
       return getSkeletonPath() 
    }
    set(value) {
      setSkeletonPath(value)
    }

  var skin: Skin
    get() {
       return getSkin() 
    }
    set(value) {
      setSkin(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for skeleton
   */
  fun skeleton(cb: NodePath.() -> Unit) {
    val _p = skeleton
    cb(_p)
    skeleton = _p
  }

  open fun _mesh_changed() {
    TODO()
  }

  fun createConvexCollision() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.createConvexCollision.call(self._handle, emptyList(), null)
    }
  }

  fun createDebugTangents() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.createDebugTangents.call(self._handle, emptyList(), null)
    }
  }

  fun createTrimeshCollision() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.createTrimeshCollision.call(self._handle, emptyList(), null)
    }
  }

  fun getMesh(): Mesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Mesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Mesh>(_tmp.value!!)
      _ret
    }
  }

  fun getSkeletonPath(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkeletonPath.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkin(): Skin {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Skin
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSkin.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Skin>(_tmp.value!!)
      _ret
    }
  }

  fun getSurfaceMaterial(surface: Int): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSurfaceMaterial.call(self._handle, listOf(surface), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getSurfaceMaterialCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSurfaceMaterialCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setMesh(mesh: Mesh) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMesh.call(self._handle, listOf(mesh), null)
    }
  }

  fun setSkeletonPath(skeletonPath: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkeletonPath.call(self._handle, listOf(skeletonPath), null)
    }
  }

  fun setSkin(skin: Skin) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkin.call(self._handle, listOf(skin), null)
    }
  }

  fun setSurfaceMaterial(surface: Int, material: Material) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(surface)
      _args.add(material)
      __method_bind.setSurfaceMaterial.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MeshInstance
     */
    private object __method_bind {
      val createConvexCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_convex_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_convex_collision" }
        }
      val createDebugTangents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_debug_tangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_debug_tangents" }
        }
      val createTrimeshCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_trimesh_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_trimesh_collision" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val getSkeletonPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_skeleton_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton_path" }
        }
      val getSkin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_skin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skin" }
        }
      val getSurfaceMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_surface_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_material" }
        }
      val getSurfaceMaterialCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_surface_material_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_material_count" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh" }
        }
      val setSkeletonPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_skeleton_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skeleton_path" }
        }
      val setSkin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_skin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skin" }
        }
      val setSurfaceMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_surface_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_surface_material" }
        }}
  }
}
