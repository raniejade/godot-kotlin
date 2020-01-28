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

open class WindowDialog(
  _handle: COpaquePointer
) : Popup(_handle) {
  var resizable: Boolean
    get() {
       return getResizable() 
    }
    set(value) {
      setResizable(value)
    }

  var windowTitle: String
    get() {
       return getTitle() 
    }
    set(value) {
      setTitle(value)
    }

  fun getCloseButton(): TextureButton {
    val _ret = __method_bind.getCloseButton.call(this._handle)
    return _ret.asObject(::TextureButton)!!
  }

  fun getResizable(): Boolean {
    val _ret = __method_bind.getResizable.call(this._handle)
    return _ret.asBoolean()
  }

  fun getTitle(): String {
    val _ret = __method_bind.getTitle.call(this._handle)
    return _ret.asString()
  }

  fun setResizable(resizable: Boolean) {
    val _arg = Variant.new(resizable)
    __method_bind.setResizable.call(this._handle, _arg, 1)
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.setTitle.call(this._handle, _arg, 1)
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
      val getCloseButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "getCloseButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCloseButton" }
        }
      val getResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "getResizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResizable" }
        }
      val getTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "getTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTitle" }
        }
      val setResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "setResizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setResizable" }
        }
      val setTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "setTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTitle" }
        }}
  }
}
