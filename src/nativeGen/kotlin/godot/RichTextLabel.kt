// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RichTextLabel internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addImage() {
    TODO()
  }

  fun addText() {
    TODO()
  }

  fun appendBbcode(): Error {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun getBbcode(): String {
    TODO()
  }

  fun getContentHeight(): Int {
    TODO()
  }

  fun getLineCount(): Int {
    TODO()
  }

  fun getPercentVisible(): Float {
    TODO()
  }

  fun getTabSize(): Int {
    TODO()
  }

  fun getText(): String {
    TODO()
  }

  fun getTotalCharacterCount(): Int {
    TODO()
  }

  fun getVScroll(): VScrollBar {
    TODO()
  }

  fun getVisibleCharacters(): Int {
    TODO()
  }

  fun getVisibleLineCount(): Int {
    TODO()
  }

  fun isMetaUnderlined(): Boolean {
    TODO()
  }

  fun isOverridingSelectedFontColor(): Boolean {
    TODO()
  }

  fun isScrollActive(): Boolean {
    TODO()
  }

  fun isScrollFollowing(): Boolean {
    TODO()
  }

  fun isSelectionEnabled(): Boolean {
    TODO()
  }

  fun isUsingBbcode(): Boolean {
    TODO()
  }

  fun newline() {
    TODO()
  }

  fun parseBbcode(): Error {
    TODO()
  }

  fun pop() {
    TODO()
  }

  fun pushAlign() {
    TODO()
  }

  fun pushCell() {
    TODO()
  }

  fun pushColor() {
    TODO()
  }

  fun pushFont() {
    TODO()
  }

  fun pushIndent() {
    TODO()
  }

  fun pushList() {
    TODO()
  }

  fun pushMeta() {
    TODO()
  }

  fun pushStrikethrough() {
    TODO()
  }

  fun pushTable() {
    TODO()
  }

  fun pushUnderline() {
    TODO()
  }

  fun removeLine(): Boolean {
    TODO()
  }

  fun scrollToLine() {
    TODO()
  }

  fun setBbcode() {
    TODO()
  }

  fun setMetaUnderline() {
    TODO()
  }

  fun setOverrideSelectedFontColor() {
    TODO()
  }

  fun setPercentVisible() {
    TODO()
  }

  fun setScrollActive() {
    TODO()
  }

  fun setScrollFollow() {
    TODO()
  }

  fun setSelectionEnabled() {
    TODO()
  }

  fun setTabSize() {
    TODO()
  }

  fun setTableColumnExpand() {
    TODO()
  }

  fun setText() {
    TODO()
  }

  fun setUseBbcode() {
    TODO()
  }

  fun setVisibleCharacters() {
    TODO()
  }

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
      requireNotNull(fnPtr) { "No instance found for singleton RichTextLabel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RichTextLabel(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for RichTextLabel
     */
    private object __method_bind {
      val add_image: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "add_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_image" }
            }
          }

      val add_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "add_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_text" }
            }
          }

      val append_bbcode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "append_bbcode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method append_bbcode" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_bbcode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_bbcode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bbcode" }
            }
          }

      val get_content_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_content_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_content_height" }
            }
          }

      val get_line_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_line_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_count" }
            }
          }

      val get_percent_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_percent_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_percent_visible" }
            }
          }

      val get_tab_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_tab_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tab_size" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val get_total_character_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_total_character_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_total_character_count" }
            }
          }

      val get_v_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_v_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
            }
          }

      val get_visible_characters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_visible_characters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visible_characters" }
            }
          }

      val get_visible_line_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "get_visible_line_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visible_line_count" }
            }
          }

      val is_meta_underlined: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "is_meta_underlined".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_meta_underlined" }
            }
          }

      val is_overriding_selected_font_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "is_overriding_selected_font_color".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_overriding_selected_font_color" }
            }
          }

      val is_scroll_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "is_scroll_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_scroll_active" }
            }
          }

      val is_scroll_following: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "is_scroll_following".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_scroll_following" }
            }
          }

      val is_selection_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "is_selection_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selection_enabled" }
            }
          }

      val is_using_bbcode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "is_using_bbcode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_bbcode" }
            }
          }

      val newline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "newline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method newline" }
            }
          }

      val parse_bbcode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "parse_bbcode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse_bbcode" }
            }
          }

      val pop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "pop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method pop" }
            }
          }

      val push_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_align" }
            }
          }

      val push_cell: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_cell".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_cell" }
            }
          }

      val push_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_color" }
            }
          }

      val push_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_font" }
            }
          }

      val push_indent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_indent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_indent" }
            }
          }

      val push_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_list" }
            }
          }

      val push_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_meta" }
            }
          }

      val push_strikethrough: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_strikethrough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_strikethrough" }
            }
          }

      val push_table: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_table".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_table" }
            }
          }

      val push_underline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "push_underline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method push_underline" }
            }
          }

      val remove_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "remove_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_line" }
            }
          }

      val scroll_to_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "scroll_to_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method scroll_to_line" }
            }
          }

      val set_bbcode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_bbcode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bbcode" }
            }
          }

      val set_meta_underline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_meta_underline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_meta_underline" }
            }
          }

      val set_override_selected_font_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_override_selected_font_color".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_override_selected_font_color" }
            }
          }

      val set_percent_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_percent_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_percent_visible" }
            }
          }

      val set_scroll_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_scroll_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scroll_active" }
            }
          }

      val set_scroll_follow: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_scroll_follow".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scroll_follow" }
            }
          }

      val set_selection_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_selection_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selection_enabled" }
            }
          }

      val set_tab_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_tab_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tab_size" }
            }
          }

      val set_table_column_expand: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_table_column_expand".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_table_column_expand" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }

      val set_use_bbcode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_use_bbcode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_bbcode" }
            }
          }

      val set_visible_characters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
              "set_visible_characters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visible_characters" }
            }
          }
    }
  }
}
