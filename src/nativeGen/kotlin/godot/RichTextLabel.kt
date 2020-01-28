// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.GDError
import godot.core.Godot
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

open class RichTextLabel(
  _handle: COpaquePointer
) : Control(_handle) {
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

  fun addImage(image: Texture) {
    val _arg = Variant.new(image)
    __method_bind.addImage.call(this._handle, _arg, 1)
  }

  fun addText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.addText.call(this._handle, _arg, 1)
  }

  fun appendBbcode(bbcode: String): GDError {
    val _arg = Variant.new(bbcode)
    val _ret = __method_bind.appendBbcode.call(this._handle, _arg, 1)
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
    return _ret.asObject(::VScrollBar)!!
  }

  fun getVisibleCharacters(): Int {
    val _ret = __method_bind.getVisibleCharacters.call(this._handle)
    return _ret.asInt()
  }

  fun getVisibleLineCount(): Int {
    val _ret = __method_bind.getVisibleLineCount.call(this._handle)
    return _ret.asInt()
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
    val _arg = Variant.new(bbcode)
    val _ret = __method_bind.parseBbcode.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun pop() {
    __method_bind.pop.call(this._handle)
  }

  fun pushAlign(align: Int) {
    val _arg = Variant.new(align)
    __method_bind.pushAlign.call(this._handle, _arg, 1)
  }

  fun pushCell() {
    __method_bind.pushCell.call(this._handle)
  }

  fun pushColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.pushColor.call(this._handle, _arg, 1)
  }

  fun pushFont(font: Font) {
    val _arg = Variant.new(font)
    __method_bind.pushFont.call(this._handle, _arg, 1)
  }

  fun pushIndent(level: Int) {
    val _arg = Variant.new(level)
    __method_bind.pushIndent.call(this._handle, _arg, 1)
  }

  fun pushList(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.pushList.call(this._handle, _arg, 1)
  }

  fun pushMeta(data: Variant) {
    val _arg = Variant.new(data)
    __method_bind.pushMeta.call(this._handle, _arg, 1)
  }

  fun pushStrikethrough() {
    __method_bind.pushStrikethrough.call(this._handle)
  }

  fun pushTable(columns: Int) {
    val _arg = Variant.new(columns)
    __method_bind.pushTable.call(this._handle, _arg, 1)
  }

  fun pushUnderline() {
    __method_bind.pushUnderline.call(this._handle)
  }

  fun removeLine(line: Int): Boolean {
    val _arg = Variant.new(line)
    val _ret = __method_bind.removeLine.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun scrollToLine(line: Int) {
    val _arg = Variant.new(line)
    __method_bind.scrollToLine.call(this._handle, _arg, 1)
  }

  fun setBbcode(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setBbcode.call(this._handle, _arg, 1)
  }

  fun setMetaUnderline(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setMetaUnderline.call(this._handle, _arg, 1)
  }

  fun setOverrideSelectedFontColor(override: Boolean) {
    val _arg = Variant.new(override)
    __method_bind.setOverrideSelectedFontColor.call(this._handle, _arg, 1)
  }

  fun setPercentVisible(percentVisible: Float) {
    val _arg = Variant.new(percentVisible)
    __method_bind.setPercentVisible.call(this._handle, _arg, 1)
  }

  fun setScrollActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setScrollActive.call(this._handle, _arg, 1)
  }

  fun setScrollFollow(follow: Boolean) {
    val _arg = Variant.new(follow)
    __method_bind.setScrollFollow.call(this._handle, _arg, 1)
  }

  fun setSelectionEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSelectionEnabled.call(this._handle, _arg, 1)
  }

  fun setTabSize(spaces: Int) {
    val _arg = Variant.new(spaces)
    __method_bind.setTabSize.call(this._handle, _arg, 1)
  }

  fun setTableColumnExpand(
    column: Int,
    expand: Boolean,
    ratio: Int
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(expand)
    _args.append(ratio)
    __method_bind.setTableColumnExpand.call(this._handle, _args.toVariant(), 3)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, _arg, 1)
  }

  fun setUseBbcode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseBbcode.call(this._handle, _arg, 1)
  }

  fun setVisibleCharacters(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setVisibleCharacters.call(this._handle, _arg, 1)
  }

  enum class Align(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

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
    LIST_NUMBERS(0),

    LIST_LETTERS(1),

    LIST_DOTS(2);

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
      requireNotNull(fnPtr) { "No instance found for RichTextLabel" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RichTextLabel(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RichTextLabel = RichTextLabel(ptr)
    /**
     * Container for method_bind pointers for RichTextLabel
     */
    private object __method_bind {
      val addImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "addImage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addImage" }
        }
      val addText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "addText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addText" }
        }
      val appendBbcode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "appendBbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method appendBbcode" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getBbcode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getBbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBbcode" }
        }
      val getContentHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getContentHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getContentHeight" }
        }
      val getLineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getLineCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLineCount" }
        }
      val getPercentVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getPercentVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPercentVisible" }
        }
      val getTabSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getTabSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTabSize" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getText" }
        }
      val getTotalCharacterCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getTotalCharacterCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTotalCharacterCount" }
        }
      val getVScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getVScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVScroll" }
        }
      val getVisibleCharacters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getVisibleCharacters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibleCharacters" }
        }
      val getVisibleLineCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "getVisibleLineCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibleLineCount" }
        }
      val isMetaUnderlined: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "isMetaUnderlined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isMetaUnderlined" }
        }
      val isOverridingSelectedFontColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "isOverridingSelectedFontColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOverridingSelectedFontColor" }
        }
      val isScrollActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "isScrollActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isScrollActive" }
        }
      val isScrollFollowing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "isScrollFollowing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isScrollFollowing" }
        }
      val isSelectionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "isSelectionEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSelectionEnabled" }
        }
      val isUsingBbcode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "isUsingBbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingBbcode" }
        }
      val newline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "newline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method newline" }
        }
      val parseBbcode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "parseBbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method parseBbcode" }
        }
      val pop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pop" }
        }
      val pushAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushAlign" }
        }
      val pushCell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushCell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushCell" }
        }
      val pushColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushColor" }
        }
      val pushFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushFont".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushFont" }
        }
      val pushIndent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushIndent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushIndent" }
        }
      val pushList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushList" }
        }
      val pushMeta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushMeta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushMeta" }
        }
      val pushStrikethrough: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushStrikethrough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushStrikethrough" }
        }
      val pushTable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushTable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushTable" }
        }
      val pushUnderline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "pushUnderline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pushUnderline" }
        }
      val removeLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "removeLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeLine" }
        }
      val scrollToLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "scrollToLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scrollToLine" }
        }
      val setBbcode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setBbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBbcode" }
        }
      val setMetaUnderline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setMetaUnderline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMetaUnderline" }
        }
      val setOverrideSelectedFontColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setOverrideSelectedFontColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOverrideSelectedFontColor" }
        }
      val setPercentVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setPercentVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPercentVisible" }
        }
      val setScrollActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setScrollActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScrollActive" }
        }
      val setScrollFollow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setScrollFollow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScrollFollow" }
        }
      val setSelectionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setSelectionEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelectionEnabled" }
        }
      val setTabSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setTabSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTabSize" }
        }
      val setTableColumnExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setTableColumnExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTableColumnExpand" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setText" }
        }
      val setUseBbcode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setUseBbcode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseBbcode" }
        }
      val setVisibleCharacters: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RichTextLabel".cstr.ptr,
            "setVisibleCharacters".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVisibleCharacters" }
        }}
  }
}
