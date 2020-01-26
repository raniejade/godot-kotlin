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

open class Input internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val Instance: Input = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Input".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton Input" }
          Input(
            handle
          )
        }

    val CursorArrow: Int = 0

    val CursorBdiagsize: Int = 11

    val CursorBusy: Int = 5

    val CursorCanDrop: Int = 7

    val CursorCross: Int = 3

    val CursorDrag: Int = 6

    val CursorFdiagsize: Int = 12

    val CursorForbidden: Int = 8

    val CursorHelp: Int = 16

    val CursorHsize: Int = 10

    val CursorHsplit: Int = 15

    val CursorIbeam: Int = 1

    val CursorMove: Int = 13

    val CursorPointingHand: Int = 2

    val CursorVsize: Int = 9

    val CursorVsplit: Int = 14

    val CursorWait: Int = 4

    val MouseModeCaptured: Int = 2

    val MouseModeConfined: Int = 3

    val MouseModeHidden: Int = 1

    val MouseModeVisible: Int = 0
  }
}
