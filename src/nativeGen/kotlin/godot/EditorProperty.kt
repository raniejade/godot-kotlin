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
    field: String,
    changing: Boolean
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
    fun new(): EditorProperty = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorProperty".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorProperty" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorProperty(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorProperty = EditorProperty(ptr)
    /**
     * Container for method_bind pointers for EditorProperty
     */
    private object __method_bind {
      val addFocusable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "addFocusable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addFocusable" }
        }
      val emitChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "emitChanged".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method emitChanged" }
        }
      val getEditedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "getEditedObject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEditedObject" }
        }
      val getEditedProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "getEditedProperty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEditedProperty" }
        }
      val getLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "getLabel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLabel" }
        }
      val getTooltipText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "getTooltipText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTooltipText" }
        }
      val isCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "isCheckable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCheckable" }
        }
      val isChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "isChecked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isChecked" }
        }
      val isDrawRed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "isDrawRed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDrawRed" }
        }
      val isKeying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "isKeying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isKeying" }
        }
      val isReadOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "isReadOnly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isReadOnly" }
        }
      val setBottomEditor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "setBottomEditor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBottomEditor" }
        }
      val setCheckable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "setCheckable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCheckable" }
        }
      val setChecked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "setChecked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setChecked" }
        }
      val setDrawRed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "setDrawRed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawRed" }
        }
      val setKeying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "setKeying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setKeying" }
        }
      val setLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "setLabel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLabel" }
        }
      val setReadOnly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
            "setReadOnly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setReadOnly" }
        }}
  }
}
