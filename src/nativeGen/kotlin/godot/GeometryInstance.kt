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

open class GeometryInstance(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  var castShadow: Int
    get() {
       return GeometryInstance.ShadowCastingSetting.from(getCastShadowsSetting()) 
    }
    set(value) {
      setCastShadowsSetting(GeometryInstance.ShadowCastingSetting.from(value))
    }

  var extraCullMargin: Float
    get() {
       return getExtraCullMargin() 
    }
    set(value) {
      setExtraCullMargin(value)
    }

  var lodMaxDistance: Int
    get() {
       return getLodMaxDistance() 
    }
    set(value) {
      setLodMaxDistance(value)
    }

  var lodMaxHysteresis: Int
    get() {
       return getLodMaxHysteresis() 
    }
    set(value) {
      setLodMaxHysteresis(value)
    }

  var lodMinDistance: Int
    get() {
       return getLodMinDistance() 
    }
    set(value) {
      setLodMinDistance(value)
    }

  var lodMinHysteresis: Int
    get() {
       return getLodMinHysteresis() 
    }
    set(value) {
      setLodMinHysteresis(value)
    }

  var materialOverride: `ShaderMaterial,SpatialMaterial`
    get() {
       return getMaterialOverride() 
    }
    set(value) {
      setMaterialOverride(value)
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
    val _arg = Variant.new(flag)
    val _ret = __method_bind.getFlag.call(this._handle, _arg, 1)
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
    return _ret.asObject(::Material)!!
  }

  fun setCastShadowsSetting(shadowCastingSetting: Int) {
    val _arg = Variant.new(shadowCastingSetting)
    __method_bind.setCastShadowsSetting.call(this._handle, _arg, 1)
  }

  fun setCustomAabb(aabb: AABB) {
    val _arg = Variant.new(aabb)
    __method_bind.setCustomAabb.call(this._handle, _arg, 1)
  }

  fun setExtraCullMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.setExtraCullMargin.call(this._handle, _arg, 1)
  }

  fun setFlag(flag: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(value)
    __method_bind.setFlag.call(this._handle, _args.toVariant(), 2)
  }

  fun setLodMaxDistance(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.setLodMaxDistance.call(this._handle, _arg, 1)
  }

  fun setLodMaxHysteresis(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.setLodMaxHysteresis.call(this._handle, _arg, 1)
  }

  fun setLodMinDistance(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.setLodMinDistance.call(this._handle, _arg, 1)
  }

  fun setLodMinHysteresis(mode: Float) {
    val _arg = Variant.new(mode)
    __method_bind.setLodMinHysteresis.call(this._handle, _arg, 1)
  }

  fun setMaterialOverride(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterialOverride.call(this._handle, _arg, 1)
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
      val getCastShadowsSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getCastShadowsSetting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCastShadowsSetting" }
        }
      val getExtraCullMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getExtraCullMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExtraCullMargin" }
        }
      val getFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFlag" }
        }
      val getLodMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getLodMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLodMaxDistance" }
        }
      val getLodMaxHysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getLodMaxHysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLodMaxHysteresis" }
        }
      val getLodMinDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getLodMinDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLodMinDistance" }
        }
      val getLodMinHysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getLodMinHysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLodMinHysteresis" }
        }
      val getMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "getMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterialOverride" }
        }
      val setCastShadowsSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setCastShadowsSetting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCastShadowsSetting" }
        }
      val setCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setCustomAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomAabb" }
        }
      val setExtraCullMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setExtraCullMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExtraCullMargin" }
        }
      val setFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlag" }
        }
      val setLodMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setLodMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLodMaxDistance" }
        }
      val setLodMaxHysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setLodMaxHysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLodMaxHysteresis" }
        }
      val setLodMinDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setLodMinDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLodMinDistance" }
        }
      val setLodMinHysteresis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setLodMinHysteresis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLodMinHysteresis" }
        }
      val setMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GeometryInstance".cstr.ptr,
            "setMaterialOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterialOverride" }
        }}
  }
}
