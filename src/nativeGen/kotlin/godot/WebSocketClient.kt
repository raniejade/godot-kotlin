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

open class WebSocketClient(
  _handle: COpaquePointer
) : WebSocketMultiplayerPeer(_handle) {
  var verifySsl: Boolean
    get() {
       return isVerifySslEnabled() 
    }
    set(value) {
      setVerifySslEnabled(value)
    }

  fun connectToUrl(
    url: String,
    protocols: PoolStringArray,
    gdMpApi: Boolean
  ): GDError {
    val _args = VariantArray.new()
    _args.append(url)
    _args.append(protocols)
    _args.append(gdMpApi)
    val _ret = __method_bind.connectToUrl.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun disconnectFromHost(code: Int, reason: String) {
    val _args = VariantArray.new()
    _args.append(code)
    _args.append(reason)
    __method_bind.disconnectFromHost.call(this._handle, _args.toVariant(), 2)
  }

  fun isVerifySslEnabled(): Boolean {
    val _ret = __method_bind.isVerifySslEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setVerifySslEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setVerifySslEnabled.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): WebSocketClient = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketClient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WebSocketClient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebSocketClient(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WebSocketClient = WebSocketClient(ptr)
    /**
     * Container for method_bind pointers for WebSocketClient
     */
    private object __method_bind {
      val connectToUrl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "connectToUrl".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connectToUrl" }
        }
      val disconnectFromHost: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "disconnectFromHost".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnectFromHost" }
        }
      val isVerifySslEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "isVerifySslEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVerifySslEnabled" }
        }
      val setVerifySslEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WebSocketClient".cstr.ptr,
            "setVerifySslEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVerifySslEnabled" }
        }}
  }
}
