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
  enum class CompressionMode(
    val value: Int
  ) {
    COMPRESS_NONE(0),

    COMPRESS_RANGE_CODER(1),

    COMPRESS_FASTLZ(2),

    COMPRESS_ZLIB(3),

    COMPRESS_ZSTD(4);
  }

  companion object {
    val COMPRESS_FASTLZ: Int = 2

    val COMPRESS_NONE: Int = 0

    val COMPRESS_RANGE_CODER: Int = 1

    val COMPRESS_ZLIB: Int = 3

    val COMPRESS_ZSTD: Int = 4

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
