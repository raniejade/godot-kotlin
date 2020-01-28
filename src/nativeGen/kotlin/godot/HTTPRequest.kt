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

open class HTTPRequest(
  _handle: COpaquePointer
) : Node(_handle) {
  fun cancelRequest() {
    __method_bind.cancel_request.call(this._handle)
  }

  fun getBodySize(): Int {
    val _ret = __method_bind.get_body_size.call(this._handle)
    return _ret.asInt()
  }

  fun getBodySizeLimit(): Int {
    val _ret = __method_bind.get_body_size_limit.call(this._handle)
    return _ret.asInt()
  }

  fun getDownloadFile(): String {
    val _ret = __method_bind.get_download_file.call(this._handle)
    return _ret.asString()
  }

  fun getDownloadedBytes(): Int {
    val _ret = __method_bind.get_downloaded_bytes.call(this._handle)
    return _ret.asInt()
  }

  fun getHttpClientStatus(): HTTPClient.Status {
    val _ret = __method_bind.get_http_client_status.call(this._handle)
    return HTTPClient.Status.from(_ret.asInt())
  }

  fun getMaxRedirects(): Int {
    val _ret = __method_bind.get_max_redirects.call(this._handle)
    return _ret.asInt()
  }

  fun isUsingThreads(): Boolean {
    val _ret = __method_bind.is_using_threads.call(this._handle)
    return _ret.asBoolean()
  }

  fun request(
    url: String,
    customHeaders: PoolStringArray,
    sslValidateDomain: Boolean,
    method: Int,
    requestData: String
  ): GDError {
    val _args = VariantArray.new()
    _args.append(url)
    _args.append(customHeaders)
    _args.append(sslValidateDomain)
    _args.append(method)
    _args.append(requestData)
    val _ret = __method_bind.request.call(this._handle, _args.toVariant(), 5)
    return GDError.from(_ret.asInt())
  }

  fun setBodySizeLimit(bytes: Int) {
    val _arg = Variant.new(bytes)
    __method_bind.set_body_size_limit.call(this._handle, _arg, 1)
  }

  fun setDownloadFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.set_download_file.call(this._handle, _arg, 1)
  }

  fun setMaxRedirects(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.set_max_redirects.call(this._handle, _arg, 1)
  }

  fun setUseThreads(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_threads.call(this._handle, _arg, 1)
  }

  enum class Result(
    val value: Int
  ) {
    RESULT_SUCCESS(0),

    RESULT_CHUNKED_BODY_SIZE_MISMATCH(1),

    RESULT_CANT_CONNECT(2),

    RESULT_CANT_RESOLVE(3),

    RESULT_CONNECTION_ERROR(4),

    RESULT_SSL_HANDSHAKE_ERROR(5),

    RESULT_NO_RESPONSE(6),

    RESULT_BODY_SIZE_LIMIT_EXCEEDED(7),

    RESULT_REQUEST_FAILED(8),

    RESULT_DOWNLOAD_FILE_CANT_OPEN(9),

    RESULT_DOWNLOAD_FILE_WRITE_ERROR(10),

    RESULT_REDIRECT_LIMIT_REACHED(11);

    companion object {
      fun from(value: Int): Result {
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
    val RESULT_BODY_SIZE_LIMIT_EXCEEDED: Int = 7

    val RESULT_CANT_CONNECT: Int = 2

    val RESULT_CANT_RESOLVE: Int = 3

    val RESULT_CHUNKED_BODY_SIZE_MISMATCH: Int = 1

    val RESULT_CONNECTION_ERROR: Int = 4

    val RESULT_DOWNLOAD_FILE_CANT_OPEN: Int = 9

    val RESULT_DOWNLOAD_FILE_WRITE_ERROR: Int = 10

    val RESULT_NO_RESPONSE: Int = 6

    val RESULT_REDIRECT_LIMIT_REACHED: Int = 11

    val RESULT_REQUEST_FAILED: Int = 8

    val RESULT_SSL_HANDSHAKE_ERROR: Int = 5

    val RESULT_SUCCESS: Int = 0

    fun new(): HTTPRequest = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPRequest".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HTTPRequest" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HTTPRequest(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HTTPRequest = HTTPRequest(ptr)
    /**
     * Container for method_bind pointers for HTTPRequest
     */
    private object __method_bind {
      val cancel_request: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "cancel_request".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cancel_request" }
        }
      val get_body_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_body_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_size" }
        }
      val get_body_size_limit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_body_size_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_size_limit" }
        }
      val get_download_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_download_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_download_file" }
        }
      val get_downloaded_bytes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_downloaded_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_downloaded_bytes" }
        }
      val get_http_client_status: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_http_client_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_http_client_status" }
        }
      val get_max_redirects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_max_redirects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_redirects" }
        }
      val is_using_threads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "is_using_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_threads" }
        }
      val request: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "request".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request" }
        }
      val set_body_size_limit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_body_size_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_body_size_limit" }
        }
      val set_download_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_download_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_download_file" }
        }
      val set_max_redirects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_max_redirects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_redirects" }
        }
      val set_use_threads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_use_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_threads" }
        }}
  }
}
