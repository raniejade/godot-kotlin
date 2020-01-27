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

open class AcceptDialog internal constructor(
  _handle: COpaquePointer
) : WindowDialog(_handle) {
  fun addButton(
    text: String,
    right: Boolean,
    action: String
  ): Button {
    val _args = VariantArray.new()
    _args.append(text)
    _args.append(right)
    _args.append(action)
    val _ret = __method_bind.add_button.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addCancel(name: String): Button {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.add_cancel.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getHideOnOk(): Boolean {
    val _ret = __method_bind.get_hide_on_ok.call(this.toVariant())
    TODO()
  }

  fun getLabel(): Label {
    val _ret = __method_bind.get_label.call(this.toVariant())
    TODO()
  }

  fun getOk(): Button {
    val _ret = __method_bind.get_ok.call(this.toVariant())
    TODO()
  }

  fun getText(): String {
    val _ret = __method_bind.get_text.call(this.toVariant())
    TODO()
  }

  fun registerTextEnter(lineEdit: Node) {
    val _args = VariantArray.new()
    _args.append(lineEdit)
    val _ret = __method_bind.register_text_enter.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHideOnOk(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_hide_on_ok.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setText(text: String) {
    val _args = VariantArray.new()
    _args.append(text)
    val _ret = __method_bind.set_text.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): AcceptDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AcceptDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AcceptDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AcceptDialog(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AcceptDialog = AcceptDialog(ptr)
    /**
     * Container for method_bind pointers for AcceptDialog
     */
    private object __method_bind {
      val add_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "add_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_button" }
            }
          }

      val add_cancel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "add_cancel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_cancel" }
            }
          }

      val get_hide_on_ok: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_hide_on_ok".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hide_on_ok" }
            }
          }

      val get_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_label" }
            }
          }

      val get_ok: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_ok".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ok" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val register_text_enter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "register_text_enter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method register_text_enter" }
            }
          }

      val set_hide_on_ok: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "set_hide_on_ok".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hide_on_ok" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AcceptDialog".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }
    }
  }
}
