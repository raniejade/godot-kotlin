// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class OmniLight(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Light(null) {
  var omniAttenuation: Float
    get() {
       return getParam(4) 
    }
    set(value) {
      setParam(4, value)
    }

  var omniRange: Float
    get() {
       return getParam(3) 
    }
    set(value) {
      setParam(3, value)
    }

  var omniShadowDetail: ShadowDetail
    get() {
       return getShadowDetail() 
    }
    set(value) {
      setShadowDetail(value.value)
    }

  var omniShadowMode: ShadowMode
    get() {
       return getShadowMode() 
    }
    set(value) {
      setShadowMode(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getShadowDetail(): ShadowDetail {
    val _ret = __method_bind.getShadowDetail.call(this._handle)
    return OmniLight.ShadowDetail.from(_ret.asInt())
  }

  fun getShadowMode(): ShadowMode {
    val _ret = __method_bind.getShadowMode.call(this._handle)
    return OmniLight.ShadowMode.from(_ret.asInt())
  }

  fun setShadowDetail(detail: Int) {
    val _arg = Variant(detail)
    __method_bind.setShadowDetail.call(this._handle, listOf(_arg))
  }

  fun setShadowMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setShadowMode.call(this._handle, listOf(_arg))
  }

  enum class ShadowMode(
    val value: Int
  ) {
    DUAL_PARABOLOID(0),

    CUBE(1);

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

  enum class ShadowDetail(
    val value: Int
  ) {
    VERTICAL(0),

    HORIZONTAL(1);

    companion object {
      fun from(value: Int): ShadowDetail {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("OmniLight".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OmniLight" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for OmniLight
     */
    private object __method_bind {
      val getShadowDetail: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "get_shadow_detail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_detail" }
        }
      val getShadowMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "get_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_mode" }
        }
      val setShadowDetail: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "set_shadow_detail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_detail" }
        }
      val setShadowMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OmniLight".cstr.ptr,
            "set_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_mode" }
        }}
  }
}
