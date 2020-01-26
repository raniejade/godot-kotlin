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

open class MeshDataTool internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): MeshDataTool = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshDataTool".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MeshDataTool" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshDataTool(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for MeshDataTool
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val commit_to_surface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "commit_to_surface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method commit_to_surface" }
            }
          }

      val create_from_surface: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "create_from_surface".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_surface" }
            }
          }

      val get_edge_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_edge_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_count" }
            }
          }

      val get_edge_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_edge_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_faces" }
            }
          }

      val get_edge_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_edge_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_meta" }
            }
          }

      val get_edge_vertex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_edge_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_vertex" }
            }
          }

      val get_face_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_face_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_face_count" }
            }
          }

      val get_face_edge: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_face_edge".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_face_edge" }
            }
          }

      val get_face_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_face_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_face_meta" }
            }
          }

      val get_face_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_face_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_face_normal" }
            }
          }

      val get_face_vertex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_face_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_face_vertex" }
            }
          }

      val get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_vertex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex" }
            }
          }

      val get_vertex_bones: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_bones".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_bones" }
            }
          }

      val get_vertex_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_color" }
            }
          }

      val get_vertex_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_count" }
            }
          }

      val get_vertex_edges: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_edges".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_edges" }
            }
          }

      val get_vertex_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_faces" }
            }
          }

      val get_vertex_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_meta" }
            }
          }

      val get_vertex_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_normal" }
            }
          }

      val get_vertex_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_tangent" }
            }
          }

      val get_vertex_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_uv" }
            }
          }

      val get_vertex_uv2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_uv2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_uv2" }
            }
          }

      val get_vertex_weights: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "get_vertex_weights".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_weights" }
            }
          }

      val set_edge_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_edge_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edge_meta" }
            }
          }

      val set_face_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_face_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_face_meta" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_vertex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex" }
            }
          }

      val set_vertex_bones: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_bones".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_bones" }
            }
          }

      val set_vertex_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_color" }
            }
          }

      val set_vertex_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_meta" }
            }
          }

      val set_vertex_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_normal" }
            }
          }

      val set_vertex_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_tangent" }
            }
          }

      val set_vertex_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_uv" }
            }
          }

      val set_vertex_uv2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_uv2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_uv2" }
            }
          }

      val set_vertex_weights: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
              "set_vertex_weights".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_weights" }
            }
          }
    }
  }
}
