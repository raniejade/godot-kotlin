// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class TextEdit(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _click_selection_held() {
    TODO()
  }

  open fun _cursor_changed_emit() {
    TODO()
  }

  open fun _push_current_op() {
    TODO()
  }

  open fun _scroll_moved(arg0: Float) {
    TODO()
  }

  open fun _text_changed_emit() {
    TODO()
  }

  open fun _toggle_draw_caret() {
    TODO()
  }

  open fun _update_wrap_at() {
    TODO()
  }

  open fun _v_scroll_input() {
    TODO()
  }

  fun addColorRegion(
    beginKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(beginKey)
      _args.add(endKey)
      _args.add(color)
      _args.add(lineOnly)
      __method_bind.addColorRegion.call(self._handle, _args, null)
    }
  }

  fun addKeywordColor(keyword: String, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(keyword)
      _args.add(color)
      __method_bind.addKeywordColor.call(self._handle, _args, null)
    }
  }

  fun canFold(line: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canFold.call(self._handle, listOf(line), _retPtr)
      _ret.value
    }
  }

  fun centerViewportToCursor() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.centerViewportToCursor.call(self._handle, emptyList(), null)
    }
  }

  fun clearColors() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearColors.call(self._handle, emptyList(), null)
    }
  }

  fun clearUndoHistory() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearUndoHistory.call(self._handle, emptyList(), null)
    }
  }

  fun copy() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.copy.call(self._handle, emptyList(), null)
    }
  }

  fun cursorGetBlinkEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.cursorGetBlinkEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun cursorGetBlinkSpeed(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.cursorGetBlinkSpeed.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun cursorGetColumn(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.cursorGetColumn.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun cursorGetLine(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.cursorGetLine.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun cursorIsBlockMode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.cursorIsBlockMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun cursorSetBlinkEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cursorSetBlinkEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cursorSetBlinkSpeed.call(self._handle, listOf(blinkSpeed), null)
    }
  }

  fun cursorSetBlockMode(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cursorSetBlockMode.call(self._handle, listOf(enable), null)
    }
  }

  fun cursorSetColumn(column: Int, adjustViewport: Boolean = true) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(adjustViewport)
      __method_bind.cursorSetColumn.call(self._handle, _args, null)
    }
  }

  fun cursorSetLine(
    line: Int,
    adjustViewport: Boolean = true,
    canBeHidden: Boolean = true,
    wrapIndex: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(line)
      _args.add(adjustViewport)
      _args.add(canBeHidden)
      _args.add(wrapIndex)
      __method_bind.cursorSetLine.call(self._handle, _args, null)
    }
  }

  fun cut() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.cut.call(self._handle, emptyList(), null)
    }
  }

  fun deselect() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.deselect.call(self._handle, emptyList(), null)
    }
  }

  fun drawMinimap(draw: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.drawMinimap.call(self._handle, listOf(draw), null)
    }
  }

  fun foldAllLines() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.foldAllLines.call(self._handle, emptyList(), null)
    }
  }

  fun foldLine(line: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.foldLine.call(self._handle, listOf(line), null)
    }
  }

  fun getBreakpoints(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getBreakpoints.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getHScroll(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHScroll.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getKeywordColor(keyword: String): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getKeywordColor.call(self._handle, listOf(keyword), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLine(line: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLine.call(self._handle, listOf(line), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLineCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLineCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMenu(): PopupMenu {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PopupMenu
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMenu.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<PopupMenu>(_tmp.value!!)
      _ret
    }
  }

  fun getMinimapWidth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMinimapWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectionFromColumn(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectionFromColumn.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectionFromLine(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectionFromLine.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectionText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSelectionText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSelectionToColumn(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectionToColumn.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSelectionToLine(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectionToLine.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVScroll(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVScroll.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVScrollSpeed(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVScrollSpeed.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getWordUnderCursor(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getWordUnderCursor.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun hasKeywordColor(keyword: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasKeywordColor.call(self._handle, listOf(keyword), _retPtr)
      _ret.value
    }
  }

  fun insertTextAtCursor(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.insertTextAtCursor.call(self._handle, listOf(text), null)
    }
  }

  fun isBreakpointGutterEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isBreakpointGutterEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isContextMenuEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isContextMenuEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDrawingFoldGutter(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawingFoldGutter.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDrawingMinimap(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawingMinimap.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDrawingSpaces(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawingSpaces.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDrawingTabs(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawingTabs.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFolded(line: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFolded.call(self._handle, listOf(line), _retPtr)
      _ret.value
    }
  }

  fun isHidingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHidingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHighlightAllOccurrencesEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHighlightAllOccurrencesEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHighlightCurrentLineEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHighlightCurrentLineEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isLineHidden(line: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isLineHidden.call(self._handle, listOf(line), _retPtr)
      _ret.value
    }
  }

  fun isOverridingSelectedFontColor(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOverridingSelectedFontColor.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isReadonly(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isReadonly.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRightClickMovingCaret(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRightClickMovingCaret.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSelectingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelectingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSelectionActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelectionActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShortcutKeysEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShortcutKeysEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isShowLineNumbersEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isShowLineNumbersEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSmoothScrollEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSmoothScrollEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSyntaxColoringEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSyntaxColoringEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isWrapEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isWrapEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun menuOption(option: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.menuOption.call(self._handle, listOf(option), null)
    }
  }

  fun paste() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.paste.call(self._handle, emptyList(), null)
    }
  }

  fun redo() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.redo.call(self._handle, emptyList(), null)
    }
  }

  fun removeBreakpoints() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeBreakpoints.call(self._handle, emptyList(), null)
    }
  }

  fun search(
    key: String,
    flags: Int,
    fromLine: Int,
    fromColumn: Int
  ): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(key)
      _args.add(flags)
      _args.add(fromLine)
      _args.add(fromColumn)
      __method_bind.search.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun select(
    fromLine: Int,
    fromColumn: Int,
    toLine: Int,
    toColumn: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(fromLine)
      _args.add(fromColumn)
      _args.add(toLine)
      _args.add(toColumn)
      __method_bind.select.call(self._handle, _args, null)
    }
  }

  fun selectAll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.selectAll.call(self._handle, emptyList(), null)
    }
  }

  fun setBreakpointGutterEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBreakpointGutterEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setContextMenuEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setDrawFoldGutter(arg0: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawFoldGutter.call(self._handle, listOf(arg0), null)
    }
  }

  fun setDrawSpaces(arg0: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawSpaces.call(self._handle, listOf(arg0), null)
    }
  }

  fun setDrawTabs(arg0: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawTabs.call(self._handle, listOf(arg0), null)
    }
  }

  fun setHScroll(value: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHScroll.call(self._handle, listOf(value), null)
    }
  }

  fun setHidingEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHidingEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setHighlightAllOccurrences(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHighlightAllOccurrences.call(self._handle, listOf(enable), null)
    }
  }

  fun setHighlightCurrentLine(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHighlightCurrentLine.call(self._handle, listOf(enabled), null)
    }
  }

  fun setLineAsHidden(line: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(line)
      _args.add(enable)
      __method_bind.setLineAsHidden.call(self._handle, _args, null)
    }
  }

  fun setMinimapWidth(width: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMinimapWidth.call(self._handle, listOf(width), null)
    }
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOverrideSelectedFontColor.call(self._handle, listOf(override), null)
    }
  }

  fun setReadonly(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReadonly.call(self._handle, listOf(enable), null)
    }
  }

  fun setRightClickMovesCaret(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRightClickMovesCaret.call(self._handle, listOf(enable), null)
    }
  }

  fun setSelectingEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelectingEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setShortcutKeysEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShortcutKeysEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setShowLineNumbers(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShowLineNumbers.call(self._handle, listOf(enable), null)
    }
  }

  fun setSmoothScrollEnable(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSmoothScrollEnable.call(self._handle, listOf(enable), null)
    }
  }

  fun setSyntaxColoring(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSyntaxColoring.call(self._handle, listOf(enable), null)
    }
  }

  fun setText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setText.call(self._handle, listOf(text), null)
    }
  }

  fun setVScroll(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVScroll.call(self._handle, listOf(value), null)
    }
  }

  fun setVScrollSpeed(speed: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVScrollSpeed.call(self._handle, listOf(speed), null)
    }
  }

  fun setWrapEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWrapEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun toggleFoldLine(line: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.toggleFoldLine.call(self._handle, listOf(line), null)
    }
  }

  fun undo() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.undo.call(self._handle, emptyList(), null)
    }
  }

  fun unfoldLine(line: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unfoldLine.call(self._handle, listOf(line), null)
    }
  }

  fun unhideAllLines() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unhideAllLines.call(self._handle, emptyList(), null)
    }
  }

  enum class SearchFlags(
    val value: Int
  ) {
    MATCH_CASE(1),

    WHOLE_WORDS(2),

    BACKWARDS(4);

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
    COLUMN(0),

    LINE(1);

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
    CUT(0),

    COPY(1),

    PASTE(2),

    CLEAR(3),

    SELECT_ALL(4),

    UNDO(5),

    REDO(6),

    MAX(7);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TextEdit
     */
    private object __method_bind {
      val addColorRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "add_color_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color_region" }
        }
      val addKeywordColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "add_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_keyword_color" }
        }
      val canFold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "can_fold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_fold" }
        }
      val centerViewportToCursor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "center_viewport_to_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method center_viewport_to_cursor" }
        }
      val clearColors: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "clear_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_colors" }
        }
      val clearUndoHistory: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "clear_undo_history".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_undo_history" }
        }
      val copy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "copy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy" }
        }
      val cursorGetBlinkEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_enabled" }
        }
      val cursorGetBlinkSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_blink_speed" }
        }
      val cursorGetColumn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_column" }
        }
      val cursorGetLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_get_line" }
        }
      val cursorIsBlockMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_is_block_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_is_block_mode" }
        }
      val cursorSetBlinkEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_blink_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_enabled" }
        }
      val cursorSetBlinkSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_blink_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_blink_speed" }
        }
      val cursorSetBlockMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_block_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_block_mode" }
        }
      val cursorSetColumn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_column" }
        }
      val cursorSetLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursor_set_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursor_set_line" }
        }
      val cut: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cut" }
        }
      val deselect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "deselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deselect" }
        }
      val drawMinimap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "draw_minimap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_minimap" }
        }
      val foldAllLines: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "fold_all_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fold_all_lines" }
        }
      val foldLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "fold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fold_line" }
        }
      val getBreakpoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_breakpoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_breakpoints" }
        }
      val getHScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_scroll" }
        }
      val getKeywordColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keyword_color" }
        }
      val getLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line" }
        }
      val getLineCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_count" }
        }
      val getMenu: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_menu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_menu" }
        }
      val getMinimapWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_minimap_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_minimap_width" }
        }
      val getSelectionFromColumn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_from_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_from_column" }
        }
      val getSelectionFromLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_from_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_from_line" }
        }
      val getSelectionText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_text" }
        }
      val getSelectionToColumn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_to_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_to_column" }
        }
      val getSelectionToLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_selection_to_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selection_to_line" }
        }
      val getText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val getVScrollSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_v_scroll_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll_speed" }
        }
      val getWordUnderCursor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "get_word_under_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_word_under_cursor" }
        }
      val hasKeywordColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "has_keyword_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_keyword_color" }
        }
      val insertTextAtCursor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "insert_text_at_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method insert_text_at_cursor" }
        }
      val isBreakpointGutterEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_breakpoint_gutter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_breakpoint_gutter_enabled" }
        }
      val isContextMenuEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_context_menu_enabled" }
        }
      val isDrawingFoldGutter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_fold_gutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_fold_gutter" }
        }
      val isDrawingMinimap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_minimap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_minimap" }
        }
      val isDrawingSpaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_spaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_spaces" }
        }
      val isDrawingTabs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_drawing_tabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_drawing_tabs" }
        }
      val isFolded: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_folded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_folded" }
        }
      val isHidingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_hiding_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_hiding_enabled" }
        }
      val isHighlightAllOccurrencesEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_highlight_all_occurrences_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_highlight_all_occurrences_enabled" }
        }
      val isHighlightCurrentLineEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_highlight_current_line_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_highlight_current_line_enabled"
            }
        }
      val isLineHidden: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_line_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_line_hidden" }
        }
      val isOverridingSelectedFontColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_overriding_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_selected_font_color"
            }
        }
      val isReadonly: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_readonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_readonly" }
        }
      val isRightClickMovingCaret: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_right_click_moving_caret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_right_click_moving_caret" }
        }
      val isSelectingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_selecting_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selecting_enabled" }
        }
      val isSelectionActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_selection_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selection_active" }
        }
      val isShortcutKeysEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_shortcut_keys_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut_keys_enabled" }
        }
      val isShowLineNumbersEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_show_line_numbers_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_show_line_numbers_enabled" }
        }
      val isSmoothScrollEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_smooth_scroll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_smooth_scroll_enabled" }
        }
      val isSyntaxColoringEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_syntax_coloring_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_syntax_coloring_enabled" }
        }
      val isWrapEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "is_wrap_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_wrap_enabled" }
        }
      val menuOption: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "menu_option".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method menu_option" }
        }
      val paste: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "paste".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method paste" }
        }
      val redo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "redo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method redo" }
        }
      val removeBreakpoints: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "remove_breakpoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_breakpoints" }
        }
      val search: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method search" }
        }
      val select: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select" }
        }
      val selectAll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "select_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select_all" }
        }
      val setBreakpointGutterEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_breakpoint_gutter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_breakpoint_gutter_enabled" }
        }
      val setContextMenuEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_context_menu_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_context_menu_enabled" }
        }
      val setDrawFoldGutter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_fold_gutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_fold_gutter" }
        }
      val setDrawSpaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_spaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_spaces" }
        }
      val setDrawTabs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_draw_tabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_tabs" }
        }
      val setHScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_h_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_scroll" }
        }
      val setHidingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_hiding_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hiding_enabled" }
        }
      val setHighlightAllOccurrences: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_highlight_all_occurrences".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_highlight_all_occurrences" }
        }
      val setHighlightCurrentLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_highlight_current_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_highlight_current_line" }
        }
      val setLineAsHidden: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_line_as_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_line_as_hidden" }
        }
      val setMinimapWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_minimap_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_minimap_width" }
        }
      val setOverrideSelectedFontColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_override_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_override_selected_font_color" }
        }
      val setReadonly: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_readonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_readonly" }
        }
      val setRightClickMovesCaret: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_right_click_moves_caret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_right_click_moves_caret" }
        }
      val setSelectingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_selecting_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selecting_enabled" }
        }
      val setShortcutKeysEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_shortcut_keys_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut_keys_enabled" }
        }
      val setShowLineNumbers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_show_line_numbers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_line_numbers" }
        }
      val setSmoothScrollEnable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_smooth_scroll_enable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_scroll_enable" }
        }
      val setSyntaxColoring: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_syntax_coloring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_syntax_coloring" }
        }
      val setText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setVScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_scroll" }
        }
      val setVScrollSpeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_v_scroll_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_scroll_speed" }
        }
      val setWrapEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "set_wrap_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_wrap_enabled" }
        }
      val toggleFoldLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "toggle_fold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggle_fold_line" }
        }
      val undo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "undo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method undo" }
        }
      val unfoldLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "unfold_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unfold_line" }
        }
      val unhideAllLines: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "unhide_all_lines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unhide_all_lines" }
        }}
  }
}
