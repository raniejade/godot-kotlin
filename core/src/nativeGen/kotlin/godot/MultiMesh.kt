// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Color
import godot.core.Godot
import godot.core.PoolRealArray
import godot.core.Transform
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
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
    _handle = __new()
  }

  fun getAabb(): AABB {
    val _ret = __method_bind.getAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun getColorFormat(): ColorFormat {
    val _ret = __method_bind.getColorFormat.call(this._handle)
    return MultiMesh.ColorFormat.from(_ret.asInt())
  }

  fun getCustomDataFormat(): CustomDataFormat {
    val _ret = __method_bind.getCustomDataFormat.call(this._handle)
    return MultiMesh.CustomDataFormat.from(_ret.asInt())
  }

  fun getInstanceColor(instance: Int): Color {
    val _arg = Variant(instance)
    val _ret = __method_bind.getInstanceColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getInstanceCount(): Int {
    val _ret = __method_bind.getInstanceCount.call(this._handle)
    return _ret.asInt()
  }

  fun getInstanceCustomData(instance: Int): Color {
    val _arg = Variant(instance)
    val _ret = __method_bind.getInstanceCustomData.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getInstanceTransform(instance: Int): Transform {
    val _arg = Variant(instance)
    val _ret = __method_bind.getInstanceTransform.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun getInstanceTransform2d(instance: Int): Transform2D {
    val _arg = Variant(instance)
    val _ret = __method_bind.getInstanceTransform2d.call(this._handle, listOf(_arg))
    return _ret.asTransform2D()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getTransformFormat(): TransformFormat {
    val _ret = __method_bind.getTransformFormat.call(this._handle)
    return MultiMesh.TransformFormat.from(_ret.asInt())
  }

  fun getVisibleInstanceCount(): Int {
    val _ret = __method_bind.getVisibleInstanceCount.call(this._handle)
    return _ret.asInt()
  }

  fun setAsBulkArray(array: PoolRealArray) {
    val _arg = Variant(array)
    __method_bind.setAsBulkArray.call(this._handle, listOf(_arg))
  }

  fun setColorFormat(format: Int) {
    val _arg = Variant(format)
    __method_bind.setColorFormat.call(this._handle, listOf(_arg))
  }

  fun setCustomDataFormat(format: Int) {
    val _arg = Variant(format)
    __method_bind.setCustomDataFormat.call(this._handle, listOf(_arg))
  }

  fun setInstanceColor(instance: Int, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(color))
    __method_bind.setInstanceColor.call(this._handle, _args)
  }

  fun setInstanceCount(count: Int) {
    val _arg = Variant(count)
    __method_bind.setInstanceCount.call(this._handle, listOf(_arg))
  }

  fun setInstanceCustomData(instance: Int, customData: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(customData))
    __method_bind.setInstanceCustomData.call(this._handle, _args)
  }

  fun setInstanceTransform(instance: Int, transform: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(transform))
    __method_bind.setInstanceTransform.call(this._handle, _args)
  }

  fun setInstanceTransform2d(instance: Int, transform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(transform))
    __method_bind.setInstanceTransform2d.call(this._handle, _args)
  }

  fun setMesh(mesh: Mesh) {
    val _arg = Variant(mesh)
    __method_bind.setMesh.call(this._handle, listOf(_arg))
  }

  fun setTransformFormat(format: Int) {
    val _arg = Variant(format)
    __method_bind.setTransformFormat.call(this._handle, listOf(_arg))
  }

  fun setVisibleInstanceCount(count: Int) {
    val _arg = Variant(count)
    __method_bind.setVisibleInstanceCount.call(this._handle, listOf(_arg))
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
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val getColorFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_color_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_format" }
        }
      val getCustomDataFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_custom_data_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_data_format" }
        }
      val getInstanceColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_color" }
        }
      val getInstanceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_count" }
        }
      val getInstanceCustomData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_custom_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_custom_data" }
        }
      val getInstanceTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_transform" }
        }
      val getInstanceTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_instance_transform_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_transform_2d" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh" }
        }
      val getTransformFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_transform_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform_format" }
        }
      val getVisibleInstanceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "get_visible_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_instance_count" }
        }
      val setAsBulkArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_as_bulk_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_bulk_array" }
        }
      val setColorFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_color_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_format" }
        }
      val setCustomDataFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_custom_data_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_data_format" }
        }
      val setInstanceColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_color" }
        }
      val setInstanceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_count" }
        }
      val setInstanceCustomData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_custom_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_custom_data" }
        }
      val setInstanceTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_transform" }
        }
      val setInstanceTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_instance_transform_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_instance_transform_2d" }
        }
      val setMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh" }
        }
      val setTransformFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_transform_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform_format" }
        }
      val setVisibleInstanceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
            "set_visible_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible_instance_count" }
        }}
  }
}
