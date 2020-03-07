// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
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

open class JSONRPC(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun makeNotification(method: String, params: Variant): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(method)
      _args.add(params)
      __method_bind.makeNotification.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun makeRequest(
    method: String,
    params: Variant,
    id: Variant
  ): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(method)
      _args.add(params)
      _args.add(id)
      __method_bind.makeRequest.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun makeResponse(result: Variant, id: Variant): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(result)
      _args.add(id)
      __method_bind.makeResponse.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun makeResponseError(
    code: Int,
    message: String,
    id: Variant
  ): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(code)
      _args.add(message)
      _args.add(id)
      __method_bind.makeResponseError.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun processAction(action: Variant, recurse: Boolean = false): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(recurse)
      __method_bind.processAction.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun processString(action: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.processString.call(self._handle, listOf(action), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun setScope(scope: String, target: Object) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(scope)
      _args.add(target)
      __method_bind.setScope.call(self._handle, _args, null)
    }
  }

  enum class ErrorCode(
    val value: Int
  ) {
    PARSE_ERROR(-32700),

    INTERNAL_ERROR(-32603),

    INVALID_PARAMS(-32602),

    METHOD_NOT_FOUND(-32601),

    INVALID_REQUEST(-32600);

    companion object {
      fun from(value: Int): ErrorCode {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("JSONRPC".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for JSONRPC" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for JSONRPC
     */
    private object __method_bind {
      val makeNotification: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
              "make_notification".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_notification" }
            }
          }

      val makeRequest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
              "make_request".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_request" }
            }
          }

      val makeResponse: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
              "make_response".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_response" }
            }
          }

      val makeResponseError: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
              "make_response_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_response_error" }
            }
          }

      val processAction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
              "process_action".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method process_action" }
            }
          }

      val processString: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
              "process_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method process_string" }
            }
          }

      val setScope: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
              "set_scope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scope" }
            }
          }
    }
  }
}
