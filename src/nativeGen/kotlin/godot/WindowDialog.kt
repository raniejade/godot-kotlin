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

open class WindowDialog internal constructor(
  _handle: COpaquePointer
) : Popup(_handle) {
  fun getCloseButton(): TextureButton {
    val _ret = __method_bind.get_close_button.call(this._handle)
    return _ret.asObject(::TextureButton)!!
  }

  fun getResizable(): Boolean {
    val _ret = __method_bind.get_resizable.call(this._handle)
    return _ret.asBool()
  }

  fun getTitle(): String {
    val _ret = __method_bind.get_title.call(this._handle)
    return _ret.asString()
  }

  fun setResizable(resizable: Boolean) {
    val _arg = Variant.new(resizable)
    __method_bind.set_resizable.call(this._handle, _arg, 1)
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.set_title.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): WindowDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WindowDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WindowDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WindowDialog(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WindowDialog = WindowDialog(ptr)
    /**
     * Container for method_bind pointers for WindowDialog
     */
    private object __method_bind {
      val get_close_button: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_close_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_close_button" }
        }
      val get_resizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resizable" }
        }
      val get_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_title" }
        }
      val set_resizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "set_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_resizable" }
        }
      val set_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "set_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_title" }
        }}
  }
}
