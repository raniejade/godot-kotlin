// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StreamPeerBuffer internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun duplicate(): StreamPeerBuffer {
    val _ret = __method_bind.duplicate.call(this.toVariant())
    TODO()
  }

  fun getDataArray(): PoolByteArray {
    val _ret = __method_bind.get_data_array.call(this.toVariant())
    TODO()
  }

  fun getPosition(): Int {
    val _ret = __method_bind.get_position.call(this.toVariant())
    TODO()
  }

  fun getSize(): Int {
    val _ret = __method_bind.get_size.call(this.toVariant())
    TODO()
  }

  fun resize(size: Int) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.resize.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun seek(position: Int) {
    val _args = VariantArray.new()
    _args.append(position)
    val _ret = __method_bind.seek.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDataArray(data: PoolByteArray) {
    val _args = VariantArray.new()
    _args.append(data)
    val _ret = __method_bind.set_data_array.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): StreamPeerBuffer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerBuffer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StreamPeerBuffer" }
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
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val duplicate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "duplicate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method duplicate" }
            }
          }

      val get_data_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "get_data_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data_array" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val resize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "resize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resize" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val set_data_array: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StreamPeerBuffer".cstr.ptr,
              "set_data_array".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data_array" }
            }
          }
    }
  }
}
