// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Tree(
  _handle: COpaquePointer
) : Control(_handle) {
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

  var selectMode: Int
    get() {
       return Tree.SelectMode.from(getSelectMode()) 
    }
    set(value) {
      setSelectMode(Tree.SelectMode.from(value))
    }

  fun areColumnTitlesVisible(): Boolean {
    val _ret = __method_bind.areColumnTitlesVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createItem(parent: Object, idx: Int): TreeItem {
    val _args = VariantArray.new()
    _args.append(parent)
    _args.append(idx)
    val _ret = __method_bind.createItem.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::TreeItem)!!
  }

  fun ensureCursorIsVisible() {
    __method_bind.ensureCursorIsVisible.call(this._handle)
  }

  fun getAllowReselect(): Boolean {
    val _ret = __method_bind.getAllowReselect.call(this._handle)
    return _ret.asBoolean()
  }

  fun getAllowRmbSelect(): Boolean {
    val _ret = __method_bind.getAllowRmbSelect.call(this._handle)
    return _ret.asBoolean()
  }

  fun getColumnAtPosition(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getColumnAtPosition.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getColumnTitle(column: Int): String {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getColumnTitle.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getColumnWidth(column: Int): Int {
    val _arg = Variant.new(column)
    val _ret = __method_bind.getColumnWidth.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getColumns(): Int {
    val _ret = __method_bind.getColumns.call(this._handle)
    return _ret.asInt()
  }

  fun getCustomPopupRect(): Rect2 {
    val _ret = __method_bind.getCustomPopupRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getDropModeFlags(): Int {
    val _ret = __method_bind.getDropModeFlags.call(this._handle)
    return _ret.asInt()
  }

  fun getDropSectionAtPosition(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getDropSectionAtPosition.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getEdited(): TreeItem {
    val _ret = __method_bind.getEdited.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getEditedColumn(): Int {
    val _ret = __method_bind.getEditedColumn.call(this._handle)
    return _ret.asInt()
  }

  fun getItemAreaRect(item: Object, column: Int): Rect2 {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(column)
    val _ret = __method_bind.getItemAreaRect.call(this._handle, _args.toVariant(), 2)
    return _ret.asRect2()
  }

  fun getItemAtPosition(position: Vector2): TreeItem {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getItemAtPosition.call(this._handle, _arg, 1)
    return _ret.asObject(::TreeItem)!!
  }

  fun getNextSelected(from: Object): TreeItem {
    val _arg = Variant.new(from)
    val _ret = __method_bind.getNextSelected.call(this._handle, _arg, 1)
    return _ret.asObject(::TreeItem)!!
  }

  fun getPressedButton(): Int {
    val _ret = __method_bind.getPressedButton.call(this._handle)
    return _ret.asInt()
  }

  fun getRoot(): TreeItem {
    val _ret = __method_bind.getRoot.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getScroll(): Vector2 {
    val _ret = __method_bind.getScroll.call(this._handle)
    return _ret.asVector2()
  }

  fun getSelectMode(): SelectMode {
    val _ret = __method_bind.getSelectMode.call(this._handle)
    return Tree.SelectMode.from(_ret.asInt())
  }

  fun getSelected(): TreeItem {
    val _ret = __method_bind.getSelected.call(this._handle)
    return _ret.asObject(::TreeItem)!!
  }

  fun getSelectedColumn(): Int {
    val _ret = __method_bind.getSelectedColumn.call(this._handle)
    return _ret.asInt()
  }

  fun isFoldingHidden(): Boolean {
    val _ret = __method_bind.isFoldingHidden.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRootHidden(): Boolean {
    val _ret = __method_bind.isRootHidden.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAllowReselect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowReselect.call(this._handle, _arg, 1)
  }

  fun setAllowRmbSelect(allow: Boolean) {
    val _arg = Variant.new(allow)
    __method_bind.setAllowRmbSelect.call(this._handle, _arg, 1)
  }

  fun setColumnExpand(column: Int, expand: Boolean) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(expand)
    __method_bind.setColumnExpand.call(this._handle, _args.toVariant(), 2)
  }

  fun setColumnMinWidth(column: Int, minWidth: Int) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(minWidth)
    __method_bind.setColumnMinWidth.call(this._handle, _args.toVariant(), 2)
  }

  fun setColumnTitle(column: Int, title: String) {
    val _args = VariantArray.new()
    _args.append(column)
    _args.append(title)
    __method_bind.setColumnTitle.call(this._handle, _args.toVariant(), 2)
  }

  fun setColumnTitlesVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setColumnTitlesVisible.call(this._handle, _arg, 1)
  }

  fun setColumns(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setColumns.call(this._handle, _arg, 1)
  }

  fun setDropModeFlags(flags: Int) {
    val _arg = Variant.new(flags)
    __method_bind.setDropModeFlags.call(this._handle, _arg, 1)
  }

  fun setHideFolding(hide: Boolean) {
    val _arg = Variant.new(hide)
    __method_bind.setHideFolding.call(this._handle, _arg, 1)
  }

  fun setHideRoot(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHideRoot.call(this._handle, _arg, 1)
  }

  fun setSelectMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setSelectMode.call(this._handle, _arg, 1)
  }

  enum class SelectMode(
    val value: Int
  ) {
    SELECT_SINGLE(0),

    SELECT_ROW(1),

    SELECT_MULTI(2);

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
    DROP_MODE_DISABLED(0),

    DROP_MODE_ON_ITEM(1),

    DROP_MODE_INBETWEEN(2);

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
    val DROP_MODE_DISABLED: Int = 0

    val DROP_MODE_INBETWEEN: Int = 2

    val DROP_MODE_ON_ITEM: Int = 1

    val SELECT_MULTI: Int = 2

    val SELECT_ROW: Int = 1

    val SELECT_SINGLE: Int = 0

    fun new(): Tree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Tree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Tree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Tree(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Tree = Tree(ptr)
    /**
     * Container for method_bind pointers for Tree
     */
    private object __method_bind {
      val areColumnTitlesVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "areColumnTitlesVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areColumnTitlesVisible" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "createItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createItem" }
        }
      val ensureCursorIsVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "ensureCursorIsVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ensureCursorIsVisible" }
        }
      val getAllowReselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getAllowReselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAllowReselect" }
        }
      val getAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getAllowRmbSelect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAllowRmbSelect" }
        }
      val getColumnAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getColumnAtPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColumnAtPosition" }
        }
      val getColumnTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getColumnTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColumnTitle" }
        }
      val getColumnWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getColumnWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColumnWidth" }
        }
      val getColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getColumns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColumns" }
        }
      val getCustomPopupRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getCustomPopupRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomPopupRect" }
        }
      val getDropModeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getDropModeFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDropModeFlags" }
        }
      val getDropSectionAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getDropSectionAtPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDropSectionAtPosition" }
        }
      val getEdited: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getEdited".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEdited" }
        }
      val getEditedColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getEditedColumn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEditedColumn" }
        }
      val getItemAreaRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getItemAreaRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemAreaRect" }
        }
      val getItemAtPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getItemAtPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemAtPosition" }
        }
      val getNextSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getNextSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNextSelected" }
        }
      val getPressedButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getPressedButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPressedButton" }
        }
      val getRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getRoot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRoot" }
        }
      val getScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScroll" }
        }
      val getSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getSelectMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectMode" }
        }
      val getSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelected" }
        }
      val getSelectedColumn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "getSelectedColumn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelectedColumn" }
        }
      val isFoldingHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "isFoldingHidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFoldingHidden" }
        }
      val isRootHidden: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "isRootHidden".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRootHidden" }
        }
      val setAllowReselect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setAllowReselect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowReselect" }
        }
      val setAllowRmbSelect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setAllowRmbSelect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowRmbSelect" }
        }
      val setColumnExpand: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setColumnExpand".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColumnExpand" }
        }
      val setColumnMinWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setColumnMinWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColumnMinWidth" }
        }
      val setColumnTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setColumnTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColumnTitle" }
        }
      val setColumnTitlesVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setColumnTitlesVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColumnTitlesVisible" }
        }
      val setColumns: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setColumns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColumns" }
        }
      val setDropModeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setDropModeFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDropModeFlags" }
        }
      val setHideFolding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setHideFolding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHideFolding" }
        }
      val setHideRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setHideRoot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHideRoot" }
        }
      val setSelectMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Tree".cstr.ptr,
            "setSelectMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelectMode" }
        }}
  }
}
