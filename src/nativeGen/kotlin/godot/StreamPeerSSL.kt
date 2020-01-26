// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class StreamPeerSSL internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  companion object {
    val StatusConnected: Int = 2

    val StatusDisconnected: Int = 0

    val StatusError: Int = 3

    val StatusErrorHostnameMismatch: Int = 4

    val StatusHandshaking: Int = 1

    fun new(): StreamPeerSSL {
      TODO()
    }
  }
}
