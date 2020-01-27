// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class PacketPeer internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getAvailablePacketCount(): Int {
    val _ret = __method_bind.get_available_packet_count.call(this.toVariant())
    TODO()
  }

  fun getPacket(): PoolByteArray {
    val _ret = __method_bind.get_packet.call(this.toVariant())
    TODO()
  }

  fun getPacketError(): Error {
    val _ret = __method_bind.get_packet_error.call(this.toVariant())
    TODO()
  }

  fun getVar(allowObjects: Boolean): Variant {
    val _args = VariantArray.new()
    _args.append(allowObjects)
    val _ret = __method_bind.get_var.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isObjectDecodingAllowed(): Boolean {
    val _ret = __method_bind.is_object_decoding_allowed.call(this.toVariant())
    TODO()
  }

  fun putPacket(buffer: PoolByteArray): Error {
    val _args = VariantArray.new()
    _args.append(buffer)
    val _ret = __method_bind.put_packet.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun putVar(`var`: Variant, fullObjects: Boolean): Error {
    val _args = VariantArray.new()
    _args.append(`var`)
    _args.append(fullObjects)
    val _ret = __method_bind.put_var.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_allow_object_decoding.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for PacketPeer
     */
    private object __method_bind {
      val get_available_packet_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "get_available_packet_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_available_packet_count" }
            }
          }

      val get_packet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "get_packet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_packet" }
            }
          }

      val get_packet_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "get_packet_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_packet_error" }
            }
          }

      val get_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "get_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_var" }
            }
          }

      val is_object_decoding_allowed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "is_object_decoding_allowed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_object_decoding_allowed" }
            }
          }

      val put_packet: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "put_packet".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_packet" }
            }
          }

      val put_var: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "put_var".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method put_var" }
            }
          }

      val set_allow_object_decoding: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
              "set_allow_object_decoding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_allow_object_decoding" }
            }
          }
    }
  }
}
