// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HTTPClient internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun close() {
    __method_bind.close.call(this.toVariant())
  }

  fun connectToHost(
    host: String,
    port: Int,
    useSsl: Boolean,
    verifyHost: Boolean
  ): GDError {
    val _args = VariantArray.new()
    _args.append(host)
    _args.append(port)
    _args.append(useSsl)
    _args.append(verifyHost)
    val _ret = __method_bind.connect_to_host.call(this.toVariant(), _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun getConnection(): StreamPeer {
    val _ret = __method_bind.get_connection.call(this.toVariant())
    return _ret.asObject(::StreamPeer)!!
  }

  fun getResponseBodyLength(): Int {
    val _ret = __method_bind.get_response_body_length.call(this.toVariant())
    return _ret.asInt()
  }

  fun getResponseCode(): Int {
    val _ret = __method_bind.get_response_code.call(this.toVariant())
    return _ret.asInt()
  }

  fun getResponseHeaders(): PoolStringArray {
    val _ret = __method_bind.get_response_headers.call(this.toVariant())
    return _ret.asPoolStringArray()
  }

  fun getResponseHeadersAsDictionary(): Dictionary {
    val _ret = __method_bind.get_response_headers_as_dictionary.call(this.toVariant())
    return _ret.asDictionary()
  }

  fun getStatus(): Status {
    val _ret = __method_bind.get_status.call(this.toVariant())
    return HTTPClient.Status.from(_ret.asInt())
  }

  fun hasResponse(): Boolean {
    val _ret = __method_bind.has_response.call(this.toVariant())
    return _ret.asBool()
  }

  fun isBlockingModeEnabled(): Boolean {
    val _ret = __method_bind.is_blocking_mode_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isResponseChunked(): Boolean {
    val _ret = __method_bind.is_response_chunked.call(this.toVariant())
    return _ret.asBool()
  }

  fun poll(): GDError {
    val _ret = __method_bind.poll.call(this.toVariant())
    return GDError.from(_ret.asInt())
  }

  fun queryStringFromDict(fields: Dictionary): String {
    val _args = VariantArray.new()
    _args.append(fields)
    val _ret = __method_bind.query_string_from_dict.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asString()
  }

  fun readResponseBodyChunk(): PoolByteArray {
    val _ret = __method_bind.read_response_body_chunk.call(this.toVariant())
    return _ret.asPoolByteArray()
  }

  fun request(
    method: Int,
    url: String,
    headers: PoolStringArray,
    body: String
  ): GDError {
    val _args = VariantArray.new()
    _args.append(method)
    _args.append(url)
    _args.append(headers)
    _args.append(body)
    val _ret = __method_bind.request.call(this.toVariant(), _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun requestRaw(
    method: Int,
    url: String,
    headers: PoolStringArray,
    body: PoolByteArray
  ): GDError {
    val _args = VariantArray.new()
    _args.append(method)
    _args.append(url)
    _args.append(headers)
    _args.append(body)
    val _ret = __method_bind.request_raw.call(this.toVariant(), _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun setBlockingMode(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_blocking_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setConnection(connection: StreamPeer) {
    val _args = VariantArray.new()
    _args.append(connection)
    __method_bind.set_connection.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setReadChunkSize(bytes: Int) {
    val _args = VariantArray.new()
    _args.append(bytes)
    __method_bind.set_read_chunk_size.call(this.toVariant(), _args.toVariant(), 1)
  }

  enum class Status(
    val value: Int
  ) {
    STATUS_DISCONNECTED(0),

    STATUS_RESOLVING(1),

    STATUS_CANT_RESOLVE(2),

    STATUS_CONNECTING(3),

    STATUS_CANT_CONNECT(4),

    STATUS_CONNECTED(5),

    STATUS_REQUESTING(6),

    STATUS_BODY(7),

    STATUS_CONNECTION_ERROR(8),

    STATUS_SSL_HANDSHAKE_ERROR(9);

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
    METHOD_GET(0),

    METHOD_HEAD(1),

    METHOD_POST(2),

    METHOD_PUT(3),

    METHOD_DELETE(4),

    METHOD_OPTIONS(5),

    METHOD_TRACE(6),

    METHOD_CONNECT(7),

    METHOD_PATCH(8),

    METHOD_MAX(9);

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
    RESPONSE_CONTINUE(100),

    RESPONSE_SWITCHING_PROTOCOLS(101),

    RESPONSE_PROCESSING(102),

    RESPONSE_OK(200),

    RESPONSE_CREATED(201),

    RESPONSE_ACCEPTED(202),

    RESPONSE_NON_AUTHORITATIVE_INFORMATION(203),

    RESPONSE_NO_CONTENT(204),

    RESPONSE_RESET_CONTENT(205),

    RESPONSE_PARTIAL_CONTENT(206),

    RESPONSE_MULTI_STATUS(207),

    RESPONSE_ALREADY_REPORTED(208),

    RESPONSE_IM_USED(226),

    RESPONSE_MULTIPLE_CHOICES(300),

    RESPONSE_MOVED_PERMANENTLY(301),

    RESPONSE_FOUND(302),

    RESPONSE_SEE_OTHER(303),

    RESPONSE_NOT_MODIFIED(304),

    RESPONSE_USE_PROXY(305),

    RESPONSE_SWITCH_PROXY(306),

    RESPONSE_TEMPORARY_REDIRECT(307),

    RESPONSE_PERMANENT_REDIRECT(308),

    RESPONSE_BAD_REQUEST(400),

    RESPONSE_UNAUTHORIZED(401),

    RESPONSE_PAYMENT_REQUIRED(402),

    RESPONSE_FORBIDDEN(403),

    RESPONSE_NOT_FOUND(404),

    RESPONSE_METHOD_NOT_ALLOWED(405),

    RESPONSE_NOT_ACCEPTABLE(406),

    RESPONSE_PROXY_AUTHENTICATION_REQUIRED(407),

    RESPONSE_REQUEST_TIMEOUT(408),

    RESPONSE_CONFLICT(409),

    RESPONSE_GONE(410),

    RESPONSE_LENGTH_REQUIRED(411),

    RESPONSE_PRECONDITION_FAILED(412),

    RESPONSE_REQUEST_ENTITY_TOO_LARGE(413),

    RESPONSE_REQUEST_URI_TOO_LONG(414),

    RESPONSE_UNSUPPORTED_MEDIA_TYPE(415),

    RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE(416),

    RESPONSE_EXPECTATION_FAILED(417),

    RESPONSE_IM_A_TEAPOT(418),

    RESPONSE_MISDIRECTED_REQUEST(421),

    RESPONSE_UNPROCESSABLE_ENTITY(422),

    RESPONSE_LOCKED(423),

    RESPONSE_FAILED_DEPENDENCY(424),

    RESPONSE_UPGRADE_REQUIRED(426),

    RESPONSE_PRECONDITION_REQUIRED(428),

    RESPONSE_TOO_MANY_REQUESTS(429),

    RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE(431),

    RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS(451),

    RESPONSE_INTERNAL_SERVER_ERROR(500),

    RESPONSE_NOT_IMPLEMENTED(501),

    RESPONSE_BAD_GATEWAY(502),

    RESPONSE_SERVICE_UNAVAILABLE(503),

    RESPONSE_GATEWAY_TIMEOUT(504),

    RESPONSE_HTTP_VERSION_NOT_SUPPORTED(505),

    RESPONSE_VARIANT_ALSO_NEGOTIATES(506),

    RESPONSE_INSUFFICIENT_STORAGE(507),

    RESPONSE_LOOP_DETECTED(508),

    RESPONSE_NOT_EXTENDED(510),

    RESPONSE_NETWORK_AUTH_REQUIRED(511);

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
    val METHOD_CONNECT: Int = 7

    val METHOD_DELETE: Int = 4

    val METHOD_GET: Int = 0

    val METHOD_HEAD: Int = 1

    val METHOD_MAX: Int = 9

    val METHOD_OPTIONS: Int = 5

    val METHOD_PATCH: Int = 8

    val METHOD_POST: Int = 2

    val METHOD_PUT: Int = 3

    val METHOD_TRACE: Int = 6

    val RESPONSE_ACCEPTED: Int = 202

    val RESPONSE_ALREADY_REPORTED: Int = 208

    val RESPONSE_BAD_GATEWAY: Int = 502

    val RESPONSE_BAD_REQUEST: Int = 400

    val RESPONSE_CONFLICT: Int = 409

    val RESPONSE_CONTINUE: Int = 100

    val RESPONSE_CREATED: Int = 201

    val RESPONSE_EXPECTATION_FAILED: Int = 417

    val RESPONSE_FAILED_DEPENDENCY: Int = 424

    val RESPONSE_FORBIDDEN: Int = 403

    val RESPONSE_FOUND: Int = 302

    val RESPONSE_GATEWAY_TIMEOUT: Int = 504

    val RESPONSE_GONE: Int = 410

    val RESPONSE_HTTP_VERSION_NOT_SUPPORTED: Int = 505

    val RESPONSE_IM_A_TEAPOT: Int = 418

    val RESPONSE_IM_USED: Int = 226

    val RESPONSE_INSUFFICIENT_STORAGE: Int = 507

    val RESPONSE_INTERNAL_SERVER_ERROR: Int = 500

    val RESPONSE_LENGTH_REQUIRED: Int = 411

    val RESPONSE_LOCKED: Int = 423

    val RESPONSE_LOOP_DETECTED: Int = 508

    val RESPONSE_METHOD_NOT_ALLOWED: Int = 405

    val RESPONSE_MISDIRECTED_REQUEST: Int = 421

    val RESPONSE_MOVED_PERMANENTLY: Int = 301

    val RESPONSE_MULTIPLE_CHOICES: Int = 300

    val RESPONSE_MULTI_STATUS: Int = 207

    val RESPONSE_NETWORK_AUTH_REQUIRED: Int = 511

    val RESPONSE_NON_AUTHORITATIVE_INFORMATION: Int = 203

    val RESPONSE_NOT_ACCEPTABLE: Int = 406

    val RESPONSE_NOT_EXTENDED: Int = 510

    val RESPONSE_NOT_FOUND: Int = 404

    val RESPONSE_NOT_IMPLEMENTED: Int = 501

    val RESPONSE_NOT_MODIFIED: Int = 304

    val RESPONSE_NO_CONTENT: Int = 204

    val RESPONSE_OK: Int = 200

    val RESPONSE_PARTIAL_CONTENT: Int = 206

    val RESPONSE_PAYMENT_REQUIRED: Int = 402

    val RESPONSE_PERMANENT_REDIRECT: Int = 308

    val RESPONSE_PRECONDITION_FAILED: Int = 412

    val RESPONSE_PRECONDITION_REQUIRED: Int = 428

    val RESPONSE_PROCESSING: Int = 102

    val RESPONSE_PROXY_AUTHENTICATION_REQUIRED: Int = 407

    val RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE: Int = 416

    val RESPONSE_REQUEST_ENTITY_TOO_LARGE: Int = 413

    val RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE: Int = 431

    val RESPONSE_REQUEST_TIMEOUT: Int = 408

    val RESPONSE_REQUEST_URI_TOO_LONG: Int = 414

    val RESPONSE_RESET_CONTENT: Int = 205

    val RESPONSE_SEE_OTHER: Int = 303

    val RESPONSE_SERVICE_UNAVAILABLE: Int = 503

    val RESPONSE_SWITCHING_PROTOCOLS: Int = 101

    val RESPONSE_SWITCH_PROXY: Int = 306

    val RESPONSE_TEMPORARY_REDIRECT: Int = 307

    val RESPONSE_TOO_MANY_REQUESTS: Int = 429

    val RESPONSE_UNAUTHORIZED: Int = 401

    val RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS: Int = 451

    val RESPONSE_UNPROCESSABLE_ENTITY: Int = 422

    val RESPONSE_UNSUPPORTED_MEDIA_TYPE: Int = 415

    val RESPONSE_UPGRADE_REQUIRED: Int = 426

    val RESPONSE_USE_PROXY: Int = 305

    val RESPONSE_VARIANT_ALSO_NEGOTIATES: Int = 506

    val STATUS_BODY: Int = 7

    val STATUS_CANT_CONNECT: Int = 4

    val STATUS_CANT_RESOLVE: Int = 2

    val STATUS_CONNECTED: Int = 5

    val STATUS_CONNECTING: Int = 3

    val STATUS_CONNECTION_ERROR: Int = 8

    val STATUS_DISCONNECTED: Int = 0

    val STATUS_REQUESTING: Int = 6

    val STATUS_RESOLVING: Int = 1

    val STATUS_SSL_HANDSHAKE_ERROR: Int = 9

    fun new(): HTTPClient = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPClient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton HTTPClient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HTTPClient(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): HTTPClient = HTTPClient(ptr)
    /**
     * Container for method_bind pointers for HTTPClient
     */
    private object __method_bind {
      val close: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "close".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method close" }
            }
          }

      val connect_to_host: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "connect_to_host".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_to_host" }
            }
          }

      val get_connection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "get_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection" }
            }
          }

      val get_response_body_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "get_response_body_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_response_body_length" }
            }
          }

      val get_response_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "get_response_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_response_code" }
            }
          }

      val get_response_headers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "get_response_headers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_response_headers" }
            }
          }

      val get_response_headers_as_dictionary: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "get_response_headers_as_dictionary".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_response_headers_as_dictionary" }
            }
          }

      val get_status: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "get_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_status" }
            }
          }

      val has_response: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "has_response".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_response" }
            }
          }

      val is_blocking_mode_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "is_blocking_mode_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_blocking_mode_enabled" }
            }
          }

      val is_response_chunked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "is_response_chunked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_response_chunked" }
            }
          }

      val poll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "poll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method poll" }
            }
          }

      val query_string_from_dict: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "query_string_from_dict".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method query_string_from_dict" }
            }
          }

      val read_response_body_chunk: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "read_response_body_chunk".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method read_response_body_chunk" }
            }
          }

      val request: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "request".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method request" }
            }
          }

      val request_raw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "request_raw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method request_raw" }
            }
          }

      val set_blocking_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "set_blocking_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blocking_mode" }
            }
          }

      val set_connection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "set_connection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_connection" }
            }
          }

      val set_read_chunk_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPClient".cstr.ptr,
              "set_read_chunk_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_read_chunk_size" }
            }
          }
    }
  }
}
