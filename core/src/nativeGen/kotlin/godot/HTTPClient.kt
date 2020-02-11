// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    __method_bind.close.call(this._handle)
  }

  fun connectToHost(
    host: String,
    port: Int = -1,
    useSsl: Boolean = false,
    verifyHost: Boolean = true
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(host))
    _args.add(Variant.fromAny(port))
    _args.add(Variant.fromAny(useSsl))
    _args.add(Variant.fromAny(verifyHost))
    val _ret = __method_bind.connectToHost.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun getConnection(): StreamPeer {
    val _ret = __method_bind.getConnection.call(this._handle)
    return _ret.toAny() as StreamPeer
  }

  fun getReadChunkSize(): Int {
    val _ret = __method_bind.getReadChunkSize.call(this._handle)
    return _ret.asInt()
  }

  fun getResponseBodyLength(): Int {
    val _ret = __method_bind.getResponseBodyLength.call(this._handle)
    return _ret.asInt()
  }

  fun getResponseCode(): Int {
    val _ret = __method_bind.getResponseCode.call(this._handle)
    return _ret.asInt()
  }

  fun getResponseHeaders(): PoolStringArray {
    val _ret = __method_bind.getResponseHeaders.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getResponseHeadersAsDictionary(): Dictionary {
    val _ret = __method_bind.getResponseHeadersAsDictionary.call(this._handle)
    return _ret.asDictionary()
  }

  fun getStatus(): Status {
    val _ret = __method_bind.getStatus.call(this._handle)
    return HTTPClient.Status.from(_ret.asInt())
  }

  fun hasResponse(): Boolean {
    val _ret = __method_bind.hasResponse.call(this._handle)
    return _ret.asBoolean()
  }

  fun isBlockingModeEnabled(): Boolean {
    val _ret = __method_bind.isBlockingModeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isResponseChunked(): Boolean {
    val _ret = __method_bind.isResponseChunked.call(this._handle)
    return _ret.asBoolean()
  }

  fun poll(): GDError {
    val _ret = __method_bind.poll.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun queryStringFromDict(fields: Dictionary): String {
    val _arg = Variant(fields)
    val _ret = __method_bind.queryStringFromDict.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun readResponseBodyChunk(): PoolByteArray {
    val _ret = __method_bind.readResponseBodyChunk.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun request(
    method: Int,
    url: String,
    headers: PoolStringArray,
    body: String = ""
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(url))
    _args.add(Variant.fromAny(headers))
    _args.add(Variant.fromAny(body))
    val _ret = __method_bind.request.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun requestRaw(
    method: Int,
    url: String,
    headers: PoolStringArray,
    body: PoolByteArray
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(url))
    _args.add(Variant.fromAny(headers))
    _args.add(Variant.fromAny(body))
    val _ret = __method_bind.requestRaw.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun setBlockingMode(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setBlockingMode.call(this._handle, listOf(_arg))
  }

  fun setConnection(connection: StreamPeer) {
    val _arg = Variant(connection)
    __method_bind.setConnection.call(this._handle, listOf(_arg))
  }

  fun setReadChunkSize(bytes: Int) {
    val _arg = Variant(bytes)
    __method_bind.setReadChunkSize.call(this._handle, listOf(_arg))
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
