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
import kotlin.reflect.KCallable
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
  var breakpointGutter: Boolean
    get() {
       return isBreakpointGutterEnabled() 
    }
    set(value) {
      setBreakpointGutterEnabled(value)
    }

  var caretBlink: Boolean
    get() {
       return cursorGetBlinkEnabled() 
    }
    set(value) {
      cursorSetBlinkEnabled(value)
    }

  var caretBlinkSpeed: Float
    get() {
       return cursorGetBlinkSpeed() 
    }
    set(value) {
      cursorSetBlinkSpeed(value)
    }

  var caretBlockMode: Boolean
    get() {
       return cursorIsBlockMode() 
    }
    set(value) {
      cursorSetBlockMode(value)
    }

  var caretMovingByRightClick: Boolean
    get() {
       return isRightClickMovingCaret() 
    }
    set(value) {
      setRightClickMovesCaret(value)
    }

  var contextMenuEnabled: Boolean
    get() {
       return isContextMenuEnabled() 
    }
    set(value) {
      setContextMenuEnabled(value)
    }

  var drawSpaces: Boolean
    get() {
       return isDrawingSpaces() 
    }
    set(value) {
      setDrawSpaces(value)
    }

  var drawTabs: Boolean
    get() {
       return isDrawingTabs() 
    }
    set(value) {
      setDrawTabs(value)
    }

  var foldGutter: Boolean
    get() {
       return isDrawingFoldGutter() 
    }
    set(value) {
      setDrawFoldGutter(value)
    }

  var hidingEnabled: Boolean
    get() {
       return isHidingEnabled() 
    }
    set(value) {
      setHidingEnabled(value)
    }

  var highlightAllOccurrences: Boolean
    get() {
       return isHighlightAllOccurrencesEnabled() 
    }
    set(value) {
      setHighlightAllOccurrences(value)
    }

  var highlightCurrentLine: Boolean
    get() {
       return isHighlightCurrentLineEnabled() 
    }
    set(value) {
      setHighlightCurrentLine(value)
    }

  var minimapDraw: Boolean
    get() {
       return isDrawingMinimap() 
    }
    set(value) {
      drawMinimap(value)
    }

  var minimapWidth: Int
    get() {
       return getMinimapWidth() 
    }
    set(value) {
      setMinimapWidth(value)
    }

  var overrideSelectedFontColor: Boolean
    get() {
       return isOverridingSelectedFontColor() 
    }
    set(value) {
      setOverrideSelectedFontColor(value)
    }

  var readonly: Boolean
    get() {
       return isReadonly() 
    }
    set(value) {
      setReadonly(value)
    }

  var scrollHorizontal: Int
    get() {
       return getHScroll() 
    }
    set(value) {
      setHScroll(value)
    }

  var scrollVertical: Float
    get() {
       return getVScroll() 
    }
    set(value) {
      setVScroll(value)
    }

  var selectingEnabled: Boolean
    get() {
       return isSelectingEnabled() 
    }
    set(value) {
      setSelectingEnabled(value)
    }

  var shortcutKeysEnabled: Boolean
    get() {
       return isShortcutKeysEnabled() 
    }
    set(value) {
      setShortcutKeysEnabled(value)
    }

  var showLineNumbers: Boolean
    get() {
       return isShowLineNumbersEnabled() 
    }
    set(value) {
      setShowLineNumbers(value)
    }

  var smoothScrolling: Boolean
    get() {
       return isSmoothScrollEnabled() 
    }
    set(value) {
      setSmoothScrollEnable(value)
    }

  var syntaxHighlighting: Boolean
    get() {
       return isSyntaxColoringEnabled() 
    }
    set(value) {
      setSyntaxColoring(value)
    }

  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  var vScrollSpeed: Float
    get() {
       return getVScrollSpeed() 
    }
    set(value) {
      setVScrollSpeed(value)
    }

  var wrapEnabled: Boolean
    get() {
       return isWrapEnabled() 
    }
    set(value) {
      setWrapEnabled(value)
    }

  /**
   * TextEdit::breakpoint_toggled signal
   */
  val signalBreakpointToggled: Signal1<Int> = Signal1("breakpoint_toggled")

  /**
   * TextEdit::cursor_changed signal
   */
  val signalCursorChanged: Signal0 = Signal0("cursor_changed")

  /**
   * TextEdit::info_clicked signal
   */
  val signalInfoClicked: Signal2<Int, String> = Signal2("info_clicked")

  /**
   * TextEdit::request_completion signal
   */
  val signalRequestCompletion: Signal0 = Signal0("request_completion")

  /**
   * TextEdit::symbol_lookup signal
   */
  val signalSymbolLookup: Signal3<String, Int, Int> = Signal3("symbol_lookup")

  /**
   * TextEdit::text_changed signal
   */
  val signalTextChanged: Signal0 = Signal0("text_changed")

  fun addColorRegion(
    beginKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(beginKey))
    _args.add(Variant.fromAny(endKey))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(lineOnly))
    __method_bind.addColorRegion.call(this._handle, _args)
  }

  fun addKeywordColor(keyword: String, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(keyword))
    _args.add(Variant.fromAny(color))
    __method_bind.addKeywordColor.call(this._handle, _args)
  }

  fun canFold(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.canFold.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun centerViewportToCursor() {
    __method_bind.centerViewportToCursor.call(this._handle)
  }

  fun clearColors() {
    __method_bind.clearColors.call(this._handle)
  }

  fun clearUndoHistory() {
    __method_bind.clearUndoHistory.call(this._handle)
  }

  fun copy() {
    __method_bind.copy.call(this._handle)
  }

  fun cursorGetBlinkEnabled(): Boolean {
    val _ret = __method_bind.cursorGetBlinkEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun cursorGetBlinkSpeed(): Float {
    val _ret = __method_bind.cursorGetBlinkSpeed.call(this._handle)
    return _ret.asFloat()
  }

  fun cursorGetColumn(): Int {
    val _ret = __method_bind.cursorGetColumn.call(this._handle)
    return _ret.asInt()
  }

  fun cursorGetLine(): Int {
    val _ret = __method_bind.cursorGetLine.call(this._handle)
    return _ret.asInt()
  }

  fun cursorIsBlockMode(): Boolean {
    val _ret = __method_bind.cursorIsBlockMode.call(this._handle)
    return _ret.asBoolean()
  }

  fun cursorSetBlinkEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.cursorSetBlinkEnabled.call(this._handle, listOf(_arg))
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val _arg = Variant.new(blinkSpeed)
    __method_bind.cursorSetBlinkSpeed.call(this._handle, listOf(_arg))
  }

  fun cursorSetBlockMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.cursorSetBlockMode.call(this._handle, listOf(_arg))
  }

  fun cursorSetColumn(column: Int, adjustViewport: Boolean = true) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(adjustViewport))
    __method_bind.cursorSetColumn.call(this._handle, _args)
  }

  fun cursorSetLine(
    line: Int,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(line))
    _args.add(Variant.fromAny(adjustViewport))
    _args.add(Variant.fromAny(canBeHidden))
    _args.add(Variant.fromAny(wrapIndex))
    __method_bind.cursorSetLine.call(this._handle, _args)
  }

  fun cut() {
    __method_bind.cut.call(this._handle)
  }

  fun deselect() {
    __method_bind.deselect.call(this._handle)
  }

  fun drawMinimap(draw: Boolean) {
    val _arg = Variant.new(draw)
    __method_bind.drawMinimap.call(this._handle, listOf(_arg))
  }

  fun foldAllLines() {
    __method_bind.foldAllLines.call(this._handle)
  }

  fun foldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.foldLine.call(this._handle, listOf(_arg))
  }

  fun getBreakpoints(): VariantArray {
    val _ret = __method_bind.getBreakpoints.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getHScroll(): Int {
    val _ret = __method_bind.getHScroll.call(this._handle)
    return _ret.asInt()
  }

  fun getKeywordColor(keyword: String): Color {
    val _arg = Variant.new(keyword)
    val _ret = __method_bind.getKeywordColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getLine(line: Int): String {
    val _arg = Variant.new(line)
    val _ret = __method_bind.getLine.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getLineCount(): Int {
    val _ret = __method_bind.getLineCount.call(this._handle)
    return _ret.asInt()
  }

  fun getMenu(): PopupMenu {
    val _ret = __method_bind.getMenu.call(this._handle)
    return _ret.asObject(::PopupMenu)!!
  }

  fun getMinimapWidth(): Int {
    val _ret = __method_bind.getMinimapWidth.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectionFromColumn(): Int {
    val _ret = __method_bind.getSelectionFromColumn.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectionFromLine(): Int {
    val _ret = __method_bind.getSelectionFromLine.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectionText(): String {
    val _ret = __method_bind.getSelectionText.call(this._handle)
    return _ret.asString()
  }

  fun getSelectionToColumn(): Int {
    val _ret = __method_bind.getSelectionToColumn.call(this._handle)
    return _ret.asInt()
  }

  fun getSelectionToLine(): Int {
    val _ret = __method_bind.getSelectionToLine.call(this._handle)
    return _ret.asInt()
  }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun getVScroll(): Float {
    val _ret = __method_bind.getVScroll.call(this._handle)
    return _ret.asFloat()
  }

  fun getVScrollSpeed(): Float {
    val _ret = __method_bind.getVScrollSpeed.call(this._handle)
    return _ret.asFloat()
  }

  fun getWordUnderCursor(): String {
    val _ret = __method_bind.getWordUnderCursor.call(this._handle)
    return _ret.asString()
  }

  fun hasKeywordColor(keyword: String): Boolean {
    val _arg = Variant.new(keyword)
    val _ret = __method_bind.hasKeywordColor.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun insertTextAtCursor(text: String) {
    val _arg = Variant.new(text)
    __method_bind.insertTextAtCursor.call(this._handle, listOf(_arg))
  }

  fun isBreakpointGutterEnabled(): Boolean {
    val _ret = __method_bind.isBreakpointGutterEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isContextMenuEnabled(): Boolean {
    val _ret = __method_bind.isContextMenuEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawingFoldGutter(): Boolean {
    val _ret = __method_bind.isDrawingFoldGutter.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawingMinimap(): Boolean {
    val _ret = __method_bind.isDrawingMinimap.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawingSpaces(): Boolean {
    val _ret = __method_bind.isDrawingSpaces.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawingTabs(): Boolean {
    val _ret = __method_bind.isDrawingTabs.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFolded(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.isFolded.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isHidingEnabled(): Boolean {
    val _ret = __method_bind.isHidingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHighlightAllOccurrencesEnabled(): Boolean {
    val _ret = __method_bind.isHighlightAllOccurrencesEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHighlightCurrentLineEnabled(): Boolean {
    val _ret = __method_bind.isHighlightCurrentLineEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isLineHidden(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.isLineHidden.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isOverridingSelectedFontColor(): Boolean {
    val _ret = __method_bind.isOverridingSelectedFontColor.call(this._handle)
    return _ret.asBoolean()
  }

  fun isReadonly(): Boolean {
    val _ret = __method_bind.isReadonly.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRightClickMovingCaret(): Boolean {
    val _ret = __method_bind.isRightClickMovingCaret.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelectingEnabled(): Boolean {
    val _ret = __method_bind.isSelectingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelectionActive(): Boolean {
    val _ret = __method_bind.isSelectionActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShortcutKeysEnabled(): Boolean {
    val _ret = __method_bind.isShortcutKeysEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isShowLineNumbersEnabled(): Boolean {
    val _ret = __method_bind.isShowLineNumbersEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSmoothScrollEnabled(): Boolean {
    val _ret = __method_bind.isSmoothScrollEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSyntaxColoringEnabled(): Boolean {
    val _ret = __method_bind.isSyntaxColoringEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWrapEnabled(): Boolean {
    val _ret = __method_bind.isWrapEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun menuOption(option: Int) {
    val _arg = Variant.new(option)
    __method_bind.menuOption.call(this._handle, listOf(_arg))
  }

  fun paste() {
    __method_bind.paste.call(this._handle)
  }

  fun redo() {
    __method_bind.redo.call(this._handle)
  }

  fun removeBreakpoints() {
    __method_bind.removeBreakpoints.call(this._handle)
  }

  fun search(
    key: String,
    flags: Int,
    fromLine: Int,
    fromColumn: Int
  ): PoolIntArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(flags))
    _args.add(Variant.fromAny(fromLine))
    _args.add(Variant.fromAny(fromColumn))
    val _ret = __method_bind.search.call(this._handle, _args)
    return _ret.asPoolIntArray()
  }

  fun select(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(fromLine))
    _args.add(Variant.fromAny(fromColumn))
    _args.add(Variant.fromAny(toLine))
    _args.add(Variant.fromAny(toColumn))
    __method_bind.select.call(this._handle, _args)
  }

  fun selectAll() {
    __method_bind.selectAll.call(this._handle)
  }

  fun setBreakpointGutterEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setBreakpointGutterEnabled.call(this._handle, listOf(_arg))
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setContextMenuEnabled.call(this._handle, listOf(_arg))
  }

  fun setDrawFoldGutter(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setDrawFoldGutter.call(this._handle, listOf(_arg))
  }

  fun setDrawSpaces(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setDrawSpaces.call(this._handle, listOf(_arg))
  }

  fun setDrawTabs(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setDrawTabs.call(this._handle, listOf(_arg))
  }

  fun setHScroll(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.setHScroll.call(this._handle, listOf(_arg))
  }

  fun setHidingEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHidingEnabled.call(this._handle, listOf(_arg))
  }

  fun setHighlightAllOccurrences(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHighlightAllOccurrences.call(this._handle, listOf(_arg))
  }

  fun setHighlightCurrentLine(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setHighlightCurrentLine.call(this._handle, listOf(_arg))
  }

  fun setLineAsHidden(line: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(line))
    _args.add(Variant.fromAny(enable))
    __method_bind.setLineAsHidden.call(this._handle, _args)
  }

  fun setMinimapWidth(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.setMinimapWidth.call(this._handle, listOf(_arg))
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    val _arg = Variant.new(override)
    __method_bind.setOverrideSelectedFontColor.call(this._handle, listOf(_arg))
  }

  fun setReadonly(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setReadonly.call(this._handle, listOf(_arg))
  }

  fun setRightClickMovesCaret(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setRightClickMovesCaret.call(this._handle, listOf(_arg))
  }

  fun setSelectingEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSelectingEnabled.call(this._handle, listOf(_arg))
  }

  fun setShortcutKeysEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setShortcutKeysEnabled.call(this._handle, listOf(_arg))
  }

  fun setShowLineNumbers(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setShowLineNumbers.call(this._handle, listOf(_arg))
  }

  fun setSmoothScrollEnable(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSmoothScrollEnable.call(this._handle, listOf(_arg))
  }

  fun setSyntaxColoring(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSyntaxColoring.call(this._handle, listOf(_arg))
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, listOf(_arg))
  }

  fun setVScroll(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.setVScroll.call(this._handle, listOf(_arg))
  }

  fun setVScrollSpeed(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.setVScrollSpeed.call(this._handle, listOf(_arg))
  }

  fun setWrapEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setWrapEnabled.call(this._handle, listOf(_arg))
  }

  fun toggleFoldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.toggleFoldLine.call(this._handle, listOf(_arg))
  }

  fun undo() {
    __method_bind.undo.call(this._handle)
  }

  fun unfoldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.unfoldLine.call(this._handle, listOf(_arg))
  }

  fun unhideAllLines() {
    __method_bind.unhideAllLines.call(this._handle)
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

  enum class SearchResult(
    val value: Int
  ) {
    SEARCH_RESULT_COLUMN(0),

    SEARCH_RESULT_LINE(1);

    companion object {
      fun from(value: Int): SearchResult {
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

    val SEARCH_RESULT_COLUMN: Int = 0

    val SEARCH_RESULT_LINE: Int = 1

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
      val addColorRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "add_color_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color_region" }
        }
      val addKeywordColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "add_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_keyword_color" }
        }
      val canFold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "can_fold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_fold" }
        }
      val centerViewportToCursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "center_viewport_to_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method center_viewport_to_cursor" }
        }
      val clearColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "clear_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_colors" }
        }
      val clearUndoHistory: CPointer<godot_method_bind>
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
      val cursorGetBlinkEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
        }
      val cursorGetBlinkSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
        }
      val cursorGetColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_column" }
        }
      val cursorGetLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_line" }
        }
      val cursorIsBlockMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_is_block_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_is_block_mode" }
        }
      val cursorSetBlinkEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
        }
      val cursorSetBlinkSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_speed" }
        }
      val cursorSetBlockMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_block_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_block_mode" }
        }
      val cursorSetColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_column" }
        }
      val cursorSetLine: CPointer<godot_method_bind>
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
      val drawMinimap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "draw_minimap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_minimap" }
        }
      val foldAllLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "fold_all_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fold_all_lines" }
        }
      val foldLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "fold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fold_line" }
        }
      val getBreakpoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_breakpoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_breakpoints" }
        }
      val getHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_scroll" }
        }
      val getKeywordColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keyword_color" }
        }
      val getLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line" }
        }
      val getLineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_count" }
        }
      val getMenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_menu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_menu" }
        }
      val getMinimapWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_minimap_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_minimap_width" }
        }
      val getSelectionFromColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_from_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_from_column" }
        }
      val getSelectionFromLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_from_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_from_line" }
        }
      val getSelectionText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_text" }
        }
      val getSelectionToColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_to_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_to_column" }
        }
      val getSelectionToLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_to_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_to_line" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val getVScrollSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_v_scroll_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll_speed" }
        }
      val getWordUnderCursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_word_under_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_word_under_cursor" }
        }
      val hasKeywordColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "has_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_keyword_color" }
        }
      val insertTextAtCursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "insert_text_at_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method insert_text_at_cursor" }
        }
      val isBreakpointGutterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_breakpoint_gutter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_breakpoint_gutter_enabled" }
        }
      val isContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
        }
      val isDrawingFoldGutter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_fold_gutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_fold_gutter" }
        }
      val isDrawingMinimap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_minimap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_minimap" }
        }
      val isDrawingSpaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_spaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_spaces" }
        }
      val isDrawingTabs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_tabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_tabs" }
        }
      val isFolded: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_folded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_folded" }
        }
      val isHidingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_hiding_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hiding_enabled" }
        }
      val isHighlightAllOccurrencesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_highlight_all_occurrences_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_highlight_all_occurrences_enabled" }
        }
      val isHighlightCurrentLineEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_highlight_current_line_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_highlight_current_line_enabled"
            }
        }
      val isLineHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_line_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_line_hidden" }
        }
      val isOverridingSelectedFontColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_overriding_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_selected_font_color"
            }
        }
      val isReadonly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_readonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_readonly" }
        }
      val isRightClickMovingCaret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_right_click_moving_caret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_right_click_moving_caret" }
        }
      val isSelectingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_selecting_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selecting_enabled" }
        }
      val isSelectionActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_selection_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selection_active" }
        }
      val isShortcutKeysEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_shortcut_keys_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut_keys_enabled" }
        }
      val isShowLineNumbersEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_show_line_numbers_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_show_line_numbers_enabled" }
        }
      val isSmoothScrollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_smooth_scroll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_smooth_scroll_enabled" }
        }
      val isSyntaxColoringEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_syntax_coloring_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_syntax_coloring_enabled" }
        }
      val isWrapEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_wrap_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_wrap_enabled" }
        }
      val menuOption: CPointer<godot_method_bind>
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
      val removeBreakpoints: CPointer<godot_method_bind>
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
      val selectAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "select_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select_all" }
        }
      val setBreakpointGutterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_breakpoint_gutter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_breakpoint_gutter_enabled" }
        }
      val setContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
        }
      val setDrawFoldGutter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_fold_gutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_fold_gutter" }
        }
      val setDrawSpaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_spaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_spaces" }
        }
      val setDrawTabs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_tabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_tabs" }
        }
      val setHScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_scroll" }
        }
      val setHidingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_hiding_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hiding_enabled" }
        }
      val setHighlightAllOccurrences: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_highlight_all_occurrences".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_highlight_all_occurrences" }
        }
      val setHighlightCurrentLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_highlight_current_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_highlight_current_line" }
        }
      val setLineAsHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_line_as_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_line_as_hidden" }
        }
      val setMinimapWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_minimap_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_minimap_width" }
        }
      val setOverrideSelectedFontColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_override_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_override_selected_font_color" }
        }
      val setReadonly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_readonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_readonly" }
        }
      val setRightClickMovesCaret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_right_click_moves_caret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_right_click_moves_caret" }
        }
      val setSelectingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_selecting_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selecting_enabled" }
        }
      val setShortcutKeysEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_shortcut_keys_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut_keys_enabled" }
        }
      val setShowLineNumbers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_show_line_numbers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_line_numbers" }
        }
      val setSmoothScrollEnable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_smooth_scroll_enable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_scroll_enable" }
        }
      val setSyntaxColoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_syntax_coloring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_syntax_coloring" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_scroll" }
        }
      val setVScrollSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_v_scroll_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_scroll_speed" }
        }
      val setWrapEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_wrap_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wrap_enabled" }
        }
      val toggleFoldLine: CPointer<godot_method_bind>
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
      val unfoldLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "unfold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unfold_line" }
        }
      val unhideAllLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "unhide_all_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unhide_all_lines" }
        }}
  }
}
