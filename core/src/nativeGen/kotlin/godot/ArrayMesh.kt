// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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

open class ArrayMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Mesh(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      __method_bind.addBlendShape.call(self._handle, listOf(name), null)
    }
  }

  fun addSurfaceFromArrays(
    primitive: Int,
    arrays: VariantArray,
    blendShapes: VariantArray,
    compressFlags: Int = 97280
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(primitive)
      _args.add(arrays)
      _args.add(blendShapes)
      _args.add(compressFlags)
      __method_bind.addSurfaceFromArrays.call(self._handle, _args, null)
    }
  }

  fun clearBlendShapes() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearBlendShapes.call(self._handle, emptyList(), null)
    }
  }

  fun getBlendShapeCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBlendShapeCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBlendShapeMode(): Mesh.BlendShapeMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBlendShapeMode.call(self._handle, emptyList(), _retPtr)
      Mesh.BlendShapeMode.from(_ret.value)
    }
  }

  fun getBlendShapeName(index: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBlendShapeName.call(self._handle, listOf(index), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCustomAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getCustomAabb.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun lightmapUnwrap(transform: Transform, texelSize: Float): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(transform)
      _args.add(texelSize)
      __method_bind.lightmapUnwrap.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun regenNormalmaps() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.regenNormalmaps.call(self._handle, emptyList(), null)
    }
  }

  fun setBlendShapeMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBlendShapeMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setCustomAabb(aabb: AABB) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomAabb.call(self._handle, listOf(aabb), null)
    }
  }

  fun surfaceFindByName(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.surfaceFindByName.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun surfaceGetArrayIndexLen(surfIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.surfaceGetArrayIndexLen.call(self._handle, listOf(surfIdx), _retPtr)
      _ret.value
    }
  }

  fun surfaceGetArrayLen(surfIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.surfaceGetArrayLen.call(self._handle, listOf(surfIdx), _retPtr)
      _ret.value
    }
  }

  fun surfaceGetFormat(surfIdx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.surfaceGetFormat.call(self._handle, listOf(surfIdx), _retPtr)
      _ret.value
    }
  }

  fun surfaceGetName(surfIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.surfaceGetName.call(self._handle, listOf(surfIdx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun surfaceGetPrimitiveType(surfIdx: Int): Mesh.PrimitiveType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.surfaceGetPrimitiveType.call(self._handle, listOf(surfIdx), _retPtr)
      Mesh.PrimitiveType.from(_ret.value)
    }
  }

  fun surfaceRemove(surfIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.surfaceRemove.call(self._handle, listOf(surfIdx), null)
    }
  }

  fun surfaceSetName(surfIdx: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(surfIdx)
      _args.add(name)
      __method_bind.surfaceSetName.call(self._handle, _args, null)
    }
  }

  fun surfaceUpdateRegion(
    surfIdx: Int,
    offset: Int,
    data: PoolByteArray
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(surfIdx)
      _args.add(offset)
      _args.add(data)
      __method_bind.surfaceUpdateRegion.call(self._handle, _args, null)
    }
  }

  enum class ArrayFormat(
    val value: Int
  ) {
    VERTEX(1),

    NORMAL(2),

    TANGENT(4),

    COLOR(8),

    TEX_UV(16),

    TEX_UV2(32),

    BONES(64),

    WEIGHTS(128),

    INDEX(256);

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
    val ARRAY_WEIGHTS_SIZE: Int = 4

    val NO_INDEX_ARRAY: Int = -1

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ArrayMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ArrayMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ArrayMesh
     */
    private object __method_bind {
      val addBlendShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "add_blend_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_blend_shape" }
        }
      val addSurfaceFromArrays: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "add_surface_from_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_surface_from_arrays" }
        }
      val clearBlendShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "clear_blend_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_blend_shapes" }
        }
      val getBlendShapeCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_blend_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_shape_count" }
        }
      val getBlendShapeMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_blend_shape_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_shape_mode" }
        }
      val getBlendShapeName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_blend_shape_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_shape_name" }
        }
      val getCustomAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "get_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_aabb" }
        }
      val lightmapUnwrap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "lightmap_unwrap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_unwrap" }
        }
      val regenNormalmaps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "regen_normalmaps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method regen_normalmaps" }
        }
      val setBlendShapeMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "set_blend_shape_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_shape_mode" }
        }
      val setCustomAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
        }
      val surfaceFindByName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_find_by_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_find_by_name" }
        }
      val surfaceGetArrayIndexLen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_array_index_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_array_index_len" }
        }
      val surfaceGetArrayLen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_array_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_array_len" }
        }
      val surfaceGetFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_format" }
        }
      val surfaceGetName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_name" }
        }
      val surfaceGetPrimitiveType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_get_primitive_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_get_primitive_type" }
        }
      val surfaceRemove: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_remove" }
        }
      val surfaceSetName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_set_name" }
        }
      val surfaceUpdateRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ArrayMesh".cstr.ptr,
            "surface_update_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method surface_update_region" }
        }}
  }
}
