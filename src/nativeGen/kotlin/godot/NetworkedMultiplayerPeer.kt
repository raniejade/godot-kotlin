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
  enum class ConnectionStatus(
    val value: Int
  ) {
    CONNECTION_DISCONNECTED(0),

    CONNECTION_CONNECTING(1),

    CONNECTION_CONNECTED(2);
  }

  enum class TransferMode(
    val value: Int
  ) {
    TRANSFER_MODE_UNRELIABLE(0),

    TRANSFER_MODE_UNRELIABLE_ORDERED(1),

    TRANSFER_MODE_RELIABLE(2);
  }

  companion object {
    val CONNECTION_CONNECTED: Int = 2

    val CONNECTION_CONNECTING: Int = 1

    val CONNECTION_DISCONNECTED: Int = 0

    val TARGET_PEER_BROADCAST: Int = 0

    val TARGET_PEER_SERVER: Int = 1

    val TRANSFER_MODE_RELIABLE: Int = 2

    val TRANSFER_MODE_UNRELIABLE: Int = 0

    val TRANSFER_MODE_UNRELIABLE_ORDERED: Int = 1
  }
}
