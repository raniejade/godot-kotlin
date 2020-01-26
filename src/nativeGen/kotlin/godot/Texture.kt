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

open class Texture internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(7),

    FLAG_ANISOTROPIC_FILTER(8),

    FLAG_CONVERT_TO_LINEAR(16),

    FLAG_MIRRORED_REPEAT(32),

    FLAG_VIDEO_SURFACE(2048);
  }

  companion object {
    val FLAGS_DEFAULT: Int = 7

    val FLAG_ANISOTROPIC_FILTER: Int = 8

    val FLAG_CONVERT_TO_LINEAR: Int = 16

    val FLAG_FILTER: Int = 4

    val FLAG_MIPMAPS: Int = 1

    val FLAG_MIRRORED_REPEAT: Int = 32

    val FLAG_REPEAT: Int = 2

    val FLAG_VIDEO_SURFACE: Int = 2048
  }
}
