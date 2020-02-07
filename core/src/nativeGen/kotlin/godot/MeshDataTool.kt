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
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MeshDataTool(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun commitToSurface(mesh: ArrayMesh): GDError {
    val _arg = Variant(mesh)
    val _ret = __method_bind.commitToSurface.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun createFromSurface(mesh: ArrayMesh, surface: Int): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.createFromSurface.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun getEdgeCount(): Int {
    val _ret = __method_bind.getEdgeCount.call(this._handle)
    return _ret.asInt()
  }

  fun getEdgeFaces(idx: Int): PoolIntArray {
    val _arg = Variant(idx)
    val _ret = __method_bind.getEdgeFaces.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun getEdgeMeta(idx: Int): Variant {
    val _arg = Variant(idx)
    val _ret = __method_bind.getEdgeMeta.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getEdgeVertex(idx: Int, vertex: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(vertex))
    val _ret = __method_bind.getEdgeVertex.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getFaceCount(): Int {
    val _ret = __method_bind.getFaceCount.call(this._handle)
    return _ret.asInt()
  }

  fun getFaceEdge(idx: Int, edge: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(edge))
    val _ret = __method_bind.getFaceEdge.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getFaceMeta(idx: Int): Variant {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFaceMeta.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getFaceNormal(idx: Int): Vector3 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getFaceNormal.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun getFaceVertex(idx: Int, vertex: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(vertex))
    val _ret = __method_bind.getFaceVertex.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getFormat(): Int {
    val _ret = __method_bind.getFormat.call(this._handle)
    return _ret.asInt()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getVertex(idx: Int): Vector3 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertex.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun getVertexBones(idx: Int): PoolIntArray {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexBones.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun getVertexColor(idx: Int): Color {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getVertexCount(): Int {
    val _ret = __method_bind.getVertexCount.call(this._handle)
    return _ret.asInt()
  }

  fun getVertexEdges(idx: Int): PoolIntArray {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexEdges.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun getVertexFaces(idx: Int): PoolIntArray {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexFaces.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun getVertexMeta(idx: Int): Variant {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexMeta.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getVertexNormal(idx: Int): Vector3 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexNormal.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun getVertexTangent(idx: Int): Plane {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexTangent.call(this._handle, listOf(_arg))
    return _ret.asPlane()
  }

  fun getVertexUv(idx: Int): Vector2 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexUv.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getVertexUv2(idx: Int): Vector2 {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexUv2.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getVertexWeights(idx: Int): PoolRealArray {
    val _arg = Variant(idx)
    val _ret = __method_bind.getVertexWeights.call(this._handle, listOf(_arg))
    return _ret.asPoolRealArray()
  }

  fun setEdgeMeta(idx: Int, meta: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(meta))
    __method_bind.setEdgeMeta.call(this._handle, _args)
  }

  fun setFaceMeta(idx: Int, meta: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(meta))
    __method_bind.setFaceMeta.call(this._handle, _args)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant(material)
    __method_bind.setMaterial.call(this._handle, listOf(_arg))
  }

  fun setVertex(idx: Int, vertex: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(vertex))
    __method_bind.setVertex.call(this._handle, _args)
  }

  fun setVertexBones(idx: Int, bones: PoolIntArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(bones))
    __method_bind.setVertexBones.call(this._handle, _args)
  }

  fun setVertexColor(idx: Int, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(color))
    __method_bind.setVertexColor.call(this._handle, _args)
  }

  fun setVertexMeta(idx: Int, meta: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(meta))
    __method_bind.setVertexMeta.call(this._handle, _args)
  }

  fun setVertexNormal(idx: Int, normal: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(normal))
    __method_bind.setVertexNormal.call(this._handle, _args)
  }

  fun setVertexTangent(idx: Int, tangent: Plane) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(tangent))
    __method_bind.setVertexTangent.call(this._handle, _args)
  }

  fun setVertexUv(idx: Int, uv: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(uv))
    __method_bind.setVertexUv.call(this._handle, _args)
  }

  fun setVertexUv2(idx: Int, uv2: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(uv2))
    __method_bind.setVertexUv2.call(this._handle, _args)
  }

  fun setVertexWeights(idx: Int, weights: PoolRealArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(weights))
    __method_bind.setVertexWeights.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshDataTool".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshDataTool" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MeshDataTool
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val commitToSurface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "commit_to_surface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit_to_surface" }
        }
      val createFromSurface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "create_from_surface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_surface" }
        }
      val getEdgeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_count" }
        }
      val getEdgeFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_faces" }
        }
      val getEdgeMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_meta" }
        }
      val getEdgeVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_vertex" }
        }
      val getFaceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_count" }
        }
      val getFaceEdge: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_edge".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_edge" }
        }
      val getFaceMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_meta" }
        }
      val getFaceNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_normal" }
        }
      val getFaceVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_vertex" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val getVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex" }
        }
      val getVertexBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_bones" }
        }
      val getVertexColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_color" }
        }
      val getVertexCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_count" }
        }
      val getVertexEdges: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_edges".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_edges" }
        }
      val getVertexFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_faces" }
        }
      val getVertexMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_meta" }
        }
      val getVertexNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_normal" }
        }
      val getVertexTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_tangent" }
        }
      val getVertexUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_uv" }
        }
      val getVertexUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_uv2" }
        }
      val getVertexWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_weights" }
        }
      val setEdgeMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_edge_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edge_meta" }
        }
      val setFaceMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_face_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_face_meta" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val setVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex" }
        }
      val setVertexBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_bones" }
        }
      val setVertexColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_color" }
        }
      val setVertexMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_meta" }
        }
      val setVertexNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_normal" }
        }
      val setVertexTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_tangent" }
        }
      val setVertexUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_uv" }
        }
      val setVertexUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_uv2" }
        }
      val setVertexWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_weights" }
        }}
  }
}
