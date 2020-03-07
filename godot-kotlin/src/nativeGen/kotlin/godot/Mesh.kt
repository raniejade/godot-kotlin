// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class Mesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var lightmapSizeHint: Vector2
    get() {
       return getLightmapSizeHint() 
    }
    set(value) {
      setLightmapSizeHint(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for lightmapSizeHint
   */
  fun lightmapSizeHint(cb: Vector2.() -> Unit) {
    val _p = lightmapSizeHint
    cb(_p)
    lightmapSizeHint = _p
  }

  fun createConvexShape(): Shape {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.createConvexShape.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Shape>(_tmp.value!!)
      _ret
    }
  }

  fun createOutline(margin: Float): Mesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Mesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.createOutline.call(self._handle, listOf(margin), _retPtr)
      _ret = objectToType<Mesh>(_tmp.value!!)
      _ret
    }
  }

  fun createTrimeshShape(): Shape {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.createTrimeshShape.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Shape>(_tmp.value!!)
      _ret
    }
  }

  fun generateTriangleMesh(): TriangleMesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TriangleMesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.generateTriangleMesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TriangleMesh>(_tmp.value!!)
      _ret
    }
  }

  fun getAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getAabb.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFaces(): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getFaces.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLightmapSizeHint(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getLightmapSizeHint.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSurfaceCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSurfaceCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setLightmapSizeHint(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLightmapSizeHint.call(self._handle, listOf(size), null)
    }
  }

  fun surfaceGetArrays(surfIdx: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.surfaceGetArrays.call(self._handle, listOf(surfIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun surfaceGetBlendShapeArrays(surfIdx: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.surfaceGetBlendShapeArrays.call(self._handle, listOf(surfIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun surfaceGetMaterial(surfIdx: Int): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.surfaceGetMaterial.call(self._handle, listOf(surfIdx), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun surfaceSetMaterial(surfIdx: Int, material: Material) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(surfIdx)
      _args.add(material)
      __method_bind.surfaceSetMaterial.call(self._handle, _args, null)
    }
  }

  enum class BlendShapeMode(
    val value: Int
  ) {
    NORMALIZED(0),

    RELATIVE(1);

    companion object {
      fun from(value: Int): BlendShapeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class PrimitiveType(
    val value: Int
  ) {
    POINTS(0),

    LINES(1),

    LINE_STRIP(2),

    LINE_LOOP(3),

    TRIANGLES(4),

    TRIANGLE_STRIP(5),

    TRIANGLE_FAN(6);

    companion object {
      fun from(value: Int): PrimitiveType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ArrayFormat(
    val value: Int
  ) {
    VERTEX(1),

    NORMAL(2),

    TANGENT(4),

    COLOR(8),

    COMPRESS_BASE(9),

    TEX_UV(16),

    TEX_UV2(32),

    BONES(64),

    WEIGHTS(128),

    INDEX(256),

    COMPRESS_VERTEX(512),

    COMPRESS_NORMAL(1024),

    COMPRESS_TANGENT(2048),

    COMPRESS_COLOR(4096),

    COMPRESS_TEX_UV(8192),

    COMPRESS_TEX_UV2(16384),

    COMPRESS_BONES(32768),

    COMPRESS_WEIGHTS(65536),

    COMPRESS_DEFAULT(97280),

    COMPRESS_INDEX(131072),

    FLAG_USE_2D_VERTICES(262144),

    FLAG_USE_16_BIT_BONES(524288);

    companion object {
      fun from(value: Int): ArrayFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ArrayType(
    val value: Int
  ) {
    VERTEX(0),

    NORMAL(1),

    TANGENT(2),

    COLOR(3),

    TEX_UV(4),

    TEX_UV2(5),

    BONES(6),

    WEIGHTS(7),

    INDEX(8),

    MAX(9);

    companion object {
      fun from(value: Int): ArrayType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Mesh
     */
    private object __method_bind {
      val createConvexShape: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "create_convex_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_convex_shape" }
            }
          }

      val createOutline: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "create_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_outline" }
            }
          }

      val createTrimeshShape: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "create_trimesh_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_trimesh_shape" }
            }
          }

      val generateTriangleMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "generate_triangle_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_triangle_mesh" }
            }
          }

      val getAabb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "get_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_aabb" }
            }
          }

      val getFaces: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "get_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_faces" }
            }
          }

      val getLightmapSizeHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "get_lightmap_size_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lightmap_size_hint" }
            }
          }

      val getSurfaceCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "get_surface_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_surface_count" }
            }
          }

      val setLightmapSizeHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "set_lightmap_size_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lightmap_size_hint" }
            }
          }

      val surfaceGetArrays: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "surface_get_arrays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_arrays" }
            }
          }

      val surfaceGetBlendShapeArrays: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "surface_get_blend_shape_arrays".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_blend_shape_arrays"
              }
            }
          }

      val surfaceGetMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "surface_get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_get_material" }
            }
          }

      val surfaceSetMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
              "surface_set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method surface_set_material" }
            }
          }
    }
  }
}
