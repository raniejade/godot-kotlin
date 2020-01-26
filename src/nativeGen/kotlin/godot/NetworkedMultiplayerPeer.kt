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

open class NetworkedMultiplayerPeer internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  companion object {
    val ConnectionConnected: Int = 2

    val ConnectionConnecting: Int = 1

    val ConnectionDisconnected: Int = 0

    val TargetPeerBroadcast: Int = 0

    val TargetPeerServer: Int = 1

    val TransferModeReliable: Int = 2

    val TransferModeUnreliable: Int = 0

    val TransferModeUnreliableOrdered: Int = 1
  }
}
