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

open class WindowDialog internal constructor(
  _handle: COpaquePointer
) : Popup(_handle) {
  fun getCloseButton(): TextureButton {
    TODO()
  }

  fun getResizable(): Boolean {
    TODO()
  }

  fun getTitle(): String {
    TODO()
  }

  fun setResizable(resizable: Boolean) {
    TODO()
  }

  fun setTitle(title: String) {
    TODO()
  }

  companion object {
    fun new(): WindowDialog = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WindowDialog".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton WindowDialog" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WindowDialog(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for WindowDialog
     */
    private object __method_bind {
      val get_close_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
              "get_close_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_close_button" }
            }
          }

      val get_resizable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
              "get_resizable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resizable" }
            }
          }

      val get_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
              "get_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_title" }
            }
          }

      val set_resizable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
              "set_resizable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_resizable" }
            }
          }

      val set_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WindowDialog".cstr.ptr,
              "set_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_title" }
            }
          }
    }
  }
}
