// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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
  fun createConvexCollision() {
    __method_bind.create_convex_collision.call(this._handle)
  }

  fun createDebugTangents() {
    __method_bind.create_debug_tangents.call(this._handle)
  }

  fun createTrimeshCollision() {
    __method_bind.create_trimesh_collision.call(this._handle)
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.get_mesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getSkeletonPath(): NodePath {
    val _ret = __method_bind.get_skeleton_path.call(this._handle)
    return _ret.asNodePath()
  }

  fun getSurfaceMaterial(surface: Int): Material {
    val _arg = Variant.new(surface)
    val _ret = __method_bind.get_surface_material.call(this._handle, _arg, 1)
    return _ret.asObject(::Material)!!
  }

  fun getSurfaceMaterialCount(): Int {
    val _ret = __method_bind.get_surface_material_count.call(this._handle)
    return _ret.asInt()
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.set_mesh.call(this._handle, _arg, 1)
  }

  fun setSkeletonPath(skeletonPath: NodePath) {
    val _arg = Variant.new(skeletonPath)
    __method_bind.set_skeleton_path.call(this._handle, _arg, 1)
  }

  fun setSurfaceMaterial(surface: Int, material: Material) {
    val _args = VariantArray.new()
    _args.append(surface)
    _args.append(material)
    __method_bind.set_surface_material.call(this._handle, _args.toVariant(), 2)
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
      val create_convex_collision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_convex_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_convex_collision" }
        }
      val create_debug_tangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_debug_tangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_debug_tangents" }
        }
      val create_trimesh_collision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "create_trimesh_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_trimesh_collision" }
        }
      val get_mesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val get_skeleton_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_skeleton_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton_path" }
        }
      val get_surface_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_surface_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_material" }
        }
      val get_surface_material_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "get_surface_material_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_material_count" }
        }
      val set_mesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh" }
        }
      val set_skeleton_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_skeleton_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skeleton_path" }
        }
      val set_surface_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
            "set_surface_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_surface_material" }
        }}
  }
}
