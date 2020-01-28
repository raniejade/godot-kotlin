// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Camera2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var anchorMode: Int
    get() {
       return Camera2D.AnchorMode.from(getAnchorMode()) 
    }
    set(value) {
      setAnchorMode(Camera2D.AnchorMode.from(value))
    }

  var current: Boolean
    get() {
       return isCurrent() 
    }
    set(value) {
      _setCurrent(value)
    }

  var customViewport: Viewport
    get() {
       return getCustomViewport() 
    }
    set(value) {
      setCustomViewport(value)
    }

  var dragMarginHEnabled: Boolean
    get() {
       return isHDragEnabled() 
    }
    set(value) {
      setHDragEnabled(value)
    }

  var dragMarginVEnabled: Boolean
    get() {
       return isVDragEnabled() 
    }
    set(value) {
      setVDragEnabled(value)
    }

  var editorDrawDragMargin: Boolean
    get() {
       return isMarginDrawingEnabled() 
    }
    set(value) {
      setMarginDrawingEnabled(value)
    }

  var editorDrawLimits: Boolean
    get() {
       return isLimitDrawingEnabled() 
    }
    set(value) {
      setLimitDrawingEnabled(value)
    }

  var editorDrawScreen: Boolean
    get() {
       return isScreenDrawingEnabled() 
    }
    set(value) {
      setScreenDrawingEnabled(value)
    }

  var limitSmoothed: Boolean
    get() {
       return isLimitSmoothingEnabled() 
    }
    set(value) {
      setLimitSmoothingEnabled(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var offsetH: Float
    get() {
       return getHOffset() 
    }
    set(value) {
      setHOffset(value)
    }

  var offsetV: Float
    get() {
       return getVOffset() 
    }
    set(value) {
      setVOffset(value)
    }

  var processMode: Int
    get() {
       return Camera2D.Camera2DProcessMode.from(getProcessMode()) 
    }
    set(value) {
      setProcessMode(Camera2D.Camera2DProcessMode.from(value))
    }

  var rotating: Boolean
    get() {
       return isRotating() 
    }
    set(value) {
      setRotating(value)
    }

  var smoothingEnabled: Boolean
    get() {
       return isFollowSmoothingEnabled() 
    }
    set(value) {
      setEnableFollowSmoothing(value)
    }

  var smoothingSpeed: Float
    get() {
       return getFollowSmoothing() 
    }
    set(value) {
      setFollowSmoothing(value)
    }

  var zoom: Vector2
    get() {
       return getZoom() 
    }
    set(value) {
      setZoom(value)
    }

  fun align() {
    __method_bind.align.call(this._handle)
  }

  fun clearCurrent() {
    __method_bind.clearCurrent.call(this._handle)
  }

  fun forceUpdateScroll() {
    __method_bind.forceUpdateScroll.call(this._handle)
  }

  fun getAnchorMode(): AnchorMode {
    val _ret = __method_bind.getAnchorMode.call(this._handle)
    return Camera2D.AnchorMode.from(_ret.asInt())
  }

  fun getCameraPosition(): Vector2 {
    val _ret = __method_bind.getCameraPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getCameraScreenCenter(): Vector2 {
    val _ret = __method_bind.getCameraScreenCenter.call(this._handle)
    return _ret.asVector2()
  }

  fun getCustomViewport(): Node {
    val _ret = __method_bind.getCustomViewport.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getDragMargin(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getDragMargin.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getFollowSmoothing(): Float {
    val _ret = __method_bind.getFollowSmoothing.call(this._handle)
    return _ret.asFloat()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.getHOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getLimit(margin: Int): Int {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getLimit.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getProcessMode(): Camera2DProcessMode {
    val _ret = __method_bind.getProcessMode.call(this._handle)
    return Camera2D.Camera2DProcessMode.from(_ret.asInt())
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.getVOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getZoom(): Vector2 {
    val _ret = __method_bind.getZoom.call(this._handle)
    return _ret.asVector2()
  }

  fun isCurrent(): Boolean {
    val _ret = __method_bind.isCurrent.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFollowSmoothingEnabled(): Boolean {
    val _ret = __method_bind.isFollowSmoothingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isHDragEnabled(): Boolean {
    val _ret = __method_bind.isHDragEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isLimitDrawingEnabled(): Boolean {
    val _ret = __method_bind.isLimitDrawingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isLimitSmoothingEnabled(): Boolean {
    val _ret = __method_bind.isLimitSmoothingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isMarginDrawingEnabled(): Boolean {
    val _ret = __method_bind.isMarginDrawingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRotating(): Boolean {
    val _ret = __method_bind.isRotating.call(this._handle)
    return _ret.asBoolean()
  }

  fun isScreenDrawingEnabled(): Boolean {
    val _ret = __method_bind.isScreenDrawingEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVDragEnabled(): Boolean {
    val _ret = __method_bind.isVDragEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun makeCurrent() {
    __method_bind.makeCurrent.call(this._handle)
  }

  fun resetSmoothing() {
    __method_bind.resetSmoothing.call(this._handle)
  }

  fun setAnchorMode(anchorMode: Int) {
    val _arg = Variant.new(anchorMode)
    __method_bind.setAnchorMode.call(this._handle, _arg, 1)
  }

  fun setCustomViewport(viewport: Node) {
    val _arg = Variant.new(viewport)
    __method_bind.setCustomViewport.call(this._handle, _arg, 1)
  }

  fun setDragMargin(margin: Int, dragMargin: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(dragMargin)
    __method_bind.setDragMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun setEnableFollowSmoothing(followSmoothing: Boolean) {
    val _arg = Variant.new(followSmoothing)
    __method_bind.setEnableFollowSmoothing.call(this._handle, _arg, 1)
  }

  fun setFollowSmoothing(followSmoothing: Float) {
    val _arg = Variant.new(followSmoothing)
    __method_bind.setFollowSmoothing.call(this._handle, _arg, 1)
  }

  fun setHDragEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setHDragEnabled.call(this._handle, _arg, 1)
  }

  fun setHOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setHOffset.call(this._handle, _arg, 1)
  }

  fun setLimit(margin: Int, limit: Int) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(limit)
    __method_bind.setLimit.call(this._handle, _args.toVariant(), 2)
  }

  fun setLimitDrawingEnabled(limitDrawingEnabled: Boolean) {
    val _arg = Variant.new(limitDrawingEnabled)
    __method_bind.setLimitDrawingEnabled.call(this._handle, _arg, 1)
  }

  fun setLimitSmoothingEnabled(limitSmoothingEnabled: Boolean) {
    val _arg = Variant.new(limitSmoothingEnabled)
    __method_bind.setLimitSmoothingEnabled.call(this._handle, _arg, 1)
  }

  fun setMarginDrawingEnabled(marginDrawingEnabled: Boolean) {
    val _arg = Variant.new(marginDrawingEnabled)
    __method_bind.setMarginDrawingEnabled.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setProcessMode.call(this._handle, _arg, 1)
  }

  fun setRotating(rotating: Boolean) {
    val _arg = Variant.new(rotating)
    __method_bind.setRotating.call(this._handle, _arg, 1)
  }

  fun setScreenDrawingEnabled(screenDrawingEnabled: Boolean) {
    val _arg = Variant.new(screenDrawingEnabled)
    __method_bind.setScreenDrawingEnabled.call(this._handle, _arg, 1)
  }

  fun setVDragEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setVDragEnabled.call(this._handle, _arg, 1)
  }

  fun setVOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setVOffset.call(this._handle, _arg, 1)
  }

  fun setZoom(zoom: Vector2) {
    val _arg = Variant.new(zoom)
    __method_bind.setZoom.call(this._handle, _arg, 1)
  }

  enum class Camera2DProcessMode(
    val value: Int
  ) {
    CAMERA2D_PROCESS_PHYSICS(0),

    CAMERA2D_PROCESS_IDLE(1);

    companion object {
      fun from(value: Int): Camera2DProcessMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AnchorMode(
    val value: Int
  ) {
    ANCHOR_MODE_FIXED_TOP_LEFT(0),

    ANCHOR_MODE_DRAG_CENTER(1);

    companion object {
      fun from(value: Int): AnchorMode {
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
    val ANCHOR_MODE_DRAG_CENTER: Int = 1

    val ANCHOR_MODE_FIXED_TOP_LEFT: Int = 0

    val CAMERA2D_PROCESS_IDLE: Int = 1

    val CAMERA2D_PROCESS_PHYSICS: Int = 0

    fun new(): Camera2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Camera2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Camera2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Camera2D = Camera2D(ptr)
    /**
     * Container for method_bind pointers for Camera2D
     */
    private object __method_bind {
      val align: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method align" }
        }
      val clearCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "clearCurrent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearCurrent" }
        }
      val forceUpdateScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "forceUpdateScroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method forceUpdateScroll" }
        }
      val getAnchorMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getAnchorMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnchorMode" }
        }
      val getCameraPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getCameraPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCameraPosition" }
        }
      val getCameraScreenCenter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getCameraScreenCenter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCameraScreenCenter" }
        }
      val getCustomViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getCustomViewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomViewport" }
        }
      val getDragMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getDragMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDragMargin" }
        }
      val getFollowSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getFollowSmoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFollowSmoothing" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHOffset" }
        }
      val getLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getLimit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLimit" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessMode" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVOffset" }
        }
      val getZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "getZoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZoom" }
        }
      val isCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isCurrent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCurrent" }
        }
      val isFollowSmoothingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isFollowSmoothingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFollowSmoothingEnabled" }
        }
      val isHDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isHDragEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isHDragEnabled" }
        }
      val isLimitDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isLimitDrawingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isLimitDrawingEnabled" }
        }
      val isLimitSmoothingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isLimitSmoothingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isLimitSmoothingEnabled" }
        }
      val isMarginDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isMarginDrawingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isMarginDrawingEnabled" }
        }
      val isRotating: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isRotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRotating" }
        }
      val isScreenDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isScreenDrawingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isScreenDrawingEnabled" }
        }
      val isVDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "isVDragEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVDragEnabled" }
        }
      val makeCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "makeCurrent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeCurrent" }
        }
      val resetSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "resetSmoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resetSmoothing" }
        }
      val setAnchorMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setAnchorMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnchorMode" }
        }
      val setCustomViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setCustomViewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomViewport" }
        }
      val setDragMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setDragMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDragMargin" }
        }
      val setEnableFollowSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setEnableFollowSmoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnableFollowSmoothing" }
        }
      val setFollowSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setFollowSmoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFollowSmoothing" }
        }
      val setHDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setHDragEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHDragEnabled" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHOffset" }
        }
      val setLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setLimit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLimit" }
        }
      val setLimitDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setLimitDrawingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLimitDrawingEnabled" }
        }
      val setLimitSmoothingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setLimitSmoothingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLimitSmoothingEnabled" }
        }
      val setMarginDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setMarginDrawingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMarginDrawingEnabled" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessMode" }
        }
      val setRotating: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setRotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRotating" }
        }
      val setScreenDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setScreenDrawingEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScreenDrawingEnabled" }
        }
      val setVDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setVDragEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVDragEnabled" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVOffset" }
        }
      val setZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "setZoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZoom" }
        }}
  }
}
