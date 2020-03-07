// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class AudioStreamSample(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : AudioStream(null) {
  var data: PoolByteArray
    get() {
       return getData() 
    }
    set(value) {
      setData(value)
    }

  var format: Format
    get() {
       return getFormat() 
    }
    set(value) {
      setFormat(value.value)
    }

  var loopBegin: Int
    get() {
       return getLoopBegin() 
    }
    set(value) {
      setLoopBegin(value)
    }

  var loopEnd: Int
    get() {
       return getLoopEnd() 
    }
    set(value) {
      setLoopEnd(value)
    }

  var loopMode: LoopMode
    get() {
       return getLoopMode() 
    }
    set(value) {
      setLoopMode(value.value)
    }

  var mixRate: Int
    get() {
       return getMixRate() 
    }
    set(value) {
      setMixRate(value)
    }

  var stereo: Boolean
    get() {
       return isStereo() 
    }
    set(value) {
      setStereo(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for data
   */
  fun data(cb: PoolByteArray.() -> Unit) {
    val _p = data
    cb(_p)
    data = _p
  }

  fun getData(): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getData.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFormat(): Format {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFormat.call(self._handle, emptyList(), _retPtr)
      AudioStreamSample.Format.from(_ret.value)
    }
  }

  fun getLoopBegin(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLoopBegin.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLoopEnd(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLoopEnd.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLoopMode(): LoopMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLoopMode.call(self._handle, emptyList(), _retPtr)
      AudioStreamSample.LoopMode.from(_ret.value)
    }
  }

  fun getMixRate(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMixRate.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isStereo(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isStereo.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun saveToWav(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.saveToWav.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setData(data: PoolByteArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setData.call(self._handle, listOf(data), null)
    }
  }

  fun setFormat(format: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFormat.call(self._handle, listOf(format), null)
    }
  }

  fun setLoopBegin(loopBegin: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLoopBegin.call(self._handle, listOf(loopBegin), null)
    }
  }

  fun setLoopEnd(loopEnd: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLoopEnd.call(self._handle, listOf(loopEnd), null)
    }
  }

  fun setLoopMode(loopMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLoopMode.call(self._handle, listOf(loopMode), null)
    }
  }

  fun setMixRate(mixRate: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMixRate.call(self._handle, listOf(mixRate), null)
    }
  }

  fun setStereo(stereo: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStereo.call(self._handle, listOf(stereo), null)
    }
  }

  enum class LoopMode(
    val value: Int
  ) {
    DISABLED(0),

    FORWARD(1),

    PING_PONG(2),

    BACKWARD(3);

    companion object {
      fun from(value: Int): LoopMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Format(
    val value: Int
  ) {
    `8_BITS`(0),

    `16_BITS`(1),

    IMA_ADPCM(2);

    companion object {
      fun from(value: Int): Format {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamSample".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamSample" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioStreamSample
     */
    private object __method_bind {
      val getData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val getFormat: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val getLoopBegin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_loop_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loop_begin" }
            }
          }

      val getLoopEnd: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_loop_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loop_end" }
            }
          }

      val getLoopMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_loop_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loop_mode" }
            }
          }

      val getMixRate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "get_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mix_rate" }
            }
          }

      val isStereo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "is_stereo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_stereo" }
            }
          }

      val saveToWav: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "save_to_wav".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_to_wav" }
            }
          }

      val setData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data" }
            }
          }

      val setFormat: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_format" }
            }
          }

      val setLoopBegin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_loop_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop_begin" }
            }
          }

      val setLoopEnd: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_loop_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop_end" }
            }
          }

      val setLoopMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_loop_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop_mode" }
            }
          }

      val setMixRate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_mix_rate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mix_rate" }
            }
          }

      val setStereo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamSample".cstr.ptr,
              "set_stereo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stereo" }
            }
          }
    }
  }
}
