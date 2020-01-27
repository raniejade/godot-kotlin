// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
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
  fun getDrive(): Float {
    val _ret = __method_bind.get_drive.call(this._handle)
    return _ret.asFloat()
  }

  fun getKeepHfHz(): Float {
    val _ret = __method_bind.get_keep_hf_hz.call(this._handle)
    return _ret.asFloat()
  }

  fun getMode(): Mode {
    val _ret = __method_bind.get_mode.call(this._handle)
    return AudioEffectDistortion.Mode.from(_ret.asInt())
  }

  fun getPostGain(): Float {
    val _ret = __method_bind.get_post_gain.call(this._handle)
    return _ret.asFloat()
  }

  fun getPreGain(): Float {
    val _ret = __method_bind.get_pre_gain.call(this._handle)
    return _ret.asFloat()
  }

  fun setDrive(drive: Float) {
    val _arg = Variant.new(drive)
    __method_bind.set_drive.call(this._handle, _arg, 1)
  }

  fun setKeepHfHz(keepHfHz: Float) {
    val _arg = Variant.new(keepHfHz)
    __method_bind.set_keep_hf_hz.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_mode.call(this._handle, _arg, 1)
  }

  fun setPostGain(postGain: Float) {
    val _arg = Variant.new(postGain)
    __method_bind.set_post_gain.call(this._handle, _arg, 1)
  }

  fun setPreGain(preGain: Float) {
    val _arg = Variant.new(preGain)
    __method_bind.set_pre_gain.call(this._handle, _arg, 1)
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
      val get_drive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drive" }
        }
      val get_keep_hf_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_keep_hf_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keep_hf_hz" }
        }
      val get_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val get_post_gain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_post_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_post_gain" }
        }
      val get_pre_gain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "get_pre_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pre_gain" }
        }
      val set_drive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_drive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drive" }
        }
      val set_keep_hf_hz: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_keep_hf_hz".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_hf_hz" }
        }
      val set_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val set_post_gain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_post_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_post_gain" }
        }
      val set_pre_gain: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectDistortion".cstr.ptr,
            "set_pre_gain".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pre_gain" }
        }}
  }
}
