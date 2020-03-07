// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class GraphNode(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
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
   * GraphNode::close_request signal
   */
  val signalCloseRequest: Signal0 = Signal0("close_request")

  /**
   * GraphNode::dragged signal
   */
  val signalDragged: Signal2<Vector2, Vector2> = Signal2("dragged")

  /**
   * GraphNode::offset_changed signal
   */
  val signalOffsetChanged: Signal0 = Signal0("offset_changed")

  /**
   * GraphNode::raise_request signal
   */
  val signalRaiseRequest: Signal0 = Signal0("raise_request")

  /**
   * GraphNode::resize_request signal
   */
  val signalResizeRequest: Signal1<Vector2> = Signal1("resize_request")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearAllSlots.call(self._handle, emptyList(), null)
    }
  }

  fun clearSlot(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearSlot.call(self._handle, listOf(idx), null)
    }
  }

  fun getConnectionInputColor(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionInputColor.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConnectionInputCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionInputCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getConnectionInputPosition(idx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionInputPosition.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConnectionInputType(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionInputType.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getConnectionOutputColor(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionOutputColor.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConnectionOutputCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionOutputCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getConnectionOutputPosition(idx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionOutputPosition.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConnectionOutputType(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionOutputType.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOverlay(): Overlay {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOverlay.call(self._handle, emptyList(), _retPtr)
      GraphNode.Overlay.from(_ret.value)
    }
  }

  fun getSlotColorLeft(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getSlotColorLeft.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSlotColorRight(idx: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getSlotColorRight.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSlotTypeLeft(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSlotTypeLeft.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getSlotTypeRight(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSlotTypeRight.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getTitle(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTitle.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isCloseButtonVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCloseButtonVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isComment(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isComment.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isResizable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isResizable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSelected(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSelected.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSlotEnabledLeft(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSlotEnabledLeft.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun isSlotEnabledRight(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSlotEnabledRight.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun setComment(comment: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setComment.call(self._handle, listOf(comment), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setOverlay(overlay: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOverlay.call(self._handle, listOf(overlay), null)
    }
  }

  fun setResizable(resizable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setResizable.call(self._handle, listOf(resizable), null)
    }
  }

  fun setSelected(selected: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelected.call(self._handle, listOf(selected), null)
    }
  }

  fun setShowCloseButton(show: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShowCloseButton.call(self._handle, listOf(show), null)
    }
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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(enableLeft)
      _args.add(typeLeft)
      _args.add(colorLeft)
      _args.add(enableRight)
      _args.add(typeRight)
      _args.add(colorRight)
      _args.add(customLeft)
      _args.add(customRight)
      __method_bind.setSlot.call(self._handle, _args, null)
    }
  }

  fun setTitle(title: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTitle.call(self._handle, listOf(title), null)
    }
  }

  enum class Overlay(
    val value: Int
  ) {
    DISABLED(0),

    BREAKPOINT(1),

    POSITION(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GraphNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GraphNode
     */
    private object __method_bind {
      val clearAllSlots: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "clear_all_slots".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_all_slots" }
            }
          }

      val clearSlot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "clear_slot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_slot" }
            }
          }

      val getConnectionInputColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_color" }
            }
          }

      val getConnectionInputCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_count" }
            }
          }

      val getConnectionInputPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_position"
              }
            }
          }

      val getConnectionInputType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_input_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_input_type" }
            }
          }

      val getConnectionOutputColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_color" }
            }
          }

      val getConnectionOutputCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_count" }
            }
          }

      val getConnectionOutputPosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_position"
              }
            }
          }

      val getConnectionOutputType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_connection_output_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_output_type" }
            }
          }

      val getOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val getOverlay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_overlay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_overlay" }
            }
          }

      val getSlotColorLeft: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_color_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_color_left" }
            }
          }

      val getSlotColorRight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_color_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_color_right" }
            }
          }

      val getSlotTypeLeft: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_type_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_type_left" }
            }
          }

      val getSlotTypeRight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_slot_type_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_slot_type_right" }
            }
          }

      val getTitle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "get_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_title" }
            }
          }

      val isCloseButtonVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_close_button_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_close_button_visible" }
            }
          }

      val isComment: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_comment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_comment" }
            }
          }

      val isResizable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_resizable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_resizable" }
            }
          }

      val isSelected: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_selected" }
            }
          }

      val isSlotEnabledLeft: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_slot_enabled_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_left" }
            }
          }

      val isSlotEnabledRight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "is_slot_enabled_right".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_slot_enabled_right" }
            }
          }

      val setComment: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_comment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_comment" }
            }
          }

      val setOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val setOverlay: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_overlay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_overlay" }
            }
          }

      val setResizable: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_resizable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_resizable" }
            }
          }

      val setSelected: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selected" }
            }
          }

      val setShowCloseButton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_show_close_button".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_show_close_button" }
            }
          }

      val setSlot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_slot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_slot" }
            }
          }

      val setTitle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
              "set_title".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_title" }
            }
          }
    }
  }
}
