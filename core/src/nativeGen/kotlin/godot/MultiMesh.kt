// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.PoolFloatArray
import godot.core.Transform
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
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

open class MultiMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var colorFormat: ColorFormat
    get() {
       return getColorFormat() 
    }
    set(value) {
      setColorFormat(value.value)
    }

  var customDataFormat: CustomDataFormat
    get() {
       return getCustomDataFormat() 
    }
    set(value) {
      setCustomDataFormat(value.value)
    }

  var instanceCount: Int
    get() {
       return getInstanceCount() 
    }
    set(value) {
      setInstanceCount(value)
    }

  var mesh: Mesh
    get() {
       return getMesh() 
    }
    set(value) {
      setMesh(value)
    }

  var transformFormat: TransformFormat
    get() {
       return getTransformFormat() 
    }
    set(value) {
      setTransformFormat(value.value)
    }

  var visibleInstanceCount: Int
    get() {
       return getVisibleInstanceCount() 
    }
    set(value) {
      setVisibleInstanceCount(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
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

  fun getColorFormat(): ColorFormat {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColorFormat.call(self._handle, emptyList(), _retPtr)
      MultiMesh.ColorFormat.from(_ret.value)
    }
  }

  fun getCustomDataFormat(): CustomDataFormat {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCustomDataFormat.call(self._handle, emptyList(), _retPtr)
      MultiMesh.CustomDataFormat.from(_ret.value)
    }
  }

  fun getInstanceColor(instance: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getInstanceColor.call(self._handle, listOf(instance), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInstanceCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInstanceCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInstanceCustomData(instance: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getInstanceCustomData.call(self._handle, listOf(instance), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInstanceTransform(instance: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getInstanceTransform.call(self._handle, listOf(instance), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInstanceTransform2d(instance: Int): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getInstanceTransform2d.call(self._handle, listOf(instance), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMesh(): Mesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Mesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Mesh>(_tmp.value!!)
      _ret
    }
  }

  fun getTransformFormat(): TransformFormat {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTransformFormat.call(self._handle, emptyList(), _retPtr)
      MultiMesh.TransformFormat.from(_ret.value)
    }
  }

  fun getVisibleInstanceCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVisibleInstanceCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAsBulkArray(array: PoolFloatArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsBulkArray.call(self._handle, listOf(array), null)
    }
  }

  fun setColorFormat(format: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColorFormat.call(self._handle, listOf(format), null)
    }
  }

  fun setCustomDataFormat(format: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomDataFormat.call(self._handle, listOf(format), null)
    }
  }

  fun setInstanceColor(instance: Int, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(instance)
      _args.add(color)
      __method_bind.setInstanceColor.call(self._handle, _args, null)
    }
  }

  fun setInstanceCount(count: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInstanceCount.call(self._handle, listOf(count), null)
    }
  }

  fun setInstanceCustomData(instance: Int, customData: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(instance)
      _args.add(customData)
      __method_bind.setInstanceCustomData.call(self._handle, _args, null)
    }
  }

  fun setInstanceTransform(instance: Int, transform: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(instance)
      _args.add(transform)
      __method_bind.setInstanceTransform.call(self._handle, _args, null)
    }
  }

  fun setInstanceTransform2d(instance: Int, transform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(instance)
      _args.add(transform)
      __method_bind.setInstanceTransform2d.call(self._handle, _args, null)
    }
  }

  fun setMesh(mesh: Mesh) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMesh.call(self._handle, listOf(mesh), null)
    }
  }

  fun setTransformFormat(format: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransformFormat.call(self._handle, listOf(format), null)
    }
  }

  fun setVisibleInstanceCount(count: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisibleInstanceCount.call(self._handle, listOf(count), null)
    }
  }

  enum class TransformFormat(
    val value: Int
  ) {
    `2D`(0),

    `3D`(1);

    companion object {
      fun from(value: Int): TransformFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CustomDataFormat(
    val value: Int
  ) {
    NONE(0),

    `8BIT`(1),

    FLOAT(2);

    companion object {
      fun from(value: Int): CustomDataFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ColorFormat(
    val value: Int
  ) {
    NONE(0),

    `8BIT`(1),

    FLOAT(2);

    companion object {
      fun from(value: Int): ColorFormat {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MultiMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for MultiMesh
     */
    private object __method_bind {
      val getAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val getColorFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_color_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_format" }
        }
      val getCustomDataFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_custom_data_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_data_format" }
        }
      val getInstanceColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_color" }
        }
      val getInstanceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_count" }
        }
      val getInstanceCustomData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_custom_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_custom_data" }
        }
      val getInstanceTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_transform" }
        }
      val getInstanceTransform2d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_transform_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_transform_2d" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val getTransformFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_transform_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform_format" }
        }
      val getVisibleInstanceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_visible_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_instance_count" }
        }
      val setAsBulkArray: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_as_bulk_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_bulk_array" }
        }
      val setColorFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_color_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_format" }
        }
      val setCustomDataFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_custom_data_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_data_format" }
        }
      val setInstanceColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_color" }
        }
      val setInstanceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_count" }
        }
      val setInstanceCustomData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_custom_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_custom_data" }
        }
      val setInstanceTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_transform" }
        }
      val setInstanceTransform2d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_transform_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_transform_2d" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh" }
        }
      val setTransformFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_transform_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform_format" }
        }
      val setVisibleInstanceCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_visible_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible_instance_count" }
        }}
  }
}
