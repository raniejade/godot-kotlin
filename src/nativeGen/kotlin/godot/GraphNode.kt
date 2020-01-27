// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class GraphNode(
  _handle: COpaquePointer
) : Container(_handle) {
  fun clearAllSlots() {
    __method_bind.clear_all_slots.call(this._handle)
  }

  fun clearSlot(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.clear_slot.call(this._handle, _arg, 1)
  }

  fun getConnectionInputColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_input_color.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getConnectionInputCount(): Int {
    val _ret = __method_bind.get_connection_input_count.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionInputPosition(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_input_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getConnectionInputType(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_input_type.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getConnectionOutputColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_output_color.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getConnectionOutputCount(): Int {
    val _ret = __method_bind.get_connection_output_count.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionOutputPosition(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_output_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getConnectionOutputType(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_output_type.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun getOverlay(): Overlay {
    val _ret = __method_bind.get_overlay.call(this._handle)
    return GraphNode.Overlay.from(_ret.asInt())
  }

  fun getSlotColorLeft(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_slot_color_left.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getSlotColorRight(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_slot_color_right.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getSlotTypeLeft(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_slot_type_left.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getSlotTypeRight(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_slot_type_right.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getTitle(): String {
    val _ret = __method_bind.get_title.call(this._handle)
    return _ret.asString()
  }

  fun isCloseButtonVisible(): Boolean {
    val _ret = __method_bind.is_close_button_visible.call(this._handle)
    return _ret.asBool()
  }

  fun isComment(): Boolean {
    val _ret = __method_bind.is_comment.call(this._handle)
    return _ret.asBool()
  }

  fun isResizable(): Boolean {
    val _ret = __method_bind.is_resizable.call(this._handle)
    return _ret.asBool()
  }

  fun isSelected(): Boolean {
    val _ret = __method_bind.is_selected.call(this._handle)
    return _ret.asBool()
  }

  fun isSlotEnabledLeft(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_slot_enabled_left.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun isSlotEnabledRight(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_slot_enabled_right.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun setComment(comment: Boolean) {
    val _arg = Variant.new(comment)
    __method_bind.set_comment.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.set_offset.call(this._handle, _arg, 1)
  }

  fun setOverlay(overlay: Int) {
    val _arg = Variant.new(overlay)
    __method_bind.set_overlay.call(this._handle, _arg, 1)
  }

  fun setResizable(resizable: Boolean) {
    val _arg = Variant.new(resizable)
    __method_bind.set_resizable.call(this._handle, _arg, 1)
  }

  fun setSelected(selected: Boolean) {
    val _arg = Variant.new(selected)
    __method_bind.set_selected.call(this._handle, _arg, 1)
  }

  fun setShowCloseButton(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.set_show_close_button.call(this._handle, _arg, 1)
  }

  fun setSlot(
    idx: Int,
    enableLeft: Boolean,
    typeLeft: Int,
    colorLeft: Color,
    enableRight: Boolean,
    typeRight: Int,
    colorRight: Color,
    customLeft: Texture,
    customRight: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(enableLeft)
    _args.append(typeLeft)
    _args.append(colorLeft)
    _args.append(enableRight)
    _args.append(typeRight)
    _args.append(colorRight)
    _args.append(customLeft)
    _args.append(customRight)
    __method_bind.set_slot.call(this._handle, _args.toVariant(), 9)
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.set_title.call(this._handle, _arg, 1)
  }

  enum class Overlay(
    val value: Int
  ) {
    OVERLAY_DISABLED(0),

    OVERLAY_BREAKPOINT(1),

    OVERLAY_POSITION(2);

    companion object {
      fun from(value: Int): Overlay {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val OVERLAY_BREAKPOINT: Int = 1

    val OVERLAY_DISABLED: Int = 0

    val OVERLAY_POSITION: Int = 2

    fun new(): GraphNode = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GraphNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GraphNode(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GraphNode = GraphNode(ptr)
    /**
     * Container for method_bind pointers for GraphNode
     */
    private object __method_bind {
      val clear_all_slots: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "clear_all_slots".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_all_slots" }
        }
      val clear_slot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "clear_slot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_slot" }
        }
      val get_connection_input_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_color" }
        }
      val get_connection_input_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_count" }
        }
      val get_connection_input_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_position" }
        }
      val get_connection_input_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_type" }
        }
      val get_connection_output_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_color" }
        }
      val get_connection_output_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_count" }
        }
      val get_connection_output_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_position" }
        }
      val get_connection_output_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_type" }
        }
      val get_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val get_overlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_overlay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlay" }
        }
      val get_slot_color_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_color_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_color_left" }
        }
      val get_slot_color_right: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_color_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_color_right" }
        }
      val get_slot_type_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_type_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_type_left" }
        }
      val get_slot_type_right: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_type_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_type_right" }
        }
      val get_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_title" }
        }
      val is_close_button_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_close_button_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_close_button_visible" }
        }
      val is_comment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_comment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_comment" }
        }
      val is_resizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_resizable" }
        }
      val is_selected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selected" }
        }
      val is_slot_enabled_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_slot_enabled_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_left" }
        }
      val is_slot_enabled_right: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_slot_enabled_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_right" }
        }
      val set_comment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_comment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_comment" }
        }
      val set_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val set_overlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_overlay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_overlay" }
        }
      val set_resizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_resizable" }
        }
      val set_selected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selected" }
        }
      val set_show_close_button: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_show_close_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_close_button" }
        }
      val set_slot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_slot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_slot" }
        }
      val set_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_title" }
        }}
  }
}
