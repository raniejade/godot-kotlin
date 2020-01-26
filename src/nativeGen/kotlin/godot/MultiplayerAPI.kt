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

open class MultiplayerAPI internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class RPCMode(
    val value: Int
  ) {
    RPC_MODE_DISABLED(0),

    RPC_MODE_REMOTE(1),

    RPC_MODE_MASTER(2),

    RPC_MODE_PUPPET(3),

    RPC_MODE_SLAVE(3),

    RPC_MODE_REMOTESYNC(4),

    RPC_MODE_SYNC(4),

    RPC_MODE_MASTERSYNC(5),

    RPC_MODE_PUPPETSYNC(6);
  }

  companion object {
    val RPC_MODE_DISABLED: Int = 0

    val RPC_MODE_MASTER: Int = 2

    val RPC_MODE_MASTERSYNC: Int = 5

    val RPC_MODE_PUPPET: Int = 3

    val RPC_MODE_PUPPETSYNC: Int = 6

    val RPC_MODE_REMOTE: Int = 1

    val RPC_MODE_REMOTESYNC: Int = 4

    val RPC_MODE_SLAVE: Int = 3

    val RPC_MODE_SYNC: Int = 4

    fun new(): MultiplayerAPI = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiplayerAPI".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for MultiplayerAPI" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiplayerAPI(
        fn()
      )
    }}
}
