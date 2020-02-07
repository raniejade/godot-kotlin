// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HTTPRequest(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var bodySizeLimit: Int
    get() {
       return getBodySizeLimit() 
    }
    set(value) {
      setBodySizeLimit(value)
    }

  var downloadChunkSize: Int
    get() {
       return getDownloadChunkSize() 
    }
    set(value) {
      setDownloadChunkSize(value)
    }

  var downloadFile: String
    get() {
       return getDownloadFile() 
    }
    set(value) {
      setDownloadFile(value)
    }

  var maxRedirects: Int
    get() {
       return getMaxRedirects() 
    }
    set(value) {
      setMaxRedirects(value)
    }

  var timeout: Int
    get() {
       return getTimeout() 
    }
    set(value) {
      setTimeout(value)
    }

  var useThreads: Boolean
    get() {
       return isUsingThreads() 
    }
    set(value) {
      setUseThreads(value)
    }

  /**
   * HTTPRequest::request_completed signal
   */
  val signalRequestCompleted: Signal4<Int, Int, PoolStringArray, PoolByteArray> =
      Signal4("request_completed")

  constructor() : this(null) {
    _handle = __new()
  }

  fun cancelRequest() {
    __method_bind.cancelRequest.call(this._handle)
  }

  fun getBodySize(): Int {
    val _ret = __method_bind.getBodySize.call(this._handle)
    return _ret.asInt()
  }

  fun getBodySizeLimit(): Int {
    val _ret = __method_bind.getBodySizeLimit.call(this._handle)
    return _ret.asInt()
  }

  fun getDownloadChunkSize(): Int {
    val _ret = __method_bind.getDownloadChunkSize.call(this._handle)
    return _ret.asInt()
  }

  fun getDownloadFile(): String {
    val _ret = __method_bind.getDownloadFile.call(this._handle)
    return _ret.asString()
  }

  fun getDownloadedBytes(): Int {
    val _ret = __method_bind.getDownloadedBytes.call(this._handle)
    return _ret.asInt()
  }

  fun getHttpClientStatus(): HTTPClient.Status {
    val _ret = __method_bind.getHttpClientStatus.call(this._handle)
    return HTTPClient.Status.from(_ret.asInt())
  }

  fun getMaxRedirects(): Int {
    val _ret = __method_bind.getMaxRedirects.call(this._handle)
    return _ret.asInt()
  }

  fun getTimeout(): Int {
    val _ret = __method_bind.getTimeout.call(this._handle)
    return _ret.asInt()
  }

  fun isUsingThreads(): Boolean {
    val _ret = __method_bind.isUsingThreads.call(this._handle)
    return _ret.asBoolean()
  }

  fun request(
    url: String,
    customHeaders: PoolStringArray,
    sslValidateDomain: Boolean = true,
    method: Int = 0,
    requestData: String = ""
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(url))
    _args.add(Variant.fromAny(customHeaders))
    _args.add(Variant.fromAny(sslValidateDomain))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(requestData))
    val _ret = __method_bind.request.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun setBodySizeLimit(bytes: Int) {
    val _arg = Variant.new(bytes)
    __method_bind.setBodySizeLimit.call(this._handle, listOf(_arg))
  }

  fun setDownloadChunkSize(arg0: Int) {
    val _arg = Variant.new(arg0)
    __method_bind.setDownloadChunkSize.call(this._handle, listOf(_arg))
  }

  fun setDownloadFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setDownloadFile.call(this._handle, listOf(_arg))
  }

  fun setMaxRedirects(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setMaxRedirects.call(this._handle, listOf(_arg))
  }

  fun setTimeout(timeout: Int) {
    val _arg = Variant.new(timeout)
    __method_bind.setTimeout.call(this._handle, listOf(_arg))
  }

  fun setUseThreads(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseThreads.call(this._handle, listOf(_arg))
  }

  enum class Result(
    val value: Int
  ) {
    SUCCESS(0),

    CHUNKED_BODY_SIZE_MISMATCH(1),

    CANT_CONNECT(2),

    CANT_RESOLVE(3),

    CONNECTION_ERROR(4),

    SSL_HANDSHAKE_ERROR(5),

    NO_RESPONSE(6),

    BODY_SIZE_LIMIT_EXCEEDED(7),

    REQUEST_FAILED(8),

    DOWNLOAD_FILE_CANT_OPEN(9),

    DOWNLOAD_FILE_WRITE_ERROR(10),

    REDIRECT_LIMIT_REACHED(11),

    TIMEOUT(12);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPRequest".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HTTPRequest" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for HTTPRequest
     */
    private object __method_bind {
      val cancelRequest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "cancel_request".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cancel_request" }
        }
      val getBodySize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_body_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_size" }
        }
      val getBodySizeLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_body_size_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_body_size_limit" }
        }
      val getDownloadChunkSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_download_chunk_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_download_chunk_size" }
        }
      val getDownloadFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_download_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_download_file" }
        }
      val getDownloadedBytes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_downloaded_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_downloaded_bytes" }
        }
      val getHttpClientStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_http_client_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_http_client_status" }
        }
      val getMaxRedirects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_max_redirects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_redirects" }
        }
      val getTimeout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "get_timeout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_timeout" }
        }
      val isUsingThreads: CPointer<godot_method_bind>
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
      val setBodySizeLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_body_size_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_body_size_limit" }
        }
      val setDownloadChunkSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_download_chunk_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_download_chunk_size" }
        }
      val setDownloadFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_download_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_download_file" }
        }
      val setMaxRedirects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_max_redirects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_redirects" }
        }
      val setTimeout: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_timeout".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_timeout" }
        }
      val setUseThreads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
            "set_use_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_threads" }
        }}
  }
}
