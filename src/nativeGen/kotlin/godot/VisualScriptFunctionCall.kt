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

open class VisualScriptFunctionCall internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  enum class RPCCallMode(
    val value: Int
  ) {
    RPC_DISABLED(0),

    RPC_RELIABLE(1),

    RPC_UNRELIABLE(2),

    RPC_RELIABLE_TO_ID(3),

    RPC_UNRELIABLE_TO_ID(4);
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2),

    CALL_MODE_BASIC_TYPE(3),

    CALL_MODE_SINGLETON(4);
  }

  companion object {
    val CALL_MODE_BASIC_TYPE: Int = 3

    val CALL_MODE_INSTANCE: Int = 2

    val CALL_MODE_NODE_PATH: Int = 1

    val CALL_MODE_SELF: Int = 0

    val CALL_MODE_SINGLETON: Int = 4

    val RPC_DISABLED: Int = 0

    val RPC_RELIABLE: Int = 1

    val RPC_RELIABLE_TO_ID: Int = 3

    val RPC_UNRELIABLE: Int = 2

    val RPC_UNRELIABLE_TO_ID: Int = 4

    fun new(): VisualScriptFunctionCall = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptFunctionCall".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualScriptFunctionCall" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptFunctionCall(
        fn()
      )
    }}
}
