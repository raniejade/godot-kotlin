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

open class PacketPeer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAvailablePacketCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAvailablePacketCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getEncodeBufferMaxSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEncodeBufferMaxSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPacket(): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPacket.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPacketError(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPacketError.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getVar(allowObjects: Boolean = false): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getVar.call(self._handle, listOf(allowObjects), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isObjectDecodingAllowed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isObjectDecodingAllowed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun putPacket(buffer: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.putPacket.call(self._handle, listOf(buffer), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun putVar(`var`: Variant, fullObjects: Boolean = false): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`var`)
      _args.add(fullObjects)
      __method_bind.putVar.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowObjectDecoding.call(self._handle, listOf(enable), null)
    }
  }

  fun setEncodeBufferMaxSize(maxSize: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEncodeBufferMaxSize.call(self._handle, listOf(maxSize), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for PacketPeer
     */
    private object __method_bind {
      val getAvailablePacketCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_available_packet_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_available_packet_count" }
        }
      val getEncodeBufferMaxSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_encode_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_encode_buffer_max_size" }
        }
      val getPacket: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet" }
        }
      val getPacketError: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_packet_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_packet_error" }
        }
      val getVar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "get_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_var" }
        }
      val isObjectDecodingAllowed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "is_object_decoding_allowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_object_decoding_allowed" }
        }
      val putPacket: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "put_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_packet" }
        }
      val putVar: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "put_var".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method put_var" }
        }
      val setAllowObjectDecoding: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "set_allow_object_decoding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_object_decoding" }
        }
      val setEncodeBufferMaxSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PacketPeer".cstr.ptr,
            "set_encode_buffer_max_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_encode_buffer_max_size" }
        }}
  }
}
