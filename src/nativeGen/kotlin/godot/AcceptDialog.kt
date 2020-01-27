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
    return _ret.asObject(::Button)!!
  }

  fun addCancel(name: String): Button {
    val _arg = Variant.new(name)
    val _ret = __method_bind.add_cancel.call(this.toVariant(), _arg, 1)
    return _ret.asObject(::Button)!!
  }

  fun getHideOnOk(): Boolean {
    val _ret = __method_bind.get_hide_on_ok.call(this.toVariant())
    return _ret.asBool()
  }

  fun getLabel(): Label {
    val _ret = __method_bind.get_label.call(this.toVariant())
    return _ret.asObject(::Label)!!
  }

  fun getOk(): Button {
    val _ret = __method_bind.get_ok.call(this.toVariant())
    return _ret.asObject(::Button)!!
  }

  fun getText(): String {
    val _ret = __method_bind.get_text.call(this.toVariant())
    return _ret.asString()
  }

  fun registerTextEnter(lineEdit: Node) {
    val _arg = Variant.new(lineEdit)
    __method_bind.register_text_enter.call(this.toVariant(), _arg, 1)
  }

  fun setHideOnOk(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_hide_on_ok.call(this.toVariant(), _arg, 1)
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.set_text.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): AcceptDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AcceptDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AcceptDialog" }
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
