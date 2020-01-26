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

open class SpriteBase3D internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  enum class DrawFlags(
    val value: Int
  ) {
    FLAG_TRANSPARENT(0),

    FLAG_SHADED(1),

    FLAG_DOUBLE_SIDED(2),

    FLAG_MAX(3);
  }

  enum class AlphaCutMode(
    val value: Int
  ) {
    ALPHA_CUT_DISABLED(0),

    ALPHA_CUT_DISCARD(1),

    ALPHA_CUT_OPAQUE_PREPASS(2);
  }

  companion object {
    val ALPHA_CUT_DISABLED: Int = 0

    val ALPHA_CUT_DISCARD: Int = 1

    val ALPHA_CUT_OPAQUE_PREPASS: Int = 2

    val FLAG_DOUBLE_SIDED: Int = 2

    val FLAG_MAX: Int = 3

    val FLAG_SHADED: Int = 1

    val FLAG_TRANSPARENT: Int = 0
  }
}
