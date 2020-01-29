// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
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

open class TCP_Server(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun isConnectionAvailable(): Boolean {
    val _ret = __method_bind.isConnectionAvailable.call(this._handle)
    return _ret.asBoolean()
  }

  fun listen(port: Int, bindAddress: String = "*"): GDError {
    val _args = VariantArray.new()
    _args.append(port)
    _args.append(bindAddress)
    val _ret = __method_bind.listen.call(this._handle, _args.toVariant(), 2)
    return GDError.from(_ret.asInt())
  }

  fun stop() {
    __method_bind.stop.call(this._handle)
  }

  fun takeConnection(): StreamPeerTCP {
    val _ret = __method_bind.takeConnection.call(this._handle)
    return _ret.asObject(::StreamPeerTCP)!!
  }

  companion object {
    fun new(): TCP_Server = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TCP_Server".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TCP_Server" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TCP_Server(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TCP_Server = TCP_Server(ptr)
    /**
     * Container for method_bind pointers for TCP_Server
     */
    private object __method_bind {
      val isConnectionAvailable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "is_connection_available".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_connection_available" }
        }
      val listen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }
      val takeConnection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "take_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method take_connection" }
        }}
  }
}
