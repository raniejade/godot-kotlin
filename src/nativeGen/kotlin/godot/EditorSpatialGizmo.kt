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

open class EditorSpatialGizmo internal constructor(
  _handle: COpaquePointer
) : SpatialGizmo(_handle) {
  fun addCollisionSegments() {
    TODO()
  }

  fun addCollisionTriangles() {
    TODO()
  }

  fun addHandles() {
    TODO()
  }

  fun addLines() {
    TODO()
  }

  fun addMesh() {
    TODO()
  }

  fun addUnscaledBillboard() {
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

  fun setHidden() {
    TODO()
  }

  fun setSpatialNode() {
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
