// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
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
    val _args = VariantArray.new()
    _args.append(segments)
    __method_bind.add_collision_segments.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun addCollisionTriangles(triangles: TriangleMesh) {
    val _args = VariantArray.new()
    _args.append(triangles)
    __method_bind.add_collision_triangles.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun addHandles(
    handles: PoolVector3Array,
    material: Material,
    billboard: Boolean,
    secondary: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(handles)
    _args.append(material)
    _args.append(billboard)
    _args.append(secondary)
    __method_bind.add_handles.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun addLines(
    lines: PoolVector3Array,
    material: Material,
    billboard: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(lines)
    _args.append(material)
    _args.append(billboard)
    __method_bind.add_lines.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun addMesh(
    mesh: ArrayMesh,
    billboard: Boolean,
    skeleton: RID,
    material: Material
  ) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(billboard)
    _args.append(skeleton)
    _args.append(material)
    __method_bind.add_mesh.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun addUnscaledBillboard(material: Material, defaultScale: Float) {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(defaultScale)
    __method_bind.add_unscaled_billboard.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun clear() {
    __method_bind.clear.call(this.toVariant())
  }

  fun getPlugin(): EditorSpatialGizmoPlugin {
    val _ret = __method_bind.get_plugin.call(this.toVariant())
    return _ret.asObject(::EditorSpatialGizmoPlugin)!!
  }

  fun getSpatialNode(): Spatial {
    val _ret = __method_bind.get_spatial_node.call(this.toVariant())
    return _ret.asObject(::Spatial)!!
  }

  fun setHidden(hidden: Boolean) {
    val _args = VariantArray.new()
    _args.append(hidden)
    __method_bind.set_hidden.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSpatialNode(node: Node) {
    val _args = VariantArray.new()
    _args.append(node)
    __method_bind.set_spatial_node.call(this.toVariant(), _args.toVariant(), 1)
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
