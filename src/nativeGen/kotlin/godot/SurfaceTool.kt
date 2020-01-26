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

open class SurfaceTool internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addBones(bones: PoolIntArray) {
    TODO()
  }

  fun addColor(color: Color) {
    TODO()
  }

  fun addIndex(index: Int) {
    TODO()
  }

  fun addNormal(normal: Vector3) {
    TODO()
  }

  fun addSmoothGroup(smooth: Boolean) {
    TODO()
  }

  fun addTangent(tangent: Plane) {
    TODO()
  }

  fun addTriangleFan(
    vertices: PoolVector3Array,
    uvs: PoolVector2Array,
    colors: PoolColorArray,
    uv2s: PoolVector2Array,
    normals: PoolVector3Array,
    tangents: VariantArray
  ) {
    TODO()
  }

  fun addUv(uv: Vector2) {
    TODO()
  }

  fun addUv2(uv2: Vector2) {
    TODO()
  }

  fun addVertex(vertex: Vector3) {
    TODO()
  }

  fun addWeights(weights: PoolRealArray) {
    TODO()
  }

  fun appendFrom(
    existing: Mesh,
    surface: Int,
    transform: Transform
  ) {
    TODO()
  }

  fun begin(primitive: Int) {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun commit(existing: ArrayMesh, flags: Int): ArrayMesh {
    TODO()
  }

  fun commitToArrays(): VariantArray {
    TODO()
  }

  fun createFrom(existing: Mesh, surface: Int) {
    TODO()
  }

  fun createFromBlendShape(
    existing: Mesh,
    surface: Int,
    blend_shape: String
  ) {
    TODO()
  }

  fun deindex() {
    TODO()
  }

  fun generateNormals(flip: Boolean) {
    TODO()
  }

  fun generateTangents() {
    TODO()
  }

  fun index() {
    TODO()
  }

  fun setMaterial(material: Material) {
    TODO()
  }

  companion object {
    fun new(): SurfaceTool = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SurfaceTool".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SurfaceTool" }
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
      val add_bones: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_bones".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bones" }
            }
          }

      val add_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_color" }
            }
          }

      val add_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_index" }
            }
          }

      val add_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_normal" }
            }
          }

      val add_smooth_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_smooth_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_smooth_group" }
            }
          }

      val add_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_tangent" }
            }
          }

      val add_triangle_fan: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_triangle_fan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_triangle_fan" }
            }
          }

      val add_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_uv" }
            }
          }

      val add_uv2: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_uv2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_uv2" }
            }
          }

      val add_vertex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_vertex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_vertex" }
            }
          }

      val add_weights: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "add_weights".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_weights" }
            }
          }

      val append_from: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "append_from".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method append_from" }
            }
          }

      val begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method begin" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val commit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "commit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method commit" }
            }
          }

      val commit_to_arrays: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "commit_to_arrays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method commit_to_arrays" }
            }
          }

      val create_from: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "create_from".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from" }
            }
          }

      val create_from_blend_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "create_from_blend_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_blend_shape" }
            }
          }

      val deindex: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "deindex".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deindex" }
            }
          }

      val generate_normals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "generate_normals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_normals" }
            }
          }

      val generate_tangents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "generate_tangents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_tangents" }
            }
          }

      val index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method index" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }
    }
  }
}
