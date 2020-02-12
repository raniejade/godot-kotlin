// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolColorArray
import godot.core.PoolFloatArray
import godot.core.PoolIntArray
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

open class SurfaceTool(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addBones(bones: PoolIntArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addBones.call(self._handle, listOf(bones), null)
    }
  }

  fun addColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addColor.call(self._handle, listOf(color), null)
    }
  }

  fun addIndex(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addIndex.call(self._handle, listOf(index), null)
    }
  }

  fun addNormal(normal: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addNormal.call(self._handle, listOf(normal), null)
    }
  }

  fun addSmoothGroup(smooth: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addSmoothGroup.call(self._handle, listOf(smooth), null)
    }
  }

  fun addTangent(tangent: Plane) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addTangent.call(self._handle, listOf(tangent), null)
    }
  }

  fun addTriangleFan(
    vertices: PoolVector3Array,
    uvs: PoolVector2Array,
    colors: PoolColorArray,
    uv2s: PoolVector2Array,
    normals: PoolVector3Array,
    tangents: VariantArray
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(vertices)
      _args.add(uvs)
      _args.add(colors)
      _args.add(uv2s)
      _args.add(normals)
      _args.add(tangents)
      __method_bind.addTriangleFan.call(self._handle, _args, null)
    }
  }

  fun addUv(uv: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addUv.call(self._handle, listOf(uv), null)
    }
  }

  fun addUv2(uv2: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addUv2.call(self._handle, listOf(uv2), null)
    }
  }

  fun addVertex(vertex: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addVertex.call(self._handle, listOf(vertex), null)
    }
  }

  fun addWeights(weights: PoolFloatArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addWeights.call(self._handle, listOf(weights), null)
    }
  }

  fun appendFrom(
    existing: Mesh,
    surface: Int,
    transform: Transform
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(existing)
      _args.add(surface)
      _args.add(transform)
      __method_bind.appendFrom.call(self._handle, _args, null)
    }
  }

  fun begin(primitive: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.begin.call(self._handle, listOf(primitive), null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun commit(existing: ArrayMesh, flags: Int = 97280): ArrayMesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ArrayMesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(existing)
      _args.add(flags)
      __method_bind.commit.call(self._handle, _args, _retPtr)
      _ret = objectToType<ArrayMesh>(_tmp.value!!)
      _ret
    }
  }

  fun commitToArrays(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.commitToArrays.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun createFrom(existing: Mesh, surface: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(existing)
      _args.add(surface)
      __method_bind.createFrom.call(self._handle, _args, null)
    }
  }

  fun createFromBlendShape(
    existing: Mesh,
    surface: Int,
    blendShape: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(existing)
      _args.add(surface)
      _args.add(blendShape)
      __method_bind.createFromBlendShape.call(self._handle, _args, null)
    }
  }

  fun deindex() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.deindex.call(self._handle, emptyList(), null)
    }
  }

  fun generateNormals(flip: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.generateNormals.call(self._handle, listOf(flip), null)
    }
  }

  fun generateTangents() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.generateTangents.call(self._handle, emptyList(), null)
    }
  }

  fun index() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.index.call(self._handle, emptyList(), null)
    }
  }

  fun setMaterial(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaterial.call(self._handle, listOf(material), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SurfaceTool".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SurfaceTool" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SurfaceTool
     */
    private object __method_bind {
      val addBones: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bones" }
        }
      val addColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color" }
        }
      val addIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_index" }
        }
      val addNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_normal" }
        }
      val addSmoothGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_smooth_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_smooth_group" }
        }
      val addTangent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_tangent" }
        }
      val addTriangleFan: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_triangle_fan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_triangle_fan" }
        }
      val addUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_uv" }
        }
      val addUv2: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_uv2" }
        }
      val addVertex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_vertex" }
        }
      val addWeights: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "add_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_weights" }
        }
      val appendFrom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "append_from".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method append_from" }
        }
      val begin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method begin" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val commit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "commit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit" }
        }
      val commitToArrays: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "commit_to_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method commit_to_arrays" }
        }
      val createFrom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "create_from".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from" }
        }
      val createFromBlendShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "create_from_blend_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_blend_shape" }
        }
      val deindex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "deindex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deindex" }
        }
      val generateNormals: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "generate_normals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_normals" }
        }
      val generateTangents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "generate_tangents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_tangents" }
        }
      val index: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method index" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SurfaceTool".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }}
  }
}
