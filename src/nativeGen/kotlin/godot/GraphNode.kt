// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GraphNode internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun clearAllSlots() {
    TODO()
  }

  fun clearSlot(idx: Int) {
    TODO()
  }

  fun getConnectionInputColor(idx: Int): Color {
    TODO()
  }

  fun getConnectionInputCount(): Int {
    TODO()
  }

  fun getConnectionInputPosition(idx: Int): Vector2 {
    TODO()
  }

  fun getConnectionInputType(idx: Int): Int {
    TODO()
  }

  fun getConnectionOutputColor(idx: Int): Color {
    TODO()
  }

  fun getConnectionOutputCount(): Int {
    TODO()
  }

  fun getConnectionOutputPosition(idx: Int): Vector2 {
    TODO()
  }

  fun getConnectionOutputType(idx: Int): Int {
    TODO()
  }

  fun getOffset(): Vector2 {
    TODO()
  }

  fun getOverlay(): Overlay {
    TODO()
  }

  fun getSlotColorLeft(idx: Int): Color {
    TODO()
  }

  fun getSlotColorRight(idx: Int): Color {
    TODO()
  }

  fun getSlotTypeLeft(idx: Int): Int {
    TODO()
  }

  fun getSlotTypeRight(idx: Int): Int {
    TODO()
  }

  fun getTitle(): String {
    TODO()
  }

  fun isCloseButtonVisible(): Boolean {
    TODO()
  }

  fun isComment(): Boolean {
    TODO()
  }

  fun isResizable(): Boolean {
    TODO()
  }

  fun isSelected(): Boolean {
    TODO()
  }

  fun isSlotEnabledLeft(idx: Int): Boolean {
    TODO()
  }

  fun isSlotEnabledRight(idx: Int): Boolean {
    TODO()
  }

  fun setComment(comment: Boolean) {
    TODO()
  }

  fun setOffset(offset: Vector2) {
    TODO()
  }

  fun setOverlay(overlay: Int) {
    TODO()
  }

  fun setResizable(resizable: Boolean) {
    TODO()
  }

  fun setSelected(selected: Boolean) {
    TODO()
  }

  fun setShowCloseButton(show: Boolean) {
    TODO()
  }

  fun setSlot(
    idx: Int,
    enable_left: Boolean,
    type_left: Int,
    color_left: Color,
    enable_right: Boolean,
    type_right: Int,
    color_right: Color,
    custom_left: Texture,
    custom_right: Texture
  ) {
    TODO()
  }

  fun setTitle(title: String) {
    TODO()
  }

  enum class Overlay(
    val value: Int
  ) {
    OVERLAY_DISABLED(0),

    OVERLAY_BREAKPOINT(1),

    OVERLAY_POSITION(2);
  }

  companion object {
    val OVERLAY_BREAKPOINT: Int = 1

    val OVERLAY_DISABLED: Int = 0

    val OVERLAY_POSITION: Int = 2

    fun new(): GraphNode = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GraphNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GraphNode(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for GraphNode
     */
    private object __method_bind {
      val clear_all_slots: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "clear_all_slots".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_all_slots" }
            }
          }

      val clear_slot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "clear_slot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_slot" }
            }
          }

      val get_connection_input_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_color" }
            }
          }

      val get_connection_input_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_count" }
            }
          }

      val get_connection_input_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_position"
              }
            }
          }

      val get_connection_input_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_type" }
            }
          }

      val get_connection_output_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_color" }
            }
          }

      val get_connection_output_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_count" }
            }
          }

      val get_connection_output_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_position"
              }
            }
          }

      val get_connection_output_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_type" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_overlay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_overlay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_overlay" }
            }
          }

      val get_slot_color_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_color_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_color_left" }
            }
          }

      val get_slot_color_right: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_color_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_color_right" }
            }
          }

      val get_slot_type_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_type_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_type_left" }
            }
          }

      val get_slot_type_right: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_type_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_type_right" }
            }
          }

      val get_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_title" }
            }
          }

      val is_close_button_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_close_button_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_close_button_visible" }
            }
          }

      val is_comment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_comment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_comment" }
            }
          }

      val is_resizable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_resizable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_resizable" }
            }
          }

      val is_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selected" }
            }
          }

      val is_slot_enabled_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_slot_enabled_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_left" }
            }
          }

      val is_slot_enabled_right: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_slot_enabled_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_right" }
            }
          }

      val set_comment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_comment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_comment" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_overlay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_overlay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_overlay" }
            }
          }

      val set_resizable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_resizable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_resizable" }
            }
          }

      val set_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selected" }
            }
          }

      val set_show_close_button: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_show_close_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_show_close_button" }
            }
          }

      val set_slot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_slot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_slot" }
            }
          }

      val set_title: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_title" }
            }
          }
    }
  }
}
