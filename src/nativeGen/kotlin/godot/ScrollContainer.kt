// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScrollContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun getDeadzone(): Int {
    TODO()
  }

  fun getHScroll(): Int {
    TODO()
  }

  fun getHScrollbar(): HScrollBar {
    TODO()
  }

  fun getVScroll(): Int {
    TODO()
  }

  fun getVScrollbar(): VScrollBar {
    TODO()
  }

  fun isHScrollEnabled(): Boolean {
    TODO()
  }

  fun isVScrollEnabled(): Boolean {
    TODO()
  }

  fun setDeadzone() {
    TODO()
  }

  fun setEnableHScroll() {
    TODO()
  }

  fun setEnableVScroll() {
    TODO()
  }

  fun setHScroll() {
    TODO()
  }

  fun setVScroll() {
    TODO()
  }

  companion object {
    fun new(): ScrollContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ScrollContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ScrollContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ScrollContainer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ScrollContainer
     */
    private object __method_bind {
      val get_deadzone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "get_deadzone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_deadzone" }
            }
          }

      val get_h_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "get_h_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_scroll" }
            }
          }

      val get_h_scrollbar: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "get_h_scrollbar".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_scrollbar" }
            }
          }

      val get_v_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "get_v_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_scroll" }
            }
          }

      val get_v_scrollbar: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "get_v_scrollbar".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_scrollbar" }
            }
          }

      val is_h_scroll_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "is_h_scroll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_h_scroll_enabled" }
            }
          }

      val is_v_scroll_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "is_v_scroll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_v_scroll_enabled" }
            }
          }

      val set_deadzone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "set_deadzone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_deadzone" }
            }
          }

      val set_enable_h_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "set_enable_h_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_h_scroll" }
            }
          }

      val set_enable_v_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "set_enable_v_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_v_scroll" }
            }
          }

      val set_h_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "set_h_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_scroll" }
            }
          }

      val set_v_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollContainer".cstr.ptr,
              "set_v_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_scroll" }
            }
          }
    }
  }
}
