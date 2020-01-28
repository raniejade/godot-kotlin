// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
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
    __method_bind.setAutorestart.call(this._handle, _arg, 1)
  }

  fun setAutorestartDelay(enable: Float) {
    val _arg = Variant.new(enable)
    __method_bind.setAutorestartDelay.call(this._handle, _arg, 1)
  }

  fun setAutorestartRandomDelay(enable: Float) {
    val _arg = Variant.new(enable)
    __method_bind.setAutorestartRandomDelay.call(this._handle, _arg, 1)
  }

  fun setFadeinTime(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setFadeinTime.call(this._handle, _arg, 1)
  }

  fun setFadeoutTime(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setFadeoutTime.call(this._handle, _arg, 1)
  }

  fun setMixMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMixMode.call(this._handle, _arg, 1)
  }

  fun setUseSync(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseSync.call(this._handle, _arg, 1)
  }

  enum class MixMode(
    val value: Int
  ) {
    MIX_MODE_BLEND(0),

    MIX_MODE_ADD(1);

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
            "getAutorestartDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAutorestartDelay" }
        }
      val getAutorestartRandomDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "getAutorestartRandomDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAutorestartRandomDelay" }
        }
      val getFadeinTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "getFadeinTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFadeinTime" }
        }
      val getFadeoutTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "getFadeoutTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFadeoutTime" }
        }
      val getMixMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "getMixMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMixMode" }
        }
      val hasAutorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "hasAutorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAutorestart" }
        }
      val isUsingSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "isUsingSync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingSync" }
        }
      val setAutorestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "setAutorestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutorestart" }
        }
      val setAutorestartDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "setAutorestartDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutorestartDelay" }
        }
      val setAutorestartRandomDelay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "setAutorestartRandomDelay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutorestartRandomDelay" }
        }
      val setFadeinTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "setFadeinTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFadeinTime" }
        }
      val setFadeoutTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "setFadeoutTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFadeoutTime" }
        }
      val setMixMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "setMixMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMixMode" }
        }
      val setUseSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
            "setUseSync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseSync" }
        }}
  }
}
