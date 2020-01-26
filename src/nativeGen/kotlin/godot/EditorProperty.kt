// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
  fun addFocusable() {
    TODO()
  }

  fun emitChanged() {
    TODO()
  }

  fun getEditedObject(): Object {
    TODO()
  }

  fun getEditedProperty(): String {
    TODO()
  }

  fun getLabel(): String {
    TODO()
  }

  fun getTooltipText(): String {
    TODO()
  }

  fun isCheckable(): Boolean {
    TODO()
  }

  fun isChecked(): Boolean {
    TODO()
  }

  fun isDrawRed(): Boolean {
    TODO()
  }

  fun isKeying(): Boolean {
    TODO()
  }

  fun isReadOnly(): Boolean {
    TODO()
  }

  fun setBottomEditor() {
    TODO()
  }

  fun setCheckable() {
    TODO()
  }

  fun setChecked() {
    TODO()
  }

  fun setDrawRed() {
    TODO()
  }

  fun setKeying() {
    TODO()
  }

  fun setLabel() {
    TODO()
  }

  fun setReadOnly() {
    TODO()
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
