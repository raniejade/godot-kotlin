// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCastShadowsSetting.call(self._handle, emptyList(), _retPtr)
      GeometryInstance.ShadowCastingSetting.from(_ret.value)
    }
  }

  fun getExtraCullMargin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExtraCullMargin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFlag(flag: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFlag.call(self._handle, listOf(flag), _retPtr)
      _ret.value
    }
  }

  fun getLodMaxDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLodMaxDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLodMaxHysteresis(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLodMaxHysteresis.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLodMinDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLodMinDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLodMinHysteresis(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLodMinHysteresis.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMaterialOverride(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMaterialOverride.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun setCastShadowsSetting(shadowCastingSetting: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCastShadowsSetting.call(self._handle, listOf(shadowCastingSetting), null)
    }
  }

  fun setCustomAabb(aabb: AABB) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomAabb.call(self._handle, listOf(aabb), null)
    }
  }

  fun setExtraCullMargin(margin: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExtraCullMargin.call(self._handle, listOf(margin), null)
    }
  }

  fun setFlag(flag: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(flag)
      _args.add(value)
      __method_bind.setFlag.call(self._handle, _args, null)
    }
  }

  fun setLodMaxDistance(mode: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLodMaxDistance.call(self._handle, listOf(mode), null)
    }
  }

  fun setLodMaxHysteresis(mode: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLodMaxHysteresis.call(self._handle, listOf(mode), null)
    }
  }

  fun setLodMinDistance(mode: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLodMinDistance.call(self._handle, listOf(mode), null)
    }
  }

  fun setLodMinHysteresis(mode: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLodMinHysteresis.call(self._handle, listOf(mode), null)
    }
  }

  fun setMaterialOverride(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaterialOverride.call(self._handle, listOf(material), null)
    }
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
