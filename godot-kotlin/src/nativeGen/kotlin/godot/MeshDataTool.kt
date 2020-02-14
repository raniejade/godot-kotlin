// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.GDError
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolFloatArray
import godot.core.PoolIntArray
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class MeshDataTool(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun commitToSurface(mesh: ArrayMesh): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.commitToSurface.call(self._handle, listOf(mesh), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun createFromSurface(mesh: ArrayMesh, surface: Int): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(mesh)
      _args.add(surface)
      __method_bind.createFromSurface.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getEdgeCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEdgeCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getEdgeFaces(idx: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getEdgeFaces.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEdgeMeta(idx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getEdgeMeta.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getEdgeVertex(idx: Int, vertex: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(vertex)
      __method_bind.getEdgeVertex.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getFaceCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFaceCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFaceEdge(idx: Int, edge: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(edge)
      __method_bind.getFaceEdge.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getFaceMeta(idx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getFaceMeta.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFaceNormal(idx: Int): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getFaceNormal.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFaceVertex(idx: Int, vertex: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(vertex)
      __method_bind.getFaceVertex.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getFormat(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFormat.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaterial(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMaterial.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getVertex(idx: Int): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertex.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexBones(idx: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexBones.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexColor(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexColor.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVertexCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVertexEdges(idx: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexEdges.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexFaces(idx: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexFaces.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexMeta(idx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexMeta.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexNormal(idx: Int): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexNormal.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexTangent(idx: Int): Plane {
    val self = this
    return Allocator.allocationScope {
      val _ret = Plane()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexTangent.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexUv(idx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexUv.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexUv2(idx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexUv2.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexWeights(idx: Int): PoolFloatArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolFloatArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexWeights.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setEdgeMeta(idx: Int, meta: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(meta)
      __method_bind.setEdgeMeta.call(self._handle, _args, null)
    }
  }

  fun setFaceMeta(idx: Int, meta: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(meta)
      __method_bind.setFaceMeta.call(self._handle, _args, null)
    }
  }

  fun setMaterial(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaterial.call(self._handle, listOf(material), null)
    }
  }

  fun setVertex(idx: Int, vertex: Vector3) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(vertex)
      __method_bind.setVertex.call(self._handle, _args, null)
    }
  }

  fun setVertexBones(idx: Int, bones: PoolIntArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(bones)
      __method_bind.setVertexBones.call(self._handle, _args, null)
    }
  }

  fun setVertexColor(idx: Int, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(color)
      __method_bind.setVertexColor.call(self._handle, _args, null)
    }
  }

  fun setVertexMeta(idx: Int, meta: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(meta)
      __method_bind.setVertexMeta.call(self._handle, _args, null)
    }
  }

  fun setVertexNormal(idx: Int, normal: Vector3) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(normal)
      __method_bind.setVertexNormal.call(self._handle, _args, null)
    }
  }

  fun setVertexTangent(idx: Int, tangent: Plane) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(tangent)
      __method_bind.setVertexTangent.call(self._handle, _args, null)
    }
  }

  fun setVertexUv(idx: Int, uv: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(uv)
      __method_bind.setVertexUv.call(self._handle, _args, null)
    }
  }

  fun setVertexUv2(idx: Int, uv2: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(uv2)
      __method_bind.setVertexUv2.call(self._handle, _args, null)
    }
  }

  fun setVertexWeights(idx: Int, weights: PoolFloatArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(weights)
      __method_bind.setVertexWeights.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val commitToSurface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "commit_to_surface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit_to_surface" }
        }
      val createFromSurface: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "create_from_surface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_surface" }
        }
      val getEdgeCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_count" }
        }
      val getEdgeFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_faces" }
        }
      val getEdgeMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_meta" }
        }
      val getEdgeVertex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_edge_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edge_vertex" }
        }
      val getFaceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_count" }
        }
      val getFaceEdge: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_edge".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_edge" }
        }
      val getFaceMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_meta" }
        }
      val getFaceNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_normal" }
        }
      val getFaceVertex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_face_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_face_vertex" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val getVertex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex" }
        }
      val getVertexBones: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_bones" }
        }
      val getVertexColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_color" }
        }
      val getVertexCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_count" }
        }
      val getVertexEdges: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_edges".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_edges" }
        }
      val getVertexFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_faces" }
        }
      val getVertexMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_meta" }
        }
      val getVertexNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_normal" }
        }
      val getVertexTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_tangent" }
        }
      val getVertexUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_uv" }
        }
      val getVertexUv2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_uv2" }
        }
      val getVertexWeights: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "get_vertex_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_weights" }
        }
      val setEdgeMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_edge_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edge_meta" }
        }
      val setFaceMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_face_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_face_meta" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val setVertex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex" }
        }
      val setVertexBones: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_bones" }
        }
      val setVertexColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_color" }
        }
      val setVertexMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_meta" }
        }
      val setVertexNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_normal" }
        }
      val setVertexTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_tangent" }
        }
      val setVertexUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_uv" }
        }
      val setVertexUv2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_uv2" }
        }
      val setVertexWeights: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MeshDataTool".cstr.ptr,
            "set_vertex_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_weights" }
        }}
  }
}
