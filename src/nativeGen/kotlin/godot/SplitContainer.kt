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

open class SplitContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun clampSplitOffset() {
    TODO()
  }

  fun getDraggerVisibility(): DraggerVisibility {
    TODO()
  }

  fun getSplitOffset(): Int {
    TODO()
  }

  fun isCollapsed(): Boolean {
    TODO()
  }

  fun setCollapsed() {
    TODO()
  }

  fun setDraggerVisibility() {
    TODO()
  }

  fun setSplitOffset() {
    TODO()
  }

  enum class DraggerVisibility(
    val value: Int
  ) {
    DRAGGER_VISIBLE(0),

    DRAGGER_HIDDEN(1),

    DRAGGER_HIDDEN_COLLAPSED(2);
  }

  companion object {
    val DRAGGER_HIDDEN: Int = 1

    val DRAGGER_HIDDEN_COLLAPSED: Int = 2

    val DRAGGER_VISIBLE: Int = 0

    /**
     * Container for method_bind pointers for SplitContainer
     */
    private object __method_bind {
      val clamp_split_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "clamp_split_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clamp_split_offset" }
            }
          }

      val get_dragger_visibility: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "get_dragger_visibility".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dragger_visibility" }
            }
          }

      val get_split_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "get_split_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_split_offset" }
            }
          }

      val is_collapsed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "is_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collapsed" }
            }
          }

      val set_collapsed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "set_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collapsed" }
            }
          }

      val set_dragger_visibility: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "set_dragger_visibility".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dragger_visibility" }
            }
          }

      val set_split_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "set_split_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_split_offset" }
            }
          }
    }
  }
}
