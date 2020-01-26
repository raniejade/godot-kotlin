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

open class WebSocketPeer internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  enum class WriteMode(
    val value: Int
  ) {
    WRITE_MODE_TEXT(0),

    WRITE_MODE_BINARY(1);
  }

  companion object {
    val WRITE_MODE_BINARY: Int = 1

    val WRITE_MODE_TEXT: Int = 0

    fun new(): WebSocketPeer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WebSocketPeer".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for WebSocketPeer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WebSocketPeer(
        fn()
      )
    }}
}
