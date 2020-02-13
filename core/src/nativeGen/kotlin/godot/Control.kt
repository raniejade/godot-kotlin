// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

open class Control(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : CanvasItem(null) {
  var focusMode: FocusMode
    get() {
       return getFocusMode() 
    }
    set(value) {
      setFocusMode(value.value)
    }

  var focusNeighbourBottom: NodePath
    get() {
       return getFocusNeighbour(3) 
    }
    set(value) {
      setFocusNeighbour(3, value)
    }

  var focusNeighbourLeft: NodePath
    get() {
       return getFocusNeighbour(0) 
    }
    set(value) {
      setFocusNeighbour(0, value)
    }

  var focusNeighbourRight: NodePath
    get() {
       return getFocusNeighbour(2) 
    }
    set(value) {
      setFocusNeighbour(2, value)
    }

  var focusNeighbourTop: NodePath
    get() {
       return getFocusNeighbour(1) 
    }
    set(value) {
      setFocusNeighbour(1, value)
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

  var marginBottom: Float
    get() {
       return getMargin(3) 
    }
    set(value) {
      setMargin(3, value)
    }

  var marginLeft: Float
    get() {
       return getMargin(0) 
    }
    set(value) {
      setMargin(0, value)
    }

  var marginRight: Float
    get() {
       return getMargin(2) 
    }
    set(value) {
      setMargin(2, value)
    }

  var marginTop: Float
    get() {
       return getMargin(1) 
    }
    set(value) {
      setMargin(1, value)
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

  /**
   * Control::focus_entered signal
   */
  val signalFocusEntered: Signal0 = Signal0("focus_entered")

  /**
   * Control::focus_exited signal
   */
  val signalFocusExited: Signal0 = Signal0("focus_exited")

  /**
   * Control::gui_input signal
   */
  val signalGuiInput: Signal1<InputEvent> = Signal1("gui_input")

  /**
   * Control::minimum_size_changed signal
   */
  val signalMinimumSizeChanged: Signal0 = Signal0("minimum_size_changed")

  /**
   * Control::modal_closed signal
   */
  val signalModalClosed: Signal0 = Signal0("modal_closed")

  /**
   * Control::mouse_entered signal
   */
  val signalMouseEntered: Signal0 = Signal0("mouse_entered")

  /**
   * Control::mouse_exited signal
   */
  val signalMouseExited: Signal0 = Signal0("mouse_exited")

  /**
   * Control::resized signal
   */
  val signalResized: Signal0 = Signal0("resized")

  /**
   * Control::size_flags_changed signal
   */
  val signalSizeFlagsChanged: Signal0 = Signal0("size_flags_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for focusNeighbourBottom
   */
  fun focusNeighbourBottom(cb: NodePath.() -> Unit) {
    val _p = focusNeighbourBottom
    cb(_p)
    focusNeighbourBottom = _p
  }

  /**
   * Specialized setter for focusNeighbourLeft
   */
  fun focusNeighbourLeft(cb: NodePath.() -> Unit) {
    val _p = focusNeighbourLeft
    cb(_p)
    focusNeighbourLeft = _p
  }

  /**
   * Specialized setter for focusNeighbourRight
   */
  fun focusNeighbourRight(cb: NodePath.() -> Unit) {
    val _p = focusNeighbourRight
    cb(_p)
    focusNeighbourRight = _p
  }

  /**
   * Specialized setter for focusNeighbourTop
   */
  fun focusNeighbourTop(cb: NodePath.() -> Unit) {
    val _p = focusNeighbourTop
    cb(_p)
    focusNeighbourTop = _p
  }

  /**
   * Specialized setter for focusNext
   */
  fun focusNext(cb: NodePath.() -> Unit) {
    val _p = focusNext
    cb(_p)
    focusNext = _p
  }

  /**
   * Specialized setter for focusPrevious
   */
  fun focusPrevious(cb: NodePath.() -> Unit) {
    val _p = focusPrevious
    cb(_p)
    focusPrevious = _p
  }

  /**
   * Specialized setter for rectMinSize
   */
  fun rectMinSize(cb: Vector2.() -> Unit) {
    val _p = rectMinSize
    cb(_p)
    rectMinSize = _p
  }

  /**
   * Specialized setter for rectPivotOffset
   */
  fun rectPivotOffset(cb: Vector2.() -> Unit) {
    val _p = rectPivotOffset
    cb(_p)
    rectPivotOffset = _p
  }

  /**
   * Specialized setter for rectScale
   */
  fun rectScale(cb: Vector2.() -> Unit) {
    val _p = rectScale
    cb(_p)
    rectScale = _p
  }

  open fun _clips_input(): Boolean {
    TODO()
  }

  open fun _get_minimum_size(): Vector2 {
    TODO()
  }

  open fun _get_tooltip(): String {
    TODO()
  }

  open fun _gui_input(event: InputEvent) {
    TODO()
  }

  open fun _make_custom_tooltip(forText: String): Object {
    TODO()
  }

  open fun _override_changed() {
    TODO()
  }

  open fun _set_anchor(margin: Int, anchor: Float) {
    TODO()
  }

  open fun _set_global_position(position: Vector2) {
    TODO()
  }

  open fun _set_position(margin: Vector2) {
    TODO()
  }

  open fun _set_size(size: Vector2) {
    TODO()
  }

  open fun _size_changed() {
    TODO()
  }

  open fun _theme_changed() {
    TODO()
  }

  open fun _update_minimum_size() {
    TODO()
  }

  fun acceptEvent() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.acceptEvent.call(self._handle, emptyList(), null)
    }
  }

  fun addColorOverride(name: String, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(color)
      __method_bind.addColorOverride.call(self._handle, _args, null)
    }
  }

  fun addConstantOverride(name: String, constant: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(constant)
      __method_bind.addConstantOverride.call(self._handle, _args, null)
    }
  }

  fun addFontOverride(name: String, font: Font) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(font)
      __method_bind.addFontOverride.call(self._handle, _args, null)
    }
  }

  fun addIconOverride(name: String, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(texture)
      __method_bind.addIconOverride.call(self._handle, _args, null)
    }
  }

  fun addShaderOverride(name: String, shader: Shader) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(shader)
      __method_bind.addShaderOverride.call(self._handle, _args, null)
    }
  }

  fun addStyleboxOverride(name: String, stylebox: StyleBox) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(stylebox)
      __method_bind.addStyleboxOverride.call(self._handle, _args, null)
    }
  }

  open fun can_drop_data(position: Vector2, data: Variant): Boolean {
    TODO()
  }

  open fun drop_data(position: Vector2, data: Variant) {
    TODO()
  }

  fun forceDrag(data: Variant, preview: Control) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(data)
      _args.add(preview)
      __method_bind.forceDrag.call(self._handle, _args, null)
    }
  }

  fun getAnchor(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnchor.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBegin(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getBegin.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getColor(name: String, type: String = ""): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getColor.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCombinedMinimumSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCombinedMinimumSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConstant(name: String, type: String = ""): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getConstant.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getCursorShape(position: Vector2 = Vector2(0, 0)): CursorShape {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCursorShape.call(self._handle, listOf(position), _retPtr)
      Control.CursorShape.from(_ret.value)
    }
  }

  fun getCustomMinimumSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCustomMinimumSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDefaultCursorShape(): CursorShape {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDefaultCursorShape.call(self._handle, emptyList(), _retPtr)
      Control.CursorShape.from(_ret.value)
    }
  }

  open fun get_drag_data(position: Vector2): Variant {
    TODO()
  }

  fun getEnd(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getEnd.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFocusMode(): FocusMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFocusMode.call(self._handle, emptyList(), _retPtr)
      Control.FocusMode.from(_ret.value)
    }
  }

  fun getFocusNeighbour(margin: Int): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getFocusNeighbour.call(self._handle, listOf(margin), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFocusNext(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getFocusNext.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFocusOwner(): Control {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Control
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFocusOwner.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Control>(_tmp.value!!)
      _ret
    }
  }

  fun getFocusPrevious(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getFocusPrevious.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFont(name: String, type: String = ""): Font {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Font
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getFont.call(self._handle, _args, _retPtr)
      _ret = objectToType<Font>(_tmp.value!!)
      _ret
    }
  }

  fun getGlobalPosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGlobalRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getHGrowDirection(): GrowDirection {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHGrowDirection.call(self._handle, emptyList(), _retPtr)
      Control.GrowDirection.from(_ret.value)
    }
  }

  fun getHSizeFlags(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHSizeFlags.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getIcon(name: String, type: String = ""): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getIcon.call(self._handle, _args, _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getMargin(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMargin.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMinimumSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMinimumSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMouseFilter(): MouseFilter {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMouseFilter.call(self._handle, emptyList(), _retPtr)
      Control.MouseFilter.from(_ret.value)
    }
  }

  fun getParentAreaSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getParentAreaSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getParentControl(): Control {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Control
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParentControl.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Control>(_tmp.value!!)
      _ret
    }
  }

  fun getPivotOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPivotOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRotation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRotation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRotationDegrees(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRotationDegrees.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getScale(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getStretchRatio(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStretchRatio.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getStylebox(name: String, type: String = ""): StyleBox {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: StyleBox
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getStylebox.call(self._handle, _args, _retPtr)
      _ret = objectToType<StyleBox>(_tmp.value!!)
      _ret
    }
  }

  fun getTheme(): Theme {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Theme
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTheme.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Theme>(_tmp.value!!)
      _ret
    }
  }

  fun getTooltip(atPosition: Vector2 = Vector2(0, 0)): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getTooltip.call(self._handle, listOf(atPosition), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVGrowDirection(): GrowDirection {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVGrowDirection.call(self._handle, emptyList(), _retPtr)
      Control.GrowDirection.from(_ret.value)
    }
  }

  fun getVSizeFlags(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVSizeFlags.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun grabClickFocus() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.grabClickFocus.call(self._handle, emptyList(), null)
    }
  }

  fun grabFocus() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.grabFocus.call(self._handle, emptyList(), null)
    }
  }

  fun hasColor(name: String, type: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasColor.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasColorOverride(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasColorOverride.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun hasConstant(name: String, type: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasConstant.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasConstantOverride(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasConstantOverride.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun hasFocus(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasFocus.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasFont(name: String, type: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasFont.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasFontOverride(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasFontOverride.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun hasIcon(name: String, type: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasIcon.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasIconOverride(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasIconOverride.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  open fun has_point(point: Vector2): Boolean {
    TODO()
  }

  fun hasShaderOverride(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasShaderOverride.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun hasStylebox(name: String, type: String = ""): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasStylebox.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasStyleboxOverride(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasStyleboxOverride.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun isClippingContents(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClippingContents.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun minimumSizeChanged() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.minimumSizeChanged.call(self._handle, emptyList(), null)
    }
  }

  fun releaseFocus() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.releaseFocus.call(self._handle, emptyList(), null)
    }
  }

  fun setAnchor(
    margin: Int,
    anchor: Float,
    keepMargin: Boolean = false,
    pushOppositeAnchor: Boolean = true
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(anchor)
      _args.add(keepMargin)
      _args.add(pushOppositeAnchor)
      __method_bind.setAnchor.call(self._handle, _args, null)
    }
  }

  fun setAnchorAndMargin(
    margin: Int,
    anchor: Float,
    offset: Float,
    pushOppositeAnchor: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(anchor)
      _args.add(offset)
      _args.add(pushOppositeAnchor)
      __method_bind.setAnchorAndMargin.call(self._handle, _args, null)
    }
  }

  fun setAnchorsAndMarginsPreset(
    preset: Int,
    resizeMode: Int = 0,
    margin: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(preset)
      _args.add(resizeMode)
      _args.add(margin)
      __method_bind.setAnchorsAndMarginsPreset.call(self._handle, _args, null)
    }
  }

  fun setAnchorsPreset(preset: Int, keepMargins: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(preset)
      _args.add(keepMargins)
      __method_bind.setAnchorsPreset.call(self._handle, _args, null)
    }
  }

  fun setBegin(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBegin.call(self._handle, listOf(position), null)
    }
  }

  fun setClipContents(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClipContents.call(self._handle, listOf(enable), null)
    }
  }

  fun setCustomMinimumSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomMinimumSize.call(self._handle, listOf(size), null)
    }
  }

  fun setDefaultCursorShape(shape: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDefaultCursorShape.call(self._handle, listOf(shape), null)
    }
  }

  fun setDragForwarding(target: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDragForwarding.call(self._handle, listOf(target), null)
    }
  }

  fun setDragPreview(control: Control) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDragPreview.call(self._handle, listOf(control), null)
    }
  }

  fun setEnd(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnd.call(self._handle, listOf(position), null)
    }
  }

  fun setFocusMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFocusMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setFocusNeighbour(margin: Int, neighbour: NodePath) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(neighbour)
      __method_bind.setFocusNeighbour.call(self._handle, _args, null)
    }
  }

  fun setFocusNext(next: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFocusNext.call(self._handle, listOf(next), null)
    }
  }

  fun setFocusPrevious(previous: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFocusPrevious.call(self._handle, listOf(previous), null)
    }
  }

  fun setGlobalPosition(position: Vector2, keepMargins: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(keepMargins)
      __method_bind.setGlobalPosition.call(self._handle, _args, null)
    }
  }

  fun setHGrowDirection(direction: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHGrowDirection.call(self._handle, listOf(direction), null)
    }
  }

  fun setHSizeFlags(flags: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHSizeFlags.call(self._handle, listOf(flags), null)
    }
  }

  fun setMargin(margin: Int, offset: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(offset)
      __method_bind.setMargin.call(self._handle, _args, null)
    }
  }

  fun setMarginsPreset(
    preset: Int,
    resizeMode: Int = 0,
    margin: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(preset)
      _args.add(resizeMode)
      _args.add(margin)
      __method_bind.setMarginsPreset.call(self._handle, _args, null)
    }
  }

  fun setMouseFilter(filter: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMouseFilter.call(self._handle, listOf(filter), null)
    }
  }

  fun setPivotOffset(pivotOffset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPivotOffset.call(self._handle, listOf(pivotOffset), null)
    }
  }

  fun setPosition(position: Vector2, keepMargins: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(keepMargins)
      __method_bind.setPosition.call(self._handle, _args, null)
    }
  }

  fun setRotation(radians: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotation.call(self._handle, listOf(radians), null)
    }
  }

  fun setRotationDegrees(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotationDegrees.call(self._handle, listOf(degrees), null)
    }
  }

  fun setScale(scale: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setSize(size: Vector2, keepMargins: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(size)
      _args.add(keepMargins)
      __method_bind.setSize.call(self._handle, _args, null)
    }
  }

  fun setStretchRatio(ratio: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStretchRatio.call(self._handle, listOf(ratio), null)
    }
  }

  fun setTheme(theme: Theme) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTheme.call(self._handle, listOf(theme), null)
    }
  }

  fun setTooltip(tooltip: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTooltip.call(self._handle, listOf(tooltip), null)
    }
  }

  fun setVGrowDirection(direction: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVGrowDirection.call(self._handle, listOf(direction), null)
    }
  }

  fun setVSizeFlags(flags: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVSizeFlags.call(self._handle, listOf(flags), null)
    }
  }

  fun showModal(exclusive: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.showModal.call(self._handle, listOf(exclusive), null)
    }
  }

  fun warpMouse(toPosition: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.warpMouse.call(self._handle, listOf(toPosition), null)
    }
  }

  enum class Anchor(
    val value: Int
  ) {
    BEGIN(0),

    END(1);

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
    NONE(0),

    CLICK(1),

    ALL(2);

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
    STOP(0),

    PASS(1),

    IGNORE(2);

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
    ARROW(0),

    IBEAM(1),

    POINTING_HAND(2),

    CROSS(3),

    WAIT(4),

    BUSY(5),

    DRAG(6),

    CAN_DROP(7),

    FORBIDDEN(8),

    VSIZE(9),

    HSIZE(10),

    BDIAGSIZE(11),

    FDIAGSIZE(12),

    MOVE(13),

    VSPLIT(14),

    HSPLIT(15),

    HELP(16);

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
    BEGIN(0),

    END(1),

    BOTH(2);

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
    FILL(1),

    EXPAND(2),

    EXPAND_FILL(3),

    SHRINK_CENTER(4),

    SHRINK_END(8);

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
    val NOTIFICATION_FOCUS_ENTER: Int = 43

    val NOTIFICATION_FOCUS_EXIT: Int = 44

    val NOTIFICATION_MODAL_CLOSE: Int = 46

    val NOTIFICATION_MOUSE_ENTER: Int = 41

    val NOTIFICATION_MOUSE_EXIT: Int = 42

    val NOTIFICATION_RESIZED: Int = 40

    val NOTIFICATION_SCROLL_BEGIN: Int = 47

    val NOTIFICATION_SCROLL_END: Int = 48

    val NOTIFICATION_THEME_CHANGED: Int = 45

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Control".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Control" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Control
     */
    private object __method_bind {
      val acceptEvent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "accept_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method accept_event" }
        }
      val addColorOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_color_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_color_override" }
        }
      val addConstantOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_constant_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_constant_override" }
        }
      val addFontOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_font_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_font_override" }
        }
      val addIconOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_icon_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_icon_override" }
        }
      val addShaderOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_shader_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_shader_override" }
        }
      val addStyleboxOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "add_stylebox_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_stylebox_override" }
        }
      val forceDrag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "force_drag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_drag" }
        }
      val getAnchor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_anchor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anchor" }
        }
      val getBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_begin" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getCombinedMinimumSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_combined_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_combined_minimum_size" }
        }
      val getConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val getCursorShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cursor_shape" }
        }
      val getCustomMinimumSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_custom_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_minimum_size" }
        }
      val getDefaultCursorShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_default_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_cursor_shape" }
        }
      val getEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_end" }
        }
      val getFocusMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_mode" }
        }
      val getFocusNeighbour: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_neighbour".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_neighbour" }
        }
      val getFocusNext: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_next" }
        }
      val getFocusOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_owner" }
        }
      val getFocusPrevious: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_focus_previous".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_focus_previous" }
        }
      val getFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font" }
        }
      val getGlobalPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_position" }
        }
      val getGlobalRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_global_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_rect" }
        }
      val getHGrowDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_h_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_grow_direction" }
        }
      val getHSizeFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_h_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_size_flags" }
        }
      val getIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getMinimumSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_minimum_size" }
        }
      val getMouseFilter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_mouse_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mouse_filter" }
        }
      val getParentAreaSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_parent_area_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_area_size" }
        }
      val getParentControl: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_parent_control".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_control" }
        }
      val getPivotOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_pivot_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pivot_offset" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rect" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getStretchRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_stretch_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_ratio" }
        }
      val getStylebox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox" }
        }
      val getTheme: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_theme" }
        }
      val getTooltip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tooltip" }
        }
      val getVGrowDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_v_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_grow_direction" }
        }
      val getVSizeFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "get_v_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_size_flags" }
        }
      val grabClickFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "grab_click_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method grab_click_focus" }
        }
      val grabFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "grab_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method grab_focus" }
        }
      val hasColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_color" }
        }
      val hasColorOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_color_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_color_override" }
        }
      val hasConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_constant" }
        }
      val hasConstantOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_constant_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_constant_override" }
        }
      val hasFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_focus" }
        }
      val hasFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_font" }
        }
      val hasFontOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_font_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_font_override" }
        }
      val hasIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_icon" }
        }
      val hasIconOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_icon_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_icon_override" }
        }
      val hasShaderOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_shader_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_shader_override" }
        }
      val hasStylebox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_stylebox" }
        }
      val hasStyleboxOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "has_stylebox_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_stylebox_override" }
        }
      val isClippingContents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "is_clipping_contents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clipping_contents" }
        }
      val minimumSizeChanged: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "minimum_size_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method minimum_size_changed" }
        }
      val releaseFocus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "release_focus".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method release_focus" }
        }
      val setAnchor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor" }
        }
      val setAnchorAndMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchor_and_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor_and_margin" }
        }
      val setAnchorsAndMarginsPreset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchors_and_margins_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchors_and_margins_preset" }
        }
      val setAnchorsPreset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_anchors_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchors_preset" }
        }
      val setBegin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_begin" }
        }
      val setClipContents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_clip_contents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_contents" }
        }
      val setCustomMinimumSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_custom_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_minimum_size" }
        }
      val setDefaultCursorShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_default_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_cursor_shape" }
        }
      val setDragForwarding: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_drag_forwarding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_forwarding" }
        }
      val setDragPreview: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_drag_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_preview" }
        }
      val setEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_end" }
        }
      val setFocusMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_mode" }
        }
      val setFocusNeighbour: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_neighbour".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_neighbour" }
        }
      val setFocusNext: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_next".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_next" }
        }
      val setFocusPrevious: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_focus_previous".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_focus_previous" }
        }
      val setGlobalPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_global_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_position" }
        }
      val setHGrowDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_h_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_grow_direction" }
        }
      val setHSizeFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_h_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_size_flags" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }
      val setMarginsPreset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_margins_preset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margins_preset" }
        }
      val setMouseFilter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_mouse_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mouse_filter" }
        }
      val setPivotOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_pivot_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pivot_offset" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_position" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setStretchRatio: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_stretch_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_ratio" }
        }
      val setTheme: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_theme" }
        }
      val setTooltip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_tooltip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tooltip" }
        }
      val setVGrowDirection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_v_grow_direction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_grow_direction" }
        }
      val setVSizeFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "set_v_size_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_size_flags" }
        }
      val showModal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "show_modal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show_modal" }
        }
      val warpMouse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
            "warp_mouse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method warp_mouse" }
        }}
  }
}
