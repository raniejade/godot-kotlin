// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
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

open class HTTPClient(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var blockingModeEnabled: Boolean
    get() {
       return isBlockingModeEnabled() 
    }
    set(value) {
      setBlockingMode(value)
    }

  var connection: StreamPeer
    get() {
       return getConnection() 
    }
    set(value) {
      setConnection(value)
    }

  var readChunkSize: Int
    get() {
       return getReadChunkSize() 
    }
    set(value) {
      setReadChunkSize(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun close() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.close.call(self._handle, emptyList(), null)
    }
  }

  fun connectToHost(
    host: String,
    port: Int = -1,
    useSsl: Boolean = false,
    verifyHost: Boolean = true
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(host)
      _args.add(port)
      _args.add(useSsl)
      _args.add(verifyHost)
      __method_bind.connectToHost.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getConnection(): StreamPeer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: StreamPeer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getConnection.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<StreamPeer>(_tmp.value!!)
      _ret
    }
  }

  fun getReadChunkSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getReadChunkSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getResponseBodyLength(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResponseBodyLength.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getResponseCode(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResponseCode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getResponseHeaders(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getResponseHeaders.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getResponseHeadersAsDictionary(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getResponseHeadersAsDictionary.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getStatus(): Status {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStatus.call(self._handle, emptyList(), _retPtr)
      HTTPClient.Status.from(_ret.value)
    }
  }

  fun hasResponse(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasResponse.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isBlockingModeEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBlockingModeEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isResponseChunked(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isResponseChunked.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun poll(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.poll.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun queryStringFromDict(fields: Dictionary): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.queryStringFromDict.call(self._handle, listOf(fields), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun readResponseBodyChunk(): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.readResponseBodyChunk.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun request(
    method: Int,
    url: String,
    headers: PoolStringArray,
    body: String = ""
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(method)
      _args.add(url)
      _args.add(headers)
      _args.add(body)
      __method_bind.request.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun requestRaw(
    method: Int,
    url: String,
    headers: PoolStringArray,
    body: PoolByteArray
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(method)
      _args.add(url)
      _args.add(headers)
      _args.add(body)
      __method_bind.requestRaw.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setBlockingMode(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBlockingMode.call(self._handle, listOf(enabled), null)
    }
  }

  fun setConnection(connection: StreamPeer) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConnection.call(self._handle, listOf(connection), null)
    }
  }

  fun setReadChunkSize(bytes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReadChunkSize.call(self._handle, listOf(bytes), null)
    }
  }

  enum class Status(
    val value: Int
  ) {
    DISCONNECTED(0),

    RESOLVING(1),

    CANT_RESOLVE(2),

    CONNECTING(3),

    CANT_CONNECT(4),

    CONNECTED(5),

    REQUESTING(6),

    BODY(7),

    CONNECTION_ERROR(8),

    SSL_HANDSHAKE_ERROR(9);

    companion object {
      fun from(value: Int): Status {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Method(
    val value: Int
  ) {
    GET(0),

    HEAD(1),

    POST(2),

    PUT(3),

    DELETE(4),

    OPTIONS(5),

    TRACE(6),

    CONNECT(7),

    PATCH(8),

    MAX(9);

    companion object {
      fun from(value: Int): Method {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ResponseCode(
    val value: Int
  ) {
    CONTINUE(100),

    SWITCHING_PROTOCOLS(101),

    PROCESSING(102),

    OK(200),

    CREATED(201),

    ACCEPTED(202),

    NON_AUTHORITATIVE_INFORMATION(203),

    NO_CONTENT(204),

    RESET_CONTENT(205),

    PARTIAL_CONTENT(206),

    MULTI_STATUS(207),

    ALREADY_REPORTED(208),

    IM_USED(226),

    MULTIPLE_CHOICES(300),

    MOVED_PERMANENTLY(301),

    FOUND(302),

    SEE_OTHER(303),

    NOT_MODIFIED(304),

    USE_PROXY(305),

    SWITCH_PROXY(306),

    TEMPORARY_REDIRECT(307),

    PERMANENT_REDIRECT(308),

    BAD_REQUEST(400),

    UNAUTHORIZED(401),

    PAYMENT_REQUIRED(402),

    FORBIDDEN(403),

    NOT_FOUND(404),

    METHOD_NOT_ALLOWED(405),

    NOT_ACCEPTABLE(406),

    PROXY_AUTHENTICATION_REQUIRED(407),

    REQUEST_TIMEOUT(408),

    CONFLICT(409),

    GONE(410),

    LENGTH_REQUIRED(411),

    PRECONDITION_FAILED(412),

    REQUEST_ENTITY_TOO_LARGE(413),

    REQUEST_URI_TOO_LONG(414),

    UNSUPPORTED_MEDIA_TYPE(415),

    REQUESTED_RANGE_NOT_SATISFIABLE(416),

    EXPECTATION_FAILED(417),

    IM_A_TEAPOT(418),

    MISDIRECTED_REQUEST(421),

    UNPROCESSABLE_ENTITY(422),

    LOCKED(423),

    FAILED_DEPENDENCY(424),

    UPGRADE_REQUIRED(426),

    PRECONDITION_REQUIRED(428),

    TOO_MANY_REQUESTS(429),

    REQUEST_HEADER_FIELDS_TOO_LARGE(431),

    UNAVAILABLE_FOR_LEGAL_REASONS(451),

    INTERNAL_SERVER_ERROR(500),

    NOT_IMPLEMENTED(501),

    BAD_GATEWAY(502),

    SERVICE_UNAVAILABLE(503),

    GATEWAY_TIMEOUT(504),

    HTTP_VERSION_NOT_SUPPORTED(505),

    VARIANT_ALSO_NEGOTIATES(506),

    INSUFFICIENT_STORAGE(507),

    LOOP_DETECTED(508),

    NOT_EXTENDED(510),

    NETWORK_AUTH_REQUIRED(511);

    companion object {
      fun from(value: Int): ResponseCode {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPClient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HTTPClient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for HTTPClient
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "close".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close" }
        }
      val connectToHost: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "connect_to_host".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_to_host" }
        }
      val getConnection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "get_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection" }
        }
      val getReadChunkSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "get_read_chunk_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_read_chunk_size" }
        }
      val getResponseBodyLength: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "get_response_body_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_response_body_length" }
        }
      val getResponseCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "get_response_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_response_code" }
        }
      val getResponseHeaders: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "get_response_headers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_response_headers" }
        }
      val getResponseHeadersAsDictionary: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "get_response_headers_as_dictionary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_response_headers_as_dictionary"
            }
        }
      val getStatus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "get_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_status" }
        }
      val hasResponse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "has_response".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_response" }
        }
      val isBlockingModeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "is_blocking_mode_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_blocking_mode_enabled" }
        }
      val isResponseChunked: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "is_response_chunked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_response_chunked" }
        }
      val poll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val queryStringFromDict: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "query_string_from_dict".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method query_string_from_dict" }
        }
      val readResponseBodyChunk: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "read_response_body_chunk".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method read_response_body_chunk" }
        }
      val request: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "request".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request" }
        }
      val requestRaw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "request_raw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_raw" }
        }
      val setBlockingMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "set_blocking_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blocking_mode" }
        }
      val setConnection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "set_connection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_connection" }
        }
      val setReadChunkSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
            "set_read_chunk_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_read_chunk_size" }
        }}
  }
}
