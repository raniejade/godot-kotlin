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

open class RichTextLabel internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class Align(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);
  }

  enum class ListType(
    val value: Int
  ) {
    LIST_NUMBERS(0),

    LIST_LETTERS(1),

    LIST_DOTS(2);
  }

  enum class ItemType(
    val value: Int
  ) {
    ITEM_FRAME(0),

    ITEM_TEXT(1),

    ITEM_IMAGE(2),

    ITEM_NEWLINE(3),

    ITEM_FONT(4),

    ITEM_COLOR(5),

    ITEM_UNDERLINE(6),

    ITEM_STRIKETHROUGH(7),

    ITEM_ALIGN(8),

    ITEM_INDENT(9),

    ITEM_LIST(10),

    ITEM_TABLE(11),

    ITEM_META(12);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_FILL: Int = 3

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val ITEM_ALIGN: Int = 8

    val ITEM_COLOR: Int = 5

    val ITEM_FONT: Int = 4

    val ITEM_FRAME: Int = 0

    val ITEM_IMAGE: Int = 2

    val ITEM_INDENT: Int = 9

    val ITEM_LIST: Int = 10

    val ITEM_META: Int = 12

    val ITEM_NEWLINE: Int = 3

    val ITEM_STRIKETHROUGH: Int = 7

    val ITEM_TABLE: Int = 11

    val ITEM_TEXT: Int = 1

    val ITEM_UNDERLINE: Int = 6

    val LIST_DOTS: Int = 2

    val LIST_LETTERS: Int = 1

    val LIST_NUMBERS: Int = 0

    fun new(): RichTextLabel = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RichTextLabel".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for RichTextLabel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RichTextLabel(
        fn()
      )
    }}
}
