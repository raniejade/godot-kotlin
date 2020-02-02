// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class AnimationNodeOneShot(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  var autorestart: Boolean
    get() {
       return hasAutorestart() 
    }
    set(value) {
      setAutorestart(value)
    }

  var autorestartDelay: Float
    get() {
       return getAutorestartDelay() 
    }
    set(value) {
      setAutorestartDelay(value)
    }

  var autorestartRandomDelay: Float
    get() {
       return getAutorestartRandomDelay() 
    }
    set(value) {
      setAutorestartRandomDelay(value)
    }

  var fadeinTime: Float
    get() {
       return getFadeinTime() 
    }
    set(value) {
      setFadeinTime(value)
    }

  var fadeoutTime: Float
    get() {
       return getFadeoutTime() 
    }
    set(value) {
      setFadeoutTime(value)
    }

  var sync: Boolean
    get() {
       return isUsingSync() 
    }
    set(value) {
      setUseSync(value)
    }

  fun getAutorestartDelay(): Float {
    val _ret = __method_bind.getAutorestartDelay.call(this._handle)
    return _ret.asFloat()
  }

  fun getAutorestartRandomDelay(): Float {
    val _ret = __method_bind.getAutorestartRandomDelay.call(this._handle)
    return _ret.asFloat()
  }

  fun getFadeinTime(): Float {
    val _ret = __method_bind.getFadeinTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getFadeoutTime(): Float {
    val _ret = __method_bind.getFadeoutTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getMixMode(): MixMode {
    val _ret = __method_bind.getMixMode.call(this._handle)
    return AnimationNodeOneShot.MixMode.from(_ret.asInt())
  }

  fun hasAutorestart(): Boolean {
    val _ret = __method_bind.hasAutorestart.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingSync(): Boolean {
    val _ret = __method_bind.isUsingSync.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAutorestart(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutorestart.call(this._handle, listOf(_arg))
  }

  fun setAutorestartDelay(enable: Float) {
    val _arg = Variant.new(enable)
    __method_bind.setAutorestartDelay.call(this._handle, listOf(_arg))
  }

  fun setAutorestartRandomDelay(enable: Float) {
    val _arg = Variant.new(enable)
    __method_bind.setAutorestartRandomDelay.call(this._handle, listOf(_arg))
  }

  fun setFadeinTime(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setFadeinTime.call(this._handle, listOf(_arg))
  }

  fun setFadeoutTime(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setFadeoutTime.call(this._handle, listOf(_arg))
  }

  fun setMixMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMixMode.call(this._handle, listOf(_arg))
  }

  fun setUseSync(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseSync.call(this._handle, listOf(_arg))
  }

  enum class MixMode(
    val value: Int
  ) {
    BLEND(0),

    ADD(1);

    companion object {
      fun from(value: Int): MixMode {
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
    val MIX_MODE_ADD: Int = 1

    val MIX_MODE_BLEND: Int = 0

    fun new(): AnimationNodeOneShot = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeOneShot".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeOneShot" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeOneShot(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeOneShot = AnimationNodeOneShot(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeOneShot
     */
    private object __method_bind {
      val getAutorestartDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "get_autorestart_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_autorestart_delay" }
        }
      val getAutorestartRandomDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "get_autorestart_random_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_autorestart_random_delay" }
        }
      val getFadeinTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "get_fadein_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fadein_time" }
        }
      val getFadeoutTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "get_fadeout_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fadeout_time" }
        }
      val getMixMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "get_mix_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mix_mode" }
        }
      val hasAutorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "has_autorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_autorestart" }
        }
      val isUsingSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "is_using_sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_sync" }
        }
      val setAutorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "set_autorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autorestart" }
        }
      val setAutorestartDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "set_autorestart_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autorestart_delay" }
        }
      val setAutorestartRandomDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "set_autorestart_random_delay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_autorestart_random_delay" }
        }
      val setFadeinTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "set_fadein_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fadein_time" }
        }
      val setFadeoutTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "set_fadeout_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fadeout_time" }
        }
      val setMixMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "set_mix_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mix_mode" }
        }
      val setUseSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "set_use_sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_sync" }
        }}
  }
}
