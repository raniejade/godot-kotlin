// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshInstance internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  companion object {
    fun new(): MeshInstance = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshInstance(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for MeshInstance
     */
    private object __method_bind {
      val _mesh_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "_mesh_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _mesh_changed" }
            }
          }

      val create_convex_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "create_convex_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_convex_collision" }
            }
          }

      val create_debug_tangents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "create_debug_tangents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_debug_tangents" }
            }
          }

      val create_trimesh_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "create_trimesh_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_trimesh_collision" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val get_skeleton_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "get_skeleton_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_skeleton_path" }
            }
          }

      val get_surface_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "get_surface_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_surface_material" }
            }
          }

      val get_surface_material_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "get_surface_material_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_surface_material_count" }
            }
          }

      val set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh" }
            }
          }

      val set_skeleton_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "set_skeleton_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_skeleton_path" }
            }
          }

      val set_surface_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshInstance".cstr.ptr,
              "set_surface_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_surface_material" }
            }
          }
    }
  }
}
