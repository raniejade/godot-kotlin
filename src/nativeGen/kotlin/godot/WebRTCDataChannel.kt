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

open class WebRTCDataChannel internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  enum class WriteMode(
    val value: Int
  ) {
    WRITE_MODE_TEXT(0),

    WRITE_MODE_BINARY(1);
  }

  enum class ChannelState(
    val value: Int
  ) {
    STATE_CONNECTING(0),

    STATE_OPEN(1),

    STATE_CLOSING(2),

    STATE_CLOSED(3);
  }

  companion object {
    val STATE_CLOSED: Int = 3

    val STATE_CLOSING: Int = 2

    val STATE_CONNECTING: Int = 0

    val STATE_OPEN: Int = 1

    val WRITE_MODE_BINARY: Int = 1

    val WRITE_MODE_TEXT: Int = 0
  }
}
