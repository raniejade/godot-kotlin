// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class GeometryInstance(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualInstance(null) {
  var castShadow: ShadowCastingSetting
    get() {
       return getCastShadowsSetting() 
    }
    set(value) {
      setCastShadowsSetting(value.value)
    }

  var extraCullMargin: Float
    get() {
       return getExtraCullMargin() 
    }
    set(value) {
      setExtraCullMargin(value)
    }

  var lodMaxDistance: Float
    get() {
       return getLodMaxDistance() 
    }
    set(value) {
      setLodMaxDistance(value)
    }

  var lodMaxHysteresis: Float
    get() {
       return getLodMaxHysteresis() 
    }
    set(value) {
      setLodMaxHysteresis(value)
    }

  var lodMinDistance: Float
    get() {
       return getLodMinDistance() 
    }
    set(value) {
      setLodMinDistance(value)
    }

  var lodMinHysteresis: Float
    get() {
       return getLodMinHysteresis() 
    }
    set(value) {
      setLodMinHysteresis(value)
    }

  var materialOverride: Material
    get() {
       return getMaterialOverride() 
    }
    set(value) {
      setMaterialOverride(value)
    }

  var useInBakedLight: Boolean
    get() {
       return getFlag(0) 
    }
    set(value) {
      setFlag(0, value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCastShadowsSetting(): ShadowCastingSetting {
    val _ret = __method_bind.getCastShadowsSetting.call(this._handle)
    return GeometryInstance.ShadowCastingSetting.from(_ret.asInt())
  }

  fun getExtraCullMargin(): Float {
    val _ret = __method_bind.getExtraCullMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getFlag(flag: Int): Boolean {
    val _arg = Variant(flag)
    val _ret = __method_bind.getFlag.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getLodMaxDistance(): Float {
    val _ret = __method_bind.getLodMaxDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getLodMaxHysteresis(): Float {
    val _ret = __method_bind.getLodMaxHysteresis.call(this._handle)
    return _ret.asFloat()
  }

  fun getLodMinDistance(): Float {
    val _ret = __method_bind.getLodMinDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getLodMinHysteresis(): Float {
    val _ret = __method_bind.getLodMinHysteresis.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaterialOverride(): Material {
    val _ret = __method_bind.getMaterialOverride.call(this._handle)
    return _ret.toAny() as Material
  }

  fun setCastShadowsSetting(shadowCastingSetting: Int) {
    val _arg = Variant(shadowCastingSetting)
    __method_bind.setCastShadowsSetting.call(this._handle, listOf(_arg))
  }

  fun setCustomAabb(aabb: AABB) {
    val _arg = Variant(aabb)
    __method_bind.setCustomAabb.call(this._handle, listOf(_arg))
  }

  fun setExtraCullMargin(margin: Float) {
    val _arg = Variant(margin)
    __method_bind.setExtraCullMargin.call(this._handle, listOf(_arg))
  }

  fun setFlag(flag: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(value))
    __method_bind.setFlag.call(this._handle, _args)
  }

  fun setLodMaxDistance(mode: Float) {
    val _arg = Variant(mode)
    __method_bind.setLodMaxDistance.call(this._handle, listOf(_arg))
  }

  fun setLodMaxHysteresis(mode: Float) {
    val _arg = Variant(mode)
    __method_bind.setLodMaxHysteresis.call(this._handle, listOf(_arg))
  }

  fun setLodMinDistance(mode: Float) {
    val _arg = Variant(mode)
    __method_bind.setLodMinDistance.call(this._handle, listOf(_arg))
  }

  fun setLodMinHysteresis(mode: Float) {
    val _arg = Variant(mode)
    __method_bind.setLodMinHysteresis.call(this._handle, listOf(_arg))
  }

  fun setMaterialOverride(material: Material) {
    val _arg = Variant(material)
    __method_bind.setMaterialOverride.call(this._handle, listOf(_arg))
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_USE_BAKED_LIGHT(0),

    FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

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
    OFF(0),

    ON(1),

    DOUBLE_SIDED(2),

    SHADOWS_ONLY(3);

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
    /**
     * Container for method_bind pointers for GeometryInstance
     */
    private object __method_bind {
      val getCastShadowsSetting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_cast_shadows_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cast_shadows_setting" }
        }
      val getExtraCullMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_extra_cull_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extra_cull_margin" }
        }
      val getFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flag" }
        }
      val getLodMaxDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_max_distance" }
        }
      val getLodMaxHysteresis: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_max_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_max_hysteresis" }
        }
      val getLodMinDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_min_distance" }
        }
      val getLodMinHysteresis: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_lod_min_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lod_min_hysteresis" }
        }
      val getMaterialOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "get_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material_override" }
        }
      val setCastShadowsSetting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_cast_shadows_setting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cast_shadows_setting" }
        }
      val setCustomAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_aabb" }
        }
      val setExtraCullMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_extra_cull_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extra_cull_margin" }
        }
      val setFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flag" }
        }
      val setLodMaxDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_max_distance" }
        }
      val setLodMaxHysteresis: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_max_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_max_hysteresis" }
        }
      val setLodMinDistance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_min_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_min_distance" }
        }
      val setLodMinHysteresis: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_lod_min_hysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lod_min_hysteresis" }
        }
      val setMaterialOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "set_material_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material_override" }
        }}
  }
}
