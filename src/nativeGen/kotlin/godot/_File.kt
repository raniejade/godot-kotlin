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

open class _File internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class CompressionMode(
    val value: Int
  ) {
    COMPRESSION_FASTLZ(0),

    COMPRESSION_DEFLATE(1),

    COMPRESSION_ZSTD(2),

    COMPRESSION_GZIP(3);
  }

  enum class ModeFlags(
    val value: Int
  ) {
    READ(1),

    WRITE(2),

    READ_WRITE(3),

    WRITE_READ(7);
  }

  companion object {
    val COMPRESSION_DEFLATE: Int = 1

    val COMPRESSION_FASTLZ: Int = 0

    val COMPRESSION_GZIP: Int = 3

    val COMPRESSION_ZSTD: Int = 2

    val READ: Int = 1

    val READ_WRITE: Int = 3

    val WRITE: Int = 2

    val WRITE_READ: Int = 7

    fun new(): _File = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_File".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for _File" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _File(
        fn()
      )
    }}
}
