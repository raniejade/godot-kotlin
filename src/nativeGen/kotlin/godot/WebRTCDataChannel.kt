// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class WebRTCDataChannel internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  companion object {
    val StateClosed: Int = 3

    val StateClosing: Int = 2

    val StateConnecting: Int = 0

    val StateOpen: Int = 1

    val WriteModeBinary: Int = 1

    val WriteModeText: Int = 0
  }
}
