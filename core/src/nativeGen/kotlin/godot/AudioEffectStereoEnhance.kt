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

open class AudioEffectStereoEnhance(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  var panPullout: Float
    get() {
       return getPanPullout() 
    }
    set(value) {
      setPanPullout(value)
    }

  var surround: Float
    get() {
       return getSurround() 
    }
    set(value) {
      setSurround(value)
    }

  var timePulloutMs: Float
    get() {
       return getTimePullout() 
    }
    set(value) {
      setTimePullout(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getPanPullout(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPanPullout.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSurround(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSurround.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTimePullout(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimePullout.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setPanPullout(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPanPullout.call(self._handle, listOf(amount), null)
    }
  }

  fun setSurround(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSurround.call(self._handle, listOf(amount), null)
    }
  }

  fun setTimePullout(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTimePullout.call(self._handle, listOf(amount), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectStereoEnhance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectStereoEnhance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectStereoEnhance
     */
    private object __method_bind {
      val getPanPullout: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "get_pan_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pan_pullout" }
        }
      val getSurround: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "get_surround".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surround" }
        }
      val getTimePullout: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "get_time_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_pullout" }
        }
      val setPanPullout: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "set_pan_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pan_pullout" }
        }
      val setSurround: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "set_surround".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_surround" }
        }
      val setTimePullout: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "set_time_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_time_pullout" }
        }}
  }
}
