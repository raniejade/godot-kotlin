// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WebSocketServer(
  _handle: COpaquePointer
) : WebSocketMultiplayerPeer(_handle) {
  fun disconnectPeer(
    id: Int,
    code: Int,
    reason: String
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(code)
    _args.append(reason)
    __method_bind.disconnectPeer.call(this._handle, _args.toVariant(), 3)
  }

  fun getPeerAddress(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPeerAddress.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getPeerPort(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.getPeerPort.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun hasPeer(id: Int): Boolean {
    val _arg = Variant.new(id)
    val _ret = __method_bind.hasPeer.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isListening(): Boolean {
    val _ret = __method_bind.isListening.call(this._handle)
    return _ret.asBoolean()
  }

  fun listen(
    port: Int,
    protocols: PoolStringArray,
    gdMpApi: Boolean
  ): GDError {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(protocols)
    _args.append(gdMpApi)
    val _ret = __method_bind.listen.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  companion object {
    fun new(): WebSocketServer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketServer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebSocketServer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebSocketServer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebSocketServer = WebSocketServer(ptr)
    /**
     * Container for method_bind pointers for WebSocketServer
     */
    private object __method_bind {
      val disconnectPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "disconnectPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnectPeer" }
        }
      val getPeerAddress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "getPeerAddress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeerAddress" }
        }
      val getPeerPort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "getPeerPort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeerPort" }
        }
      val hasPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "hasPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasPeer" }
        }
      val isListening: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "isListening".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isListening" }
        }
      val listen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketServer".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }}
  }
}
