// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class StreamPeerTCP internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  companion object {
    val StatusConnected: Int = 2

    val StatusConnecting: Int = 1

    val StatusError: Int = 3

    val StatusNone: Int = 0

    fun new(): StreamPeerTCP {
      TODO()
    }
  }
}
