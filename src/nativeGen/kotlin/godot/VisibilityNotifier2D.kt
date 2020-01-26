// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisibilityNotifier2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getRect(): Rect2 {
    TODO()
  }

  fun isOnScreen(): Boolean {
    TODO()
  }

  fun setRect(rect: Rect2) {
    TODO()
  }

  companion object {
    fun new(): VisibilityNotifier2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityNotifier2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisibilityNotifier2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityNotifier2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisibilityNotifier2D = VisibilityNotifier2D(ptr)
    /**
     * Container for method_bind pointers for VisibilityNotifier2D
     */
    private object __method_bind {
      val get_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
              "get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rect" }
            }
          }

      val is_on_screen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
              "is_on_screen".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_screen" }
            }
          }

      val set_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier2D".cstr.ptr,
              "set_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rect" }
            }
          }
    }
  }
}
