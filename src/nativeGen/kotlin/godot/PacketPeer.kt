// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PacketPeer(
  _handle: COpaquePointer
) : Reference(_handle) {
  var allowObjectDecoding: Boolean
    get() {
       return isObjectDecodingAllowed() 
    }
    set(value) {
      setAllowObjectDecoding(value)
    }

  var encodeBufferMaxSize: Int
    get() {
       return getEncodeBufferMaxSize() 
    }
    set(value) {
      setEncodeBufferMaxSize(value)
    }

  fun getAvailablePacketCount(): Int {
    val _ret = __method_bind.getAvailablePacketCount.call(this._handle)
    return _ret.asInt()
  }

  fun getEncodeBufferMaxSize(): Int {
    val _ret = __method_bind.getEncodeBufferMaxSize.call(this._handle)
    return _ret.asInt()
  }

  fun getPacket(): PoolByteArray {
    val _ret = __method_bind.getPacket.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun getPacketError(): GDError {
    val _ret = __method_bind.getPacketError.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun getVar(allowObjects: Boolean = false): Variant {
    val _arg = Variant.new(allowObjects)
    val _ret = __method_bind.getVar.call(this._handle, listOf(_arg))
    return _ret
  }

  fun isObjectDecodingAllowed(): Boolean {
    val _ret = __method_bind.isObjectDecodingAllowed.call(this._handle)
    return _ret.asBoolean()
  }

  fun putPacket(buffer: PoolByteArray): GDError {
    val _arg = Variant.new(buffer)
    val _ret = __method_bind.putPacket.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun putVar(`var`: Variant, fullObjects: Boolean = false): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`var`))
    _args.add(Variant.fromAny(fullObjects))
    val _ret = __method_bind.putVar.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAllowObjectDecoding.call(this._handle, listOf(_arg))
  }

  fun setEncodeBufferMaxSize(maxSize: Int) {
    val _arg = Variant.new(maxSize)
    __method_bind.setEncodeBufferMaxSize.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for PacketPeer
     */
    private object __method_bind {
      val getAvailablePacketCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_available_packet_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_available_packet_count" }
        }
      val getEncodeBufferMaxSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_encode_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_encode_buffer_max_size" }
        }
      val getPacket: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet" }
        }
      val getPacketError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_packet_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_error" }
        }
      val getVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var" }
        }
      val isObjectDecodingAllowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "is_object_decoding_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_object_decoding_allowed" }
        }
      val putPacket: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "put_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_packet" }
        }
      val putVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "put_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_var" }
        }
      val setAllowObjectDecoding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "set_allow_object_decoding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_object_decoding" }
        }
      val setEncodeBufferMaxSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "set_encode_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_encode_buffer_max_size" }
        }}
  }
}
