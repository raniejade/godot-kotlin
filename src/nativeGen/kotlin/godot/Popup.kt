// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Popup internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val NOTIFICATION_POPUP_HIDE: Int = 81

    val NOTIFICATION_POST_POPUP: Int = 80

    fun new(): Popup = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Popup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Popup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Popup(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Popup
     */
    private object __method_bind {
      val is_exclusive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "is_exclusive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_exclusive" }
            }
          }

      val popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup" }
            }
          }

      val popup_centered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered" }
            }
          }

      val popup_centered_clamped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered_clamped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered_clamped" }
            }
          }

      val popup_centered_minsize: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered_minsize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered_minsize" }
            }
          }

      val popup_centered_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "popup_centered_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method popup_centered_ratio" }
            }
          }

      val set_exclusive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Popup".cstr.ptr,
              "set_exclusive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_exclusive" }
            }
          }
    }
  }
}
