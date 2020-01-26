// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class NetworkedMultiplayerENet internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  companion object {
    val CompressFastlz: Int = 2

    val CompressNone: Int = 0

    val CompressRangeCoder: Int = 1

    val CompressZlib: Int = 3

    val CompressZstd: Int = 4

    fun new(): NetworkedMultiplayerENet {
      TODO()
    }
  }
}
