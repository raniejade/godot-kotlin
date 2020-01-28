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
    __method_bind.addColorRegion.call(this._handle, _args.toVariant(), 4)
  }

  fun addKeywordColor(keyword: String, color: Color) {
    val _args = VariantArray.new()
    _args.append(keyword)
    _args.append(color)
    __method_bind.addKeywordColor.call(this._handle, _args.toVariant(), 2)
  }

  fun canFold(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.canFold.call(this._handle, _arg, 1)
    return _ret.asBoolean()
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
    __method_bind.cursorSetBlinkEnabled.call(this._handle, _arg, 1)
  }

  fun cursorSetBlinkSpeed(blinkSpeed: Float) {
    val _arg = Variant.new(blinkSpeed)
    __method_bind.cursorSetBlinkSpeed.call(this._handle, _arg, 1)
  }

  fun cursorSetBlockMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.cursorSetBlockMode.call(this._handle, _arg, 1)
  }

  fun cursorSetColumn(column: Int, adjustViewport: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(adjustViewport)
    __method_bind.cursorSetColumn.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.cursorSetLine.call(this._handle, _args.toVariant(), 4)
  }

  fun cut() {
    __method_bind.cut.call(this._handle)
  }

  fun deselect() {
    __method_bind.deselect.call(this._handle)
  }

  fun foldAllLines() {
    __method_bind.foldAllLines.call(this._handle)
  }

  fun foldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.foldLine.call(this._handle, _arg, 1)
  }

  fun getBreakpoints(): VariantArray {
    val _ret = __method_bind.getBreakpoints.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getKeywordColor(keyword: String): Color {
    val _arg = Variant.new(keyword)
    val _ret = __method_bind.getKeywordColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getLine(line: Int): String {
    val _arg = Variant.new(line)
    val _ret = __method_bind.getLine.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.hasKeywordColor.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun insertTextAtCursor(text: String) {
    val _arg = Variant.new(text)
    __method_bind.insertTextAtCursor.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.isFolded.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.isLineHidden.call(this._handle, _arg, 1)
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

  fun isSelectionActive(): Boolean {
    val _ret = __method_bind.isSelectionActive.call(this._handle)
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
    __method_bind.menuOption.call(this._handle, _arg, 1)
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
    __method_bind.selectAll.call(this._handle)
  }

  fun setBreakpointGutterEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setBreakpointGutterEnabled.call(this._handle, _arg, 1)
  }

  fun setContextMenuEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setContextMenuEnabled.call(this._handle, _arg, 1)
  }

  fun setDrawFoldGutter(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setDrawFoldGutter.call(this._handle, _arg, 1)
  }

  fun setDrawSpaces(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setDrawSpaces.call(this._handle, _arg, 1)
  }

  fun setDrawTabs(arg0: Boolean) {
    val _arg = Variant.new(arg0)
    __method_bind.setDrawTabs.call(this._handle, _arg, 1)
  }

  fun setHidingEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHidingEnabled.call(this._handle, _arg, 1)
  }

  fun setHighlightAllOccurrences(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHighlightAllOccurrences.call(this._handle, _arg, 1)
  }

  fun setHighlightCurrentLine(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setHighlightCurrentLine.call(this._handle, _arg, 1)
  }

  fun setLineAsHidden(line: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(line)
    _args.append(enable)
    __method_bind.setLineAsHidden.call(this._handle, _args.toVariant(), 2)
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    val _arg = Variant.new(override)
    __method_bind.setOverrideSelectedFontColor.call(this._handle, _arg, 1)
  }

  fun setReadonly(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setReadonly.call(this._handle, _arg, 1)
  }

  fun setRightClickMovesCaret(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setRightClickMovesCaret.call(this._handle, _arg, 1)
  }

  fun setShowLineNumbers(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setShowLineNumbers.call(this._handle, _arg, 1)
  }

  fun setSmoothScrollEnable(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSmoothScrollEnable.call(this._handle, _arg, 1)
  }

  fun setSyntaxColoring(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setSyntaxColoring.call(this._handle, _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, _arg, 1)
  }

  fun setVScrollSpeed(speed: Float) {
    val _arg = Variant.new(speed)
    __method_bind.setVScrollSpeed.call(this._handle, _arg, 1)
  }

  fun setWrapEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setWrapEnabled.call(this._handle, _arg, 1)
  }

  fun toggleFoldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.toggleFoldLine.call(this._handle, _arg, 1)
  }

  fun undo() {
    __method_bind.undo.call(this._handle)
  }

  fun unfoldLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.unfoldLine.call(this._handle, _arg, 1)
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
      val addColorRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "addColorRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addColorRegion" }
        }
      val addKeywordColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "addKeywordColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addKeywordColor" }
        }
      val canFold: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "canFold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canFold" }
        }
      val clearColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "clearColors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearColors" }
        }
      val clearUndoHistory: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "clearUndoHistory".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearUndoHistory" }
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
            "cursorGetBlinkEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorGetBlinkEnabled" }
        }
      val cursorGetBlinkSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorGetBlinkSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorGetBlinkSpeed" }
        }
      val cursorGetColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorGetColumn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorGetColumn" }
        }
      val cursorGetLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorGetLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorGetLine" }
        }
      val cursorIsBlockMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorIsBlockMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorIsBlockMode" }
        }
      val cursorSetBlinkEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorSetBlinkEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorSetBlinkEnabled" }
        }
      val cursorSetBlinkSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorSetBlinkSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorSetBlinkSpeed" }
        }
      val cursorSetBlockMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorSetBlockMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorSetBlockMode" }
        }
      val cursorSetColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorSetColumn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorSetColumn" }
        }
      val cursorSetLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "cursorSetLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cursorSetLine" }
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
      val foldAllLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "foldAllLines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method foldAllLines" }
        }
      val foldLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "foldLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method foldLine" }
        }
      val getBreakpoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getBreakpoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBreakpoints" }
        }
      val getKeywordColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getKeywordColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getKeywordColor" }
        }
      val getLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLine" }
        }
      val getLineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getLineCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLineCount" }
        }
      val getMenu: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getMenu".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMenu" }
        }
      val getSelectionFromColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getSelectionFromColumn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectionFromColumn" }
        }
      val getSelectionFromLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getSelectionFromLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectionFromLine" }
        }
      val getSelectionText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getSelectionText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectionText" }
        }
      val getSelectionToColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getSelectionToColumn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectionToColumn" }
        }
      val getSelectionToLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getSelectionToLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectionToLine" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getText" }
        }
      val getVScrollSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getVScrollSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVScrollSpeed" }
        }
      val getWordUnderCursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "getWordUnderCursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWordUnderCursor" }
        }
      val hasKeywordColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "hasKeywordColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasKeywordColor" }
        }
      val insertTextAtCursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "insertTextAtCursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method insertTextAtCursor" }
        }
      val isBreakpointGutterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isBreakpointGutterEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isBreakpointGutterEnabled" }
        }
      val isContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isContextMenuEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isContextMenuEnabled" }
        }
      val isDrawingFoldGutter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isDrawingFoldGutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDrawingFoldGutter" }
        }
      val isDrawingSpaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isDrawingSpaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDrawingSpaces" }
        }
      val isDrawingTabs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isDrawingTabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDrawingTabs" }
        }
      val isFolded: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isFolded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFolded" }
        }
      val isHidingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isHidingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHidingEnabled" }
        }
      val isHighlightAllOccurrencesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isHighlightAllOccurrencesEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHighlightAllOccurrencesEnabled" }
        }
      val isHighlightCurrentLineEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isHighlightCurrentLineEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHighlightCurrentLineEnabled" }
        }
      val isLineHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isLineHidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isLineHidden" }
        }
      val isOverridingSelectedFontColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isOverridingSelectedFontColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOverridingSelectedFontColor" }
        }
      val isReadonly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isReadonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isReadonly" }
        }
      val isRightClickMovingCaret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isRightClickMovingCaret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRightClickMovingCaret" }
        }
      val isSelectionActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isSelectionActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSelectionActive" }
        }
      val isShowLineNumbersEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isShowLineNumbersEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isShowLineNumbersEnabled" }
        }
      val isSmoothScrollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isSmoothScrollEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSmoothScrollEnabled" }
        }
      val isSyntaxColoringEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isSyntaxColoringEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSyntaxColoringEnabled" }
        }
      val isWrapEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "isWrapEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isWrapEnabled" }
        }
      val menuOption: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "menuOption".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method menuOption" }
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
            "removeBreakpoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeBreakpoints" }
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
            "selectAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method selectAll" }
        }
      val setBreakpointGutterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setBreakpointGutterEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBreakpointGutterEnabled" }
        }
      val setContextMenuEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setContextMenuEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setContextMenuEnabled" }
        }
      val setDrawFoldGutter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setDrawFoldGutter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawFoldGutter" }
        }
      val setDrawSpaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setDrawSpaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawSpaces" }
        }
      val setDrawTabs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setDrawTabs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawTabs" }
        }
      val setHidingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setHidingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHidingEnabled" }
        }
      val setHighlightAllOccurrences: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setHighlightAllOccurrences".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHighlightAllOccurrences" }
        }
      val setHighlightCurrentLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setHighlightCurrentLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHighlightCurrentLine" }
        }
      val setLineAsHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setLineAsHidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLineAsHidden" }
        }
      val setOverrideSelectedFontColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setOverrideSelectedFontColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOverrideSelectedFontColor" }
        }
      val setReadonly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setReadonly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setReadonly" }
        }
      val setRightClickMovesCaret: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setRightClickMovesCaret".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRightClickMovesCaret" }
        }
      val setShowLineNumbers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setShowLineNumbers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShowLineNumbers" }
        }
      val setSmoothScrollEnable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setSmoothScrollEnable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSmoothScrollEnable" }
        }
      val setSyntaxColoring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setSyntaxColoring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSyntaxColoring" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setText" }
        }
      val setVScrollSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setVScrollSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVScrollSpeed" }
        }
      val setWrapEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "setWrapEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWrapEnabled" }
        }
      val toggleFoldLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "toggleFoldLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method toggleFoldLine" }
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
            "unfoldLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unfoldLine" }
        }
      val unhideAllLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextEdit".cstr.ptr,
            "unhideAllLines".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unhideAllLines" }
        }}
  }
}
