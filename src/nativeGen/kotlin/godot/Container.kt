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

open class Container internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun childMinsizeChanged() {
    TODO()
  }

  fun sortChildren() {
    TODO()
  }

  fun fitChildInRect() {
    TODO()
  }

  fun queueSort() {
    TODO()
  }

  companion object {
    val NOTIFICATION_SORT_CHILDREN: Int = 50

    fun new(): Container = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Container".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Container" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Container(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Container
     */
    private object __method_bind {
      val _child_minsize_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
              "_child_minsize_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _child_minsize_changed" }
            }
          }

      val _sort_children: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
              "_sort_children".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _sort_children" }
            }
          }

      val fit_child_in_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
              "fit_child_in_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fit_child_in_rect" }
            }
          }

      val queue_sort: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
              "queue_sort".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_sort" }
            }
          }
    }
  }
}
