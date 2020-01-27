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

open class WebRTCPeerConnection internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addIceCandidate(
    media: String,
    index: Int,
    name: String
  ): GDError {
    val _args = VariantArray.new()
    _args.append(media)
    _args.append(index)
    _args.append(name)
    val _ret = __method_bind.add_ice_candidate.call(this.toVariant(), _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun close() {
    __method_bind.close.call(this.toVariant())
  }

  fun createDataChannel(label: String, options: Dictionary): WebRTCDataChannel {
    val _args = VariantArray.new()
    _args.append(label)
    _args.append(options)
    val _ret = __method_bind.create_data_channel.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asObject(::WebRTCDataChannel)!!
  }

  fun createOffer(): GDError {
    val _ret = __method_bind.create_offer.call(this.toVariant())
    return GDError.from(_ret.asInt())
  }

  fun getConnectionState(): ConnectionState {
    val _ret = __method_bind.get_connection_state.call(this.toVariant())
    return WebRTCPeerConnection.ConnectionState.from(_ret.asInt())
  }

  fun initialize(configuration: Dictionary): GDError {
    val _args = VariantArray.new()
    _args.append(configuration)
    val _ret = __method_bind.initialize.call(this.toVariant(), _args.toVariant(), 1)
    return GDError.from(_ret.asInt())
  }

  fun poll(): GDError {
    val _ret = __method_bind.poll.call(this.toVariant())
    return GDError.from(_ret.asInt())
  }

  fun setLocalDescription(type: String, sdp: String): GDError {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(sdp)
    val _ret = __method_bind.set_local_description.call(this.toVariant(), _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun setRemoteDescription(type: String, sdp: String): GDError {
    val _args = VariantArray.new()
    _args.append(type)
    _args.append(sdp)
    val _ret = __method_bind.set_remote_description.call(this.toVariant(), _args.toVariant(), 2)
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
      requireNotNull(fnPtr) { "No instance found for singleton WebRTCPeerConnection" }
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
      val add_ice_candidate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "add_ice_candidate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_ice_candidate" }
            }
          }

      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val create_data_channel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "create_data_channel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_data_channel" }
            }
          }

      val create_offer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "create_offer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_offer" }
            }
          }

      val get_connection_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "get_connection_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_state" }
            }
          }

      val initialize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "initialize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method initialize" }
            }
          }

      val poll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "poll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method poll" }
            }
          }

      val set_local_description: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "set_local_description".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_local_description" }
            }
          }

      val set_remote_description: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebRTCPeerConnection".cstr.ptr,
              "set_remote_description".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_remote_description" }
            }
          }
    }
  }
}
