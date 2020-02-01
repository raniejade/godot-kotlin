// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
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

open class JSONRPC(
  _handle: COpaquePointer
) : Object(_handle) {
  fun makeNotification(method: String, params: Variant): Dictionary {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(params))
    val _ret = __method_bind.makeNotification.call(this._handle, _args)
    return _ret.asDictionary()
  }

  fun makeRequest(
    method: String,
    params: Variant,
    id: Variant
  ): Dictionary {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(params))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.makeRequest.call(this._handle, _args)
    return _ret.asDictionary()
  }

  fun makeResponse(result: Variant, id: Variant): Dictionary {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(result))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.makeResponse.call(this._handle, _args)
    return _ret.asDictionary()
  }

  fun makeResponseError(
    code: Int,
    message: String,
    id: Variant
  ): Dictionary {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(code))
    _args.add(Variant.fromAny(message))
    _args.add(Variant.fromAny(id))
    val _ret = __method_bind.makeResponseError.call(this._handle, _args)
    return _ret.asDictionary()
  }

  fun processAction(action: Variant, recurse: Boolean = false): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(action))
    _args.add(Variant.fromAny(recurse))
    val _ret = __method_bind.processAction.call(this._handle, _args)
    return _ret
  }

  fun processString(action: String): String {
    val _arg = Variant.new(action)
    val _ret = __method_bind.processString.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun setScope(scope: String, target: Object) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(scope))
    _args.add(Variant.fromAny(target))
    __method_bind.setScope.call(this._handle, _args)
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
    val INTERNAL_ERROR: Int = -32603

    val INVALID_PARAMS: Int = -32602

    val INVALID_REQUEST: Int = -32600

    val METHOD_NOT_FOUND: Int = -32601

    val PARSE_ERROR: Int = -32700

    fun new(): JSONRPC = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("JSONRPC".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for JSONRPC" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      JSONRPC(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): JSONRPC = JSONRPC(ptr)
    /**
     * Container for method_bind pointers for JSONRPC
     */
    private object __method_bind {
      val makeNotification: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
            "make_notification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_notification" }
        }
      val makeRequest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
            "make_request".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_request" }
        }
      val makeResponse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
            "make_response".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_response" }
        }
      val makeResponseError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
            "make_response_error".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_response_error" }
        }
      val processAction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
            "process_action".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method process_action" }
        }
      val processString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
            "process_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method process_string" }
        }
      val setScope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JSONRPC".cstr.ptr,
            "set_scope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scope" }
        }}
  }
}
