// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
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

open class Viewport(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var arvr: Boolean
    get() {
       return useArvr() 
    }
    set(value) {
      setUseArvr(value)
    }

  var audioListenerEnable2d: Boolean
    get() {
       return isAudioListener2d() 
    }
    set(value) {
      setAsAudioListener2d(value)
    }

  var audioListenerEnable3d: Boolean
    get() {
       return isAudioListener() 
    }
    set(value) {
      setAsAudioListener(value)
    }

  var canvasTransform: Transform2D
    get() {
       return getCanvasTransform() 
    }
    set(value) {
      setCanvasTransform(value)
    }

  var debugDraw: DebugDraw
    get() {
       return getDebugDraw() 
    }
    set(value) {
      setDebugDraw(value.value)
    }

  var disable3d: Boolean
    get() {
       return is3dDisabled() 
    }
    set(value) {
      setDisable3d(value)
    }

  var globalCanvasTransform: Transform2D
    get() {
       return getGlobalCanvasTransform() 
    }
    set(value) {
      setGlobalCanvasTransform(value)
    }

  var guiDisableInput: Boolean
    get() {
       return isInputDisabled() 
    }
    set(value) {
      setDisableInput(value)
    }

  var guiSnapControlsToPixels: Boolean
    get() {
       return isSnapControlsToPixelsEnabled() 
    }
    set(value) {
      setSnapControlsToPixels(value)
    }

  var handleInputLocally: Boolean
    get() {
       return isHandlingInputLocally() 
    }
    set(value) {
      setHandleInputLocally(value)
    }

  var hdr: Boolean
    get() {
       return getHdr() 
    }
    set(value) {
      setHdr(value)
    }

  var keep3dLinear: Boolean
    get() {
       return getKeep3dLinear() 
    }
    set(value) {
      setKeep3dLinear(value)
    }

  var msaa: MSAA
    get() {
       return getMsaa() 
    }
    set(value) {
      setMsaa(value.value)
    }

  var ownWorld: Boolean
    get() {
       return isUsingOwnWorld() 
    }
    set(value) {
      setUseOwnWorld(value)
    }

  var physicsObjectPicking: Boolean
    get() {
       return getPhysicsObjectPicking() 
    }
    set(value) {
      setPhysicsObjectPicking(value)
    }

  var renderDirectToScreen: Boolean
    get() {
       return isUsingRenderDirectToScreen() 
    }
    set(value) {
      setUseRenderDirectToScreen(value)
    }

  var renderTargetClearMode: ClearMode
    get() {
       return getClearMode() 
    }
    set(value) {
      setClearMode(value.value)
    }

  var renderTargetUpdateMode: UpdateMode
    get() {
       return getUpdateMode() 
    }
    set(value) {
      setUpdateMode(value.value)
    }

  var renderTargetVFlip: Boolean
    get() {
       return getVflip() 
    }
    set(value) {
      setVflip(value)
    }

  var shadowAtlasQuad0: ShadowAtlasQuadrantSubdiv
    get() {
       return getShadowAtlasQuadrantSubdiv(0) 
    }
    set(value) {
      setShadowAtlasQuadrantSubdiv(0, value.value)
    }

  var shadowAtlasQuad1: ShadowAtlasQuadrantSubdiv
    get() {
       return getShadowAtlasQuadrantSubdiv(1) 
    }
    set(value) {
      setShadowAtlasQuadrantSubdiv(1, value.value)
    }

  var shadowAtlasQuad2: ShadowAtlasQuadrantSubdiv
    get() {
       return getShadowAtlasQuadrantSubdiv(2) 
    }
    set(value) {
      setShadowAtlasQuadrantSubdiv(2, value.value)
    }

  var shadowAtlasQuad3: ShadowAtlasQuadrantSubdiv
    get() {
       return getShadowAtlasQuadrantSubdiv(3) 
    }
    set(value) {
      setShadowAtlasQuadrantSubdiv(3, value.value)
    }

  var shadowAtlasSize: Int
    get() {
       return getShadowAtlasSize() 
    }
    set(value) {
      setShadowAtlasSize(value)
    }

  var size: Vector2
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  var sizeOverrideStretch: Boolean
    get() {
       return isSizeOverrideStretchEnabled() 
    }
    set(value) {
      setSizeOverrideStretch(value)
    }

  var transparentBg: Boolean
    get() {
       return hasTransparentBackground() 
    }
    set(value) {
      setTransparentBackground(value)
    }

  var usage: Usage
    get() {
       return getUsage() 
    }
    set(value) {
      setUsage(value.value)
    }

  var world: World
    get() {
       return getWorld() 
    }
    set(value) {
      setWorld(value)
    }

  var world2d: World2D
    get() {
       return getWorld2d() 
    }
    set(value) {
      setWorld2d(value)
    }

  /**
   * Viewport::gui_focus_changed signal
   */
  val signalGuiFocusChanged: Signal1<Control> = Signal1("gui_focus_changed")

  /**
   * Viewport::size_changed signal
   */
  val signalSizeChanged: Signal0 = Signal0("size_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for canvasTransform
   */
  fun canvasTransform(cb: Transform2D.() -> Unit) {
    val _p = canvasTransform
    cb(_p)
    canvasTransform = _p
  }

  /**
   * Specialized setter for globalCanvasTransform
   */
  fun globalCanvasTransform(cb: Transform2D.() -> Unit) {
    val _p = globalCanvasTransform
    cb(_p)
    globalCanvasTransform = _p
  }

  /**
   * Specialized setter for size
   */
  fun size(cb: Vector2.() -> Unit) {
    val _p = size
    cb(_p)
    size = _p
  }

  fun findWorld(): World {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: World
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.findWorld.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<World>(_tmp.value!!)
      _ret
    }
  }

  fun findWorld2d(): World2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: World2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.findWorld2d.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<World2D>(_tmp.value!!)
      _ret
    }
  }

  fun getCamera(): Camera {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Camera
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCamera.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Camera>(_tmp.value!!)
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

  fun getClearMode(): ClearMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getClearMode.call(self._handle, emptyList(), _retPtr)
      Viewport.ClearMode.from(_ret.value)
    }
  }

  fun getDebugDraw(): DebugDraw {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDebugDraw.call(self._handle, emptyList(), _retPtr)
      Viewport.DebugDraw.from(_ret.value)
    }
  }

  fun getFinalTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getFinalTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGlobalCanvasTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getGlobalCanvasTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getHdr(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHdr.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getKeep3dLinear(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getKeep3dLinear.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getModalStackTop(): Control {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Control
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getModalStackTop.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Control>(_tmp.value!!)
      _ret
    }
  }

  fun getMousePosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMousePosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMsaa(): MSAA {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMsaa.call(self._handle, emptyList(), _retPtr)
      Viewport.MSAA.from(_ret.value)
    }
  }

  fun getPhysicsObjectPicking(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPhysicsObjectPicking.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getRenderInfo(info: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRenderInfo.call(self._handle, listOf(info), _retPtr)
      _ret.value
    }
  }

  fun getShadowAtlasQuadrantSubdiv(quadrant: Int): ShadowAtlasQuadrantSubdiv {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShadowAtlasQuadrantSubdiv.call(self._handle, listOf(quadrant), _retPtr)
      Viewport.ShadowAtlasQuadrantSubdiv.from(_ret.value)
    }
  }

  fun getShadowAtlasSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getShadowAtlasSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getSizeOverride(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getSizeOverride.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTexture(): ViewportTexture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ViewportTexture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<ViewportTexture>(_tmp.value!!)
      _ret
    }
  }

  fun getUpdateMode(): UpdateMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUpdateMode.call(self._handle, emptyList(), _retPtr)
      Viewport.UpdateMode.from(_ret.value)
    }
  }

  fun getUsage(): Usage {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUsage.call(self._handle, emptyList(), _retPtr)
      Viewport.Usage.from(_ret.value)
    }
  }

  fun getVflip(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVflip.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getViewportRid(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getViewportRid.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVisibleRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getVisibleRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getWorld(): World {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: World
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getWorld.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<World>(_tmp.value!!)
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

  fun guiGetDragData(): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.guiGetDragData.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun guiHasModalStack(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.guiHasModalStack.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun guiIsDragging(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.guiIsDragging.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasTransparentBackground(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasTransparentBackground.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun input(localEvent: InputEvent) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.input.call(self._handle, listOf(localEvent), null)
    }
  }

  fun is3dDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.is3dDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isAudioListener(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAudioListener.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isAudioListener2d(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAudioListener2d.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHandlingInputLocally(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHandlingInputLocally.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInputDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInputDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInputHandled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInputHandled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSizeOverrideEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSizeOverrideEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSizeOverrideStretchEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSizeOverrideStretchEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isSnapControlsToPixelsEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isSnapControlsToPixelsEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingOwnWorld(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingOwnWorld.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingRenderDirectToScreen(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingRenderDirectToScreen.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAsAudioListener(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsAudioListener.call(self._handle, listOf(enable), null)
    }
  }

  fun setAsAudioListener2d(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAsAudioListener2d.call(self._handle, listOf(enable), null)
    }
  }

  fun setAttachToScreenRect(rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAttachToScreenRect.call(self._handle, listOf(rect), null)
    }
  }

  fun setCanvasTransform(xform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCanvasTransform.call(self._handle, listOf(xform), null)
    }
  }

  fun setClearMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClearMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setDebugDraw(debugDraw: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDebugDraw.call(self._handle, listOf(debugDraw), null)
    }
  }

  fun setDisable3d(disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisable3d.call(self._handle, listOf(disable), null)
    }
  }

  fun setDisableInput(disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisableInput.call(self._handle, listOf(disable), null)
    }
  }

  fun setGlobalCanvasTransform(xform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalCanvasTransform.call(self._handle, listOf(xform), null)
    }
  }

  fun setHandleInputLocally(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHandleInputLocally.call(self._handle, listOf(enable), null)
    }
  }

  fun setHdr(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHdr.call(self._handle, listOf(enable), null)
    }
  }

  fun setInputAsHandled() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInputAsHandled.call(self._handle, emptyList(), null)
    }
  }

  fun setKeep3dLinear(keep3dLinear: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setKeep3dLinear.call(self._handle, listOf(keep3dLinear), null)
    }
  }

  fun setMsaa(msaa: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMsaa.call(self._handle, listOf(msaa), null)
    }
  }

  fun setPhysicsObjectPicking(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPhysicsObjectPicking.call(self._handle, listOf(enable), null)
    }
  }

  fun setShadowAtlasQuadrantSubdiv(quadrant: Int, subdiv: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(quadrant)
      _args.add(subdiv)
      __method_bind.setShadowAtlasQuadrantSubdiv.call(self._handle, _args, null)
    }
  }

  fun setShadowAtlasSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShadowAtlasSize.call(self._handle, listOf(size), null)
    }
  }

  fun setSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSize.call(self._handle, listOf(size), null)
    }
  }

  fun setSizeOverride(
    enable: Boolean,
    size: Vector2 = Vector2(-1, -1),
    margin: Vector2 = Vector2(0, 0)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(enable)
      _args.add(size)
      _args.add(margin)
      __method_bind.setSizeOverride.call(self._handle, _args, null)
    }
  }

  fun setSizeOverrideStretch(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSizeOverrideStretch.call(self._handle, listOf(enabled), null)
    }
  }

  fun setSnapControlsToPixels(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSnapControlsToPixels.call(self._handle, listOf(enabled), null)
    }
  }

  fun setTransparentBackground(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransparentBackground.call(self._handle, listOf(enable), null)
    }
  }

  fun setUpdateMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUpdateMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setUsage(usage: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUsage.call(self._handle, listOf(usage), null)
    }
  }

  fun setUseArvr(use: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseArvr.call(self._handle, listOf(use), null)
    }
  }

  fun setUseOwnWorld(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseOwnWorld.call(self._handle, listOf(enable), null)
    }
  }

  fun setUseRenderDirectToScreen(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseRenderDirectToScreen.call(self._handle, listOf(enable), null)
    }
  }

  fun setVflip(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVflip.call(self._handle, listOf(enable), null)
    }
  }

  fun setWorld(world: World) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWorld.call(self._handle, listOf(world), null)
    }
  }

  fun setWorld2d(world2d: World2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWorld2d.call(self._handle, listOf(world2d), null)
    }
  }

  fun unhandledInput(localEvent: InputEvent) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unhandledInput.call(self._handle, listOf(localEvent), null)
    }
  }

  fun updateWorlds() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateWorlds.call(self._handle, emptyList(), null)
    }
  }

  fun useArvr(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.useArvr.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun warpMouse(toPosition: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.warpMouse.call(self._handle, listOf(toPosition), null)
    }
  }

  enum class ClearMode(
    val value: Int
  ) {
    ALWAYS(0),

    NEVER(1),

    ONLY_NEXT_FRAME(2);

    companion object {
      fun from(value: Int): ClearMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class RenderInfo(
    val value: Int
  ) {
    OBJECTS_IN_FRAME(0),

    VERTICES_IN_FRAME(1),

    MATERIAL_CHANGES_IN_FRAME(2),

    SHADER_CHANGES_IN_FRAME(3),

    SURFACE_CHANGES_IN_FRAME(4),

    DRAW_CALLS_IN_FRAME(5),

    MAX(6);

    companion object {
      fun from(value: Int): RenderInfo {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Usage(
    val value: Int
  ) {
    `2D`(0),

    `2D_NO_SAMPLING`(1),

    `3D`(2),

    `3D_NO_EFFECTS`(3);

    companion object {
      fun from(value: Int): Usage {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DebugDraw(
    val value: Int
  ) {
    DISABLED(0),

    UNSHADED(1),

    OVERDRAW(2),

    WIREFRAME(3);

    companion object {
      fun from(value: Int): DebugDraw {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ShadowAtlasQuadrantSubdiv(
    val value: Int
  ) {
    DISABLED(0),

    `1`(1),

    `4`(2),

    `16`(3),

    `64`(4),

    `256`(5),

    `1024`(6),

    MAX(7);

    companion object {
      fun from(value: Int): ShadowAtlasQuadrantSubdiv {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class UpdateMode(
    val value: Int
  ) {
    DISABLED(0),

    ONCE(1),

    WHEN_VISIBLE(2),

    ALWAYS(3);

    companion object {
      fun from(value: Int): UpdateMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class MSAA(
    val value: Int
  ) {
    DISABLED(0),

    `2X`(1),

    `4X`(2),

    `8X`(3),

    `16X`(4);

    companion object {
      fun from(value: Int): MSAA {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Viewport".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Viewport" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Viewport
     */
    private object __method_bind {
      val findWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "find_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_world" }
        }
      val findWorld2d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "find_world_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_world_2d" }
        }
      val getCamera: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_camera".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera" }
        }
      val getCanvasTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_canvas_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas_transform" }
        }
      val getClearMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_clear_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clear_mode" }
        }
      val getDebugDraw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_debug_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_debug_draw" }
        }
      val getFinalTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_final_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_final_transform" }
        }
      val getGlobalCanvasTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_global_canvas_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_canvas_transform" }
        }
      val getHdr: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_hdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hdr" }
        }
      val getKeep3dLinear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_keep_3d_linear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_keep_3d_linear" }
        }
      val getModalStackTop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_modal_stack_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_modal_stack_top" }
        }
      val getMousePosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_mouse_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mouse_position" }
        }
      val getMsaa: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_msaa".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_msaa" }
        }
      val getPhysicsObjectPicking: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_physics_object_picking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_object_picking" }
        }
      val getRenderInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_render_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_info" }
        }
      val getShadowAtlasQuadrantSubdiv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_shadow_atlas_quadrant_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_atlas_quadrant_subdiv" }
        }
      val getShadowAtlasSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_shadow_atlas_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shadow_atlas_size" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getSizeOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_size_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size_override" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getUpdateMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_update_mode" }
        }
      val getUsage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_usage" }
        }
      val getVflip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_vflip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vflip" }
        }
      val getViewportRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_viewport_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport_rid" }
        }
      val getVisibleRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_visible_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visible_rect" }
        }
      val getWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world" }
        }
      val getWorld2d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "get_world_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world_2d" }
        }
      val guiGetDragData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "gui_get_drag_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gui_get_drag_data" }
        }
      val guiHasModalStack: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "gui_has_modal_stack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gui_has_modal_stack" }
        }
      val guiIsDragging: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "gui_is_dragging".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gui_is_dragging" }
        }
      val hasTransparentBackground: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "has_transparent_background".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_transparent_background" }
        }
      val input: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method input" }
        }
      val is3dDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_3d_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_3d_disabled" }
        }
      val isAudioListener: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_audio_listener".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_audio_listener" }
        }
      val isAudioListener2d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_audio_listener_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_audio_listener_2d" }
        }
      val isHandlingInputLocally: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_handling_input_locally".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_handling_input_locally" }
        }
      val isInputDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_input_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_input_disabled" }
        }
      val isInputHandled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_input_handled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_input_handled" }
        }
      val isSizeOverrideEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_size_override_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_size_override_enabled" }
        }
      val isSizeOverrideStretchEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_size_override_stretch_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_size_override_stretch_enabled" }
        }
      val isSnapControlsToPixelsEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_snap_controls_to_pixels_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_snap_controls_to_pixels_enabled"
            }
        }
      val isUsingOwnWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_using_own_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_own_world" }
        }
      val isUsingRenderDirectToScreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is_using_render_direct_to_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_render_direct_to_screen" }
        }
      val setAsAudioListener: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_as_audio_listener".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_audio_listener" }
        }
      val setAsAudioListener2d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_as_audio_listener_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_audio_listener_2d" }
        }
      val setAttachToScreenRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_attach_to_screen_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_attach_to_screen_rect" }
        }
      val setCanvasTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_canvas_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_canvas_transform" }
        }
      val setClearMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_clear_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clear_mode" }
        }
      val setDebugDraw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_debug_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_debug_draw" }
        }
      val setDisable3d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_disable_3d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_3d" }
        }
      val setDisableInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_disable_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_input" }
        }
      val setGlobalCanvasTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_global_canvas_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_canvas_transform" }
        }
      val setHandleInputLocally: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_handle_input_locally".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_handle_input_locally" }
        }
      val setHdr: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_hdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hdr" }
        }
      val setInputAsHandled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_input_as_handled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_as_handled" }
        }
      val setKeep3dLinear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_keep_3d_linear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_3d_linear" }
        }
      val setMsaa: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_msaa".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_msaa" }
        }
      val setPhysicsObjectPicking: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_physics_object_picking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_object_picking" }
        }
      val setShadowAtlasQuadrantSubdiv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_shadow_atlas_quadrant_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_atlas_quadrant_subdiv" }
        }
      val setShadowAtlasSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_shadow_atlas_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shadow_atlas_size" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setSizeOverride: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_size_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size_override" }
        }
      val setSizeOverrideStretch: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_size_override_stretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size_override_stretch" }
        }
      val setSnapControlsToPixels: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_snap_controls_to_pixels".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap_controls_to_pixels" }
        }
      val setTransparentBackground: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_transparent_background".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transparent_background" }
        }
      val setUpdateMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_update_mode" }
        }
      val setUsage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_usage" }
        }
      val setUseArvr: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_use_arvr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_arvr" }
        }
      val setUseOwnWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_use_own_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_own_world" }
        }
      val setUseRenderDirectToScreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_use_render_direct_to_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_render_direct_to_screen" }
        }
      val setVflip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_vflip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vflip" }
        }
      val setWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_world" }
        }
      val setWorld2d: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "set_world_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_world_2d" }
        }
      val unhandledInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "unhandled_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unhandled_input" }
        }
      val updateWorlds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "update_worlds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_worlds" }
        }
      val useArvr: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "use_arvr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method use_arvr" }
        }
      val warpMouse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "warp_mouse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method warp_mouse" }
        }}
  }
}
