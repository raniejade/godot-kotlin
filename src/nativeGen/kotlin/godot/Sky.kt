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

open class Sky internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class RadianceSize(
    val value: Int
  ) {
    RADIANCE_SIZE_32(0),

    RADIANCE_SIZE_64(1),

    RADIANCE_SIZE_128(2),

    RADIANCE_SIZE_256(3),

    RADIANCE_SIZE_512(4),

    RADIANCE_SIZE_1024(5),

    RADIANCE_SIZE_2048(6),

    RADIANCE_SIZE_MAX(7);
  }

  companion object {
    val RADIANCE_SIZE_1024: Int = 5

    val RADIANCE_SIZE_128: Int = 2

    val RADIANCE_SIZE_2048: Int = 6

    val RADIANCE_SIZE_256: Int = 3

    val RADIANCE_SIZE_32: Int = 0

    val RADIANCE_SIZE_512: Int = 4

    val RADIANCE_SIZE_64: Int = 1

    val RADIANCE_SIZE_MAX: Int = 7
  }
}
