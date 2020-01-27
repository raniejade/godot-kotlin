// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class DirectionalLight internal constructor(
  _handle: COpaquePointer
) : Light(_handle) {
  fun getShadowDepthRange(): ShadowDepthRange {
    val _ret = __method_bind.get_shadow_depth_range.call(this.toVariant())
    TODO()
  }

  fun getShadowMode(): ShadowMode {
    val _ret = __method_bind.get_shadow_mode.call(this.toVariant())
    TODO()
  }

  fun isBlendSplitsEnabled(): Boolean {
    val _ret = __method_bind.is_blend_splits_enabled.call(this.toVariant())
    TODO()
  }

  fun setBlendSplits(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_blend_splits.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowDepthRange(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_shadow_depth_range.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setShadowMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_shadow_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton DirectionalLight" }
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
      val get_shadow_depth_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
              "get_shadow_depth_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_depth_range" }
            }
          }

      val get_shadow_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
              "get_shadow_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_mode" }
            }
          }

      val is_blend_splits_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
              "is_blend_splits_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_blend_splits_enabled" }
            }
          }

      val set_blend_splits: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
              "set_blend_splits".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_splits" }
            }
          }

      val set_shadow_depth_range: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
              "set_shadow_depth_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_depth_range" }
            }
          }

      val set_shadow_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DirectionalLight".cstr.ptr,
              "set_shadow_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_mode" }
            }
          }
    }
  }
}
