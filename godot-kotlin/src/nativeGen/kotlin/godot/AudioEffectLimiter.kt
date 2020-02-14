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

open class AudioEffectLimiter(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  var ceilingDb: Float
    get() {
       return getCeilingDb() 
    }
    set(value) {
      setCeilingDb(value)
    }

  var softClipDb: Float
    get() {
       return getSoftClipDb() 
    }
    set(value) {
      setSoftClipDb(value)
    }

  var softClipRatio: Float
    get() {
       return getSoftClipRatio() 
    }
    set(value) {
      setSoftClipRatio(value)
    }

  var thresholdDb: Float
    get() {
       return getThresholdDb() 
    }
    set(value) {
      setThresholdDb(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCeilingDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCeilingDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSoftClipDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSoftClipDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSoftClipRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSoftClipRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getThresholdDb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getThresholdDb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setCeilingDb(ceiling: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCeilingDb.call(self._handle, listOf(ceiling), null)
    }
  }

  fun setSoftClipDb(softClip: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSoftClipDb.call(self._handle, listOf(softClip), null)
    }
  }

  fun setSoftClipRatio(softClip: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSoftClipRatio.call(self._handle, listOf(softClip), null)
    }
  }

  fun setThresholdDb(threshold: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setThresholdDb.call(self._handle, listOf(threshold), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectLimiter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectLimiter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectLimiter
     */
    private object __method_bind {
      val getCeilingDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_ceiling_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ceiling_db" }
        }
      val getSoftClipDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_soft_clip_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_soft_clip_db" }
        }
      val getSoftClipRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_soft_clip_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_soft_clip_ratio" }
        }
      val getThresholdDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_threshold_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_threshold_db" }
        }
      val setCeilingDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_ceiling_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ceiling_db" }
        }
      val setSoftClipDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_soft_clip_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_soft_clip_db" }
        }
      val setSoftClipRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_soft_clip_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_soft_clip_ratio" }
        }
      val setThresholdDb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_threshold_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_threshold_db" }
        }}
  }
}
