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
  companion object {
    val StateClosed: Int = 3

    val StateClosing: Int = 2

    val StateConnecting: Int = 0

    val StateOpen: Int = 1

    val WriteModeBinary: Int = 1

    val WriteModeText: Int = 0
  }
}
