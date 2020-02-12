// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class AudioStreamOGGVorbis(
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

  var loop: Boolean
    get() {
       return hasLoop() 
    }
    set(value) {
      setLoop(value)
    }

  var loopOffset: Float
    get() {
       return getLoopOffset() 
    }
    set(value) {
      setLoopOffset(value)
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

  fun getLoopOffset(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLoopOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun hasLoop(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasLoop.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setData(data: PoolByteArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setData.call(self._handle, listOf(data), null)
    }
  }

  fun setLoop(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLoop.call(self._handle, listOf(enable), null)
    }
  }

  fun setLoopOffset(seconds: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLoopOffset.call(self._handle, listOf(seconds), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioStreamOGGVorbis".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioStreamOGGVorbis" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AudioStreamOGGVorbis
     */
    private object __method_bind {
      val getData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val getLoopOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "get_loop_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loop_offset" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val setData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val setLoopOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioStreamOGGVorbis".cstr.ptr,
            "set_loop_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop_offset" }
        }}
  }
}
