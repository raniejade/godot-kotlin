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
    __method_bind.addBones.call(this._handle, _arg, 1)
  }

  fun addColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.addColor.call(this._handle, _arg, 1)
  }

  fun addIndex(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.addIndex.call(this._handle, _arg, 1)
  }

  fun addNormal(normal: Vector3) {
    val _arg = Variant.new(normal)
    __method_bind.addNormal.call(this._handle, _arg, 1)
  }

  fun addSmoothGroup(smooth: Boolean) {
    val _arg = Variant.new(smooth)
    __method_bind.addSmoothGroup.call(this._handle, _arg, 1)
  }

  fun addTangent(tangent: Plane) {
    val _arg = Variant.new(tangent)
    __method_bind.addTangent.call(this._handle, _arg, 1)
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
    __method_bind.addTriangleFan.call(this._handle, _args.toVariant(), 6)
  }

  fun addUv(uv: Vector2) {
    val _arg = Variant.new(uv)
    __method_bind.addUv.call(this._handle, _arg, 1)
  }

  fun addUv2(uv2: Vector2) {
    val _arg = Variant.new(uv2)
    __method_bind.addUv2.call(this._handle, _arg, 1)
  }

  fun addVertex(vertex: Vector3) {
    val _arg = Variant.new(vertex)
    __method_bind.addVertex.call(this._handle, _arg, 1)
  }

  fun addWeights(weights: PoolRealArray) {
    val _arg = Variant.new(weights)
    __method_bind.addWeights.call(this._handle, _arg, 1)
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
    __method_bind.appendFrom.call(this._handle, _args.toVariant(), 3)
  }

  fun begin(primitive: Int) {
    val _arg = Variant.new(primitive)
    __method_bind.begin.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun commit(existing: ArrayMesh, flags: Int = 97280): ArrayMesh {
    val _args = VariantArray.new()
    _args.append(existing)
    _args.append(flags)
    val _ret = __method_bind.commit.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::ArrayMesh)!!
  }

  fun commitToArrays(): VariantArray {
    val _ret = __method_bind.commitToArrays.call(this._handle)
    return _ret.asVariantArray()
  }

  fun createFrom(existing: Mesh, surface: Int) {
    val _args = VariantArray.new()
    _args.append(existing)
    _args.append(surface)
    __method_bind.createFrom.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.createFromBlendShape.call(this._handle, _args.toVariant(), 3)
  }

  fun deindex() {
    __method_bind.deindex.call(this._handle)
  }

  fun generateNormals(flip: Boolean = false) {
    val _arg = Variant.new(flip)
    __method_bind.generateNormals.call(this._handle, _arg, 1)
  }

  fun generateTangents() {
    __method_bind.generateTangents.call(this._handle)
  }

  fun index() {
    __method_bind.index.call(this._handle)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
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
      val addBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bones" }
        }
      val addColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color" }
        }
      val addIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_index" }
        }
      val addNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_normal" }
        }
      val addSmoothGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_smooth_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_smooth_group" }
        }
      val addTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tangent" }
        }
      val addTriangleFan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_triangle_fan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_triangle_fan" }
        }
      val addUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_uv" }
        }
      val addUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_uv2" }
        }
      val addVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_vertex" }
        }
      val addWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_weights" }
        }
      val appendFrom: CPointer<godot_method_bind>
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
      val commitToArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "commit_to_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit_to_arrays" }
        }
      val createFrom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "create_from".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from" }
        }
      val createFromBlendShape: CPointer<godot_method_bind>
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
      val generateNormals: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "generate_normals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_normals" }
        }
      val generateTangents: CPointer<godot_method_bind>
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
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }}
  }
}
