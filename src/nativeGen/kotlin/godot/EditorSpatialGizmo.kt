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
    billboard: Boolean,
    secondary: Boolean
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
    billboard: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(lines)
    _args.append(material)
    _args.append(billboard)
    __method_bind.addLines.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.addMesh.call(this._handle, _args.toVariant(), 4)
  }

  fun addUnscaledBillboard(material: Material, defaultScale: Float) {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(defaultScale)
    __method_bind.addUnscaledBillboard.call(this._handle, _args.toVariant(), 2)
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
    fun new(): EditorSpatialGizmo = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSpatialGizmo".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorSpatialGizmo" }
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
      val addCollisionSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "addCollisionSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCollisionSegments" }
        }
      val addCollisionTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "addCollisionTriangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addCollisionTriangles" }
        }
      val addHandles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "addHandles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addHandles" }
        }
      val addLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "addLines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addLines" }
        }
      val addMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "addMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addMesh" }
        }
      val addUnscaledBillboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "addUnscaledBillboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addUnscaledBillboard" }
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
            "getPlugin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlugin" }
        }
      val getSpatialNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "getSpatialNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpatialNode" }
        }
      val setHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "setHidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHidden" }
        }
      val setSpatialNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
            "setSpatialNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpatialNode" }
        }}
  }
}
