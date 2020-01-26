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
  companion object {
    val ResultBodySizeLimitExceeded: Int = 7

    val ResultCantConnect: Int = 2

    val ResultCantResolve: Int = 3

    val ResultChunkedBodySizeMismatch: Int = 1

    val ResultConnectionError: Int = 4

    val ResultDownloadFileCantOpen: Int = 9

    val ResultDownloadFileWriteError: Int = 10

    val ResultNoResponse: Int = 6

    val ResultRedirectLimitReached: Int = 11

    val ResultRequestFailed: Int = 8

    val ResultSslHandshakeError: Int = 5

    val ResultSuccess: Int = 0

    fun new(): HTTPRequest = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("HTTPRequest".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for HTTPRequest" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      HTTPRequest(
        fn()
      )
    }}
}
