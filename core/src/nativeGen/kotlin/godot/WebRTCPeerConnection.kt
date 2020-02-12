// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class WebRTCPeerConnection(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  /**
   * WebRTCPeerConnection::data_channel_received signal
   */
  val signalDataChannelReceived: Signal1<Object> = Signal1("data_channel_received")

  /**
   * WebRTCPeerConnection::ice_candidate_created signal
   */
  val signalIceCandidateCreated: Signal3<String, Int, String> = Signal3("ice_candidate_created")

  /**
   * WebRTCPeerConnection::session_description_created signal
   */
  val signalSessionDescriptionCreated: Signal2<String, String> =
      Signal2("session_description_created")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addIceCandidate(
    media: String,
    index: Int,
    name: String
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(media)
      _args.add(index)
      _args.add(name)
      __method_bind.addIceCandidate.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun close() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.close.call(self._handle, emptyList(), null)
    }
  }

  fun createDataChannel(label: String, options: Dictionary): WebRTCDataChannel {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: WebRTCDataChannel
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(label)
      _args.add(options)
      __method_bind.createDataChannel.call(self._handle, _args, _retPtr)
      _ret = objectToType<WebRTCDataChannel>(_tmp.value!!)
      _ret
    }
  }

  fun createOffer(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.createOffer.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getConnectionState(): ConnectionState {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionState.call(self._handle, emptyList(), _retPtr)
      WebRTCPeerConnection.ConnectionState.from(_ret.value)
    }
  }

  fun initialize(configuration: Dictionary): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.initialize.call(self._handle, listOf(configuration), _retPtr)
      GDError.from(_ret.value)
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

  fun setLocalDescription(type: String, sdp: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(sdp)
      __method_bind.setLocalDescription.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setRemoteDescription(type: String, sdp: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(sdp)
      __method_bind.setRemoteDescription.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  enum class ConnectionState(
    val value: Int
  ) {
    STATE_NEW(0),

    STATE_CONNECTING(1),

    STATE_CONNECTED(2),

    STATE_DISCONNECTED(3),

    STATE_FAILED(4),

    STATE_CLOSED(5);

    companion object {
      fun from(value: Int): ConnectionState {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebRTCPeerConnection".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebRTCPeerConnection" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WebRTCPeerConnection
     */
    private object __method_bind {
      val addIceCandidate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "add_ice_candidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ice_candidate" }
        }
      val close: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val createDataChannel: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "create_data_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_data_channel" }
        }
      val createOffer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "create_offer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_offer" }
        }
      val getConnectionState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "get_connection_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_state" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val poll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val setLocalDescription: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "set_local_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_local_description" }
        }
      val setRemoteDescription: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "set_remote_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_remote_description" }
        }}
  }
}
