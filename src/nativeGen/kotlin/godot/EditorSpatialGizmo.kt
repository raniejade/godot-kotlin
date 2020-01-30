// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolVector3Array
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

open class EditorSpatialGizmo(
  _handle: COpaquePointer
) : SpatialGizmo(_handle) {
  fun addCollisionSegments(segments: PoolVector3Array) {
    val _arg = Variant.new(segments)
    __method_bind.addCollisionSegments.call(this._handle, _arg, 1)
  }

  fun addCollisionTriangles(triangles: TriangleMesh) {
    val _arg = Variant.new(triangles)
    __method_bind.addCollisionTriangles.call(this._handle, _arg, 1)
  }

  fun addHandles(
    handles: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    secondary: Boolean = false
  ) {
    val _args = VariantArray.new()
    _args.append(handles)
    _args.append(material)
    _args.append(billboard)
    _args.append(secondary)
    __method_bind.addHandles.call(this._handle, _args.toVariant(), 4)
  }

  fun addLines(
    lines: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    modulate: Color = Color.rgb(1,1,1,1)
  ) {
    val _args = VariantArray.new()
    _args.append(lines)
    _args.append(material)
    _args.append(billboard)
    _args.append(modulate)
    __method_bind.addLines.call(this._handle, _args.toVariant(), 4)
  }

  fun addMesh(
    mesh: ArrayMesh,
    billboard: Boolean = false,
    skeleton: SkinReference,
    material: Material
  ) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(billboard)
    _args.append(skeleton)
    _args.append(material)
    __method_bind.addMesh.call(this._handle, _args.toVariant(), 4)
  }

  fun addUnscaledBillboard(
    material: Material,
    defaultScale: Float = 1.0f,
    modulate: Color = Color.rgb(1,1,1,1)
  ) {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(defaultScale)
    _args.append(modulate)
    __method_bind.addUnscaledBillboard.call(this._handle, _args.toVariant(), 3)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getPlugin(): EditorSpatialGizmoPlugin {
    val _ret = __method_bind.getPlugin.call(this._handle)
    return _ret.asObject(::EditorSpatialGizmoPlugin)!!
  }

  fun getSpatialNode(): Spatial {
    val _ret = __method_bind.getSpatialNode.call(this._handle)
    return _ret.asObject(::Spatial)!!
  }

  fun setHidden(hidden: Boolean) {
    val _arg = Variant.new(hidden)
    __method_bind.setHidden.call(this._handle, _arg, 1)
  }

  fun setSpatialNode(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.setSpatialNode.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSpatialGizmo
     */
    private object __method_bind {
      val addCollisionSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "add_collision_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_collision_segments" }
        }
      val addCollisionTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "add_collision_triangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_collision_triangles" }
        }
      val addHandles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "add_handles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_handles" }
        }
      val addLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "add_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_lines" }
        }
      val addMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "add_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_mesh" }
        }
      val addUnscaledBillboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "add_unscaled_billboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_unscaled_billboard" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getPlugin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "get_plugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_plugin" }
        }
      val getSpatialNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "get_spatial_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spatial_node" }
        }
      val setHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "set_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hidden" }
        }
      val setSpatialNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "set_spatial_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spatial_node" }
        }}
  }
}
