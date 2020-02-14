// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
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

open class StreamPeerBuffer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : StreamPeer(null) {
  var dataArray: PoolByteArray
    get() {
       return getDataArray() 
    }
    set(value) {
      setDataArray(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for dataArray
   */
  fun dataArray(cb: PoolByteArray.() -> Unit) {
    val _p = dataArray
    cb(_p)
    dataArray = _p
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun duplicate(): StreamPeerBuffer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: StreamPeerBuffer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.duplicate.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<StreamPeerBuffer>(_tmp.value!!)
      _ret
    }
  }

  fun getDataArray(): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getDataArray.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPosition(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPosition.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun resize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.resize.call(self._handle, listOf(size), null)
    }
  }

  fun seek(position: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.seek.call(self._handle, listOf(position), null)
    }
  }

  fun setDataArray(data: PoolByteArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDataArray.call(self._handle, listOf(data), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerBuffer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StreamPeerBuffer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StreamPeerBuffer
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val duplicate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "duplicate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method duplicate" }
        }
      val getDataArray: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "get_data_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data_array" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val resize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "resize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resize" }
        }
      val seek: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setDataArray: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "set_data_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data_array" }
        }}
  }
}
