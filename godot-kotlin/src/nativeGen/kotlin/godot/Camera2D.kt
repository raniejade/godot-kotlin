// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
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

open class Camera2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
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

  /**
   * Specialized setter for zoom
   */
  fun zoom(cb: Vector2.() -> Unit) {
    val _p = zoom
    cb(_p)
    zoom = _p
  }

  open fun _make_current(arg0: Object) {
    TODO()
  }

  open fun _set_current(current: Boolean) {
    TODO()
  }

  open fun _set_old_smoothing(followSmoothing: Float) {
    TODO()
  }

  open fun _update_scroll() {
    TODO()
  }

  fun align() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.align.call(self._handle, emptyList(), null)
    }
  }

  fun clearCurrent() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearCurrent.call(self._handle, emptyList(), null)
    }
  }

  fun forceUpdateScroll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.forceUpdateScroll.call(self._handle, emptyList(), null)
    }
  }

  fun getAnchorMode(): AnchorMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnchorMode.call(self._handle, emptyList(), _retPtr)
      Camera2D.AnchorMode.from(_ret.value)
    }
  }

  fun getCameraPosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCameraPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCameraScreenCenter(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCameraScreenCenter.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCustomViewport(): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCustomViewport.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getDragMargin(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDragMargin.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFollowSmoothing(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFollowSmoothing.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getHOffset(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLimit(margin: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLimit.call(self._handle, listOf(margin), _retPtr)
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

  fun getProcessMode(): Camera2DProcessMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessMode.call(self._handle, emptyList(), _retPtr)
      Camera2D.Camera2DProcessMode.from(_ret.value)
    }
  }

  fun getVOffset(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getZoom(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getZoom.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isCurrent(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCurrent.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFollowSmoothingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFollowSmoothingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isHDragEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHDragEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isLimitDrawingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isLimitDrawingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isLimitSmoothingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isLimitSmoothingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isMarginDrawingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isMarginDrawingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRotating(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRotating.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isScreenDrawingEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isScreenDrawingEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVDragEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVDragEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun makeCurrent() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.makeCurrent.call(self._handle, emptyList(), null)
    }
  }

  fun resetSmoothing() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.resetSmoothing.call(self._handle, emptyList(), null)
    }
  }

  fun setAnchorMode(anchorMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnchorMode.call(self._handle, listOf(anchorMode), null)
    }
  }

  fun setCustomViewport(viewport: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomViewport.call(self._handle, listOf(viewport), null)
    }
  }

  fun setDragMargin(margin: Int, dragMargin: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(dragMargin)
      __method_bind.setDragMargin.call(self._handle, _args, null)
    }
  }

  fun setEnableFollowSmoothing(followSmoothing: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnableFollowSmoothing.call(self._handle, listOf(followSmoothing), null)
    }
  }

  fun setFollowSmoothing(followSmoothing: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFollowSmoothing.call(self._handle, listOf(followSmoothing), null)
    }
  }

  fun setHDragEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHDragEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setHOffset(ofs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHOffset.call(self._handle, listOf(ofs), null)
    }
  }

  fun setLimit(margin: Int, limit: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(limit)
      __method_bind.setLimit.call(self._handle, _args, null)
    }
  }

  fun setLimitDrawingEnabled(limitDrawingEnabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLimitDrawingEnabled.call(self._handle, listOf(limitDrawingEnabled), null)
    }
  }

  fun setLimitSmoothingEnabled(limitSmoothingEnabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLimitSmoothingEnabled.call(self._handle, listOf(limitSmoothingEnabled), null)
    }
  }

  fun setMarginDrawingEnabled(marginDrawingEnabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMarginDrawingEnabled.call(self._handle, listOf(marginDrawingEnabled), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setProcessMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setRotating(rotating: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotating.call(self._handle, listOf(rotating), null)
    }
  }

  fun setScreenDrawingEnabled(screenDrawingEnabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScreenDrawingEnabled.call(self._handle, listOf(screenDrawingEnabled), null)
    }
  }

  fun setVDragEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVDragEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setVOffset(ofs: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVOffset.call(self._handle, listOf(ofs), null)
    }
  }

  fun setZoom(zoom: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZoom.call(self._handle, listOf(zoom), null)
    }
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
    FIXED_TOP_LEFT(0),

    DRAG_CENTER(1);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Camera2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Camera2D
     */
    private object __method_bind {
      val align: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "align".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method align" }
        }
      val clearCurrent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "clear_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_current" }
        }
      val forceUpdateScroll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "force_update_scroll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_scroll" }
        }
      val getAnchorMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_anchor_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anchor_mode" }
        }
      val getCameraPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_camera_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_position" }
        }
      val getCameraScreenCenter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_camera_screen_center".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_screen_center" }
        }
      val getCustomViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_viewport" }
        }
      val getDragMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_drag_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_drag_margin" }
        }
      val getFollowSmoothing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_follow_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_follow_smoothing" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val getLimit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_limit" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getProcessMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val getZoom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "get_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom" }
        }
      val isCurrent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_current" }
        }
      val isFollowSmoothingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_follow_smoothing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_follow_smoothing_enabled" }
        }
      val isHDragEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_h_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_h_drag_enabled" }
        }
      val isLimitDrawingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_limit_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_limit_drawing_enabled" }
        }
      val isLimitSmoothingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_limit_smoothing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_limit_smoothing_enabled" }
        }
      val isMarginDrawingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_margin_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_margin_drawing_enabled" }
        }
      val isRotating: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_rotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_rotating" }
        }
      val isScreenDrawingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_screen_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_screen_drawing_enabled" }
        }
      val isVDragEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "is_v_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_v_drag_enabled" }
        }
      val makeCurrent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "make_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_current" }
        }
      val resetSmoothing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "reset_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reset_smoothing" }
        }
      val setAnchorMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_anchor_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor_mode" }
        }
      val setCustomViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_viewport" }
        }
      val setDragMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_drag_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_drag_margin" }
        }
      val setEnableFollowSmoothing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_enable_follow_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enable_follow_smoothing" }
        }
      val setFollowSmoothing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_follow_smoothing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_smoothing" }
        }
      val setHDragEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_h_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_drag_enabled" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val setLimit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_limit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit" }
        }
      val setLimitDrawingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_limit_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_drawing_enabled" }
        }
      val setLimitSmoothingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_limit_smoothing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_limit_smoothing_enabled" }
        }
      val setMarginDrawingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_margin_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin_drawing_enabled" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setProcessMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
        }
      val setRotating: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_rotating".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotating" }
        }
      val setScreenDrawingEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_screen_drawing_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_screen_drawing_enabled" }
        }
      val setVDragEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_v_drag_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_drag_enabled" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }
      val setZoom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
            "set_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zoom" }
        }}
  }
}
