// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
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

open class CanvasItem(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var lightMask: Int
    get() {
       return getLightMask() 
    }
    set(value) {
      setLightMask(value)
    }

  var material: Material
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var modulate: Color
    get() {
       return getModulate() 
    }
    set(value) {
      setModulate(value)
    }

  var selfModulate: Color
    get() {
       return getSelfModulate() 
    }
    set(value) {
      setSelfModulate(value)
    }

  var showBehindParent: Boolean
    get() {
       return isDrawBehindParentEnabled() 
    }
    set(value) {
      setDrawBehindParent(value)
    }

  var useParentMaterial: Boolean
    get() {
       return getUseParentMaterial() 
    }
    set(value) {
      setUseParentMaterial(value)
    }

  var visible: Boolean
    get() {
       return isVisible() 
    }
    set(value) {
      setVisible(value)
    }

  /**
   * CanvasItem::draw signal
   */
  val signalDraw: Signal0 = Signal0("draw")

  /**
   * CanvasItem::hide signal
   */
  val signalHide: Signal0 = Signal0("hide")

  /**
   * CanvasItem::item_rect_changed signal
   */
  val signalItemRectChanged: Signal0 = Signal0("item_rect_changed")

  /**
   * CanvasItem::visibility_changed signal
   */
  val signalVisibilityChanged: Signal0 = Signal0("visibility_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for modulate
   */
  fun modulate(cb: Color.() -> Unit) {
    val _p = modulate
    cb(_p)
    modulate = _p
  }

  /**
   * Specialized setter for selfModulate
   */
  fun selfModulate(cb: Color.() -> Unit) {
    val _p = selfModulate
    cb(_p)
    selfModulate = _p
  }

  open fun _draw() {
    TODO()
  }

  open fun _edit_get_pivot(): Vector2 {
    TODO()
  }

  open fun _edit_get_position(): Vector2 {
    TODO()
  }

  open fun _edit_get_rect(): Rect2 {
    TODO()
  }

  open fun _edit_get_rotation(): Float {
    TODO()
  }

  open fun _edit_get_scale(): Vector2 {
    TODO()
  }

  open fun _edit_get_state(): Dictionary {
    TODO()
  }

  open fun _edit_get_transform(): Transform2D {
    TODO()
  }

  open fun _edit_set_pivot(pivot: Vector2) {
    TODO()
  }

  open fun _edit_set_position(position: Vector2) {
    TODO()
  }

  open fun _edit_set_rect(rect: Rect2) {
    TODO()
  }

  open fun _edit_set_rotation(degrees: Float) {
    TODO()
  }

  open fun _edit_set_scale(scale: Vector2) {
    TODO()
  }

  open fun _edit_set_state(state: Dictionary) {
    TODO()
  }

  open fun _edit_use_pivot(): Boolean {
    TODO()
  }

  open fun _edit_use_rect(): Boolean {
    TODO()
  }

  open fun _edit_use_rotation(): Boolean {
    TODO()
  }

  open fun _is_on_top(): Boolean {
    TODO()
  }

  open fun _set_on_top(onTop: Boolean) {
    TODO()
  }

  open fun _toplevel_raise_self() {
    TODO()
  }

  open fun _update_callback() {
    TODO()
  }

  fun drawArc(
    center: Vector2,
    radius: Float,
    startAngle: Float,
    endAngle: Float,
    pointCount: Int,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(center)
      _args.add(radius)
      _args.add(startAngle)
      _args.add(endAngle)
      _args.add(pointCount)
      _args.add(color)
      _args.add(width)
      _args.add(antialiased)
      __method_bind.drawArc.call(self._handle, _args, null)
    }
  }

  fun drawChar(
    font: Font,
    position: Vector2,
    char: String,
    next: String,
    modulate: Color = Color(1,1,1,1)
  ): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(font)
      _args.add(position)
      _args.add(char)
      _args.add(next)
      _args.add(modulate)
      __method_bind.drawChar.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun drawCircle(
    position: Vector2,
    radius: Float,
    color: Color
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(radius)
      _args.add(color)
      __method_bind.drawCircle.call(self._handle, _args, null)
    }
  }

  fun drawColoredPolygon(
    points: PoolVector2Array,
    color: Color,
    uvs: PoolVector2Array,
    texture: Texture,
    normalMap: Texture,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(color)
      _args.add(uvs)
      _args.add(texture)
      _args.add(normalMap)
      _args.add(antialiased)
      __method_bind.drawColoredPolygon.call(self._handle, _args, null)
    }
  }

  fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(to)
      _args.add(color)
      _args.add(width)
      _args.add(antialiased)
      __method_bind.drawLine.call(self._handle, _args, null)
    }
  }

  fun drawMesh(
    mesh: Mesh,
    texture: Texture,
    normalMap: Texture,
    transform: Transform2D = Transform2D(Vector2(1, 0), Vector2(0, 1), Vector2(0, 0)),
    modulate: Color = Color(1,1,1,1)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(mesh)
      _args.add(texture)
      _args.add(normalMap)
      _args.add(transform)
      _args.add(modulate)
      __method_bind.drawMesh.call(self._handle, _args, null)
    }
  }

  fun drawMultiline(
    points: PoolVector2Array,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(color)
      _args.add(width)
      _args.add(antialiased)
      __method_bind.drawMultiline.call(self._handle, _args, null)
    }
  }

  fun drawMultilineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(colors)
      _args.add(width)
      _args.add(antialiased)
      __method_bind.drawMultilineColors.call(self._handle, _args, null)
    }
  }

  fun drawMultimesh(
    multimesh: MultiMesh,
    texture: Texture,
    normalMap: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(multimesh)
      _args.add(texture)
      _args.add(normalMap)
      __method_bind.drawMultimesh.call(self._handle, _args, null)
    }
  }

  fun drawPolygon(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture,
    normalMap: Texture,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(colors)
      _args.add(uvs)
      _args.add(texture)
      _args.add(normalMap)
      _args.add(antialiased)
      __method_bind.drawPolygon.call(self._handle, _args, null)
    }
  }

  fun drawPolyline(
    points: PoolVector2Array,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(color)
      _args.add(width)
      _args.add(antialiased)
      __method_bind.drawPolyline.call(self._handle, _args, null)
    }
  }

  fun drawPolylineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(colors)
      _args.add(width)
      _args.add(antialiased)
      __method_bind.drawPolylineColors.call(self._handle, _args, null)
    }
  }

  fun drawPrimitive(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture,
    width: Float = 1.0f,
    normalMap: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(points)
      _args.add(colors)
      _args.add(uvs)
      _args.add(texture)
      _args.add(width)
      _args.add(normalMap)
      __method_bind.drawPrimitive.call(self._handle, _args, null)
    }
  }

  fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean = true,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(rect)
      _args.add(color)
      _args.add(filled)
      _args.add(width)
      _args.add(antialiased)
      __method_bind.drawRect.call(self._handle, _args, null)
    }
  }

  fun drawSetTransform(
    position: Vector2,
    rotation: Float,
    scale: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(rotation)
      _args.add(scale)
      __method_bind.drawSetTransform.call(self._handle, _args, null)
    }
  }

  fun drawSetTransformMatrix(xform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.drawSetTransformMatrix.call(self._handle, listOf(xform), null)
    }
  }

  fun drawString(
    font: Font,
    position: Vector2,
    text: String,
    modulate: Color = Color(1,1,1,1),
    clipW: Int = -1
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(font)
      _args.add(position)
      _args.add(text)
      _args.add(modulate)
      _args.add(clipW)
      __method_bind.drawString.call(self._handle, _args, null)
    }
  }

  fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(styleBox)
      _args.add(rect)
      __method_bind.drawStyleBox.call(self._handle, _args, null)
    }
  }

  fun drawTexture(
    texture: Texture,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    normalMap: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(position)
      _args.add(modulate)
      _args.add(normalMap)
      __method_bind.drawTexture.call(self._handle, _args, null)
    }
  }

  fun drawTextureRect(
    texture: Texture,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(rect)
      _args.add(tile)
      _args.add(modulate)
      _args.add(transpose)
      _args.add(normalMap)
      __method_bind.drawTextureRect.call(self._handle, _args, null)
    }
  }

  fun drawTextureRectRegion(
    texture: Texture,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture,
    clipUv: Boolean = true
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(texture)
      _args.add(rect)
      _args.add(srcRect)
      _args.add(modulate)
      _args.add(transpose)
      _args.add(normalMap)
      _args.add(clipUv)
      __method_bind.drawTextureRectRegion.call(self._handle, _args, null)
    }
  }

  fun forceUpdateTransform() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.forceUpdateTransform.call(self._handle, emptyList(), null)
    }
  }

  fun getCanvas(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getCanvas.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCanvasItem(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getCanvasItem.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCanvasTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getCanvasTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGlobalMousePosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalMousePosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGlobalTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGlobalTransformWithCanvas(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalTransformWithCanvas.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLightMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLightMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLocalMousePosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getLocalMousePosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMaterial(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMaterial.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getModulate(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getModulate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSelfModulate(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getSelfModulate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUseParentMaterial(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseParentMaterial.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getViewportRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getViewportRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getViewportTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getViewportTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getWorld2d(): World2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: World2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getWorld2d.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<World2D>(_tmp.value!!)
      _ret
    }
  }

  fun hide() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.hide.call(self._handle, emptyList(), null)
    }
  }

  fun isDrawBehindParentEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawBehindParentEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isLocalTransformNotificationEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSetAsToplevel(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSetAsToplevel.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isTransformNotificationEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isTransformNotificationEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVisibleInTree(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVisibleInTree.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.makeCanvasPositionLocal.call(self._handle, listOf(screenPoint), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun makeInputLocal(event: InputEvent): InputEvent {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: InputEvent
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.makeInputLocal.call(self._handle, listOf(event), _retPtr)
      _ret = objectToType<InputEvent>(_tmp.value!!)
      _ret
    }
  }

  fun setAsToplevel(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsToplevel.call(self._handle, listOf(enable), null)
    }
  }

  fun setDrawBehindParent(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawBehindParent.call(self._handle, listOf(enable), null)
    }
  }

  fun setLightMask(lightMask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLightMask.call(self._handle, listOf(lightMask), null)
    }
  }

  fun setMaterial(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaterial.call(self._handle, listOf(material), null)
    }
  }

  fun setModulate(modulate: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setModulate.call(self._handle, listOf(modulate), null)
    }
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNotifyLocalTransform.call(self._handle, listOf(enable), null)
    }
  }

  fun setNotifyTransform(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNotifyTransform.call(self._handle, listOf(enable), null)
    }
  }

  fun setSelfModulate(selfModulate: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelfModulate.call(self._handle, listOf(selfModulate), null)
    }
  }

  fun setUseParentMaterial(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseParentMaterial.call(self._handle, listOf(enable), null)
    }
  }

  fun setVisible(visible: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisible.call(self._handle, listOf(visible), null)
    }
  }

  fun show() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.show.call(self._handle, emptyList(), null)
    }
  }

  fun update() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.update.call(self._handle, emptyList(), null)
    }
  }

  enum class BlendMode(
    val value: Int
  ) {
    MIX(0),

    ADD(1),

    SUB(2),

    MUL(3),

    PREMULT_ALPHA(4),

    DISABLED(5);

    companion object {
      fun from(value: Int): BlendMode {
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
    val NOTIFICATION_DRAW: Int = 30

    val NOTIFICATION_ENTER_CANVAS: Int = 32

    val NOTIFICATION_EXIT_CANVAS: Int = 33

    val NOTIFICATION_TRANSFORM_CHANGED: Int = 2000

    val NOTIFICATION_VISIBILITY_CHANGED: Int = 31

    /**
     * Container for method_bind pointers for CanvasItem
     */
    private object __method_bind {
      val drawArc: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_arc".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_arc" }
            }
          }

      val drawChar: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_char".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_char" }
            }
          }

      val drawCircle: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_circle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_circle" }
            }
          }

      val drawColoredPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_colored_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_colored_polygon" }
            }
          }

      val drawLine: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_line" }
            }
          }

      val drawMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_mesh" }
            }
          }

      val drawMultiline: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_multiline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_multiline" }
            }
          }

      val drawMultilineColors: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_multiline_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_multiline_colors" }
            }
          }

      val drawMultimesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_multimesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_multimesh" }
            }
          }

      val drawPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_polygon" }
            }
          }

      val drawPolyline: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_polyline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_polyline" }
            }
          }

      val drawPolylineColors: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_polyline_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_polyline_colors" }
            }
          }

      val drawPrimitive: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_primitive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_primitive" }
            }
          }

      val drawRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_rect" }
            }
          }

      val drawSetTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_set_transform" }
            }
          }

      val drawSetTransformMatrix: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_set_transform_matrix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_set_transform_matrix" }
            }
          }

      val drawString: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_string" }
            }
          }

      val drawStyleBox: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_style_box".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_style_box" }
            }
          }

      val drawTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_texture" }
            }
          }

      val drawTextureRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_texture_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_texture_rect" }
            }
          }

      val drawTextureRectRegion: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_texture_rect_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_texture_rect_region" }
            }
          }

      val forceUpdateTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "force_update_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
            }
          }

      val getCanvas: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas" }
            }
          }

      val getCanvasItem: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_canvas_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas_item" }
            }
          }

      val getCanvasTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_canvas_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas_transform" }
            }
          }

      val getGlobalMousePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_global_mouse_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_mouse_position" }
            }
          }

      val getGlobalTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_global_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
            }
          }

      val getGlobalTransformWithCanvas: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_global_transform_with_canvas".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_global_transform_with_canvas" }
            }
          }

      val getLightMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_light_mask" }
            }
          }

      val getLocalMousePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_local_mouse_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_mouse_position" }
            }
          }

      val getMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val getModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modulate" }
            }
          }

      val getSelfModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_self_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_self_modulate" }
            }
          }

      val getTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val getUseParentMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_use_parent_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_parent_material" }
            }
          }

      val getViewportRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_viewport_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport_rect" }
            }
          }

      val getViewportTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_viewport_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport_transform" }
            }
          }

      val getWorld2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_world_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_world_2d" }
            }
          }

      val hide: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "hide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method hide" }
            }
          }

      val isDrawBehindParentEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_draw_behind_parent_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_behind_parent_enabled"
              }
            }
          }

      val isLocalTransformNotificationEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_local_transform_notification_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_local_transform_notification_enabled" }
            }
          }

      val isSetAsToplevel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_set_as_toplevel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
            }
          }

      val isTransformNotificationEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_transform_notification_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_transform_notification_enabled" }
            }
          }

      val isVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_visible" }
            }
          }

      val isVisibleInTree: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_visible_in_tree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
            }
          }

      val makeCanvasPositionLocal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "make_canvas_position_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_canvas_position_local" }
            }
          }

      val makeInputLocal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "make_input_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_input_local" }
            }
          }

      val setAsToplevel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_as_toplevel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
            }
          }

      val setDrawBehindParent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_draw_behind_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_behind_parent" }
            }
          }

      val setLightMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_light_mask" }
            }
          }

      val setMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val setModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_modulate" }
            }
          }

      val setNotifyLocalTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_notify_local_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
            }
          }

      val setNotifyTransform: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_notify_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
            }
          }

      val setSelfModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_self_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_self_modulate" }
            }
          }

      val setUseParentMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_use_parent_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_parent_material" }
            }
          }

      val setVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visible" }
            }
          }

      val show: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "show".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method show" }
            }
          }

      val update: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "update".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update" }
            }
          }
    }
  }
}
