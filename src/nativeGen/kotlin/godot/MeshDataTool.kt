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

open class MeshDataTool(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun commitToSurface(mesh: ArrayMesh): GDError {
    val _arg = Variant.new(mesh)
    val _ret = __method_bind.commitToSurface.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun createFromSurface(mesh: ArrayMesh, surface: Int): GDError {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.createFromSurface.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun getEdgeCount(): Int {
    val _ret = __method_bind.getEdgeCount.call(this._handle)
    return _ret.asInt()
  }

  fun getEdgeFaces(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getEdgeFaces.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getEdgeMeta(idx: Int): Variant {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getEdgeMeta.call(this._handle, _arg, 1)
    return _ret
  }

  fun getEdgeVertex(idx: Int, vertex: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(vertex)
    val _ret = __method_bind.getEdgeVertex.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getFaceCount(): Int {
    val _ret = __method_bind.getFaceCount.call(this._handle)
    return _ret.asInt()
  }

  fun getFaceEdge(idx: Int, edge: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(edge)
    val _ret = __method_bind.getFaceEdge.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getFaceMeta(idx: Int): Variant {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFaceMeta.call(this._handle, _arg, 1)
    return _ret
  }

  fun getFaceNormal(idx: Int): Vector3 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getFaceNormal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getFaceVertex(idx: Int, vertex: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(vertex)
    val _ret = __method_bind.getFaceVertex.call(this._handle, _args.toVariant(), 2)
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
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertex.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getVertexBones(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexBones.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getVertexColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getVertexCount(): Int {
    val _ret = __method_bind.getVertexCount.call(this._handle)
    return _ret.asInt()
  }

  fun getVertexEdges(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexEdges.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getVertexFaces(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexFaces.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getVertexMeta(idx: Int): Variant {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexMeta.call(this._handle, _arg, 1)
    return _ret
  }

  fun getVertexNormal(idx: Int): Vector3 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexNormal.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun getVertexTangent(idx: Int): Plane {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexTangent.call(this._handle, _arg, 1)
    return _ret.asPlane()
  }

  fun getVertexUv(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexUv.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getVertexUv2(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexUv2.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getVertexWeights(idx: Int): PoolRealArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getVertexWeights.call(this._handle, _arg, 1)
    return _ret.asPoolRealArray()
  }

  fun setEdgeMeta(idx: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(meta)
    __method_bind.setEdgeMeta.call(this._handle, _args.toVariant(), 2)
  }

  fun setFaceMeta(idx: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(meta)
    __method_bind.setFaceMeta.call(this._handle, _args.toVariant(), 2)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  fun setVertex(idx: Int, vertex: Vector3) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(vertex)
    __method_bind.setVertex.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexBones(idx: Int, bones: PoolIntArray) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(bones)
    __method_bind.setVertexBones.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexColor(idx: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(color)
    __method_bind.setVertexColor.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexMeta(idx: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(meta)
    __method_bind.setVertexMeta.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexNormal(idx: Int, normal: Vector3) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(normal)
    __method_bind.setVertexNormal.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexTangent(idx: Int, tangent: Plane) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(tangent)
    __method_bind.setVertexTangent.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexUv(idx: Int, uv: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(uv)
    __method_bind.setVertexUv.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexUv2(idx: Int, uv2: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(uv2)
    __method_bind.setVertexUv2.call(this._handle, _args.toVariant(), 2)
  }

  fun setVertexWeights(idx: Int, weights: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(weights)
    __method_bind.setVertexWeights.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): MeshDataTool = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MeshDataTool".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MeshDataTool" }
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
            "commitToSurface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commitToSurface" }
        }
      val createFromSurface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "createFromSurface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createFromSurface" }
        }
      val getEdgeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getEdgeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEdgeCount" }
        }
      val getEdgeFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getEdgeFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEdgeFaces" }
        }
      val getEdgeMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getEdgeMeta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEdgeMeta" }
        }
      val getEdgeVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getEdgeVertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEdgeVertex" }
        }
      val getFaceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getFaceCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFaceCount" }
        }
      val getFaceEdge: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getFaceEdge".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFaceEdge" }
        }
      val getFaceMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getFaceMeta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFaceMeta" }
        }
      val getFaceNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getFaceNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFaceNormal" }
        }
      val getFaceVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getFaceVertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFaceVertex" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getFormat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFormat" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertex" }
        }
      val getVertexBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexBones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexBones" }
        }
      val getVertexColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexColor" }
        }
      val getVertexCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexCount" }
        }
      val getVertexEdges: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexEdges".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexEdges" }
        }
      val getVertexFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexFaces" }
        }
      val getVertexMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexMeta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexMeta" }
        }
      val getVertexNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexNormal" }
        }
      val getVertexTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexTangent" }
        }
      val getVertexUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexUv" }
        }
      val getVertexUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexUv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexUv2" }
        }
      val getVertexWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "getVertexWeights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexWeights" }
        }
      val setEdgeMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setEdgeMeta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEdgeMeta" }
        }
      val setFaceMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setFaceMeta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFaceMeta" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }
      val setVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertex" }
        }
      val setVertexBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexBones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexBones" }
        }
      val setVertexColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexColor" }
        }
      val setVertexMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexMeta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexMeta" }
        }
      val setVertexNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexNormal" }
        }
      val setVertexTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexTangent" }
        }
      val setVertexUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexUv" }
        }
      val setVertexUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexUv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexUv2" }
        }
      val setVertexWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "setVertexWeights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexWeights" }
        }}
  }
}
