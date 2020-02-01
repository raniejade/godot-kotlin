// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeerBuffer(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  var dataArray: PoolByteArray
    get() {
       return getDataArray() 
    }
    set(value) {
      setDataArray(value)
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
    __method_bind.clear.call(this._handle)
  }

  fun duplicate(): StreamPeerBuffer {
    val _ret = __method_bind.duplicate.call(this._handle)
    return _ret.asObject(::StreamPeerBuffer)!!
  }

  fun getDataArray(): PoolByteArray {
    val _ret = __method_bind.getDataArray.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun getPosition(): Int {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asInt()
  }

  fun getSize(): Int {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asInt()
  }

  fun resize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.resize.call(this._handle, listOf(_arg))
  }

  fun seek(position: Int) {
    val _arg = Variant.new(position)
    __method_bind.seek.call(this._handle, listOf(_arg))
  }

  fun setDataArray(data: PoolByteArray) {
    val _arg = Variant.new(data)
    __method_bind.setDataArray.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): StreamPeerBuffer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerBuffer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StreamPeerBuffer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerBuffer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StreamPeerBuffer = StreamPeerBuffer(ptr)
    /**
     * Container for method_bind pointers for StreamPeerBuffer
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val duplicate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "duplicate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method duplicate" }
        }
      val getDataArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "get_data_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data_array" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val resize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "resize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resize" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val setDataArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
            "set_data_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data_array" }
        }}
  }
}
