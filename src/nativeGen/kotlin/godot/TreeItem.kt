// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
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

open class TreeItem(
  _handle: COpaquePointer
) : Object(_handle) {
  var collapsed: Boolean
    get() {
       return isCollapsed() 
    }
    set(value) {
      setCollapsed(value)
    }

  var customMinimumHeight: Int
    get() {
       return getCustomMinimumHeight() 
    }
    set(value) {
      setCustomMinimumHeight(value)
    }

  var disableFolding: Boolean
    get() {
       return isFoldingDisabled() 
    }
    set(value) {
      setDisableFolding(value)
    }

  fun addButton(
    column: Int,
    button: Texture,
    buttonIdx: Int = -1,
    disabled: Boolean = false,
    tooltip: String = ""
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(button))
    _args.add(Variant.fromAny(buttonIdx))
    _args.add(Variant.fromAny(disabled))
    _args.add(Variant.fromAny(tooltip))
    __method_bind.addButton.call(this._handle, _args)
  }

  fun callRecursive(method: String, vararg varargs: Any?): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.callRecursive.call(this._handle, _args)
    return _ret
  }

  fun clearCustomBgColor(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.clearCustomBgColor.call(this._handle, listOf(_arg))
  }

  fun clearCustomColor(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.clearCustomColor.call(this._handle, listOf(_arg))
  }

  fun deselect(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.deselect.call(this._handle, listOf(_arg))
  }

  fun eraseButton(column: Int, buttonIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(buttonIdx))
    __method_bind.eraseButton.call(this._handle, _args)
  }

  fun getButton(column: Int, buttonIdx: Int): Texture {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(buttonIdx))
    val _ret = __method_bind.getButton.call(this._handle, _args)
    return _ret.asObject(::Texture)!!
  }

  fun getButtonCount(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getButtonCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getButtonTooltip(column: Int, buttonIdx: Int): String {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(buttonIdx))
    val _ret = __method_bind.getButtonTooltip.call(this._handle, _args)
    return _ret.asString()
  }

  fun getCellMode(column: Int): TreeCellMode {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getCellMode.call(this._handle, listOf(_arg))
    return TreeItem.TreeCellMode.from(_ret.asInt())
  }

  fun getChildren(): TreeItem {
    val _ret = __method_bind.getChildren.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getCustomBgColor(column: Int): Color {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getCustomBgColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getCustomColor(column: Int): Color {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getCustomColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getCustomMinimumHeight(): Int {
    val _ret = __method_bind.getCustomMinimumHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getExpandRight(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getExpandRight.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getIcon(column: Int): Texture {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getIcon.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun getIconMaxWidth(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getIconMaxWidth.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getIconModulate(column: Int): Color {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getIconModulate.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getIconRegion(column: Int): Rect2 {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getIconRegion.call(this._handle, listOf(_arg))
    return _ret.asRect2()
  }

  fun getMetadata(column: Int): Variant {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getMetadata.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getNext(): TreeItem {
    val _ret = __method_bind.getNext.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getNextVisible(wrap: Boolean = false): TreeItem {
    val _arg = Variant.new(wrap)
    val _ret = __method_bind.getNextVisible.call(this._handle, listOf(_arg))
    return _ret.asObject(::TreeItem)!!
  }

  fun getParent(): TreeItem {
    val _ret = __method_bind.getParent.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getPrev(): TreeItem {
    val _ret = __method_bind.getPrev.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getPrevVisible(wrap: Boolean = false): TreeItem {
    val _arg = Variant.new(wrap)
    val _ret = __method_bind.getPrevVisible.call(this._handle, listOf(_arg))
    return _ret.asObject(::TreeItem)!!
  }

  fun getRange(column: Int): Float {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getRange.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getRangeConfig(column: Int): Dictionary {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getRangeConfig.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun getText(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getText.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getTextAlign(column: Int): TextAlign {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getTextAlign.call(this._handle, listOf(_arg))
    return TreeItem.TextAlign.from(_ret.asInt())
  }

  fun getTooltip(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getTooltip.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun isButtonDisabled(column: Int, buttonIdx: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(buttonIdx))
    val _ret = __method_bind.isButtonDisabled.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isChecked(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isChecked.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isCollapsed(): Boolean {
    val _ret = __method_bind.isCollapsed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCustomSetAsButton(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isCustomSetAsButton.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isEditable(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isEditable.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isFoldingDisabled(): Boolean {
    val _ret = __method_bind.isFoldingDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelectable(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isSelectable.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isSelected(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isSelected.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun moveToBottom() {
    __method_bind.moveToBottom.call(this._handle)
  }

  fun moveToTop() {
    __method_bind.moveToTop.call(this._handle)
  }

  fun removeChild(child: Object) {
    val _arg = Variant.new(child)
    __method_bind.removeChild.call(this._handle, listOf(_arg))
  }

  fun select(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.select.call(this._handle, listOf(_arg))
  }

  fun setButton(
    column: Int,
    buttonIdx: Int,
    button: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(buttonIdx))
    _args.add(Variant.fromAny(button))
    __method_bind.setButton.call(this._handle, _args)
  }

  fun setButtonDisabled(
    column: Int,
    buttonIdx: Int,
    disabled: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(buttonIdx))
    _args.add(Variant.fromAny(disabled))
    __method_bind.setButtonDisabled.call(this._handle, _args)
  }

  fun setCellMode(column: Int, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(mode))
    __method_bind.setCellMode.call(this._handle, _args)
  }

  fun setChecked(column: Int, checked: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(checked))
    __method_bind.setChecked.call(this._handle, _args)
  }

  fun setCollapsed(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCollapsed.call(this._handle, listOf(_arg))
  }

  fun setCustomAsButton(column: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(enable))
    __method_bind.setCustomAsButton.call(this._handle, _args)
  }

  fun setCustomBgColor(
    column: Int,
    color: Color,
    justOutline: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(justOutline))
    __method_bind.setCustomBgColor.call(this._handle, _args)
  }

  fun setCustomColor(column: Int, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(color))
    __method_bind.setCustomColor.call(this._handle, _args)
  }

  fun setCustomDraw(
    column: Int,
    `object`: Object,
    callback: String
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(callback))
    __method_bind.setCustomDraw.call(this._handle, _args)
  }

  fun setCustomMinimumHeight(height: Int) {
    val _arg = Variant.new(height)
    __method_bind.setCustomMinimumHeight.call(this._handle, listOf(_arg))
  }

  fun setDisableFolding(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisableFolding.call(this._handle, listOf(_arg))
  }

  fun setEditable(column: Int, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(enabled))
    __method_bind.setEditable.call(this._handle, _args)
  }

  fun setExpandRight(column: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(enable))
    __method_bind.setExpandRight.call(this._handle, _args)
  }

  fun setIcon(column: Int, texture: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(texture))
    __method_bind.setIcon.call(this._handle, _args)
  }

  fun setIconMaxWidth(column: Int, width: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(width))
    __method_bind.setIconMaxWidth.call(this._handle, _args)
  }

  fun setIconModulate(column: Int, modulate: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(modulate))
    __method_bind.setIconModulate.call(this._handle, _args)
  }

  fun setIconRegion(column: Int, region: Rect2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(region))
    __method_bind.setIconRegion.call(this._handle, _args)
  }

  fun setMetadata(column: Int, meta: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(meta))
    __method_bind.setMetadata.call(this._handle, _args)
  }

  fun setRange(column: Int, value: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(value))
    __method_bind.setRange.call(this._handle, _args)
  }

  fun setRangeConfig(
    column: Int,
    min: Float,
    max: Float,
    step: Float,
    expr: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(min))
    _args.add(Variant.fromAny(max))
    _args.add(Variant.fromAny(step))
    _args.add(Variant.fromAny(expr))
    __method_bind.setRangeConfig.call(this._handle, _args)
  }

  fun setSelectable(column: Int, selectable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(selectable))
    __method_bind.setSelectable.call(this._handle, _args)
  }

  fun setText(column: Int, text: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(text))
    __method_bind.setText.call(this._handle, _args)
  }

  fun setTextAlign(column: Int, textAlign: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(textAlign))
    __method_bind.setTextAlign.call(this._handle, _args)
  }

  fun setTooltip(column: Int, tooltip: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(column))
    _args.add(Variant.fromAny(tooltip))
    __method_bind.setTooltip.call(this._handle, _args)
  }

  enum class TreeCellMode(
    val value: Int
  ) {
    CELL_MODE_STRING(0),

    CELL_MODE_CHECK(1),

    CELL_MODE_RANGE(2),

    CELL_MODE_ICON(3),

    CELL_MODE_CUSTOM(4);

    companion object {
      fun from(value: Int): TreeCellMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TextAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);

    companion object {
      fun from(value: Int): TextAlign {
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

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val CELL_MODE_CHECK: Int = 1

    val CELL_MODE_CUSTOM: Int = 4

    val CELL_MODE_ICON: Int = 3

    val CELL_MODE_RANGE: Int = 2

    val CELL_MODE_STRING: Int = 0

    /**
     * Container for method_bind pointers for TreeItem
     */
    private object __method_bind {
      val addButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "add_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_button" }
        }
      val callRecursive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "call_recursive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call_recursive" }
        }
      val clearCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "clear_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_custom_bg_color" }
        }
      val clearCustomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "clear_custom_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_custom_color" }
        }
      val deselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "deselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method deselect" }
        }
      val eraseButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "erase_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_button" }
        }
      val getButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button" }
        }
      val getButtonCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_button_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_count" }
        }
      val getButtonTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_button_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_button_tooltip" }
        }
      val getCellMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_cell_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_mode" }
        }
      val getChildren: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_children".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_children" }
        }
      val getCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_bg_color" }
        }
      val getCustomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_custom_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_color" }
        }
      val getCustomMinimumHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_custom_minimum_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_minimum_height" }
        }
      val getExpandRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_expand_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_expand_right" }
        }
      val getIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon" }
        }
      val getIconMaxWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_icon_max_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_max_width" }
        }
      val getIconModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_modulate" }
        }
      val getIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_region" }
        }
      val getMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_metadata" }
        }
      val getNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next" }
        }
      val getNextVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_next_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next_visible" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent" }
        }
      val getPrev: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_prev".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_prev" }
        }
      val getPrevVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_prev_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_prev_visible" }
        }
      val getRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_range" }
        }
      val getRangeConfig: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_range_config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_range_config" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getTextAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_text_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text_align" }
        }
      val getTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "get_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tooltip" }
        }
      val isButtonDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_button_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_button_disabled" }
        }
      val isChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_checked" }
        }
      val isCollapsed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_collapsed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collapsed" }
        }
      val isCustomSetAsButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_custom_set_as_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_custom_set_as_button" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editable" }
        }
      val isFoldingDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_folding_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_folding_disabled" }
        }
      val isSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selectable" }
        }
      val isSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "is_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selected" }
        }
      val moveToBottom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "move_to_bottom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_to_bottom" }
        }
      val moveToTop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "move_to_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_to_top" }
        }
      val removeChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "remove_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_child" }
        }
      val select: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method select" }
        }
      val setButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button" }
        }
      val setButtonDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_button_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_button_disabled" }
        }
      val setCellMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_cell_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_mode" }
        }
      val setChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_checked" }
        }
      val setCollapsed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_collapsed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collapsed" }
        }
      val setCustomAsButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_custom_as_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_as_button" }
        }
      val setCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_custom_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_bg_color" }
        }
      val setCustomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_custom_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_color" }
        }
      val setCustomDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_custom_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_draw" }
        }
      val setCustomMinimumHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_custom_minimum_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_minimum_height" }
        }
      val setDisableFolding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_disable_folding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_folding" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_editable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editable" }
        }
      val setExpandRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_expand_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_expand_right" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon" }
        }
      val setIconMaxWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_icon_max_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_max_width" }
        }
      val setIconModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_icon_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_modulate" }
        }
      val setIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_icon_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon_region" }
        }
      val setMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_metadata" }
        }
      val setRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_range" }
        }
      val setRangeConfig: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_range_config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_range_config" }
        }
      val setSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_selectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selectable" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setTextAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_text_align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text_align" }
        }
      val setTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "set_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tooltip" }
        }}
  }
}
