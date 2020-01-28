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
  var dry: Float
    get() {
       return getDry() 
    }
    set(value) {
      setDry(value)
    }

  var feedbackActive: Boolean
    get() {
       return isFeedbackActive() 
    }
    set(value) {
      setFeedbackActive(value)
    }

  var feedbackDelayMs: Float
    get() {
       return getFeedbackDelayMs() 
    }
    set(value) {
      setFeedbackDelayMs(value)
    }

  var feedbackLevelDb: Float
    get() {
       return getFeedbackLevelDb() 
    }
    set(value) {
      setFeedbackLevelDb(value)
    }

  var feedbackLowpass: Float
    get() {
       return getFeedbackLowpass() 
    }
    set(value) {
      setFeedbackLowpass(value)
    }

  var tap1Active: Boolean
    get() {
       return isTap1Active() 
    }
    set(value) {
      setTap1Active(value)
    }

  var tap1DelayMs: Float
    get() {
       return getTap1DelayMs() 
    }
    set(value) {
      setTap1DelayMs(value)
    }

  var tap1LevelDb: Float
    get() {
       return getTap1LevelDb() 
    }
    set(value) {
      setTap1LevelDb(value)
    }

  var tap1Pan: Float
    get() {
       return getTap1Pan() 
    }
    set(value) {
      setTap1Pan(value)
    }

  var tap2Active: Boolean
    get() {
       return isTap2Active() 
    }
    set(value) {
      setTap2Active(value)
    }

  var tap2DelayMs: Float
    get() {
       return getTap2DelayMs() 
    }
    set(value) {
      setTap2DelayMs(value)
    }

  var tap2LevelDb: Float
    get() {
       return getTap2LevelDb() 
    }
    set(value) {
      setTap2LevelDb(value)
    }

  var tap2Pan: Float
    get() {
       return getTap2Pan() 
    }
    set(value) {
      setTap2Pan(value)
    }

  fun getDry(): Float {
    val _ret = __method_bind.getDry.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedbackDelayMs(): Float {
    val _ret = __method_bind.getFeedbackDelayMs.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedbackLevelDb(): Float {
    val _ret = __method_bind.getFeedbackLevelDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedbackLowpass(): Float {
    val _ret = __method_bind.getFeedbackLowpass.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap1DelayMs(): Float {
    val _ret = __method_bind.getTap1DelayMs.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap1LevelDb(): Float {
    val _ret = __method_bind.getTap1LevelDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap1Pan(): Float {
    val _ret = __method_bind.getTap1Pan.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap2DelayMs(): Float {
    val _ret = __method_bind.getTap2DelayMs.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap2LevelDb(): Float {
    val _ret = __method_bind.getTap2LevelDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getTap2Pan(): Float {
    val _ret = __method_bind.getTap2Pan.call(this._handle)
    return _ret.asFloat()
  }

  fun isFeedbackActive(): Boolean {
    val _ret = __method_bind.isFeedbackActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun isTap1Active(): Boolean {
    val _ret = __method_bind.isTap1Active.call(this._handle)
    return _ret.asBoolean()
  }

  fun isTap2Active(): Boolean {
    val _ret = __method_bind.isTap2Active.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDry(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setDry.call(this._handle, _arg, 1)
  }

  fun setFeedbackActive(amount: Boolean) {
    val _arg = Variant.new(amount)
    __method_bind.setFeedbackActive.call(this._handle, _arg, 1)
  }

  fun setFeedbackDelayMs(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setFeedbackDelayMs.call(this._handle, _arg, 1)
  }

  fun setFeedbackLevelDb(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setFeedbackLevelDb.call(this._handle, _arg, 1)
  }

  fun setFeedbackLowpass(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setFeedbackLowpass.call(this._handle, _arg, 1)
  }

  fun setTap1Active(amount: Boolean) {
    val _arg = Variant.new(amount)
    __method_bind.setTap1Active.call(this._handle, _arg, 1)
  }

  fun setTap1DelayMs(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTap1DelayMs.call(this._handle, _arg, 1)
  }

  fun setTap1LevelDb(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTap1LevelDb.call(this._handle, _arg, 1)
  }

  fun setTap1Pan(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTap1Pan.call(this._handle, _arg, 1)
  }

  fun setTap2Active(amount: Boolean) {
    val _arg = Variant.new(amount)
    __method_bind.setTap2Active.call(this._handle, _arg, 1)
  }

  fun setTap2DelayMs(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTap2DelayMs.call(this._handle, _arg, 1)
  }

  fun setTap2LevelDb(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTap2LevelDb.call(this._handle, _arg, 1)
  }

  fun setTap2Pan(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTap2Pan.call(this._handle, _arg, 1)
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
      val getDry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dry" }
        }
      val getFeedbackDelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_feedback_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feedback_delay_ms" }
        }
      val getFeedbackLevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_feedback_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feedback_level_db" }
        }
      val getFeedbackLowpass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_feedback_lowpass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feedback_lowpass" }
        }
      val getTap1DelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap1_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap1_delay_ms" }
        }
      val getTap1LevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap1_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap1_level_db" }
        }
      val getTap1Pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap1_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap1_pan" }
        }
      val getTap2DelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap2_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap2_delay_ms" }
        }
      val getTap2LevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap2_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap2_level_db" }
        }
      val getTap2Pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "get_tap2_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tap2_pan" }
        }
      val isFeedbackActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "is_feedback_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_feedback_active" }
        }
      val isTap1Active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "is_tap1_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_tap1_active" }
        }
      val isTap2Active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "is_tap2_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_tap2_active" }
        }
      val setDry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dry" }
        }
      val setFeedbackActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_active" }
        }
      val setFeedbackDelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_delay_ms" }
        }
      val setFeedbackLevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_level_db" }
        }
      val setFeedbackLowpass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_feedback_lowpass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_feedback_lowpass" }
        }
      val setTap1Active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_active" }
        }
      val setTap1DelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_delay_ms" }
        }
      val setTap1LevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_level_db" }
        }
      val setTap1Pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap1_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap1_pan" }
        }
      val setTap2Active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_active" }
        }
      val setTap2DelayMs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_delay_ms".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_delay_ms" }
        }
      val setTap2LevelDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_level_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_level_db" }
        }
      val setTap2Pan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
            "set_tap2_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tap2_pan" }
        }}
  }
}
