// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class VisualScriptFunctionCall internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  companion object {
    val CallModeBasicType: Int = 3

    val CallModeInstance: Int = 2

    val CallModeNodePath: Int = 1

    val CallModeSelf: Int = 0

    val CallModeSingleton: Int = 4

    val RpcDisabled: Int = 0

    val RpcReliable: Int = 1

    val RpcReliableToId: Int = 3

    val RpcUnreliable: Int = 2

    val RpcUnreliableToId: Int = 4

    fun new(): VisualScriptFunctionCall {
      TODO()
    }
  }
}
