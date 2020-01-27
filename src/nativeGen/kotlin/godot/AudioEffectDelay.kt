// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectDelay(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getDry(): Float {
    val _ret = __method_bind.get_dry.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedbackDelayMs(): Float {
    val _ret = __method_bind.get_feedback_delay_ms.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedbackLevelDb(): Float {
    val _ret = __method_bind.get_feedback_level_db.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedbackLowpass(): Float {
    val _ret = __method_bind.get_feedback_lowpass.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap1DelayMs(): Float {
    val _ret = __method_bind.get_tap1_delay_ms.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap1LevelDb(): Float {
    val _ret = __method_bind.get_tap1_level_db.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap1Pan(): Float {
    val _ret = __method_bind.get_tap1_pan.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap2DelayMs(): Float {
    val _ret = __method_bind.get_tap2_delay_ms.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap2LevelDb(): Float {
    val _ret = __method_bind.get_tap2_level_db.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap2Pan(): Float {
    val _ret = __method_bind.get_tap2_pan.call(this._handle)
    return _ret.asFloat()
  }

  fun isFeedbackActive(): Boolean {
    val _ret = __method_bind.is_feedback_active.call(this._handle)
    return _ret.asBool()
  }

  fun isTap1Active(): Boolean {
    val _ret = __method_bind.is_tap1_active.call(this._handle)
    return _ret.asBool()
  }

  fun isTap2Active(): Boolean {
    val _ret = __method_bind.is_tap2_active.call(this._handle)
    return _ret.asBool()
  }

  fun setDry(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_dry.call(this._handle, _arg, 1)
  }

  fun setFeedbackActive(amount: Boolean) {
    val _arg = Variant.new(amount)
    __method_bind.set_feedback_active.call(this._handle, _arg, 1)
  }

  fun setFeedbackDelayMs(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_feedback_delay_ms.call(this._handle, _arg, 1)
  }

  fun setFeedbackLevelDb(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_feedback_level_db.call(this._handle, _arg, 1)
  }

  fun setFeedbackLowpass(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_feedback_lowpass.call(this._handle, _arg, 1)
  }

  fun setTap1Active(amount: Boolean) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap1_active.call(this._handle, _arg, 1)
  }

  fun setTap1DelayMs(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap1_delay_ms.call(this._handle, _arg, 1)
  }

  fun setTap1LevelDb(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap1_level_db.call(this._handle, _arg, 1)
  }

  fun setTap1Pan(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap1_pan.call(this._handle, _arg, 1)
  }

  fun setTap2Active(amount: Boolean) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap2_active.call(this._handle, _arg, 1)
  }

  fun setTap2DelayMs(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap2_delay_ms.call(this._handle, _arg, 1)
  }

  fun setTap2LevelDb(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap2_level_db.call(this._handle, _arg, 1)
  }

  fun setTap2Pan(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_tap2_pan.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectDelay = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDelay".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectDelay" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectDelay(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectDelay = AudioEffectDelay(ptr)
    /**
     * Container for method_bind pointers for AudioEffectDelay
     */
    private object __method_bind {
      val get_dry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dry" }
        }
      val get_feedback_delay_ms: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_feedback_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feedback_delay_ms" }
        }
      val get_feedback_level_db: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_feedback_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feedback_level_db" }
        }
      val get_feedback_lowpass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_feedback_lowpass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feedback_lowpass" }
        }
      val get_tap1_delay_ms: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap1_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap1_delay_ms" }
        }
      val get_tap1_level_db: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap1_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap1_level_db" }
        }
      val get_tap1_pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap1_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap1_pan" }
        }
      val get_tap2_delay_ms: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap2_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap2_delay_ms" }
        }
      val get_tap2_level_db: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap2_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap2_level_db" }
        }
      val get_tap2_pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap2_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap2_pan" }
        }
      val is_feedback_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "is_feedback_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_feedback_active" }
        }
      val is_tap1_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "is_tap1_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_tap1_active" }
        }
      val is_tap2_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "is_tap2_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_tap2_active" }
        }
      val set_dry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dry" }
        }
      val set_feedback_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_active" }
        }
      val set_feedback_delay_ms: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_delay_ms" }
        }
      val set_feedback_level_db: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_level_db" }
        }
      val set_feedback_lowpass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_lowpass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_lowpass" }
        }
      val set_tap1_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_active" }
        }
      val set_tap1_delay_ms: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_delay_ms" }
        }
      val set_tap1_level_db: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_level_db" }
        }
      val set_tap1_pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_pan" }
        }
      val set_tap2_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_active" }
        }
      val set_tap2_delay_ms: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_delay_ms" }
        }
      val set_tap2_level_db: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_level_db" }
        }
      val set_tap2_pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_pan" }
        }}
  }
}
