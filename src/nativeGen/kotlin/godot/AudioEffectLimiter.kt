// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectLimiter(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
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

  fun getCeilingDb(): Float {
    val _ret = __method_bind.getCeilingDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getSoftClipDb(): Float {
    val _ret = __method_bind.getSoftClipDb.call(this._handle)
    return _ret.asFloat()
  }

  fun getSoftClipRatio(): Float {
    val _ret = __method_bind.getSoftClipRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getThresholdDb(): Float {
    val _ret = __method_bind.getThresholdDb.call(this._handle)
    return _ret.asFloat()
  }

  fun setCeilingDb(ceiling: Float) {
    val _arg = Variant.new(ceiling)
    __method_bind.setCeilingDb.call(this._handle, listOf(_arg))
  }

  fun setSoftClipDb(softClip: Float) {
    val _arg = Variant.new(softClip)
    __method_bind.setSoftClipDb.call(this._handle, listOf(_arg))
  }

  fun setSoftClipRatio(softClip: Float) {
    val _arg = Variant.new(softClip)
    __method_bind.setSoftClipRatio.call(this._handle, listOf(_arg))
  }

  fun setThresholdDb(threshold: Float) {
    val _arg = Variant.new(threshold)
    __method_bind.setThresholdDb.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): AudioEffectLimiter = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectLimiter".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectLimiter" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectLimiter(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectLimiter = AudioEffectLimiter(ptr)
    /**
     * Container for method_bind pointers for AudioEffectLimiter
     */
    private object __method_bind {
      val getCeilingDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_ceiling_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ceiling_db" }
        }
      val getSoftClipDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_soft_clip_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_soft_clip_db" }
        }
      val getSoftClipRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_soft_clip_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_soft_clip_ratio" }
        }
      val getThresholdDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "get_threshold_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_threshold_db" }
        }
      val setCeilingDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_ceiling_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ceiling_db" }
        }
      val setSoftClipDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_soft_clip_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_soft_clip_db" }
        }
      val setSoftClipRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_soft_clip_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_soft_clip_ratio" }
        }
      val setThresholdDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "set_threshold_db".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_threshold_db" }
        }}
  }
}
