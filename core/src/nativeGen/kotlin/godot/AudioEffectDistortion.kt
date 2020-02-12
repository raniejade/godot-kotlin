// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
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

open class AudioEffectDistortion(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
  var drive: Float
    get() {
       return getDrive() 
    }
    set(value) {
      setDrive(value)
    }

  var keepHfHz: Float
    get() {
       return getKeepHfHz() 
    }
    set(value) {
      setKeepHfHz(value)
    }

  var mode: Mode
    get() {
       return getMode() 
    }
    set(value) {
      setMode(value.value)
    }

  var postGain: Float
    get() {
       return getPostGain() 
    }
    set(value) {
      setPostGain(value)
    }

  var preGain: Float
    get() {
       return getPreGain() 
    }
    set(value) {
      setPreGain(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDrive(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDrive.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getKeepHfHz(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getKeepHfHz.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMode(): Mode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMode.call(self._handle, emptyList(), _retPtr)
      AudioEffectDistortion.Mode.from(_ret.value)
    }
  }

  fun getPostGain(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPostGain.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPreGain(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPreGain.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setDrive(drive: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrive.call(self._handle, listOf(drive), null)
    }
  }

  fun setKeepHfHz(keepHfHz: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setKeepHfHz.call(self._handle, listOf(keepHfHz), null)
    }
  }

  fun setMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setPostGain(postGain: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPostGain.call(self._handle, listOf(postGain), null)
    }
  }

  fun setPreGain(preGain: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPreGain.call(self._handle, listOf(preGain), null)
    }
  }

  enum class Mode(
    val value: Int
  ) {
    CLIP(0),

    ATAN(1),

    LOFI(2),

    OVERDRIVE(3),

    WAVESHAPE(4);

    companion object {
      fun from(value: Int): Mode {
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
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDistortion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectDistortion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectDistortion
     */
    private object __method_bind {
      val getDrive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive" }
        }
      val getKeepHfHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_keep_hf_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keep_hf_hz" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getPostGain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_post_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_post_gain" }
        }
      val getPreGain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_pre_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pre_gain" }
        }
      val setDrive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drive" }
        }
      val setKeepHfHz: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_keep_hf_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_hf_hz" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setPostGain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_post_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_post_gain" }
        }
      val setPreGain: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_pre_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pre_gain" }
        }}
  }
}
