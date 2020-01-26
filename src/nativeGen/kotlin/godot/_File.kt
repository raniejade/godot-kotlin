// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class _File internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val CompressionDeflate: Int = 1

    val CompressionFastlz: Int = 0

    val CompressionGzip: Int = 3

    val CompressionZstd: Int = 2

    val Read: Int = 1

    val ReadWrite: Int = 3

    val Write: Int = 2

    val WriteRead: Int = 7

    fun new(): _File {
      TODO()
    }
  }
}
