// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectDistortion(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
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

  fun getDrive(): Float {
    val _ret = __method_bind.getDrive.call(this._handle)
    return _ret.asFloat()
  }

  fun getKeepHfHz(): Float {
    val _ret = __method_bind.getKeepHfHz.call(this._handle)
    return _ret.asFloat()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return AudioEffectDistortion.Mode.from(_ret.asInt())
  }

  fun getPostGain(): Float {
    val _ret = __method_bind.getPostGain.call(this._handle)
    return _ret.asFloat()
  }

  fun getPreGain(): Float {
    val _ret = __method_bind.getPreGain.call(this._handle)
    return _ret.asFloat()
  }

  fun setDrive(drive: Float) {
    val _arg = Variant.new(drive)
    __method_bind.setDrive.call(this._handle, listOf(_arg))
  }

  fun setKeepHfHz(keepHfHz: Float) {
    val _arg = Variant.new(keepHfHz)
    __method_bind.setKeepHfHz.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setPostGain(postGain: Float) {
    val _arg = Variant.new(postGain)
    __method_bind.setPostGain.call(this._handle, listOf(_arg))
  }

  fun setPreGain(preGain: Float) {
    val _arg = Variant.new(preGain)
    __method_bind.setPreGain.call(this._handle, listOf(_arg))
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_CLIP(0),

    MODE_ATAN(1),

    MODE_LOFI(2),

    MODE_OVERDRIVE(3),

    MODE_WAVESHAPE(4);

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
    val MODE_ATAN: Int = 1

    val MODE_CLIP: Int = 0

    val MODE_LOFI: Int = 2

    val MODE_OVERDRIVE: Int = 3

    val MODE_WAVESHAPE: Int = 4

    fun new(): AudioEffectDistortion = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectDistortion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectDistortion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectDistortion(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectDistortion = AudioEffectDistortion(ptr)
    /**
     * Container for method_bind pointers for AudioEffectDistortion
     */
    private object __method_bind {
      val getDrive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive" }
        }
      val getKeepHfHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_keep_hf_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keep_hf_hz" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getPostGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_post_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_post_gain" }
        }
      val getPreGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_pre_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pre_gain" }
        }
      val setDrive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drive" }
        }
      val setKeepHfHz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_keep_hf_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_hf_hz" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setPostGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_post_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_post_gain" }
        }
      val setPreGain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_pre_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pre_gain" }
        }}
  }
}
