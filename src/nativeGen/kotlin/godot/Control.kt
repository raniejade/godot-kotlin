// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.NodePath
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Control(
  _handle: COpaquePointer
) : CanvasItem(_handle) {
  var focusMode: FocusMode
    get() {
       return getFocusMode() 
    }
    set(value) {
      setFocusMode(value.value)
    }

  var focusNext: NodePath
    get() {
       return getFocusNext() 
    }
    set(value) {
      setFocusNext(value)
    }

  var focusPrevious: NodePath
    get() {
       return getFocusPrevious() 
    }
    set(value) {
      setFocusPrevious(value)
    }

  var growHorizontal: GrowDirection
    get() {
       return getHGrowDirection() 
    }
    set(value) {
      setHGrowDirection(value.value)
    }

  var growVertical: GrowDirection
    get() {
       return getVGrowDirection() 
    }
    set(value) {
      setVGrowDirection(value.value)
    }

  var mouseDefaultCursorShape: CursorShape
    get() {
       return getDefaultCursorShape() 
    }
    set(value) {
      setDefaultCursorShape(value.value)
    }

  var mouseFilter: MouseFilter
    get() {
       return getMouseFilter() 
    }
    set(value) {
      setMouseFilter(value.value)
    }

  var rectClipContent: Boolean
    get() {
       return isClippingContents() 
    }
    set(value) {
      setClipContents(value)
    }

  var rectMinSize: Vector2
    get() {
       return getCustomMinimumSize() 
    }
    set(value) {
      setCustomMinimumSize(value)
    }

  var rectPivotOffset: Vector2
    get() {
       return getPivotOffset() 
    }
    set(value) {
      setPivotOffset(value)
    }

  var rectRotation: Float
    get() {
       return getRotationDegrees() 
    }
    set(value) {
      setRotationDegrees(value)
    }

  var rectScale: Vector2
    get() {
       return getScale() 
    }
    set(value) {
      setScale(value)
    }

  var sizeFlagsHorizontal: Int
    get() {
       return getHSizeFlags() 
    }
    set(value) {
      setHSizeFlags(value)
    }

  var sizeFlagsStretchRatio: Float
    get() {
       return getStretchRatio() 
    }
    set(value) {
      setStretchRatio(value)
    }

  var sizeFlagsVertical: Int
    get() {
       return getVSizeFlags() 
    }
    set(value) {
      setVSizeFlags(value)
    }

  var theme: Theme
    get() {
       return getTheme() 
    }
    set(value) {
      setTheme(value)
    }

  fun acceptEvent() {
    __method_bind.acceptEvent.call(this._handle)
  }

  fun addColorOverride(name: String, color: Color) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(color)
    __method_bind.addColorOverride.call(this._handle, _args.toVariant(), 2)
  }

  fun addConstantOverride(name: String, constant: Int) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(constant)
    __method_bind.addConstantOverride.call(this._handle, _args.toVariant(), 2)
  }

  fun addFontOverride(name: String, font: Font) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(font)
    __method_bind.addFontOverride.call(this._handle, _args.toVariant(), 2)
  }

  fun addIconOverride(name: String, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(texture)
    __method_bind.addIconOverride.call(this._handle, _args.toVariant(), 2)
  }

  fun addShaderOverride(name: String, shader: Shader) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(shader)
    __method_bind.addShaderOverride.call(this._handle, _args.toVariant(), 2)
  }

  fun addStyleboxOverride(name: String, stylebox: StyleBox) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(stylebox)
    __method_bind.addStyleboxOverride.call(this._handle, _args.toVariant(), 2)
  }

  fun forceDrag(data: Variant, preview: Control) {
    val _args = VariantArray.new()
    _args.append(data)
    _args.append(preview)
    __method_bind.forceDrag.call(this._handle, _args.toVariant(), 2)
  }

  fun getAnchor(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getAnchor.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getBegin(): Vector2 {
    val _ret = __method_bind.getBegin.call(this._handle)
    return _ret.asVector2()
  }

  fun getColor(name: String, type: String): Color {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getColor.call(this._handle, _args.toVariant(), 2)
    return _ret.asColor()
  }

  fun getCombinedMinimumSize(): Vector2 {
    val _ret = __method_bind.getCombinedMinimumSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getConstant(name: String, type: String): Int {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getConstant.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getCursorShape(position: Vector2): CursorShape {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getCursorShape.call(this._handle, _arg, 1)
    return Control.CursorShape.from(_ret.asInt())
  }

  fun getCustomMinimumSize(): Vector2 {
    val _ret = __method_bind.getCustomMinimumSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getDefaultCursorShape(): CursorShape {
    val _ret = __method_bind.getDefaultCursorShape.call(this._handle)
    return Control.CursorShape.from(_ret.asInt())
  }

  fun getEnd(): Vector2 {
    val _ret = __method_bind.getEnd.call(this._handle)
    return _ret.asVector2()
  }

  fun getFocusMode(): FocusMode {
    val _ret = __method_bind.getFocusMode.call(this._handle)
    return Control.FocusMode.from(_ret.asInt())
  }

  fun getFocusNeighbour(margin: Int): NodePath {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getFocusNeighbour.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getFocusNext(): NodePath {
    val _ret = __method_bind.getFocusNext.call(this._handle)
    return _ret.asNodePath()
  }

  fun getFocusOwner(): Control {
    val _ret = __method_bind.getFocusOwner.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getFocusPrevious(): NodePath {
    val _ret = __method_bind.getFocusPrevious.call(this._handle)
    return _ret.asNodePath()
  }

  fun getFont(name: String, type: String): Font {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getFont.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Font)!!
  }

  fun getGlobalPosition(): Vector2 {
    val _ret = __method_bind.getGlobalPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getGlobalRect(): Rect2 {
    val _ret = __method_bind.getGlobalRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getHGrowDirection(): GrowDirection {
    val _ret = __method_bind.getHGrowDirection.call(this._handle)
    return Control.GrowDirection.from(_ret.asInt())
  }

  fun getHSizeFlags(): Int {
    val _ret = __method_bind.getHSizeFlags.call(this._handle)
    return _ret.asInt()
  }

  fun getIcon(name: String, type: String): Texture {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getIcon.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Texture)!!
  }

  fun getMargin(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getMargin.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getMinimumSize(): Vector2 {
    val _ret = __method_bind.getMinimumSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getMouseFilter(): MouseFilter {
    val _ret = __method_bind.getMouseFilter.call(this._handle)
    return Control.MouseFilter.from(_ret.asInt())
  }

  fun getParentAreaSize(): Vector2 {
    val _ret = __method_bind.getParentAreaSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getParentControl(): Control {
    val _ret = __method_bind.getParentControl.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getPivotOffset(): Vector2 {
    val _ret = __method_bind.getPivotOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.getRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getRotation(): Float {
    val _ret = __method_bind.getRotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getRotationDegrees(): Float {
    val _ret = __method_bind.getRotationDegrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getScale(): Vector2 {
    val _ret = __method_bind.getScale.call(this._handle)
    return _ret.asVector2()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getStretchRatio(): Float {
    val _ret = __method_bind.getStretchRatio.call(this._handle)
    return _ret.asFloat()
  }

  fun getStylebox(name: String, type: String): StyleBox {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.getStylebox.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::StyleBox)!!
  }

  fun getTheme(): Theme {
    val _ret = __method_bind.getTheme.call(this._handle)
    return _ret.asObject(::Theme)!!
  }

  fun getTooltip(atPosition: Vector2): String {
    val _arg = Variant.new(atPosition)
    val _ret = __method_bind.getTooltip.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getVGrowDirection(): GrowDirection {
    val _ret = __method_bind.getVGrowDirection.call(this._handle)
    return Control.GrowDirection.from(_ret.asInt())
  }

  fun getVSizeFlags(): Int {
    val _ret = __method_bind.getVSizeFlags.call(this._handle)
    return _ret.asInt()
  }

  fun grabClickFocus() {
    __method_bind.grabClickFocus.call(this._handle)
  }

  fun grabFocus() {
    __method_bind.grabFocus.call(this._handle)
  }

  fun hasColor(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasColor.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasColorOverride(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasColorOverride.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasConstant(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasConstant.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasConstantOverride(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasConstantOverride.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasFocus(): Boolean {
    val _ret = __method_bind.hasFocus.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasFont(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasFont.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasFontOverride(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasFontOverride.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasIcon(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasIcon.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasIconOverride(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasIconOverride.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasShaderOverride(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasShaderOverride.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasStylebox(name: String, type: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(type)
    val _ret = __method_bind.hasStylebox.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hasStyleboxOverride(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasStyleboxOverride.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isClippingContents(): Boolean {
    val _ret = __method_bind.isClippingContents.call(this._handle)
    return _ret.asBoolean()
  }

  fun minimumSizeChanged() {
    __method_bind.minimumSizeChanged.call(this._handle)
  }

  fun releaseFocus() {
    __method_bind.releaseFocus.call(this._handle)
  }

  fun setAnchor(
    margin: Int,
    anchor: Float,
    keepMargin: Boolean,
    pushOppositeAnchor: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(anchor)
    _args.append(keepMargin)
    _args.append(pushOppositeAnchor)
    __method_bind.setAnchor.call(this._handle, _args.toVariant(), 4)
  }

  fun setAnchorAndMargin(
    margin: Int,
    anchor: Float,
    offset: Float,
    pushOppositeAnchor: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(anchor)
    _args.append(offset)
    _args.append(pushOppositeAnchor)
    __method_bind.setAnchorAndMargin.call(this._handle, _args.toVariant(), 4)
  }

  fun setAnchorsAndMarginsPreset(
    preset: Int,
    resizeMode: Int,
    margin: Int
  ) {
    val _args = VariantArray.new()
    _args.append(preset)
    _args.append(resizeMode)
    _args.append(margin)
    __method_bind.setAnchorsAndMarginsPreset.call(this._handle, _args.toVariant(), 3)
  }

  fun setAnchorsPreset(preset: Int, keepMargins: Boolean) {
    val _args = VariantArray.new()
    _args.append(preset)
    _args.append(keepMargins)
    __method_bind.setAnchorsPreset.call(this._handle, _args.toVariant(), 2)
  }

  fun setBegin(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setBegin.call(this._handle, _arg, 1)
  }

  fun setClipContents(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setClipContents.call(this._handle, _arg, 1)
  }

  fun setCustomMinimumSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setCustomMinimumSize.call(this._handle, _arg, 1)
  }

  fun setDefaultCursorShape(shape: Int) {
    val _arg = Variant.new(shape)
    __method_bind.setDefaultCursorShape.call(this._handle, _arg, 1)
  }

  fun setDragForwarding(target: Control) {
    val _arg = Variant.new(target)
    __method_bind.setDragForwarding.call(this._handle, _arg, 1)
  }

  fun setDragPreview(control: Control) {
    val _arg = Variant.new(control)
    __method_bind.setDragPreview.call(this._handle, _arg, 1)
  }

  fun setEnd(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setEnd.call(this._handle, _arg, 1)
  }

  fun setFocusMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setFocusMode.call(this._handle, _arg, 1)
  }

  fun setFocusNeighbour(margin: Int, neighbour: NodePath) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(neighbour)
    __method_bind.setFocusNeighbour.call(this._handle, _args.toVariant(), 2)
  }

  fun setFocusNext(next: NodePath) {
    val _arg = Variant.new(next)
    __method_bind.setFocusNext.call(this._handle, _arg, 1)
  }

  fun setFocusPrevious(previous: NodePath) {
    val _arg = Variant.new(previous)
    __method_bind.setFocusPrevious.call(this._handle, _arg, 1)
  }

  fun setGlobalPosition(position: Vector2, keepMargins: Boolean) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(keepMargins)
    __method_bind.setGlobalPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun setHGrowDirection(direction: Int) {
    val _arg = Variant.new(direction)
    __method_bind.setHGrowDirection.call(this._handle, _arg, 1)
  }

  fun setHSizeFlags(flags: Int) {
    val _arg = Variant.new(flags)
    __method_bind.setHSizeFlags.call(this._handle, _arg, 1)
  }

  fun setMargin(margin: Int, offset: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(offset)
    __method_bind.setMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun setMarginsPreset(
    preset: Int,
    resizeMode: Int,
    margin: Int
  ) {
    val _args = VariantArray.new()
    _args.append(preset)
    _args.append(resizeMode)
    _args.append(margin)
    __method_bind.setMarginsPreset.call(this._handle, _args.toVariant(), 3)
  }

  fun setMouseFilter(filter: Int) {
    val _arg = Variant.new(filter)
    __method_bind.setMouseFilter.call(this._handle, _arg, 1)
  }

  fun setPivotOffset(pivotOffset: Vector2) {
    val _arg = Variant.new(pivotOffset)
    __method_bind.setPivotOffset.call(this._handle, _arg, 1)
  }

  fun setPosition(position: Vector2, keepMargins: Boolean) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(keepMargins)
    __method_bind.setPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun setRotation(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.setRotation.call(this._handle, _arg, 1)
  }

  fun setRotationDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setRotationDegrees.call(this._handle, _arg, 1)
  }

  fun setScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.setScale.call(this._handle, _arg, 1)
  }

  fun setSize(size: Vector2, keepMargins: Boolean) {
    val _args = VariantArray.new()
    _args.append(size)
    _args.append(keepMargins)
    __method_bind.setSize.call(this._handle, _args.toVariant(), 2)
  }

  fun setStretchRatio(ratio: Float) {
    val _arg = Variant.new(ratio)
    __method_bind.setStretchRatio.call(this._handle, _arg, 1)
  }

  fun setTheme(theme: Theme) {
    val _arg = Variant.new(theme)
    __method_bind.setTheme.call(this._handle, _arg, 1)
  }

  fun setTooltip(tooltip: String) {
    val _arg = Variant.new(tooltip)
    __method_bind.setTooltip.call(this._handle, _arg, 1)
  }

  fun setVGrowDirection(direction: Int) {
    val _arg = Variant.new(direction)
    __method_bind.setVGrowDirection.call(this._handle, _arg, 1)
  }

  fun setVSizeFlags(flags: Int) {
    val _arg = Variant.new(flags)
    __method_bind.setVSizeFlags.call(this._handle, _arg, 1)
  }

  fun showModal(exclusive: Boolean) {
    val _arg = Variant.new(exclusive)
    __method_bind.showModal.call(this._handle, _arg, 1)
  }

  fun warpMouse(toPosition: Vector2) {
    val _arg = Variant.new(toPosition)
    __method_bind.warpMouse.call(this._handle, _arg, 1)
  }

  enum class Anchor(
    val value: Int
  ) {
    ANCHOR_BEGIN(0),

    ANCHOR_END(1);

    companion object {
      fun from(value: Int): Anchor {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class FocusMode(
    val value: Int
  ) {
    FOCUS_NONE(0),

    FOCUS_CLICK(1),

    FOCUS_ALL(2);

    companion object {
      fun from(value: Int): FocusMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LayoutPresetMode(
    val value: Int
  ) {
    PRESET_MODE_MINSIZE(0),

    PRESET_MODE_KEEP_WIDTH(1),

    PRESET_MODE_KEEP_HEIGHT(2),

    PRESET_MODE_KEEP_SIZE(3);

    companion object {
      fun from(value: Int): LayoutPresetMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class MouseFilter(
    val value: Int
  ) {
    MOUSE_FILTER_STOP(0),

    MOUSE_FILTER_PASS(1),

    MOUSE_FILTER_IGNORE(2);

    companion object {
      fun from(value: Int): MouseFilter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CursorShape(
    val value: Int
  ) {
    CURSOR_ARROW(0),

    CURSOR_IBEAM(1),

    CURSOR_POINTING_HAND(2),

    CURSOR_CROSS(3),

    CURSOR_WAIT(4),

    CURSOR_BUSY(5),

    CURSOR_DRAG(6),

    CURSOR_CAN_DROP(7),

    CURSOR_FORBIDDEN(8),

    CURSOR_VSIZE(9),

    CURSOR_HSIZE(10),

    CURSOR_BDIAGSIZE(11),

    CURSOR_FDIAGSIZE(12),

    CURSOR_MOVE(13),

    CURSOR_VSPLIT(14),

    CURSOR_HSPLIT(15),

    CURSOR_HELP(16);

    companion object {
      fun from(value: Int): CursorShape {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class GrowDirection(
    val value: Int
  ) {
    GROW_DIRECTION_BEGIN(0),

    GROW_DIRECTION_END(1),

    GROW_DIRECTION_BOTH(2);

    companion object {
      fun from(value: Int): GrowDirection {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SizeFlags(
    val value: Int
  ) {
    SIZE_FILL(1),

    SIZE_EXPAND(2),

    SIZE_EXPAND_FILL(3),

    SIZE_SHRINK_CENTER(4),

    SIZE_SHRINK_END(8);

    companion object {
      fun from(value: Int): SizeFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LayoutPreset(
    val value: Int
  ) {
    PRESET_TOP_LEFT(0),

    PRESET_TOP_RIGHT(1),

    PRESET_BOTTOM_LEFT(2),

    PRESET_BOTTOM_RIGHT(3),

    PRESET_CENTER_LEFT(4),

    PRESET_CENTER_TOP(5),

    PRESET_CENTER_RIGHT(6),

    PRESET_CENTER_BOTTOM(7),

    PRESET_CENTER(8),

    PRESET_LEFT_WIDE(9),

    PRESET_TOP_WIDE(10),

    PRESET_RIGHT_WIDE(11),

    PRESET_BOTTOM_WIDE(12),

    PRESET_VCENTER_WIDE(13),

    PRESET_HCENTER_WIDE(14),

    PRESET_WIDE(15);

    companion object {
      fun from(value: Int): LayoutPreset {
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
    val ANCHOR_BEGIN: Int = 0

    val ANCHOR_END: Int = 1

    val CURSOR_ARROW: Int = 0

    val CURSOR_BDIAGSIZE: Int = 11

    val CURSOR_BUSY: Int = 5

    val CURSOR_CAN_DROP: Int = 7

    val CURSOR_CROSS: Int = 3

    val CURSOR_DRAG: Int = 6

    val CURSOR_FDIAGSIZE: Int = 12

    val CURSOR_FORBIDDEN: Int = 8

    val CURSOR_HELP: Int = 16

    val CURSOR_HSIZE: Int = 10

    val CURSOR_HSPLIT: Int = 15

    val CURSOR_IBEAM: Int = 1

    val CURSOR_MOVE: Int = 13

    val CURSOR_POINTING_HAND: Int = 2

    val CURSOR_VSIZE: Int = 9

    val CURSOR_VSPLIT: Int = 14

    val CURSOR_WAIT: Int = 4

    val FOCUS_ALL: Int = 2

    val FOCUS_CLICK: Int = 1

    val FOCUS_NONE: Int = 0

    val GROW_DIRECTION_BEGIN: Int = 0

    val GROW_DIRECTION_BOTH: Int = 2

    val GROW_DIRECTION_END: Int = 1

    val MOUSE_FILTER_IGNORE: Int = 2

    val MOUSE_FILTER_PASS: Int = 1

    val MOUSE_FILTER_STOP: Int = 0

    val NOTIFICATION_FOCUS_ENTER: Int = 43

    val NOTIFICATION_FOCUS_EXIT: Int = 44

    val NOTIFICATION_MODAL_CLOSE: Int = 46

    val NOTIFICATION_MOUSE_ENTER: Int = 41

    val NOTIFICATION_MOUSE_EXIT: Int = 42

    val NOTIFICATION_RESIZED: Int = 40

    val NOTIFICATION_SCROLL_BEGIN: Int = 47

    val NOTIFICATION_SCROLL_END: Int = 48

    val NOTIFICATION_THEME_CHANGED: Int = 45

    val PRESET_BOTTOM_LEFT: Int = 2

    val PRESET_BOTTOM_RIGHT: Int = 3

    val PRESET_BOTTOM_WIDE: Int = 12

    val PRESET_CENTER: Int = 8

    val PRESET_CENTER_BOTTOM: Int = 7

    val PRESET_CENTER_LEFT: Int = 4

    val PRESET_CENTER_RIGHT: Int = 6

    val PRESET_CENTER_TOP: Int = 5

    val PRESET_HCENTER_WIDE: Int = 14

    val PRESET_LEFT_WIDE: Int = 9

    val PRESET_MODE_KEEP_HEIGHT: Int = 2

    val PRESET_MODE_KEEP_SIZE: Int = 3

    val PRESET_MODE_KEEP_WIDTH: Int = 1

    val PRESET_MODE_MINSIZE: Int = 0

    val PRESET_RIGHT_WIDE: Int = 11

    val PRESET_TOP_LEFT: Int = 0

    val PRESET_TOP_RIGHT: Int = 1

    val PRESET_TOP_WIDE: Int = 10

    val PRESET_VCENTER_WIDE: Int = 13

    val PRESET_WIDE: Int = 15

    val SIZE_EXPAND: Int = 2

    val SIZE_EXPAND_FILL: Int = 3

    val SIZE_FILL: Int = 1

    val SIZE_SHRINK_CENTER: Int = 4

    val SIZE_SHRINK_END: Int = 8

    fun new(): Control = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Control".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Control" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Control(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Control = Control(ptr)
    /**
     * Container for method_bind pointers for Control
     */
    private object __method_bind {
      val acceptEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "accept_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method accept_event" }
        }
      val addColorOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_color_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color_override" }
        }
      val addConstantOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_constant_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_constant_override" }
        }
      val addFontOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_font_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_font_override" }
        }
      val addIconOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_icon_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_override" }
        }
      val addShaderOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_shader_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_shader_override" }
        }
      val addStyleboxOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_stylebox_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_stylebox_override" }
        }
      val forceDrag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "force_drag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_drag" }
        }
      val getAnchor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_anchor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anchor" }
        }
      val getBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_begin" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getCombinedMinimumSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_combined_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_combined_minimum_size" }
        }
      val getConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val getCursorShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cursor_shape" }
        }
      val getCustomMinimumSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_custom_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_minimum_size" }
        }
      val getDefaultCursorShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_default_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_cursor_shape" }
        }
      val getEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_end" }
        }
      val getFocusMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_mode" }
        }
      val getFocusNeighbour: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_neighbour".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_neighbour" }
        }
      val getFocusNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_next" }
        }
      val getFocusOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_owner" }
        }
      val getFocusPrevious: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_previous".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_previous" }
        }
      val getFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font" }
        }
      val getGlobalPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_position" }
        }
      val getGlobalRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_global_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rect" }
        }
      val getHGrowDirection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_h_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_grow_direction" }
        }
      val getHSizeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_h_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_size_flags" }
        }
      val getIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getMinimumSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_minimum_size" }
        }
      val getMouseFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_mouse_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mouse_filter" }
        }
      val getParentAreaSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_parent_area_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_area_size" }
        }
      val getParentControl: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_parent_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_control" }
        }
      val getPivotOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_pivot_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pivot_offset" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rect" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getStretchRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_stretch_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_ratio" }
        }
      val getStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox" }
        }
      val getTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_theme" }
        }
      val getTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tooltip" }
        }
      val getVGrowDirection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_v_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_grow_direction" }
        }
      val getVSizeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_v_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_size_flags" }
        }
      val grabClickFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "grab_click_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method grab_click_focus" }
        }
      val grabFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "grab_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method grab_focus" }
        }
      val hasColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_color" }
        }
      val hasColorOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_color_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_color_override" }
        }
      val hasConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_constant" }
        }
      val hasConstantOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_constant_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_constant_override" }
        }
      val hasFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_focus" }
        }
      val hasFont: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_font" }
        }
      val hasFontOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_font_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_font_override" }
        }
      val hasIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_icon" }
        }
      val hasIconOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_icon_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_icon_override" }
        }
      val hasShaderOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_shader_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_shader_override" }
        }
      val hasStylebox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_stylebox" }
        }
      val hasStyleboxOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_stylebox_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_stylebox_override" }
        }
      val isClippingContents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "is_clipping_contents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clipping_contents" }
        }
      val minimumSizeChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "minimum_size_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method minimum_size_changed" }
        }
      val releaseFocus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "release_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method release_focus" }
        }
      val setAnchor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor" }
        }
      val setAnchorAndMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchor_and_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor_and_margin" }
        }
      val setAnchorsAndMarginsPreset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchors_and_margins_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchors_and_margins_preset" }
        }
      val setAnchorsPreset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchors_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchors_preset" }
        }
      val setBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_begin" }
        }
      val setClipContents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_clip_contents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_contents" }
        }
      val setCustomMinimumSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_custom_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_minimum_size" }
        }
      val setDefaultCursorShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_default_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_cursor_shape" }
        }
      val setDragForwarding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_drag_forwarding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_forwarding" }
        }
      val setDragPreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_drag_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_preview" }
        }
      val setEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_end" }
        }
      val setFocusMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_mode" }
        }
      val setFocusNeighbour: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_neighbour".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_neighbour" }
        }
      val setFocusNext: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_next" }
        }
      val setFocusPrevious: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_previous".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_previous" }
        }
      val setGlobalPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_position" }
        }
      val setHGrowDirection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_h_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_grow_direction" }
        }
      val setHSizeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_h_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_size_flags" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }
      val setMarginsPreset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_margins_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margins_preset" }
        }
      val setMouseFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_mouse_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mouse_filter" }
        }
      val setPivotOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_pivot_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pivot_offset" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setStretchRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_stretch_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_ratio" }
        }
      val setTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_theme" }
        }
      val setTooltip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tooltip" }
        }
      val setVGrowDirection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_v_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_grow_direction" }
        }
      val setVSizeFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_v_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_size_flags" }
        }
      val showModal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "show_modal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show_modal" }
        }
      val warpMouse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "warp_mouse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method warp_mouse" }
        }}
  }
}
