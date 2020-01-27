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

open class EditorProperty internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun addFocusable(control: Control) {
    val _args = VariantArray.new()
    _args.append(control)
    __method_bind.add_focusable.call(this.toVariant(), _args.toVariant(), 1)
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
    __method_bind.emit_changed.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun getEditedObject(): Object {
    val _ret = __method_bind.get_edited_object.call(this.toVariant())
    return _ret.asObject(::Object)!!
  }

  fun getEditedProperty(): String {
    val _ret = __method_bind.get_edited_property.call(this.toVariant())
    return _ret.asString()
  }

  fun getLabel(): String {
    val _ret = __method_bind.get_label.call(this.toVariant())
    return _ret.asString()
  }

  fun getTooltipText(): String {
    val _ret = __method_bind.get_tooltip_text.call(this.toVariant())
    return _ret.asString()
  }

  fun isCheckable(): Boolean {
    val _ret = __method_bind.is_checkable.call(this.toVariant())
    return _ret.asBool()
  }

  fun isChecked(): Boolean {
    val _ret = __method_bind.is_checked.call(this.toVariant())
    return _ret.asBool()
  }

  fun isDrawRed(): Boolean {
    val _ret = __method_bind.is_draw_red.call(this.toVariant())
    return _ret.asBool()
  }

  fun isKeying(): Boolean {
    val _ret = __method_bind.is_keying.call(this.toVariant())
    return _ret.asBool()
  }

  fun isReadOnly(): Boolean {
    val _ret = __method_bind.is_read_only.call(this.toVariant())
    return _ret.asBool()
  }

  fun setBottomEditor(editor: Control) {
    val _args = VariantArray.new()
    _args.append(editor)
    __method_bind.set_bottom_editor.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCheckable(checkable: Boolean) {
    val _args = VariantArray.new()
    _args.append(checkable)
    __method_bind.set_checkable.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setChecked(checked: Boolean) {
    val _args = VariantArray.new()
    _args.append(checked)
    __method_bind.set_checked.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDrawRed(drawRed: Boolean) {
    val _args = VariantArray.new()
    _args.append(drawRed)
    __method_bind.set_draw_red.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setKeying(keying: Boolean) {
    val _args = VariantArray.new()
    _args.append(keying)
    __method_bind.set_keying.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLabel(text: String) {
    val _args = VariantArray.new()
    _args.append(text)
    __method_bind.set_label.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setReadOnly(readOnly: Boolean) {
    val _args = VariantArray.new()
    _args.append(readOnly)
    __method_bind.set_read_only.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): EditorProperty = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorProperty".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorProperty" }
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
      val add_focusable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "add_focusable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_focusable" }
            }
          }

      val emit_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "emit_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method emit_changed" }
            }
          }

      val get_edited_object: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_edited_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_object" }
            }
          }

      val get_edited_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_edited_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_property" }
            }
          }

      val get_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_label" }
            }
          }

      val get_tooltip_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "get_tooltip_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tooltip_text" }
            }
          }

      val is_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_checkable" }
            }
          }

      val is_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_checked" }
            }
          }

      val is_draw_red: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_draw_red".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_red" }
            }
          }

      val is_keying: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_keying".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_keying" }
            }
          }

      val is_read_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "is_read_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_read_only" }
            }
          }

      val set_bottom_editor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_bottom_editor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bottom_editor" }
            }
          }

      val set_checkable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_checkable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_checkable" }
            }
          }

      val set_checked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_checked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_checked" }
            }
          }

      val set_draw_red: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_draw_red".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_red" }
            }
          }

      val set_keying: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_keying".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_keying" }
            }
          }

      val set_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_label" }
            }
          }

      val set_read_only: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorProperty".cstr.ptr,
              "set_read_only".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_read_only" }
            }
          }
    }
  }
}
