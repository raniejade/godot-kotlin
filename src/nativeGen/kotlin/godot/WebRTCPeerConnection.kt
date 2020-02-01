// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebRTCPeerConnection(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addIceCandidate(
    media: String,
    index: Int,
    name: String
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(media))
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(name))
    val _ret = __method_bind.addIceCandidate.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun close() {
    __method_bind.close.call(this._handle)
  }

  fun createDataChannel(label: String, options: Dictionary): WebRTCDataChannel {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(label))
    _args.add(Variant.fromAny(options))
    val _ret = __method_bind.createDataChannel.call(this._handle, _args)
    return _ret.asObject(::WebRTCDataChannel)!!
  }

  fun createOffer(): GDError {
    val _ret = __method_bind.createOffer.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun getConnectionState(): ConnectionState {
    val _ret = __method_bind.getConnectionState.call(this._handle)
    return WebRTCPeerConnection.ConnectionState.from(_ret.asInt())
  }

  fun initialize(configuration: Dictionary): GDError {
    val _arg = Variant.new(configuration)
    val _ret = __method_bind.initialize.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun poll(): GDError {
    val _ret = __method_bind.poll.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun setLocalDescription(type: String, sdp: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(sdp))
    val _ret = __method_bind.setLocalDescription.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun setRemoteDescription(type: String, sdp: String): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(sdp))
    val _ret = __method_bind.setRemoteDescription.call(this._handle, _args)
    return GDError.from(_ret.asInt())
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
    val STATE_CLOSED: Int = 5

    val STATE_CONNECTED: Int = 2

    val STATE_CONNECTING: Int = 1

    val STATE_DISCONNECTED: Int = 3

    val STATE_FAILED: Int = 4

    val STATE_NEW: Int = 0

    fun new(): WebRTCPeerConnection = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebRTCPeerConnection".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebRTCPeerConnection" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebRTCPeerConnection(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebRTCPeerConnection = WebRTCPeerConnection(ptr)
    /**
     * Container for method_bind pointers for WebRTCPeerConnection
     */
    private object __method_bind {
      val addIceCandidate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "add_ice_candidate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ice_candidate" }
        }
      val close: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val createDataChannel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "create_data_channel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_data_channel" }
        }
      val createOffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "create_offer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_offer" }
        }
      val getConnectionState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "get_connection_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_state" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val poll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val setLocalDescription: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "set_local_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_local_description" }
        }
      val setRemoteDescription: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
            "set_remote_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_remote_description" }
        }}
  }
}
