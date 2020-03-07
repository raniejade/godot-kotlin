// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

open class TreeItem(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addButton(
    column: Int,
    button: Texture,
    buttonIdx: Int = -1,
    disabled: Boolean = false,
    tooltip: String = ""
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(button)
      _args.add(buttonIdx)
      _args.add(disabled)
      _args.add(tooltip)
      __method_bind.addButton.call(self._handle, _args, null)
    }
  }

  fun callRecursive(method: String, vararg varargs: Any?): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.callRecursive.slowcall(this._handle, _args)
    return _ret
  }

  fun clearCustomBgColor(column: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearCustomBgColor.call(self._handle, listOf(column), null)
    }
  }

  fun clearCustomColor(column: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearCustomColor.call(self._handle, listOf(column), null)
    }
  }

  fun deselect(column: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.deselect.call(self._handle, listOf(column), null)
    }
  }

  fun eraseButton(column: Int, buttonIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(buttonIdx)
      __method_bind.eraseButton.call(self._handle, _args, null)
    }
  }

  fun getButton(column: Int, buttonIdx: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(buttonIdx)
      __method_bind.getButton.call(self._handle, _args, _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getButtonCount(column: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getButtonCount.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun getButtonTooltip(column: Int, buttonIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(buttonIdx)
      __method_bind.getButtonTooltip.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCellMode(column: Int): TreeCellMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCellMode.call(self._handle, listOf(column), _retPtr)
      TreeItem.TreeCellMode.from(_ret.value)
    }
  }

  fun getChildren(): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getChildren.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getCustomBgColor(column: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getCustomBgColor.call(self._handle, listOf(column), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCustomColor(column: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getCustomColor.call(self._handle, listOf(column), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCustomMinimumHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCustomMinimumHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getExpandRight(column: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExpandRight.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun getIcon(column: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getIcon.call(self._handle, listOf(column), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getIconMaxWidth(column: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIconMaxWidth.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun getIconModulate(column: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getIconModulate.call(self._handle, listOf(column), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getIconRegion(column: Int): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getIconRegion.call(self._handle, listOf(column), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMetadata(column: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getMetadata.call(self._handle, listOf(column), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNext(): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNext.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getNextVisible(wrap: Boolean = false): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNextVisible.call(self._handle, listOf(wrap), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getParent(): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParent.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getPrev(): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPrev.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getPrevVisible(wrap: Boolean = false): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPrevVisible.call(self._handle, listOf(wrap), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getRange(column: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRange.call(self._handle, listOf(column), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRangeConfig(column: Int): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getRangeConfig.call(self._handle, listOf(column), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getText(column: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getText.call(self._handle, listOf(column), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getTextAlign(column: Int): TextAlign {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextAlign.call(self._handle, listOf(column), _retPtr)
      TreeItem.TextAlign.from(_ret.value)
    }
  }

  fun getTooltip(column: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTooltip.call(self._handle, listOf(column), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isButtonDisabled(column: Int, buttonIdx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(buttonIdx)
      __method_bind.isButtonDisabled.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isChecked(column: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isChecked.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun isCollapsed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCollapsed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCustomSetAsButton(column: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCustomSetAsButton.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun isEditable(column: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditable.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun isFoldingDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFoldingDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSelectable(column: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelectable.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun isSelected(column: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelected.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun moveToBottom() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.moveToBottom.call(self._handle, emptyList(), null)
    }
  }

  fun moveToTop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.moveToTop.call(self._handle, emptyList(), null)
    }
  }

  fun removeChild(child: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeChild.call(self._handle, listOf(child), null)
    }
  }

  fun select(column: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.select.call(self._handle, listOf(column), null)
    }
  }

  fun setButton(
    column: Int,
    buttonIdx: Int,
    button: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(buttonIdx)
      _args.add(button)
      __method_bind.setButton.call(self._handle, _args, null)
    }
  }

  fun setButtonDisabled(
    column: Int,
    buttonIdx: Int,
    disabled: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(buttonIdx)
      _args.add(disabled)
      __method_bind.setButtonDisabled.call(self._handle, _args, null)
    }
  }

  fun setCellMode(column: Int, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(mode)
      __method_bind.setCellMode.call(self._handle, _args, null)
    }
  }

  fun setChecked(column: Int, checked: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(checked)
      __method_bind.setChecked.call(self._handle, _args, null)
    }
  }

  fun setCollapsed(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollapsed.call(self._handle, listOf(enable), null)
    }
  }

  fun setCustomAsButton(column: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(enable)
      __method_bind.setCustomAsButton.call(self._handle, _args, null)
    }
  }

  fun setCustomBgColor(
    column: Int,
    color: Color,
    justOutline: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(color)
      _args.add(justOutline)
      __method_bind.setCustomBgColor.call(self._handle, _args, null)
    }
  }

  fun setCustomColor(column: Int, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(color)
      __method_bind.setCustomColor.call(self._handle, _args, null)
    }
  }

  fun setCustomDraw(
    column: Int,
    `object`: Object,
    callback: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(`object`)
      _args.add(callback)
      __method_bind.setCustomDraw.call(self._handle, _args, null)
    }
  }

  fun setCustomMinimumHeight(height: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomMinimumHeight.call(self._handle, listOf(height), null)
    }
  }

  fun setDisableFolding(disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisableFolding.call(self._handle, listOf(disable), null)
    }
  }

  fun setEditable(column: Int, enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(enabled)
      __method_bind.setEditable.call(self._handle, _args, null)
    }
  }

  fun setExpandRight(column: Int, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(enable)
      __method_bind.setExpandRight.call(self._handle, _args, null)
    }
  }

  fun setIcon(column: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(texture)
      __method_bind.setIcon.call(self._handle, _args, null)
    }
  }

  fun setIconMaxWidth(column: Int, width: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(width)
      __method_bind.setIconMaxWidth.call(self._handle, _args, null)
    }
  }

  fun setIconModulate(column: Int, modulate: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(modulate)
      __method_bind.setIconModulate.call(self._handle, _args, null)
    }
  }

  fun setIconRegion(column: Int, region: Rect2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(region)
      __method_bind.setIconRegion.call(self._handle, _args, null)
    }
  }

  fun setMetadata(column: Int, meta: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(meta)
      __method_bind.setMetadata.call(self._handle, _args, null)
    }
  }

  fun setRange(column: Int, value: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(value)
      __method_bind.setRange.call(self._handle, _args, null)
    }
  }

  fun setRangeConfig(
    column: Int,
    min: Float,
    max: Float,
    step: Float,
    expr: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(min)
      _args.add(max)
      _args.add(step)
      _args.add(expr)
      __method_bind.setRangeConfig.call(self._handle, _args, null)
    }
  }

  fun setSelectable(column: Int, selectable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(selectable)
      __method_bind.setSelectable.call(self._handle, _args, null)
    }
  }

  fun setText(column: Int, text: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(text)
      __method_bind.setText.call(self._handle, _args, null)
    }
  }

  fun setTextAlign(column: Int, textAlign: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(textAlign)
      __method_bind.setTextAlign.call(self._handle, _args, null)
    }
  }

  fun setTooltip(column: Int, tooltip: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(tooltip)
      __method_bind.setTooltip.call(self._handle, _args, null)
    }
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
    /**
     * Container for method_bind pointers for TreeItem
     */
    private object __method_bind {
      val addButton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "add_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_button" }
            }
          }

      val callRecursive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "call_recursive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_recursive" }
            }
          }

      val clearCustomBgColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "clear_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_custom_bg_color" }
            }
          }

      val clearCustomColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "clear_custom_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_custom_color" }
            }
          }

      val deselect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "deselect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method deselect" }
            }
          }

      val eraseButton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "erase_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_button" }
            }
          }

      val getButton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button" }
            }
          }

      val getButtonCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_button_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_count" }
            }
          }

      val getButtonTooltip: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_button_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_tooltip" }
            }
          }

      val getCellMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_cell_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_mode" }
            }
          }

      val getChildren: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_children".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_children" }
            }
          }

      val getCustomBgColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_bg_color" }
            }
          }

      val getCustomColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_custom_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_color" }
            }
          }

      val getCustomMinimumHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_custom_minimum_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_minimum_height" }
            }
          }

      val getExpandRight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_expand_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_right" }
            }
          }

      val getIcon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon" }
            }
          }

      val getIconMaxWidth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_icon_max_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_max_width" }
            }
          }

      val getIconModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_icon_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_modulate" }
            }
          }

      val getIconRegion: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_icon_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_region" }
            }
          }

      val getMetadata: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_metadata" }
            }
          }

      val getNext: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next" }
            }
          }

      val getNextVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_next_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_next_visible" }
            }
          }

      val getParent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent" }
            }
          }

      val getPrev: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_prev".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_prev" }
            }
          }

      val getPrevVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_prev_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_prev_visible" }
            }
          }

      val getRange: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range" }
            }
          }

      val getRangeConfig: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_range_config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_range_config" }
            }
          }

      val getText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val getTextAlign: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_text_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text_align" }
            }
          }

      val getTooltip: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "get_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tooltip" }
            }
          }

      val isButtonDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_button_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_button_disabled" }
            }
          }

      val isChecked: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_checked" }
            }
          }

      val isCollapsed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collapsed" }
            }
          }

      val isCustomSetAsButton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_custom_set_as_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_custom_set_as_button" }
            }
          }

      val isEditable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editable" }
            }
          }

      val isFoldingDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_folding_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_folding_disabled" }
            }
          }

      val isSelectable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_selectable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selectable" }
            }
          }

      val isSelected: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "is_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selected" }
            }
          }

      val moveToBottom: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "move_to_bottom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_to_bottom" }
            }
          }

      val moveToTop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "move_to_top".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_to_top" }
            }
          }

      val removeChild: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "remove_child".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_child" }
            }
          }

      val select: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "select".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method select" }
            }
          }

      val setButton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button" }
            }
          }

      val setButtonDisabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_button_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_disabled" }
            }
          }

      val setCellMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_cell_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_mode" }
            }
          }

      val setChecked: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_checked" }
            }
          }

      val setCollapsed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collapsed" }
            }
          }

      val setCustomAsButton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_as_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_as_button" }
            }
          }

      val setCustomBgColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_bg_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_bg_color" }
            }
          }

      val setCustomColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_color" }
            }
          }

      val setCustomDraw: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_draw" }
            }
          }

      val setCustomMinimumHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_custom_minimum_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_minimum_height" }
            }
          }

      val setDisableFolding: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_disable_folding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_folding" }
            }
          }

      val setEditable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editable" }
            }
          }

      val setExpandRight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_expand_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_right" }
            }
          }

      val setIcon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon" }
            }
          }

      val setIconMaxWidth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_icon_max_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon_max_width" }
            }
          }

      val setIconModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_icon_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon_modulate" }
            }
          }

      val setIconRegion: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_icon_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon_region" }
            }
          }

      val setMetadata: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_metadata" }
            }
          }

      val setRange: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_range".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range" }
            }
          }

      val setRangeConfig: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_range_config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_range_config" }
            }
          }

      val setSelectable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_selectable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selectable" }
            }
          }

      val setText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }

      val setTextAlign: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_text_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text_align" }
            }
          }

      val setTooltip: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TreeItem".cstr.ptr,
              "set_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tooltip" }
            }
          }
    }
  }
}
