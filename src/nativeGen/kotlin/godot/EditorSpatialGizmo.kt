// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.RID
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorSpatialGizmo internal constructor(
  _handle: COpaquePointer
) : SpatialGizmo(_handle) {
  fun addCollisionSegments(segments: PoolVector3Array) {
    TODO()
  }

  fun addCollisionTriangles(triangles: TriangleMesh) {
    TODO()
  }

  fun addHandles(
    handles: PoolVector3Array,
    material: Material,
    billboard: Boolean,
    secondary: Boolean
  ) {
    TODO()
  }

  fun addLines(
    lines: PoolVector3Array,
    material: Material,
    billboard: Boolean
  ) {
    TODO()
  }

  fun addMesh(
    mesh: ArrayMesh,
    billboard: Boolean,
    skeleton: RID,
    material: Material
  ) {
    TODO()
  }

  fun addUnscaledBillboard(material: Material, default_scale: Float) {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun getPlugin(): EditorSpatialGizmoPlugin {
    TODO()
  }

  fun getSpatialNode(): Spatial {
    TODO()
  }

  fun setHidden(hidden: Boolean) {
    TODO()
  }

  fun setSpatialNode(node: Node) {
    TODO()
  }

  companion object {
    fun new(): EditorSpatialGizmo = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSpatialGizmo".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorSpatialGizmo" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSpatialGizmo(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorSpatialGizmo = EditorSpatialGizmo(ptr)
    /**
     * Container for method_bind pointers for EditorSpatialGizmo
     */
    private object __method_bind {
      val add_collision_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_collision_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_collision_segments" }
            }
          }

      val add_collision_triangles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_collision_triangles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_collision_triangles" }
            }
          }

      val add_handles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_handles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_handles" }
            }
          }

      val add_lines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_lines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_lines" }
            }
          }

      val add_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_mesh" }
            }
          }

      val add_unscaled_billboard: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_unscaled_billboard".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_unscaled_billboard" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_plugin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "get_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_plugin" }
            }
          }

      val get_spatial_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "get_spatial_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spatial_node" }
            }
          }

      val set_hidden: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "set_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hidden" }
            }
          }

      val set_spatial_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "set_spatial_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spatial_node" }
            }
          }
    }
  }
}
