// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Variant
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

open class TextEdit(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addColorRegion(
    beginKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(beginKey)
    _args.append(endKey)
    _args.append(color)
    _args.append(lineOnly)
    __method_bind.add_color_region.call(this._handle, _args.toVariant(), 4)
  }

  fun addKeywordColor(keyword: String, color: Color) {
    val _args = VariantArray.new()
    _args.append(keyword)
    _args.append(color)
    __method_bind.add_keyword_color.call(this._handle, _args.toVariant(), 2)
  }

  fun canFold(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.can_fold.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun clearColors() {
    __method_bind.clear_colors.call(this._handle)
  }

  fun clearUndoHistory() {
    __method_bind.clear_undo_history.call(this._handle)
  }

  fun copy() {
    __method_bind.copy.call(this._handle)
  }

  fun cursorGetBlinkEnabled(): Boolean {
    val _ret = __method_bind.cursor_get_blink_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun cursorGetBlinkSpeed(): Float {
    val _ret = __method_bind.cursor_get_blink_speed.call(this._handle)
    return _ret.asFloat()
  }

  fun cursorGetColumn(): Int {
    val _ret = __method_bind.cursor_get_column.call(this._handle)
    return _ret.asInt()
  }

  fun cursorGetLine(): Int {
    val _ret = __method_bind.cursor_get_line.call(this._handle)
    return _ret.asInt()
  }

  fun cursorIsBlockMode(): Boolean {
    val _ret = __method_bind.cursor_is_block_mode.call(this._handle)
    return _ret.asBoolean()
  }

  fun cursorSetBlinkEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.cursor_set_blink_enabled.call(this._handle, _arg, 1)
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val _arg = Variant.new(blinkSpeed)
    __method_bind.cursor_set_blink_speed.call(this._handle, _arg, 1)
  }

  fun cursorSetBlockMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.cursor_set_block_mode.call(this._handle, _arg, 1)
  }

  fun cursorSetColumn(column: Int, adjustViewport: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(adjustViewport)
    __method_bind.cursor_set_column.call(this._handle, _args.toVariant(), 2)
  }

  fun cursorSetLine(
    line: Int,
    adjustViewport: Boolean,
    canBeHidden: Boolean,
    wrapIndex: Int
  ) {
    val _args = VariantArray.new()
    _args.append(line)
    _args.append(adjustViewport)
    _args.append(canBeHidden)
    _args.append(wrapIndex)
    __method_bind.cursor_set_line.call(this._handle, _args.toVariant(), 4)
  }

  fun cut() {
    __method_bind.cut.call(this._handle)
  }

  fun deselect() {
    __method_bind.deselect.call(this._handle)
  }

  fun foldAllLines() {
    __method_bind.fold_all_lines.call(this._handle)
  }

  fun foldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.fold_line.call(this._handle, _arg, 1)
  }

  fun getBreakpoints(): VariantArray {
    val _ret = __method_bind.get_breakpoints.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getKeywordColor(keyword: String): Color {
    val _arg = Variant.new(keyword)
    val _ret = __method_bind.get_keyword_color.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getLine(line: Int): String {
    val _arg = Variant.new(line)
    val _ret = __method_bind.get_line.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getLineCount(): Int {
    val _ret = __method_bind.get_line_count.call(this._handle)
    return _ret.asInt()
  }

  fun getMenu(): PopupMenu {
    val _ret = __method_bind.get_menu.call(this._handle)
    return _ret.asObject(::PopupMenu)!!
  }

  fun getSelectionFromColumn(): Int {
    val _ret = __method_bind.get_selection_from_column.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectionFromLine(): Int {
    val _ret = __method_bind.get_selection_from_line.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectionText(): String {
    val _ret = __method_bind.get_selection_text.call(this._handle)
    return _ret.asString()
  }

  fun getSelectionToColumn(): Int {
    val _ret = __method_bind.get_selection_to_column.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectionToLine(): Int {
    val _ret = __method_bind.get_selection_to_line.call(this._handle)
    return _ret.asInt()
  }

  fun getText(): String {
    val _ret = __method_bind.get_text.call(this._handle)
    return _ret.asString()
  }

  fun getVScrollSpeed(): Float {
    val _ret = __method_bind.get_v_scroll_speed.call(this._handle)
    return _ret.asFloat()
  }

  fun getWordUnderCursor(): String {
    val _ret = __method_bind.get_word_under_cursor.call(this._handle)
    return _ret.asString()
  }

  fun hasKeywordColor(keyword: String): Boolean {
    val _arg = Variant.new(keyword)
    val _ret = __method_bind.has_keyword_color.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun insertTextAtCursor(text: String) {
    val _arg = Variant.new(text)
    __method_bind.insert_text_at_cursor.call(this._handle, _arg, 1)
  }

  fun isBreakpointGutterEnabled(): Boolean {
    val _ret = __method_bind.is_breakpoint_gutter_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isContextMenuEnabled(): Boolean {
    val _ret = __method_bind.is_context_menu_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawingFoldGutter(): Boolean {
    val _ret = __method_bind.is_drawing_fold_gutter.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawingSpaces(): Boolean {
    val _ret = __method_bind.is_drawing_spaces.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawingTabs(): Boolean {
    val _ret = __method_bind.is_drawing_tabs.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFolded(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.is_folded.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isHidingEnabled(): Boolean {
    val _ret = __method_bind.is_hiding_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHighlightAllOccurrencesEnabled(): Boolean {
    val _ret = __method_bind.is_highlight_all_occurrences_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHighlightCurrentLineEnabled(): Boolean {
    val _ret = __method_bind.is_highlight_current_line_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isLineHidden(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.is_line_hidden.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isOverridingSelectedFontColor(): Boolean {
    val _ret = __method_bind.is_overriding_selected_font_color.call(this._handle)
    return _ret.asBoolean()
  }

  fun isReadonly(): Boolean {
    val _ret = __method_bind.is_readonly.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRightClickMovingCaret(): Boolean {
    val _ret = __method_bind.is_right_click_moving_caret.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelectionActive(): Boolean {
    val _ret = __method_bind.is_selection_active.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShowLineNumbersEnabled(): Boolean {
    val _ret = __method_bind.is_show_line_numbers_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSmoothScrollEnabled(): Boolean {
    val _ret = __method_bind.is_smooth_scroll_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSyntaxColoringEnabled(): Boolean {
    val _ret = __method_bind.is_syntax_coloring_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWrapEnabled(): Boolean {
    val _ret = __method_bind.is_wrap_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun menuOption(option: Int) {
    val _arg = Variant.new(option)
    __method_bind.menu_option.call(this._handle, _arg, 1)
  }

  fun paste() {
    __method_bind.paste.call(this._handle)
  }

  fun redo() {
    __method_bind.redo.call(this._handle)
  }

  fun removeBreakpoints() {
    __method_bind.remove_breakpoints.call(this._handle)
  }

  fun search(
    key: String,
    flags: Int,
    fromLine: Int,
    fromColumn: Int
  ): PoolIntArray {
    val _args = VariantArray.new()
    _args.append(key)
    _args.append(flags)
    _args.append(fromLine)
    _args.append(fromColumn)
    val _ret = __method_bind.search.call(this._handle, _args.toVariant(), 4)
    return _ret.asPoolIntArray()
  }

  fun select(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int
  ) {
    val _args = VariantArray.new()
    _args.append(fromLine)
    _args.append(fromColumn)
    _args.append(toLine)
    _args.append(toColumn)
    __method_bind.select.call(this._handle, _args.toVariant(), 4)
  }

  fun selectAll() {
    __method_bind.select_all.call(this._handle)
  }

  fun setBreakpointGutterEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_breakpoint_gutter_enabled.call(this._handle, _arg, 1)
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_context_menu_enabled.call(this._handle, _arg, 1)
  }

  fun setDrawFoldGutter(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.set_draw_fold_gutter.call(this._handle, _arg, 1)
  }

  fun setDrawSpaces(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.set_draw_spaces.call(this._handle, _arg, 1)
  }

  fun setDrawTabs(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.set_draw_tabs.call(this._handle, _arg, 1)
  }

  fun setHidingEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_hiding_enabled.call(this._handle, _arg, 1)
  }

  fun setHighlightAllOccurrences(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_highlight_all_occurrences.call(this._handle, _arg, 1)
  }

  fun setHighlightCurrentLine(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_highlight_current_line.call(this._handle, _arg, 1)
  }

  fun setLineAsHidden(line: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(line)
    _args.append(enable)
    __method_bind.set_line_as_hidden.call(this._handle, _args.toVariant(), 2)
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    val _arg = Variant.new(override)
    __method_bind.set_override_selected_font_color.call(this._handle, _arg, 1)
  }

  fun setReadonly(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_readonly.call(this._handle, _arg, 1)
  }

  fun setRightClickMovesCaret(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_right_click_moves_caret.call(this._handle, _arg, 1)
  }

  fun setShowLineNumbers(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_show_line_numbers.call(this._handle, _arg, 1)
  }

  fun setSmoothScrollEnable(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_smooth_scroll_enable.call(this._handle, _arg, 1)
  }

  fun setSyntaxColoring(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_syntax_coloring.call(this._handle, _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.set_text.call(this._handle, _arg, 1)
  }

  fun setVScrollSpeed(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.set_v_scroll_speed.call(this._handle, _arg, 1)
  }

  fun setWrapEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_wrap_enabled.call(this._handle, _arg, 1)
  }

  fun toggleFoldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.toggle_fold_line.call(this._handle, _arg, 1)
  }

  fun undo() {
    __method_bind.undo.call(this._handle)
  }

  fun unfoldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.unfold_line.call(this._handle, _arg, 1)
  }

  fun unhideAllLines() {
    __method_bind.unhide_all_lines.call(this._handle)
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
      requireNotNull(fnPtr) { "No instance found for TextEdit" }
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
      val add_color_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "add_color_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color_region" }
        }
      val add_keyword_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "add_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_keyword_color" }
        }
      val can_fold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "can_fold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_fold" }
        }
      val clear_colors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "clear_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_colors" }
        }
      val clear_undo_history: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "clear_undo_history".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_undo_history" }
        }
      val copy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "copy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy" }
        }
      val cursor_get_blink_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
        }
      val cursor_get_blink_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
        }
      val cursor_get_column: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_column" }
        }
      val cursor_get_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_line" }
        }
      val cursor_is_block_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_is_block_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_is_block_mode" }
        }
      val cursor_set_blink_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
        }
      val cursor_set_blink_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_speed" }
        }
      val cursor_set_block_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_block_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_block_mode" }
        }
      val cursor_set_column: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_column" }
        }
      val cursor_set_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_line" }
        }
      val cut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cut" }
        }
      val deselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "deselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deselect" }
        }
      val fold_all_lines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "fold_all_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fold_all_lines" }
        }
      val fold_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "fold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fold_line" }
        }
      val get_breakpoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_breakpoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_breakpoints" }
        }
      val get_keyword_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keyword_color" }
        }
      val get_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line" }
        }
      val get_line_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_count" }
        }
      val get_menu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_menu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_menu" }
        }
      val get_selection_from_column: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_from_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_from_column" }
        }
      val get_selection_from_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_from_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_from_line" }
        }
      val get_selection_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_text" }
        }
      val get_selection_to_column: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_to_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_to_column" }
        }
      val get_selection_to_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_to_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_to_line" }
        }
      val get_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val get_v_scroll_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_v_scroll_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll_speed" }
        }
      val get_word_under_cursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_word_under_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_word_under_cursor" }
        }
      val has_keyword_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "has_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_keyword_color" }
        }
      val insert_text_at_cursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "insert_text_at_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method insert_text_at_cursor" }
        }
      val is_breakpoint_gutter_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_breakpoint_gutter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_breakpoint_gutter_enabled" }
        }
      val is_context_menu_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
        }
      val is_drawing_fold_gutter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_fold_gutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_fold_gutter" }
        }
      val is_drawing_spaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_spaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_spaces" }
        }
      val is_drawing_tabs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_tabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_tabs" }
        }
      val is_folded: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_folded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_folded" }
        }
      val is_hiding_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_hiding_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hiding_enabled" }
        }
      val is_highlight_all_occurrences_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_highlight_all_occurrences_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_highlight_all_occurrences_enabled" }
        }
      val is_highlight_current_line_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_highlight_current_line_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_highlight_current_line_enabled"
            }
        }
      val is_line_hidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_line_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_line_hidden" }
        }
      val is_overriding_selected_font_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_overriding_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_selected_font_color"
            }
        }
      val is_readonly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_readonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_readonly" }
        }
      val is_right_click_moving_caret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_right_click_moving_caret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_right_click_moving_caret" }
        }
      val is_selection_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_selection_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selection_active" }
        }
      val is_show_line_numbers_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_show_line_numbers_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_show_line_numbers_enabled" }
        }
      val is_smooth_scroll_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_smooth_scroll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_smooth_scroll_enabled" }
        }
      val is_syntax_coloring_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_syntax_coloring_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_syntax_coloring_enabled" }
        }
      val is_wrap_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_wrap_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_wrap_enabled" }
        }
      val menu_option: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "menu_option".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method menu_option" }
        }
      val paste: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "paste".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method paste" }
        }
      val redo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method redo" }
        }
      val remove_breakpoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "remove_breakpoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_breakpoints" }
        }
      val search: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method search" }
        }
      val select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select" }
        }
      val select_all: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "select_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select_all" }
        }
      val set_breakpoint_gutter_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_breakpoint_gutter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_breakpoint_gutter_enabled" }
        }
      val set_context_menu_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
        }
      val set_draw_fold_gutter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_fold_gutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_fold_gutter" }
        }
      val set_draw_spaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_spaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_spaces" }
        }
      val set_draw_tabs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_tabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_tabs" }
        }
      val set_hiding_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_hiding_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hiding_enabled" }
        }
      val set_highlight_all_occurrences: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_highlight_all_occurrences".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_highlight_all_occurrences" }
        }
      val set_highlight_current_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_highlight_current_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_highlight_current_line" }
        }
      val set_line_as_hidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_line_as_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_line_as_hidden" }
        }
      val set_override_selected_font_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_override_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_override_selected_font_color" }
        }
      val set_readonly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_readonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_readonly" }
        }
      val set_right_click_moves_caret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_right_click_moves_caret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_right_click_moves_caret" }
        }
      val set_show_line_numbers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_show_line_numbers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_line_numbers" }
        }
      val set_smooth_scroll_enable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_smooth_scroll_enable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_scroll_enable" }
        }
      val set_syntax_coloring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_syntax_coloring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_syntax_coloring" }
        }
      val set_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val set_v_scroll_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_v_scroll_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_scroll_speed" }
        }
      val set_wrap_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_wrap_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wrap_enabled" }
        }
      val toggle_fold_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "toggle_fold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggle_fold_line" }
        }
      val undo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "undo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method undo" }
        }
      val unfold_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "unfold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unfold_line" }
        }
      val unhide_all_lines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "unhide_all_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unhide_all_lines" }
        }}
  }
}
