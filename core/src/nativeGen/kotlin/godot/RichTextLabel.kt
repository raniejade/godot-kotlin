// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Color
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RichTextLabel(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var bbcodeEnabled: Boolean
    get() {
       return isUsingBbcode() 
    }
    set(value) {
      setUseBbcode(value)
    }

  var bbcodeText: String
    get() {
       return getBbcode() 
    }
    set(value) {
      setBbcode(value)
    }

  var customEffects: VariantArray
    get() {
       return getEffects() 
    }
    set(value) {
      setEffects(value)
    }

  var metaUnderlined: Boolean
    get() {
       return isMetaUnderlined() 
    }
    set(value) {
      setMetaUnderline(value)
    }

  var overrideSelectedFontColor: Boolean
    get() {
       return isOverridingSelectedFontColor() 
    }
    set(value) {
      setOverrideSelectedFontColor(value)
    }

  var percentVisible: Float
    get() {
       return getPercentVisible() 
    }
    set(value) {
      setPercentVisible(value)
    }

  var scrollActive: Boolean
    get() {
       return isScrollActive() 
    }
    set(value) {
      setScrollActive(value)
    }

  var scrollFollowing: Boolean
    get() {
       return isScrollFollowing() 
    }
    set(value) {
      setScrollFollow(value)
    }

  var selectionEnabled: Boolean
    get() {
       return isSelectionEnabled() 
    }
    set(value) {
      setSelectionEnabled(value)
    }

  var tabSize: Int
    get() {
       return getTabSize() 
    }
    set(value) {
      setTabSize(value)
    }

  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  var visibleCharacters: Int
    get() {
       return getVisibleCharacters() 
    }
    set(value) {
      setVisibleCharacters(value)
    }

  /**
   * RichTextLabel::meta_clicked signal
   */
  val signalMetaClicked: Signal1<Variant> = Signal1("meta_clicked")

  /**
   * RichTextLabel::meta_hover_ended signal
   */
  val signalMetaHoverEnded: Signal1<Variant> = Signal1("meta_hover_ended")

  /**
   * RichTextLabel::meta_hover_started signal
   */
  val signalMetaHoverStarted: Signal1<Variant> = Signal1("meta_hover_started")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addImage(
    image: Texture,
    width: Int = 0,
    height: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(height))
    __method_bind.addImage.call(this._handle, _args)
  }

  fun addText(text: String) {
    val _arg = Variant(text)
    __method_bind.addText.call(this._handle, listOf(_arg))
  }

  fun appendBbcode(bbcode: String): GDError {
    val _arg = Variant(bbcode)
    val _ret = __method_bind.appendBbcode.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getBbcode(): String {
    val _ret = __method_bind.getBbcode.call(this._handle)
    return _ret.asString()
  }

  fun getContentHeight(): Int {
    val _ret = __method_bind.getContentHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getEffects(): VariantArray {
    val _ret = __method_bind.getEffects.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getLineCount(): Int {
    val _ret = __method_bind.getLineCount.call(this._handle)
    return _ret.asInt()
  }

  fun getPercentVisible(): Float {
    val _ret = __method_bind.getPercentVisible.call(this._handle)
    return _ret.asFloat()
  }

  fun getTabSize(): Int {
    val _ret = __method_bind.getTabSize.call(this._handle)
    return _ret.asInt()
  }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun getTotalCharacterCount(): Int {
    val _ret = __method_bind.getTotalCharacterCount.call(this._handle)
    return _ret.asInt()
  }

  fun getVScroll(): VScrollBar {
    val _ret = __method_bind.getVScroll.call(this._handle)
    return _ret.toAny() as VScrollBar
  }

  fun getVisibleCharacters(): Int {
    val _ret = __method_bind.getVisibleCharacters.call(this._handle)
    return _ret.asInt()
  }

  fun getVisibleLineCount(): Int {
    val _ret = __method_bind.getVisibleLineCount.call(this._handle)
    return _ret.asInt()
  }

  fun installEffect(effect: Variant) {
    val _arg = Variant(effect)
    __method_bind.installEffect.call(this._handle, listOf(_arg))
  }

  fun isMetaUnderlined(): Boolean {
    val _ret = __method_bind.isMetaUnderlined.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOverridingSelectedFontColor(): Boolean {
    val _ret = __method_bind.isOverridingSelectedFontColor.call(this._handle)
    return _ret.asBoolean()
  }

  fun isScrollActive(): Boolean {
    val _ret = __method_bind.isScrollActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun isScrollFollowing(): Boolean {
    val _ret = __method_bind.isScrollFollowing.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelectionEnabled(): Boolean {
    val _ret = __method_bind.isSelectionEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingBbcode(): Boolean {
    val _ret = __method_bind.isUsingBbcode.call(this._handle)
    return _ret.asBoolean()
  }

  fun newline() {
    __method_bind.newline.call(this._handle)
  }

  fun parseBbcode(bbcode: String): GDError {
    val _arg = Variant(bbcode)
    val _ret = __method_bind.parseBbcode.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun parseExpressionsForValues(expressions: PoolStringArray): Dictionary {
    val _arg = Variant(expressions)
    val _ret = __method_bind.parseExpressionsForValues.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun pop() {
    __method_bind.pop.call(this._handle)
  }

  fun pushAlign(align: Int) {
    val _arg = Variant(align)
    __method_bind.pushAlign.call(this._handle, listOf(_arg))
  }

  fun pushBold() {
    __method_bind.pushBold.call(this._handle)
  }

  fun pushBoldItalics() {
    __method_bind.pushBoldItalics.call(this._handle)
  }

  fun pushCell() {
    __method_bind.pushCell.call(this._handle)
  }

  fun pushColor(color: Color) {
    val _arg = Variant(color)
    __method_bind.pushColor.call(this._handle, listOf(_arg))
  }

  fun pushFont(font: Font) {
    val _arg = Variant(font)
    __method_bind.pushFont.call(this._handle, listOf(_arg))
  }

  fun pushIndent(level: Int) {
    val _arg = Variant(level)
    __method_bind.pushIndent.call(this._handle, listOf(_arg))
  }

  fun pushItalics() {
    __method_bind.pushItalics.call(this._handle)
  }

  fun pushList(type: Int) {
    val _arg = Variant(type)
    __method_bind.pushList.call(this._handle, listOf(_arg))
  }

  fun pushMeta(data: Variant) {
    val _arg = Variant(data)
    __method_bind.pushMeta.call(this._handle, listOf(_arg))
  }

  fun pushMono() {
    __method_bind.pushMono.call(this._handle)
  }

  fun pushNormal() {
    __method_bind.pushNormal.call(this._handle)
  }

  fun pushStrikethrough() {
    __method_bind.pushStrikethrough.call(this._handle)
  }

  fun pushTable(columns: Int) {
    val _arg = Variant(columns)
    __method_bind.pushTable.call(this._handle, listOf(_arg))
  }

  fun pushUnderline() {
    __method_bind.pushUnderline.call(this._handle)
  }

  fun removeLine(line: Int): Boolean {
    val _arg = Variant(line)
    val _ret = __method_bind.removeLine.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun scrollToLine(line: Int) {
    val _arg = Variant(line)
    __method_bind.scrollToLine.call(this._handle, listOf(_arg))
  }

  fun setBbcode(text: String) {
    val _arg = Variant(text)
    __method_bind.setBbcode.call(this._handle, listOf(_arg))
  }

  fun setEffects(effects: VariantArray) {
    val _arg = Variant(effects)
    __method_bind.setEffects.call(this._handle, listOf(_arg))
  }

  fun setMetaUnderline(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setMetaUnderline.call(this._handle, listOf(_arg))
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    val _arg = Variant(override)
    __method_bind.setOverrideSelectedFontColor.call(this._handle, listOf(_arg))
  }

  fun setPercentVisible(percentVisible: Float) {
    val _arg = Variant(percentVisible)
    __method_bind.setPercentVisible.call(this._handle, listOf(_arg))
  }

  fun setScrollActive(active: Boolean) {
    val _arg = Variant(active)
    __method_bind.setScrollActive.call(this._handle, listOf(_arg))
  }

  fun setScrollFollow(follow: Boolean) {
    val _arg = Variant(follow)
    __method_bind.setScrollFollow.call(this._handle, listOf(_arg))
  }

  fun setSelectionEnabled(enabled: Boolean) {
    val _arg = Variant(enabled)
    __method_bind.setSelectionEnabled.call(this._handle, listOf(_arg))
  }

  fun setTabSize(spaces: Int) {
    val _arg = Variant(spaces)
    __method_bind.setTabSize.call(this._handle, listOf(_arg))
  }

  fun setTableColumnExpand(
    column: Int,
    expand: Boolean,
    ratio: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(expand))
    _args.add(Variant.fromAny(ratio))
    __method_bind.setTableColumnExpand.call(this._handle, _args)
  }

  fun setText(text: String) {
    val _arg = Variant(text)
    __method_bind.setText.call(this._handle, listOf(_arg))
  }

  fun setUseBbcode(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setUseBbcode.call(this._handle, listOf(_arg))
  }

  fun setVisibleCharacters(amount: Int) {
    val _arg = Variant(amount)
    __method_bind.setVisibleCharacters.call(this._handle, listOf(_arg))
  }

  enum class Align(
    val value: Int
  ) {
    LEFT(0),

    CENTER(1),

    RIGHT(2),

    FILL(3);

    companion object {
      fun from(value: Int): Align {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ListType(
    val value: Int
  ) {
    NUMBERS(0),

    LETTERS(1),

    DOTS(2);

    companion object {
      fun from(value: Int): ListType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ItemType(
    val value: Int
  ) {
    FRAME(0),

    TEXT(1),

    IMAGE(2),

    NEWLINE(3),

    FONT(4),

    COLOR(5),

    UNDERLINE(6),

    STRIKETHROUGH(7),

    ALIGN(8),

    INDENT(9),

    LIST(10),

    TABLE(11),

    FADE(12),

    SHAKE(13),

    WAVE(14),

    TORNADO(15),

    RAINBOW(16),

    META(17),

    CUSTOMFX(18);

    companion object {
      fun from(value: Int): ItemType {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RichTextLabel".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RichTextLabel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RichTextLabel
     */
    private object __method_bind {
      val addImage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "add_image".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_image" }
        }
      val addText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "add_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_text" }
        }
      val appendBbcode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "append_bbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method append_bbcode" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getBbcode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_bbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bbcode" }
        }
      val getContentHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_content_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_content_height" }
        }
      val getEffects: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_effects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_effects" }
        }
      val getLineCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_line_count" }
        }
      val getPercentVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_percent_visible" }
        }
      val getTabSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_tab_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tab_size" }
        }
      val getText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getTotalCharacterCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_total_character_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_total_character_count" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_v_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
        }
      val getVisibleCharacters: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_visible_characters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_characters" }
        }
      val getVisibleLineCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "get_visible_line_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_line_count" }
        }
      val installEffect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "install_effect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method install_effect" }
        }
      val isMetaUnderlined: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "is_meta_underlined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_meta_underlined" }
        }
      val isOverridingSelectedFontColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "is_overriding_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_overriding_selected_font_color"
            }
        }
      val isScrollActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "is_scroll_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scroll_active" }
        }
      val isScrollFollowing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "is_scroll_following".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scroll_following" }
        }
      val isSelectionEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "is_selection_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selection_enabled" }
        }
      val isUsingBbcode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "is_using_bbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_bbcode" }
        }
      val newline: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "newline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method newline" }
        }
      val parseBbcode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "parse_bbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method parse_bbcode" }
        }
      val parseExpressionsForValues: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "parse_expressions_for_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method parse_expressions_for_values" }
        }
      val pop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pop" }
        }
      val pushAlign: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_align" }
        }
      val pushBold: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_bold".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_bold" }
        }
      val pushBoldItalics: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_bold_italics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_bold_italics" }
        }
      val pushCell: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_cell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_cell" }
        }
      val pushColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_color" }
        }
      val pushFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_font" }
        }
      val pushIndent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_indent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_indent" }
        }
      val pushItalics: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_italics".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_italics" }
        }
      val pushList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_list" }
        }
      val pushMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_meta" }
        }
      val pushMono: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_mono".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_mono" }
        }
      val pushNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_normal" }
        }
      val pushStrikethrough: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_strikethrough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_strikethrough" }
        }
      val pushTable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_table".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_table" }
        }
      val pushUnderline: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "push_underline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method push_underline" }
        }
      val removeLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "remove_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_line" }
        }
      val scrollToLine: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "scroll_to_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scroll_to_line" }
        }
      val setBbcode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_bbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bbcode" }
        }
      val setEffects: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_effects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_effects" }
        }
      val setMetaUnderline: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_meta_underline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_meta_underline" }
        }
      val setOverrideSelectedFontColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_override_selected_font_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_override_selected_font_color" }
        }
      val setPercentVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_percent_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_percent_visible" }
        }
      val setScrollActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_scroll_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_active" }
        }
      val setScrollFollow: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_scroll_follow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_follow" }
        }
      val setSelectionEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_selection_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selection_enabled" }
        }
      val setTabSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_tab_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tab_size" }
        }
      val setTableColumnExpand: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_table_column_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_table_column_expand" }
        }
      val setText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setUseBbcode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_use_bbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_bbcode" }
        }
      val setVisibleCharacters: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "set_visible_characters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible_characters" }
        }}
  }
}
