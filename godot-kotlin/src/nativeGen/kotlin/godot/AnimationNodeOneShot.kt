// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class AnimationNodeOneShot(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AnimationNode(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAutorestartDelay(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAutorestartDelay.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAutorestartRandomDelay(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAutorestartRandomDelay.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFadeinTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFadeinTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFadeoutTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFadeoutTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMixMode(): MixMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMixMode.call(self._handle, emptyList(), _retPtr)
      AnimationNodeOneShot.MixMode.from(_ret.value)
    }
  }

  fun hasAutorestart(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAutorestart.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingSync(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingSync.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAutorestart(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutorestart.call(self._handle, listOf(enable), null)
    }
  }

  fun setAutorestartDelay(enable: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutorestartDelay.call(self._handle, listOf(enable), null)
    }
  }

  fun setAutorestartRandomDelay(enable: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutorestartRandomDelay.call(self._handle, listOf(enable), null)
    }
  }

  fun setFadeinTime(time: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFadeinTime.call(self._handle, listOf(time), null)
    }
  }

  fun setFadeoutTime(time: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFadeoutTime.call(self._handle, listOf(time), null)
    }
  }

  fun setMixMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMixMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setUseSync(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseSync.call(self._handle, listOf(enable), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeOneShot".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeOneShot" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationNodeOneShot
     */
    private object __method_bind {
      val getAutorestartDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_autorestart_delay" }
            }
          }

      val getAutorestartRandomDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_autorestart_random_delay" }
            }
          }

      val getFadeinTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fadein_time" }
            }
          }

      val getFadeoutTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fadeout_time" }
            }
          }

      val getMixMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "get_mix_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_mode" }
            }
          }

      val hasAutorestart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "has_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_autorestart" }
            }
          }

      val isUsingSync: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "is_using_sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_sync" }
            }
          }

      val setAutorestart: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_autorestart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autorestart" }
            }
          }

      val setAutorestartDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_autorestart_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autorestart_delay" }
            }
          }

      val setAutorestartRandomDelay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_autorestart_random_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autorestart_random_delay" }
            }
          }

      val setFadeinTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_fadein_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fadein_time" }
            }
          }

      val setFadeoutTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_fadeout_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fadeout_time" }
            }
          }

      val setMixMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_mix_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mix_mode" }
            }
          }

      val setUseSync: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeOneShot".cstr.ptr,
              "set_use_sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_sync" }
            }
          }
    }
  }
}
