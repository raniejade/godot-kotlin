// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
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
    val _ret = __method_bind.createConvexShape.call(this._handle)
    return _ret.asObject(::Shape)!!
  }

  fun createOutline(margin: Float): Mesh {
    val _arg = Variant(margin)
    val _ret = __method_bind.createOutline.call(this._handle, listOf(_arg))
    return _ret.asObject(::Mesh)!!
  }

  fun createTrimeshShape(): Shape {
    val _ret = __method_bind.createTrimeshShape.call(this._handle)
    return _ret.asObject(::Shape)!!
  }

  fun generateTriangleMesh(): TriangleMesh {
    val _ret = __method_bind.generateTriangleMesh.call(this._handle)
    return _ret.asObject(::TriangleMesh)!!
  }

  fun getAabb(): AABB {
    val _ret = __method_bind.getAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun getFaces(): PoolVector3Array {
    val _ret = __method_bind.getFaces.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getLightmapSizeHint(): Vector2 {
    val _ret = __method_bind.getLightmapSizeHint.call(this._handle)
    return _ret.asVector2()
  }

  fun getSurfaceCount(): Int {
    val _ret = __method_bind.getSurfaceCount.call(this._handle)
    return _ret.asInt()
  }

  fun setLightmapSizeHint(size: Vector2) {
    val _arg = Variant(size)
    __method_bind.setLightmapSizeHint.call(this._handle, listOf(_arg))
  }

  fun surfaceGetArrays(surfIdx: Int): VariantArray {
    val _arg = Variant(surfIdx)
    val _ret = __method_bind.surfaceGetArrays.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun surfaceGetBlendShapeArrays(surfIdx: Int): VariantArray {
    val _arg = Variant(surfIdx)
    val _ret = __method_bind.surfaceGetBlendShapeArrays.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun surfaceGetMaterial(surfIdx: Int): Material {
    val _arg = Variant(surfIdx)
    val _ret = __method_bind.surfaceGetMaterial.call(this._handle, listOf(_arg))
    return _ret.asObject(::Material)!!
  }

  fun surfaceSetMaterial(surfIdx: Int, material: Material) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(surfIdx))
    _args.add(Variant.fromAny(material))
    __method_bind.surfaceSetMaterial.call(this._handle, _args)
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
      val createConvexShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "create_convex_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_convex_shape" }
        }
      val createOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "create_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_outline" }
        }
      val createTrimeshShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "create_trimesh_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_trimesh_shape" }
        }
      val generateTriangleMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "generate_triangle_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_triangle_mesh" }
        }
      val getAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val getFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_faces" }
        }
      val getLightmapSizeHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_lightmap_size_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lightmap_size_hint" }
        }
      val getSurfaceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "get_surface_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surface_count" }
        }
      val setLightmapSizeHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "set_lightmap_size_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lightmap_size_hint" }
        }
      val surfaceGetArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_get_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_arrays" }
        }
      val surfaceGetBlendShapeArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_get_blend_shape_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_blend_shape_arrays" }
        }
      val surfaceGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_material" }
        }
      val surfaceSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Mesh".cstr.ptr,
            "surface_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_set_material" }
        }}
  }
}
