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
    __method_bind.setCeilingDb.call(this._handle, _arg, 1)
  }

  fun setSoftClipDb(softClip: Float) {
    val _arg = Variant.new(softClip)
    __method_bind.setSoftClipDb.call(this._handle, _arg, 1)
  }

  fun setSoftClipRatio(softClip: Float) {
    val _arg = Variant.new(softClip)
    __method_bind.setSoftClipRatio.call(this._handle, _arg, 1)
  }

  fun setThresholdDb(threshold: Float) {
    val _arg = Variant.new(threshold)
    __method_bind.setThresholdDb.call(this._handle, _arg, 1)
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
            "getCeilingDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCeilingDb" }
        }
      val getSoftClipDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "getSoftClipDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSoftClipDb" }
        }
      val getSoftClipRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "getSoftClipRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSoftClipRatio" }
        }
      val getThresholdDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "getThresholdDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getThresholdDb" }
        }
      val setCeilingDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "setCeilingDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCeilingDb" }
        }
      val setSoftClipDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "setSoftClipDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSoftClipDb" }
        }
      val setSoftClipRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "setSoftClipRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSoftClipRatio" }
        }
      val setThresholdDb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectLimiter".cstr.ptr,
            "setThresholdDb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setThresholdDb" }
        }}
  }
}
