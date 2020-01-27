// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun getCastShadowsSetting(): ShadowCastingSetting {
    val _ret = __method_bind.get_cast_shadows_setting.call(this._handle)
    return GeometryInstance.ShadowCastingSetting.from(_ret.asInt())
  }

  fun getExtraCullMargin(): Float {
    val _ret = __method_bind.get_extra_cull_margin.call(this._handle)
    return _ret.asFloat()
  }

  fun getFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.get_flag.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun getLodMaxDistance(): Float {
    val _ret = __method_bind.get_lod_max_distance.call(this._handle)
    return _ret.asFloat()
  }

  fun getLodMaxHysteresis(): Float {
    val _ret = __method_bind.get_lod_max_hysteresis.call(this._handle)
    return _ret.asFloat()
  }

  fun getLodMinDistance(): Float {
    val _ret = __method_bind.get_lod_min_distance.call(this._handle)
    return _ret.asFloat()
  }

  fun getLodMinHysteresis(): Float {
    val _ret = __method_bind.get_lod_min_hysteresis.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaterialOverride(): Material {
    val _ret = __method_bind.get_material_override.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun setCastShadowsSetting(shadowCastingSetting: Int) {
    val _arg = Variant.new(shadowCastingSetting)
    __method_bind.set_cast_shadows_setting.call(this._handle, _arg, 1)
  }

  fun setCustomAabb(aabb: AABB) {
    val _arg = Variant.new(aabb)
    __method_bind.set_custom_aabb.call(this._handle, _arg, 1)
  }

  fun setExtraCullMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.set_extra_cull_margin.call(this._handle, _arg, 1)
  }

  fun setFlag(flag: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(value)
    __method_bind.set_flag.call(this._handle, _args.toVariant(), 2)
  }

  fun setLodMaxDistance(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.set_lod_max_distance.call(this._handle, _arg, 1)
  }

  fun setLodMaxHysteresis(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.set_lod_max_hysteresis.call(this._handle, _arg, 1)
  }

  fun setLodMinDistance(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.set_lod_min_distance.call(this._handle, _arg, 1)
  }

  fun setLodMinHysteresis(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.set_lod_min_hysteresis.call(this._handle, _arg, 1)
  }

  fun setMaterialOverride(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material_override.call(this._handle, _arg, 1)
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_USE_BAKED_LIGHT(0),

    FLAG_MAX(2);

    companion object {
      fun from(value: Int): Flags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ShadowCastingSetting(
    val value: Int
  ) {
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);

    companion object {
      fun from(value: Int): ShadowCastingSetting {
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
      val get_cast_shadows_setting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_cast_shadows_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cast_shadows_setting" }
        }
      val get_extra_cull_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_extra_cull_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extra_cull_margin" }
        }
      val get_flag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag" }
        }
      val get_lod_max_distance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_max_distance" }
        }
      val get_lod_max_hysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_max_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_max_hysteresis" }
        }
      val get_lod_min_distance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_min_distance" }
        }
      val get_lod_min_hysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_min_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_min_hysteresis" }
        }
      val get_material_override: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material_override" }
        }
      val set_cast_shadows_setting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_cast_shadows_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cast_shadows_setting" }
        }
      val set_custom_aabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
        }
      val set_extra_cull_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_extra_cull_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extra_cull_margin" }
        }
      val set_flag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag" }
        }
      val set_lod_max_distance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_max_distance" }
        }
      val set_lod_max_hysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_max_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_max_hysteresis" }
        }
      val set_lod_min_distance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_min_distance" }
        }
      val set_lod_min_hysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_min_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_min_hysteresis" }
        }
      val set_material_override: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material_override" }
        }}
  }
}
