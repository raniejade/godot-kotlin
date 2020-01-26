// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.VariantArray
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

open class TextEdit internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addColorRegion(
    begin_key: String,
    end_key: String,
    color: Color,
    line_only: Boolean
  ) {
    TODO()
  }

  fun addKeywordColor(keyword: String, color: Color) {
    TODO()
  }

  fun canFold(line: Int): Boolean {
    TODO()
  }

  fun clearColors() {
    TODO()
  }

  fun clearUndoHistory() {
    TODO()
  }

  fun copy() {
    TODO()
  }

  fun cursorGetBlinkEnabled(): Boolean {
    TODO()
  }

  fun cursorGetBlinkSpeed(): Float {
    TODO()
  }

  fun cursorGetColumn(): Int {
    TODO()
  }

  fun cursorGetLine(): Int {
    TODO()
  }

  fun cursorIsBlockMode(): Boolean {
    TODO()
  }

  fun cursorSetBlinkEnabled(enable: Boolean) {
    TODO()
  }

  fun cursorSetBlinkSpeed(blink_speed: Float) {
    TODO()
  }

  fun cursorSetBlockMode(enable: Boolean) {
    TODO()
  }

  fun cursorSetColumn(column: Int, adjust_viewport: Boolean) {
    TODO()
  }

  fun cursorSetLine(
    line: Int,
    adjust_viewport: Boolean,
    can_be_hidden: Boolean,
    wrap_index: Int
  ) {
    TODO()
  }

  fun cut() {
    TODO()
  }

  fun deselect() {
    TODO()
  }

  fun foldAllLines() {
    TODO()
  }

  fun foldLine(line: Int) {
    TODO()
  }

  fun getBreakpoints(): VariantArray {
    TODO()
  }

  fun getKeywordColor(keyword: String): Color {
    TODO()
  }

  fun getLine(line: Int): String {
    TODO()
  }

  fun getLineCount(): Int {
    TODO()
  }

  fun getMenu(): PopupMenu {
    TODO()
  }

  fun getSelectionFromColumn(): Int {
    TODO()
  }

  fun getSelectionFromLine(): Int {
    TODO()
  }

  fun getSelectionText(): String {
    TODO()
  }

  fun getSelectionToColumn(): Int {
    TODO()
  }

  fun getSelectionToLine(): Int {
    TODO()
  }

  fun getText(): String {
    TODO()
  }

  fun getVScrollSpeed(): Float {
    TODO()
  }

  fun getWordUnderCursor(): String {
    TODO()
  }

  fun hasKeywordColor(keyword: String): Boolean {
    TODO()
  }

  fun insertTextAtCursor(text: String) {
    TODO()
  }

  fun isBreakpointGutterEnabled(): Boolean {
    TODO()
  }

  fun isContextMenuEnabled(): Boolean {
    TODO()
  }

  fun isDrawingFoldGutter(): Boolean {
    TODO()
  }

  fun isDrawingSpaces(): Boolean {
    TODO()
  }

  fun isDrawingTabs(): Boolean {
    TODO()
  }

  fun isFolded(line: Int): Boolean {
    TODO()
  }

  fun isHidingEnabled(): Boolean {
    TODO()
  }

  fun isHighlightAllOccurrencesEnabled(): Boolean {
    TODO()
  }

  fun isHighlightCurrentLineEnabled(): Boolean {
    TODO()
  }

  fun isLineHidden(line: Int): Boolean {
    TODO()
  }

  fun isOverridingSelectedFontColor(): Boolean {
    TODO()
  }

  fun isReadonly(): Boolean {
    TODO()
  }

  fun isRightClickMovingCaret(): Boolean {
    TODO()
  }

  fun isSelectionActive(): Boolean {
    TODO()
  }

  fun isShowLineNumbersEnabled(): Boolean {
    TODO()
  }

  fun isSmoothScrollEnabled(): Boolean {
    TODO()
  }

  fun isSyntaxColoringEnabled(): Boolean {
    TODO()
  }

  fun isWrapEnabled(): Boolean {
    TODO()
  }

  fun menuOption(option: Int) {
    TODO()
  }

  fun paste() {
    TODO()
  }

  fun redo() {
    TODO()
  }

  fun removeBreakpoints() {
    TODO()
  }

  fun search(
    key: String,
    flags: Int,
    from_line: Int,
    from_column: Int
  ): PoolIntArray {
    TODO()
  }

  fun select(
    from_line: Int,
    from_column: Int,
    to_line: Int,
    to_column: Int
  ) {
    TODO()
  }

  fun selectAll() {
    TODO()
  }

  fun setBreakpointGutterEnabled(enable: Boolean) {
    TODO()
  }

  fun setContextMenuEnabled(enable: Boolean) {
    TODO()
  }

  fun setDrawFoldGutter(arg0: Boolean) {
    TODO()
  }

  fun setDrawSpaces(arg0: Boolean) {
    TODO()
  }

  fun setDrawTabs(arg0: Boolean) {
    TODO()
  }

  fun setHidingEnabled(enable: Boolean) {
    TODO()
  }

  fun setHighlightAllOccurrences(enable: Boolean) {
    TODO()
  }

  fun setHighlightCurrentLine(enabled: Boolean) {
    TODO()
  }

  fun setLineAsHidden(line: Int, enable: Boolean) {
    TODO()
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    TODO()
  }

  fun setReadonly(enable: Boolean) {
    TODO()
  }

  fun setRightClickMovesCaret(enable: Boolean) {
    TODO()
  }

  fun setShowLineNumbers(enable: Boolean) {
    TODO()
  }

  fun setSmoothScrollEnable(enable: Boolean) {
    TODO()
  }

  fun setSyntaxColoring(enable: Boolean) {
    TODO()
  }

  fun setText(text: String) {
    TODO()
  }

  fun setVScrollSpeed(speed: Float) {
    TODO()
  }

  fun setWrapEnabled(enable: Boolean) {
    TODO()
  }

  fun toggleFoldLine(line: Int) {
    TODO()
  }

  fun undo() {
    TODO()
  }

  fun unfoldLine(line: Int) {
    TODO()
  }

  fun unhideAllLines() {
    TODO()
  }

  enum class SearchFlags(
    val value: Int
  ) {
    SEARCH_MATCH_CASE(1),

    SEARCH_WHOLE_WORDS(2),

    SEARCH_BACKWARDS(4);

    companion object {
      fun from(value: Int): SearchFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class MenuItems(
    val value: Int
  ) {
    MENU_CUT(0),

    MENU_COPY(1),

    MENU_PASTE(2),

    MENU_CLEAR(3),

    MENU_SELECT_ALL(4),

    MENU_UNDO(5),

    MENU_REDO(6),

    MENU_MAX(7);

    companion object {
      fun from(value: Int): MenuItems {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MENU_CLEAR: Int = 3

    val MENU_COPY: Int = 1

    val MENU_CUT: Int = 0

    val MENU_MAX: Int = 7

    val MENU_PASTE: Int = 2

    val MENU_REDO: Int = 6

    val MENU_SELECT_ALL: Int = 4

    val MENU_UNDO: Int = 5

    val SEARCH_BACKWARDS: Int = 4

    val SEARCH_MATCH_CASE: Int = 1

    val SEARCH_WHOLE_WORDS: Int = 2

    fun new(): TextEdit = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TextEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TextEdit(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TextEdit = TextEdit(ptr)
    /**
     * Container for method_bind pointers for TextEdit
     */
    private object __method_bind {
      val add_color_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "add_color_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_color_region" }
            }
          }

      val add_keyword_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "add_keyword_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_keyword_color" }
            }
          }

      val can_fold: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "can_fold".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_fold" }
            }
          }

      val clear_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "clear_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_colors" }
            }
          }

      val clear_undo_history: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "clear_undo_history".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_undo_history" }
            }
          }

      val copy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "copy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy" }
            }
          }

      val cursor_get_blink_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_get_blink_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
            }
          }

      val cursor_get_blink_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_get_blink_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
            }
          }

      val cursor_get_column: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_get_column".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_column" }
            }
          }

      val cursor_get_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_get_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_get_line" }
            }
          }

      val cursor_is_block_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_is_block_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_is_block_mode" }
            }
          }

      val cursor_set_blink_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_set_blink_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
            }
          }

      val cursor_set_blink_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_set_blink_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_speed" }
            }
          }

      val cursor_set_block_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_set_block_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_block_mode" }
            }
          }

      val cursor_set_column: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_set_column".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_column" }
            }
          }

      val cursor_set_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cursor_set_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cursor_set_line" }
            }
          }

      val cut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "cut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method cut" }
            }
          }

      val deselect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "deselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect" }
            }
          }

      val fold_all_lines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "fold_all_lines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fold_all_lines" }
            }
          }

      val fold_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "fold_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fold_line" }
            }
          }

      val get_breakpoints: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_breakpoints".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_breakpoints" }
            }
          }

      val get_keyword_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_keyword_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_keyword_color" }
            }
          }

      val get_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line" }
            }
          }

      val get_line_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_line_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_count" }
            }
          }

      val get_menu: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_menu".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_menu" }
            }
          }

      val get_selection_from_column: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_selection_from_column".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selection_from_column" }
            }
          }

      val get_selection_from_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_selection_from_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selection_from_line" }
            }
          }

      val get_selection_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_selection_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selection_text" }
            }
          }

      val get_selection_to_column: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_selection_to_column".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selection_to_column" }
            }
          }

      val get_selection_to_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_selection_to_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_selection_to_line" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val get_v_scroll_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_v_scroll_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_scroll_speed" }
            }
          }

      val get_word_under_cursor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "get_word_under_cursor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_word_under_cursor" }
            }
          }

      val has_keyword_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "has_keyword_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_keyword_color" }
            }
          }

      val insert_text_at_cursor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "insert_text_at_cursor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method insert_text_at_cursor" }
            }
          }

      val is_breakpoint_gutter_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_breakpoint_gutter_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_breakpoint_gutter_enabled" }
            }
          }

      val is_context_menu_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_context_menu_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
            }
          }

      val is_drawing_fold_gutter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_drawing_fold_gutter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_drawing_fold_gutter" }
            }
          }

      val is_drawing_spaces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_drawing_spaces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_drawing_spaces" }
            }
          }

      val is_drawing_tabs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_drawing_tabs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_drawing_tabs" }
            }
          }

      val is_folded: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_folded".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_folded" }
            }
          }

      val is_hiding_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_hiding_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hiding_enabled" }
            }
          }

      val is_highlight_all_occurrences_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_highlight_all_occurrences_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_highlight_all_occurrences_enabled" }
            }
          }

      val is_highlight_current_line_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_highlight_current_line_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_highlight_current_line_enabled" }
            }
          }

      val is_line_hidden: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_line_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_line_hidden" }
            }
          }

      val is_overriding_selected_font_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_overriding_selected_font_color".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_overriding_selected_font_color" }
            }
          }

      val is_readonly: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_readonly".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_readonly" }
            }
          }

      val is_right_click_moving_caret: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_right_click_moving_caret".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_right_click_moving_caret" }
            }
          }

      val is_selection_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_selection_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selection_active" }
            }
          }

      val is_show_line_numbers_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_show_line_numbers_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_show_line_numbers_enabled" }
            }
          }

      val is_smooth_scroll_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_smooth_scroll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_smooth_scroll_enabled" }
            }
          }

      val is_syntax_coloring_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_syntax_coloring_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_syntax_coloring_enabled" }
            }
          }

      val is_wrap_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "is_wrap_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_wrap_enabled" }
            }
          }

      val menu_option: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "menu_option".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method menu_option" }
            }
          }

      val paste: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "paste".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method paste" }
            }
          }

      val redo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "redo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method redo" }
            }
          }

      val remove_breakpoints: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "remove_breakpoints".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_breakpoints" }
            }
          }

      val search: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "search".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method search" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val select_all: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "select_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select_all" }
            }
          }

      val set_breakpoint_gutter_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_breakpoint_gutter_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_breakpoint_gutter_enabled"
              }
            }
          }

      val set_context_menu_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_context_menu_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
            }
          }

      val set_draw_fold_gutter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_draw_fold_gutter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_fold_gutter" }
            }
          }

      val set_draw_spaces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_draw_spaces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_spaces" }
            }
          }

      val set_draw_tabs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_draw_tabs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_tabs" }
            }
          }

      val set_hiding_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_hiding_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hiding_enabled" }
            }
          }

      val set_highlight_all_occurrences: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_highlight_all_occurrences".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_highlight_all_occurrences"
              }
            }
          }

      val set_highlight_current_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_highlight_current_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_highlight_current_line" }
            }
          }

      val set_line_as_hidden: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_line_as_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_line_as_hidden" }
            }
          }

      val set_override_selected_font_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_override_selected_font_color".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_override_selected_font_color" }
            }
          }

      val set_readonly: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_readonly".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_readonly" }
            }
          }

      val set_right_click_moves_caret: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_right_click_moves_caret".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_right_click_moves_caret" }
            }
          }

      val set_show_line_numbers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_show_line_numbers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_show_line_numbers" }
            }
          }

      val set_smooth_scroll_enable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_smooth_scroll_enable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_smooth_scroll_enable" }
            }
          }

      val set_syntax_coloring: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_syntax_coloring".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_syntax_coloring" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }

      val set_v_scroll_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_v_scroll_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_scroll_speed" }
            }
          }

      val set_wrap_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "set_wrap_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_wrap_enabled" }
            }
          }

      val toggle_fold_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "toggle_fold_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method toggle_fold_line" }
            }
          }

      val undo: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "undo".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method undo" }
            }
          }

      val unfold_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "unfold_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unfold_line" }
            }
          }

      val unhide_all_lines: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
              "unhide_all_lines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unhide_all_lines" }
            }
          }
    }
  }
}
