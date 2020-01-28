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
  fun getAvailablePacketCount(): Int {
    val _ret = __method_bind.get_available_packet_count.call(this._handle)
    return _ret.asInt()
  }

  fun getPacket(): PoolByteArray {
    val _ret = __method_bind.get_packet.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun getPacketError(): GDError {
    val _ret = __method_bind.get_packet_error.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun getVar(allowObjects: Boolean): Variant {
    val _arg = Variant.new(allowObjects)
    val _ret = __method_bind.get_var.call(this._handle, _arg, 1)
    return _ret
  }

  fun isObjectDecodingAllowed(): Boolean {
    val _ret = __method_bind.is_object_decoding_allowed.call(this._handle)
    return _ret.asBoolean()
  }

  fun putPacket(buffer: PoolByteArray): GDError {
    val _arg = Variant.new(buffer)
    val _ret = __method_bind.put_packet.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun putVar(`var`: Variant, fullObjects: Boolean): GDError {
    val _args = VariantArray.new()
    _args.append(`var`)
    _args.append(fullObjects)
    val _ret = __method_bind.put_var.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_allow_object_decoding.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for PacketPeer
     */
    private object __method_bind {
      val get_available_packet_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_available_packet_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_available_packet_count" }
        }
      val get_packet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet" }
        }
      val get_packet_error: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_packet_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_error" }
        }
      val get_var: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var" }
        }
      val is_object_decoding_allowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "is_object_decoding_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_object_decoding_allowed" }
        }
      val put_packet: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "put_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_packet" }
        }
      val put_var: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "put_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_var" }
        }
      val set_allow_object_decoding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "set_allow_object_decoding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_object_decoding" }
        }}
  }
}
