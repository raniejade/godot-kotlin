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

open class BaseButton internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class ActionMode(
    val value: Int
  ) {
    ACTION_MODE_BUTTON_PRESS(0),

    ACTION_MODE_BUTTON_RELEASE(1);
  }

  enum class DrawMode(
    val value: Int
  ) {
    DRAW_NORMAL(0),

    DRAW_PRESSED(1),

    DRAW_HOVER(2),

    DRAW_DISABLED(3),

    DRAW_HOVER_PRESSED(4);
  }

  companion object {
    val ACTION_MODE_BUTTON_PRESS: Int = 0

    val ACTION_MODE_BUTTON_RELEASE: Int = 1

    val DRAW_DISABLED: Int = 3

    val DRAW_HOVER: Int = 2

    val DRAW_HOVER_PRESSED: Int = 4

    val DRAW_NORMAL: Int = 0

    val DRAW_PRESSED: Int = 1
  }
}
