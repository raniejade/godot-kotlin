// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorProperty(
  _handle: COpaquePointer
) : Container(_handle) {
  var checkable: Boolean
    get() {
       return isCheckable() 
    }
    set(value) {
      setCheckable(value)
    }

  var checked: Boolean
    get() {
       return isChecked() 
    }
    set(value) {
      setChecked(value)
    }

  var drawRed: Boolean
    get() {
       return isDrawRed() 
    }
    set(value) {
      setDrawRed(value)
    }

  var keying: Boolean
    get() {
       return isKeying() 
    }
    set(value) {
      setKeying(value)
    }

  var label: String
    get() {
       return getLabel() 
    }
    set(value) {
      setLabel(value)
    }

  var readOnly: Boolean
    get() {
       return isReadOnly() 
    }
    set(value) {
      setReadOnly(value)
    }

  fun addFocusable(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.addFocusable.call(this._handle, _arg, 1)
  }

  fun emitChanged(
    property: String,
    value: Variant,
    field: String = "",
    changing: Boolean = false
  ) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    _args.append(field)
    _args.append(changing)
    __method_bind.emitChanged.call(this._handle, _args.toVariant(), 4)
  }

  fun getEditedObject(): Object {
    val _ret = __method_bind.getEditedObject.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getEditedProperty(): String {
    val _ret = __method_bind.getEditedProperty.call(this._handle)
    return _ret.asString()
  }

  fun getLabel(): String {
    val _ret = __method_bind.getLabel.call(this._handle)
    return _ret.asString()
  }

  fun getTooltipText(): String {
    val _ret = __method_bind.getTooltipText.call(this._handle)
    return _ret.asString()
  }

  fun isCheckable(): Boolean {
    val _ret = __method_bind.isCheckable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isChecked(): Boolean {
    val _ret = __method_bind.isChecked.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDrawRed(): Boolean {
    val _ret = __method_bind.isDrawRed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isKeying(): Boolean {
    val _ret = __method_bind.isKeying.call(this._handle)
    return _ret.asBoolean()
  }

  fun isReadOnly(): Boolean {
    val _ret = __method_bind.isReadOnly.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBottomEditor(editor: Control) {
    val _arg = Variant.new(editor)
    __method_bind.setBottomEditor.call(this._handle, _arg, 1)
  }

  fun setCheckable(checkable: Boolean) {
    val _arg = Variant.new(checkable)
    __method_bind.setCheckable.call(this._handle, _arg, 1)
  }

  fun setChecked(checked: Boolean) {
    val _arg = Variant.new(checked)
    __method_bind.setChecked.call(this._handle, _arg, 1)
  }

  fun setDrawRed(drawRed: Boolean) {
    val _arg = Variant.new(drawRed)
    __method_bind.setDrawRed.call(this._handle, _arg, 1)
  }

  fun setKeying(keying: Boolean) {
    val _arg = Variant.new(keying)
    __method_bind.setKeying.call(this._handle, _arg, 1)
  }

  fun setLabel(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setLabel.call(this._handle, _arg, 1)
  }

  fun setReadOnly(readOnly: Boolean) {
    val _arg = Variant.new(readOnly)
    __method_bind.setReadOnly.call(this._handle, _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorProperty
     */
    private object __method_bind {
      val addFocusable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "add_focusable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_focusable" }
        }
      val emitChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "emit_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method emit_changed" }
        }
      val getEditedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "get_edited_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_object" }
        }
      val getEditedProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "get_edited_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_property" }
        }
      val getLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "get_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_label" }
        }
      val getTooltipText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "get_tooltip_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tooltip_text" }
        }
      val isCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "is_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_checkable" }
        }
      val isChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "is_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_checked" }
        }
      val isDrawRed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "is_draw_red".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_draw_red" }
        }
      val isKeying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "is_keying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_keying" }
        }
      val isReadOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "is_read_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_read_only" }
        }
      val setBottomEditor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "set_bottom_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bottom_editor" }
        }
      val setCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "set_checkable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_checkable" }
        }
      val setChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "set_checked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_checked" }
        }
      val setDrawRed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "set_draw_red".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_red" }
        }
      val setKeying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "set_keying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keying" }
        }
      val setLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "set_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_label" }
        }
      val setReadOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "set_read_only".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_read_only" }
        }}
  }
}
