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

open class Light internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  enum class BakeMode(
    val value: Int
  ) {
    BAKE_DISABLED(0),

    BAKE_INDIRECT(1),

    BAKE_ALL(2);
  }

  enum class Param(
    val value: Int
  ) {
    PARAM_ENERGY(0),

    PARAM_INDIRECT_ENERGY(1),

    PARAM_SPECULAR(2),

    PARAM_RANGE(3),

    PARAM_ATTENUATION(4),

    PARAM_SPOT_ANGLE(5),

    PARAM_SPOT_ATTENUATION(6),

    PARAM_CONTACT_SHADOW_SIZE(7),

    PARAM_SHADOW_MAX_DISTANCE(8),

    PARAM_SHADOW_SPLIT_1_OFFSET(9),

    PARAM_SHADOW_SPLIT_2_OFFSET(10),

    PARAM_SHADOW_SPLIT_3_OFFSET(11),

    PARAM_SHADOW_NORMAL_BIAS(12),

    PARAM_SHADOW_BIAS(13),

    PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    PARAM_MAX(15);
  }

  companion object {
    val BAKE_ALL: Int = 2

    val BAKE_DISABLED: Int = 0

    val BAKE_INDIRECT: Int = 1

    val PARAM_ATTENUATION: Int = 4

    val PARAM_CONTACT_SHADOW_SIZE: Int = 7

    val PARAM_ENERGY: Int = 0

    val PARAM_INDIRECT_ENERGY: Int = 1

    val PARAM_MAX: Int = 15

    val PARAM_RANGE: Int = 3

    val PARAM_SHADOW_BIAS: Int = 13

    val PARAM_SHADOW_BIAS_SPLIT_SCALE: Int = 14

    val PARAM_SHADOW_MAX_DISTANCE: Int = 8

    val PARAM_SHADOW_NORMAL_BIAS: Int = 12

    val PARAM_SHADOW_SPLIT_1_OFFSET: Int = 9

    val PARAM_SHADOW_SPLIT_2_OFFSET: Int = 10

    val PARAM_SHADOW_SPLIT_3_OFFSET: Int = 11

    val PARAM_SPECULAR: Int = 2

    val PARAM_SPOT_ANGLE: Int = 5

    val PARAM_SPOT_ATTENUATION: Int = 6

    /**
     * Container for method_bind pointers for Light
     */
    private object __method_bind {
      val get_bake_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "get_bake_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_mode" }
            }
          }

      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "get_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
            }
          }

      val get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param" }
            }
          }

      val get_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "get_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_color" }
            }
          }

      val get_shadow_reverse_cull_face: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "get_shadow_reverse_cull_face".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_reverse_cull_face" }
            }
          }

      val has_shadow: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "has_shadow".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_shadow" }
            }
          }

      val is_editor_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "is_editor_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editor_only" }
            }
          }

      val is_negative: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "is_negative".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_negative" }
            }
          }

      val set_bake_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_bake_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_mode" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
            }
          }

      val set_editor_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_editor_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editor_only" }
            }
          }

      val set_negative: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_negative".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_negative" }
            }
          }

      val set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param" }
            }
          }

      val set_shadow: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_shadow".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow" }
            }
          }

      val set_shadow_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_shadow_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_color" }
            }
          }

      val set_shadow_reverse_cull_face: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Light".cstr.ptr,
              "set_shadow_reverse_cull_face".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_reverse_cull_face" }
            }
          }
    }
  }
}
