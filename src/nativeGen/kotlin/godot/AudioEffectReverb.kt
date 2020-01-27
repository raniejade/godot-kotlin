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

open class AudioEffectReverb(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getDamping(): Float {
    val _ret = __method_bind.get_damping.call(this._handle)
    return _ret.asFloat()
  }

  fun getDry(): Float {
    val _ret = __method_bind.get_dry.call(this._handle)
    return _ret.asFloat()
  }

  fun getHpf(): Float {
    val _ret = __method_bind.get_hpf.call(this._handle)
    return _ret.asFloat()
  }

  fun getPredelayFeedback(): Float {
    val _ret = __method_bind.get_predelay_feedback.call(this._handle)
    return _ret.asFloat()
  }

  fun getPredelayMsec(): Float {
    val _ret = __method_bind.get_predelay_msec.call(this._handle)
    return _ret.asFloat()
  }

  fun getRoomSize(): Float {
    val _ret = __method_bind.get_room_size.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpread(): Float {
    val _ret = __method_bind.get_spread.call(this._handle)
    return _ret.asFloat()
  }

  fun getWet(): Float {
    val _ret = __method_bind.get_wet.call(this._handle)
    return _ret.asFloat()
  }

  fun setDamping(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_damping.call(this._handle, _arg, 1)
  }

  fun setDry(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_dry.call(this._handle, _arg, 1)
  }

  fun setHpf(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_hpf.call(this._handle, _arg, 1)
  }

  fun setPredelayFeedback(feedback: Float) {
    val _arg = Variant.new(feedback)
    __method_bind.set_predelay_feedback.call(this._handle, _arg, 1)
  }

  fun setPredelayMsec(msec: Float) {
    val _arg = Variant.new(msec)
    __method_bind.set_predelay_msec.call(this._handle, _arg, 1)
  }

  fun setRoomSize(size: Float) {
    val _arg = Variant.new(size)
    __method_bind.set_room_size.call(this._handle, _arg, 1)
  }

  fun setSpread(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_spread.call(this._handle, _arg, 1)
  }

  fun setWet(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.set_wet.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectReverb = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectReverb".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectReverb" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectReverb(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectReverb = AudioEffectReverb(ptr)
    /**
     * Container for method_bind pointers for AudioEffectReverb
     */
    private object __method_bind {
      val get_damping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_damping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping" }
        }
      val get_dry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dry" }
        }
      val get_hpf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_hpf".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hpf" }
        }
      val get_predelay_feedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_predelay_feedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_predelay_feedback" }
        }
      val get_predelay_msec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_predelay_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_predelay_msec" }
        }
      val get_room_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_room_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_room_size" }
        }
      val get_spread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spread" }
        }
      val get_wet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wet" }
        }
      val set_damping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_damping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping" }
        }
      val set_dry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dry" }
        }
      val set_hpf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_hpf".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hpf" }
        }
      val set_predelay_feedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_predelay_feedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_predelay_feedback" }
        }
      val set_predelay_msec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_predelay_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_predelay_msec" }
        }
      val set_room_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_room_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_room_size" }
        }
      val set_spread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spread" }
        }
      val set_wet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wet" }
        }}
  }
}
