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
  var damping: Float
    get() {
       return getDamping() 
    }
    set(value) {
      setDamping(value)
    }

  var dry: Float
    get() {
       return getDry() 
    }
    set(value) {
      setDry(value)
    }

  var hipass: Float
    get() {
       return getHpf() 
    }
    set(value) {
      setHpf(value)
    }

  var predelayFeedback: Float
    get() {
       return getPredelayFeedback() 
    }
    set(value) {
      setPredelayFeedback(value)
    }

  var predelayMsec: Float
    get() {
       return getPredelayMsec() 
    }
    set(value) {
      setPredelayMsec(value)
    }

  var roomSize: Float
    get() {
       return getRoomSize() 
    }
    set(value) {
      setRoomSize(value)
    }

  var spread: Float
    get() {
       return getSpread() 
    }
    set(value) {
      setSpread(value)
    }

  var wet: Float
    get() {
       return getWet() 
    }
    set(value) {
      setWet(value)
    }

  fun getDamping(): Float {
    val _ret = __method_bind.getDamping.call(this._handle)
    return _ret.asFloat()
  }

  fun getDry(): Float {
    val _ret = __method_bind.getDry.call(this._handle)
    return _ret.asFloat()
  }

  fun getHpf(): Float {
    val _ret = __method_bind.getHpf.call(this._handle)
    return _ret.asFloat()
  }

  fun getPredelayFeedback(): Float {
    val _ret = __method_bind.getPredelayFeedback.call(this._handle)
    return _ret.asFloat()
  }

  fun getPredelayMsec(): Float {
    val _ret = __method_bind.getPredelayMsec.call(this._handle)
    return _ret.asFloat()
  }

  fun getRoomSize(): Float {
    val _ret = __method_bind.getRoomSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpread(): Float {
    val _ret = __method_bind.getSpread.call(this._handle)
    return _ret.asFloat()
  }

  fun getWet(): Float {
    val _ret = __method_bind.getWet.call(this._handle)
    return _ret.asFloat()
  }

  fun setDamping(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setDamping.call(this._handle, listOf(_arg))
  }

  fun setDry(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setDry.call(this._handle, listOf(_arg))
  }

  fun setHpf(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setHpf.call(this._handle, listOf(_arg))
  }

  fun setPredelayFeedback(feedback: Float) {
    val _arg = Variant.new(feedback)
    __method_bind.setPredelayFeedback.call(this._handle, listOf(_arg))
  }

  fun setPredelayMsec(msec: Float) {
    val _arg = Variant.new(msec)
    __method_bind.setPredelayMsec.call(this._handle, listOf(_arg))
  }

  fun setRoomSize(size: Float) {
    val _arg = Variant.new(size)
    __method_bind.setRoomSize.call(this._handle, listOf(_arg))
  }

  fun setSpread(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setSpread.call(this._handle, listOf(_arg))
  }

  fun setWet(amount: Float) {
    val _arg = Variant.new(amount)
    __method_bind.setWet.call(this._handle, listOf(_arg))
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
      val getDamping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_damping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping" }
        }
      val getDry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dry" }
        }
      val getHpf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_hpf".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hpf" }
        }
      val getPredelayFeedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_predelay_feedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_predelay_feedback" }
        }
      val getPredelayMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_predelay_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_predelay_msec" }
        }
      val getRoomSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_room_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_room_size" }
        }
      val getSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spread" }
        }
      val getWet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "get_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wet" }
        }
      val setDamping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_damping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping" }
        }
      val setDry: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_dry".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dry" }
        }
      val setHpf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_hpf".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hpf" }
        }
      val setPredelayFeedback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_predelay_feedback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_predelay_feedback" }
        }
      val setPredelayMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_predelay_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_predelay_msec" }
        }
      val setRoomSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_room_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_room_size" }
        }
      val setSpread: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_spread".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spread" }
        }
      val setWet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
            "set_wet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wet" }
        }}
  }
}
