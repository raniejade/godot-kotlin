// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Viewport(
  _handle: COpaquePointer
) : Node(_handle) {
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

  var debugDraw: Int
    get() {
       return Viewport.DebugDraw.from(getDebugDraw()) 
    }
    set(value) {
      setDebugDraw(Viewport.DebugDraw.from(value))
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

  var msaa: Int
    get() {
       return Viewport.MSAA.from(getMsaa()) 
    }
    set(value) {
      setMsaa(Viewport.MSAA.from(value))
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

  var renderTargetClearMode: Int
    get() {
       return Viewport.ClearMode.from(getClearMode()) 
    }
    set(value) {
      setClearMode(Viewport.ClearMode.from(value))
    }

  var renderTargetUpdateMode: Int
    get() {
       return Viewport.UpdateMode.from(getUpdateMode()) 
    }
    set(value) {
      setUpdateMode(Viewport.UpdateMode.from(value))
    }

  var renderTargetVFlip: Boolean
    get() {
       return getVflip() 
    }
    set(value) {
      setVflip(value)
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

  var transparentBg: Boolean
    get() {
       return hasTransparentBackground() 
    }
    set(value) {
      setTransparentBackground(value)
    }

  var usage: Int
    get() {
       return Viewport.Usage.from(getUsage()) 
    }
    set(value) {
      setUsage(Viewport.Usage.from(value))
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

  fun findWorld(): World {
    val _ret = __method_bind.findWorld.call(this._handle)
    return _ret.asObject(::World)!!
  }

  fun findWorld2d(): World2D {
    val _ret = __method_bind.findWorld2d.call(this._handle)
    return _ret.asObject(::World2D)!!
  }

  fun getCamera(): Camera {
    val _ret = __method_bind.getCamera.call(this._handle)
    return _ret.asObject(::Camera)!!
  }

  fun getCanvasTransform(): Transform2D {
    val _ret = __method_bind.getCanvasTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getClearMode(): ClearMode {
    val _ret = __method_bind.getClearMode.call(this._handle)
    return Viewport.ClearMode.from(_ret.asInt())
  }

  fun getDebugDraw(): DebugDraw {
    val _ret = __method_bind.getDebugDraw.call(this._handle)
    return Viewport.DebugDraw.from(_ret.asInt())
  }

  fun getFinalTransform(): Transform2D {
    val _ret = __method_bind.getFinalTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getGlobalCanvasTransform(): Transform2D {
    val _ret = __method_bind.getGlobalCanvasTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getHdr(): Boolean {
    val _ret = __method_bind.getHdr.call(this._handle)
    return _ret.asBoolean()
  }

  fun getKeep3dLinear(): Boolean {
    val _ret = __method_bind.getKeep3dLinear.call(this._handle)
    return _ret.asBoolean()
  }

  fun getModalStackTop(): Control {
    val _ret = __method_bind.getModalStackTop.call(this._handle)
    return _ret.asObject(::Control)!!
  }

  fun getMousePosition(): Vector2 {
    val _ret = __method_bind.getMousePosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getMsaa(): MSAA {
    val _ret = __method_bind.getMsaa.call(this._handle)
    return Viewport.MSAA.from(_ret.asInt())
  }

  fun getPhysicsObjectPicking(): Boolean {
    val _ret = __method_bind.getPhysicsObjectPicking.call(this._handle)
    return _ret.asBoolean()
  }

  fun getRenderInfo(info: Int): Int {
    val _arg = Variant.new(info)
    val _ret = __method_bind.getRenderInfo.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getShadowAtlasQuadrantSubdiv(quadrant: Int): ShadowAtlasQuadrantSubdiv {
    val _arg = Variant.new(quadrant)
    val _ret = __method_bind.getShadowAtlasQuadrantSubdiv.call(this._handle, _arg, 1)
    return Viewport.ShadowAtlasQuadrantSubdiv.from(_ret.asInt())
  }

  fun getShadowAtlasSize(): Int {
    val _ret = __method_bind.getShadowAtlasSize.call(this._handle)
    return _ret.asInt()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getSizeOverride(): Vector2 {
    val _ret = __method_bind.getSizeOverride.call(this._handle)
    return _ret.asVector2()
  }

  fun getTexture(): ViewportTexture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::ViewportTexture)!!
  }

  fun getUpdateMode(): UpdateMode {
    val _ret = __method_bind.getUpdateMode.call(this._handle)
    return Viewport.UpdateMode.from(_ret.asInt())
  }

  fun getUsage(): Usage {
    val _ret = __method_bind.getUsage.call(this._handle)
    return Viewport.Usage.from(_ret.asInt())
  }

  fun getVflip(): Boolean {
    val _ret = __method_bind.getVflip.call(this._handle)
    return _ret.asBoolean()
  }

  fun getViewportRid(): RID {
    val _ret = __method_bind.getViewportRid.call(this._handle)
    return _ret.asRID()
  }

  fun getVisibleRect(): Rect2 {
    val _ret = __method_bind.getVisibleRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getWorld(): World {
    val _ret = __method_bind.getWorld.call(this._handle)
    return _ret.asObject(::World)!!
  }

  fun getWorld2d(): World2D {
    val _ret = __method_bind.getWorld2d.call(this._handle)
    return _ret.asObject(::World2D)!!
  }

  fun guiGetDragData(): Variant {
    val _ret = __method_bind.guiGetDragData.call(this._handle)
    return _ret
  }

  fun guiHasModalStack(): Boolean {
    val _ret = __method_bind.guiHasModalStack.call(this._handle)
    return _ret.asBoolean()
  }

  fun guiIsDragging(): Boolean {
    val _ret = __method_bind.guiIsDragging.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasTransparentBackground(): Boolean {
    val _ret = __method_bind.hasTransparentBackground.call(this._handle)
    return _ret.asBoolean()
  }

  fun input(localEvent: InputEvent) {
    val _arg = Variant.new(localEvent)
    __method_bind.input.call(this._handle, _arg, 1)
  }

  fun is3dDisabled(): Boolean {
    val _ret = __method_bind.is3dDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isAudioListener(): Boolean {
    val _ret = __method_bind.isAudioListener.call(this._handle)
    return _ret.asBoolean()
  }

  fun isAudioListener2d(): Boolean {
    val _ret = __method_bind.isAudioListener2d.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHandlingInputLocally(): Boolean {
    val _ret = __method_bind.isHandlingInputLocally.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInputDisabled(): Boolean {
    val _ret = __method_bind.isInputDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInputHandled(): Boolean {
    val _ret = __method_bind.isInputHandled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSizeOverrideEnabled(): Boolean {
    val _ret = __method_bind.isSizeOverrideEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSizeOverrideStretchEnabled(): Boolean {
    val _ret = __method_bind.isSizeOverrideStretchEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSnapControlsToPixelsEnabled(): Boolean {
    val _ret = __method_bind.isSnapControlsToPixelsEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingOwnWorld(): Boolean {
    val _ret = __method_bind.isUsingOwnWorld.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingRenderDirectToScreen(): Boolean {
    val _ret = __method_bind.isUsingRenderDirectToScreen.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAsAudioListener(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAsAudioListener.call(this._handle, _arg, 1)
  }

  fun setAsAudioListener2d(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAsAudioListener2d.call(this._handle, _arg, 1)
  }

  fun setAttachToScreenRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.setAttachToScreenRect.call(this._handle, _arg, 1)
  }

  fun setCanvasTransform(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.setCanvasTransform.call(this._handle, _arg, 1)
  }

  fun setClearMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setClearMode.call(this._handle, _arg, 1)
  }

  fun setDebugDraw(debugDraw: Int) {
    val _arg = Variant.new(debugDraw)
    __method_bind.setDebugDraw.call(this._handle, _arg, 1)
  }

  fun setDisable3d(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisable3d.call(this._handle, _arg, 1)
  }

  fun setDisableInput(disable: Boolean) {
    val _arg = Variant.new(disable)
    __method_bind.setDisableInput.call(this._handle, _arg, 1)
  }

  fun setGlobalCanvasTransform(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.setGlobalCanvasTransform.call(this._handle, _arg, 1)
  }

  fun setHandleInputLocally(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHandleInputLocally.call(this._handle, _arg, 1)
  }

  fun setHdr(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setHdr.call(this._handle, _arg, 1)
  }

  fun setInputAsHandled() {
    __method_bind.setInputAsHandled.call(this._handle)
  }

  fun setKeep3dLinear(keep3dLinear: Boolean) {
    val _arg = Variant.new(keep3dLinear)
    __method_bind.setKeep3dLinear.call(this._handle, _arg, 1)
  }

  fun setMsaa(msaa: Int) {
    val _arg = Variant.new(msaa)
    __method_bind.setMsaa.call(this._handle, _arg, 1)
  }

  fun setPhysicsObjectPicking(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPhysicsObjectPicking.call(this._handle, _arg, 1)
  }

  fun setShadowAtlasQuadrantSubdiv(quadrant: Int, subdiv: Int) {
    val _args = VariantArray.new()
    _args.append(quadrant)
    _args.append(subdiv)
    __method_bind.setShadowAtlasQuadrantSubdiv.call(this._handle, _args.toVariant(), 2)
  }

  fun setShadowAtlasSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setShadowAtlasSize.call(this._handle, _arg, 1)
  }

  fun setSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  fun setSizeOverride(
    enable: Boolean,
    size: Vector2,
    margin: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(enable)
    _args.append(size)
    _args.append(margin)
    __method_bind.setSizeOverride.call(this._handle, _args.toVariant(), 3)
  }

  fun setSizeOverrideStretch(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSizeOverrideStretch.call(this._handle, _arg, 1)
  }

  fun setSnapControlsToPixels(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSnapControlsToPixels.call(this._handle, _arg, 1)
  }

  fun setTransparentBackground(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setTransparentBackground.call(this._handle, _arg, 1)
  }

  fun setUpdateMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setUpdateMode.call(this._handle, _arg, 1)
  }

  fun setUsage(usage: Int) {
    val _arg = Variant.new(usage)
    __method_bind.setUsage.call(this._handle, _arg, 1)
  }

  fun setUseArvr(use: Boolean) {
    val _arg = Variant.new(use)
    __method_bind.setUseArvr.call(this._handle, _arg, 1)
  }

  fun setUseOwnWorld(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseOwnWorld.call(this._handle, _arg, 1)
  }

  fun setUseRenderDirectToScreen(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseRenderDirectToScreen.call(this._handle, _arg, 1)
  }

  fun setVflip(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setVflip.call(this._handle, _arg, 1)
  }

  fun setWorld(world: World) {
    val _arg = Variant.new(world)
    __method_bind.setWorld.call(this._handle, _arg, 1)
  }

  fun setWorld2d(world2d: World2D) {
    val _arg = Variant.new(world2d)
    __method_bind.setWorld2d.call(this._handle, _arg, 1)
  }

  fun unhandledInput(localEvent: InputEvent) {
    val _arg = Variant.new(localEvent)
    __method_bind.unhandledInput.call(this._handle, _arg, 1)
  }

  fun updateWorlds() {
    __method_bind.updateWorlds.call(this._handle)
  }

  fun useArvr(): Boolean {
    val _ret = __method_bind.useArvr.call(this._handle)
    return _ret.asBoolean()
  }

  fun warpMouse(toPosition: Vector2) {
    val _arg = Variant.new(toPosition)
    __method_bind.warpMouse.call(this._handle, _arg, 1)
  }

  enum class ClearMode(
    val value: Int
  ) {
    CLEAR_MODE_ALWAYS(0),

    CLEAR_MODE_NEVER(1),

    CLEAR_MODE_ONLY_NEXT_FRAME(2);

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
    RENDER_INFO_OBJECTS_IN_FRAME(0),

    RENDER_INFO_VERTICES_IN_FRAME(1),

    RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    RENDER_INFO_MAX(6);

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
    USAGE_2D(0),

    USAGE_2D_NO_SAMPLING(1),

    USAGE_3D(2),

    USAGE_3D_NO_EFFECTS(3);

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
    DEBUG_DRAW_DISABLED(0),

    DEBUG_DRAW_UNSHADED(1),

    DEBUG_DRAW_OVERDRAW(2),

    DEBUG_DRAW_WIREFRAME(3);

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
    SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),

    SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),

    SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),

    SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),

    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),

    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7);

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
    UPDATE_DISABLED(0),

    UPDATE_ONCE(1),

    UPDATE_WHEN_VISIBLE(2),

    UPDATE_ALWAYS(3);

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
    MSAA_DISABLED(0),

    MSAA_2X(1),

    MSAA_4X(2),

    MSAA_8X(3),

    MSAA_16X(4);

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
    val CLEAR_MODE_ALWAYS: Int = 0

    val CLEAR_MODE_NEVER: Int = 1

    val CLEAR_MODE_ONLY_NEXT_FRAME: Int = 2

    val DEBUG_DRAW_DISABLED: Int = 0

    val DEBUG_DRAW_OVERDRAW: Int = 2

    val DEBUG_DRAW_UNSHADED: Int = 1

    val DEBUG_DRAW_WIREFRAME: Int = 3

    val MSAA_16X: Int = 4

    val MSAA_2X: Int = 1

    val MSAA_4X: Int = 2

    val MSAA_8X: Int = 3

    val MSAA_DISABLED: Int = 0

    val RENDER_INFO_DRAW_CALLS_IN_FRAME: Int = 5

    val RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2

    val RENDER_INFO_MAX: Int = 6

    val RENDER_INFO_OBJECTS_IN_FRAME: Int = 0

    val RENDER_INFO_SHADER_CHANGES_IN_FRAME: Int = 3

    val RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Int = 4

    val RENDER_INFO_VERTICES_IN_FRAME: Int = 1

    val SHADOW_ATLAS_QUADRANT_SUBDIV_1: Int = 1

    val SHADOW_ATLAS_QUADRANT_SUBDIV_1024: Int = 6

    val SHADOW_ATLAS_QUADRANT_SUBDIV_16: Int = 3

    val SHADOW_ATLAS_QUADRANT_SUBDIV_256: Int = 5

    val SHADOW_ATLAS_QUADRANT_SUBDIV_4: Int = 2

    val SHADOW_ATLAS_QUADRANT_SUBDIV_64: Int = 4

    val SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED: Int = 0

    val SHADOW_ATLAS_QUADRANT_SUBDIV_MAX: Int = 7

    val UPDATE_ALWAYS: Int = 3

    val UPDATE_DISABLED: Int = 0

    val UPDATE_ONCE: Int = 1

    val UPDATE_WHEN_VISIBLE: Int = 2

    val USAGE_2D: Int = 0

    val USAGE_2D_NO_SAMPLING: Int = 1

    val USAGE_3D: Int = 2

    val USAGE_3D_NO_EFFECTS: Int = 3

    fun new(): Viewport = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Viewport".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Viewport" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Viewport(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Viewport = Viewport(ptr)
    /**
     * Container for method_bind pointers for Viewport
     */
    private object __method_bind {
      val findWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "findWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findWorld" }
        }
      val findWorld2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "findWorld2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findWorld2d" }
        }
      val getCamera: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getCamera".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCamera" }
        }
      val getCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getCanvasTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCanvasTransform" }
        }
      val getClearMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getClearMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClearMode" }
        }
      val getDebugDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getDebugDraw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDebugDraw" }
        }
      val getFinalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getFinalTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFinalTransform" }
        }
      val getGlobalCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getGlobalCanvasTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalCanvasTransform" }
        }
      val getHdr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getHdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHdr" }
        }
      val getKeep3dLinear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getKeep3dLinear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getKeep3dLinear" }
        }
      val getModalStackTop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getModalStackTop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getModalStackTop" }
        }
      val getMousePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getMousePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMousePosition" }
        }
      val getMsaa: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getMsaa".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMsaa" }
        }
      val getPhysicsObjectPicking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getPhysicsObjectPicking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPhysicsObjectPicking" }
        }
      val getRenderInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getRenderInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRenderInfo" }
        }
      val getShadowAtlasQuadrantSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getShadowAtlasQuadrantSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowAtlasQuadrantSubdiv" }
        }
      val getShadowAtlasSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getShadowAtlasSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShadowAtlasSize" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSize" }
        }
      val getSizeOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getSizeOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSizeOverride" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUpdateMode" }
        }
      val getUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getUsage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUsage" }
        }
      val getVflip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getVflip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVflip" }
        }
      val getViewportRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getViewportRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getViewportRid" }
        }
      val getVisibleRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getVisibleRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVisibleRect" }
        }
      val getWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWorld" }
        }
      val getWorld2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "getWorld2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWorld2d" }
        }
      val guiGetDragData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "guiGetDragData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method guiGetDragData" }
        }
      val guiHasModalStack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "guiHasModalStack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method guiHasModalStack" }
        }
      val guiIsDragging: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "guiIsDragging".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method guiIsDragging" }
        }
      val hasTransparentBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "hasTransparentBackground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasTransparentBackground" }
        }
      val input: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method input" }
        }
      val is3dDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "is3dDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is3dDisabled" }
        }
      val isAudioListener: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isAudioListener".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAudioListener" }
        }
      val isAudioListener2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isAudioListener2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAudioListener2d" }
        }
      val isHandlingInputLocally: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isHandlingInputLocally".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHandlingInputLocally" }
        }
      val isInputDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isInputDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInputDisabled" }
        }
      val isInputHandled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isInputHandled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInputHandled" }
        }
      val isSizeOverrideEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isSizeOverrideEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSizeOverrideEnabled" }
        }
      val isSizeOverrideStretchEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isSizeOverrideStretchEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSizeOverrideStretchEnabled" }
        }
      val isSnapControlsToPixelsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isSnapControlsToPixelsEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSnapControlsToPixelsEnabled" }
        }
      val isUsingOwnWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isUsingOwnWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingOwnWorld" }
        }
      val isUsingRenderDirectToScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "isUsingRenderDirectToScreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingRenderDirectToScreen" }
        }
      val setAsAudioListener: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setAsAudioListener".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAsAudioListener" }
        }
      val setAsAudioListener2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setAsAudioListener2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAsAudioListener2d" }
        }
      val setAttachToScreenRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setAttachToScreenRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAttachToScreenRect" }
        }
      val setCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setCanvasTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCanvasTransform" }
        }
      val setClearMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setClearMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClearMode" }
        }
      val setDebugDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setDebugDraw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDebugDraw" }
        }
      val setDisable3d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setDisable3d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisable3d" }
        }
      val setDisableInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setDisableInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisableInput" }
        }
      val setGlobalCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setGlobalCanvasTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGlobalCanvasTransform" }
        }
      val setHandleInputLocally: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setHandleInputLocally".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHandleInputLocally" }
        }
      val setHdr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setHdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHdr" }
        }
      val setInputAsHandled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setInputAsHandled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInputAsHandled" }
        }
      val setKeep3dLinear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setKeep3dLinear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setKeep3dLinear" }
        }
      val setMsaa: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setMsaa".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMsaa" }
        }
      val setPhysicsObjectPicking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setPhysicsObjectPicking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPhysicsObjectPicking" }
        }
      val setShadowAtlasQuadrantSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setShadowAtlasQuadrantSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowAtlasQuadrantSubdiv" }
        }
      val setShadowAtlasSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setShadowAtlasSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShadowAtlasSize" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSize" }
        }
      val setSizeOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setSizeOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSizeOverride" }
        }
      val setSizeOverrideStretch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setSizeOverrideStretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSizeOverrideStretch" }
        }
      val setSnapControlsToPixels: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setSnapControlsToPixels".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSnapControlsToPixels" }
        }
      val setTransparentBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setTransparentBackground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTransparentBackground" }
        }
      val setUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUpdateMode" }
        }
      val setUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setUsage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUsage" }
        }
      val setUseArvr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setUseArvr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseArvr" }
        }
      val setUseOwnWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setUseOwnWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseOwnWorld" }
        }
      val setUseRenderDirectToScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setUseRenderDirectToScreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseRenderDirectToScreen" }
        }
      val setVflip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setVflip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVflip" }
        }
      val setWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWorld" }
        }
      val setWorld2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "setWorld2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWorld2d" }
        }
      val unhandledInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "unhandledInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unhandledInput" }
        }
      val updateWorlds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "updateWorlds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateWorlds" }
        }
      val useArvr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "useArvr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method useArvr" }
        }
      val warpMouse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
            "warpMouse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method warpMouse" }
        }}
  }
}
