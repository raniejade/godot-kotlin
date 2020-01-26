// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
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
      requireNotNull(fnPtr) { "No constructor found for HTTPRequest" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HTTPRequest(
        fn()
      )
    }}
}
