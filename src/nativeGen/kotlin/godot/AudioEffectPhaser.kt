// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectPhaser internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getDepth(): Float {
    val _ret = __method_bind.get_depth.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedback(): Float {
    val _ret = __method_bind.get_feedback.call(this._handle)
    return _ret.asFloat()
  }

  fun getRangeMaxHz(): Float {
    val _ret = __method_bind.get_range_max_hz.call(this._handle)
    return _ret.asFloat()
  }

  fun getRangeMinHz(): Float {
    val _ret = __method_bind.get_range_min_hz.call(this._handle)
    return _ret.asFloat()
  }

  fun getRateHz(): Float {
    val _ret = __method_bind.get_rate_hz.call(this._handle)
    return _ret.asFloat()
  }

  fun setDepth(depth: Float) {
    val _arg = Variant.new(depth)
    __method_bind.set_depth.call(this._handle, _arg, 1)
  }

  fun setFeedback(fbk: Float) {
    val _arg = Variant.new(fbk)
    __method_bind.set_feedback.call(this._handle, _arg, 1)
  }

  fun setRangeMaxHz(hz: Float) {
    val _arg = Variant.new(hz)
    __method_bind.set_range_max_hz.call(this._handle, _arg, 1)
  }

  fun setRangeMinHz(hz: Float) {
    val _arg = Variant.new(hz)
    __method_bind.set_range_min_hz.call(this._handle, _arg, 1)
  }

  fun setRateHz(hz: Float) {
    val _arg = Variant.new(hz)
    __method_bind.set_rate_hz.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectPhaser = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPhaser".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectPhaser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectPhaser(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectPhaser = AudioEffectPhaser(ptr)
    /**
     * Container for method_bind pointers for AudioEffectPhaser
     */
    private object __method_bind {
      val get_depth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "get_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth" }
        }
      val get_feedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "get_feedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feedback" }
        }
      val get_range_max_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "get_range_max_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_range_max_hz" }
        }
      val get_range_min_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "get_range_min_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_range_min_hz" }
        }
      val get_rate_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "get_rate_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rate_hz" }
        }
      val set_depth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "set_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth" }
        }
      val set_feedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "set_feedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback" }
        }
      val set_range_max_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "set_range_max_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_range_max_hz" }
        }
      val set_range_min_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "set_range_min_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_range_min_hz" }
        }
      val set_rate_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "set_rate_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rate_hz" }
        }}
  }
}
