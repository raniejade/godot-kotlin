// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _redirect_request(arg0: String) {
    TODO()
  }

  open fun _request_done(
    arg0: Int,
    arg1: Int,
    arg2: PoolStringArray,
    arg3: PoolByteArray
  ) {
    TODO()
  }

  open fun _timeout() {
    TODO()
  }

  fun cancelRequest() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cancelRequest.call(self._handle, emptyList(), null)
    }
  }

  fun getBodySize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBodySize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBodySizeLimit(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBodySizeLimit.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDownloadChunkSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDownloadChunkSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDownloadFile(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getDownloadFile.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getDownloadedBytes(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDownloadedBytes.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getHttpClientStatus(): HTTPClient.Status {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHttpClientStatus.call(self._handle, emptyList(), _retPtr)
      HTTPClient.Status.from(_ret.value)
    }
  }

  fun getMaxRedirects(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMaxRedirects.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTimeout(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimeout.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingThreads(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingThreads.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun request(
    url: String,
    customHeaders: PoolStringArray,
    sslValidateDomain: Boolean = true,
    method: Int = 0,
    requestData: String = ""
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(url)
      _args.add(customHeaders)
      _args.add(sslValidateDomain)
      _args.add(method)
      _args.add(requestData)
      __method_bind.request.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setBodySizeLimit(bytes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBodySizeLimit.call(self._handle, listOf(bytes), null)
    }
  }

  fun setDownloadChunkSize(arg0: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDownloadChunkSize.call(self._handle, listOf(arg0), null)
    }
  }

  fun setDownloadFile(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDownloadFile.call(self._handle, listOf(path), null)
    }
  }

  fun setMaxRedirects(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxRedirects.call(self._handle, listOf(amount), null)
    }
  }

  fun setTimeout(timeout: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTimeout.call(self._handle, listOf(timeout), null)
    }
  }

  fun setUseThreads(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseThreads.call(self._handle, listOf(enable), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPRequest".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HTTPRequest" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for HTTPRequest
     */
    private object __method_bind {
      val cancelRequest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "cancel_request".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cancel_request" }
            }
          }

      val getBodySize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_body_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_body_size" }
            }
          }

      val getBodySizeLimit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_body_size_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_body_size_limit" }
            }
          }

      val getDownloadChunkSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_download_chunk_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_download_chunk_size" }
            }
          }

      val getDownloadFile: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_download_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_download_file" }
            }
          }

      val getDownloadedBytes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_downloaded_bytes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_downloaded_bytes" }
            }
          }

      val getHttpClientStatus: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_http_client_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_http_client_status" }
            }
          }

      val getMaxRedirects: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_max_redirects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_redirects" }
            }
          }

      val getTimeout: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_timeout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_timeout" }
            }
          }

      val isUsingThreads: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "is_using_threads".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_threads" }
            }
          }

      val request: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "request".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method request" }
            }
          }

      val setBodySizeLimit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_body_size_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_body_size_limit" }
            }
          }

      val setDownloadChunkSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_download_chunk_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_download_chunk_size" }
            }
          }

      val setDownloadFile: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_download_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_download_file" }
            }
          }

      val setMaxRedirects: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_max_redirects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_redirects" }
            }
          }

      val setTimeout: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_timeout".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_timeout" }
            }
          }

      val setUseThreads: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_use_threads".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_threads" }
            }
          }
    }
  }
}
