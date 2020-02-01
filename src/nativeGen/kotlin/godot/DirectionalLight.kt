// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class DirectionalLight(
  _handle: COpaquePointer
) : Light(_handle) {
  var directionalShadowBiasSplitScale: Float
    get() {
       return getParam(14) 
    }
    set(value) {
      setParam(14, value)
    }

  var directionalShadowBlendSplits: Boolean
    get() {
       return isBlendSplitsEnabled() 
    }
    set(value) {
      setBlendSplits(value)
    }

  var directionalShadowDepthRange: ShadowDepthRange
    get() {
       return getShadowDepthRange() 
    }
    set(value) {
      setShadowDepthRange(value.value)
    }

  var directionalShadowMaxDistance: Float
    get() {
       return getParam(8) 
    }
    set(value) {
      setParam(8, value)
    }

  var directionalShadowMode: ShadowMode
    get() {
       return getShadowMode() 
    }
    set(value) {
      setShadowMode(value.value)
    }

  var directionalShadowNormalBias: Float
    get() {
       return getParam(12) 
    }
    set(value) {
      setParam(12, value)
    }

  var directionalShadowSplit1: Float
    get() {
       return getParam(9) 
    }
    set(value) {
      setParam(9, value)
    }

  var directionalShadowSplit2: Float
    get() {
       return getParam(10) 
    }
    set(value) {
      setParam(10, value)
    }

  var directionalShadowSplit3: Float
    get() {
       return getParam(11) 
    }
    set(value) {
      setParam(11, value)
    }

  fun getShadowDepthRange(): ShadowDepthRange {
    val _ret = __method_bind.getShadowDepthRange.call(this._handle)
    return DirectionalLight.ShadowDepthRange.from(_ret.asInt())
  }

  fun getShadowMode(): ShadowMode {
    val _ret = __method_bind.getShadowMode.call(this._handle)
    return DirectionalLight.ShadowMode.from(_ret.asInt())
  }

  fun isBlendSplitsEnabled(): Boolean {
    val _ret = __method_bind.isBlendSplitsEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBlendSplits(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setBlendSplits.call(this._handle, listOf(_arg))
  }

  fun setShadowDepthRange(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setShadowDepthRange.call(this._handle, listOf(_arg))
  }

  fun setShadowMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setShadowMode.call(this._handle, listOf(_arg))
  }

  enum class ShadowMode(
    val value: Int
  ) {
    SHADOW_ORTHOGONAL(0),

    SHADOW_PARALLEL_2_SPLITS(1),

    SHADOW_PARALLEL_4_SPLITS(2);

    companion object {
      fun from(value: Int): ShadowMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ShadowDepthRange(
    val value: Int
  ) {
    SHADOW_DEPTH_RANGE_STABLE(0),

    SHADOW_DEPTH_RANGE_OPTIMIZED(1);

    companion object {
      fun from(value: Int): ShadowDepthRange {
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
    val SHADOW_DEPTH_RANGE_OPTIMIZED: Int = 1

    val SHADOW_DEPTH_RANGE_STABLE: Int = 0

    val SHADOW_ORTHOGONAL: Int = 0

    val SHADOW_PARALLEL_2_SPLITS: Int = 1

    val SHADOW_PARALLEL_4_SPLITS: Int = 2

    fun new(): DirectionalLight = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DirectionalLight".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for DirectionalLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DirectionalLight(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): DirectionalLight = DirectionalLight(ptr)
    /**
     * Container for method_bind pointers for DirectionalLight
     */
    private object __method_bind {
      val getShadowDepthRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
            "get_shadow_depth_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_depth_range" }
        }
      val getShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
            "get_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_mode" }
        }
      val isBlendSplitsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
            "is_blend_splits_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_blend_splits_enabled" }
        }
      val setBlendSplits: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
            "set_blend_splits".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_splits" }
        }
      val setShadowDepthRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
            "set_shadow_depth_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_depth_range" }
        }
      val setShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
            "set_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_mode" }
        }}
  }
}
