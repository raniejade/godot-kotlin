// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.GDError
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Int
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
  fun clear() {
    __method_bind.clear.call(this.toVariant())
  }

  fun commitToSurface(mesh: ArrayMesh): GDError {
    val _args = VariantArray.new()
    _args.append(mesh)
    val _ret = __method_bind.commit_to_surface.call(this.toVariant(), _args.toVariant(), 1)
    return GDError.from(_ret.asInt())
  }

  fun createFromSurface(mesh: ArrayMesh, surface: Int): GDError {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.create_from_surface.call(this.toVariant(), _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun getEdgeCount(): Int {
    val _ret = __method_bind.get_edge_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getEdgeFaces(idx: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_edge_faces.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolIntArray()
  }

  fun getEdgeMeta(idx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_edge_meta.call(this.toVariant(), _args.toVariant(), 1)
    return _ret
  }

  fun getEdgeVertex(idx: Int, vertex: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(vertex)
    val _ret = __method_bind.get_edge_vertex.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getFaceCount(): Int {
    val _ret = __method_bind.get_face_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getFaceEdge(idx: Int, edge: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(edge)
    val _ret = __method_bind.get_face_edge.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getFaceMeta(idx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_face_meta.call(this.toVariant(), _args.toVariant(), 1)
    return _ret
  }

  fun getFaceNormal(idx: Int): Vector3 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_face_normal.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector3()
  }

  fun getFaceVertex(idx: Int, vertex: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(vertex)
    val _ret = __method_bind.get_face_vertex.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getFormat(): Int {
    val _ret = __method_bind.get_format.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this.toVariant())
    return _ret.asObject(::Material)!!
  }

  fun getVertex(idx: Int): Vector3 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector3()
  }

  fun getVertexBones(idx: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_bones.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolIntArray()
  }

  fun getVertexColor(idx: Int): Color {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_color.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asColor()
  }

  fun getVertexCount(): Int {
    val _ret = __method_bind.get_vertex_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getVertexEdges(idx: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_edges.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolIntArray()
  }

  fun getVertexFaces(idx: Int): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_faces.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolIntArray()
  }

  fun getVertexMeta(idx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_meta.call(this.toVariant(), _args.toVariant(), 1)
    return _ret
  }

  fun getVertexNormal(idx: Int): Vector3 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_normal.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector3()
  }

  fun getVertexTangent(idx: Int): Plane {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_tangent.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPlane()
  }

  fun getVertexUv(idx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_uv.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun getVertexUv2(idx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_uv2.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun getVertexWeights(idx: Int): PoolRealArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_vertex_weights.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asPoolRealArray()
  }

  fun setEdgeMeta(idx: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(meta)
    __method_bind.set_edge_meta.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setFaceMeta(idx: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(meta)
    __method_bind.set_face_meta.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setMaterial(material: Material) {
    val _args = VariantArray.new()
    _args.append(material)
    __method_bind.set_material.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setVertex(idx: Int, vertex: Vector3) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(vertex)
    __method_bind.set_vertex.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexBones(idx: Int, bones: PoolIntArray) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(bones)
    __method_bind.set_vertex_bones.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexColor(idx: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(color)
    __method_bind.set_vertex_color.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexMeta(idx: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(meta)
    __method_bind.set_vertex_meta.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexNormal(idx: Int, normal: Vector3) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(normal)
    __method_bind.set_vertex_normal.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexTangent(idx: Int, tangent: Plane) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(tangent)
    __method_bind.set_vertex_tangent.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexUv(idx: Int, uv: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(uv)
    __method_bind.set_vertex_uv.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexUv2(idx: Int, uv2: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(uv2)
    __method_bind.set_vertex_uv2.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setVertexWeights(idx: Int, weights: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(weights)
    __method_bind.set_vertex_weights.call(this.toVariant(), _args.toVariant(), 2)
  }

  companion object {
    fun new(): MeshDataTool = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshDataTool".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MeshDataTool" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MeshDataTool(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MeshDataTool = MeshDataTool(ptr)
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
