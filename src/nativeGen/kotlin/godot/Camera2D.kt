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
import kotlin.Unit
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
  var anchorMode: AnchorMode
    get() {
       return getAnchorMode() 
    }
    set(value) {
      setAnchorMode(value.value)
    }

  var customViewport: Node
    get() {
       return getCustomViewport() 
    }
    set(value) {
      setCustomViewport(value)
    }

  var dragMarginBottom: Float
    get() {
       return getDragMargin(3) 
    }
    set(value) {
      setDragMargin(3, value)
    }

  var dragMarginHEnabled: Boolean
    get() {
       return isHDragEnabled() 
    }
    set(value) {
      setHDragEnabled(value)
    }

  var dragMarginLeft: Float
    get() {
       return getDragMargin(0) 
    }
    set(value) {
      setDragMargin(0, value)
    }

  var dragMarginRight: Float
    get() {
       return getDragMargin(2) 
    }
    set(value) {
      setDragMargin(2, value)
    }

  var dragMarginTop: Float
    get() {
       return getDragMargin(1) 
    }
    set(value) {
      setDragMargin(1, value)
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

  var limitBottom: Int
    get() {
       return getLimit(3) 
    }
    set(value) {
      setLimit(3, value)
    }

  var limitLeft: Int
    get() {
       return getLimit(0) 
    }
    set(value) {
      setLimit(0, value)
    }

  var limitRight: Int
    get() {
       return getLimit(2) 
    }
    set(value) {
      setLimit(2, value)
    }

  var limitSmoothed: Boolean
    get() {
       return isLimitSmoothingEnabled() 
    }
    set(value) {
      setLimitSmoothingEnabled(value)
    }

  var limitTop: Int
    get() {
       return getLimit(1) 
    }
    set(value) {
      setLimit(1, value)
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

  var processMode: Camera2DProcessMode
    get() {
       return getProcessMode() 
    }
    set(value) {
      setProcessMode(value.value)
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

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  /**
   * Specialized setter for zoom
   */
  fun zoom(cb: Vector2.() -> Unit) {
    val _p = zoom
    cb(_p)
    zoom = _p
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
    val _ret = __method_bind.getDragMargin.call(this._handle, listOf(_arg))
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
    val _ret = __method_bind.getLimit.call(this._handle, listOf(_arg))
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
    __method_bind.setAnchorMode.call(this._handle, listOf(_arg))
  }

  fun setCustomViewport(viewport: Node) {
    val _arg = Variant.new(viewport)
    __method_bind.setCustomViewport.call(this._handle, listOf(_arg))
  }

  fun setDragMargin(margin: Int, dragMargin: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(margin))
    _args.add(Variant.fromAny(dragMargin))
    __method_bind.setDragMargin.call(this._handle, _args)
  }

  fun setEnableFollowSmoothing(followSmoothing: Boolean) {
    val _arg = Variant.new(followSmoothing)
    __method_bind.setEnableFollowSmoothing.call(this._handle, listOf(_arg))
  }

  fun setFollowSmoothing(followSmoothing: Float) {
    val _arg = Variant.new(followSmoothing)
    __method_bind.setFollowSmoothing.call(this._handle, listOf(_arg))
  }

  fun setHDragEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setHDragEnabled.call(this._handle, listOf(_arg))
  }

  fun setHOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setHOffset.call(this._handle, listOf(_arg))
  }

  fun setLimit(margin: Int, limit: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(margin))
    _args.add(Variant.fromAny(limit))
    __method_bind.setLimit.call(this._handle, _args)
  }

  fun setLimitDrawingEnabled(limitDrawingEnabled: Boolean) {
    val _arg = Variant.new(limitDrawingEnabled)
    __method_bind.setLimitDrawingEnabled.call(this._handle, listOf(_arg))
  }

  fun setLimitSmoothingEnabled(limitSmoothingEnabled: Boolean) {
    val _arg = Variant.new(limitSmoothingEnabled)
    __method_bind.setLimitSmoothingEnabled.call(this._handle, listOf(_arg))
  }

  fun setMarginDrawingEnabled(marginDrawingEnabled: Boolean) {
    val _arg = Variant.new(marginDrawingEnabled)
    __method_bind.setMarginDrawingEnabled.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setProcessMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setProcessMode.call(this._handle, listOf(_arg))
  }

  fun setRotating(rotating: Boolean) {
    val _arg = Variant.new(rotating)
    __method_bind.setRotating.call(this._handle, listOf(_arg))
  }

  fun setScreenDrawingEnabled(screenDrawingEnabled: Boolean) {
    val _arg = Variant.new(screenDrawingEnabled)
    __method_bind.setScreenDrawingEnabled.call(this._handle, listOf(_arg))
  }

  fun setVDragEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setVDragEnabled.call(this._handle, listOf(_arg))
  }

  fun setVOffset(ofs: Float) {
    val _arg = Variant.new(ofs)
    __method_bind.setVOffset.call(this._handle, listOf(_arg))
  }

  fun setZoom(zoom: Vector2) {
    val _arg = Variant.new(zoom)
    __method_bind.setZoom.call(this._handle, listOf(_arg))
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
            "clear_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_current" }
        }
      val forceUpdateScroll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "force_update_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_scroll" }
        }
      val getAnchorMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_anchor_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anchor_mode" }
        }
      val getCameraPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_camera_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_position" }
        }
      val getCameraScreenCenter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_camera_screen_center".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_screen_center" }
        }
      val getCustomViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_viewport" }
        }
      val getDragMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_drag_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_margin" }
        }
      val getFollowSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_follow_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_follow_smoothing" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val getLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val getZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom" }
        }
      val isCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_current" }
        }
      val isFollowSmoothingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_follow_smoothing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_follow_smoothing_enabled" }
        }
      val isHDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_h_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_h_drag_enabled" }
        }
      val isLimitDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_limit_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_limit_drawing_enabled" }
        }
      val isLimitSmoothingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_limit_smoothing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_limit_smoothing_enabled" }
        }
      val isMarginDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_margin_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_margin_drawing_enabled" }
        }
      val isRotating: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_rotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_rotating" }
        }
      val isScreenDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_screen_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_screen_drawing_enabled" }
        }
      val isVDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_v_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_v_drag_enabled" }
        }
      val makeCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "make_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_current" }
        }
      val resetSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "reset_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset_smoothing" }
        }
      val setAnchorMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_anchor_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor_mode" }
        }
      val setCustomViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_viewport" }
        }
      val setDragMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_drag_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_margin" }
        }
      val setEnableFollowSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_enable_follow_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enable_follow_smoothing" }
        }
      val setFollowSmoothing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_follow_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_smoothing" }
        }
      val setHDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_h_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_drag_enabled" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val setLimit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit" }
        }
      val setLimitDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_limit_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_drawing_enabled" }
        }
      val setLimitSmoothingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_limit_smoothing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_smoothing_enabled" }
        }
      val setMarginDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_margin_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin_drawing_enabled" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
        }
      val setRotating: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_rotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotating" }
        }
      val setScreenDrawingEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_screen_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_screen_drawing_enabled" }
        }
      val setVDragEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_v_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_drag_enabled" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }
      val setZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zoom" }
        }}
  }
}
