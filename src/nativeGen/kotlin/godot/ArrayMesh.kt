// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ArrayMesh(
  _handle: COpaquePointer
) : Mesh(_handle) {
  var blendShapeMode: Mesh.BlendShapeMode
    get() {
       return getBlendShapeMode() 
    }
    set(value) {
      setBlendShapeMode(value.value)
    }

  var customAabb: AABB
    get() {
       return getCustomAabb() 
    }
    set(value) {
      setCustomAabb(value)
    }

  /**
   * Specialized setter for customAabb
   */
  fun customAabb(cb: AABB.() -> Unit) {
    val _p = customAabb
    cb(_p)
    customAabb = _p
  }

  fun addBlendShape(name: String) {
    val _arg = Variant.new(name)
    __method_bind.addBlendShape.call(this._handle, _arg, 1)
  }

  fun addSurfaceFromArrays(
    primitive: Int,
    arrays: VariantArray,
    blendShapes: VariantArray,
    compressFlags: Int = 97280
  ) {
    val _args = VariantArray.new()
    _args.append(primitive)
    _args.append(arrays)
    _args.append(blendShapes)
    _args.append(compressFlags)
    __method_bind.addSurfaceFromArrays.call(this._handle, _args.toVariant(), 4)
  }

  fun clearBlendShapes() {
    __method_bind.clearBlendShapes.call(this._handle)
  }

  fun getBlendShapeCount(): Int {
    val _ret = __method_bind.getBlendShapeCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBlendShapeMode(): Mesh.BlendShapeMode {
    val _ret = __method_bind.getBlendShapeMode.call(this._handle)
    return Mesh.BlendShapeMode.from(_ret.asInt())
  }

  fun getBlendShapeName(index: Int): String {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getBlendShapeName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getCustomAabb(): AABB {
    val _ret = __method_bind.getCustomAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun lightmapUnwrap(transform: Transform, texelSize: Float): GDError {
    val _args = VariantArray.new()
    _args.append(transform)
    _args.append(texelSize)
    val _ret = __method_bind.lightmapUnwrap.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun regenNormalmaps() {
    __method_bind.regenNormalmaps.call(this._handle)
  }

  fun setBlendShapeMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBlendShapeMode.call(this._handle, _arg, 1)
  }

  fun setCustomAabb(aabb: AABB) {
    val _arg = Variant.new(aabb)
    __method_bind.setCustomAabb.call(this._handle, _arg, 1)
  }

  fun surfaceFindByName(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.surfaceFindByName.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun surfaceGetArrayIndexLen(surfIdx: Int): Int {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetArrayIndexLen.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun surfaceGetArrayLen(surfIdx: Int): Int {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetArrayLen.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun surfaceGetFormat(surfIdx: Int): Int {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetFormat.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun surfaceGetName(surfIdx: Int): String {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun surfaceGetPrimitiveType(surfIdx: Int): Mesh.PrimitiveType {
    val _arg = Variant.new(surfIdx)
    val _ret = __method_bind.surfaceGetPrimitiveType.call(this._handle, _arg, 1)
    return Mesh.PrimitiveType.from(_ret.asInt())
  }

  fun surfaceRemove(surfIdx: Int) {
    val _arg = Variant.new(surfIdx)
    __method_bind.surfaceRemove.call(this._handle, _arg, 1)
  }

  fun surfaceSetName(surfIdx: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    _args.append(name)
    __method_bind.surfaceSetName.call(this._handle, _args.toVariant(), 2)
  }

  fun surfaceUpdateRegion(
    surfIdx: Int,
    offset: Int,
    data: PoolByteArray
  ) {
    val _args = VariantArray.new()
    _args.append(surfIdx)
    _args.append(offset)
    _args.append(data)
    __method_bind.surfaceUpdateRegion.call(this._handle, _args.toVariant(), 3)
  }

  enum class ArrayFormat(
    val value: Int
  ) {
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256);

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
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);

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
    val ARRAY_BONES: Int = 6

    val ARRAY_COLOR: Int = 3

    val ARRAY_FORMAT_BONES: Int = 64

    val ARRAY_FORMAT_COLOR: Int = 8

    val ARRAY_FORMAT_INDEX: Int = 256

    val ARRAY_FORMAT_NORMAL: Int = 2

    val ARRAY_FORMAT_TANGENT: Int = 4

    val ARRAY_FORMAT_TEX_UV: Int = 16

    val ARRAY_FORMAT_TEX_UV2: Int = 32

    val ARRAY_FORMAT_VERTEX: Int = 1

    val ARRAY_FORMAT_WEIGHTS: Int = 128

    val ARRAY_INDEX: Int = 8

    val ARRAY_MAX: Int = 9

    val ARRAY_NORMAL: Int = 1

    val ARRAY_TANGENT: Int = 2

    val ARRAY_TEX_UV: Int = 4

    val ARRAY_TEX_UV2: Int = 5

    val ARRAY_VERTEX: Int = 0

    val ARRAY_WEIGHTS: Int = 7

    val ARRAY_WEIGHTS_SIZE: Int = 4

    val NO_INDEX_ARRAY: Int = -1

    fun new(): ArrayMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ArrayMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ArrayMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ArrayMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ArrayMesh = ArrayMesh(ptr)
    /**
     * Container for method_bind pointers for ArrayMesh
     */
    private object __method_bind {
      val addBlendShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "add_blend_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_blend_shape" }
        }
      val addSurfaceFromArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "add_surface_from_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_surface_from_arrays" }
        }
      val clearBlendShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "clear_blend_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_blend_shapes" }
        }
      val getBlendShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_blend_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_shape_count" }
        }
      val getBlendShapeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_blend_shape_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_shape_mode" }
        }
      val getBlendShapeName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_blend_shape_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_shape_name" }
        }
      val getCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_aabb" }
        }
      val lightmapUnwrap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "lightmap_unwrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_unwrap" }
        }
      val regenNormalmaps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "regen_normalmaps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method regen_normalmaps" }
        }
      val setBlendShapeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "set_blend_shape_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_shape_mode" }
        }
      val setCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
        }
      val surfaceFindByName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_find_by_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_find_by_name" }
        }
      val surfaceGetArrayIndexLen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_array_index_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_array_index_len" }
        }
      val surfaceGetArrayLen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_array_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_array_len" }
        }
      val surfaceGetFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_format" }
        }
      val surfaceGetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_name" }
        }
      val surfaceGetPrimitiveType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_primitive_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_primitive_type" }
        }
      val surfaceRemove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_remove" }
        }
      val surfaceSetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_set_name" }
        }
      val surfaceUpdateRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_update_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_update_region" }
        }}
  }
}
