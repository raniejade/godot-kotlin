// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Rect2
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
    buttonIdx: Int,
    disabled: Boolean,
    tooltip: String
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(button)
    _args.append(buttonIdx)
    _args.append(disabled)
    _args.append(tooltip)
    __method_bind.addButton.call(this._handle, _args.toVariant(), 5)
  }

  fun clearCustomBgColor(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.clearCustomBgColor.call(this._handle, _arg, 1)
  }

  fun clearCustomColor(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.clearCustomColor.call(this._handle, _arg, 1)
  }

  fun deselect(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.deselect.call(this._handle, _arg, 1)
  }

  fun eraseButton(column: Int, buttonIdx: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    __method_bind.eraseButton.call(this._handle, _args.toVariant(), 2)
  }

  fun getButton(column: Int, buttonIdx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    val _ret = __method_bind.getButton.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Texture)!!
  }

  fun getButtonCount(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getButtonCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getCellMode(column: Int): TreeCellMode {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getCellMode.call(this._handle, _arg, 1)
    return TreeItem.TreeCellMode.from(_ret.asInt())
  }

  fun getChildren(): TreeItem {
    val _ret = __method_bind.getChildren.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getCustomBgColor(column: Int): Color {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getCustomBgColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getCustomMinimumHeight(): Int {
    val _ret = __method_bind.getCustomMinimumHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getExpandRight(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getExpandRight.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getIcon(column: Int): Texture {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getIcon.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getIconMaxWidth(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getIconMaxWidth.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getIconRegion(column: Int): Rect2 {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getIconRegion.call(this._handle, _arg, 1)
    return _ret.asRect2()
  }

  fun getMetadata(column: Int): Variant {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getMetadata.call(this._handle, _arg, 1)
    return _ret
  }

  fun getNext(): TreeItem {
    val _ret = __method_bind.getNext.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getNextVisible(wrap: Boolean): TreeItem {
    val _arg = Variant.new(wrap)
    val _ret = __method_bind.getNextVisible.call(this._handle, _arg, 1)
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

  fun getPrevVisible(wrap: Boolean): TreeItem {
    val _arg = Variant.new(wrap)
    val _ret = __method_bind.getPrevVisible.call(this._handle, _arg, 1)
    return _ret.asObject(::TreeItem)!!
  }

  fun getRange(column: Int): Float {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getRange.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getRangeConfig(column: Int): Dictionary {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getRangeConfig.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getText(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getText.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getTextAlign(column: Int): TextAlign {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getTextAlign.call(this._handle, _arg, 1)
    return TreeItem.TextAlign.from(_ret.asInt())
  }

  fun getTooltip(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getTooltip.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun isButtonDisabled(column: Int, buttonIdx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    val _ret = __method_bind.isButtonDisabled.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun isChecked(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isChecked.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isCollapsed(): Boolean {
    val _ret = __method_bind.isCollapsed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCustomSetAsButton(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isCustomSetAsButton.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isEditable(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isEditable.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isFoldingDisabled(): Boolean {
    val _ret = __method_bind.isFoldingDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelectable(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isSelectable.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isSelected(column: Int): Boolean {
    val _arg = Variant.new(column)
    val _ret = __method_bind.isSelected.call(this._handle, _arg, 1)
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
    __method_bind.removeChild.call(this._handle, _arg, 1)
  }

  fun select(column: Int) {
    val _arg = Variant.new(column)
    __method_bind.select.call(this._handle, _arg, 1)
  }

  fun setButton(
    column: Int,
    buttonIdx: Int,
    button: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(buttonIdx)
    _args.append(button)
    __method_bind.setButton.call(this._handle, _args.toVariant(), 3)
  }

  fun setCellMode(column: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(mode)
    __method_bind.setCellMode.call(this._handle, _args.toVariant(), 2)
  }

  fun setChecked(column: Int, checked: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(checked)
    __method_bind.setChecked.call(this._handle, _args.toVariant(), 2)
  }

  fun setCollapsed(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCollapsed.call(this._handle, _arg, 1)
  }

  fun setCustomAsButton(column: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(enable)
    __method_bind.setCustomAsButton.call(this._handle, _args.toVariant(), 2)
  }

  fun setCustomBgColor(
    column: Int,
    color: Color,
    justOutline: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(color)
    _args.append(justOutline)
    __method_bind.setCustomBgColor.call(this._handle, _args.toVariant(), 3)
  }

  fun setCustomColor(column: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(color)
    __method_bind.setCustomColor.call(this._handle, _args.toVariant(), 2)
  }

  fun setCustomDraw(
    column: Int,
    `object`: Object,
    callback: String
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(`object`)
    _args.append(callback)
    __method_bind.setCustomDraw.call(this._handle, _args.toVariant(), 3)
  }

  fun setCustomMinimumHeight(height: Int) {
    val _arg = Variant.new(height)
    __method_bind.setCustomMinimumHeight.call(this._handle, _arg, 1)
  }

  fun setDisableFolding(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisableFolding.call(this._handle, _arg, 1)
  }

  fun setEditable(column: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(enabled)
    __method_bind.setEditable.call(this._handle, _args.toVariant(), 2)
  }

  fun setExpandRight(column: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(enable)
    __method_bind.setExpandRight.call(this._handle, _args.toVariant(), 2)
  }

  fun setIcon(column: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(texture)
    __method_bind.setIcon.call(this._handle, _args.toVariant(), 2)
  }

  fun setIconMaxWidth(column: Int, width: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(width)
    __method_bind.setIconMaxWidth.call(this._handle, _args.toVariant(), 2)
  }

  fun setIconRegion(column: Int, region: Rect2) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(region)
    __method_bind.setIconRegion.call(this._handle, _args.toVariant(), 2)
  }

  fun setMetadata(column: Int, meta: Variant) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(meta)
    __method_bind.setMetadata.call(this._handle, _args.toVariant(), 2)
  }

  fun setRange(column: Int, value: Float) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(value)
    __method_bind.setRange.call(this._handle, _args.toVariant(), 2)
  }

  fun setRangeConfig(
    column: Int,
    min: Float,
    max: Float,
    step: Float,
    expr: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(min)
    _args.append(max)
    _args.append(step)
    _args.append(expr)
    __method_bind.setRangeConfig.call(this._handle, _args.toVariant(), 5)
  }

  fun setSelectable(column: Int, selectable: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(selectable)
    __method_bind.setSelectable.call(this._handle, _args.toVariant(), 2)
  }

  fun setText(column: Int, text: String) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(text)
    __method_bind.setText.call(this._handle, _args.toVariant(), 2)
  }

  fun setTextAlign(column: Int, textAlign: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(textAlign)
    __method_bind.setTextAlign.call(this._handle, _args.toVariant(), 2)
  }

  fun setTooltip(column: Int, tooltip: String) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(tooltip)
    __method_bind.setTooltip.call(this._handle, _args.toVariant(), 2)
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
            "addButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addButton" }
        }
      val clearCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "clearCustomBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearCustomBgColor" }
        }
      val clearCustomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "clearCustomColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearCustomColor" }
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
            "eraseButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eraseButton" }
        }
      val getButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getButton" }
        }
      val getButtonCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getButtonCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getButtonCount" }
        }
      val getCellMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getCellMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellMode" }
        }
      val getChildren: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getChildren".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getChildren" }
        }
      val getCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getCustomBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomBgColor" }
        }
      val getCustomMinimumHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getCustomMinimumHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomMinimumHeight" }
        }
      val getExpandRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getExpandRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExpandRight" }
        }
      val getIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIcon" }
        }
      val getIconMaxWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getIconMaxWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIconMaxWidth" }
        }
      val getIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getIconRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIconRegion" }
        }
      val getMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMetadata" }
        }
      val getNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getNext".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNext" }
        }
      val getNextVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getNextVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNextVisible" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParent" }
        }
      val getPrev: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getPrev".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPrev" }
        }
      val getPrevVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getPrevVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPrevVisible" }
        }
      val getRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRange" }
        }
      val getRangeConfig: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getRangeConfig".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRangeConfig" }
        }
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getText" }
        }
      val getTextAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getTextAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextAlign" }
        }
      val getTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "getTooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTooltip" }
        }
      val isButtonDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isButtonDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isButtonDisabled" }
        }
      val isChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isChecked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isChecked" }
        }
      val isCollapsed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isCollapsed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCollapsed" }
        }
      val isCustomSetAsButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isCustomSetAsButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCustomSetAsButton" }
        }
      val isEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isEditable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditable" }
        }
      val isFoldingDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isFoldingDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFoldingDisabled" }
        }
      val isSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isSelectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSelectable" }
        }
      val isSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "isSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSelected" }
        }
      val moveToBottom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "moveToBottom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveToBottom" }
        }
      val moveToTop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "moveToTop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveToTop" }
        }
      val removeChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "removeChild".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeChild" }
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
            "setButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setButton" }
        }
      val setCellMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setCellMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellMode" }
        }
      val setChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setChecked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setChecked" }
        }
      val setCollapsed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setCollapsed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollapsed" }
        }
      val setCustomAsButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setCustomAsButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomAsButton" }
        }
      val setCustomBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setCustomBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomBgColor" }
        }
      val setCustomColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setCustomColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomColor" }
        }
      val setCustomDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setCustomDraw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomDraw" }
        }
      val setCustomMinimumHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setCustomMinimumHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomMinimumHeight" }
        }
      val setDisableFolding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setDisableFolding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisableFolding" }
        }
      val setEditable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setEditable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditable" }
        }
      val setExpandRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setExpandRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExpandRight" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIcon" }
        }
      val setIconMaxWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setIconMaxWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIconMaxWidth" }
        }
      val setIconRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setIconRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIconRegion" }
        }
      val setMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setMetadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMetadata" }
        }
      val setRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRange" }
        }
      val setRangeConfig: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setRangeConfig".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRangeConfig" }
        }
      val setSelectable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setSelectable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelectable" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setText" }
        }
      val setTextAlign: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setTextAlign".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextAlign" }
        }
      val setTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
            "setTooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTooltip" }
        }}
  }
}
