// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshInstance(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
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

  /**
   * Specialized setter for skeleton
   */
  fun skeleton(cb: NodePath.() -> Unit) {
    val _p = skeleton
    cb(_p)
    skeleton = _p
  }

  fun createConvexCollision() {
    __method_bind.createConvexCollision.call(this._handle)
  }

  fun createDebugTangents() {
    __method_bind.createDebugTangents.call(this._handle)
  }

  fun createTrimeshCollision() {
    __method_bind.createTrimeshCollision.call(this._handle)
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getSkeletonPath(): NodePath {
    val _ret = __method_bind.getSkeletonPath.call(this._handle)
    return _ret.asNodePath()
  }

  fun getSkin(): Skin {
    val _ret = __method_bind.getSkin.call(this._handle)
    return _ret.asObject(::Skin)!!
  }

  fun getSurfaceMaterial(surface: Int): Material {
    val _arg = Variant.new(surface)
    val _ret = __method_bind.getSurfaceMaterial.call(this._handle, listOf(_arg))
    return _ret.asObject(::Material)!!
  }

  fun getSurfaceMaterialCount(): Int {
    val _ret = __method_bind.getSurfaceMaterialCount.call(this._handle)
    return _ret.asInt()
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.setMesh.call(this._handle, listOf(_arg))
  }

  fun setSkeletonPath(skeletonPath: NodePath) {
    val _arg = Variant.new(skeletonPath)
    __method_bind.setSkeletonPath.call(this._handle, listOf(_arg))
  }

  fun setSkin(skin: Skin) {
    val _arg = Variant.new(skin)
    __method_bind.setSkin.call(this._handle, listOf(_arg))
  }

  fun setSurfaceMaterial(surface: Int, material: Material) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(surface))
    _args.add(Variant.fromAny(material))
    __method_bind.setSurfaceMaterial.call(this._handle, _args)
  }

  companion object {
    fun new(): MeshInstance = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshInstance(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MeshInstance = MeshInstance(ptr)
    /**
     * Container for method_bind pointers for MeshInstance
     */
    private object __method_bind {
      val createConvexCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_convex_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_convex_collision" }
        }
      val createDebugTangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_debug_tangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_debug_tangents" }
        }
      val createTrimeshCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_trimesh_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_trimesh_collision" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val getSkeletonPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_skeleton_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton_path" }
        }
      val getSkin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_skin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skin" }
        }
      val getSurfaceMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_surface_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_material" }
        }
      val getSurfaceMaterialCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_surface_material_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_material_count" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh" }
        }
      val setSkeletonPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_skeleton_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skeleton_path" }
        }
      val setSkin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_skin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skin" }
        }
      val setSurfaceMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_surface_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_surface_material" }
        }}
  }
}
