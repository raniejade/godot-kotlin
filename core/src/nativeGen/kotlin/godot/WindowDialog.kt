// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WindowDialog(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Popup(null) {
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

  constructor() : this(null) {
    _handle = __new()
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
    val _arg = Variant(resizable)
    __method_bind.setResizable.call(this._handle, listOf(_arg))
  }

  fun setTitle(title: String) {
    val _arg = Variant(title)
    __method_bind.setTitle.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WindowDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WindowDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WindowDialog
     */
    private object __method_bind {
      val getCloseButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_close_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_close_button" }
        }
      val getResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resizable" }
        }
      val getTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "get_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_title" }
        }
      val setResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "set_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_resizable" }
        }
      val setTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
            "set_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_title" }
        }}
  }
}
