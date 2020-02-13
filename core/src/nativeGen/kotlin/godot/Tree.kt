// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class Tree(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var allowReselect: Boolean
    get() {
       return getAllowReselect() 
    }
    set(value) {
      setAllowReselect(value)
    }

  var allowRmbSelect: Boolean
    get() {
       return getAllowRmbSelect() 
    }
    set(value) {
      setAllowRmbSelect(value)
    }

  var columns: Int
    get() {
       return getColumns() 
    }
    set(value) {
      setColumns(value)
    }

  var dropModeFlags: Int
    get() {
       return getDropModeFlags() 
    }
    set(value) {
      setDropModeFlags(value)
    }

  var hideFolding: Boolean
    get() {
       return isFoldingHidden() 
    }
    set(value) {
      setHideFolding(value)
    }

  var hideRoot: Boolean
    get() {
       return isRootHidden() 
    }
    set(value) {
      setHideRoot(value)
    }

  var selectMode: SelectMode
    get() {
       return getSelectMode() 
    }
    set(value) {
      setSelectMode(value.value)
    }

  /**
   * Tree::button_pressed signal
   */
  val signalButtonPressed: Signal3<TreeItem, Int, Int> = Signal3("button_pressed")

  /**
   * Tree::cell_selected signal
   */
  val signalCellSelected: Signal0 = Signal0("cell_selected")

  /**
   * Tree::column_title_pressed signal
   */
  val signalColumnTitlePressed: Signal1<Int> = Signal1("column_title_pressed")

  /**
   * Tree::custom_popup_edited signal
   */
  val signalCustomPopupEdited: Signal1<Boolean> = Signal1("custom_popup_edited")

  /**
   * Tree::empty_rmb signal
   */
  val signalEmptyRmb: Signal1<Vector2> = Signal1("empty_rmb")

  /**
   * Tree::empty_tree_rmb_selected signal
   */
  val signalEmptyTreeRmbSelected: Signal1<Vector2> = Signal1("empty_tree_rmb_selected")

  /**
   * Tree::item_activated signal
   */
  val signalItemActivated: Signal0 = Signal0("item_activated")

  /**
   * Tree::item_collapsed signal
   */
  val signalItemCollapsed: Signal1<TreeItem> = Signal1("item_collapsed")

  /**
   * Tree::item_custom_button_pressed signal
   */
  val signalItemCustomButtonPressed: Signal0 = Signal0("item_custom_button_pressed")

  /**
   * Tree::item_double_clicked signal
   */
  val signalItemDoubleClicked: Signal0 = Signal0("item_double_clicked")

  /**
   * Tree::item_edited signal
   */
  val signalItemEdited: Signal0 = Signal0("item_edited")

  /**
   * Tree::item_rmb_edited signal
   */
  val signalItemRmbEdited: Signal0 = Signal0("item_rmb_edited")

  /**
   * Tree::item_rmb_selected signal
   */
  val signalItemRmbSelected: Signal1<Vector2> = Signal1("item_rmb_selected")

  /**
   * Tree::item_selected signal
   */
  val signalItemSelected: Signal0 = Signal0("item_selected")

  /**
   * Tree::multi_selected signal
   */
  val signalMultiSelected: Signal3<TreeItem, Int, Boolean> = Signal3("multi_selected")

  /**
   * Tree::nothing_selected signal
   */
  val signalNothingSelected: Signal0 = Signal0("nothing_selected")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _popup_select(arg0: Int) {
    TODO()
  }

  open fun _range_click_timeout() {
    TODO()
  }

  open fun _scroll_moved(arg0: Float) {
    TODO()
  }

  open fun _text_editor_enter(arg0: String) {
    TODO()
  }

  open fun _text_editor_modal_close() {
    TODO()
  }

  open fun _value_editor_changed(arg0: Float) {
    TODO()
  }

  fun areColumnTitlesVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.areColumnTitlesVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun createItem(parent: Object, idx: Int = -1): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(parent)
      _args.add(idx)
      __method_bind.createItem.call(self._handle, _args, _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun ensureCursorIsVisible() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.ensureCursorIsVisible.call(self._handle, emptyList(), null)
    }
  }

  fun getAllowReselect(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAllowReselect.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAllowRmbSelect(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAllowRmbSelect.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getColumnAtPosition(position: Vector2): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColumnAtPosition.call(self._handle, listOf(position), _retPtr)
      _ret.value
    }
  }

  fun getColumnTitle(column: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getColumnTitle.call(self._handle, listOf(column), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getColumnWidth(column: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColumnWidth.call(self._handle, listOf(column), _retPtr)
      _ret.value
    }
  }

  fun getColumns(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColumns.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCustomPopupRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCustomPopupRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDropModeFlags(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDropModeFlags.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getDropSectionAtPosition(position: Vector2): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDropSectionAtPosition.call(self._handle, listOf(position), _retPtr)
      _ret.value
    }
  }

  fun getEdited(): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEdited.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getEditedColumn(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEditedColumn.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getItemAreaRect(item: Object, column: Int = -1): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(item)
      _args.add(column)
      __method_bind.getItemAreaRect.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getItemAtPosition(position: Vector2): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getItemAtPosition.call(self._handle, listOf(position), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getNextSelected(from: Object): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNextSelected.call(self._handle, listOf(from), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getPressedButton(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPressedButton.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getRoot(): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getRoot.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getScroll(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScroll.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSelectMode(): SelectMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectMode.call(self._handle, emptyList(), _retPtr)
      Tree.SelectMode.from(_ret.value)
    }
  }

  fun getSelected(): TreeItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TreeItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSelected.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TreeItem>(_tmp.value!!)
      _ret
    }
  }

  fun getSelectedColumn(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSelectedColumn.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFoldingHidden(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFoldingHidden.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRootHidden(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRootHidden.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAllowReselect(allow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowReselect.call(self._handle, listOf(allow), null)
    }
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAllowRmbSelect.call(self._handle, listOf(allow), null)
    }
  }

  fun setColumnExpand(column: Int, expand: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(expand)
      __method_bind.setColumnExpand.call(self._handle, _args, null)
    }
  }

  fun setColumnMinWidth(column: Int, minWidth: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(minWidth)
      __method_bind.setColumnMinWidth.call(self._handle, _args, null)
    }
  }

  fun setColumnTitle(column: Int, title: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(column)
      _args.add(title)
      __method_bind.setColumnTitle.call(self._handle, _args, null)
    }
  }

  fun setColumnTitlesVisible(visible: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColumnTitlesVisible.call(self._handle, listOf(visible), null)
    }
  }

  fun setColumns(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColumns.call(self._handle, listOf(amount), null)
    }
  }

  fun setDropModeFlags(flags: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDropModeFlags.call(self._handle, listOf(flags), null)
    }
  }

  fun setHideFolding(hide: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHideFolding.call(self._handle, listOf(hide), null)
    }
  }

  fun setHideRoot(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHideRoot.call(self._handle, listOf(enable), null)
    }
  }

  fun setSelectMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelectMode.call(self._handle, listOf(mode), null)
    }
  }

  enum class SelectMode(
    val value: Int
  ) {
    SINGLE(0),

    ROW(1),

    MULTI(2);

    companion object {
      fun from(value: Int): SelectMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DropModeFlags(
    val value: Int
  ) {
    DISABLED(0),

    ON_ITEM(1),

    INBETWEEN(2);

    companion object {
      fun from(value: Int): DropModeFlags {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Tree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Tree
     */
    private object __method_bind {
      val areColumnTitlesVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "are_column_titles_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method are_column_titles_visible" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "create_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_item" }
        }
      val ensureCursorIsVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "ensure_cursor_is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensure_cursor_is_visible" }
        }
      val getAllowReselect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_reselect" }
        }
      val getAllowRmbSelect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_allow_rmb_select" }
        }
      val getColumnAtPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_at_position" }
        }
      val getColumnTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_title" }
        }
      val getColumnWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_column_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_column_width" }
        }
      val getColumns: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_columns" }
        }
      val getCustomPopupRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_custom_popup_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_popup_rect" }
        }
      val getDropModeFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_drop_mode_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drop_mode_flags" }
        }
      val getDropSectionAtPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_drop_section_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drop_section_at_position" }
        }
      val getEdited: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_edited".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited" }
        }
      val getEditedColumn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_edited_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_column" }
        }
      val getItemAreaRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_item_area_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_area_rect" }
        }
      val getItemAtPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_item_at_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_at_position" }
        }
      val getNextSelected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_next_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next_selected" }
        }
      val getPressedButton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_pressed_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressed_button" }
        }
      val getRoot: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root" }
        }
      val getScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll" }
        }
      val getSelectMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_select_mode" }
        }
      val getSelected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected" }
        }
      val getSelectedColumn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "get_selected_column".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_selected_column" }
        }
      val isFoldingHidden: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "is_folding_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_folding_hidden" }
        }
      val isRootHidden: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "is_root_hidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_root_hidden" }
        }
      val setAllowReselect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_allow_reselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_reselect" }
        }
      val setAllowRmbSelect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_allow_rmb_select".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_allow_rmb_select" }
        }
      val setColumnExpand: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_expand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_expand" }
        }
      val setColumnMinWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_min_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_min_width" }
        }
      val setColumnTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_title" }
        }
      val setColumnTitlesVisible: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_column_titles_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_column_titles_visible" }
        }
      val setColumns: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_columns" }
        }
      val setDropModeFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_drop_mode_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drop_mode_flags" }
        }
      val setHideFolding: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_hide_folding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_folding" }
        }
      val setHideRoot: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_hide_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hide_root" }
        }
      val setSelectMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "set_select_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_select_mode" }
        }}
  }
}
