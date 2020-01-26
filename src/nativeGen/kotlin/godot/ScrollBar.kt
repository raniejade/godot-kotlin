// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScrollBar internal constructor(
  _handle: COpaquePointer
) : Range(_handle) {
  fun dragNodeExit() {
    TODO()
  }

  fun dragNodeInput() {
    TODO()
  }

  fun guiInput() {
    TODO()
  }

  fun getCustomStep(): Float {
    TODO()
  }

  fun setCustomStep() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for ScrollBar
     */
    private object __method_bind {
      val _drag_node_exit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
              "_drag_node_exit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _drag_node_exit" }
            }
          }

      val _drag_node_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
              "_drag_node_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _drag_node_input" }
            }
          }

      val _gui_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
              "_gui_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_input" }
            }
          }

      val get_custom_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
              "get_custom_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_step" }
            }
          }

      val set_custom_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
              "set_custom_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_step" }
            }
          }
    }
  }
}
