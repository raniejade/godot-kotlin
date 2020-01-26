// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Color
import godot.core.Godot
import godot.core.PoolRealArray
import godot.core.Transform
import godot.core.Transform2D
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MultiMesh internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getAabb(): AABB {
    TODO()
  }

  fun getColorFormat(): ColorFormat {
    TODO()
  }

  fun getCustomDataFormat(): CustomDataFormat {
    TODO()
  }

  fun getInstanceColor(instance: Int): Color {
    TODO()
  }

  fun getInstanceCount(): Int {
    TODO()
  }

  fun getInstanceCustomData(instance: Int): Color {
    TODO()
  }

  fun getInstanceTransform(instance: Int): Transform {
    TODO()
  }

  fun getInstanceTransform2d(instance: Int): Transform2D {
    TODO()
  }

  fun getMesh(): Mesh {
    TODO()
  }

  fun getTransformFormat(): TransformFormat {
    TODO()
  }

  fun getVisibleInstanceCount(): Int {
    TODO()
  }

  fun setAsBulkArray(array: PoolRealArray) {
    TODO()
  }

  fun setColorFormat(format: Int) {
    TODO()
  }

  fun setCustomDataFormat(format: Int) {
    TODO()
  }

  fun setInstanceColor(instance: Int, color: Color) {
    TODO()
  }

  fun setInstanceCount(count: Int) {
    TODO()
  }

  fun setInstanceCustomData(instance: Int, custom_data: Color) {
    TODO()
  }

  fun setInstanceTransform(instance: Int, transform: Transform) {
    TODO()
  }

  fun setInstanceTransform2d(instance: Int, transform: Transform2D) {
    TODO()
  }

  fun setMesh(mesh: Mesh) {
    TODO()
  }

  fun setTransformFormat(format: Int) {
    TODO()
  }

  fun setVisibleInstanceCount(count: Int) {
    TODO()
  }

  enum class TransformFormat(
    val value: Int
  ) {
    TRANSFORM_2D(0),

    TRANSFORM_3D(1);

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
    CUSTOM_DATA_NONE(0),

    CUSTOM_DATA_8BIT(1),

    CUSTOM_DATA_FLOAT(2);

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
    COLOR_NONE(0),

    COLOR_8BIT(1),

    COLOR_FLOAT(2);

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
    val COLOR_8BIT: Int = 1

    val COLOR_FLOAT: Int = 2

    val COLOR_NONE: Int = 0

    val CUSTOM_DATA_8BIT: Int = 1

    val CUSTOM_DATA_FLOAT: Int = 2

    val CUSTOM_DATA_NONE: Int = 0

    val TRANSFORM_2D: Int = 0

    val TRANSFORM_3D: Int = 1

    fun new(): MultiMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MultiMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MultiMesh = MultiMesh(ptr)
    /**
     * Container for method_bind pointers for MultiMesh
     */
    private object __method_bind {
      val get_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_aabb" }
            }
          }

      val get_color_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_color_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color_format" }
            }
          }

      val get_custom_data_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_custom_data_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_data_format" }
            }
          }

      val get_instance_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_instance_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_color" }
            }
          }

      val get_instance_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_instance_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_count" }
            }
          }

      val get_instance_custom_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_instance_custom_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_custom_data" }
            }
          }

      val get_instance_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_instance_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_transform" }
            }
          }

      val get_instance_transform_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_instance_transform_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_transform_2d" }
            }
          }

      val get_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh" }
            }
          }

      val get_transform_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_transform_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform_format" }
            }
          }

      val get_visible_instance_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "get_visible_instance_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visible_instance_count" }
            }
          }

      val set_as_bulk_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_as_bulk_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_bulk_array" }
            }
          }

      val set_color_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_color_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color_format" }
            }
          }

      val set_custom_data_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_custom_data_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_data_format" }
            }
          }

      val set_instance_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_instance_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance_color" }
            }
          }

      val set_instance_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_instance_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance_count" }
            }
          }

      val set_instance_custom_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_instance_custom_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance_custom_data" }
            }
          }

      val set_instance_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_instance_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance_transform" }
            }
          }

      val set_instance_transform_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_instance_transform_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_instance_transform_2d" }
            }
          }

      val set_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh" }
            }
          }

      val set_transform_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_transform_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform_format" }
            }
          }

      val set_visible_instance_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "set_visible_instance_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visible_instance_count" }
            }
          }
    }
  }
}
