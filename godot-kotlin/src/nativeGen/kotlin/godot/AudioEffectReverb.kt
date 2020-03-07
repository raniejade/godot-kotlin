// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class AudioEffectReverb(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioEffect(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDamping(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDamping.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDry(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDry.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getHpf(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHpf.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPredelayFeedback(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPredelayFeedback.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPredelayMsec(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPredelayMsec.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRoomSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRoomSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpread(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpread.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getWet(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWet.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setDamping(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDamping.call(self._handle, listOf(amount), null)
    }
  }

  fun setDry(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDry.call(self._handle, listOf(amount), null)
    }
  }

  fun setHpf(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHpf.call(self._handle, listOf(amount), null)
    }
  }

  fun setPredelayFeedback(feedback: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPredelayFeedback.call(self._handle, listOf(feedback), null)
    }
  }

  fun setPredelayMsec(msec: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPredelayMsec.call(self._handle, listOf(msec), null)
    }
  }

  fun setRoomSize(size: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRoomSize.call(self._handle, listOf(size), null)
    }
  }

  fun setSpread(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpread.call(self._handle, listOf(amount), null)
    }
  }

  fun setWet(amount: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWet.call(self._handle, listOf(amount), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectReverb".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectReverb" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioEffectReverb
     */
    private object __method_bind {
      val getDamping: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_damping" }
            }
          }

      val getDry: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dry" }
            }
          }

      val getHpf: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_hpf".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hpf" }
            }
          }

      val getPredelayFeedback: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_predelay_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_predelay_feedback" }
            }
          }

      val getPredelayMsec: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_predelay_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_predelay_msec" }
            }
          }

      val getRoomSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_room_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_room_size" }
            }
          }

      val getSpread: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spread" }
            }
          }

      val getWet: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "get_wet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wet" }
            }
          }

      val setDamping: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_damping" }
            }
          }

      val setDry: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_dry".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dry" }
            }
          }

      val setHpf: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_hpf".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hpf" }
            }
          }

      val setPredelayFeedback: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_predelay_feedback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_predelay_feedback" }
            }
          }

      val setPredelayMsec: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_predelay_msec".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_predelay_msec" }
            }
          }

      val setRoomSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_room_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_room_size" }
            }
          }

      val setSpread: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_spread".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spread" }
            }
          }

      val setWet: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectReverb".cstr.ptr,
              "set_wet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wet" }
            }
          }
    }
  }
}
