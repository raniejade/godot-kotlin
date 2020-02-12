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

open class TCP_Server(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun isConnectionAvailable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isConnectionAvailable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isListening(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isListening.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun listen(port: Int, bindAddress: String = "*"): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(port)
      _args.add(bindAddress)
      __method_bind.listen.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun stop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stop.call(self._handle, emptyList(), null)
    }
  }

  fun takeConnection(): StreamPeerTCP {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: StreamPeerTCP
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.takeConnection.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<StreamPeerTCP>(_tmp.value!!)
      _ret
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TCP_Server".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TCP_Server" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TCP_Server
     */
    private object __method_bind {
      val isConnectionAvailable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "is_connection_available".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_connection_available" }
        }
      val isListening: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "is_listening".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_listening" }
        }
      val listen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "listen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method listen" }
        }
      val stop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop" }
        }
      val takeConnection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TCP_Server".cstr.ptr,
            "take_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method take_connection" }
        }}
  }
}
