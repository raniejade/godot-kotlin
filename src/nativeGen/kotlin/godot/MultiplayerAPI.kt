// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class MultiplayerAPI internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val RpcModeDisabled: Int = 0

    val RpcModeMaster: Int = 2

    val RpcModeMastersync: Int = 5

    val RpcModePuppet: Int = 3

    val RpcModePuppetsync: Int = 6

    val RpcModeRemote: Int = 1

    val RpcModeRemotesync: Int = 4

    val RpcModeSlave: Int = 3

    val RpcModeSync: Int = 4

    fun new(): MultiplayerAPI {
      TODO()
    }
  }
}
