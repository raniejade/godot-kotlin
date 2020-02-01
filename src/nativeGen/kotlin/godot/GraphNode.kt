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
import kotlin.Unit
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
  var comment: Boolean
    get() {
       return isComment() 
    }
    set(value) {
      setComment(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var overlay: Overlay
    get() {
       return getOverlay() 
    }
    set(value) {
      setOverlay(value.value)
    }

  var resizable: Boolean
    get() {
       return isResizable() 
    }
    set(value) {
      setResizable(value)
    }

  var selected: Boolean
    get() {
       return isSelected() 
    }
    set(value) {
      setSelected(value)
    }

  var showClose: Boolean
    get() {
       return isCloseButtonVisible() 
    }
    set(value) {
      setShowCloseButton(value)
    }

  var title: String
    get() {
       return getTitle() 
    }
    set(value) {
      setTitle(value)
    }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  fun clearAllSlots() {
    __method_bind.clearAllSlots.call(this._handle)
  }

  fun clearSlot(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.clearSlot.call(this._handle, listOf(_arg))
  }

  fun getConnectionInputColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionInputColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getConnectionInputCount(): Int {
    val _ret = __method_bind.getConnectionInputCount.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionInputPosition(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionInputPosition.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getConnectionInputType(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionInputType.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getConnectionOutputColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionOutputColor.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getConnectionOutputCount(): Int {
    val _ret = __method_bind.getConnectionOutputCount.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionOutputPosition(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionOutputPosition.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getConnectionOutputType(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionOutputType.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getOverlay(): Overlay {
    val _ret = __method_bind.getOverlay.call(this._handle)
    return GraphNode.Overlay.from(_ret.asInt())
  }

  fun getSlotColorLeft(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSlotColorLeft.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getSlotColorRight(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSlotColorRight.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun getSlotTypeLeft(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSlotTypeLeft.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getSlotTypeRight(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSlotTypeRight.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getTitle(): String {
    val _ret = __method_bind.getTitle.call(this._handle)
    return _ret.asString()
  }

  fun isCloseButtonVisible(): Boolean {
    val _ret = __method_bind.isCloseButtonVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun isComment(): Boolean {
    val _ret = __method_bind.isComment.call(this._handle)
    return _ret.asBoolean()
  }

  fun isResizable(): Boolean {
    val _ret = __method_bind.isResizable.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSelected(): Boolean {
    val _ret = __method_bind.isSelected.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSlotEnabledLeft(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isSlotEnabledLeft.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isSlotEnabledRight(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isSlotEnabledRight.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setComment(comment: Boolean) {
    val _arg = Variant.new(comment)
    __method_bind.setComment.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setOverlay(overlay: Int) {
    val _arg = Variant.new(overlay)
    __method_bind.setOverlay.call(this._handle, listOf(_arg))
  }

  fun setResizable(resizable: Boolean) {
    val _arg = Variant.new(resizable)
    __method_bind.setResizable.call(this._handle, listOf(_arg))
  }

  fun setSelected(selected: Boolean) {
    val _arg = Variant.new(selected)
    __method_bind.setSelected.call(this._handle, listOf(_arg))
  }

  fun setShowCloseButton(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.setShowCloseButton.call(this._handle, listOf(_arg))
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(enableLeft))
    _args.add(Variant.fromAny(typeLeft))
    _args.add(Variant.fromAny(colorLeft))
    _args.add(Variant.fromAny(enableRight))
    _args.add(Variant.fromAny(typeRight))
    _args.add(Variant.fromAny(colorRight))
    _args.add(Variant.fromAny(customLeft))
    _args.add(Variant.fromAny(customRight))
    __method_bind.setSlot.call(this._handle, _args)
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.setTitle.call(this._handle, listOf(_arg))
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
      val clearAllSlots: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "clear_all_slots".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_all_slots" }
        }
      val clearSlot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "clear_slot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_slot" }
        }
      val getConnectionInputColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_color" }
        }
      val getConnectionInputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_count" }
        }
      val getConnectionInputPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_position" }
        }
      val getConnectionInputType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_input_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_input_type" }
        }
      val getConnectionOutputColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_color" }
        }
      val getConnectionOutputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_count" }
        }
      val getConnectionOutputPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_position" }
        }
      val getConnectionOutputType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_connection_output_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_output_type" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getOverlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_overlay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_overlay" }
        }
      val getSlotColorLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_color_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_color_left" }
        }
      val getSlotColorRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_color_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_color_right" }
        }
      val getSlotTypeLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_type_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_type_left" }
        }
      val getSlotTypeRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_slot_type_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_slot_type_right" }
        }
      val getTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "get_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_title" }
        }
      val isCloseButtonVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_close_button_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_close_button_visible" }
        }
      val isComment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_comment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_comment" }
        }
      val isResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_resizable" }
        }
      val isSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_selected" }
        }
      val isSlotEnabledLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_slot_enabled_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_left" }
        }
      val isSlotEnabledRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "is_slot_enabled_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_right" }
        }
      val setComment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_comment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_comment" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setOverlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_overlay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_overlay" }
        }
      val setResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_resizable" }
        }
      val setSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selected" }
        }
      val setShowCloseButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_show_close_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_show_close_button" }
        }
      val setSlot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_slot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_slot" }
        }
      val setTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "set_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_title" }
        }}
  }
}
