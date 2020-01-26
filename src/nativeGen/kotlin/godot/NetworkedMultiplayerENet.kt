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

open class NetworkedMultiplayerENet internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  companion object {
    val CompressFastlz: Int = 2

    val CompressNone: Int = 0

    val CompressRangeCoder: Int = 1

    val CompressZlib: Int = 3

    val CompressZstd: Int = 4

    fun new(): NetworkedMultiplayerENet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NetworkedMultiplayerENet".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for NetworkedMultiplayerENet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      NetworkedMultiplayerENet(
        fn()
      )
    }}
}
