// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class AudioEffectPhaser(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  var depth: Float
    get() {
       return getDepth() 
    }
    set(value) {
      setDepth(value)
    }

  var feedback: Float
    get() {
       return getFeedback() 
    }
    set(value) {
      setFeedback(value)
    }

  var rangeMaxHz: Float
    get() {
       return getRangeMaxHz() 
    }
    set(value) {
      setRangeMaxHz(value)
    }

  var rangeMinHz: Float
    get() {
       return getRangeMinHz() 
    }
    set(value) {
      setRangeMinHz(value)
    }

  var rateHz: Float
    get() {
       return getRateHz() 
    }
    set(value) {
      setRateHz(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDepth(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepth.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFeedback(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFeedback.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRangeMaxHz(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRangeMaxHz.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRangeMinHz(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRangeMinHz.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRateHz(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRateHz.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setDepth(depth: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepth.call(self._handle, listOf(depth), null)
    }
  }

  fun setFeedback(fbk: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFeedback.call(self._handle, listOf(fbk), null)
    }
  }

  fun setRangeMaxHz(hz: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRangeMaxHz.call(self._handle, listOf(hz), null)
    }
  }

  fun setRangeMinHz(hz: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRangeMinHz.call(self._handle, listOf(hz), null)
    }
  }

  fun setRateHz(hz: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRateHz.call(self._handle, listOf(hz), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPhaser".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectPhaser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectPhaser
     */
    private object __method_bind {
      val getDepth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth" }
            }
          }

      val getFeedback: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_feedback" }
            }
          }

      val getRangeMaxHz: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_range_max_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range_max_hz" }
            }
          }

      val getRangeMinHz: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_range_min_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range_min_hz" }
            }
          }

      val getRateHz: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "get_rate_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rate_hz" }
            }
          }

      val setDepth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth" }
            }
          }

      val setFeedback: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_feedback" }
            }
          }

      val setRangeMaxHz: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_range_max_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range_max_hz" }
            }
          }

      val setRangeMinHz: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_range_min_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range_min_hz" }
            }
          }

      val setRateHz: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
              "set_rate_hz".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rate_hz" }
            }
          }
    }
  }
}
