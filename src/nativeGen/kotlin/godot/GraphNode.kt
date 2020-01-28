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

  var overlay: Int
    get() {
       return GraphNode.Overlay.from(getOverlay()) 
    }
    set(value) {
      setOverlay(GraphNode.Overlay.from(value))
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

  fun clearAllSlots() {
    __method_bind.clearAllSlots.call(this._handle)
  }

  fun clearSlot(idx: Int) {
    val _arg = Variant.new(idx)
    __method_bind.clearSlot.call(this._handle, _arg, 1)
  }

  fun getConnectionInputColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionInputColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getConnectionInputCount(): Int {
    val _ret = __method_bind.getConnectionInputCount.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionInputPosition(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionInputPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getConnectionInputType(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionInputType.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getConnectionOutputColor(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionOutputColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getConnectionOutputCount(): Int {
    val _ret = __method_bind.getConnectionOutputCount.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionOutputPosition(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionOutputPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getConnectionOutputType(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionOutputType.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.getSlotColorLeft.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getSlotColorRight(idx: Int): Color {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSlotColorRight.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getSlotTypeLeft(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSlotTypeLeft.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getSlotTypeRight(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getSlotTypeRight.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.isSlotEnabledLeft.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isSlotEnabledRight(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isSlotEnabledRight.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun setComment(comment: Boolean) {
    val _arg = Variant.new(comment)
    __method_bind.setComment.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setOverlay(overlay: Int) {
    val _arg = Variant.new(overlay)
    __method_bind.setOverlay.call(this._handle, _arg, 1)
  }

  fun setResizable(resizable: Boolean) {
    val _arg = Variant.new(resizable)
    __method_bind.setResizable.call(this._handle, _arg, 1)
  }

  fun setSelected(selected: Boolean) {
    val _arg = Variant.new(selected)
    __method_bind.setSelected.call(this._handle, _arg, 1)
  }

  fun setShowCloseButton(show: Boolean) {
    val _arg = Variant.new(show)
    __method_bind.setShowCloseButton.call(this._handle, _arg, 1)
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
    __method_bind.setSlot.call(this._handle, _args.toVariant(), 9)
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.setTitle.call(this._handle, _arg, 1)
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
            "clearAllSlots".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearAllSlots" }
        }
      val clearSlot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "clearSlot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearSlot" }
        }
      val getConnectionInputColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionInputColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionInputColor" }
        }
      val getConnectionInputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionInputCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionInputCount" }
        }
      val getConnectionInputPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionInputPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionInputPosition" }
        }
      val getConnectionInputType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionInputType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionInputType" }
        }
      val getConnectionOutputColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionOutputColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionOutputColor" }
        }
      val getConnectionOutputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionOutputCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionOutputCount" }
        }
      val getConnectionOutputPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionOutputPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionOutputPosition" }
        }
      val getConnectionOutputType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getConnectionOutputType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionOutputType" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getOverlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getOverlay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOverlay" }
        }
      val getSlotColorLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getSlotColorLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlotColorLeft" }
        }
      val getSlotColorRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getSlotColorRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlotColorRight" }
        }
      val getSlotTypeLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getSlotTypeLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlotTypeLeft" }
        }
      val getSlotTypeRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getSlotTypeRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSlotTypeRight" }
        }
      val getTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "getTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTitle" }
        }
      val isCloseButtonVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "isCloseButtonVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCloseButtonVisible" }
        }
      val isComment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "isComment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isComment" }
        }
      val isResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "isResizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isResizable" }
        }
      val isSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "isSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSelected" }
        }
      val isSlotEnabledLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "isSlotEnabledLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSlotEnabledLeft" }
        }
      val isSlotEnabledRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "isSlotEnabledRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSlotEnabledRight" }
        }
      val setComment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setComment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setComment" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setOverlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setOverlay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOverlay" }
        }
      val setResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setResizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setResizable" }
        }
      val setSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelected" }
        }
      val setShowCloseButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setShowCloseButton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShowCloseButton" }
        }
      val setSlot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setSlot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSlot" }
        }
      val setTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphNode".cstr.ptr,
            "setTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTitle" }
        }}
  }
}
