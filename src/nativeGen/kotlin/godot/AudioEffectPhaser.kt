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

open class AudioEffectPhaser(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
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

  fun getDepth(): Float {
    val _ret = __method_bind.getDepth.call(this._handle)
    return _ret.asFloat()
  }

  fun getFeedback(): Float {
    val _ret = __method_bind.getFeedback.call(this._handle)
    return _ret.asFloat()
  }

  fun getRangeMaxHz(): Float {
    val _ret = __method_bind.getRangeMaxHz.call(this._handle)
    return _ret.asFloat()
  }

  fun getRangeMinHz(): Float {
    val _ret = __method_bind.getRangeMinHz.call(this._handle)
    return _ret.asFloat()
  }

  fun getRateHz(): Float {
    val _ret = __method_bind.getRateHz.call(this._handle)
    return _ret.asFloat()
  }

  fun setDepth(depth: Float) {
    val _arg = Variant.new(depth)
    __method_bind.setDepth.call(this._handle, _arg, 1)
  }

  fun setFeedback(fbk: Float) {
    val _arg = Variant.new(fbk)
    __method_bind.setFeedback.call(this._handle, _arg, 1)
  }

  fun setRangeMaxHz(hz: Float) {
    val _arg = Variant.new(hz)
    __method_bind.setRangeMaxHz.call(this._handle, _arg, 1)
  }

  fun setRangeMinHz(hz: Float) {
    val _arg = Variant.new(hz)
    __method_bind.setRangeMinHz.call(this._handle, _arg, 1)
  }

  fun setRateHz(hz: Float) {
    val _arg = Variant.new(hz)
    __method_bind.setRateHz.call(this._handle, _arg, 1)
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
      val getDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "getDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepth" }
        }
      val getFeedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "getFeedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFeedback" }
        }
      val getRangeMaxHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "getRangeMaxHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRangeMaxHz" }
        }
      val getRangeMinHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "getRangeMinHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRangeMinHz" }
        }
      val getRateHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "getRateHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRateHz" }
        }
      val setDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "setDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepth" }
        }
      val setFeedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "setFeedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFeedback" }
        }
      val setRangeMaxHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "setRangeMaxHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRangeMaxHz" }
        }
      val setRangeMinHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "setRangeMinHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRangeMinHz" }
        }
      val setRateHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPhaser".cstr.ptr,
            "setRateHz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRateHz" }
        }}
  }
}
