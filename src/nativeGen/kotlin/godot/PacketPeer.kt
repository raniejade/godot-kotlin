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

  fun getAvailablePacketCount(): Int {
    val _ret = __method_bind.getAvailablePacketCount.call(this._handle)
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

  fun getVar(allowObjects: Boolean): Variant {
    val _arg = Variant.new(allowObjects)
    val _ret = __method_bind.getVar.call(this._handle, _arg, 1)
    return _ret
  }

  fun isObjectDecodingAllowed(): Boolean {
    val _ret = __method_bind.isObjectDecodingAllowed.call(this._handle)
    return _ret.asBoolean()
  }

  fun putPacket(buffer: PoolByteArray): GDError {
    val _arg = Variant.new(buffer)
    val _ret = __method_bind.putPacket.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun putVar(`var`: Variant, fullObjects: Boolean): GDError {
    val _args = VariantArray.new()
    _args.append(`var`)
    _args.append(fullObjects)
    val _ret = __method_bind.putVar.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAllowObjectDecoding.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for PacketPeer
     */
    private object __method_bind {
      val getAvailablePacketCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "getAvailablePacketCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAvailablePacketCount" }
        }
      val getPacket: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "getPacket".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPacket" }
        }
      val getPacketError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "getPacketError".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPacketError" }
        }
      val getVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "getVar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVar" }
        }
      val isObjectDecodingAllowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "isObjectDecodingAllowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isObjectDecodingAllowed" }
        }
      val putPacket: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "putPacket".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method putPacket" }
        }
      val putVar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "putVar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method putVar" }
        }
      val setAllowObjectDecoding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "setAllowObjectDecoding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowObjectDecoding" }
        }}
  }
}
