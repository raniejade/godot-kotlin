// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
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

open class WebRTCDataChannel(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PacketPeer(null) {
  var writeMode: WriteMode
    get() {
       return getWriteMode() 
    }
    set(value) {
      setWriteMode(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun close() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.close.call(self._handle, emptyList(), null)
    }
  }

  fun getId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLabel(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLabel.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getMaxPacketLifeTime(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxPacketLifeTime.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaxRetransmits(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxRetransmits.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getProtocol(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getProtocol.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getReadyState(): ChannelState {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getReadyState.call(self._handle, emptyList(), _retPtr)
      WebRTCDataChannel.ChannelState.from(_ret.value)
    }
  }

  fun getWriteMode(): WriteMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWriteMode.call(self._handle, emptyList(), _retPtr)
      WebRTCDataChannel.WriteMode.from(_ret.value)
    }
  }

  fun isNegotiated(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isNegotiated.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOrdered(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOrdered.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun poll(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.poll.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setWriteMode(writeMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWriteMode.call(self._handle, listOf(writeMode), null)
    }
  }

  fun wasStringPacket(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.wasStringPacket.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  enum class WriteMode(
    val value: Int
  ) {
    TEXT(0),

    BINARY(1);

    companion object {
      fun from(value: Int): WriteMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ChannelState(
    val value: Int
  ) {
    STATE_CONNECTING(0),

    STATE_OPEN(1),

    STATE_CLOSING(2),

    STATE_CLOSED(3);

    companion object {
      fun from(value: Int): ChannelState {
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
    /**
     * Container for method_bind pointers for WebRTCDataChannel
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val getId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_id" }
        }
      val getLabel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_label" }
        }
      val getMaxPacketLifeTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_max_packet_life_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_packet_life_time" }
        }
      val getMaxRetransmits: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_max_retransmits".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_retransmits" }
        }
      val getProtocol: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_protocol".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_protocol" }
        }
      val getReadyState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_ready_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ready_state" }
        }
      val getWriteMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "get_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_write_mode" }
        }
      val isNegotiated: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "is_negotiated".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_negotiated" }
        }
      val isOrdered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "is_ordered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ordered" }
        }
      val poll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val setWriteMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "set_write_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_write_mode" }
        }
      val wasStringPacket: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCDataChannel".cstr.ptr,
            "was_string_packet".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method was_string_packet" }
        }}
  }
}
