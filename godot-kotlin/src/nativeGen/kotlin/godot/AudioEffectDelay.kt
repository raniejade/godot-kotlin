// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class AudioEffectDelay(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDry(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDry.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFeedbackDelayMs(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFeedbackDelayMs.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFeedbackLevelDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFeedbackLevelDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFeedbackLowpass(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFeedbackLowpass.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTap1DelayMs(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTap1DelayMs.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTap1LevelDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTap1LevelDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTap1Pan(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTap1Pan.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTap2DelayMs(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTap2DelayMs.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTap2LevelDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTap2LevelDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTap2Pan(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTap2Pan.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isFeedbackActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFeedbackActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isTap1Active(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isTap1Active.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isTap2Active(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isTap2Active.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDry(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDry.call(self._handle, listOf(amount), null)
    }
  }

  fun setFeedbackActive(amount: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFeedbackActive.call(self._handle, listOf(amount), null)
    }
  }

  fun setFeedbackDelayMs(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFeedbackDelayMs.call(self._handle, listOf(amount), null)
    }
  }

  fun setFeedbackLevelDb(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFeedbackLevelDb.call(self._handle, listOf(amount), null)
    }
  }

  fun setFeedbackLowpass(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFeedbackLowpass.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap1Active(amount: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap1Active.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap1DelayMs(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap1DelayMs.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap1LevelDb(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap1LevelDb.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap1Pan(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap1Pan.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap2Active(amount: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap2Active.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap2DelayMs(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap2DelayMs.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap2LevelDb(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap2LevelDb.call(self._handle, listOf(amount), null)
    }
  }

  fun setTap2Pan(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTap2Pan.call(self._handle, listOf(amount), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDelay".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectDelay" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectDelay
     */
    private object __method_bind {
      val getDry: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dry" }
            }
          }

      val getFeedbackDelayMs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_feedback_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback_delay_ms" }
            }
          }

      val getFeedbackLevelDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_feedback_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback_level_db" }
            }
          }

      val getFeedbackLowpass: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_feedback_lowpass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback_lowpass" }
            }
          }

      val getTap1DelayMs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap1_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap1_delay_ms" }
            }
          }

      val getTap1LevelDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap1_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap1_level_db" }
            }
          }

      val getTap1Pan: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap1_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap1_pan" }
            }
          }

      val getTap2DelayMs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap2_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap2_delay_ms" }
            }
          }

      val getTap2LevelDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap2_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap2_level_db" }
            }
          }

      val getTap2Pan: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "get_tap2_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tap2_pan" }
            }
          }

      val isFeedbackActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "is_feedback_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_feedback_active" }
            }
          }

      val isTap1Active: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "is_tap1_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_tap1_active" }
            }
          }

      val isTap2Active: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "is_tap2_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_tap2_active" }
            }
          }

      val setDry: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dry" }
            }
          }

      val setFeedbackActive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_active" }
            }
          }

      val setFeedbackDelayMs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_delay_ms" }
            }
          }

      val setFeedbackLevelDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_level_db" }
            }
          }

      val setFeedbackLowpass: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_feedback_lowpass".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback_lowpass" }
            }
          }

      val setTap1Active: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_active" }
            }
          }

      val setTap1DelayMs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_delay_ms" }
            }
          }

      val setTap1LevelDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_level_db" }
            }
          }

      val setTap1Pan: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap1_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap1_pan" }
            }
          }

      val setTap2Active: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_active" }
            }
          }

      val setTap2DelayMs: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_delay_ms".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_delay_ms" }
            }
          }

      val setTap2LevelDb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_level_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_level_db" }
            }
          }

      val setTap2Pan: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDelay".cstr.ptr,
              "set_tap2_pan".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tap2_pan" }
            }
          }
    }
  }
}
