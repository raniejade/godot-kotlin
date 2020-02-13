// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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

  open fun _scroll_changed(arg0: Float) {
    TODO()
  }

  fun addImage(
    image: Texture,
    width: Int = 0,
    height: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(image)
      _args.add(width)
      _args.add(height)
      __method_bind.addImage.call(self._handle, _args, null)
    }
  }

  fun addText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addText.call(self._handle, listOf(text), null)
    }
  }

  fun appendBbcode(bbcode: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.appendBbcode.call(self._handle, listOf(bbcode), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun getBbcode(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBbcode.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getContentHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getContentHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getEffects(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getEffects.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
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

  fun getPercentVisible(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPercentVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTabSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTabSize.call(self._handle, emptyList(), _retPtr)
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

  fun getTotalCharacterCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTotalCharacterCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVScroll(): VScrollBar {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VScrollBar
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getVScroll.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<VScrollBar>(_tmp.value!!)
      _ret
    }
  }

  fun getVisibleCharacters(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVisibleCharacters.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVisibleLineCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVisibleLineCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun installEffect(effect: Variant) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.installEffect.call(self._handle, listOf(effect), null)
    }
  }

  fun isMetaUnderlined(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isMetaUnderlined.call(self._handle, emptyList(), _retPtr)
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

  fun isScrollActive(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isScrollActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isScrollFollowing(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isScrollFollowing.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSelectionEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelectionEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingBbcode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingBbcode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun newline() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.newline.call(self._handle, emptyList(), null)
    }
  }

  fun parseBbcode(bbcode: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.parseBbcode.call(self._handle, listOf(bbcode), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun parseExpressionsForValues(expressions: PoolStringArray): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.parseExpressionsForValues.call(self._handle, listOf(expressions), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun pop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pop.call(self._handle, emptyList(), null)
    }
  }

  fun pushAlign(align: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushAlign.call(self._handle, listOf(align), null)
    }
  }

  fun pushBold() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushBold.call(self._handle, emptyList(), null)
    }
  }

  fun pushBoldItalics() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushBoldItalics.call(self._handle, emptyList(), null)
    }
  }

  fun pushCell() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushCell.call(self._handle, emptyList(), null)
    }
  }

  fun pushColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushColor.call(self._handle, listOf(color), null)
    }
  }

  fun pushFont(font: Font) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushFont.call(self._handle, listOf(font), null)
    }
  }

  fun pushIndent(level: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushIndent.call(self._handle, listOf(level), null)
    }
  }

  fun pushItalics() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushItalics.call(self._handle, emptyList(), null)
    }
  }

  fun pushList(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushList.call(self._handle, listOf(type), null)
    }
  }

  fun pushMeta(data: Variant) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushMeta.call(self._handle, listOf(data), null)
    }
  }

  fun pushMono() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushMono.call(self._handle, emptyList(), null)
    }
  }

  fun pushNormal() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushNormal.call(self._handle, emptyList(), null)
    }
  }

  fun pushStrikethrough() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushStrikethrough.call(self._handle, emptyList(), null)
    }
  }

  fun pushTable(columns: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushTable.call(self._handle, listOf(columns), null)
    }
  }

  fun pushUnderline() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.pushUnderline.call(self._handle, emptyList(), null)
    }
  }

  fun removeLine(line: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.removeLine.call(self._handle, listOf(line), _retPtr)
      _ret.value
    }
  }

  fun scrollToLine(line: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.scrollToLine.call(self._handle, listOf(line), null)
    }
  }

  fun setBbcode(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBbcode.call(self._handle, listOf(text), null)
    }
  }

  fun setEffects(effects: VariantArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEffects.call(self._handle, listOf(effects), null)
    }
  }

  fun setMetaUnderline(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMetaUnderline.call(self._handle, listOf(enable), null)
    }
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOverrideSelectedFontColor.call(self._handle, listOf(override), null)
    }
  }

  fun setPercentVisible(percentVisible: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPercentVisible.call(self._handle, listOf(percentVisible), null)
    }
  }

  fun setScrollActive(active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollActive.call(self._handle, listOf(active), null)
    }
  }

  fun setScrollFollow(follow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollFollow.call(self._handle, listOf(follow), null)
    }
  }

  fun setSelectionEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelectionEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setTabSize(spaces: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTabSize.call(self._handle, listOf(spaces), null)
    }
  }

  fun setTableColumnExpand(
    column: Int,
    expand: Boolean,
    ratio: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(expand)
      _args.add(ratio)
      __method_bind.setTableColumnExpand.call(self._handle, _args, null)
    }
  }

  fun setText(text: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setText.call(self._handle, listOf(text), null)
    }
  }

  fun setUseBbcode(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseBbcode.call(self._handle, listOf(enable), null)
    }
  }

  fun setVisibleCharacters(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisibleCharacters.call(self._handle, listOf(amount), null)
    }
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
