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

open class Control internal constructor(
  _handle: COpaquePointer
) : CanvasItem(_handle) {
  enum class Anchor(
    val value: Int
  ) {
    ANCHOR_BEGIN(0),

    ANCHOR_END(1);
  }

  enum class FocusMode(
    val value: Int
  ) {
    FOCUS_NONE(0),

    FOCUS_CLICK(1),

    FOCUS_ALL(2);
  }

  enum class LayoutPresetMode(
    val value: Int
  ) {
    PRESET_MODE_MINSIZE(0),

    PRESET_MODE_KEEP_WIDTH(1),

    PRESET_MODE_KEEP_HEIGHT(2),

    PRESET_MODE_KEEP_SIZE(3);
  }

  enum class MouseFilter(
    val value: Int
  ) {
    MOUSE_FILTER_STOP(0),

    MOUSE_FILTER_PASS(1),

    MOUSE_FILTER_IGNORE(2);
  }

  enum class CursorShape(
    val value: Int
  ) {
    CURSOR_ARROW(0),

    CURSOR_IBEAM(1),

    CURSOR_POINTING_HAND(2),

    CURSOR_CROSS(3),

    CURSOR_WAIT(4),

    CURSOR_BUSY(5),

    CURSOR_DRAG(6),

    CURSOR_CAN_DROP(7),

    CURSOR_FORBIDDEN(8),

    CURSOR_VSIZE(9),

    CURSOR_HSIZE(10),

    CURSOR_BDIAGSIZE(11),

    CURSOR_FDIAGSIZE(12),

    CURSOR_MOVE(13),

    CURSOR_VSPLIT(14),

    CURSOR_HSPLIT(15),

    CURSOR_HELP(16);
  }

  enum class GrowDirection(
    val value: Int
  ) {
    GROW_DIRECTION_BEGIN(0),

    GROW_DIRECTION_END(1),

    GROW_DIRECTION_BOTH(2);
  }

  enum class SizeFlags(
    val value: Int
  ) {
    SIZE_FILL(1),

    SIZE_EXPAND(2),

    SIZE_EXPAND_FILL(3),

    SIZE_SHRINK_CENTER(4),

    SIZE_SHRINK_END(8);
  }

  enum class LayoutPreset(
    val value: Int
  ) {
    PRESET_TOP_LEFT(0),

    PRESET_TOP_RIGHT(1),

    PRESET_BOTTOM_LEFT(2),

    PRESET_BOTTOM_RIGHT(3),

    PRESET_CENTER_LEFT(4),

    PRESET_CENTER_TOP(5),

    PRESET_CENTER_RIGHT(6),

    PRESET_CENTER_BOTTOM(7),

    PRESET_CENTER(8),

    PRESET_LEFT_WIDE(9),

    PRESET_TOP_WIDE(10),

    PRESET_RIGHT_WIDE(11),

    PRESET_BOTTOM_WIDE(12),

    PRESET_VCENTER_WIDE(13),

    PRESET_HCENTER_WIDE(14),

    PRESET_WIDE(15);
  }

  companion object {
    val ANCHOR_BEGIN: Int = 0

    val ANCHOR_END: Int = 1

    val CURSOR_ARROW: Int = 0

    val CURSOR_BDIAGSIZE: Int = 11

    val CURSOR_BUSY: Int = 5

    val CURSOR_CAN_DROP: Int = 7

    val CURSOR_CROSS: Int = 3

    val CURSOR_DRAG: Int = 6

    val CURSOR_FDIAGSIZE: Int = 12

    val CURSOR_FORBIDDEN: Int = 8

    val CURSOR_HELP: Int = 16

    val CURSOR_HSIZE: Int = 10

    val CURSOR_HSPLIT: Int = 15

    val CURSOR_IBEAM: Int = 1

    val CURSOR_MOVE: Int = 13

    val CURSOR_POINTING_HAND: Int = 2

    val CURSOR_VSIZE: Int = 9

    val CURSOR_VSPLIT: Int = 14

    val CURSOR_WAIT: Int = 4

    val FOCUS_ALL: Int = 2

    val FOCUS_CLICK: Int = 1

    val FOCUS_NONE: Int = 0

    val GROW_DIRECTION_BEGIN: Int = 0

    val GROW_DIRECTION_BOTH: Int = 2

    val GROW_DIRECTION_END: Int = 1

    val MOUSE_FILTER_IGNORE: Int = 2

    val MOUSE_FILTER_PASS: Int = 1

    val MOUSE_FILTER_STOP: Int = 0

    val NOTIFICATION_FOCUS_ENTER: Int = 43

    val NOTIFICATION_FOCUS_EXIT: Int = 44

    val NOTIFICATION_MODAL_CLOSE: Int = 46

    val NOTIFICATION_MOUSE_ENTER: Int = 41

    val NOTIFICATION_MOUSE_EXIT: Int = 42

    val NOTIFICATION_RESIZED: Int = 40

    val NOTIFICATION_SCROLL_BEGIN: Int = 47

    val NOTIFICATION_SCROLL_END: Int = 48

    val NOTIFICATION_THEME_CHANGED: Int = 45

    val PRESET_BOTTOM_LEFT: Int = 2

    val PRESET_BOTTOM_RIGHT: Int = 3

    val PRESET_BOTTOM_WIDE: Int = 12

    val PRESET_CENTER: Int = 8

    val PRESET_CENTER_BOTTOM: Int = 7

    val PRESET_CENTER_LEFT: Int = 4

    val PRESET_CENTER_RIGHT: Int = 6

    val PRESET_CENTER_TOP: Int = 5

    val PRESET_HCENTER_WIDE: Int = 14

    val PRESET_LEFT_WIDE: Int = 9

    val PRESET_MODE_KEEP_HEIGHT: Int = 2

    val PRESET_MODE_KEEP_SIZE: Int = 3

    val PRESET_MODE_KEEP_WIDTH: Int = 1

    val PRESET_MODE_MINSIZE: Int = 0

    val PRESET_RIGHT_WIDE: Int = 11

    val PRESET_TOP_LEFT: Int = 0

    val PRESET_TOP_RIGHT: Int = 1

    val PRESET_TOP_WIDE: Int = 10

    val PRESET_VCENTER_WIDE: Int = 13

    val PRESET_WIDE: Int = 15

    val SIZE_EXPAND: Int = 2

    val SIZE_EXPAND_FILL: Int = 3

    val SIZE_FILL: Int = 1

    val SIZE_SHRINK_CENTER: Int = 4

    val SIZE_SHRINK_END: Int = 8

    fun new(): Control = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Control".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Control" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Control(
        fn()
      )
    }}
}
