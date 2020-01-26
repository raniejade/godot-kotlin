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

open class TreeItem internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  enum class TreeCellMode(
    val value: Int
  ) {
    CELL_MODE_STRING(0),

    CELL_MODE_CHECK(1),

    CELL_MODE_RANGE(2),

    CELL_MODE_ICON(3),

    CELL_MODE_CUSTOM(4);
  }

  enum class TextAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val CELL_MODE_CHECK: Int = 1

    val CELL_MODE_CUSTOM: Int = 4

    val CELL_MODE_ICON: Int = 3

    val CELL_MODE_RANGE: Int = 2

    val CELL_MODE_STRING: Int = 0
  }
}
