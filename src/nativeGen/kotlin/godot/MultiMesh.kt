// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
  enum class TransformFormat(
    val value: Int
  ) {
    TRANSFORM_2D(0),

    TRANSFORM_3D(1);
  }

  enum class CustomDataFormat(
    val value: Int
  ) {
    CUSTOM_DATA_NONE(0),

    CUSTOM_DATA_8BIT(1),

    CUSTOM_DATA_FLOAT(2);
  }

  enum class ColorFormat(
    val value: Int
  ) {
    COLOR_NONE(0),

    COLOR_8BIT(1),

    COLOR_FLOAT(2);
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
    /**
     * Container for method_bind pointers for MultiMesh
     */
    private object __method_bind {
      val _get_color_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_get_color_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_color_array" }
            }
          }

      val _get_custom_data_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_get_custom_data_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_custom_data_array" }
            }
          }

      val _get_transform_2d_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_get_transform_2d_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_transform_2d_array" }
            }
          }

      val _get_transform_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_get_transform_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_transform_array" }
            }
          }

      val _set_color_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_set_color_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_color_array" }
            }
          }

      val _set_custom_data_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_set_custom_data_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_custom_data_array" }
            }
          }

      val _set_transform_2d_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_set_transform_2d_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_transform_2d_array" }
            }
          }

      val _set_transform_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiMesh".cstr.ptr,
              "_set_transform_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_transform_array" }
            }
          }

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
