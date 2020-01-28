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

open class AudioEffectStereoEnhance(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
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

  fun getPanPullout(): Float {
    val _ret = __method_bind.getPanPullout.call(this._handle)
    return _ret.asFloat()
  }

  fun getSurround(): Float {
    val _ret = __method_bind.getSurround.call(this._handle)
    return _ret.asFloat()
  }

  fun getTimePullout(): Float {
    val _ret = __method_bind.getTimePullout.call(this._handle)
    return _ret.asFloat()
  }

  fun setPanPullout(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setPanPullout.call(this._handle, _arg, 1)
  }

  fun setSurround(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setSurround.call(this._handle, _arg, 1)
  }

  fun setTimePullout(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTimePullout.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectStereoEnhance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectStereoEnhance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectStereoEnhance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectStereoEnhance(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectStereoEnhance = AudioEffectStereoEnhance(ptr)
    /**
     * Container for method_bind pointers for AudioEffectStereoEnhance
     */
    private object __method_bind {
      val getPanPullout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "getPanPullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPanPullout" }
        }
      val getSurround: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "getSurround".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSurround" }
        }
      val getTimePullout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "getTimePullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTimePullout" }
        }
      val setPanPullout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "setPanPullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPanPullout" }
        }
      val setSurround: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "setSurround".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSurround" }
        }
      val setTimePullout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "setTimePullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTimePullout" }
        }}
  }
}
