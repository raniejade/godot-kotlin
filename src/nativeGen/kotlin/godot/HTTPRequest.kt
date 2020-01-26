// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HTTPRequest internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
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
      requireNotNull(fnPtr) { "No instance found for singleton HTTPRequest" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HTTPRequest(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for HTTPRequest
     */
    private object __method_bind {
      val _redirect_request: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "_redirect_request".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _redirect_request" }
            }
          }

      val _request_done: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "_request_done".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _request_done" }
            }
          }

      val cancel_request: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "cancel_request".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cancel_request" }
            }
          }

      val get_body_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_body_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_body_size" }
            }
          }

      val get_body_size_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_body_size_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_body_size_limit" }
            }
          }

      val get_download_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_download_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_download_file" }
            }
          }

      val get_downloaded_bytes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_downloaded_bytes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_downloaded_bytes" }
            }
          }

      val get_http_client_status: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_http_client_status".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_http_client_status" }
            }
          }

      val get_max_redirects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "get_max_redirects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_redirects" }
            }
          }

      val is_using_threads: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "is_using_threads".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_threads" }
            }
          }

      val request: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "request".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method request" }
            }
          }

      val set_body_size_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_body_size_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_body_size_limit" }
            }
          }

      val set_download_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_download_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_download_file" }
            }
          }

      val set_max_redirects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_max_redirects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_redirects" }
            }
          }

      val set_use_threads: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HTTPRequest".cstr.ptr,
              "set_use_threads".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_threads" }
            }
          }
    }
  }
}
