// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
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
    __method_bind.setPanPullout.call(this._handle, listOf(_arg))
  }

  fun setSurround(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setSurround.call(this._handle, listOf(_arg))
  }

  fun setTimePullout(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setTimePullout.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "get_pan_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pan_pullout" }
        }
      val getSurround: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "get_surround".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_surround" }
        }
      val getTimePullout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "get_time_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_pullout" }
        }
      val setPanPullout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "set_pan_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pan_pullout" }
        }
      val setSurround: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "set_surround".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_surround" }
        }
      val setTimePullout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectStereoEnhance".cstr.ptr,
            "set_time_pullout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_time_pullout" }
        }}
  }
}
