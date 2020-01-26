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

open class StreamPeerTCP internal constructor(
  _handle: COpaquePointer
) : StreamPeer(_handle) {
  enum class Status(
    val value: Int
  ) {
    STATUS_NONE(0),

    STATUS_CONNECTING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3);
  }

  companion object {
    val STATUS_CONNECTED: Int = 2

    val STATUS_CONNECTING: Int = 1

    val STATUS_ERROR: Int = 3

    val STATUS_NONE: Int = 0

    fun new(): StreamPeerTCP = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StreamPeerTCP".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for StreamPeerTCP" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StreamPeerTCP(
        fn()
      )
    }}
}
