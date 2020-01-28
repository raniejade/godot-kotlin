// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SurfaceTool(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addBones(bones: PoolIntArray) {
    val _arg = Variant.new(bones)
    __method_bind.add_bones.call(this._handle, _arg, 1)
  }

  fun addColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.add_color.call(this._handle, _arg, 1)
  }

  fun addIndex(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.add_index.call(this._handle, _arg, 1)
  }

  fun addNormal(normal: Vector3) {
    val _arg = Variant.new(normal)
    __method_bind.add_normal.call(this._handle, _arg, 1)
  }

  fun addSmoothGroup(smooth: Boolean) {
    val _arg = Variant.new(smooth)
    __method_bind.add_smooth_group.call(this._handle, _arg, 1)
  }

  fun addTangent(tangent: Plane) {
    val _arg = Variant.new(tangent)
    __method_bind.add_tangent.call(this._handle, _arg, 1)
  }

  fun addTriangleFan(
    vertices: PoolVector3Array,
    uvs: PoolVector2Array,
    colors: PoolColorArray,
    uv2s: PoolVector2Array,
    normals: PoolVector3Array,
    tangents: VariantArray
  ) {
    val _args = VariantArray.new()
    _args.append(vertices)
    _args.append(uvs)
    _args.append(colors)
    _args.append(uv2s)
    _args.append(normals)
    _args.append(tangents)
    __method_bind.add_triangle_fan.call(this._handle, _args.toVariant(), 6)
  }

  fun addUv(uv: Vector2) {
    val _arg = Variant.new(uv)
    __method_bind.add_uv.call(this._handle, _arg, 1)
  }

  fun addUv2(uv2: Vector2) {
    val _arg = Variant.new(uv2)
    __method_bind.add_uv2.call(this._handle, _arg, 1)
  }

  fun addVertex(vertex: Vector3) {
    val _arg = Variant.new(vertex)
    __method_bind.add_vertex.call(this._handle, _arg, 1)
  }

  fun addWeights(weights: PoolRealArray) {
    val _arg = Variant.new(weights)
    __method_bind.add_weights.call(this._handle, _arg, 1)
  }

  fun appendFrom(
    existing: Mesh,
    surface: Int,
    transform: Transform
  ) {
    val _args = VariantArray.new()
    _args.append(existing)
    _args.append(surface)
    _args.append(transform)
    __method_bind.append_from.call(this._handle, _args.toVariant(), 3)
  }

  fun begin(primitive: Int) {
    val _arg = Variant.new(primitive)
    __method_bind.begin.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun commit(existing: ArrayMesh, flags: Int): ArrayMesh {
    val _args = VariantArray.new()
    _args.append(existing)
    _args.append(flags)
    val _ret = __method_bind.commit.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::ArrayMesh)!!
  }

  fun commitToArrays(): VariantArray {
    val _ret = __method_bind.commit_to_arrays.call(this._handle)
    return _ret.asVariantArray()
  }

  fun createFrom(existing: Mesh, surface: Int) {
    val _args = VariantArray.new()
    _args.append(existing)
    _args.append(surface)
    __method_bind.create_from.call(this._handle, _args.toVariant(), 2)
  }

  fun createFromBlendShape(
    existing: Mesh,
    surface: Int,
    blendShape: String
  ) {
    val _args = VariantArray.new()
    _args.append(existing)
    _args.append(surface)
    _args.append(blendShape)
    __method_bind.create_from_blend_shape.call(this._handle, _args.toVariant(), 3)
  }

  fun deindex() {
    __method_bind.deindex.call(this._handle)
  }

  fun generateNormals(flip: Boolean) {
    val _arg = Variant.new(flip)
    __method_bind.generate_normals.call(this._handle, _arg, 1)
  }

  fun generateTangents() {
    __method_bind.generate_tangents.call(this._handle)
  }

  fun index() {
    __method_bind.index.call(this._handle)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): SurfaceTool = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SurfaceTool".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SurfaceTool" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SurfaceTool(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SurfaceTool = SurfaceTool(ptr)
    /**
     * Container for method_bind pointers for SurfaceTool
     */
    private object __method_bind {
      val add_bones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bones" }
        }
      val add_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color" }
        }
      val add_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_index" }
        }
      val add_normal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_normal" }
        }
      val add_smooth_group: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_smooth_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_smooth_group" }
        }
      val add_tangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tangent" }
        }
      val add_triangle_fan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_triangle_fan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_triangle_fan" }
        }
      val add_uv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_uv" }
        }
      val add_uv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_uv2" }
        }
      val add_vertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_vertex" }
        }
      val add_weights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_weights" }
        }
      val append_from: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "append_from".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method append_from" }
        }
      val begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method begin" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val commit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "commit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit" }
        }
      val commit_to_arrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "commit_to_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit_to_arrays" }
        }
      val create_from: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "create_from".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from" }
        }
      val create_from_blend_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "create_from_blend_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_blend_shape" }
        }
      val deindex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "deindex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deindex" }
        }
      val generate_normals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "generate_normals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_normals" }
        }
      val generate_tangents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "generate_tangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_tangents" }
        }
      val index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method index" }
        }
      val set_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }}
  }
}
