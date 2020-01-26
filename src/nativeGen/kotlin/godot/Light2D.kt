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

open class Light2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  enum class ShadowFilter(
    val value: Int
  ) {
    SHADOW_FILTER_NONE(0),

    SHADOW_FILTER_PCF3(1),

    SHADOW_FILTER_PCF5(2),

    SHADOW_FILTER_PCF7(3),

    SHADOW_FILTER_PCF9(4),

    SHADOW_FILTER_PCF13(5);
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_ADD(0),

    MODE_SUB(1),

    MODE_MIX(2),

    MODE_MASK(3);
  }

  companion object {
    val MODE_ADD: Int = 0

    val MODE_MASK: Int = 3

    val MODE_MIX: Int = 2

    val MODE_SUB: Int = 1

    val SHADOW_FILTER_NONE: Int = 0

    val SHADOW_FILTER_PCF13: Int = 5

    val SHADOW_FILTER_PCF3: Int = 1

    val SHADOW_FILTER_PCF5: Int = 2

    val SHADOW_FILTER_PCF7: Int = 3

    val SHADOW_FILTER_PCF9: Int = 4

    fun new(): Light2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Light2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Light2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Light2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Light2D
     */
    private object __method_bind {
      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_energy" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_item_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_item_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_cull_mask" }
            }
          }

      val get_item_shadow_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_item_shadow_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_item_shadow_cull_mask" }
            }
          }

      val get_layer_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_layer_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_range_max" }
            }
          }

      val get_layer_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_layer_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_range_min" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_shadow_buffer_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_buffer_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_buffer_size" }
            }
          }

      val get_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
            }
          }

      val get_shadow_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_filter" }
            }
          }

      val get_shadow_gradient_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_gradient_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_gradient_length" }
            }
          }

      val get_shadow_smooth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_shadow_smooth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_smooth" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
            }
          }

      val get_texture_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_texture_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
            }
          }

      val get_z_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_z_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_z_range_max" }
            }
          }

      val get_z_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "get_z_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_z_range_min" }
            }
          }

      val is_editor_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "is_editor_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editor_only" }
            }
          }

      val is_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val is_shadow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "is_shadow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shadow_enabled" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_editor_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_editor_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editor_only" }
            }
          }

      val set_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_energy" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_item_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_item_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_cull_mask" }
            }
          }

      val set_item_shadow_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_item_shadow_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_item_shadow_cull_mask" }
            }
          }

      val set_layer_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_layer_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_range_max" }
            }
          }

      val set_layer_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_layer_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_range_min" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_shadow_buffer_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_buffer_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_buffer_size" }
            }
          }

      val set_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
            }
          }

      val set_shadow_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_enabled" }
            }
          }

      val set_shadow_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_filter" }
            }
          }

      val set_shadow_gradient_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_gradient_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_gradient_length" }
            }
          }

      val set_shadow_smooth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_shadow_smooth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_smooth" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
            }
          }

      val set_texture_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_texture_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
            }
          }

      val set_z_range_max: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_z_range_max".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_z_range_max" }
            }
          }

      val set_z_range_min: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light2D".cstr.ptr,
              "set_z_range_min".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_z_range_min" }
            }
          }
    }
  }
}
