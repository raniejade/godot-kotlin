// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GeometryInstance internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  fun getCastShadowsSetting(): GeometryInstance.ShadowCastingSetting {
    TODO()
  }

  fun getExtraCullMargin(): Float {
    TODO()
  }

  fun getFlag(): Boolean {
    TODO()
  }

  fun getLodMaxDistance(): Float {
    TODO()
  }

  fun getLodMaxHysteresis(): Float {
    TODO()
  }

  fun getLodMinDistance(): Float {
    TODO()
  }

  fun getLodMinHysteresis(): Float {
    TODO()
  }

  fun getMaterialOverride(): Material {
    TODO()
  }

  fun setCastShadowsSetting() {
    TODO()
  }

  fun setCustomAabb() {
    TODO()
  }

  fun setExtraCullMargin() {
    TODO()
  }

  fun setFlag() {
    TODO()
  }

  fun setLodMaxDistance() {
    TODO()
  }

  fun setLodMaxHysteresis() {
    TODO()
  }

  fun setLodMinDistance() {
    TODO()
  }

  fun setLodMinHysteresis() {
    TODO()
  }

  fun setMaterialOverride() {
    TODO()
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_USE_BAKED_LIGHT(0),

    FLAG_MAX(2);
  }

  enum class ShadowCastingSetting(
    val value: Int
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);
  }

  companion object {
    val FLAG_MAX: Int = 2

    val FLAG_USE_BAKED_LIGHT: Int = 0

    val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Int = 2

    val SHADOW_CASTING_SETTING_OFF: Int = 0

    val SHADOW_CASTING_SETTING_ON: Int = 1

    val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Int = 3

    /**
     * Container for method_bind pointers for GeometryInstance
     */
    private object __method_bind {
      val get_cast_shadows_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_cast_shadows_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cast_shadows_setting" }
            }
          }

      val get_extra_cull_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_extra_cull_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extra_cull_margin" }
            }
          }

      val get_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flag" }
            }
          }

      val get_lod_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_lod_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lod_max_distance" }
            }
          }

      val get_lod_max_hysteresis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_lod_max_hysteresis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lod_max_hysteresis" }
            }
          }

      val get_lod_min_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_lod_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lod_min_distance" }
            }
          }

      val get_lod_min_hysteresis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_lod_min_hysteresis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lod_min_hysteresis" }
            }
          }

      val get_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "get_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material_override" }
            }
          }

      val set_cast_shadows_setting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_cast_shadows_setting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cast_shadows_setting" }
            }
          }

      val set_custom_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_custom_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
            }
          }

      val set_extra_cull_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_extra_cull_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extra_cull_margin" }
            }
          }

      val set_flag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_flag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flag" }
            }
          }

      val set_lod_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_lod_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lod_max_distance" }
            }
          }

      val set_lod_max_hysteresis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_lod_max_hysteresis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lod_max_hysteresis" }
            }
          }

      val set_lod_min_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_lod_min_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lod_min_distance" }
            }
          }

      val set_lod_min_hysteresis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_lod_min_hysteresis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lod_min_hysteresis" }
            }
          }

      val set_material_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
              "set_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material_override" }
            }
          }
    }
  }
}
